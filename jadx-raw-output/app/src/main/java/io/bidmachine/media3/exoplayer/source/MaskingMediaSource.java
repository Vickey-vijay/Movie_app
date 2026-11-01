package io.bidmachine.media3.exoplayer.source;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.media3.common.AdPlaybackState;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.upstream.Allocator;

/* JADX INFO: loaded from: classes11.dex */
@UnstableApi
public final class MaskingMediaSource extends WrappingMediaSource {
    private boolean hasRealTimeline;
    private boolean hasStartedPreparing;
    private boolean isPrepared;
    private final Timeline.Period period;
    private a timeline;

    @Nullable
    private MaskingMediaPeriod unpreparedMaskingMediaPeriod;
    private final boolean useLazyPreparation;
    private final Timeline.Window window;

    @VisibleForTesting
    public static final class PlaceholderTimeline extends Timeline {
        private final MediaItem mediaItem;

        @Override // io.bidmachine.media3.common.Timeline
        public Timeline.Period getPeriod(int i10, Timeline.Period period, boolean z10) {
            period.set(z10 ? 0 : null, z10 ? a.MASKING_EXTERNAL_PERIOD_UID : null, 0, -9223372036854775807L, 0L, AdPlaybackState.NONE, true);
            return period;
        }

        @Override // io.bidmachine.media3.common.Timeline
        public int getPeriodCount() {
            return 1;
        }

        @Override // io.bidmachine.media3.common.Timeline
        public int getWindowCount() {
            return 1;
        }

        @Override // io.bidmachine.media3.common.Timeline
        public int getIndexOfPeriod(Object obj) {
            return obj == a.MASKING_EXTERNAL_PERIOD_UID ? 0 : -1;
        }

        @Override // io.bidmachine.media3.common.Timeline
        public Object getUidOfPeriod(int i10) {
            return a.MASKING_EXTERNAL_PERIOD_UID;
        }

        @Override // io.bidmachine.media3.common.Timeline
        public Timeline.Window getWindow(int i10, Timeline.Window window, long j10) {
            window.set(Timeline.Window.SINGLE_WINDOW_UID, this.mediaItem, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            window.isPlaceholder = true;
            return window;
        }

        public PlaceholderTimeline(MediaItem mediaItem) {
            this.mediaItem = mediaItem;
        }
    }

    public static final class a extends ForwardingTimeline {
        public static final Object MASKING_EXTERNAL_PERIOD_UID = new Object();

        @Nullable
        private final Object replacedInternalPeriodUid;

        @Nullable
        private final Object replacedInternalWindowUid;

        public static a createWithPlaceholderTimeline(MediaItem mediaItem) {
            return new a(new PlaceholderTimeline(mediaItem), Timeline.Window.SINGLE_WINDOW_UID, MASKING_EXTERNAL_PERIOD_UID);
        }

        public static a createWithRealTimeline(Timeline timeline, @Nullable Object obj, @Nullable Object obj2) {
            return new a(timeline, obj, obj2);
        }

        public a cloneWithUpdatedTimeline(Timeline timeline) {
            return new a(timeline, this.replacedInternalWindowUid, this.replacedInternalPeriodUid);
        }

        @Override // io.bidmachine.media3.exoplayer.source.ForwardingTimeline, io.bidmachine.media3.common.Timeline
        public int getIndexOfPeriod(Object obj) {
            Object obj2;
            Timeline timeline = this.timeline;
            if (MASKING_EXTERNAL_PERIOD_UID.equals(obj) && (obj2 = this.replacedInternalPeriodUid) != null) {
                obj = obj2;
            }
            return timeline.getIndexOfPeriod(obj);
        }

        @Override // io.bidmachine.media3.exoplayer.source.ForwardingTimeline, io.bidmachine.media3.common.Timeline
        public Timeline.Period getPeriod(int i10, Timeline.Period period, boolean z10) {
            this.timeline.getPeriod(i10, period, z10);
            if (Util.areEqual(period.uid, this.replacedInternalPeriodUid) && z10) {
                period.uid = MASKING_EXTERNAL_PERIOD_UID;
            }
            return period;
        }

