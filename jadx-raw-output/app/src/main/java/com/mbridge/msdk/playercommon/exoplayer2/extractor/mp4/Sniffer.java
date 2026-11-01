package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import android.support.v4.media.session.PlaybackStateCompat;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
final class Sniffer {
    private static final int[] COMPATIBLE_BRANDS = {Util.getIntegerCodeForString("isom"), Util.getIntegerCodeForString("iso2"), Util.getIntegerCodeForString("iso3"), Util.getIntegerCodeForString("iso4"), Util.getIntegerCodeForString("iso5"), Util.getIntegerCodeForString("iso6"), Util.getIntegerCodeForString("avc1"), Util.getIntegerCodeForString("hvc1"), Util.getIntegerCodeForString("hev1"), Util.getIntegerCodeForString("mp41"), Util.getIntegerCodeForString("mp42"), Util.getIntegerCodeForString("3g2a"), Util.getIntegerCodeForString("3g2b"), Util.getIntegerCodeForString("3gr6"), Util.getIntegerCodeForString("3gs6"), Util.getIntegerCodeForString("3ge6"), Util.getIntegerCodeForString("3gg6"), Util.getIntegerCodeForString("M4V "), Util.getIntegerCodeForString("M4A "), Util.getIntegerCodeForString("f4v "), Util.getIntegerCodeForString("kddi"), Util.getIntegerCodeForString("M4VP"), Util.getIntegerCodeForString("qt  "), Util.getIntegerCodeForString("MSNV")};
    private static final int SEARCH_LENGTH = 4096;

    public static boolean sniffFragmented(ExtractorInput extractorInput) throws InterruptedException, IOException {
        return sniffInternal(extractorInput, true);
    }

    public static boolean sniffUnfragmented(ExtractorInput extractorInput) throws InterruptedException, IOException {
        return sniffInternal(extractorInput, false);
    }

    private static boolean isCompatibleBrand(int i10) {
        if ((i10 >>> 8) == Util.getIntegerCodeForString("3gp")) {
            return true;
        }
        for (int i11 : COMPATIBLE_BRANDS) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private static boolean sniffInternal(ExtractorInput extractorInput, boolean z10) throws InterruptedException, IOException {
        boolean z11;
        boolean z12;
        long length = extractorInput.getLength();
        long j10 = -1;
        if (length == -1 || length > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            length = 4096;
        }
        int i10 = (int) length;
        ParsableByteArray parsableByteArray = new ParsableByteArray(64);
        int i11 = 0;
        boolean z13 = false;
        while (true) {
            if (i11 < i10) {
                parsableByteArray.reset(8);
                extractorInput.peekFully(parsableByteArray.data, 0, 8);
                long unsignedInt = parsableByteArray.readUnsignedInt();
                int i12 = parsableByteArray.readInt();
                int i13 = 16;
                if (unsignedInt == 1) {
                    extractorInput.peekFully(parsableByteArray.data, 8, 8);
                    parsableByteArray.setLimit(16);
                    unsignedInt = parsableByteArray.readUnsignedLongToLong();
                } else {
                    if (unsignedInt == 0) {
                        long length2 = extractorInput.getLength();
                        if (length2 != j10) {
                            unsignedInt = ((long) 8) + (length2 - extractorInput.getPosition());
                        }
                    }
                    i13 = 8;
                }
                long j11 = i13;
                if (unsignedInt < j11) {
                    return false;
                }
                i11 += i13;
                if (i12 != Atom.TYPE_moov) {
                    if (i12 == Atom.TYPE_moof || i12 == Atom.TYPE_mvex) {
                        z11 = true;
                        z12 = true;
                        if (!z13 && z10 == z12) {
                            return z11;
                        }
                    }
                    if ((((long) i11) + unsignedInt) - j11 < i10) {
                        int i14 = (int) (unsignedInt - j11);
                        i11 += i14;
                        if (i12 == Atom.TYPE_ftyp) {
                            if (i14 < 8) {
                                return false;
                            }
                            parsableByteArray.reset(i14);
                            extractorInput.peekFully(parsableByteArray.data, 0, i14);
                            int i15 = i14 / 4;
                            for (int i16 = 0; i16 < i15; i16++) {
                                if (i16 != 1) {
                                    if (isCompatibleBrand(parsableByteArray.readInt())) {
                                        z13 = true;
                                        break;
                                    }
                                } else {
                                    parsableByteArray.skipBytes(4);
                                }
                            }
                            if (!z13) {
                                return false;
                            }
                        } else if (i14 != 0) {
                            extractorInput.advancePeekPosition(i14);
                        }
                    }
                }
                j10 = -1;
            }
            z11 = true;
            z12 = false;
            return !z13 ? false : false;
        }
    }

    private Sniffer() {
    }
}
