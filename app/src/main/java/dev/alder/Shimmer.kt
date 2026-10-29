package dev.alder

import android.animation.ValueAnimator
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.LinearGradient
import android.graphics.Paint
import android.graphics.Path
import android.graphics.PixelFormat
import android.graphics.Rect
import android.graphics.RectF
import android.graphics.Shader
import android.graphics.drawable.Drawable
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator

/**
 * A warm tungsten light sweep across a rounded view (pill button or row) to indicate background stream loading
 * without disrupting the UI.
 */
class ShimmerDrawable(
    private val radiusPx: Float,
    private val highlightColor: Int = 0x99F3D9B1.toInt()
) : Drawable() {
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val path = Path()
    private var progress = 0f

    private val animator = ValueAnimator.ofFloat(-0.5f, 1.5f).apply {
        duration = 1200L
        repeatCount = ValueAnimator.INFINITE
        interpolator = AccelerateDecelerateInterpolator()
        addUpdateListener {
            progress = it.animatedValue as Float
            invalidateSelf()
        }
    }

    fun start() {
        if (!animator.isStarted) animator.start()
    }

    fun stop() {
        animator.cancel()
    }

    override fun onBoundsChange(bounds: Rect) {
        super.onBoundsChange(bounds)
        path.reset()
        path.addRoundRect(RectF(bounds), radiusPx, radiusPx, Path.Direction.CW)
    }

    override fun draw(canvas: Canvas) {
        if (bounds.isEmpty) return
        val w = bounds.width().toFloat()
        val h = bounds.height().toFloat()
        val beamWidth = w * 0.6f
        val center = w * progress
        val startX = center - beamWidth / 2f
        val endX = center + beamWidth / 2f
        val tilt = h * 0.25f

        paint.shader = LinearGradient(
            startX, 0f, endX + tilt, h,
            intArrayOf(Color.TRANSPARENT, highlightColor, Color.TRANSPARENT),
            floatArrayOf(0f, 0.5f, 1f),
            Shader.TileMode.CLAMP
        )

        canvas.save()
        canvas.clipPath(path)
        canvas.drawRect(bounds, paint)
        canvas.restore()
    }

    override fun setAlpha(alpha: Int) {
        paint.alpha = alpha
    }

    override fun setColorFilter(colorFilter: ColorFilter?) {
        paint.colorFilter = colorFilter
    }

    @Deprecated("Deprecated in Java")
    override fun getOpacity(): Int = PixelFormat.TRANSLUCENT
}

private val activeShimmers = java.util.WeakHashMap<View, Pair<ShimmerDrawable, Drawable?>>()

fun View.startShimmer(radiusDp: Int = Screen.BUTTON_H / 2) {
    stopShimmer()
    val radiusPx = resources.displayMetrics.density * radiusDp
    val shimmer = ShimmerDrawable(radiusPx)
    val prevForeground = foreground
    activeShimmers[this] = shimmer to prevForeground
    foreground = shimmer
    shimmer.start()
    animate().alpha(0.85f).setDuration(150).start()
}

fun View.stopShimmer() {
    val (shimmer, prevForeground) = activeShimmers.remove(this) ?: return
    shimmer.stop()
    foreground = prevForeground
    animate().alpha(1f).setDuration(150).start()
}