        @Override // io.bidmachine.media3.exoplayer.source.ForwardingTimeline, io.bidmachine.media3.common.Timeline
        public Object getUidOfPeriod(int i10) {
            Object uidOfPeriod = this.timeline.getUidOfPeriod(i10);
            return Util.areEqual(uidOfPeriod, this.replacedInternalPeriodUid) ? MASKING_EXTERNAL_PERIOD_UID : uidOfPeriod;
        }

        @Override // io.bidmachine.media3.exoplayer.source.ForwardingTimeline, io.bidmachine.media3.common.Timeline
        public Timeline.Window getWindow(int i10, Timeline.Window window, long j10) {
            this.timeline.getWindow(i10, window, j10);
            if (Util.areEqual(window.uid, this.replacedInternalWindowUid)) {
                window.uid = Timeline.Window.SINGLE_WINDOW_UID;
            }
            return window;
        }

        private a(Timeline timeline, @Nullable Object obj, @Nullable Object obj2) {
            super(timeline);
            this.replacedInternalWindowUid = obj;
            this.replacedInternalPeriodUid = obj2;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // io.bidmachine.media3.exoplayer.source.WrappingMediaSource, io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((MaskingMediaPeriod) mediaPeriod).releasePeriod();
        if (mediaPeriod == this.unpreparedMaskingMediaPeriod) {
            this.unpreparedMaskingMediaPeriod = null;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        this.isPrepared = false;
        this.hasStartedPreparing = false;
        super.releaseSourceInternal();
    }

    private Object getExternalPeriodUid(Object obj) {
        return (this.timeline.replacedInternalPeriodUid == null || !this.timeline.replacedInternalPeriodUid.equals(obj)) ? obj : a.MASKING_EXTERNAL_PERIOD_UID;
    }

    private Object getInternalPeriodUid(Object obj) {
        return (this.timeline.replacedInternalPeriodUid == null || !obj.equals(a.MASKING_EXTERNAL_PERIOD_UID)) ? obj : this.timeline.replacedInternalPeriodUid;
    }

    private boolean setPreparePositionOverrideToUnpreparedMaskingPeriod(long j10) {
        MaskingMediaPeriod maskingMediaPeriod = this.unpreparedMaskingMediaPeriod;
        int indexOfPeriod = this.timeline.getIndexOfPeriod(maskingMediaPeriod.f59892id.periodUid);
        if (indexOfPeriod == -1) {
            return false;
        }
        long j11 = this.timeline.getPeriod(indexOfPeriod, this.period).durationUs;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        maskingMediaPeriod.overridePreparePositionUs(j10);
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.source.WrappingMediaSource, io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        return this.mediaSource.canUpdateMediaItem(mediaItem);
    }

    @Override // io.bidmachine.media3.exoplayer.source.WrappingMediaSource, io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public MaskingMediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j10) {
        MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(mediaPeriodId, allocator, j10);
        maskingMediaPeriod.setMediaSource(this.mediaSource);
        if (this.isPrepared) {
            maskingMediaPeriod.createPeriod(mediaPeriodId.copyWithPeriodUid(getInternalPeriodUid(mediaPeriodId.periodUid)));
        } else {
            this.unpreparedMaskingMediaPeriod = maskingMediaPeriod;
            if (!this.hasStartedPreparing) {
                this.hasStartedPreparing = true;
                prepareChildSource();
            }
        }
        return maskingMediaPeriod;
    }

    @Override // io.bidmachine.media3.exoplayer.source.WrappingMediaSource
    @Nullable
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId.copyWithPeriodUid(getExternalPeriodUid(mediaPeriodId.periodUid));
    }

