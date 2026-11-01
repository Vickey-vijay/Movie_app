# Flickverse (recovered source)

This repository is a source-recovery project for the Android app
**Flickverse** (`com.fvvcl.flickverse`, versionName `V4.0.0`, minSdk 24).
The original source code was lost, so the release APK is the only copy.

> **Status: raw jadx import is in `jadx-raw-output/` (no manual edits) and does
> not build as exported.** Nothing has been changed in the app yet.

## What came from the APK

| Item | Value |
| --- | --- |
| File | `apk-original/Moviecom.fvvcl.flickversevV4.0.0.apk` (never modified) |
| Size | 54,853,986 bytes |
| SHA-256 | `139aab6c757b027d2b7668e0059a7577d3fe039d49b129ff2d6c34ead8b6d6fc` |
| Integrity | zip test passes; 11 `classes*.dex` files present |

`jadx-raw-output/` is the unmodified jadx export of that APK (Java sources,
resources, manifest, assets and a generated Gradle skeleton).

### Known limits of the raw import

- **No dependencies declared.** jadx wrote `// TODO: dependencies` in
  `app/build.gradle`. The libraries were merged into the APK, so they were
  decompiled into the source tree too: 42,343 Java files in total, of which
  about 640 are the app's own code (`com.mgs.carparking.*`) plus a few hundred
  obfuscated helper classes. A real build needs the libraries re-added as Gradle
  dependencies.
- **Decompile errors are in third-party SDK code only.** 433 files contain
  methods jadx could not decompile; none are in `com.mgs.carparking` or the
  app's own helper packages.
- **Native, protected code.** The P2P HLS engine (`libpp_hls.so`,
  `libjiagu_sdk_pp_hlsProtected.so`, `assets/pp_hlsProtected.dat`) cannot be
  recovered as source.
- **Resources decoded cleanly:** 735 layouts, 2,161 drawables, `strings.xml`
  (1,008 strings, 190 locales).
- **Not built or run anywhere yet.**

## What was changed

Nothing yet. Each change below will be a small, separate commit on the
`recovered-source` branch, and this section will be updated with every one:

- [x] Source imported from the APK (no behaviour changes) - `jadx-raw-output/`
- [ ] Ads removed (all ad SDK init, views, interstitials, reward flows, Gradle
      dependencies and manifest entries)
- [ ] Movies grouped by language (a movie can belong to several languages)
- [ ] Separate R15+ section, hidden from home/search, behind an age confirmation
- [ ] New launcher icon

## Rules for this work

- The original APK in `apk-original/` is kept untouched as the reference.
- Existing working behaviour must not regress: each change is made on its
  own commit so it can be reviewed or reverted independently.
- Destructive steps (deleting screens, rewriting the data model, changing the
  package name) need the owner's approval first.
