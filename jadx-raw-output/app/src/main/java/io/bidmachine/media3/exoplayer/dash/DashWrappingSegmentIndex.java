package io.bidmachine.media3.exoplayer.dash;

import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.dash.manifest.RangedUri;
import io.bidmachine.media3.extractor.ChunkIndex;

/* JADX INFO: loaded from: classes3.dex */
@UnstableApi
public final class DashWrappingSegmentIndex implements DashSegmentIndex {
    private final ChunkIndex chunkIndex;
    private final long timeOffsetUs;

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public long getFirstAvailableSegmentNum(long j10, long j11) {
        return 0L;
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public long getFirstSegmentNum() {
        return 0L;
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public long getNextSegmentAvailableTimeUs(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public boolean isExplicit() {
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public long getAvailableSegmentCount(long j10, long j11) {
        return this.chunkIndex.length;
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public long getDurationUs(long j10, long j11) {
        return this.chunkIndex.durationsUs[(int) j10];
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public long getSegmentCount(long j10) {
        return this.chunkIndex.length;
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public long getSegmentNum(long j10, long j11) {
        return this.chunkIndex.getChunkIndex(j10 + this.timeOffsetUs);
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public RangedUri getSegmentUrl(long j10) {
        ChunkIndex chunkIndex = this.chunkIndex;
        int i10 = (int) j10;
        return new RangedUri(null, chunkIndex.offsets[i10], chunkIndex.sizes[i10]);
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public long getTimeUs(long j10) {
        return this.chunkIndex.timesUs[(int) j10] - this.timeOffsetUs;
    }

    public DashWrappingSegmentIndex(ChunkIndex chunkIndex, long j10) {
        this.chunkIndex = chunkIndex;
        this.timeOffsetUs = j10;
    }
}