    public Timeline getTimeline() {
        return this.timeline;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x00be  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // io.bidmachine.media3.exoplayer.source.WrappingMediaSource
    public void onChildSourceInfoRefreshed(Timeline timeline) {
        long j10;
        MediaSource.MediaPeriodId mediaPeriodIdCopyWithPeriodUid;
        if (this.isPrepared) {
            this.timeline = this.timeline.cloneWithUpdatedTimeline(timeline);
            MaskingMediaPeriod maskingMediaPeriod = this.unpreparedMaskingMediaPeriod;
            if (maskingMediaPeriod != null) {
                setPreparePositionOverrideToUnpreparedMaskingPeriod(maskingMediaPeriod.getPreparePositionOverrideUs());
            }
        } else {
            if (!timeline.isEmpty()) {
                timeline.getWindow(0, this.window);
                long defaultPositionUs = this.window.getDefaultPositionUs();
                Object obj = this.window.uid;
                MaskingMediaPeriod maskingMediaPeriod2 = this.unpreparedMaskingMediaPeriod;
                if (maskingMediaPeriod2 != null) {
                    long preparePositionUs = maskingMediaPeriod2.getPreparePositionUs();
                    this.timeline.getPeriodByUid(this.unpreparedMaskingMediaPeriod.f59892id.periodUid, this.period);
                    long positionInWindowUs = this.period.getPositionInWindowUs() + preparePositionUs;
                    if (positionInWindowUs != this.timeline.getWindow(0, this.window).getDefaultPositionUs()) {
                        j10 = positionInWindowUs;
                    } else {
                        j10 = defaultPositionUs;
                    }
                } else {
                    j10 = defaultPositionUs;
                }
                Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, 0, j10);
                Object obj2 = periodPositionUs.first;
                long jLongValue = ((Long) periodPositionUs.second).longValue();
                this.timeline = this.hasRealTimeline ? this.timeline.cloneWithUpdatedTimeline(timeline) : a.createWithRealTimeline(timeline, obj, obj2);
                MaskingMediaPeriod maskingMediaPeriod3 = this.unpreparedMaskingMediaPeriod;
                if (maskingMediaPeriod3 != null && setPreparePositionOverrideToUnpreparedMaskingPeriod(jLongValue)) {
                    MediaSource.MediaPeriodId mediaPeriodId = maskingMediaPeriod3.f59892id;
                    mediaPeriodIdCopyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(getInternalPeriodUid(mediaPeriodId.periodUid));
                }
                this.hasRealTimeline = true;
                this.isPrepared = true;
                refreshSourceInfo(this.timeline);
                if (mediaPeriodIdCopyWithPeriodUid != null) {
                    ((MaskingMediaPeriod) Assertions.checkNotNull(this.unpreparedMaskingMediaPeriod)).createPeriod(mediaPeriodIdCopyWithPeriodUid);
                }
            }
            this.timeline = this.hasRealTimeline ? this.timeline.cloneWithUpdatedTimeline(timeline) : a.createWithRealTimeline(timeline, Timeline.Window.SINGLE_WINDOW_UID, a.MASKING_EXTERNAL_PERIOD_UID);
        }
        mediaPeriodIdCopyWithPeriodUid = null;
        this.hasRealTimeline = true;
        this.isPrepared = true;
        refreshSourceInfo(this.timeline);
        if (mediaPeriodIdCopyWithPeriodUid != null) {
            ((MaskingMediaPeriod) Assertions.checkNotNull(this.unpreparedMaskingMediaPeriod)).createPeriod(mediaPeriodIdCopyWithPeriodUid);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.WrappingMediaSource
    public void prepareSourceInternal() {
        if (this.useLazyPreparation) {
            return;
        }
        this.hasStartedPreparing = true;
        prepareChildSource();
    }

    @Override // io.bidmachine.media3.exoplayer.source.WrappingMediaSource, io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public void updateMediaItem(MediaItem mediaItem) {
        if (this.hasRealTimeline) {
            this.timeline = this.timeline.cloneWithUpdatedTimeline(new TimelineWithUpdatedMediaItem(this.timeline.timeline, mediaItem));
        } else {
            this.timeline = a.createWithPlaceholderTimeline(mediaItem);
        }
        this.mediaSource.updateMediaItem(mediaItem);
    }

    public MaskingMediaSource(MediaSource mediaSource, boolean z10) {
        boolean z11;
        super(mediaSource);
        if (z10 && mediaSource.isSingleWindow()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.useLazyPreparation = z11;
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        Timeline initialTimeline = mediaSource.getInitialTimeline();
        if (initialTimeline != null) {
            this.timeline = a.createWithRealTimeline(initialTimeline, null, null);
            this.hasRealTimeline = true;
        } else {
            this.timeline = a.createWithPlaceholderTimeline(mediaSource.getMediaItem());
        }
    }
}
