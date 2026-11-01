package io.bidmachine.media3.exoplayer.source.ads;

import androidx.annotation.VisibleForTesting;
import io.bidmachine.media3.common.AdPlaybackState;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.source.ForwardingTimeline;

/* JADX INFO: loaded from: classes11.dex */
@VisibleForTesting(otherwise = 3)
@UnstableApi
public final class SinglePeriodAdTimeline extends ForwardingTimeline {
    private final AdPlaybackState adPlaybackState;

    @Override // io.bidmachine.media3.exoplayer.source.ForwardingTimeline, io.bidmachine.media3.common.Timeline
    public Timeline.Period getPeriod(int i10, Timeline.Period period, boolean z10) {
        this.timeline.getPeriod(i10, period, z10);
        long j10 = period.durationUs;
        if (j10 == -9223372036854775807L) {
            j10 = this.adPlaybackState.contentDurationUs;
        }
        period.set(period.f59771id, period.uid, period.windowIndex, j10, period.getPositionInWindowUs(), this.adPlaybackState, period.isPlaceholder);
        return period;
    }

    public SinglePeriodAdTimeline(Timeline timeline, AdPlaybackState adPlaybackState) {
        boolean z10;
        super(timeline);
        if (timeline.getPeriodCount() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkState(z10);
        Assertions.checkState(timeline.getWindowCount() == 1);
        this.adPlaybackState = adPlaybackState;
    }
}
