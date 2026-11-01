package io.bidmachine.media3.exoplayer.source;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.upstream.Allocator;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
@UnstableApi
public final class ClippingMediaSource extends WrappingMediaSource {
    private final boolean allowDynamicClippingUpdates;

    @Nullable
    private IllegalClippingException clippingError;

    @Nullable
    private a clippingTimeline;
    private final boolean enableInitialDiscontinuity;
    private final long endUs;
    private final ArrayList<ClippingMediaPeriod> mediaPeriods;
    private long periodEndUs;
    private long periodStartUs;
    private final boolean relativeToDefaultPosition;
    private final long startUs;
    private final Timeline.Window window;

    public static final class IllegalClippingException extends IOException {
        public static final int REASON_INVALID_PERIOD_COUNT = 0;
        public static final int REASON_NOT_SEEKABLE_TO_START = 1;
        public static final int REASON_START_EXCEEDS_END = 2;
        public final int reason;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Reason {
        }

        private static String getReasonDescription(int i10) {
            if (i10 == 0) {
                return "invalid period count";
            }
            if (i10 != 1) {
                return i10 != 2 ? "unknown" : "start exceeds end";
            }
            return "not seekable to start";
        }

        public IllegalClippingException(int i10) {
            super("Illegal clipping: " + getReasonDescription(i10));
            this.reason = i10;
        }
    }

    public static final class a extends ForwardingTimeline {
        private final long durationUs;
        private final long endUs;
        private final boolean isDynamic;
        private final long startUs;

        @Override // io.bidmachine.media3.exoplayer.source.ForwardingTimeline, io.bidmachine.media3.common.Timeline
        public Timeline.Period getPeriod(int i10, Timeline.Period period, boolean z10) {
            this.timeline.getPeriod(0, period, z10);
            long positionInWindowUs = period.getPositionInWindowUs() - this.startUs;
            long j10 = this.durationUs;
            return period.set(period.f59771id, period.uid, 0, j10 == -9223372036854775807L ? -9223372036854775807L : j10 - positionInWindowUs, positionInWindowUs);
        }

        @Override // io.bidmachine.media3.exoplayer.source.ForwardingTimeline, io.bidmachine.media3.common.Timeline
        public Timeline.Window getWindow(int i10, Timeline.Window window, long j10) {
            this.timeline.getWindow(0, window, 0L);
            long j11 = window.positionInFirstPeriodUs;
            long j12 = this.startUs;
            window.positionInFirstPeriodUs = j11 + j12;
            window.durationUs = this.durationUs;
            window.isDynamic = this.isDynamic;
            long j13 = window.defaultPositionUs;
            if (j13 != -9223372036854775807L) {
                long jMax = Math.max(j13, j12);
                window.defaultPositionUs = jMax;
                long j14 = this.endUs;
                if (j14 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j14);
                }
                window.defaultPositionUs = jMax - this.startUs;
            }
            long jUsToMs = Util.usToMs(this.startUs);
            long j15 = window.presentationStartTimeMs;
            if (j15 != -9223372036854775807L) {
                window.presentationStartTimeMs = j15 + jUsToMs;
            }
            long j16 = window.windowStartTimeMs;
            if (j16 != -9223372036854775807L) {
                window.windowStartTimeMs = j16 + jUsToMs;
            }
            return window;
        }

