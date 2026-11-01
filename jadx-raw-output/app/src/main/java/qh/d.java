package qh;

import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.extractor.SeekMap;
import io.bidmachine.media3.extractor.SeekPoint;

/* JADX INFO: compiled from: WavSeekMap.java */
/* JADX INFO: loaded from: classes6.dex */
public final class d implements SeekMap {
    private final long blockCount;
    private final long durationUs;
    private final long firstBlockPosition;
    private final int framesPerBlock;
    private final b wavFormat;

    @Override // io.bidmachine.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    private long blockIndexToTimeUs(long j10) {
        return Util.scaleLargeTimestamp(j10 * ((long) this.framesPerBlock), 1000000L, this.wavFormat.frameRateHz);
    }

    @Override // io.bidmachine.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // io.bidmachine.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j10) {
        long jConstrainValue = Util.constrainValue((((long) this.wavFormat.frameRateHz) * j10) / (((long) this.framesPerBlock) * 1000000), 0L, this.blockCount - 1);
        long j11 = this.firstBlockPosition + (((long) this.wavFormat.blockSize) * jConstrainValue);
        long jBlockIndexToTimeUs = blockIndexToTimeUs(jConstrainValue);
        SeekPoint seekPoint = new SeekPoint(jBlockIndexToTimeUs, j11);
        if (jBlockIndexToTimeUs >= j10 || jConstrainValue == this.blockCount - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        long j12 = jConstrainValue + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(blockIndexToTimeUs(j12), this.firstBlockPosition + (((long) this.wavFormat.blockSize) * j12)));
    }

    public d(b bVar, int i10, long j10, long j11) {
        this.wavFormat = bVar;
        this.framesPerBlock = i10;
        this.firstBlockPosition = j10;
        long j12 = (j11 - j10) / ((long) bVar.blockSize);
        this.blockCount = j12;
        this.durationUs = blockIndexToTimeUs(j12);
    }
}
