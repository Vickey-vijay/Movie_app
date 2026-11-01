#!/usr/bin/env python3
"""Re-pack an APK with some entries replaced, preserving everything else byte-for-byte.

usage: repack.py <original.apk> <replacement-dir> <out.apk>

* Entries whose name matches a file in <replacement-dir> (e.g. classes5.dex) are replaced
  (deflated); every other entry's compressed bytes are copied untouched.
* Stored entries are re-aligned like zipalign: 4 bytes, and 4096 bytes for *.so (the manifest
  has extractNativeLibs="false", so the libraries are mmapped straight out of the APK).
* The old signing block and the old v1 signature files (META-INF/MANIFEST.MF, *.SF, *.RSA) are
  dropped; sign the result afterwards (apksigner / apksig).
"""
import os, re, struct, sys, zlib

# Old v1 (JAR) signature files: their digests no longer match the patched DEX files.
STALE_V1 = re.compile(r"^META-INF/(MANIFEST\.MF|[^/]+\.(SF|RSA|DSA|EC))$")

LFH, CDH, EOCD = 0x04034B50, 0x02014B50, 0x06054B50
ALIGN_EXTRA_ID = 0xD935


def strip_align_extra(extra: bytes) -> bytes:
    out, i = b"", 0
    while i + 4 <= len(extra):
        hid, sz = struct.unpack_from("<HH", extra, i)
        blk = extra[i:i + 4 + sz]
        if hid != ALIGN_EXTRA_ID:
            out += blk
        i += 4 + sz
    return out + extra[i:] if i < len(extra) else out


def main(orig, repl_dir, out):
    raw = open(orig, "rb").read()
    eocd = raw.rfind(struct.pack("<I", EOCD))
    _, _, _, n_here, n_total, cd_size, cd_off, clen = struct.unpack_from("<IHHHHIIH", raw, eocd)
    assert n_here == n_total and cd_off != 0xFFFFFFFF, "zip64 not supported"

    records, p = [], cd_off
    for _ in range(n_total):
        (sig, vmade, vneed, flags, method, mtime, mdate, crc, csize, usize, nlen, elen, cmlen,
         disk, iattr, eattr, lho) = struct.unpack_from("<IHHHHHHIIIHHHHHII", raw, p)
        assert sig == CDH
        name = raw[p + 46:p + 46 + nlen].decode("utf-8")
        records.append(dict(vmade=vmade, vneed=vneed, flags=flags, method=method, mtime=mtime, mdate=mdate,
                            crc=crc, csize=csize, usize=usize, nlen=nlen, cextra=raw[p + 46 + nlen:p + 46 + nlen + elen],
                            comment=raw[p + 46 + nlen + elen:p + 46 + nlen + elen + cmlen], disk=disk, iattr=iattr,
                            eattr=eattr, lho=lho, name=name, nameb=raw[p + 46:p + 46 + nlen]))
        p += 46 + nlen + elen + cmlen

    dropped = [r["name"] for r in records if STALE_V1.match(r["name"])]
    records = [r for r in records if not STALE_V1.match(r["name"])]
    outb = bytearray()
    replaced, realigned = 0, 0
    for r in records:
        sig, vneed, flags, method, mt, md, crc, cs, us, nlen, elen = struct.unpack_from("<IHHHHHIIIHH", raw, r["lho"])
        assert sig == LFH
        lextra = raw[r["lho"] + 30 + nlen:r["lho"] + 30 + nlen + elen]
        dstart = r["lho"] + 30 + nlen + elen
        data = raw[dstart:dstart + r["csize"]]
        method, crc, csize, usize = r["method"], r["crc"], r["csize"], r["usize"]

        rp = os.path.join(repl_dir, r["name"])
        if "/" not in r["name"] and os.path.isfile(rp):
            new = open(rp, "rb").read()
            if method == 8:
                c = zlib.compressobj(9, zlib.DEFLATED, -15)
                data = c.compress(new) + c.flush()
            else:
                data = new
            crc, csize, usize = zlib.crc32(new) & 0xFFFFFFFF, len(data), len(new)
            replaced += 1

        extra = strip_align_extra(lextra)
        pos = len(outb)
        pad = 0
        if method == 0:
            a = 4096 if r["name"].endswith(".so") else 4
            hdr_end = pos + 30 + len(r["nameb"]) + len(extra)
            pad = (-hdr_end) % a
            while pad and pad < 6:
                pad += a
            if pad:
                extra += struct.pack("<HHH", ALIGN_EXTRA_ID, pad - 4, a) + b"\x00" * (pad - 6)
                realigned += 1
        flags = r["flags"] & ~0x0008  # sizes/crc are written in the local header, no data descriptor
        outb += struct.pack("<IHHHHHIIIHH", LFH, r["vneed"], flags, method, r["mtime"], r["mdate"], crc, csize, usize,
                            len(r["nameb"]), len(extra))
        outb += r["nameb"] + extra + data
        r.update(new_lho=pos, new_crc=crc, new_csize=csize, new_usize=usize, new_flags=flags)

    cd_start = len(outb)
    for r in records:
        outb += struct.pack("<IHHHHHHIIIHHHHHII", CDH, r["vmade"], r["vneed"], r["new_flags"], r["method"], r["mtime"],
                            r["mdate"], r["new_crc"], r["new_csize"], r["new_usize"], len(r["nameb"]), len(r["cextra"]),
                            len(r["comment"]), r["disk"], r["iattr"], r["eattr"], r["new_lho"])
        outb += r["nameb"] + r["cextra"] + r["comment"]
    cd_len = len(outb) - cd_start
    outb += struct.pack("<IHHHHIIH", EOCD, 0, 0, len(records), len(records), cd_len, cd_start, 0)
    open(out, "wb").write(outb)
    print(f"repacked {len(records)} entries: {replaced} replaced, {len(dropped)} stale v1 signature files dropped {dropped}, "
          f"{realigned} re-padded for alignment -> {out} ({len(outb):,} bytes)")


if __name__ == "__main__":
    main(*sys.argv[1:4])
