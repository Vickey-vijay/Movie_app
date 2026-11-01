package hh;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.extractor.MpegAudioUtil;
import io.bidmachine.media3.extractor.SeekMap;
import io.bidmachine.media3.extractor.SeekPoint;
import io.bidmachine.media3.extractor.mp3.Seeker;

/* JADX INFO: compiled from: XingSeeker.java */
/* JADX INFO: loaded from: classes11.dex */
public final class h implements Seeker {
    private static final String TAG = "XingSeeker";
    private final int bitrate;
    private final long dataEndPosition;
    private final long dataSize;
    private final long dataStartPosition;
    private final long durationUs;

    @Nullable
    private final long[] tableOfContents;
    private final int xingFrameSize;

    private h(long j10, int i10, long j11, int i11) {
        this(j10, i10, j11, i11, -1L, null);
    }

    private h(long j10, int i10, long j11, int i11, long j12, @Nullable long[] jArr) {
        this.dataStartPosition = j10;
        this.xingFrameSize = i10;
        this.durationUs = j11;
        this.bitrate = i11;
        this.dataSize = j12;
        this.tableOfContents = jArr;
        this.dataEndPosition = j12 != -1 ? j10 + j12 : -1L;
    }

    private long getTimeUsForTableIndex(int i10) {
        return (this.durationUs * ((long) i10)) / 100;
    }

    @Override // io.bidmachine.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return this.bitrate;
    }

    @Override // io.bidmachine.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // io.bidmachine.media3.extractor.mp3.Seeker, io.bidmachine.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // io.bidmachine.media3.extractor.mp3.Seeker
    public long getTimeUs(long j10) {
        long j11 = j10 - this.dataStartPosition;
        if (!isSeekable() || j11 <= this.xingFrameSize) {
            return 0L;
        }
        long[] jArr = (long[]) Assertions.checkStateNotNull(this.tableOfContents);
        double d10 = (j11 * 256.0d) / this.dataSize;
        int iBinarySearchFloor = Util.binarySearchFloor(jArr, (long) d10, true, true);
        long timeUsForTableIndex = getTimeUsForTableIndex(iBinarySearchFloor);
        long j12 = jArr[iBinarySearchFloor];
        int i10 = iBinarySearchFloor + 1;
        long timeUsForTableIndex2 = getTimeUsForTableIndex(i10);
        long j13 = iBinarySearchFloor == 99 ? 256L : jArr[i10];
        return timeUsForTableIndex + Math.round((j12 == j13 ? 0.0d : (d10 - j12) / (j13 - j12)) * (timeUsForTableIndex2 - timeUsForTableIndex));
    }

    @Override // io.bidmachine.media3.extractor.mp3.Seeker, io.bidmachine.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.tableOfContents != null;
    }

    @Nullable
    public static h create(g gVar, long j10) {
        long[] jArr;
        long jComputeDurationUs = gVar.computeDurationUs();
        if (jComputeDurationUs == -9223372036854775807L) {
            return null;
        }
        long j11 = gVar.dataSize;
        if (j11 != -1 && (jArr = gVar.tableOfContents) != null) {
            MpegAudioUtil.Header header = gVar.header;
            return new h(j10, header.frameSize, jComputeDurationUs, header.bitrate, j11, jArr);
        }
        MpegAudioUtil.Header header2 = gVar.header;
        return new h(j10, header2.frameSize, jComputeDurationUs, header2.bitrate);
    }

    @Override // io.bidmachine.media3.extractor.mp3.Seeker, io.bidmachine.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j10) {
        double d10;
        if (!isSeekable()) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.dataStartPosition + ((long) this.xingFrameSize)));
        }
        long jConstrainValue = Util.constrainValue(j10, 0L, this.durationUs);
        double d11 = (jConstrainValue * 100.0d) / this.durationUs;
        double d12 = 0.0d;
        if (d11 > 0.0d) {
            if (d11 >= 100.0d) {
                d12 = 256.0d;
            } else {
                int i10 = (int) d11;
                long[] jArr = (long[]) Assertions.checkStateNotNull(this.tableOfContents);
                double d13 = jArr[i10];
                if (i10 == 99) {
                    d10 = 256.0d;
                } else {
                    d10 = jArr[i10 + 1];
                }
                d12 = d13 + ((d11 - ((double) i10)) * (d10 - d13));
            }
        }
        return new SeekMap.SeekPoints(new SeekPoint(jConstrainValue, this.dataStartPosition + Util.constrainValue(Math.round((d12 / 256.0d) * this.dataSize), this.xingFrameSize, this.dataSize - 1)));
    }
}
