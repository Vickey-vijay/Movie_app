#!/usr/bin/env bash
# Runs against a booted emulator. usage: smoke.sh <label> <apk> [seconds-to-wait]
# Installs the APK, launches the app, waits, then reports: did it start, is it still alive,
# did it crash, is an ad-SDK screen on top, how many ad-SDK log lines, and what text is on screen.
set -u
PKG=com.fvvcl.flickverse
ACT="$PKG/com.mgs.carparking.ui.login.splash.SplashActivity"
label="$1"; apk="$2"; wait_s="${3:-60}"
out="smoke-out"; mkdir -p "$out"
AD_RE='OKT_SDK|WxSDK|MobileAds|AppLovin|applovin|UnityAds|unity3d|VungleAds|vungle|IronSource|ironsource|BidMachine|bidmachine|BigoAds|bigo|MBridge|mbridge|Yandex|yandex.*ads|AudienceNetwork|InMobi|inmobi|Fyber|inneractive|AppMetrica|appmetrica|pangle|bytedance'
AD_ACT_RE='com\.(applovin|bytedance|unity3d|vungle|inmobi|mbridge|yandex|fyber|google\.android\.gms\.ads|ironsource|facebook\.ads)|sg\.bigo|io\.bidmachine|com\.yk\.e'

echo "=================== SMOKE [$label] ==================="
adb uninstall "$PKG" >/dev/null 2>&1 || true
if ! adb install -r -g "$apk" > "$out/$label.install.txt" 2>&1 || ! grep -q Success "$out/$label.install.txt"; then
  echo "RESULT[$label] install=FAILED  $(tr -d '\r' < "$out/$label.install.txt" | tail -2 | tr '\n' ' ')" | tee -a "$out/results.txt"; exit 0
fi
adb logcat -c
start=$(adb shell am start -W -n "$ACT" 2>&1 | tr -d '\r' | grep -E 'Status|Error' | tr '\n' ' ')
echo "start: $start"
for i in 1 2 3; do sleep $((wait_s / 3)); alive=$(adb shell pidof "$PKG" | tr -d '\r'); echo "  t+$((i * wait_s / 3))s alive_pid=${alive:-NONE}"; done
alive=$(adb shell pidof "$PKG" | tr -d '\r')
adb logcat -d -v threadtime > "$out/$label.logcat.txt" 2>&1
adb shell dumpsys activity activities | tr -d '\r' > "$out/$label.activities.txt"
resumed=$(grep -E 'ResumedActivity' "$out/$label.activities.txt" | head -1 | sed 's/^ *//')
adtop=$(grep -E 'ResumedActivity' "$out/$label.activities.txt" | grep -cE "$AD_ACT_RE")
adstack=$(grep -E '^ *\* (Hist|Task|ActivityRecord)|ActivityRecord' "$out/$label.activities.txt" | grep -cE "$AD_ACT_RE")
crashes=$(grep -c 'FATAL EXCEPTION' "$out/$label.logcat.txt")
adlines=$(grep -ciE "$AD_RE" "$out/$label.logcat.txt")
ule=$(grep -c 'UnsatisfiedLinkError' "$out/$label.logcat.txt")
adb shell uiautomator dump /sdcard/ui.xml >/dev/null 2>&1; adb pull /sdcard/ui.xml "$out/$label.ui.xml" >/dev/null 2>&1
adb exec-out screencap -p > "$out/$label.png" 2>/dev/null
echo "RESULT[$label] install=OK alive=$([ -n "$alive" ] && echo yes || echo NO) fatal_exceptions=$crashes adSdkOnTop=$adtop adSdkInTaskStack=$adstack adSdkLogLines=$adlines unsatisfiedLink=$ule" | tee -a "$out/results.txt"
echo "  resumed: $resumed"
if [ "$crashes" -gt 0 ]; then echo "  --- first crash:"; grep -m1 -A14 'FATAL EXCEPTION' "$out/$label.logcat.txt" | cut -c1-200; fi
if [ "$adlines" -gt 0 ]; then echo "  --- first ad-SDK log lines:"; grep -iE "$AD_RE" "$out/$label.logcat.txt" | head -6 | cut -c1-200; fi
echo "  --- on-screen text:"
python3 - "$out/$label.ui.xml" <<'PY' 2>/dev/null || echo "  (no ui dump)"
import sys, xml.etree.ElementTree as ET
seen = []
for n in ET.parse(sys.argv[1]).iter("node"):
    t = (n.get("text") or n.get("content-desc") or "").strip()
    if t and t not in seen: seen.append(t)
print("  " + " | ".join(seen[:40]) if seen else "  (nothing with text)")
PY
