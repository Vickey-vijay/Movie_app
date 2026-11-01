package io.bidmachine.media3.extractor.ts;

import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.ParsableBitArray;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.extractor.ConstantBitrateSeekMap;
import io.bidmachine.media3.extractor.Extractor;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.ExtractorOutput;
import io.bidmachine.media3.extractor.ExtractorsFactory;
import io.bidmachine.media3.extractor.PositionHolder;
import io.bidmachine.media3.extractor.SeekMap;
import io.bidmachine.media3.extractor.ts.AdtsExtractor;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@UnstableApi
public final class AdtsExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: ph.c
        @Override // io.bidmachine.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return AdtsExtractor.lambda$static$0();
        }
    };
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING_ALWAYS = 2;
    private static final int MAX_PACKET_SIZE = 2048;
    private static final int MAX_SNIFF_BYTES = 8192;
    private static final int NUM_FRAMES_FOR_AVERAGE_FRAME_SIZE = 1000;
    private int averageFrameSize;
    private ExtractorOutput extractorOutput;
    private long firstFramePosition;
    private long firstSampleTimestampUs;
    private final int flags;
    private boolean hasCalculatedAverageFrameSize;
    private boolean hasOutputSeekMap;
    private final ParsableByteArray packetBuffer;
    private final AdtsReader reader;
    private final ParsableByteArray scratch;
    private final ParsableBitArray scratchBits;
    private boolean startedPacket;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public AdtsExtractor() {
        this(0);
    }

    private static int getBitrateFromFrameSize(int i10, long j10) {
        return (int) (((((long) i10) * 8) * 1000000) / j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new AdtsExtractor()};
    }

    private int peekId3Header(ExtractorInput extractorInput) throws IOException {
        int i10 = 0;
        while (true) {
            extractorInput.peekFully(this.scratch.getData(), 0, 10);
            this.scratch.setPosition(0);
            if (this.scratch.readUnsignedInt24() != 4801587) {
                break;
            }
            this.scratch.skipBytes(3);
            int synchSafeInt = this.scratch.readSynchSafeInt();
            i10 += synchSafeInt + 10;
            extractorInput.advancePeekPosition(synchSafeInt);
        }
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(i10);
        if (this.firstFramePosition == -1) {
            this.firstFramePosition = i10;
        }
        return i10;
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

    @Override // io.bidmachine.media3.extractor.Extractor
    public void seek(long j10, long j11) {
        this.startedPacket = false;
        this.reader.seek();
        this.firstSampleTimestampUs = j11;
    }

    public AdtsExtractor(int i10) {
        this.flags = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.reader = new AdtsReader(true);
        this.packetBuffer = new ParsableByteArray(2048);
        this.averageFrameSize = -1;
        this.firstFramePosition = -1L;
        ParsableByteArray parsableByteArray = new ParsableByteArray(10);
        this.scratch = parsableByteArray;
        this.scratchBits = new ParsableBitArray(parsableByteArray.getData());
    }

    private void calculateAverageFrameSize(ExtractorInput extractorInput) throws IOException {
        if (this.hasCalculatedAverageFrameSize) {
            return;
        }
        this.averageFrameSize = -1;
        extractorInput.resetPeekPosition();
        long j10 = 0;
        if (extractorInput.getPosition() == 0) {
            peekId3Header(extractorInput);
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                if (extractorInput.peekFully(this.scratch.getData(), 0, 2, true)) {
                    this.scratch.setPosition(0);
                    if (!AdtsReader.isAdtsSyncWord(this.scratch.readUnsignedShort())) {
                        break;
                    }
                    if (extractorInput.peekFully(this.scratch.getData(), 0, 4, true)) {
                        this.scratchBits.setPosition(14);
                        int bits = this.scratchBits.readBits(13);
                        if (bits <= 6) {
                            this.hasCalculatedAverageFrameSize = true;
                            throw ParserException.createForMalformedContainer("Malformed ADTS stream", null);
                        }
                        j10 += (long) bits;
                        i11++;
                        if (i11 != 1000 && extractorInput.advancePeekPosition(bits - 6, true)) {
                        }
                    }
                }
            } catch (EOFException unused) {
            }
            i10 = i11;
            break;
        }
        extractorInput.resetPeekPosition();
        if (i10 > 0) {
            this.averageFrameSize = (int) (j10 / ((long) i10));
        } else {
            this.averageFrameSize = -1;
        }
        this.hasCalculatedAverageFrameSize = true;
    }

    private SeekMap getConstantBitrateSeekMap(long j10, boolean z10) {
        return new ConstantBitrateSeekMap(j10, this.firstFramePosition, getBitrateFromFrameSize(this.averageFrameSize, this.reader.getSampleDurationUs()), this.averageFrameSize, z10);
    }

    private void maybeOutputSeekMap(long j10, boolean z10) {
        if (this.hasOutputSeekMap) {
            return;
        }
        boolean z11 = (this.flags & 1) != 0 && this.averageFrameSize > 0;
        if (z11 && this.reader.getSampleDurationUs() == -9223372036854775807L && !z10) {
            return;
        }
        if (!z11 || this.reader.getSampleDurationUs() == -9223372036854775807L) {
            this.extractorOutput.seekMap(new SeekMap.Unseekable(-9223372036854775807L));
        } else {
            this.extractorOutput.seekMap(getConstantBitrateSeekMap(j10, (this.flags & 2) != 0));
        }
        this.hasOutputSeekMap = true;
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        this.reader.createTracks(extractorOutput, new TsPayloadReader.TrackIdGenerator(0, 1));
        extractorOutput.endTracks();
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        Assertions.checkStateNotNull(this.extractorOutput);
        long length = extractorInput.getLength();
        int i10 = this.flags;
        if (((i10 & 2) == 0 && ((i10 & 1) == 0 || length == -1)) ? false : true) {
            calculateAverageFrameSize(extractorInput);
        }
        int i11 = extractorInput.read(this.packetBuffer.getData(), 0, 2048);
        boolean z10 = i11 == -1;
        maybeOutputSeekMap(length, z10);
        if (z10) {
            return -1;
        }
        this.packetBuffer.setPosition(0);
        this.packetBuffer.setLimit(i11);
        if (!this.startedPacket) {
            this.reader.packetStarted(this.firstSampleTimestampUs, 4);
            this.startedPacket = true;
        }
        this.reader.consume(this.packetBuffer);
        return 0;
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        int iPeekId3Header = peekId3Header(extractorInput);
        int i10 = iPeekId3Header;
        int i11 = 0;
        int i12 = 0;
        do {
            extractorInput.peekFully(this.scratch.getData(), 0, 2);
            this.scratch.setPosition(0);
            if (!AdtsReader.isAdtsSyncWord(this.scratch.readUnsignedShort())) {
                i10++;
                extractorInput.resetPeekPosition();
                extractorInput.advancePeekPosition(i10);
            } else {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                extractorInput.peekFully(this.scratch.getData(), 0, 4);
                this.scratchBits.setPosition(14);
                int bits = this.scratchBits.readBits(13);
                if (bits <= 6) {
                    i10++;
                    extractorInput.resetPeekPosition();
                    extractorInput.advancePeekPosition(i10);
                } else {
                    extractorInput.advancePeekPosition(bits - 6);
                    i12 += bits;
                }
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - iPeekId3Header < 8192);
        return false;
    }
}
