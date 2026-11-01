package io.bidmachine.media3.extractor;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.common.util.CodecSpecificDataUtil;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.container.NalUnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@UnstableApi
public final class AvcConfig {
    public final int bitdepthChroma;
    public final int bitdepthLuma;

    @Nullable
    public final String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int height;
    public final List<byte[]> initializationData;
    public final int maxNumReorderFrames;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int width;

    public static AvcConfig parse(ParsableByteArray parsableByteArray) throws ParserException {
        float f10;
        String strBuildAvcCodecString;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        try {
            parsableByteArray.skipBytes(4);
            int unsignedByte = (parsableByteArray.readUnsignedByte() & 3) + 1;
            if (unsignedByte == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int unsignedByte2 = parsableByteArray.readUnsignedByte() & 31;
            for (int i17 = 0; i17 < unsignedByte2; i17++) {
                arrayList.add(buildNalUnitForChild(parsableByteArray));
            }
            int unsignedByte3 = parsableByteArray.readUnsignedByte();
            for (int i18 = 0; i18 < unsignedByte3; i18++) {
                arrayList.add(buildNalUnitForChild(parsableByteArray));
            }
            int i19 = -1;
            if (unsignedByte2 > 0) {
                NalUnitUtil.SpsData spsNalUnit = NalUnitUtil.parseSpsNalUnit((byte[]) arrayList.get(0), unsignedByte, ((byte[]) arrayList.get(0)).length);
                int i20 = spsNalUnit.width;
                int i21 = spsNalUnit.height;
                int i22 = spsNalUnit.bitDepthLumaMinus8 + 8;
                int i23 = spsNalUnit.bitDepthChromaMinus8 + 8;
                int i24 = spsNalUnit.colorSpace;
                int i25 = spsNalUnit.colorRange;
                int i26 = spsNalUnit.colorTransfer;
                int i27 = spsNalUnit.maxNumReorderFrames;
                float f11 = spsNalUnit.pixelWidthHeightRatio;
                strBuildAvcCodecString = CodecSpecificDataUtil.buildAvcCodecString(spsNalUnit.profileIdc, spsNalUnit.constraintsFlagsAndReservedZero2Bits, spsNalUnit.levelIdc);
                i16 = i26;
                i10 = i27;
                f10 = f11;
                i13 = i23;
                i14 = i24;
                i15 = i25;
                i11 = i20;
                i19 = i21;
                i12 = i22;
            } else {
                f10 = 1.0f;
                strBuildAvcCodecString = null;
                i10 = 16;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = -1;
                i16 = -1;
            }
            return new AvcConfig(arrayList, unsignedByte, i11, i19, i12, i13, i14, i15, i16, i10, f10, strBuildAvcCodecString);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ParserException.createForMalformedContainer("Error parsing AVC config", e10);
        }
    }

    private AvcConfig(List<byte[]> list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, @Nullable String str) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i10;
        this.width = i11;
        this.height = i12;
        this.bitdepthLuma = i13;
        this.bitdepthChroma = i14;
        this.colorSpace = i15;
        this.colorRange = i16;
        this.colorTransfer = i17;
        this.maxNumReorderFrames = i18;
        this.pixelWidthHeightRatio = f10;
        this.codecs = str;
    }

    private static byte[] buildNalUnitForChild(ParsableByteArray parsableByteArray) {
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(unsignedShort);
        return CodecSpecificDataUtil.buildNalUnit(parsableByteArray.getData(), position, unsignedShort);
    }
}
