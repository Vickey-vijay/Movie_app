package hh;

import android.util.Pair;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.extractor.SeekMap;
import io.bidmachine.media3.extractor.SeekPoint;
import io.bidmachine.media3.extractor.metadata.id3.MlltFrame;
import io.bidmachine.media3.extractor.mp3.Seeker;

/* JADX INFO: compiled from: MlltSeeker.java */
/* JADX INFO: loaded from: classes11.dex */
public final class c implements Seeker {
    private final long durationUs;
    private final long[] referencePositions;
    private final long[] referenceTimesMs;

    private static Pair<Long, Long> linearlyInterpolate(long j10, long[] jArr, long[] jArr2) {
        int iBinarySearchFloor = Util.binarySearchFloor(jArr, j10, true, true);
        long j11 = jArr[iBinarySearchFloor];
        long j12 = jArr2[iBinarySearchFloor];
        int i10 = iBinarySearchFloor + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // io.bidmachine.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return -2147483647;
    }

    @Override // io.bidmachine.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return -1L;
    }

    @Override // io.bidmachine.media3.extractor.mp3.Seeker, io.bidmachine.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    public static c create(long j10, MlltFrame mlltFrame, long j11) {
        int length = mlltFrame.bytesDeviations.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (mlltFrame.bytesBetweenReference + mlltFrame.bytesDeviations[i12]);
            j12 += (long) (mlltFrame.millisecondsBetweenReference + mlltFrame.millisecondsDeviations[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new c(jArr, jArr2, j11);
    }

    @Override // io.bidmachine.media3.extractor.mp3.Seeker, io.bidmachine.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // io.bidmachine.media3.extractor.mp3.Seeker, io.bidmachine.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j10) {
        Pair<Long, Long> pairLinearlyInterpolate = linearlyInterpolate(Util.usToMs(Util.constrainValue(j10, 0L, this.durationUs)), this.referenceTimesMs, this.referencePositions);
        return new SeekMap.SeekPoints(new SeekPoint(Util.msToUs(((Long) pairLinearlyInterpolate.first).longValue()), ((Long) pairLinearlyInterpolate.second).longValue()));
    }

    @Override // io.bidmachine.media3.extractor.mp3.Seeker
    public long getTimeUs(long j10) {
        return Util.msToUs(((Long) linearlyInterpolate(j10, this.referencePositions, this.referenceTimesMs).second).longValue());
    }

    private c(long[] jArr, long[] jArr2, long j10) {
        this.referencePositions = jArr;
        this.referenceTimesMs = jArr2;
        this.durationUs = j10 == -9223372036854775807L ? Util.msToUs(jArr2[jArr2.length - 1]) : j10;
    }
}
