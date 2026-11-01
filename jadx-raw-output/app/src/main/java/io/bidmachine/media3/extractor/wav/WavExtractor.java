package io.bidmachine.media3.extractor.wav;

import android.util.Pair;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import io.bidmachine.media3.common.DataReader;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.extractor.Extractor;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.ExtractorOutput;
import io.bidmachine.media3.extractor.ExtractorsFactory;
import io.bidmachine.media3.extractor.PositionHolder;
import io.bidmachine.media3.extractor.TrackOutput;
import io.bidmachine.media3.extractor.WavUtil;
import io.bidmachine.media3.extractor.wav.WavExtractor;
import java.io.IOException;
import java.util.List;
import qh.d;

/* JADX INFO: loaded from: classes11.dex */
@UnstableApi
public final class WavExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: qh.a
        @Override // io.bidmachine.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return WavExtractor.lambda$static$0();
        }
    };
    private static final int STATE_READING_FILE_TYPE = 0;
    private static final int STATE_READING_FORMAT = 2;
    private static final int STATE_READING_RF64_SAMPLE_DATA_SIZE = 1;
    private static final int STATE_READING_SAMPLE_DATA = 4;
    private static final int STATE_SKIPPING_TO_SAMPLE_DATA = 3;
    private static final String TAG = "WavExtractor";
    private static final int TARGET_SAMPLES_PER_SECOND = 10;
    private ExtractorOutput extractorOutput;
    private b outputWriter;
    private TrackOutput trackOutput;
    private int state = 0;
    private long rf64SampleDataSize = -1;
    private int dataStartPosition = -1;
    private long dataEndPosition = -1;

    public static final class a implements b {
        private static final int[] INDEX_TABLE = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        private static final int[] STEP_TABLE = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
        private final ParsableByteArray decodedData;
        private final ExtractorOutput extractorOutput;
        private final Format format;
        private final int framesPerBlock;
        private final byte[] inputData;
        private long outputFrameCount;
        private int pendingInputBytes;
        private int pendingOutputBytes;
        private long startTimeUs;
        private final int targetSampleSizeFrames;
        private final TrackOutput trackOutput;
        private final qh.b wavFormat;

        private void decode(byte[] bArr, int i10, ParsableByteArray parsableByteArray) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.wavFormat.numChannels; i12++) {
                    decodeBlockForChannel(bArr, i11, i12, parsableByteArray.getData());
                }
            }
            int iNumOutputFramesToBytes = numOutputFramesToBytes(this.framesPerBlock * i10);
            parsableByteArray.setPosition(0);
            parsableByteArray.setLimit(iNumOutputFramesToBytes);
        }

        private static int numOutputFramesToBytes(int i10, int i11) {
            return i10 * 2 * i11;
        }

        @Override // io.bidmachine.media3.extractor.wav.WavExtractor.b
        public void reset(long j10) {
            this.pendingInputBytes = 0;
            this.startTimeUs = j10;
            this.pendingOutputBytes = 0;
            this.outputFrameCount = 0L;
        }

        private void decodeBlockForChannel(byte[] bArr, int i10, int i11, byte[] bArr2) {
            qh.b bVar = this.wavFormat;
            int i12 = bVar.blockSize;
            int i13 = bVar.numChannels;
            int i14 = (i10 * i12) + (i11 * 4);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int iConstrainValue = (short) (((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255));
            int iMin = Math.min(bArr[i14 + 2] & 255, 88);
            int i17 = STEP_TABLE[iMin];
            int i18 = ((i10 * this.framesPerBlock * i13) + i11) * 2;
            bArr2[i18] = (byte) (iConstrainValue & 255);
            bArr2[i18 + 1] = (byte) (iConstrainValue >> 8);
            for (int i19 = 0; i19 < i16 * 2; i19++) {
                int i20 = bArr[((i19 / 8) * i13 * 4) + i15 + ((i19 / 2) % 4)] & 255;
                int i21 = i19 % 2 == 0 ? i20 & 15 : i20 >> 4;
                int i22 = ((((i21 & 7) * 2) + 1) * i17) >> 3;
                if ((i21 & 8) != 0) {
                    i22 = -i22;
                }
                iConstrainValue = Util.constrainValue(iConstrainValue + i22, -32768, 32767);
                i18 += i13 * 2;
                bArr2[i18] = (byte) (iConstrainValue & 255);
                bArr2[i18 + 1] = (byte) (iConstrainValue >> 8);
                int i23 = iMin + INDEX_TABLE[i21];
                int[] iArr = STEP_TABLE;
                iMin = Util.constrainValue(i23, 0, iArr.length - 1);
                i17 = iArr[iMin];
            }
        }

        private int numOutputBytesToFrames(int i10) {
            return i10 / (this.wavFormat.numChannels * 2);
        }

        private int numOutputFramesToBytes(int i10) {
            return numOutputFramesToBytes(i10, this.wavFormat.numChannels);
        }

        private void writeSampleMetadata(int i10) {
            long jScaleLargeTimestamp = this.startTimeUs + Util.scaleLargeTimestamp(this.outputFrameCount, 1000000L, this.wavFormat.frameRateHz);
            int iNumOutputFramesToBytes = numOutputFramesToBytes(i10);
            this.trackOutput.sampleMetadata(jScaleLargeTimestamp, 1, iNumOutputFramesToBytes, this.pendingOutputBytes - iNumOutputFramesToBytes, null);
            this.outputFrameCount += (long) i10;
            this.pendingOutputBytes -= iNumOutputFramesToBytes;
        }

        @Override // io.bidmachine.media3.extractor.wav.WavExtractor.b
        public void init(int i10, long j10) {
            this.extractorOutput.seekMap(new d(this.wavFormat, this.framesPerBlock, i10, j10));
            this.trackOutput.format(this.format);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0038 A[LOOP:0: B:6:0x001e->B:12:0x0038, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:23:0x003e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:25:0x001b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0020  */
        /* JADX WARN: Code duplicated, block: B:9:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // io.bidmachine.media3.extractor.wav.WavExtractor.b
        public boolean sampleData(io.bidmachine.media3.extractor.ExtractorInput r7, long r8) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.targetSampleSizeFrames
                int r1 = r6.pendingOutputBytes
                int r1 = r6.numOutputBytesToFrames(r1)
                int r0 = r0 - r1
                int r1 = r6.framesPerBlock
                int r0 = io.bidmachine.media3.common.util.Util.ceilDivide(r0, r1)
                qh.b r1 = r6.wavFormat
                int r1 = r1.blockSize
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.pendingInputBytes
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.inputData
                int r5 = r6.pendingInputBytes
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.pendingInputBytes
                int r4 = r4 + r3
                r6.pendingInputBytes = r4
                goto L1e
            L3e:
                int r7 = r6.pendingInputBytes
                qh.b r8 = r6.wavFormat
                int r8 = r8.blockSize
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.inputData
                io.bidmachine.media3.common.util.ParsableByteArray r9 = r6.decodedData
                r6.decode(r8, r7, r9)
                int r8 = r6.pendingInputBytes
                qh.b r9 = r6.wavFormat
                int r9 = r9.blockSize
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.pendingInputBytes = r8
                io.bidmachine.media3.common.util.ParsableByteArray r7 = r6.decodedData
                int r7 = r7.limit()
                io.bidmachine.media3.extractor.TrackOutput r8 = r6.trackOutput
                io.bidmachine.media3.common.util.ParsableByteArray r9 = r6.decodedData
                r8.sampleData(r9, r7)
                int r8 = r6.pendingOutputBytes
                int r8 = r8 + r7
                r6.pendingOutputBytes = r8
                int r7 = r6.numOutputBytesToFrames(r8)
                int r8 = r6.targetSampleSizeFrames
                if (r7 < r8) goto L75
                r6.writeSampleMetadata(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.pendingOutputBytes
                int r7 = r6.numOutputBytesToFrames(r7)
                if (r7 <= 0) goto L82
                r6.writeSampleMetadata(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.extractor.wav.WavExtractor.a.sampleData(io.bidmachine.media3.extractor.ExtractorInput, long):boolean");
        }

        public a(ExtractorOutput extractorOutput, TrackOutput trackOutput, qh.b bVar) throws ParserException {
            this.extractorOutput = extractorOutput;
            this.trackOutput = trackOutput;
            this.wavFormat = bVar;
            int iMax = Math.max(1, bVar.frameRateHz / 10);
            this.targetSampleSizeFrames = iMax;
            ParsableByteArray parsableByteArray = new ParsableByteArray(bVar.extraData);
            parsableByteArray.readLittleEndianUnsignedShort();
            int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
            this.framesPerBlock = littleEndianUnsignedShort;
            int i10 = bVar.numChannels;
            int i11 = (((bVar.blockSize - (i10 * 4)) * 8) / (bVar.bitsPerSample * i10)) + 1;
            if (littleEndianUnsignedShort == i11) {
                int iCeilDivide = Util.ceilDivide(iMax, littleEndianUnsignedShort);
                this.inputData = new byte[bVar.blockSize * iCeilDivide];
                this.decodedData = new ParsableByteArray(iCeilDivide * numOutputFramesToBytes(littleEndianUnsignedShort, i10));
                int i12 = ((bVar.frameRateHz * bVar.blockSize) * 8) / littleEndianUnsignedShort;
                this.format = new Format.Builder().setSampleMimeType("audio/raw").setAverageBitrate(i12).setPeakBitrate(i12).setMaxInputSize(numOutputFramesToBytes(iMax, i10)).setChannelCount(bVar.numChannels).setSampleRate(bVar.frameRateHz).setPcmEncoding(2).build();
                return;
            }
            throw ParserException.createForMalformedContainer("Expected frames per block: " + i11 + "; got: " + littleEndianUnsignedShort, null);
        }
    }

    public interface b {
        void init(int i10, long j10) throws ParserException;

        void reset(long j10);

        boolean sampleData(ExtractorInput extractorInput, long j10) throws IOException;
    }

    public static final class c implements b {
        private final ExtractorOutput extractorOutput;
        private final Format format;
        private long outputFrameCount;
        private int pendingOutputBytes;
        private long startTimeUs;
        private final int targetSampleSizeBytes;
        private final TrackOutput trackOutput;
        private final qh.b wavFormat;

        @Override // io.bidmachine.media3.extractor.wav.WavExtractor.b
        public void init(int i10, long j10) {
            this.extractorOutput.seekMap(new d(this.wavFormat, 1, i10, j10));
            this.trackOutput.format(this.format);
        }

        @Override // io.bidmachine.media3.extractor.wav.WavExtractor.b
        public void reset(long j10) {
            this.startTimeUs = j10;
            this.pendingOutputBytes = 0;
            this.outputFrameCount = 0L;
        }

        @Override // io.bidmachine.media3.extractor.wav.WavExtractor.b
        public boolean sampleData(ExtractorInput extractorInput, long j10) throws IOException {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.pendingOutputBytes) < (i11 = this.targetSampleSizeBytes)) {
                int iSampleData = this.trackOutput.sampleData((DataReader) extractorInput, (int) Math.min(i11 - i10, j11), true);
                if (iSampleData == -1) {
                    j11 = 0;
                } else {
                    this.pendingOutputBytes += iSampleData;
                    j11 -= (long) iSampleData;
                }
            }
            qh.b bVar = this.wavFormat;
            int i12 = bVar.blockSize;
            int i13 = this.pendingOutputBytes / i12;
            if (i13 > 0) {
                long jScaleLargeTimestamp = this.startTimeUs + Util.scaleLargeTimestamp(this.outputFrameCount, 1000000L, bVar.frameRateHz);
                int i14 = i13 * i12;
                int i15 = this.pendingOutputBytes - i14;
                this.trackOutput.sampleMetadata(jScaleLargeTimestamp, 1, i14, i15, null);
                this.outputFrameCount += (long) i13;
                this.pendingOutputBytes = i15;
            }
            return j11 <= 0;
        }

        public c(ExtractorOutput extractorOutput, TrackOutput trackOutput, qh.b bVar, String str, int i10) throws ParserException {
            this.extractorOutput = extractorOutput;
            this.trackOutput = trackOutput;
            this.wavFormat = bVar;
            int i11 = (bVar.numChannels * bVar.bitsPerSample) / 8;
            if (bVar.blockSize == i11) {
                int i12 = bVar.frameRateHz;
                int i13 = i12 * i11 * 8;
                int iMax = Math.max(i11, (i12 * i11) / 10);
                this.targetSampleSizeBytes = iMax;
                this.format = new Format.Builder().setSampleMimeType(str).setAverageBitrate(i13).setPeakBitrate(i13).setMaxInputSize(iMax).setChannelCount(bVar.numChannels).setSampleRate(bVar.frameRateHz).setPcmEncoding(i10).build();
                return;
            }
            throw ParserException.createForMalformedContainer("Expected block size: " + i11 + "; got: " + bVar.blockSize, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new WavExtractor()};
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public /* bridge */ /* synthetic */ List getSniffFailureDetails() {
        return super.getSniffFailureDetails();
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public /* bridge */ /* synthetic */ Extractor getUnderlyingImplementation() {
        return super.getUnderlyingImplementation();
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public void release() {
    }

    private void assertInitialized() {
        Assertions.checkStateNotNull(this.trackOutput);
        Util.castNonNull(this.extractorOutput);
    }

    private int readSampleData(ExtractorInput extractorInput) throws IOException {
        Assertions.checkState(this.dataEndPosition != -1);
        return ((b) Assertions.checkNotNull(this.outputWriter)).sampleData(extractorInput, this.dataEndPosition - extractorInput.getPosition()) ? -1 : 0;
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        this.trackOutput = extractorOutput.track(0, 1);
        extractorOutput.endTracks();
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public void seek(long j10, long j11) {
        this.state = j10 == 0 ? 0 : 4;
        b bVar = this.outputWriter;
        if (bVar != null) {
            bVar.reset(j11);
        }
    }

    private void readFileType(ExtractorInput extractorInput) throws IOException {
        boolean z10;
        if (extractorInput.getPosition() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkState(z10);
        int i10 = this.dataStartPosition;
        if (i10 != -1) {
            extractorInput.skipFully(i10);
            this.state = 4;
        } else {
            if (qh.c.checkFileType(extractorInput)) {
                extractorInput.skipFully((int) (extractorInput.getPeekPosition() - extractorInput.getPosition()));
                this.state = 1;
                return;
            }
            throw ParserException.createForMalformedContainer("Unsupported or unrecognized wav file type.", null);
        }
    }

    private void readFormat(ExtractorInput extractorInput) throws IOException {
        qh.b format = qh.c.readFormat(extractorInput);
        int i10 = format.formatType;
        if (i10 == 17) {
            this.outputWriter = new a(this.extractorOutput, this.trackOutput, format);
        } else if (i10 == 6) {
            this.outputWriter = new c(this.extractorOutput, this.trackOutput, format, "audio/g711-alaw", -1);
        } else if (i10 == 7) {
            this.outputWriter = new c(this.extractorOutput, this.trackOutput, format, "audio/g711-mlaw", -1);
        } else {
            int pcmEncodingForType = WavUtil.getPcmEncodingForType(i10, format.bitsPerSample);
            if (pcmEncodingForType != 0) {
                this.outputWriter = new c(this.extractorOutput, this.trackOutput, format, "audio/raw", pcmEncodingForType);
            } else {
                throw ParserException.createForUnsupportedContainerFeature("Unsupported WAV format type: " + format.formatType);
            }
        }
        this.state = 3;
    }

    private void readRf64SampleDataSize(ExtractorInput extractorInput) throws IOException {
        this.rf64SampleDataSize = qh.c.readRf64SampleDataSize(extractorInput);
        this.state = 2;
    }

    private void skipToSampleData(ExtractorInput extractorInput) throws IOException {
        Pair<Long, Long> pairSkipToSampleData = qh.c.skipToSampleData(extractorInput);
        this.dataStartPosition = ((Long) pairSkipToSampleData.first).intValue();
        long jLongValue = ((Long) pairSkipToSampleData.second).longValue();
        long j10 = this.rf64SampleDataSize;
        if (j10 != -1 && jLongValue == 4294967295L) {
            jLongValue = j10;
        }
        this.dataEndPosition = ((long) this.dataStartPosition) + jLongValue;
        long length = extractorInput.getLength();
        if (length != -1 && this.dataEndPosition > length) {
            Log.w(TAG, "Data exceeds input length: " + this.dataEndPosition + ", " + length);
            this.dataEndPosition = length;
        }
        ((b) Assertions.checkNotNull(this.outputWriter)).init(this.dataStartPosition, this.dataEndPosition);
        this.state = 4;
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        assertInitialized();
        int i10 = this.state;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return readSampleData(extractorInput);
                        }
                        throw new IllegalStateException();
                    }
                    skipToSampleData(extractorInput);
                    return 0;
                }
                readFormat(extractorInput);
                return 0;
            }
            readRf64SampleDataSize(extractorInput);
            return 0;
        }
        readFileType(extractorInput);
        return 0;
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        return qh.c.checkFileType(extractorInput);
    }
}
