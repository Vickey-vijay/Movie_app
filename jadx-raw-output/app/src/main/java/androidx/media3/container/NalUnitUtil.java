package androidx.media3.container;

import androidx.annotation.Nullable;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
@UnstableApi
public final class NalUnitUtil {
    public static final int EXTENDED_SAR = 255;
    private static final int H264_NAL_UNIT_TYPE_SEI = 6;
    private static final int H264_NAL_UNIT_TYPE_SPS = 7;
    private static final int H265_NAL_UNIT_TYPE_PREFIX_SEI = 39;
    public static final int NAL_UNIT_TYPE_AUD = 9;
    public static final int NAL_UNIT_TYPE_IDR = 5;
    public static final int NAL_UNIT_TYPE_NON_IDR = 1;
    public static final int NAL_UNIT_TYPE_PARTITION_A = 2;
    public static final int NAL_UNIT_TYPE_PPS = 8;
    public static final int NAL_UNIT_TYPE_PREFIX = 14;
    public static final int NAL_UNIT_TYPE_SEI = 6;
    public static final int NAL_UNIT_TYPE_SPS = 7;
    private static final String TAG = "NalUnitUtil";
    public static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    public static final float[] ASPECT_RATIO_IDC_VALUES = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object scratchEscapePositionsLock = new Object();
    private static int[] scratchEscapePositions = new int[10];

    public static final class H265SpsData {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int chromaFormatIdc;
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;
        public final int[] constraintBytes;
        public final int generalLevelIdc;
        public final int generalProfileCompatibilityFlags;
        public final int generalProfileIdc;
        public final int generalProfileSpace;
        public final boolean generalTierFlag;
        public final int height;
        public final int maxNumReorderPics;
        public final float pixelWidthHeightRatio;
        public final int seqParameterSetId;
        public final int width;

        public H265SpsData(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int[] iArr, int i16, int i17, int i18, int i19, float f10, int i20, int i21, int i22, int i23) {
            this.generalProfileSpace = i10;
            this.generalTierFlag = z10;
            this.generalProfileIdc = i11;
            this.generalProfileCompatibilityFlags = i12;
            this.chromaFormatIdc = i13;
            this.bitDepthLumaMinus8 = i14;
            this.bitDepthChromaMinus8 = i15;
            this.constraintBytes = iArr;
            this.generalLevelIdc = i16;
            this.seqParameterSetId = i17;
            this.width = i18;
            this.height = i19;
            this.pixelWidthHeightRatio = f10;
            this.maxNumReorderPics = i20;
            this.colorSpace = i21;
            this.colorRange = i22;
            this.colorTransfer = i23;
        }
    }

    public static final class SpsData {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;
        public final int constraintsFlagsAndReservedZero2Bits;
        public final boolean deltaPicOrderAlwaysZeroFlag;
        public final boolean frameMbsOnlyFlag;
        public final int frameNumLength;
        public final int height;
        public final int levelIdc;
        public final int maxNumRefFrames;
        public final int maxNumReorderFrames;
        public final int picOrderCntLsbLength;
        public final int picOrderCountType;
        public final float pixelWidthHeightRatio;
        public final int profileIdc;
        public final boolean separateColorPlaneFlag;
        public final int seqParameterSetId;
        public final int width;

        public SpsData(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10, int i17, int i18, boolean z10, boolean z11, int i19, int i20, int i21, boolean z12, int i22, int i23, int i24, int i25) {
            this.profileIdc = i10;
            this.constraintsFlagsAndReservedZero2Bits = i11;
            this.levelIdc = i12;
            this.seqParameterSetId = i13;
            this.maxNumRefFrames = i14;
            this.width = i15;
            this.height = i16;
            this.pixelWidthHeightRatio = f10;
            this.bitDepthLumaMinus8 = i17;
            this.bitDepthChromaMinus8 = i18;
            this.separateColorPlaneFlag = z10;
            this.frameMbsOnlyFlag = z11;
            this.frameNumLength = i19;
            this.picOrderCountType = i20;
            this.picOrderCntLsbLength = i21;
            this.deltaPicOrderAlwaysZeroFlag = z12;
            this.colorSpace = i22;
            this.colorRange = i23;
            this.colorTransfer = i24;
            this.maxNumReorderFrames = i25;
        }
    }