        public a(Timeline timeline, long j10, long j11) throws IllegalClippingException {
            long jMax;
            long j12;
            super(timeline);
            boolean z10 = false;
            if (timeline.getPeriodCount() == 1) {
                Timeline.Window window = timeline.getWindow(0, new Timeline.Window());
                long jMax2 = Math.max(0L, j10);
                if (!window.isPlaceholder && jMax2 != 0 && !window.isSeekable) {
                    throw new IllegalClippingException(1);
                }
                if (j11 == Long.MIN_VALUE) {
                    jMax = window.durationUs;
                } else {
                    jMax = Math.max(0L, j11);
                }
                long j13 = window.durationUs;
                if (j13 != -9223372036854775807L) {
                    jMax = jMax > j13 ? j13 : jMax;
                    if (jMax2 > jMax) {
                        throw new IllegalClippingException(2);
                    }
                }
                this.startUs = jMax2;
                this.endUs = jMax;
                if (jMax == -9223372036854775807L) {
                    j12 = -9223372036854775807L;
                } else {
                    j12 = jMax - jMax2;
                }
                this.durationUs = j12;
                if (window.isDynamic && (jMax == -9223372036854775807L || (j13 != -9223372036854775807L && jMax == j13))) {
                    z10 = true;
                }
                this.isDynamic = z10;
                return;
            }
            throw new IllegalClippingException(0);
        }
    }

    public ClippingMediaSource(MediaSource mediaSource, long j10, long j11) {
        this(mediaSource, j10, j11, true, false, false);
    }

    private void refreshClippedTimeline(Timeline timeline) {
        long j10;
        long j11;
        timeline.getWindow(0, this.window);
        long positionInFirstPeriodUs = this.window.getPositionInFirstPeriodUs();
        if (this.clippingTimeline == null || this.mediaPeriods.isEmpty() || this.allowDynamicClippingUpdates) {
            long j12 = this.startUs;
            long j13 = this.endUs;
            if (this.relativeToDefaultPosition) {
                long defaultPositionUs = this.window.getDefaultPositionUs();
                j12 += defaultPositionUs;
                j13 += defaultPositionUs;
            }
            this.periodStartUs = positionInFirstPeriodUs + j12;
            this.periodEndUs = this.endUs != Long.MIN_VALUE ? positionInFirstPeriodUs + j13 : Long.MIN_VALUE;
            int size = this.mediaPeriods.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.mediaPeriods.get(i10).updateClipping(this.periodStartUs, this.periodEndUs);
            }
            j10 = j12;
            j11 = j13;
        } else {
            long j14 = this.periodStartUs - positionInFirstPeriodUs;
            j11 = this.endUs != Long.MIN_VALUE ? this.periodEndUs - positionInFirstPeriodUs : Long.MIN_VALUE;
            j10 = j14;
        }
        try {
            a aVar = new a(timeline, j10, j11);
            this.clippingTimeline = aVar;
            refreshSourceInfo(aVar);
        } catch (IllegalClippingException e10) {
            this.clippingError = e10;
            for (int i11 = 0; i11 < this.mediaPeriods.size(); i11++) {
                this.mediaPeriods.get(i11).setClippingError(this.clippingError);
            }
        }
    }

    public ClippingMediaSource(MediaSource mediaSource, long j10) {
        this(mediaSource, 0L, j10, true, false, true);
    }

    @Override // io.bidmachine.media3.exoplayer.source.WrappingMediaSource, io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j10) {
        ClippingMediaPeriod clippingMediaPeriod = new ClippingMediaPeriod(this.mediaSource.createPeriod(mediaPeriodId, allocator, j10), this.enableInitialDiscontinuity, this.periodStartUs, this.periodEndUs);
        this.mediaPeriods.add(clippingMediaPeriod);
        return clippingMediaPeriod;
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        IllegalClippingException illegalClippingException = this.clippingError;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // io.bidmachine.media3.exoplayer.source.WrappingMediaSource
    public void onChildSourceInfoRefreshed(Timeline timeline) {
        if (this.clippingError != null) {
            return;
        }
        refreshClippedTimeline(timeline);
    }

    @Override // io.bidmachine.media3.exoplayer.source.WrappingMediaSource, io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        Assertions.checkState(this.mediaPeriods.remove(mediaPeriod));
        this.mediaSource.releasePeriod(((ClippingMediaPeriod) mediaPeriod).mediaPeriod);
        if (!this.mediaPeriods.isEmpty() || this.allowDynamicClippingUpdates) {
            return;
        }
        refreshClippedTimeline(((a) Assertions.checkNotNull(this.clippingTimeline)).timeline);
    }

    public ClippingMediaSource(MediaSource mediaSource, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        super((MediaSource) Assertions.checkNotNull(mediaSource));
        Assertions.checkArgument(j10 >= 0);
        this.startUs = j10;
        this.endUs = j11;
        this.enableInitialDiscontinuity = z10;
        this.allowDynamicClippingUpdates = z11;
        this.relativeToDefaultPosition = z12;
        this.mediaPeriods = new ArrayList<>();
        this.window = new Timeline.Window();
    }

    @Override // io.bidmachine.media3.exoplayer.source.WrappingMediaSource, io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        if (getMediaItem().clippingConfiguration.equals(mediaItem.clippingConfiguration) && this.mediaSource.canUpdateMediaItem(mediaItem)) {
            return true;
        }
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.clippingError = null;
        this.clippingTimeline = null;
    }
}
