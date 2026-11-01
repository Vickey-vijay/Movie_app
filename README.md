# Flickverse (recovered source)

This repository is a source-recovery project for the Android app
**Flickverse** (`com.fvvcl.flickverse`, versionName `V4.0.0`, minSdk 24).
The original source code was lost, so the release APK is the only copy.

> **Status: source not recovered yet.** Only the original APK is in this
> repository so far. Nothing has been changed in the app.

## What came from the APK

| Item | Value |
| --- | --- |
| File | `apk-original/Moviecom.fvvcl.flickversevV4.0.0.apk` (never modified) |
| Size | 54,853,986 bytes |
| SHA-256 | `139aab6c757b027d2b7668e0059a7577d3fe039d49b129ff2d6c34ead8b6d6fc` |
| Integrity | zip test passes; 11 `classes*.dex` files present |

Decompiled sources, resources and manifest will be imported into this repo
as a separate, clearly labelled commit once the decompile output is available.
Decompiled code is machine-generated: expect renamed identifiers and some
methods that need manual repair before they compile.

## What was changed

Nothing yet. Each change below will be a small, separate commit on the
`recovered-source` branch, and this section will be updated with every one:

- [ ] Source imported from the APK (no behaviour changes)
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
