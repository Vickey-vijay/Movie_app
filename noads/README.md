# noads - Flickverse V4.0.0 with the ad SDKs switched off

`build.sh` takes the **original, untouched APK** in `../apk-original/` and produces
`build/Flickverse-V4.0.0-noads.apk`. Nothing is decompiled and recompiled: 41 small edits are
made **in place** inside the existing bytecode (198 bytes changed across 7 DEX files, no
instruction added or removed, no offset or size changed), the DEX checksums are fixed, the
APK is re-packed with its alignment preserved, and it is re-signed.

Why not rebuild from the jadx source? That export is not buildable (no dependencies declared,
libraries merged and renamed, 433 files with decompile failures), so a rebuild would risk breaking
things that work today. Patching the shipped binary keeps every non-ad code path identical.

## What is switched off (`patches/noads.spec`)

| Layer | Edit |
| --- | --- |
| Server-driven ad slots | `AdInfoEntry.getAd_position_1..26()` return `null` = "server sent no ads". All ~50 call sites test `!= null && size() > 0` first (checked), so splash / banner / native / pop-up / pre-roll / reward / interstitial placements simply never appear. With no ad, the download dialog takes its "download directly" branch. |
| OKT/WxSDK aggregator | `AppApplication.loadAdConf()` returns immediately (the only `WxSDK.initSdk` call); `MainActivity.P()` (ad preload) and the `MainSDK.initAdCache` call are skipped. |
| Analytics | The single `AppMetrica.activate()` call is removed. |
| Boot-time SDK providers | `onCreate`/`attachInfo` of the Google Mobile Ads, AppLovin, BidMachine, Vungle, Bigo, MBridge, Yandex, Audience Network and IronSource/LevelPlay providers, and Unity's androidx-startup initializer, do nothing. |

Not touched on purpose: the VIP flag (`o0.z()`), `com.yk.e.provider.MainProvider` (a plain FileProvider),
`PreloadManager` (the short-video cache, not an ad), Facebook core SDK, SafeDK, and the native
P2P/jiagu engine.

## Honest limits

* The ad SDK **code is still inside the APK** (about 80 of its 117 manifest activities, ~50 MB of DEX).
  It is never initialised or called, but the APK is not smaller. Actually removing it needs a
  rebuildable source tree, which this project does not have.
* The **"Promotion" tab** (`SpielFragment`, a web page) is untouched - it is app content, not an ad
  SDK. Say if you want it hidden.
* **Signature changes.** The original signing key is not available, so the APK is signed with the
  throw-away key in `signing/` (password `flickverse`, committed on purpose so every build has the same
  signature). Android will not install it over the original: **uninstall the original first**
  (local downloads and cache are lost; the account is server-side). Anyone can sign with that key, so
  do not treat it as a secret. If you ever share the APK, make a private key instead.
* **P2P engine does not start unless the app is signed with the original key (verified).** The native
  engine (`libjiagu_sdk_pp_hlsProtected.so` / `libpp_hls.so`) returns port `-1` for *any* APK not signed with
  the original self-made `flickverse` key (cert MD5 `099656628B5CF75B43B04EECE0E62FA4`), even the original code
  byte-for-byte re-signed. So on this build P2P-flagged videos and in-app downloads (which go through
  `127.0.0.1:<port>`) are expected to fail; episodes with a direct `orginal_url` should play. The fix is to sign
  with the original keystore (see "Signing with the original key" below).
* Verified so far by: the patch tool's own shape checks, a byte-diff against the original (only the
  intended bytes differ, plus the DEX checksum/SHA-1 fields), signature verification and alignment
  checks. An emulator smoke test of original vs patched runs in CI; its result is recorded in the
  section below once it has run. **Not** verified on a physical phone.

## Smoke-test result (GitHub Actions, Android emulator with ARM translation)

* **Launch test**, original vs patched, 75 s each: API 30 (Google APIs), API 30 (Play) and API 34 (Play) all
  PASS - both alive, 0 fatal exceptions; ad-SDK log lines **159 vs 0**. API 33 (Play) fails early and is
  inconclusive (the original does not run there either).
* **UI walk** (API 30): Home / Categories / Promotion / Me / search behave identically; the original shows real
  in-feed native ads (a gambling ad on Home, a shopping ad on Search, "Ad / INSTALL" banners) which are gone in the
  patched build. Searching "Malayalam" returns real Malayalam titles in both builds.
* **P2P engine**: original -> port 7000 with a socket listening; patched -> `-1`; original code re-signed with the
  throw-away key -> `-1` (twice). Cause = the signing key, not the code edit.
* **Not verified**: actual video playback and downloads (the walk never pressed *Play now*), and anything on a
  physical phone.

## Signing with the original key (fixes P2P, and lets the APK update the installed app in place)

The original was signed with a self-made key: `CN=flickverse` (all fields), created 2025-11-14, cert MD5
`099656628B5CF75B43B04EECE0E62FA4`. If you still have that keystore (`*.jks`, `*.keystore`, `*.p12`), add it as
**repository secrets** (never commit it): `KEYSTORE_BASE64`, `KEYSTORE_PASSWORD`, `KEY_ALIAS` (default
`flickverse`) and optionally `KEY_PASSWORD`. The workflows then sign with it and the build **fails** unless the
resulting certificate MD5 matches the original.

## Rebuild

```bash
noads/build.sh          # needs JDK 17+, Maven, Python 3
```

CI (`.github/workflows/noads.yml`) does the same, then installs the original and the patched APK on
an Android 13 emulator and compares crashes, ad-SDK screens and ad-SDK log lines.
