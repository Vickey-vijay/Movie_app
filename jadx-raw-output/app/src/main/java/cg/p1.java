package cg;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.source.MediaSource;

/* JADX INFO: compiled from: MediaPeriodInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public final class p1 {
    public final long durationUs;
    public final long endPositionUs;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final MediaSource.MediaPeriodId f5876id;
    public final boolean isFinal;
    public final boolean isFollowedByTransitionToSameStream;
    public final boolean isLastInTimelinePeriod;
    public final boolean isLastInTimelineWindow;
    public final long requestedContentPositionUs;
    public final long startPositionUs;

    public p1(MediaSource.MediaPeriodId mediaPeriodId, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = false;
        Assertions.checkArgument(!z13 || z11);
        Assertions.checkArgument(!z12 || z11);
        if (!z10 || (!z11 && !z12 && !z13)) {
            z14 = true;
        }
        Assertions.checkArgument(z14);
        this.f5876id = mediaPeriodId;
        this.startPositionUs = j10;
        this.requestedContentPositionUs = j11;
        this.endPositionUs = j12;
        this.durationUs = j13;
        this.isFollowedByTransitionToSameStream = z10;
        this.isLastInTimelinePeriod = z11;
        this.isLastInTimelineWindow = z12;
        this.isFinal = z13;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p1.class != obj.getClass()) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return this.startPositionUs == p1Var.startPositionUs && this.requestedContentPositionUs == p1Var.requestedContentPositionUs && this.endPositionUs == p1Var.endPositionUs && this.durationUs == p1Var.durationUs && this.isFollowedByTransitionToSameStream == p1Var.isFollowedByTransitionToSameStream && this.isLastInTimelinePeriod == p1Var.isLastInTimelinePeriod && this.isLastInTimelineWindow == p1Var.isLastInTimelineWindow && this.isFinal == p1Var.isFinal && Util.areEqual(this.f5876id, p1Var.f5876id);
    }

    public p1 copyWithRequestedContentPositionUs(long j10) {
        return j10 == this.requestedContentPositionUs ? this : new p1(this.f5876id, this.startPositionUs, j10, this.endPositionUs, this.durationUs, this.isFollowedByTransitionToSameStream, this.isLastInTimelinePeriod, this.isLastInTimelineWindow, this.isFinal);
    }

    public p1 copyWithStartPositionUs(long j10) {
        return j10 == this.startPositionUs ? this : new p1(this.f5876id, j10, this.requestedContentPositionUs, this.endPositionUs, this.durationUs, this.isFollowedByTransitionToSameStream, this.isLastInTimelinePeriod, this.isLastInTimelineWindow, this.isFinal);
    }

    public int hashCode() {
        return ((((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f5876id.hashCode()) * 31) + ((int) this.startPositionUs)) * 31) + ((int) this.requestedContentPositionUs)) * 31) + ((int) this.endPositionUs)) * 31) + ((int) this.durationUs)) * 31) + (this.isFollowedByTransitionToSameStream ? 1 : 0)) * 31) + (this.isLastInTimelinePeriod ? 1 : 0)) * 31) + (this.isLastInTimelineWindow ? 1 : 0)) * 31) + (this.isFinal ? 1 : 0);
    }
}
