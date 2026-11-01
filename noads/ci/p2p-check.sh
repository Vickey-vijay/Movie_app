#!/usr/bin/env bash
# Is the native P2P engine (libpp_hls, 360-jiagu protected) healthy in the PATCHED build?
# The app logs the port the engine returns (tag 'wangyi', "端口号为：<port>"): 7000 = started, -1 = failed.
# Order matters (a previous instance could still hold the port), so run patched-first, original, patched again, original again.
set -u
PKG=com.fvvcl.flickverse; ACT="$PKG/com.mgs.carparking.ui.login.splash.SplashActivity"
ORIG="${ORIG:-apk-original/Moviecom.fvvcl.flickversevV4.0.0.apk}"; PATCHED="${PATCHED:-build/Flickverse-V4.0.0-noads.apk}"
RESIGNED="${RESIGNED:-build/resigned-only.apk}"   # original code, signed with the throw-away key: isolates signature from code edits
mkdir -p p2p-out
run_one() {
  label=$1; apk=$2
  adb shell am force-stop "$PKG" >/dev/null 2>&1; adb uninstall "$PKG" >/dev/null 2>&1; sleep 2
  adb install -r -g "$apk" 2>&1 | grep -q Success || { echo "=== [$label] install FAILED"; return; }
  adb logcat -c; adb shell am start -W -n "$ACT" >/dev/null 2>&1; sleep 60
  python3 noads/ci/uitool.py tap "Ok" exact >/dev/null 2>&1; sleep 25
  adb logcat -d -v threadtime > "p2p-out/$label.logcat.txt"; L="p2p-out/$label.logcat.txt"
  listen=$(adb shell 'cat /proc/net/tcp /proc/net/tcp6' 2>/dev/null | tr -d '\r' | grep -i ':1B58 ' | grep -c ' 0A ')
  echo "=== [$label] port line(s): $(grep ' wangyi' "$L" | grep -c '端口号') | $(grep ' wangyi' "$L" | grep '端口号' | sed 's/.* I wangyi  : //' | tr '\n' ' ')"
  echo "    something LISTENING on tcp:7000 (0x1B58): $listen   | alive=$([ -n "$(adb shell pidof $PKG | tr -d '\r')" ] && echo yes || echo NO) fatal=$(grep -c 'FATAL EXCEPTION' "$L") nativeCrash=$(grep -c 'Fatal signal' "$L")"
  echo "    hls/jiagu/p2p related log lines: $(grep -ciE 'pp_hls|jiagu|libpp' "$L")"; grep -iE 'pp_hls|jiagu|libpp' "$L" | head -4 | cut -c1-190
}
adb wait-for-device
echo "emulator: sdk=$(adb shell getprop ro.build.version.sdk | tr -d '\r')"
# Already known: patched => port -1 (twice), original => 7000 (twice). Now isolate the cause:
run_one resigned-only-first "$RESIGNED"   # original code + NEW signature
run_one original "$ORIG"
run_one resigned-only-again "$RESIGNED"
