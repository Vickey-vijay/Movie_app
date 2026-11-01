package ph;

import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.TimestampAdjuster;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.extractor.BinarySearchSeeker;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.ts.TsUtil;
import java.io.IOException;

/* JADX INFO: compiled from: TsBinarySearchSeeker.java */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends BinarySearchSeeker {
    private static final int MINIMUM_SEARCH_RANGE_BYTES = 940;
    private static final long SEEK_TOLERANCE_US = 100000;

    /* JADX INFO: compiled from: TsBinarySearchSeeker.java */
    public static final class a implements BinarySearchSeeker.TimestampSeeker {
        private final ParsableByteArray packetBuffer = new ParsableByteArray();
        private final int pcrPid;
        private final TimestampAdjuster pcrTimestampAdjuster;
        private final int timestampSearchBytes;

        private BinarySearchSeeker.TimestampSearchResult searchForPcrValueInBuffer(ParsableByteArray parsableByteArray, long j10, long j11) {
            int iFindSyncBytePosition;
            int iFindSyncBytePosition2;
            int iLimit = parsableByteArray.limit();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (parsableByteArray.bytesLeft() >= 188 && (iFindSyncBytePosition2 = (iFindSyncBytePosition = TsUtil.findSyncBytePosition(parsableByteArray.getData(), parsableByteArray.getPosition(), iLimit)) + 188) <= iLimit) {
                long pcrFromPacket = TsUtil.readPcrFromPacket(parsableByteArray, iFindSyncBytePosition, this.pcrPid);
                if (pcrFromPacket != -9223372036854775807L) {
                    long jAdjustTsTimestamp = this.pcrTimestampAdjuster.adjustTsTimestamp(pcrFromPacket);
                    if (jAdjustTsTimestamp > j10) {
                        return j14 == -9223372036854775807L ? BinarySearchSeeker.TimestampSearchResult.overestimatedResult(jAdjustTsTimestamp, j11) : BinarySearchSeeker.TimestampSearchResult.targetFoundResult(j11 + j13);
                    }
                    if (100000 + jAdjustTsTimestamp > j10) {
                        return BinarySearchSeeker.TimestampSearchResult.targetFoundResult(j11 + ((long) iFindSyncBytePosition));
                    }
                    j13 = iFindSyncBytePosition;
                    j14 = jAdjustTsTimestamp;
                }
                parsableByteArray.setPosition(iFindSyncBytePosition2);
                j12 = iFindSyncBytePosition2;
            }
            return j14 != -9223372036854775807L ? BinarySearchSeeker.TimestampSearchResult.underestimatedResult(j14, j11 + j12) : BinarySearchSeeker.TimestampSearchResult.NO_TIMESTAMP_IN_RANGE_RESULT;
        }

        @Override // io.bidmachine.media3.extractor.BinarySearchSeeker.TimestampSeeker
        public void onSeekFinished() {
            this.packetBuffer.reset(Util.EMPTY_BYTE_ARRAY);
        }

        public a(int i10, TimestampAdjuster timestampAdjuster, int i11) {
            this.pcrPid = i10;
            this.pcrTimestampAdjuster = timestampAdjuster;
            this.timestampSearchBytes = i11;
        }

        @Override // io.bidmachine.media3.extractor.BinarySearchSeeker.TimestampSeeker
        public BinarySearchSeeker.TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput, long j10) throws IOException {
            long position = extractorInput.getPosition();
            int iMin = (int) Math.min(this.timestampSearchBytes, extractorInput.getLength() - position);
            this.packetBuffer.reset(iMin);
            extractorInput.peekFully(this.packetBuffer.getData(), 0, iMin);
            return searchForPcrValueInBuffer(this.packetBuffer, j10, position);
        }
    }

    public h(TimestampAdjuster timestampAdjuster, long j10, long j11, int i10, int i11) {
        super(new BinarySearchSeeker.DefaultSeekTimestampConverter(), new a(i10, timestampAdjuster, i11), j10, 0L, j10 + 1, 0L, j11, 188L, MINIMUM_SEARCH_RANGE_BYTES);
    }
}
