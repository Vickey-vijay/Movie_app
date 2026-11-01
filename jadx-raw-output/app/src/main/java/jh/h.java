package jh;

import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.ExtractorOutput;
import io.bidmachine.media3.extractor.PositionHolder;
import io.bidmachine.media3.extractor.SeekMap;
import io.bidmachine.media3.extractor.TrackOutput;
import java.io.IOException;

/* JADX INFO: compiled from: StreamReader.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class h {
    private static final int STATE_END_OF_INPUT = 3;
    private static final int STATE_READ_HEADERS = 0;
    private static final int STATE_READ_PAYLOAD = 2;
    private static final int STATE_SKIP_HEADERS = 1;
    private long currentGranule;
    private ExtractorOutput extractorOutput;
    private boolean formatSet;
    private long lengthOfReadPacket;
    private f oggSeeker;
    private long payloadStartPosition;
    private int sampleRate;
    private boolean seekMapSet;
    private int state;
    private long targetGranule;
    private TrackOutput trackOutput;
    private final d oggPacket = new d();
    private b setupData = new b();

    /* JADX INFO: compiled from: StreamReader.java */
    public static class b {
        public Format format;
        public f oggSeeker;
    }

    /* JADX INFO: compiled from: StreamReader.java */
    public static final class c implements f {
        private c() {
        }

        @Override // jh.f
        public long read(ExtractorInput extractorInput) {
            return -1L;
        }

        @Override // jh.f
        public void startSeek(long j10) {
        }

        @Override // jh.f
        public SeekMap createSeekMap() {
            return new SeekMap.Unseekable(-9223372036854775807L);
        }
    }

    private boolean readHeaders(ExtractorInput extractorInput) throws IOException {
        while (this.oggPacket.populate(extractorInput)) {
            this.lengthOfReadPacket = extractorInput.getPosition() - this.payloadStartPosition;
            if (!readHeaders(this.oggPacket.getPayload(), this.payloadStartPosition, this.setupData)) {
                return true;
            }
            this.payloadStartPosition = extractorInput.getPosition();
        }
        this.state = 3;
        return false;
    }

    public abstract long preparePayload(ParsableByteArray parsableByteArray);

    public abstract boolean readHeaders(ParsableByteArray parsableByteArray, long j10, b bVar) throws IOException;

    private void assertInitialized() {
        Assertions.checkStateNotNull(this.trackOutput);
        Util.castNonNull(this.extractorOutput);
    }

    private int readPayload(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        long j10 = this.oggSeeker.read(extractorInput);
        if (j10 >= 0) {
            positionHolder.position = j10;
            return 1;
        }
        if (j10 < -1) {
            onSeekEnd(-(j10 + 2));
        }
        if (!this.seekMapSet) {
            this.extractorOutput.seekMap((SeekMap) Assertions.checkStateNotNull(this.oggSeeker.createSeekMap()));
            this.seekMapSet = true;
        }
        if (this.lengthOfReadPacket <= 0 && !this.oggPacket.populate(extractorInput)) {
            this.state = 3;
            return -1;
        }
        this.lengthOfReadPacket = 0L;
        ParsableByteArray payload = this.oggPacket.getPayload();
        long jPreparePayload = preparePayload(payload);
        if (jPreparePayload >= 0) {
            long j11 = this.currentGranule;
            if (j11 + jPreparePayload >= this.targetGranule) {
                long jConvertGranuleToTime = convertGranuleToTime(j11);
                this.trackOutput.sampleData(payload, payload.limit());
                this.trackOutput.sampleMetadata(jConvertGranuleToTime, 1, payload.limit(), 0, null);
                this.targetGranule = -1L;
            }
        }
        this.currentGranule += jPreparePayload;
        return 0;
    }

    public long convertTimeToGranule(long j10) {
        return (((long) this.sampleRate) * j10) / 1000000;
    }

    public void init(ExtractorOutput extractorOutput, TrackOutput trackOutput) {
        this.extractorOutput = extractorOutput;
        this.trackOutput = trackOutput;
        reset(true);
    }

    public void onSeekEnd(long j10) {
        this.currentGranule = j10;
    }

    public void reset(boolean z10) {
        if (z10) {
            this.setupData = new b();
            this.payloadStartPosition = 0L;
            this.state = 0;
        } else {
            this.state = 1;
        }
        this.targetGranule = -1L;
        this.currentGranule = 0L;
    }

    public final void seek(long j10, long j11) {
        this.oggPacket.reset();
        if (j10 == 0) {
            reset(!this.seekMapSet);
        } else if (this.state != 0) {
            this.targetGranule = convertTimeToGranule(j11);
            ((f) Util.castNonNull(this.oggSeeker)).startSeek(this.targetGranule);
            this.state = 2;
        }
    }

    private int readHeadersAndUpdateState(ExtractorInput extractorInput) throws IOException {
        boolean z10;
        if (!readHeaders(extractorInput)) {
            return -1;
        }
        Format format = this.setupData.format;
        this.sampleRate = format.sampleRate;
        if (!this.formatSet) {
            this.trackOutput.format(format);
            this.formatSet = true;
        }
        f fVar = this.setupData.oggSeeker;
        if (fVar != null) {
            this.oggSeeker = fVar;
        } else if (extractorInput.getLength() == -1) {
            this.oggSeeker = new c();
        } else {
            e pageHeader = this.oggPacket.getPageHeader();
            if ((pageHeader.type & 4) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.oggSeeker = new jh.a(this, this.payloadStartPosition, extractorInput.getLength(), pageHeader.headerSize + pageHeader.bodySize, pageHeader.granulePosition, z10);
        }
        this.state = 2;
        this.oggPacket.trimPayload();
        return 0;
    }

    public long convertGranuleToTime(long j10) {
        return (j10 * 1000000) / ((long) this.sampleRate);
    }

    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        assertInitialized();
        int i10 = this.state;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                Util.castNonNull(this.oggSeeker);
                return readPayload(extractorInput, positionHolder);
            }
            extractorInput.skipFully((int) this.payloadStartPosition);
            this.state = 2;
            return 0;
        }
        return readHeadersAndUpdateState(extractorInput);
    }
}
