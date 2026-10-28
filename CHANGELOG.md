# Changelog

Write every entry in ASD-STE100 Simplified Technical English (STE):

- Use only the approved words of the STE dictionary, with their approved meanings. You can also use technical names: Alder, Stremio, add-on, subtitle, and the names that Alder shows on the screen.
- Write one idea in each sentence. Write 20 words or fewer in an instruction and 25 words or fewer in a description.
- Use the active voice. Use the simple present tense, or the simple past tense for "Before, …".
- Do not use words that end in "-ing", except in technical names.
- Do not use contractions. Write "does not", not "doesn't". Text that Alder shows on the screen stays as it is.
- Write instructions as commands: "Select **Subtitles**", not "**Subtitles** can be selected".
- Use one word for one thing. Use the names that Alder shows on the screen.
- Put each entry under one heading: `### New`, `### Easier to use` or `### Fixes`, in that order. In each group, put the most important entries first.
- Start an important entry with a short **bold** name. After an update, Alder shows the first 5 entries. **See all changes** shows all of them under their headings.

Put changes that are not released under `## Unreleased

### New
- **Sources in your audio language.** Select a language above the source list. Alder shows only the sources in that language. Sources with "Multi" or "Dual" audio show for all languages.
- **Subtitles in your language.** Select **Settings → Subtitles → Subtitle language**. Then select a language. Each profile keeps its own language. Subtitles in that language start with the video. They also start when the audio is in that language.
- **Alder keeps your choices from the player.** Select an audio language or subtitles in **Audio & subtitles**. The next episode starts with your choice. When you start the title again, it also starts with your choice. Each profile keeps its own choices.
- **Remove titles from Continue Watching.** Hold OK on a title in **Continue**. Then select **Remove from Continue Watching**. Stremio also removes it on your other devices. When you watch the title again, it comes back.
- **See the debrid service of each source.** The source list shows the service of each source, for example **RD** for Real-Debrid. **⚡** shows that the file is ready and starts immediately.
- **Put back removed titles.** Select **Settings → Profile → Hidden from Continue Watching**. Then select a title. The title goes back to **Continue** at the position where you stopped. The list shows only titles that you removed on this TV.
- **All audio languages.** **Settings → Picture & Sound → Audio language** has all the languages. Before, it had only 7. Frequently used languages are at the top.
- **All subtitle languages in the player.** **Audio & subtitles** shows all the languages from your subtitle add-ons. Your subtitle language and English are at the top. Before, Alder showed only the language of the TV and English.
- **What is new after each update.** After Alder updates, Home shows the most important changes in the new version. Select **See all changes** to read all of them. Select **Settings → About → What's new** to read them again.

### Easier to use
- **See your subtitles quickly.** When the player controls show, a line under the progress bar shows the audio language and the subtitles. For example: "English · Spanish subtitles".
- **Alder tells you why there is no source.** For example, an add-on did not answer, or an add-on found only torrents.
- **Set up an add-on from your phone.** When an add-on finds only torrents, Alder shows a QR code. Scan it to open the settings of the add-on. Add a debrid service there, for example Real-Debrid. Then select **Try again**.
- When an add-on refuses its key or sign-in, Alder shows a QR code for the settings of the add-on.
- When there is no source, select **Try again**. Alder gets the sources again.
- Alder tells you when your add-ons do not have sources for this type of title. Before, Alder told you that no stream add-ons were connected.
- Alder tells you when an add-on has only links for a browser or YouTube.
- **The player shows the debrid service.** For example: "Torrentio · 2160p · Real-Debrid".
- In **Audio & subtitles**, each heading shows the choice in use. For example: "Subtitles · Spanish". A dot shows the choice in use in each list.
- Hold OK on a title in **Continue** to open a menu. To see all sources, select **Choose a source**.
- When **Dubbed releases** is **My language first**, the source list opens on your audio language.
- When Alder changes to a different source, your subtitle choice stays.
- The sign-in page tells you how to connect 2 accounts with 1 phone.
- Lists in **Settings** are not transparent.

### Fixes
- **Skip forward in more movies.** Alder finds the correct position in files that have no index, for example .ts files. Before, a skip forward on the progress bar started these movies again from the beginning.
- **Title details with all add-ons.** Alder gets title details from your add-ons in their order, as Stremio does. When an add-on gives no details, Alder uses the next add-on. Before, some users saw "Couldn't load this title's details" on all titles.
- **Profiles stay after a sign-out.** When Stremio signs a profile out of this TV, Alder keeps the profile. Select the profile and sign in again. The settings and the PIN of the profile stay. Before, Alder removed the profile.
- **Add-ons with an http:// address work.** Alder connects to add-ons and sources with an http:// address, for example add-ons on your home network. Before, all of these failed.
- **All catalogs from AIOMetadata show.** Before, Alder did not show a catalog that needs a genre, for example an AIOMetadata catalog that is not on the Stremio home page. Now Alder shows these catalogs, as Stremio does. This also corrects a **Shows** page with no rows.
- **Updates on Fire TV.** Alder does not stop when it asks for permission to install an update. When the TV has no page for this permission, Alder shows the steps.
- After you let Alder install apps, the update continues. Before, you had to select **Install** again.
- When the download of an update stops or is not complete, Alder tells you. Before, nothing happened.
- Before an update, Alder tells you that it closes. Open Alder again after the update.
- Some sources cannot skip. In these sources, Alder shows a message, and the movie continues. To get a different source, select **Change stream**.
- Alder matches language names from all sources, for example "es", "spa" and "Spanish". Before, some subtitles and audio tracks did not match.
- **Portuguese (Brazil)** and **Portuguese** are 2 different languages.
- An add-on subtitle in your language does not start the video again.
- Alder shows a title when an add-on sends an episode that has no id.
- When you remove a profile, Alder does not sign out a Stremio account that another profile uses.
- Alder tells you when you add a Stremio account that another profile already uses.
- Alder sends its name and version to add-ons. Before, some add-ons blocked Alder.
- Sources with only Dolby Vision show on all TVs. When your TV cannot show them correctly, they are at the end of the list.

## 1.1

- Each profile keeps its own streaming add-ons. Add-ons that you add or remove in Stremio show in Alder on the next page.
- Continue Watching shows correctly when Home opens for the first time.
- The **Audio & subtitles** panel in the player opens correctly.
- In **Search**, the selected poster is no longer cut off at the top.

## 1.0

- **Press Play and it plays.** Alder picks a good source and starts it. Hold OK on **Play** to see every source.
- **Automatic fallback.** When a stream fails, Alder tries the next one from the same second.
- **Only what your TV can play.** Alder checks your TV for 4K, HDR, Dolby Vision, HEVC, AV1 and DTS. It hides files that the TV cannot play.
- **Profiles.** Up to 5 profiles, each with its own Stremio account. A PIN is optional.
- **Stream preferences in plain words:** **Best picture**, **Balanced** or **Fast start**.
- **Series.** The next episode keeps the same release and quality. **Skip intro** is built in.
- **Continue Watching on the Google TV home screen.**
- **Frame-rate matching.** The TV changes to the film's frame rate.
- **Sync with Stremio.** Watch progress matches your phone and computer.
- **Updates.** Alder finds new versions on GitHub and installs them.
