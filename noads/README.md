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
* The native P2P engine (`libjiagu_sdk_pp_hlsProtected.so`) is a 360-jiagu-protected black box. If it
  verifies the app signature, P2P-hosted videos could fail on this build. The emulator smoke test
  cannot prove that either way; play one video on a real phone to be sure.
* Verified so far by: the patch tool's own shape checks, a byte-diff against the original (only the
  intended bytes differ, plus the DEX checksum/SHA-1 fields), signature verification and alignment
  checks. An emulator smoke test of original vs patched runs in CI; its result is recorded in the
  section below once it has run. **Not** verified on a physical phone.

## Smoke-test result

_Pending: not run yet._

## Rebuild

```bash
noads/build.sh          # needs JDK 17+, Maven, Python 3
```

CI (`.github/workflows/noads.yml`) does the same, then installs the original and the patched APK on
an Android 13 emulator and compares crashes, ad-SDK screens and ad-SDK log lines.
