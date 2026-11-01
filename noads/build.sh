#!/usr/bin/env bash
# Build the "no ads" Flickverse APK from the original, untouched APK in apk-original/.
#   noads/build.sh                       -> build/Flickverse-V4.0.0-noads.apk
# Needs: JDK 17+, Maven, Python 3. Uses `apksigner` (Android build-tools) if it is on PATH,
# otherwise the bundled apksig 2.3.0 (v2-only signing, which is all Android 7+/minSdk 24 needs).
set -euo pipefail
HERE="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"; ROOT="$(cd "$HERE/.." && pwd)"
APK_IN="${APK_IN:-$ROOT/apk-original/Moviecom.fvvcl.flickversevV4.0.0.apk}"
WORK="${WORK:-$ROOT/build/work}"; OUT="${OUT:-$ROOT/build/Flickverse-V4.0.0-noads.apk}"
KS="${KS:-$HERE/signing/flickverse-personal.p12}"; KS_PASS="${KS_PASS:-flickverse}"; KS_ALIAS="${KS_ALIAS:-flickverse}"
EXP="--add-exports java.base/sun.security.x509=ALL-UNNAMED --add-exports java.base/sun.security.pkcs=ALL-UNNAMED --add-exports java.base/sun.security.util=ALL-UNNAMED"
mkdir -p "$WORK" "$(dirname "$OUT")"; rm -rf "$WORK/dex-in" "$WORK/dex-out" "$WORK/classes"; mkdir -p "$WORK/dex-in" "$WORK/classes"

echo "== 1/6 tools (smali/dexlib2/apksig from Maven Central)"
[ -d "$WORK/lib" ] || mvn -q -B -f "$HERE/tools/pom.xml" dependency:copy-dependencies -DoutputDirectory="$WORK/lib"
javac -nowarn -cp "$WORK/lib/*" -d "$WORK/classes" "$HERE"/tools/DexPatch.java "$HERE"/tools/Sign.java "$HERE"/tools/Verify.java 2>&1 | grep -v 'Picked up\|^Note:' || true

echo "== 2/6 extract the original DEX files"
unzip -q -o "$APK_IN" 'classes*.dex' -d "$WORK/dex-in"

echo "== 3/6 patch DEX in place ($(grep -cv '^#\|^$' "$HERE/patches/noads.spec") edits)"
java -cp "$WORK/classes:$WORK/lib/*" DexPatch "$WORK/dex-in" "$HERE/patches/noads.spec" "$WORK/dex-out" 2>&1 | grep -v 'Picked up' | grep -E '^(patched|DONE|REFUSING)'

echo "== 4/6 repack (alignment-preserving)"
python3 -I "$HERE/tools/repack.py" "$APK_IN" "$WORK/dex-out" "$WORK/unsigned.apk"

echo "== 5/6 sign"
rm -f "$OUT"
if command -v apksigner >/dev/null 2>&1; then
  apksigner sign --ks "$KS" --ks-pass "pass:$KS_PASS" --ks-key-alias "$KS_ALIAS" --min-sdk-version 24 \
    --v1-signing-enabled false --v2-signing-enabled true --v3-signing-enabled true --out "$OUT" "$WORK/unsigned.apk"
  apksigner verify --min-sdk-version 24 --verbose "$OUT" | head -6
else
  java $EXP -cp "$WORK/classes:$WORK/lib/*" Sign "$KS" "$KS_PASS" "$KS_ALIAS" "$WORK/unsigned.apk" "$OUT" 2>&1 | grep -v 'Picked up'
  java $EXP -cp "$WORK/classes:$WORK/lib/*" Verify "$OUT" 2>&1 | grep -v 'Picked up'
fi

echo "== 6/6 structural checks"
python3 -I "$HERE/tools/check_apk.py" "$OUT"
echo "OK: $OUT ($(stat -c %s "$OUT") bytes)  sha256=$(sha256sum "$OUT" | cut -d' ' -f1)"
