#!/usr/bin/env bash
# control (original APK) first, then the patched APK, on the same emulator. Prints a VERDICT and
# exits 0 = pass, 1 = patched app is worse than the original, 3 = inconclusive (control cannot run).
ORIG="${ORIG:-apk-original/Moviecom.fvvcl.flickversevV4.0.0.apk}"
PATCHED="${PATCHED:-build/Flickverse-V4.0.0-noads.apk}"
rm -rf smoke-out; mkdir -p smoke-out; adb wait-for-device
echo "emulator: sdk=$(adb shell getprop ro.build.version.sdk | tr -d '\r') abilist=$(adb shell getprop ro.product.cpu.abilist | tr -d '\r') native_bridge=$(adb shell getprop ro.dalvik.vm.native.bridge | tr -d '\r')"
bash noads/ci/smoke.sh original "$ORIG" 75
bash noads/ci/smoke.sh noads "$PATCHED" 75
echo; echo "================ SUMMARY ================"; cat smoke-out/results.txt
get() { grep "^RESULT\[$1\]" smoke-out/results.txt | head -1 | tr ' ' '\n' | grep "^$2=" | head -1 | cut -d= -f2; }
oi=$(get original install); ni=$(get noads install)
if [ "$oi" != OK ]; then echo "VERDICT: INCONCLUSIVE - the unmodified original cannot be installed/run on this emulator image"; exit 3; fi
if [ "$ni" != OK ]; then echo "VERDICT: FAIL - the patched APK does not install"; exit 1; fi
oa=$(get original alive); na=$(get noads alive); of=$(get original fatal_exceptions); nf=$(get noads fatal_exceptions)
if [ "$oa" = yes ] && [ "$na" != yes ]; then echo "VERDICT: FAIL - patched app died, original stayed alive"; exit 1; fi
if [ "${nf:-0}" -gt "${of:-0}" ]; then echo "VERDICT: FAIL - patched app has more fatal exceptions ($nf) than the original ($of)"; exit 1; fi
echo "VERDICT: PASS - patched app starts like the original (alive=$na, fatal=$nf vs $of); ad-SDK log lines: original=$(get original adSdkLogLines) patched=$(get noads adSdkLogLines)"