    public static void clearPrefixFlags(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    private static void skipH265ScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (parsableNalUnitBitArray.readBit()) {
                    int iMin = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                    for (int i13 = 0; i13 < iMin; i13++) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                } else {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    public static final class PpsData {
        public final boolean bottomFieldPicOrderInFramePresentFlag;
        public final int picParameterSetId;
        public final int seqParameterSetId;

        public PpsData(int i10, int i11, boolean z10) {
            this.picParameterSetId = i10;
            this.seqParameterSetId = i11;
            this.bottomFieldPicOrderInFramePresentFlag = z10;
        }
    }

    public static int findNalUnit(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        Assertions.checkState(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            clearPrefixFlags(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            clearPrefixFlags(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            clearPrefixFlags(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    clearPrefixFlags(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    private static int findNextUnescapeIndex(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int getH265NalUnitType(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int getNalUnitType(byte[] bArr, int i10) {
        return bArr[i10 + 3] & 31;
    }

    public static H265SpsData parseH265SpsNalUnit(byte[] bArr, int i10, int i11) {
        return parseH265SpsNalUnitPayload(bArr, i10 + 2, i11);
    }

    public static H265SpsData parseH265SpsNalUnitPayload(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int iIsoTransferCharacteristicsToColorTransfer;
        int i15;
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i10, i11);
        parsableNalUnitBitArray.skipBits(4);
        int bits = parsableNalUnitBitArray.readBits(3);
        parsableNalUnitBitArray.skipBit();
        int bits2 = parsableNalUnitBitArray.readBits(2);
        boolean bit = parsableNalUnitBitArray.readBit();
        int bits3 = parsableNalUnitBitArray.readBits(5);
        int i16 = 0;
        for (int i17 = 0; i17 < 32; i17++) {
            if (parsableNalUnitBitArray.readBit()) {
                i16 |= 1 << i17;
            }
        }
        int[] iArr = new int[6];
        for (int i18 = 0; i18 < 6; i18++) {
            iArr[i18] = parsableNalUnitBitArray.readBits(8);
        }
        int bits4 = parsableNalUnitBitArray.readBits(8);
        int i19 = 0;
        for (int i20 = 0; i20 < bits; i20++) {
            if (parsableNalUnitBitArray.readBit()) {
                i19 += 89;
            }
            if (parsableNalUnitBitArray.readBit()) {
                i19 += 8;
            }
        }
        parsableNalUnitBitArray.skipBits(i19);
        if (bits > 0) {
            parsableNalUnitBitArray.skipBits((8 - bits) * 2);
        }
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (unsignedExpGolombCodedInt2 == 3) {
            parsableNalUnitBitArray.skipBit();
        }
        int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (parsableNalUnitBitArray.readBit()) {
            int unsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt6 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt7 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            unsignedExpGolombCodedInt3 -= ((unsignedExpGolombCodedInt2 == 1 || unsignedExpGolombCodedInt2 == 2) ? 2 : 1) * (unsignedExpGolombCodedInt5 + unsignedExpGolombCodedInt6);
            unsignedExpGolombCodedInt4 -= (unsignedExpGolombCodedInt2 == 1 ? 2 : 1) * (unsignedExpGolombCodedInt7 + unsignedExpGolombCodedInt8);
        }
        int i21 = unsignedExpGolombCodedInt4;
        int i22 = unsignedExpGolombCodedInt3;
        int i23 = i21;
        int unsignedExpGolombCodedInt9 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt10 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt11 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int iIsoColorPrimariesToColorSpace = -1;
        int iMax = -1;
        for (int i24 = parsableNalUnitBitArray.readBit() ? 0 : bits; i24 <= bits; i24++) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            iMax = Math.max(parsableNalUnitBitArray.readUnsignedExpGolombCodedInt(), iMax);
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        }
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (parsableNalUnitBitArray.readBit() && parsableNalUnitBitArray.readBit()) {
            skipH265ScalingList(parsableNalUnitBitArray);
        }
        parsableNalUnitBitArray.skipBits(2);
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(8);
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
        }
        skipShortTermReferencePictureSets(parsableNalUnitBitArray);
        if (parsableNalUnitBitArray.readBit()) {
            int unsignedExpGolombCodedInt12 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            for (int i25 = 0; i25 < unsignedExpGolombCodedInt12; i25++) {
                parsableNalUnitBitArray.skipBits(unsignedExpGolombCodedInt11 + 4 + 1);
            }
        }
        parsableNalUnitBitArray.skipBits(2);
        float f10 = 1.0f;
        if (parsableNalUnitBitArray.readBit()) {
            if (parsableNalUnitBitArray.readBit()) {
                int bits5 = parsableNalUnitBitArray.readBits(8);
                if (bits5 == 255) {
                    int bits6 = parsableNalUnitBitArray.readBits(16);
                    int bits7 = parsableNalUnitBitArray.readBits(16);
                    if (bits6 != 0 && bits7 != 0) {
                        f10 = bits6 / bits7;
                    }
                } else {
                    float[] fArr = ASPECT_RATIO_IDC_VALUES;
                    if (bits5 < fArr.length) {
                        f10 = fArr[bits5];
                    } else {
                        Log.w(TAG, "Unexpected aspect_ratio_idc value: " + bits5);
                    }
                }
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBit();
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBits(3);
                i15 = parsableNalUnitBitArray.readBit() ? 1 : 2;
                if (parsableNalUnitBitArray.readBit()) {
                    int bits8 = parsableNalUnitBitArray.readBits(8);
                    int bits9 = parsableNalUnitBitArray.readBits(8);
                    parsableNalUnitBitArray.skipBits(8);
                    iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(bits8);
                    iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(bits9);
                } else {
                    iIsoTransferCharacteristicsToColorTransfer = -1;
                }
            } else {
                iIsoTransferCharacteristicsToColorTransfer = -1;
                i15 = -1;
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            }
            parsableNalUnitBitArray.skipBit();
            if (parsableNalUnitBitArray.readBit()) {
                i23 *= 2;
            }
            i14 = i15;
            i12 = i23;
            i13 = iIsoColorPrimariesToColorSpace;
            iIsoColorPrimariesToColorSpace = iIsoTransferCharacteristicsToColorTransfer;
        } else {
            i12 = i23;
            i13 = -1;
            i14 = -1;
        }
        return new H265SpsData(bits2, bit, bits3, i16, unsignedExpGolombCodedInt2, unsignedExpGolombCodedInt9, unsignedExpGolombCodedInt10, iArr, bits4, unsignedExpGolombCodedInt, i22, i12, f10, iMax, i13, i14, iIsoColorPrimariesToColorSpace);
    }

    public static PpsData parsePpsNalUnit(byte[] bArr, int i10, int i11) {
        return parsePpsNalUnitPayload(bArr, i10 + 1, i11);
    }

    public static PpsData parsePpsNalUnitPayload(byte[] bArr, int i10, int i11) {
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i10, i11);
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        return new PpsData(unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2, parsableNalUnitBitArray.readBit());
    }

    public static SpsData parseSpsNalUnit(byte[] bArr, int i10, int i11) {
        return parseSpsNalUnitPayload(bArr, i10 + 1, i11);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:108:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:115:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:121:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:124:0x0200  */
    /* JADX WARN: Code duplicated, block: B:127:0x020c  */
    /* JADX WARN: Code duplicated, block: B:129:0x022d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:56:0x010c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0113  */
    /* JADX WARN: Code duplicated, block: B:59:0x0116  */
    /* JADX WARN: Code duplicated, block: B:61:0x011a  */
    /* JADX WARN: Code duplicated, block: B:62:0x011c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0155  */
    /* JADX WARN: Code duplicated, block: B:84:0x015b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0165  */
    /* JADX WARN: Code duplicated, block: B:90:0x0175  */
    /* JADX WARN: Code duplicated, block: B:92:0x017a  */
    /* JADX WARN: Code duplicated, block: B:94:0x017f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0195  */
    /* JADX WARN: Code duplicated, block: B:98:0x019d  */
    /* JADX WARN: Instruction removed from duplicated block: B:94:0x017f, please report this as an issue */
    public static SpsData parseSpsNalUnitPayload(byte[] bArr, int i10, int i11) {
        int unsignedExpGolombCodedInt;
        boolean bit;
        int unsignedExpGolombCodedInt2;
        int unsignedExpGolombCodedInt3;
        int unsignedExpGolombCodedInt4;
        boolean z10;
        boolean bit2;
        int i12;
        int i13;
        int unsignedExpGolombCodedInt5;
        int iIsoColorPrimariesToColorSpace;
        int i14;
        int i15;
        int i16;
        float f10;
        float f11;
        int iIsoTransferCharacteristicsToColorTransfer;
        int i17;
        boolean bit3;
        boolean bit4;
        int bits;
        float[] fArr;
        float f12;
        int bits2;
        int i18;
        int i19;
        int i20;
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i10, i11);
        int bits3 = parsableNalUnitBitArray.readBits(8);
        int bits4 = parsableNalUnitBitArray.readBits(8);
        int bits5 = parsableNalUnitBitArray.readBits(8);
        int unsignedExpGolombCodedInt6 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (bits3 == 100 || bits3 == 110 || bits3 == 122 || bits3 == 244 || bits3 == 44 || bits3 == 83 || bits3 == 86 || bits3 == 118 || bits3 == 128 || bits3 == 138) {
            unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            bit = unsignedExpGolombCodedInt == 3 ? parsableNalUnitBitArray.readBit() : false;
            unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
            if (parsableNalUnitBitArray.readBit()) {
                int i21 = unsignedExpGolombCodedInt == 3 ? 12 : 8;
                int i22 = 0;
                while (i22 < i21) {
                    if (parsableNalUnitBitArray.readBit()) {
                        skipScalingList(parsableNalUnitBitArray, i22 < 6 ? 16 : 64);
                    }
                    i22++;
                }
            }
        } else {
            unsignedExpGolombCodedInt = 1;
            bit = false;
            unsignedExpGolombCodedInt2 = 0;
            unsignedExpGolombCodedInt3 = 0;
        }
        int unsignedExpGolombCodedInt7 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 4;
        int unsignedExpGolombCodedInt8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (unsignedExpGolombCodedInt8 != 0) {
            if (unsignedExpGolombCodedInt8 == 1) {
                boolean bit5 = parsableNalUnitBitArray.readBit();
                parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                bits3 = bits3;
                long unsignedExpGolombCodedInt9 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                for (int i23 = 0; i23 < unsignedExpGolombCodedInt9; i23++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                z10 = bit5;
                unsignedExpGolombCodedInt4 = 0;
            } else {
                unsignedExpGolombCodedInt4 = 0;
            }
            int unsignedExpGolombCodedInt10 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
            int unsignedExpGolombCodedInt11 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
            int unsignedExpGolombCodedInt12 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
            bit2 = parsableNalUnitBitArray.readBit();
            int i24 = (2 - (bit2 ? 1 : 0)) * unsignedExpGolombCodedInt12;
            if (!bit2) {
                parsableNalUnitBitArray.skipBit();
            }
            parsableNalUnitBitArray.skipBit();
            i12 = unsignedExpGolombCodedInt11 * 16;
            i13 = i24 * 16;
            if (parsableNalUnitBitArray.readBit()) {
                int unsignedExpGolombCodedInt13 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt14 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt15 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt16 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                if (unsignedExpGolombCodedInt == 0) {
                    i20 = 2 - (bit2 ? 1 : 0);
                    i18 = 1;
                } else {
                    if (unsignedExpGolombCodedInt == 3) {
                        i18 = 1;
                    } else {
                        i18 = 2;
                    }
                    if (unsignedExpGolombCodedInt == 1) {
                        i19 = 2;
                    } else {
                        i19 = 1;
                    }
                    i20 = i19 * (2 - (bit2 ? 1 : 0));
                }
                i12 -= (unsignedExpGolombCodedInt13 + unsignedExpGolombCodedInt14) * i18;
                i13 -= (unsignedExpGolombCodedInt15 + unsignedExpGolombCodedInt16) * i20;
            }
            int i25 = i13;
            int i26 = i12;
            int i27 = bits3;
            unsignedExpGolombCodedInt5 = ((i27 != 44 || i27 == 86 || i27 == 100 || i27 == 110 || i27 == 122 || i27 == 244) && (bits4 & 16) != 0) ? 0 : 16;
            iIsoColorPrimariesToColorSpace = -1;
            if (parsableNalUnitBitArray.readBit()) {
                if (parsableNalUnitBitArray.readBit()) {
                    bits = parsableNalUnitBitArray.readBits(8);
                    if (bits == 255) {
                        bits2 = parsableNalUnitBitArray.readBits(16);
                        int bits6 = parsableNalUnitBitArray.readBits(16);
                        if (bits2 != 0 || bits6 == 0) {
                            f11 = 1.0f;
                        } else {
                            f12 = bits2 / bits6;
                            f11 = f12;
                        }
                    } else {
                        fArr = ASPECT_RATIO_IDC_VALUES;
                        if (bits < fArr.length) {
                            f12 = fArr[bits];
                            f11 = f12;
                        } else {
                            Log.w(TAG, "Unexpected aspect_ratio_idc value: " + bits);
                            f11 = 1.0f;
                        }
                    }
                } else {
                    f11 = 1.0f;
                }
                if (parsableNalUnitBitArray.readBit()) {
                    parsableNalUnitBitArray.skipBit();
                }
                if (parsableNalUnitBitArray.readBit()) {
                    parsableNalUnitBitArray.skipBits(3);
                    i17 = parsableNalUnitBitArray.readBit() ? 1 : 2;
                    if (parsableNalUnitBitArray.readBit()) {
                        int bits7 = parsableNalUnitBitArray.readBits(8);
                        int bits8 = parsableNalUnitBitArray.readBits(8);
                        parsableNalUnitBitArray.skipBits(8);
                        iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(bits7);
                        iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(bits8);
                    } else {
                        iIsoTransferCharacteristicsToColorTransfer = -1;
                    }
                } else {
                    iIsoTransferCharacteristicsToColorTransfer = -1;
                    i17 = -1;
                }
                if (parsableNalUnitBitArray.readBit()) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                if (parsableNalUnitBitArray.readBit()) {
                    parsableNalUnitBitArray.skipBits(65);
                }
                bit3 = parsableNalUnitBitArray.readBit();
                if (bit3) {
                    skipHrdParameters(parsableNalUnitBitArray);
                }
                bit4 = parsableNalUnitBitArray.readBit();
                if (bit4) {
                    skipHrdParameters(parsableNalUnitBitArray);
                }
                if (bit3 || bit4) {
                    parsableNalUnitBitArray.skipBit();
                }
                parsableNalUnitBitArray.skipBit();
                if (parsableNalUnitBitArray.readBit()) {
                    parsableNalUnitBitArray.skipBit();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    unsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                i14 = unsignedExpGolombCodedInt5;
                i15 = i17;
                float f13 = f11;
                i16 = iIsoTransferCharacteristicsToColorTransfer;
                f10 = f13;
            } else {
                i14 = unsignedExpGolombCodedInt5;
                i15 = -1;
                i16 = -1;
                f10 = 1.0f;
            }
            return new SpsData(i27, bits4, bits5, unsignedExpGolombCodedInt6, unsignedExpGolombCodedInt10, i26, i25, f10, unsignedExpGolombCodedInt2, unsignedExpGolombCodedInt3, bit, bit2, unsignedExpGolombCodedInt7, unsignedExpGolombCodedInt8, unsignedExpGolombCodedInt4, z10, iIsoColorPrimariesToColorSpace, i15, i16, i14);
        }
        unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 4;
        z10 = false;
        int unsignedExpGolombCodedInt17 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        int unsignedExpGolombCodedInt18 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        int unsignedExpGolombCodedInt19 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        bit2 = parsableNalUnitBitArray.readBit();
        int i28 = (2 - (bit2 ? 1 : 0)) * unsignedExpGolombCodedInt19;
        if (!bit2) {
            parsableNalUnitBitArray.skipBit();
        }
        parsableNalUnitBitArray.skipBit();
        i12 = unsignedExpGolombCodedInt18 * 16;
        i13 = i28 * 16;
        if (parsableNalUnitBitArray.readBit()) {
            int unsignedExpGolombCodedInt110 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt111 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt112 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt113 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            if (unsignedExpGolombCodedInt == 0) {
                i20 = 2 - (bit2 ? 1 : 0);
                i18 = 1;
            } else {
                if (unsignedExpGolombCodedInt == 3) {
                    i18 = 1;
                } else {
                    i18 = 2;
                }
                if (unsignedExpGolombCodedInt == 1) {
                    i19 = 2;
                } else {
                    i19 = 1;
                }
                i20 = i19 * (2 - (bit2 ? 1 : 0));
            }
            i12 -= (unsignedExpGolombCodedInt110 + unsignedExpGolombCodedInt111) * i18;
            i13 -= (unsignedExpGolombCodedInt112 + unsignedExpGolombCodedInt113) * i20;
        }
        int i29 = i13;
        int i210 = i12;
        int i211 = bits3;
        if (i211 != 44) {
        }
        iIsoColorPrimariesToColorSpace = -1;
        if (parsableNalUnitBitArray.readBit()) {
            if (parsableNalUnitBitArray.readBit()) {
                f11 = 1.0f;
            } else {
                bits = parsableNalUnitBitArray.readBits(8);
                if (bits == 255) {
                    bits2 = parsableNalUnitBitArray.readBits(16);
                    int bits9 = parsableNalUnitBitArray.readBits(16);
                    if (bits2 != 0) {
                    }
                    f11 = 1.0f;
                } else {
                    fArr = ASPECT_RATIO_IDC_VALUES;
                    if (bits < fArr.length) {
                        f12 = fArr[bits];
                        f11 = f12;
                    } else {
                        Log.w(TAG, "Unexpected aspect_ratio_idc value: " + bits);
                        f11 = 1.0f;
                    }
                }
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBit();
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBits(3);
                if (parsableNalUnitBitArray.readBit()) {
                }
                if (parsableNalUnitBitArray.readBit()) {
                    int bits10 = parsableNalUnitBitArray.readBits(8);
                    int bits11 = parsableNalUnitBitArray.readBits(8);
                    parsableNalUnitBitArray.skipBits(8);
                    iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(bits10);
                    iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(bits11);
                } else {
                    iIsoTransferCharacteristicsToColorTransfer = -1;
                }
            } else {
                iIsoTransferCharacteristicsToColorTransfer = -1;
                i17 = -1;
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBits(65);
            }
            bit3 = parsableNalUnitBitArray.readBit();
            if (bit3) {
                skipHrdParameters(parsableNalUnitBitArray);
            }
            bit4 = parsableNalUnitBitArray.readBit();
            if (bit4) {
                skipHrdParameters(parsableNalUnitBitArray);
            }
            if (bit3) {
                parsableNalUnitBitArray.skipBit();
            } else {
                parsableNalUnitBitArray.skipBit();
            }
            parsableNalUnitBitArray.skipBit();
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBit();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                unsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            }
            i14 = unsignedExpGolombCodedInt5;
            i15 = i17;
            float f14 = f11;
            i16 = iIsoTransferCharacteristicsToColorTransfer;
            f10 = f14;
        } else {
            i14 = unsignedExpGolombCodedInt5;
            i15 = -1;
            i16 = -1;
            f10 = 1.0f;
        }
        return new SpsData(i211, bits4, bits5, unsignedExpGolombCodedInt6, unsignedExpGolombCodedInt17, i210, i29, f10, unsignedExpGolombCodedInt2, unsignedExpGolombCodedInt3, bit, bit2, unsignedExpGolombCodedInt7, unsignedExpGolombCodedInt8, unsignedExpGolombCodedInt4, z10, iIsoColorPrimariesToColorSpace, i15, i16, i14);
    }

    private static void skipScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray, int i10) {
        int signedExpGolombCodedInt = 8;
        int i11 = 8;
        for (int i12 = 0; i12 < i10; i12++) {
            if (signedExpGolombCodedInt != 0) {
                signedExpGolombCodedInt = ((parsableNalUnitBitArray.readSignedExpGolombCodedInt() + i11) + 256) % 256;
            }
            if (signedExpGolombCodedInt != 0) {
                i11 = signedExpGolombCodedInt;
            }
        }
    }

    public static int unescapeStream(byte[] bArr, int i10) {
        int i11;
        synchronized (scratchEscapePositionsLock) {
            int iFindNextUnescapeIndex = 0;
            int i12 = 0;
            while (iFindNextUnescapeIndex < i10) {
                try {
                    iFindNextUnescapeIndex = findNextUnescapeIndex(bArr, iFindNextUnescapeIndex, i10);
                    if (iFindNextUnescapeIndex < i10) {
                        int[] iArr = scratchEscapePositions;
                        if (iArr.length <= i12) {
                            scratchEscapePositions = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        scratchEscapePositions[i12] = iFindNextUnescapeIndex;
                        iFindNextUnescapeIndex += 3;
                        i12++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i11 = i10 - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = scratchEscapePositions[i15] - i14;
                System.arraycopy(bArr, i14, bArr, i13, i16);
                int i17 = i13 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i13 = i18 + 1;
                bArr[i18] = 0;
                i14 += i16 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i13, i11 - i13);
        }
        return i11;
    }

    private NalUnitUtil() {
    }

    public static void discardToSps(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i12 < iPosition) {
                int i13 = byteBuffer.get(i10) & 255;
                if (i11 == 3) {
                    if (i13 == 1 && (byteBuffer.get(i12) & 31) == 7) {
                        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                        byteBufferDuplicate.position(i10 - 3);
                        byteBufferDuplicate.limit(iPosition);
                        byteBuffer.position(0);
                        byteBuffer.put(byteBufferDuplicate);
                        return;
                    }
                } else if (i13 == 0) {
                    i11++;
                }
                if (i13 != 0) {
                    i11 = 0;
                }
                i10 = i12;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static boolean isNalUnitSei(@Nullable String str, byte b10) {
        if ("video/avc".equals(str) && (b10 & 31) == 6) {
            return true;
        }
        if ("video/hevc".equals(str) && ((b10 & 126) >> 1) == 39) {
            return true;
        }
        return false;
    }

    private static void skipHrdParameters(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        parsableNalUnitBitArray.skipBits(8);
        for (int i10 = 0; i10 < unsignedExpGolombCodedInt; i10++) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
        }
        parsableNalUnitBitArray.skipBits(20);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void skipShortTermReferencePictureSets(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        Object[] objArr;
        int i10;
        int i11;
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < unsignedExpGolombCodedInt; i14++) {
            if (i14 != 0 && parsableNalUnitBitArray.readBit()) {
                objArr = true;
            } else {
                objArr = false;
            }
            if (objArr != false) {
                int i15 = i12 + i13;
                int unsignedExpGolombCodedInt2 = (1 - ((parsableNalUnitBitArray.readBit() ? 1 : 0) * 2)) * (parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1);
                int i16 = i15 + 1;
                boolean[] zArr = new boolean[i16];
                for (int i17 = 0; i17 <= i15; i17++) {
                    if (!parsableNalUnitBitArray.readBit()) {
                        zArr[i17] = parsableNalUnitBitArray.readBit();
                    } else {
                        zArr[i17] = true;
                    }
                }
                int[] iArr2 = new int[i16];
                int[] iArr3 = new int[i16];
                int i18 = 0;
                for (int i19 = i13 - 1; i19 >= 0; i19--) {
                    int i20 = iArrCopyOf[i19] + unsignedExpGolombCodedInt2;
                    if (i20 < 0 && zArr[i12 + i19]) {
                        iArr2[i18] = i20;
                        i18++;
                    }
                }
                if (unsignedExpGolombCodedInt2 < 0 && zArr[i15]) {
                    iArr2[i18] = unsignedExpGolombCodedInt2;
                    i18++;
                }
                for (int i21 = 0; i21 < i12; i21++) {
                    int i22 = iArr[i21] + unsignedExpGolombCodedInt2;
                    if (i22 < 0 && zArr[i21]) {
                        iArr2[i18] = i22;
                        i18++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr2, i18);
                int i23 = 0;
                for (int i24 = i12 - 1; i24 >= 0; i24--) {
                    int i25 = iArr[i24] + unsignedExpGolombCodedInt2;
                    if (i25 > 0 && zArr[i24]) {
                        iArr3[i23] = i25;
                        i23++;
                    }
                }
                if (unsignedExpGolombCodedInt2 > 0 && zArr[i15]) {
                    iArr3[i23] = unsignedExpGolombCodedInt2;
                    i23++;
                }
                for (int i26 = 0; i26 < i13; i26++) {
                    int i27 = iArrCopyOf[i26] + unsignedExpGolombCodedInt2;
                    if (i27 > 0 && zArr[i12 + i26]) {
                        iArr3[i23] = i27;
                        i23++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr3, i23);
                iArr = iArrCopyOf2;
                i12 = i18;
                i13 = i23;
            } else {
                int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int[] iArr4 = new int[unsignedExpGolombCodedInt3];
                for (int i28 = 0; i28 < unsignedExpGolombCodedInt3; i28++) {
                    if (i28 > 0) {
                        i11 = iArr4[i28 - 1];
                    } else {
                        i11 = 0;
                    }
                    iArr4[i28] = i11 - (parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1);
                    parsableNalUnitBitArray.skipBit();
                }
                int[] iArr5 = new int[unsignedExpGolombCodedInt4];
                for (int i29 = 0; i29 < unsignedExpGolombCodedInt4; i29++) {
                    if (i29 > 0) {
                        i10 = iArr5[i29 - 1];
                    } else {
                        i10 = 0;
                    }
                    iArr5[i29] = i10 + parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
                    parsableNalUnitBitArray.skipBit();
                }
                i12 = unsignedExpGolombCodedInt3;
                iArr = iArr4;
                i13 = unsignedExpGolombCodedInt4;
                iArrCopyOf = iArr5;
            }
        }
    }
}
