#!/usr/bin/env bash
# Guided walk through the app on a booted emulator, for the ORIGINAL and the PATCHED apk:
# Home (+ scroll the channel tabs), Categories, Promotion, Me, then open a movie and let it play.
# Prints what is on screen at each step plus crash / native-library / player log evidence.
set -u
PKG=com.fvvcl.flickverse; ACT="$PKG/com.mgs.carparking.ui.login.splash.SplashActivity"
T="python3 noads/ci/uitool.py"; out=explore-out; mkdir -p "$out"
walk() {
  label=$1; apk=$2
  echo; echo "################ WALK [$label] ################"
  adb uninstall "$PKG" >/dev/null 2>&1
  adb install -r -g "$apk" 2>&1 | grep -q Success || { echo "install failed"; return; }
  adb logcat -c; adb shell am start -W -n "$ACT" >/dev/null 2>&1; sleep 50
  $T tap "Ok" exact >/dev/null 2>&1 && sleep 8          # first-run "App Language" dialog, if shown
  echo "--- HOME:";        $T texts
  y=$($T rowy Recommend 2>/dev/null)
  if [ -n "${y:-}" ]; then for i in 1 2 3 4 5; do $T swipe-row "$y"; sleep 1; echo "--- HOME channel tabs, scroll $i:"; $T texts; done; fi
  adb exec-out screencap -p > "$out/$label.home.png"
  $T tap "Categories" >/dev/null && sleep 8 && { echo "--- CATEGORIES:"; $T texts; adb exec-out screencap -p > "$out/$label.categories.png"; }
  $T tap "Promotion" >/dev/null && sleep 8 && { echo "--- PROMOTION:"; $T texts; }
  $T tap "Me" exact >/dev/null && sleep 6 && { echo "--- ME:"; $T texts; }
  $T tap "Home" exact >/dev/null; sleep 5
  below=${y:-300}; $T tap-card "$((below + 40))" && sleep 12
  echo "--- MOVIE PAGE:"; $T texts; adb exec-out screencap -p > "$out/$label.detail.png"
  sleep 30
  echo "--- MOVIE PAGE after 30s of playback:"; $T texts; adb exec-out screencap -p > "$out/$label.playing.png"
  adb logcat -d -v threadtime > "$out/$label.logcat.txt"
  echo "--- evidence: alive=$([ -n "$(adb shell pidof $PKG | tr -d '\r')" ] && echo yes || echo NO)" \
       "fatal=$(grep -c 'FATAL EXCEPTION' "$out/$label.logcat.txt")" \
       "anr=$(grep -c 'ANR in' "$out/$label.logcat.txt")" \
       "unsatisfiedLink=$(grep -c UnsatisfiedLinkError "$out/$label.logcat.txt")" \
       "sigsegv=$(grep -c 'SIGSEGV\|Fatal signal' "$out/$label.logcat.txt")" \
       "adSdkLogLines=$(grep -ciE 'OKT_SDK|AppLovin|MobileAds|UnityAds|Vungle|IronSource|BidMachine|BigoAds|MBridge|AudienceNetwork|AppMetrica' "$out/$label.logcat.txt")"
  echo "--- P2P engine + player evidence:"; echo "  wangyi(P2P/app) lines: $(grep -c ' wangyi' "$out/$label.logcat.txt")"; grep ' wangyi' "$out/$label.logcat.txt" | head -4 | cut -c30-170
  echo "  player-lib lines (ExoPlayer/IJK/MediaCodec/ProxyCache): $(grep -ciE 'ExoPlayer|IJKMEDIA|ijkplayer|MediaCodec|ProxyCache|HttpProxy' "$out/$label.logcat.txt")"
  grep -m1 -A10 'FATAL EXCEPTION' "$out/$label.logcat.txt" | cut -c1-170
}
search_walk() {
  label=$1; apk=$2
  echo; echo "################ SEARCH WALK [$label] ################"
  adb uninstall "$PKG" >/dev/null 2>&1
  adb install -r -g "$apk" 2>&1 | grep -q Success || { echo "install failed"; return; }
  adb logcat -c; adb shell am start -W -n "$ACT" >/dev/null 2>&1; sleep 45
  $T tap "Ok" exact >/dev/null 2>&1 && sleep 6
  echo "--- HOME structure:"; $T nodes 45
  $T tap "Categories" >/dev/null && sleep 8 && { echo "--- CATEGORIES structure:"; $T nodes 70; }
  adb root >/dev/null 2>&1; sleep 3; adb wait-for-device
  adb shell am start -n "$PKG/com.mgs.carparking.ui.homecontent.videosearch.SearchContentVideoActivity" 2>&1 | tail -1
  sleep 6; echo "--- SEARCH SCREEN:"; $T texts; $T nodes 25
  $T tap-edit && sleep 1 && adb shell input text Malayalam && sleep 1 && adb shell input keyevent 66 && sleep 10
  echo "--- SEARCH RESULTS for 'Malayalam':"; $T texts; $T nodes 40; adb exec-out screencap -p > "$out/$label.search.png"
  $T tap-result 250 && sleep 20 && { echo "--- AFTER OPENING FIRST RESULT:"; $T texts; $T nodes 30; adb exec-out screencap -p > "$out/$label.detail2.png"; }
  sleep 30; echo "--- 30s LATER:"; $T texts
  adb logcat -d -v threadtime > "$out/$label.search.logcat.txt"; L="$out/$label.search.logcat.txt"
  echo "--- evidence: alive=$([ -n "$(adb shell pidof $PKG | tr -d '\r')" ] && echo yes || echo NO) fatal=$(grep -c 'FATAL EXCEPTION' "$L") anr=$(grep -c 'ANR in' "$L") unsatisfiedLink=$(grep -c UnsatisfiedLinkError "$L") sigsegv=$(grep -c 'SIGSEGV\|Fatal signal' "$L") adSdkLogLines=$(grep -ciE 'OKT_SDK|AppLovin|MobileAds|UnityAds|Vungle|IronSource|BidMachine|BigoAds|MBridge|AudienceNetwork|AppMetrica' "$L") wangyi=$(grep -c ' wangyi' "$L") playerLib=$(grep -ciE 'ExoPlayer|IJKMEDIA|ijkplayer|MediaCodec|ProxyCache|HttpProxy' "$L")"
  grep ' wangyi' "$L" | head -3 | cut -c30-170
  grep -m1 -A10 'FATAL EXCEPTION' "$L" | cut -c1-170
}
adb wait-for-device
echo "emulator: sdk=$(adb shell getprop ro.build.version.sdk | tr -d '\r') abilist=$(adb shell getprop ro.product.cpu.abilist | tr -d '\r')"
walk original "${ORIG:-apk-original/Moviecom.fvvcl.flickversevV4.0.0.apk}"
walk noads "${PATCHED:-build/Flickverse-V4.0.0-noads.apk}"
search_walk original "${ORIG:-apk-original/Moviecom.fvvcl.flickversevV4.0.0.apk}"
search_walk noads "${PATCHED:-build/Flickverse-V4.0.0-noads.apk}"
