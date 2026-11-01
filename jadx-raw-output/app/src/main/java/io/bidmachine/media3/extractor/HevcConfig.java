package io.bidmachine.media3.extractor;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.common.util.CodecSpecificDataUtil;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.container.NalUnitUtil;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@UnstableApi
public final class HevcConfig {
    private static final int SPS_NAL_UNIT_TYPE = 33;
    public final int bitdepthChroma;
    public final int bitdepthLuma;

    @Nullable
    public final String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int height;
    public final List<byte[]> initializationData;
    public final int maxNumReorderPics;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int width;

    public static HevcConfig parse(ParsableByteArray parsableByteArray) throws ParserException {
        try {
            parsableByteArray.skipBytes(21);
            int unsignedByte = parsableByteArray.readUnsignedByte() & 3;
            int unsignedByte2 = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition();
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < unsignedByte2; i12++) {
                parsableByteArray.skipBytes(1);
                int unsignedShort = parsableByteArray.readUnsignedShort();
                for (int i13 = 0; i13 < unsignedShort; i13++) {
                    int unsignedShort2 = parsableByteArray.readUnsignedShort();
                    i11 += unsignedShort2 + 4;
                    parsableByteArray.skipBytes(unsignedShort2);
                }
            }
            parsableByteArray.setPosition(position);
            byte[] bArr = new byte[i11];
            float f10 = 1.0f;
            String strBuildHevcCodecString = null;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = 0;
            int i23 = 0;
            while (i22 < unsignedByte2) {
                int unsignedByte3 = parsableByteArray.readUnsignedByte() & 63;
                int unsignedShort3 = parsableByteArray.readUnsignedShort();
                int i24 = i10;
                while (i24 < unsignedShort3) {
                    int unsignedShort4 = parsableByteArray.readUnsignedShort();
                    byte[] bArr2 = NalUnitUtil.NAL_START_CODE;
                    int i25 = unsignedByte2;
                    System.arraycopy(bArr2, i10, bArr, i23, bArr2.length);
                    int length = i23 + bArr2.length;
                    System.arraycopy(parsableByteArray.getData(), parsableByteArray.getPosition(), bArr, length, unsignedShort4);
                    if (unsignedByte3 == 33 && i24 == 0) {
                        NalUnitUtil.H265SpsData h265SpsNalUnit = NalUnitUtil.parseH265SpsNalUnit(bArr, length, length + unsignedShort4);
                        int i26 = h265SpsNalUnit.width;
                        i15 = h265SpsNalUnit.height;
                        i16 = h265SpsNalUnit.bitDepthLumaMinus8 + 8;
                        i17 = h265SpsNalUnit.bitDepthChromaMinus8 + 8;
                        int i27 = h265SpsNalUnit.colorSpace;
                        int i28 = h265SpsNalUnit.colorRange;
                        int i29 = h265SpsNalUnit.colorTransfer;
                        float f11 = h265SpsNalUnit.pixelWidthHeightRatio;
                        int i30 = h265SpsNalUnit.maxNumReorderPics;
                        i14 = i26;
                        strBuildHevcCodecString = CodecSpecificDataUtil.buildHevcCodecString(h265SpsNalUnit.generalProfileSpace, h265SpsNalUnit.generalTierFlag, h265SpsNalUnit.generalProfileIdc, h265SpsNalUnit.generalProfileCompatibilityFlags, h265SpsNalUnit.constraintBytes, h265SpsNalUnit.generalLevelIdc);
                        i19 = i28;
                        i18 = i27;
                        i21 = i30;
                        f10 = f11;
                        i20 = i29;
                    }
                    i23 = length + unsignedShort4;
                    parsableByteArray.skipBytes(unsignedShort4);
                    i24++;
                    unsignedByte2 = i25;
                    unsignedByte3 = unsignedByte3;
                    unsignedShort3 = unsignedShort3;
                    i10 = 0;
                }
                i22++;
                i10 = 0;
            }
            return new HevcConfig(i11 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), unsignedByte + 1, i14, i15, i16, i17, i18, i19, i20, f10, i21, strBuildHevcCodecString);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ParserException.createForMalformedContainer("Error parsing HEVC config", e10);
        }
    }

    private HevcConfig(List<byte[]> list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, int i18, @Nullable String str) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i10;
        this.width = i11;
        this.height = i12;
        this.bitdepthLuma = i13;
        this.bitdepthChroma = i14;
        this.colorSpace = i15;
        this.colorRange = i16;
        this.colorTransfer = i17;
        this.pixelWidthHeightRatio = f10;
        this.maxNumReorderPics = i18;
        this.codecs = str;
    }
}
