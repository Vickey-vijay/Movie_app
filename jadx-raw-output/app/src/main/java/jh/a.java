package jh;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.ExtractorUtil;
import io.bidmachine.media3.extractor.SeekMap;
import io.bidmachine.media3.extractor.SeekPoint;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: compiled from: DefaultOggSeeker.java */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements f {
    private static final int DEFAULT_OFFSET = 30000;
    private static final int MATCH_BYTE_RANGE = 100000;
    private static final int MATCH_RANGE = 72000;
    private static final int STATE_IDLE = 4;
    private static final int STATE_READ_LAST_PAGE = 1;
    private static final int STATE_SEEK = 2;
    private static final int STATE_SEEK_TO_END = 0;
    private static final int STATE_SKIP = 3;
    private long end;
    private long endGranule;
    private final e pageHeader;
    private final long payloadEndPosition;
    private final long payloadStartPosition;
    private long positionBeforeSeekToEnd;
    private long start;
    private long startGranule;
    private int state;
    private final h streamReader;
    private long targetGranule;
    private long totalGranules;

    /* JADX INFO: compiled from: DefaultOggSeeker.java */
    public final class b implements SeekMap {
        private b() {
        }

        @Override // io.bidmachine.media3.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }

        @Override // io.bidmachine.media3.extractor.SeekMap
        public long getDurationUs() {
            return a.this.streamReader.convertGranuleToTime(a.this.totalGranules);
        }

        @Override // io.bidmachine.media3.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j10) {
            return new SeekMap.SeekPoints(new SeekPoint(j10, Util.constrainValue((a.this.payloadStartPosition + BigInteger.valueOf(a.this.streamReader.convertTimeToGranule(j10)).multiply(BigInteger.valueOf(a.this.payloadEndPosition - a.this.payloadStartPosition)).divide(BigInteger.valueOf(a.this.totalGranules)).longValue()) - 30000, a.this.payloadStartPosition, a.this.payloadEndPosition - 1)));
        }
    }

    private long getNextSeekPosition(ExtractorInput extractorInput) throws IOException {
        if (this.start == this.end) {
            return -1L;
        }
        long position = extractorInput.getPosition();
        if (!this.pageHeader.skipToNextPage(extractorInput, this.end)) {
            long j10 = this.start;
            if (j10 != position) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.pageHeader.populate(extractorInput, false);
        extractorInput.resetPeekPosition();
        long j11 = this.targetGranule;
        e eVar = this.pageHeader;
        long j12 = eVar.granulePosition;
        long j13 = j11 - j12;
        int i10 = eVar.headerSize + eVar.bodySize;
        if (0 <= j13 && j13 < 72000) {
            return -1L;
        }
        if (j13 < 0) {
            this.end = position;
            this.endGranule = j12;
        } else {
            this.start = extractorInput.getPosition() + ((long) i10);
            this.startGranule = this.pageHeader.granulePosition;
        }
        long j14 = this.end;
        long j15 = this.start;
        if (j14 - j15 < 100000) {
            this.end = j15;
            return j15;
        }
        long position2 = extractorInput.getPosition() - (((long) i10) * (j13 <= 0 ? 2L : 1L));
        long j16 = this.end;
        long j17 = this.start;
        return Util.constrainValue(position2 + ((j13 * (j16 - j17)) / (this.endGranule - this.startGranule)), j17, j16 - 1);
    }

    private void skipToPageOfTargetGranule(ExtractorInput extractorInput) throws IOException {
        while (true) {
            this.pageHeader.skipToNextPage(extractorInput);
            this.pageHeader.populate(extractorInput, false);
            e eVar = this.pageHeader;
            if (eVar.granulePosition > this.targetGranule) {
                extractorInput.resetPeekPosition();
                return;
            } else {
                extractorInput.skipFully(eVar.headerSize + eVar.bodySize);
                this.start = extractorInput.getPosition();
                this.startGranule = this.pageHeader.granulePosition;
            }
        }
    }

    @Override // jh.f
    @Nullable
    public b createSeekMap() {
        if (this.totalGranules != 0) {
            return new b();
        }
        return null;
    }

    @Override // jh.f
    public long read(ExtractorInput extractorInput) throws IOException {
        int i10 = this.state;
        if (i10 == 0) {
            long position = extractorInput.getPosition();
            this.positionBeforeSeekToEnd = position;
            this.state = 1;
            long j10 = this.payloadEndPosition - 65307;
            if (j10 > position) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long nextSeekPosition = getNextSeekPosition(extractorInput);
                if (nextSeekPosition != -1) {
                    return nextSeekPosition;
                }
                this.state = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            skipToPageOfTargetGranule(extractorInput);
            this.state = 4;
            return -(this.startGranule + 2);
        }
        this.totalGranules = readGranuleOfLastPage(extractorInput);
        this.state = 4;
        return this.positionBeforeSeekToEnd;
    }

    @VisibleForTesting
    public long readGranuleOfLastPage(ExtractorInput extractorInput) throws IOException {
        this.pageHeader.reset();
        if (!this.pageHeader.skipToNextPage(extractorInput)) {
            throw new EOFException();
        }
        this.pageHeader.populate(extractorInput, false);
        e eVar = this.pageHeader;
        extractorInput.skipFully(eVar.headerSize + eVar.bodySize);
        long j10 = this.pageHeader.granulePosition;
        while (true) {
            e eVar2 = this.pageHeader;
            if ((eVar2.type & 4) == 4 || !eVar2.skipToNextPage(extractorInput) || extractorInput.getPosition() >= this.payloadEndPosition || !this.pageHeader.populate(extractorInput, true)) {
                break;
            }
            e eVar3 = this.pageHeader;
            if (!ExtractorUtil.skipFullyQuietly(extractorInput, eVar3.headerSize + eVar3.bodySize)) {
                break;
            }
            j10 = this.pageHeader.granulePosition;
        }
        return j10;
    }

    @Override // jh.f
    public void startSeek(long j10) {
        this.targetGranule = Util.constrainValue(j10, 0L, this.totalGranules - 1);
        this.state = 2;
        this.start = this.payloadStartPosition;
        this.end = this.payloadEndPosition;
        this.startGranule = 0L;
        this.endGranule = this.totalGranules;
    }

    public a(h hVar, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkArgument(z11);
        this.streamReader = hVar;
        this.payloadStartPosition = j10;
        this.payloadEndPosition = j11;
        if (j12 != j11 - j10 && !z10) {
            this.state = 0;
        } else {
            this.totalGranules = j13;
            this.state = 4;
        }
        this.pageHeader = new e();
    }
}
