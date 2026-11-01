#!/usr/bin/env bash
# control (original APK) first, then the patched APK, on the same emulator.
ORIG="${ORIG:-apk-original/Moviecom.fvvcl.flickversevV4.0.0.apk}"
PATCHED="${PATCHED:-build/Flickverse-V4.0.0-noads.apk}"
rm -rf smoke-out; adb wait-for-device
adb shell getprop ro.product.cpu.abilist | tr -d '\r' | sed 's/^/emulator abis: /'
bash noads/ci/smoke.sh original "$ORIG" 75
bash noads/ci/smoke.sh noads "$PATCHED" 75
echo; echo "================ SUMMARY ================"; cat smoke-out/results.txt
