package io.bidmachine.media3.exoplayer.source;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.AbstractConcatenatedTimeline;
import io.bidmachine.media3.exoplayer.upstream.Allocator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
@UnstableApi
@Deprecated
public final class LoopingMediaSource extends WrappingMediaSource {
    private final Map<MediaSource.MediaPeriodId, MediaSource.MediaPeriodId> childMediaPeriodIdToMediaPeriodId;
    private final int loopCount;
    private final Map<MediaPeriod, MediaSource.MediaPeriodId> mediaPeriodToChildMediaPeriodId;

    public static final class a extends ForwardingTimeline {
        @Override // io.bidmachine.media3.exoplayer.source.ForwardingTimeline, io.bidmachine.media3.common.Timeline
        public int getNextWindowIndex(int i10, int i11, boolean z10) {
            int nextWindowIndex = this.timeline.getNextWindowIndex(i10, i11, z10);
            return nextWindowIndex == -1 ? getFirstWindowIndex(z10) : nextWindowIndex;
        }

        @Override // io.bidmachine.media3.exoplayer.source.ForwardingTimeline, io.bidmachine.media3.common.Timeline
        public int getPreviousWindowIndex(int i10, int i11, boolean z10) {
            int previousWindowIndex = this.timeline.getPreviousWindowIndex(i10, i11, z10);
            return previousWindowIndex == -1 ? getLastWindowIndex(z10) : previousWindowIndex;
        }

        public a(Timeline timeline) {
            super(timeline);
        }
    }

    public static final class b extends AbstractConcatenatedTimeline {
        private final int childPeriodCount;
        private final Timeline childTimeline;
        private final int childWindowCount;
        private final int loopCount;

        public b(Timeline timeline, int i10) {
            super(false, new ShuffleOrder.UnshuffledShuffleOrder(i10));
            this.childTimeline = timeline;
            int periodCount = timeline.getPeriodCount();
            this.childPeriodCount = periodCount;
            this.childWindowCount = timeline.getWindowCount();
            this.loopCount = i10;
            if (periodCount > 0) {
                Assertions.checkState(i10 <= Integer.MAX_VALUE / periodCount, "LoopingMediaSource contains too many periods");
            }
        }

        @Override // io.bidmachine.media3.exoplayer.AbstractConcatenatedTimeline
        public int getChildIndexByChildUid(Object obj) {
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            return -1;
        }

        @Override // io.bidmachine.media3.exoplayer.AbstractConcatenatedTimeline
        public int getChildIndexByPeriodIndex(int i10) {
            return i10 / this.childPeriodCount;
        }

        @Override // io.bidmachine.media3.exoplayer.AbstractConcatenatedTimeline
        public int getChildIndexByWindowIndex(int i10) {
            return i10 / this.childWindowCount;
        }

        @Override // io.bidmachine.media3.exoplayer.AbstractConcatenatedTimeline
        public int getFirstPeriodIndexByChildIndex(int i10) {
            return i10 * this.childPeriodCount;
        }

        @Override // io.bidmachine.media3.exoplayer.AbstractConcatenatedTimeline
        public int getFirstWindowIndexByChildIndex(int i10) {
            return i10 * this.childWindowCount;
        }

        @Override // io.bidmachine.media3.common.Timeline
        public int getPeriodCount() {
            return this.childPeriodCount * this.loopCount;
        }

        @Override // io.bidmachine.media3.exoplayer.AbstractConcatenatedTimeline
        public Timeline getTimelineByChildIndex(int i10) {
            return this.childTimeline;
        }

        @Override // io.bidmachine.media3.common.Timeline
        public int getWindowCount() {
            return this.childWindowCount * this.loopCount;
        }

        @Override // io.bidmachine.media3.exoplayer.AbstractConcatenatedTimeline
        public Object getChildUidByChildIndex(int i10) {
            return Integer.valueOf(i10);
        }
    }

    public LoopingMediaSource(MediaSource mediaSource) {
        this(mediaSource, Integer.MAX_VALUE);
    }

    @Override // io.bidmachine.media3.exoplayer.source.WrappingMediaSource, io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public boolean isSingleWindow() {
        return false;
    }

    public LoopingMediaSource(MediaSource mediaSource, int i10) {
        super(new MaskingMediaSource(mediaSource, false));
        Assertions.checkArgument(i10 > 0);
        this.loopCount = i10;
        this.childMediaPeriodIdToMediaPeriodId = new HashMap();
        this.mediaPeriodToChildMediaPeriodId = new HashMap();
    }

    @Override // io.bidmachine.media3.exoplayer.source.WrappingMediaSource, io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j10) {
        if (this.loopCount == Integer.MAX_VALUE) {
            return this.mediaSource.createPeriod(mediaPeriodId, allocator, j10);
        }
        MediaSource.MediaPeriodId mediaPeriodIdCopyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(AbstractConcatenatedTimeline.getChildPeriodUidFromConcatenatedUid(mediaPeriodId.periodUid));
        this.childMediaPeriodIdToMediaPeriodId.put(mediaPeriodIdCopyWithPeriodUid, mediaPeriodId);
        MediaPeriod mediaPeriodCreatePeriod = this.mediaSource.createPeriod(mediaPeriodIdCopyWithPeriodUid, allocator, j10);
        this.mediaPeriodToChildMediaPeriodId.put(mediaPeriodCreatePeriod, mediaPeriodIdCopyWithPeriodUid);
        return mediaPeriodCreatePeriod;
    }

    @Override // io.bidmachine.media3.exoplayer.source.WrappingMediaSource, io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    @Nullable
    public Timeline getInitialTimeline() {
        MaskingMediaSource maskingMediaSource = (MaskingMediaSource) this.mediaSource;
        return this.loopCount != Integer.MAX_VALUE ? new b(maskingMediaSource.getTimeline(), this.loopCount) : new a(maskingMediaSource.getTimeline());
    }

    @Override // io.bidmachine.media3.exoplayer.source.WrappingMediaSource
    @Nullable
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId) {
        return this.loopCount != Integer.MAX_VALUE ? this.childMediaPeriodIdToMediaPeriodId.get(mediaPeriodId) : mediaPeriodId;
    }

    @Override // io.bidmachine.media3.exoplayer.source.WrappingMediaSource
    public void onChildSourceInfoRefreshed(Timeline timeline) {
        refreshSourceInfo(this.loopCount != Integer.MAX_VALUE ? new b(timeline, this.loopCount) : new a(timeline));
    }

    @Override // io.bidmachine.media3.exoplayer.source.WrappingMediaSource, io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        this.mediaSource.releasePeriod(mediaPeriod);
        MediaSource.MediaPeriodId mediaPeriodIdRemove = this.mediaPeriodToChildMediaPeriodId.remove(mediaPeriod);
        if (mediaPeriodIdRemove != null) {
            this.childMediaPeriodIdToMediaPeriodId.remove(mediaPeriodIdRemove);
        }
    }
}
