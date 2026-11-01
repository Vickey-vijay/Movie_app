package ih;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.SniffFailure;
import io.bidmachine.media3.extractor.mp4.AtomSizeTooSmallSniffFailure;
import io.bidmachine.media3.extractor.mp4.IncorrectFragmentationSniffFailure;
import io.bidmachine.media3.extractor.mp4.NoDeclaredBrandSniffFailure;
import io.bidmachine.media3.extractor.mp4.UnsupportedBrandsSniffFailure;
import java.io.IOException;

/* JADX INFO: compiled from: Sniffer.java */
/* JADX INFO: loaded from: classes11.dex */
public final class j {
    public static final int BRAND_HEIC = 1751476579;
    public static final int BRAND_QUICKTIME = 1903435808;
    private static final int[] COMPATIBLE_BRANDS = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    private static final int SEARCH_LENGTH = 4096;

    @Nullable
    public static SniffFailure sniffFragmented(ExtractorInput extractorInput) throws IOException {
        return sniffInternal(extractorInput, true, false);
    }

    @Nullable
    public static SniffFailure sniffUnfragmented(ExtractorInput extractorInput, boolean z10) throws IOException {
        return sniffInternal(extractorInput, false, z10);
    }

    private static boolean isCompatibleBrand(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : COMPATIBLE_BRANDS) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    private static SniffFailure sniffInternal(ExtractorInput extractorInput, boolean z10, boolean z11) throws IOException {
        int i10;
        int i11;
        boolean z12;
        int[] iArr;
        long length = extractorInput.getLength();
        long j10 = -1;
        long j11 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (length != -1 && length <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j11 = length;
        }
        int i12 = (int) j11;
        ParsableByteArray parsableByteArray = new ParsableByteArray(64);
        int i13 = 0;
        int i14 = 0;
        boolean z13 = false;
        while (true) {
            if (i14 < i12) {
                parsableByteArray.reset(8);
                if (extractorInput.peekFully(parsableByteArray.getData(), i13, 8, true)) {
                    long unsignedInt = parsableByteArray.readUnsignedInt();
                    int i15 = parsableByteArray.readInt();
                    int i16 = 16;
                    if (unsignedInt == 1) {
                        extractorInput.peekFully(parsableByteArray.getData(), 8, 8);
                        parsableByteArray.setLimit(16);
                        unsignedInt = parsableByteArray.readLong();
                    } else {
                        if (unsignedInt == 0) {
                            long length2 = extractorInput.getLength();
                            if (length2 != j10) {
                                unsignedInt = (length2 - extractorInput.getPeekPosition()) + ((long) 8);
                            }
                        }
                        i16 = 8;
                    }
                    long j12 = unsignedInt;
                    long j13 = i16;
                    if (j12 < j13) {
                        return new AtomSizeTooSmallSniffFailure(i15, j12, i16);
                    }
                    i14 += i16;
                    if (i15 == 1836019574) {
                        i12 += (int) j12;
                        if (length != -1 && i12 > length) {
                            i12 = (int) length;
                        }
                    } else {
                        if (i15 == 1836019558 || i15 == 1836475768) {
                            i10 = 1;
                            break;
                        }
                        long j14 = length;
                        if (i15 == 1835295092) {
                            z13 = true;
                        }
                        if ((((long) i14) + j12) - j13 >= i12) {
                            i10 = 0;
                            break;
                        }
                        int i17 = (int) (j12 - j13);
                        i14 += i17;
                        if (i15 != 1718909296) {
                            i11 = 0;
                            if (i17 != 0) {
                                extractorInput.advancePeekPosition(i17);
                            }
                        } else {
                            if (i17 < 8) {
                                return new AtomSizeTooSmallSniffFailure(i15, i17, 8);
                            }
                            parsableByteArray.reset(i17);
                            i11 = 0;
                            extractorInput.peekFully(parsableByteArray.getData(), 0, i17);
                            int i18 = parsableByteArray.readInt();
                            if (isCompatibleBrand(i18, z11)) {
                                z13 = true;
                            }
                            parsableByteArray.skipBytes(4);
                            int iBytesLeft = parsableByteArray.bytesLeft() / 4;
                            if (!z13 && iBytesLeft > 0) {
                                iArr = new int[iBytesLeft];
                                int i19 = 0;
                                while (true) {
                                    if (i19 >= iBytesLeft) {
                                        z12 = z13;
                                        break;
                                    }
                                    int i20 = parsableByteArray.readInt();
                                    iArr[i19] = i20;
                                    if (isCompatibleBrand(i20, z11)) {
                                        z12 = true;
                                        break;
                                    }
                                    i19++;
                                }
                            } else {
                                z12 = z13;
                                iArr = null;
                            }
                            if (!z12) {
                                return new UnsupportedBrandsSniffFailure(i18, iArr);
                            }
                            z13 = z12;
                        }
                        i13 = i11;
                        length = j14;
                    }
                    j10 = -1;
                }
            }
            i10 = i13;
            break;
        }
        if (!z13) {
            return NoDeclaredBrandSniffFailure.INSTANCE;
        }
        if (z10 != i10) {
            return i10 != 0 ? IncorrectFragmentationSniffFailure.FILE_FRAGMENTED : IncorrectFragmentationSniffFailure.FILE_NOT_FRAGMENTED;
        }
        return null;
    }

    private j() {
    }
}
