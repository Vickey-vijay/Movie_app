package io.bidmachine.media3.extractor.ts;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.ColorInfo;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.CodecSpecificDataUtil;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.container.NalUnitUtil;
import io.bidmachine.media3.container.ParsableNalUnitBitArray;
import io.bidmachine.media3.extractor.ExtractorOutput;
import io.bidmachine.media3.extractor.TrackOutput;
import java.util.ArrayList;
import java.util.Arrays;
import ph.d;

/* JADX INFO: loaded from: classes7.dex */
@UnstableApi
public final class H264Reader implements ElementaryStreamReader {
    private final boolean allowNonIdrKeyframes;
    private final boolean detectAccessUnits;
    private String formatId;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private boolean randomAccessIndicator;
    private b sampleReader;
    private final SeiReader seiReader;
    private long totalBytesWritten;
    private final boolean[] prefixFlags = new boolean[3];
    private final d sps = new d(7, 128);
    private final d pps = new d(8, 128);
    private final d sei = new d(6, 128);
    private long pesTimeUs = -9223372036854775807L;
    private final ParsableByteArray seiWrapper = new ParsableByteArray();

    public static final class b {
        private static final int DEFAULT_BUFFER_SIZE = 128;
        private final boolean allowNonIdrKeyframes;
        private final ParsableNalUnitBitArray bitArray;
        private byte[] buffer;
        private int bufferLength;
        private final boolean detectAccessUnits;
        private boolean isFilling;
        private long nalUnitStartPosition;
        private long nalUnitTimeUs;
        private int nalUnitType;
        private final TrackOutput output;
        private a previousSliceHeader;
        private boolean randomAccessIndicator;
        private boolean readingSample;
        private boolean sampleIsKeyframe;
        private long samplePosition;
        private long sampleTimeUs;
        private a sliceHeader;
        private final SparseArray<NalUnitUtil.SpsData> sps = new SparseArray<>();
        private final SparseArray<NalUnitUtil.PpsData> pps = new SparseArray<>();

        public static final class a {
            private static final int SLICE_TYPE_ALL_I = 7;
            private static final int SLICE_TYPE_I = 2;
            private boolean bottomFieldFlag;
            private boolean bottomFieldFlagPresent;
            private int deltaPicOrderCnt0;
            private int deltaPicOrderCnt1;
            private int deltaPicOrderCntBottom;
            private boolean fieldPicFlag;
            private int frameNum;
            private boolean hasSliceType;
            private boolean idrPicFlag;
            private int idrPicId;
            private boolean isComplete;
            private int nalRefIdc;
            private int picOrderCntLsb;
            private int picParameterSetId;
            private int sliceType;

            @Nullable
            private NalUnitUtil.SpsData spsData;

            private a() {
            }

            public void clear() {
                this.hasSliceType = false;
                this.isComplete = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean isFirstVclNalUnitOfPicture(a aVar) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (!this.isComplete) {
                    return false;
                }
                if (!aVar.isComplete) {
                    return true;
                }
                NalUnitUtil.SpsData spsData = (NalUnitUtil.SpsData) Assertions.checkStateNotNull(this.spsData);
                NalUnitUtil.SpsData spsData2 = (NalUnitUtil.SpsData) Assertions.checkStateNotNull(aVar.spsData);
                return (this.frameNum == aVar.frameNum && this.picParameterSetId == aVar.picParameterSetId && this.fieldPicFlag == aVar.fieldPicFlag && (!this.bottomFieldFlagPresent || !aVar.bottomFieldFlagPresent || this.bottomFieldFlag == aVar.bottomFieldFlag) && (((i10 = this.nalRefIdc) == (i11 = aVar.nalRefIdc) || (i10 != 0 && i11 != 0)) && (((i12 = spsData.picOrderCountType) != 0 || spsData2.picOrderCountType != 0 || (this.picOrderCntLsb == aVar.picOrderCntLsb && this.deltaPicOrderCntBottom == aVar.deltaPicOrderCntBottom)) && ((i12 != 1 || spsData2.picOrderCountType != 1 || (this.deltaPicOrderCnt0 == aVar.deltaPicOrderCnt0 && this.deltaPicOrderCnt1 == aVar.deltaPicOrderCnt1)) && (z10 = this.idrPicFlag) == aVar.idrPicFlag && (!z10 || this.idrPicId == aVar.idrPicId))))) ? false : true;
            }

