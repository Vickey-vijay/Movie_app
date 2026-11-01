package com.mbridge.msdk.playercommon.exoplayer2.util;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class NalUnitUtil {
    public static final int EXTENDED_SAR = 255;
    private static final int H264_NAL_UNIT_TYPE_SEI = 6;
    private static final int H264_NAL_UNIT_TYPE_SPS = 7;
    private static final int H265_NAL_UNIT_TYPE_PREFIX_SEI = 39;
    private static final String TAG = "NalUnitUtil";
    public static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    public static final float[] ASPECT_RATIO_IDC_VALUES = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object scratchEscapePositionsLock = new Object();
    private static int[] scratchEscapePositions = new int[10];

    public static void clearPrefixFlags(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
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

    public static final class SpsData {
        public final boolean deltaPicOrderAlwaysZeroFlag;
        public final boolean frameMbsOnlyFlag;
        public final int frameNumLength;
        public final int height;
        public final int picOrderCntLsbLength;
        public final int picOrderCountType;
        public final float pixelWidthAspectRatio;
        public final boolean separateColorPlaneFlag;
        public final int seqParameterSetId;
        public final int width;

        public SpsData(int i10, int i11, int i12, float f10, boolean z10, boolean z11, int i13, int i14, int i15, boolean z12) {
            this.seqParameterSetId = i10;
            this.width = i11;
            this.height = i12;
            this.pixelWidthAspectRatio = f10;
            this.separateColorPlaneFlag = z10;
            this.frameMbsOnlyFlag = z11;
            this.frameNumLength = i13;
            this.picOrderCountType = i14;
            this.picOrderCntLsbLength = i15;
            this.deltaPicOrderAlwaysZeroFlag = z12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0093, code lost:
    
        r9 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int findNalUnit(byte[] r8, int r9, int r10, boolean[] r11) {
        /*
            int r0 = r10 - r9
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L8
            r3 = r2
            goto L9
        L8:
            r3 = r1
        L9:
            com.mbridge.msdk.playercommon.exoplayer2.util.Assertions.checkState(r3)
            if (r0 != 0) goto Lf
            return r10
        Lf:
            r3 = 2
            if (r11 == 0) goto L40
            boolean r4 = r11[r1]
            if (r4 == 0) goto L1c
            clearPrefixFlags(r11)
            int r9 = r9 + (-3)
            return r9
        L1c:
            if (r0 <= r2) goto L2b
            boolean r4 = r11[r2]
            if (r4 == 0) goto L2b
            r4 = r8[r9]
            if (r4 != r2) goto L2b
            clearPrefixFlags(r11)
            int r9 = r9 - r3
            return r9
        L2b:
            if (r0 <= r3) goto L40
            boolean r4 = r11[r3]
            if (r4 == 0) goto L40
            r4 = r8[r9]
            if (r4 != 0) goto L40
            int r4 = r9 + 1
            r4 = r8[r4]
            if (r4 != r2) goto L40
            clearPrefixFlags(r11)
            int r9 = r9 - r2
            return r9
        L40:
            int r4 = r10 + (-1)
            int r9 = r9 + r3
        L43:
            if (r9 >= r4) goto L65
            r5 = r8[r9]
            r6 = r5 & 254(0xfe, float:3.56E-43)
            if (r6 == 0) goto L4c
            goto L62
        L4c:
            int r6 = r9 + (-2)
            r7 = r8[r6]
            if (r7 != 0) goto L60
            int r7 = r9 + (-1)
            r7 = r8[r7]
            if (r7 != 0) goto L60
            if (r5 != r2) goto L60
            if (r11 == 0) goto L5f
            clearPrefixFlags(r11)
        L5f:
            return r6
        L60:
            int r9 = r9 + (-2)
        L62:
            int r9 = r9 + 3
            goto L43
        L65:
            if (r11 == 0) goto Lb9
            if (r0 <= r3) goto L7a
            int r9 = r10 + (-3)
            r9 = r8[r9]
            if (r9 != 0) goto L95
            int r9 = r10 + (-2)
            r9 = r8[r9]
            if (r9 != 0) goto L95
            r9 = r8[r4]
            if (r9 != r2) goto L95
            goto L93
        L7a:
            if (r0 != r3) goto L8b
            boolean r9 = r11[r3]
            if (r9 == 0) goto L95
            int r9 = r10 + (-2)
            r9 = r8[r9]
            if (r9 != 0) goto L95
            r9 = r8[r4]
            if (r9 != r2) goto L95
            goto L93
        L8b:
            boolean r9 = r11[r2]
            if (r9 == 0) goto L95
            r9 = r8[r4]
            if (r9 != r2) goto L95
        L93:
            r9 = r2
            goto L96
        L95:
            r9 = r1
        L96:
            r11[r1] = r9
            if (r0 <= r2) goto La5
            int r9 = r10 + (-2)
            r9 = r8[r9]
            if (r9 != 0) goto Laf
            r9 = r8[r4]
            if (r9 != 0) goto Laf
            goto Lad
        La5:
            boolean r9 = r11[r3]
            if (r9 == 0) goto Laf
            r9 = r8[r4]
            if (r9 != 0) goto Laf
        Lad:
            r9 = r2
            goto Lb0
        Laf:
            r9 = r1
        Lb0:
            r11[r2] = r9
            r8 = r8[r4]
            if (r8 != 0) goto Lb7
            r1 = r2
        Lb7:
            r11[r3] = r1
        Lb9:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil.findNalUnit(byte[], int, int, boolean[]):int");
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

    public static PpsData parsePpsNalUnit(byte[] bArr, int i10, int i11) {
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i10, i11);
        parsableNalUnitBitArray.skipBits(8);
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        return new PpsData(unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2, parsableNalUnitBitArray.readBit());
    }

    /* JADX WARN: Code duplicated, block: B:84:0x015d  */
    public static SpsData parseSpsNalUnit(byte[] bArr, int i10, int i11) {
        int unsignedExpGolombCodedInt;
        boolean z10;
        int unsignedExpGolombCodedInt2;
        boolean z11;
        float f10;
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i10, i11);
        parsableNalUnitBitArray.skipBits(8);
        int bits = parsableNalUnitBitArray.readBits(8);
        parsableNalUnitBitArray.skipBits(16);
        int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int i12 = 1;
        if (bits == 100 || bits == 110 || bits == 122 || bits == 244 || bits == 44 || bits == 83 || bits == 86 || bits == 118 || bits == 128 || bits == 138) {
            unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            boolean bit = unsignedExpGolombCodedInt == 3 ? parsableNalUnitBitArray.readBit() : false;
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
            if (parsableNalUnitBitArray.readBit()) {
                int i13 = unsignedExpGolombCodedInt != 3 ? 8 : 12;
                int i14 = 0;
                while (i14 < i13) {
                    if (parsableNalUnitBitArray.readBit()) {
                        skipScalingList(parsableNalUnitBitArray, i14 < 6 ? 16 : 64);
                    }
                    i14++;
                }
            }
            z10 = bit;
        } else {
            z10 = false;
            unsignedExpGolombCodedInt = 1;
        }
        int unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 4;
        int unsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (unsignedExpGolombCodedInt5 == 0) {
            z11 = false;
            unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 4;
        } else if (unsignedExpGolombCodedInt5 == 1) {
            boolean bit2 = parsableNalUnitBitArray.readBit();
            parsableNalUnitBitArray.readSignedExpGolombCodedInt();
            parsableNalUnitBitArray.readSignedExpGolombCodedInt();
            long unsignedExpGolombCodedInt6 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            for (int i15 = 0; i15 < unsignedExpGolombCodedInt6; i15++) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            }
            unsignedExpGolombCodedInt2 = 0;
            z11 = bit2;
        } else {
            unsignedExpGolombCodedInt2 = 0;
            z11 = false;
        }
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        int unsignedExpGolombCodedInt7 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        int unsignedExpGolombCodedInt8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        boolean bit3 = parsableNalUnitBitArray.readBit();
        int i16 = 2 - (bit3 ? 1 : 0);
        int i17 = unsignedExpGolombCodedInt8 * i16;
        if (!bit3) {
            parsableNalUnitBitArray.skipBit();
        }
        parsableNalUnitBitArray.skipBit();
        int i18 = unsignedExpGolombCodedInt7 * 16;
        int i19 = i17 * 16;
        if (parsableNalUnitBitArray.readBit()) {
            int unsignedExpGolombCodedInt9 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt10 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt11 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt12 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            if (unsignedExpGolombCodedInt != 0) {
                int i20 = unsignedExpGolombCodedInt == 3 ? 1 : 2;
                i16 *= unsignedExpGolombCodedInt == 1 ? 2 : 1;
                i12 = i20;
            }
            i18 -= (unsignedExpGolombCodedInt9 + unsignedExpGolombCodedInt10) * i12;
            i19 -= (unsignedExpGolombCodedInt11 + unsignedExpGolombCodedInt12) * i16;
        }
        int i21 = i18;
        int i22 = i19;
        if (parsableNalUnitBitArray.readBit() && parsableNalUnitBitArray.readBit()) {
            int bits2 = parsableNalUnitBitArray.readBits(8);
            if (bits2 == 255) {
                int bits3 = parsableNalUnitBitArray.readBits(16);
                int bits4 = parsableNalUnitBitArray.readBits(16);
                if (bits3 == 0 || bits4 == 0) {
                    f10 = 1.0f;
                } else {
                    f10 = bits3 / bits4;
                }
            } else {
                float[] fArr = ASPECT_RATIO_IDC_VALUES;
                if (bits2 < fArr.length) {
                    f10 = fArr[bits2];
                } else {
                    Log.w(TAG, "Unexpected aspect_ratio_idc value: " + bits2);
                    f10 = 1.0f;
                }
            }
        } else {
            f10 = 1.0f;
        }
        return new SpsData(unsignedExpGolombCodedInt3, i21, i22, f10, z10, bit3, unsignedExpGolombCodedInt4, unsignedExpGolombCodedInt5, unsignedExpGolombCodedInt2, z11);
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
                int i16 = scratchEscapePositions[i15] - i13;
                System.arraycopy(bArr, i13, bArr, i14, i16);
                int i17 = i14 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i14 = i18 + 1;
                bArr[i18] = 0;
                i13 += i16 + 3;
            }
            System.arraycopy(bArr, i13, bArr, i14, i11 - i14);
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

    public static boolean isNalUnitSei(String str, byte b10) {
        if ("video/avc".equals(str) && (b10 & 31) == 6) {
            return true;
        }
        if ("video/hevc".equals(str) && ((b10 & 126) >> 1) == 39) {
            return true;
        }
        return false;
    }
}
