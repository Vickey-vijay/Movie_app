#!/usr/bin/env python3
"""Structural checks on an APK: CRCs, stored-entry alignment (4 / 4096 for .so), resources.arsc, signing block."""
import struct, sys, zipfile

apk = sys.argv[1]
raw = open(apk, "rb").read()
z = zipfile.ZipFile(apk)


def data_start(i):
    nl, el = struct.unpack("<HH", raw[i.header_offset + 26:i.header_offset + 30])
    return i.header_offset + 30 + nl + el


infos = z.infolist()
bad4 = [i.filename for i in infos if i.compress_type == 0 and data_start(i) % 4]
bad4096 = [i.filename for i in infos if i.compress_type == 0 and i.filename.endswith(".so") and data_start(i) % 4096]
arsc = z.getinfo("resources.arsc")
ok = True
def check(label, cond, detail=""):
    global ok
    print(("PASS  " if cond else "FAIL  ") + label + (f"  {detail}" if detail else ""))
    ok &= bool(cond)

check("zip CRCs", z.testzip() is None)
check("stored entries 4-byte aligned", not bad4, str(bad4[:3]))
check("stored .so 4096-byte aligned (extractNativeLibs=false)", not bad4096, str(bad4096[:3]))
check("resources.arsc stored + aligned (required for targetSdk 30+)", arsc.compress_type == 0 and data_start(arsc) % 4 == 0)
check("APK Signing Block present", b"APK Sig Block 42" in raw[-400000:])
print(f"entries={len(infos)} size={len(raw):,}")
sys.exit(0 if ok else 1)