            public boolean isISlice() {
                int i10;
                return this.hasSliceType && ((i10 = this.sliceType) == 7 || i10 == 2);
            }

            public void setAll(NalUnitUtil.SpsData spsData, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.spsData = spsData;
                this.nalRefIdc = i10;
                this.sliceType = i11;
                this.frameNum = i12;
                this.picParameterSetId = i13;
                this.fieldPicFlag = z10;
                this.bottomFieldFlagPresent = z11;
                this.bottomFieldFlag = z12;
                this.idrPicFlag = z13;
                this.idrPicId = i14;
                this.picOrderCntLsb = i15;
                this.deltaPicOrderCntBottom = i16;
                this.deltaPicOrderCnt0 = i17;
                this.deltaPicOrderCnt1 = i18;
                this.isComplete = true;
                this.hasSliceType = true;
            }

            public void setSliceType(int i10) {
                this.sliceType = i10;
                this.hasSliceType = true;
            }
        }

        public void reset() {
            this.isFilling = false;
            this.readingSample = false;
            this.sliceHeader.clear();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        private void outputSample(int i10) {
            long j10 = this.sampleTimeUs;
            if (j10 == -9223372036854775807L) {
                return;
            }
            boolean z10 = this.sampleIsKeyframe;
            this.output.sampleMetadata(j10, z10 ? 1 : 0, (int) (this.nalUnitStartPosition - this.samplePosition), i10, null);
        }

        private void setSampleIsKeyframe() {
            boolean zIsISlice = this.allowNonIdrKeyframes ? this.sliceHeader.isISlice() : this.randomAccessIndicator;
            boolean z10 = this.sampleIsKeyframe;
            int i10 = this.nalUnitType;
            boolean z11 = true;
            if (i10 != 5 && (!zIsISlice || i10 != 1)) {
                z11 = false;
            }
            this.sampleIsKeyframe = z10 | z11;
        }

        /* JADX WARN: Code duplicated, block: B:53:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:54:0x0102  */
        /* JADX WARN: Code duplicated, block: B:56:0x0106  */
        /* JADX WARN: Code duplicated, block: B:58:0x010e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:59:0x010f  */
        /* JADX WARN: Code duplicated, block: B:60:0x0118  */
        /* JADX WARN: Code duplicated, block: B:63:0x011e  */
        /* JADX WARN: Code duplicated, block: B:65:0x0128 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:66:0x0129  */
        /* JADX WARN: Code duplicated, block: B:74:0x0152  */
        public void appendToNalUnit(byte[] bArr, int i10, int i11) {
            boolean z10;
            boolean z11;
            boolean bit;
            boolean z12;
            int unsignedExpGolombCodedInt;
            int i12;
            int i13;
            int signedExpGolombCodedInt;
            int i14;
            int signedExpGolombCodedInt2;
            int bits;
            if (this.isFilling) {
                int i15 = i11 - i10;
                byte[] bArr2 = this.buffer;
                int length = bArr2.length;
                int i16 = this.bufferLength;
                if (length < i16 + i15) {
                    this.buffer = Arrays.copyOf(bArr2, (i16 + i15) * 2);
                }
                System.arraycopy(bArr, i10, this.buffer, this.bufferLength, i15);
                int i17 = this.bufferLength + i15;
                this.bufferLength = i17;
                this.bitArray.reset(this.buffer, 0, i17);
                if (this.bitArray.canReadBits(8)) {
                    this.bitArray.skipBit();
                    int bits2 = this.bitArray.readBits(2);
                    this.bitArray.skipBits(5);
                    if (this.bitArray.canReadExpGolombCodedNum()) {
                        this.bitArray.readUnsignedExpGolombCodedInt();
                        if (this.bitArray.canReadExpGolombCodedNum()) {
                            int unsignedExpGolombCodedInt2 = this.bitArray.readUnsignedExpGolombCodedInt();
                            if (!this.detectAccessUnits) {
                                this.isFilling = false;
                                this.sliceHeader.setSliceType(unsignedExpGolombCodedInt2);
                                return;
                            }
                            if (this.bitArray.canReadExpGolombCodedNum()) {
                                int unsignedExpGolombCodedInt3 = this.bitArray.readUnsignedExpGolombCodedInt();
                                if (this.pps.indexOfKey(unsignedExpGolombCodedInt3) < 0) {
                                    this.isFilling = false;
                                    return;
                                }
                                NalUnitUtil.PpsData ppsData = this.pps.get(unsignedExpGolombCodedInt3);
                                NalUnitUtil.SpsData spsData = this.sps.get(ppsData.seqParameterSetId);
                                if (spsData.separateColorPlaneFlag) {
                                    if (!this.bitArray.canReadBits(2)) {
                                        return;
                                    } else {
                                        this.bitArray.skipBits(2);
                                    }
                                }
                                if (this.bitArray.canReadBits(spsData.frameNumLength)) {
                                    int bits3 = this.bitArray.readBits(spsData.frameNumLength);
                                    if (!spsData.frameMbsOnlyFlag) {
                                        if (this.bitArray.canReadBits(1)) {
                                            boolean bit2 = this.bitArray.readBit();
                                            if (!bit2) {
                                                z10 = bit2;
                                                z11 = false;
                                            } else {
                                                if (!this.bitArray.canReadBits(1)) {
                                                    return;
                                                }
                                                z10 = bit2;
                                                z11 = true;
                                                bit = this.bitArray.readBit();
                                            }
                                            if (this.nalUnitType == 5) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (z12) {
                                                unsignedExpGolombCodedInt = 0;
                                            } else if (!this.bitArray.canReadExpGolombCodedNum()) {
                                                return;
                                            } else {
                                                unsignedExpGolombCodedInt = this.bitArray.readUnsignedExpGolombCodedInt();
                                            }
                                            i12 = spsData.picOrderCountType;
                                            if (i12 != 0) {
                                                if (this.bitArray.canReadBits(spsData.picOrderCntLsbLength)) {
                                                    bits = this.bitArray.readBits(spsData.picOrderCntLsbLength);
                                                    if (ppsData.bottomFieldPicOrderInFramePresentFlag || z10) {
                                                        i13 = bits;
                                                        signedExpGolombCodedInt = 0;
                                                    } else {
                                                        if (!this.bitArray.canReadExpGolombCodedNum()) {
                                                            return;
                                                        }
                                                        signedExpGolombCodedInt = this.bitArray.readSignedExpGolombCodedInt();
                                                        i13 = bits;
                                                        i14 = 0;
                                                    }
                                                    signedExpGolombCodedInt2 = i14;
                                                    this.sliceHeader.setAll(spsData, bits2, unsignedExpGolombCodedInt2, bits3, unsignedExpGolombCodedInt3, z10, z11, bit, z12, unsignedExpGolombCodedInt, i13, signedExpGolombCodedInt, i14, signedExpGolombCodedInt2);
                                                    this.isFilling = false;
                                                }
                                                return;
                                            }
                                            if (i12 == 1 || spsData.deltaPicOrderAlwaysZeroFlag) {
                                                i13 = 0;
                                                signedExpGolombCodedInt = 0;
                                            } else {
                                                if (!this.bitArray.canReadExpGolombCodedNum()) {
                                                    return;
                                                }
                                                int signedExpGolombCodedInt3 = this.bitArray.readSignedExpGolombCodedInt();
                                                if (!ppsData.bottomFieldPicOrderInFramePresentFlag || z10) {
                                                    i14 = signedExpGolombCodedInt3;
                                                    i13 = 0;
                                                    signedExpGolombCodedInt = 0;
                                                    signedExpGolombCodedInt2 = 0;
                                                } else {
                                                    if (!this.bitArray.canReadExpGolombCodedNum()) {
                                                        return;
                                                    }
                                                    signedExpGolombCodedInt2 = this.bitArray.readSignedExpGolombCodedInt();
                                                    i14 = signedExpGolombCodedInt3;
                                                    i13 = 0;
                                                    signedExpGolombCodedInt = 0;
                                                }
                                            }
                                            this.sliceHeader.setAll(spsData, bits2, unsignedExpGolombCodedInt2, bits3, unsignedExpGolombCodedInt3, z10, z11, bit, z12, unsignedExpGolombCodedInt, i13, signedExpGolombCodedInt, i14, signedExpGolombCodedInt2);
                                            this.isFilling = false;
                                            i14 = signedExpGolombCodedInt;
                                            signedExpGolombCodedInt2 = i14;
                                            this.sliceHeader.setAll(spsData, bits2, unsignedExpGolombCodedInt2, bits3, unsignedExpGolombCodedInt3, z10, z11, bit, z12, unsignedExpGolombCodedInt, i13, signedExpGolombCodedInt, i14, signedExpGolombCodedInt2);
                                            this.isFilling = false;
                                        }
                                        return;
                                    }
                                    z10 = false;
                                    z11 = false;
                                    bit = z11;
                                    if (this.nalUnitType == 5) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        unsignedExpGolombCodedInt = 0;
                                    } else if (!this.bitArray.canReadExpGolombCodedNum()) {
                                        return;
                                    } else {
                                        unsignedExpGolombCodedInt = this.bitArray.readUnsignedExpGolombCodedInt();
                                    }
                                    i12 = spsData.picOrderCountType;
                                    if (i12 != 0) {
                                        if (i12 == 1) {
                                        }
                                        i13 = 0;
                                        signedExpGolombCodedInt = 0;
                                    } else {
                                        if (this.bitArray.canReadBits(spsData.picOrderCntLsbLength)) {
                                            return;
                                        }
                                        bits = this.bitArray.readBits(spsData.picOrderCntLsbLength);
                                        if (ppsData.bottomFieldPicOrderInFramePresentFlag) {
                                        }
                                        i13 = bits;
                                        signedExpGolombCodedInt = 0;
                                    }
                                    i14 = signedExpGolombCodedInt;
                                    signedExpGolombCodedInt2 = i14;
                                    this.sliceHeader.setAll(spsData, bits2, unsignedExpGolombCodedInt2, bits3, unsignedExpGolombCodedInt3, z10, z11, bit, z12, unsignedExpGolombCodedInt, i13, signedExpGolombCodedInt, i14, signedExpGolombCodedInt2);
                                    this.isFilling = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        public boolean endNalUnit(long j10, int i10, boolean z10) {
            if (this.nalUnitType == 9 || (this.detectAccessUnits && this.sliceHeader.isFirstVclNalUnitOfPicture(this.previousSliceHeader))) {
                if (z10 && this.readingSample) {
                    outputSample(i10 + ((int) (j10 - this.nalUnitStartPosition)));
                }
                this.samplePosition = this.nalUnitStartPosition;
                this.sampleTimeUs = this.nalUnitTimeUs;
                this.sampleIsKeyframe = false;
                this.readingSample = true;
            }
            setSampleIsKeyframe();
            return this.sampleIsKeyframe;
        }

        public boolean needsSpsPps() {
            return this.detectAccessUnits;
        }

        public void putPps(NalUnitUtil.PpsData ppsData) {
            this.pps.append(ppsData.picParameterSetId, ppsData);
        }

        public void putSps(NalUnitUtil.SpsData spsData) {
            this.sps.append(spsData.seqParameterSetId, spsData);
        }

        public void startNalUnit(long j10, int i10, long j11, boolean z10) {
            this.nalUnitType = i10;
            this.nalUnitTimeUs = j11;
            this.nalUnitStartPosition = j10;
            this.randomAccessIndicator = z10;
            if (!this.allowNonIdrKeyframes || i10 != 1) {
                if (!this.detectAccessUnits) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            a aVar = this.previousSliceHeader;
            this.previousSliceHeader = this.sliceHeader;
            this.sliceHeader = aVar;
            aVar.clear();
            this.bufferLength = 0;
            this.isFilling = true;
        }

        public b(TrackOutput trackOutput, boolean z10, boolean z11) {
            this.output = trackOutput;
            this.allowNonIdrKeyframes = z10;
            this.detectAccessUnits = z11;
            this.previousSliceHeader = new a();
            this.sliceHeader = new a();
            byte[] bArr = new byte[128];
            this.buffer = bArr;
            this.bitArray = new ParsableNalUnitBitArray(bArr, 0, 0);
            reset();
        }

        public void end(long j10) {
            setSampleIsKeyframe();
            this.nalUnitStartPosition = j10;
            outputSample(0);
            this.readingSample = false;
        }
    }

    private void assertTracksCreated() {
        Assertions.checkStateNotNull(this.output);
        Util.castNonNull(this.sampleReader);
    }

    private void endNalUnit(long j10, int i10, int i11, long j11) {
        if (!this.hasOutputFormat || this.sampleReader.needsSpsPps()) {
            this.sps.endNalUnit(i11);
            this.pps.endNalUnit(i11);
            if (this.hasOutputFormat) {
                if (this.sps.isCompleted()) {
                    d dVar = this.sps;
                    this.sampleReader.putSps(NalUnitUtil.parseSpsNalUnit(dVar.nalData, 3, dVar.nalLength));
                    this.sps.reset();
                } else if (this.pps.isCompleted()) {
                    d dVar2 = this.pps;
                    this.sampleReader.putPps(NalUnitUtil.parsePpsNalUnit(dVar2.nalData, 3, dVar2.nalLength));
                    this.pps.reset();
                }
            } else if (this.sps.isCompleted() && this.pps.isCompleted()) {
                ArrayList arrayList = new ArrayList();
                d dVar3 = this.sps;
                arrayList.add(Arrays.copyOf(dVar3.nalData, dVar3.nalLength));
                d dVar4 = this.pps;
                arrayList.add(Arrays.copyOf(dVar4.nalData, dVar4.nalLength));
                d dVar5 = this.sps;
                NalUnitUtil.SpsData spsNalUnit = NalUnitUtil.parseSpsNalUnit(dVar5.nalData, 3, dVar5.nalLength);
                d dVar6 = this.pps;
                NalUnitUtil.PpsData ppsNalUnit = NalUnitUtil.parsePpsNalUnit(dVar6.nalData, 3, dVar6.nalLength);
                this.output.format(new Format.Builder().setId(this.formatId).setSampleMimeType("video/avc").setCodecs(CodecSpecificDataUtil.buildAvcCodecString(spsNalUnit.profileIdc, spsNalUnit.constraintsFlagsAndReservedZero2Bits, spsNalUnit.levelIdc)).setWidth(spsNalUnit.width).setHeight(spsNalUnit.height).setColorInfo(new ColorInfo.Builder().setColorSpace(spsNalUnit.colorSpace).setColorRange(spsNalUnit.colorRange).setColorTransfer(spsNalUnit.colorTransfer).setLumaBitdepth(spsNalUnit.bitDepthLumaMinus8 + 8).setChromaBitdepth(spsNalUnit.bitDepthChromaMinus8 + 8).build()).setPixelWidthHeightRatio(spsNalUnit.pixelWidthHeightRatio).setInitializationData(arrayList).setMaxNumReorderSamples(spsNalUnit.maxNumReorderFrames).build());
                this.hasOutputFormat = true;
                this.sampleReader.putSps(spsNalUnit);
                this.sampleReader.putPps(ppsNalUnit);
                this.sps.reset();
                this.pps.reset();
            }
        }
        if (this.sei.endNalUnit(i11)) {
            d dVar7 = this.sei;
            this.seiWrapper.reset(this.sei.nalData, NalUnitUtil.unescapeStream(dVar7.nalData, dVar7.nalLength));
            this.seiWrapper.setPosition(4);
            this.seiReader.consume(j11, this.seiWrapper);
        }
        if (this.sampleReader.endNalUnit(j10, i10, this.hasOutputFormat)) {
            this.randomAccessIndicator = false;
        }
    }

    private void nalUnitData(byte[] bArr, int i10, int i11) {
        if (!this.hasOutputFormat || this.sampleReader.needsSpsPps()) {
            this.sps.appendToNalUnit(bArr, i10, i11);
            this.pps.appendToNalUnit(bArr, i10, i11);
        }
        this.sei.appendToNalUnit(bArr, i10, i11);
        this.sampleReader.appendToNalUnit(bArr, i10, i11);
    }

    private void startNalUnit(long j10, int i10, long j11) {
        if (!this.hasOutputFormat || this.sampleReader.needsSpsPps()) {
            this.sps.startNalUnit(i10);
            this.pps.startNalUnit(i10);
        }
        this.sei.startNalUnit(i10);
        this.sampleReader.startNalUnit(j10, i10, j11, this.randomAccessIndicator);
    }

    @Override // io.bidmachine.media3.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j10, int i10) {
        this.pesTimeUs = j10;
        this.randomAccessIndicator |= (i10 & 2) != 0;
    }

    @Override // io.bidmachine.media3.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.totalBytesWritten = 0L;
        this.randomAccessIndicator = false;
        this.pesTimeUs = -9223372036854775807L;
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.sps.reset();
        this.pps.reset();
        this.sei.reset();
        b bVar = this.sampleReader;
        if (bVar != null) {
            bVar.reset();
        }
    }

    public H264Reader(SeiReader seiReader, boolean z10, boolean z11) {
        this.seiReader = seiReader;
        this.allowNonIdrKeyframes = z10;
        this.detectAccessUnits = z11;
    }

    @Override // io.bidmachine.media3.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        int i10;
        assertTracksCreated();
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        this.totalBytesWritten += (long) parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
        while (true) {
            int iFindNalUnit = NalUnitUtil.findNalUnit(data, position, iLimit, this.prefixFlags);
            if (iFindNalUnit == iLimit) {
                nalUnitData(data, position, iLimit);
                return;
            }
            int nalUnitType = NalUnitUtil.getNalUnitType(data, iFindNalUnit);
            int i11 = iFindNalUnit - position;
            if (i11 > 0) {
                nalUnitData(data, position, iFindNalUnit);
            }
            int i12 = iLimit - iFindNalUnit;
            long j10 = this.totalBytesWritten - ((long) i12);
            if (i11 < 0) {
                i10 = -i11;
            } else {
                i10 = 0;
            }
            endNalUnit(j10, i12, i10, this.pesTimeUs);
            startNalUnit(j10, nalUnitType, this.pesTimeUs);
            position = iFindNalUnit + 3;
        }
    }

    @Override // io.bidmachine.media3.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        this.output = trackOutputTrack;
        this.sampleReader = new b(trackOutputTrack, this.allowNonIdrKeyframes, this.detectAccessUnits);
        this.seiReader.createTracks(extractorOutput, trackIdGenerator);
    }

    @Override // io.bidmachine.media3.extractor.ts.ElementaryStreamReader
    public void packetFinished(boolean z10) {
        assertTracksCreated();
        if (z10) {
            this.sampleReader.end(this.totalBytesWritten);
        }
    }
}
