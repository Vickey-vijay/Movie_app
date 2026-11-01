package gg;

import io.bidmachine.media3.exoplayer.dash.DashSegmentIndex;
import io.bidmachine.media3.exoplayer.dash.manifest.RangedUri;

/* JADX INFO: compiled from: SingleSegmentIndex.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements DashSegmentIndex {
    private final RangedUri uri;

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public long getAvailableSegmentCount(long j10, long j11) {
        return 1L;
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public long getDurationUs(long j10, long j11) {
        return j11;
    }

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
    public long getSegmentCount(long j10) {
        return 1L;
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public long getSegmentNum(long j10, long j11) {
        return 0L;
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public long getTimeUs(long j10) {
        return 0L;
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public boolean isExplicit() {
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public RangedUri getSegmentUrl(long j10) {
        return this.uri;
    }

    public a(RangedUri rangedUri) {
        this.uri = rangedUri;
    }
}
