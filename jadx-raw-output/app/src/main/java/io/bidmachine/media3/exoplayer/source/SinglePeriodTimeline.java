package io.bidmachine.media3.exoplayer.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes11.dex */
@UnstableApi
public final class SinglePeriodTimeline extends Timeline {
    private final long elapsedRealtimeEpochOffsetMs;
    private final boolean isDynamic;
    private final boolean isSeekable;

    @Nullable
    private final MediaItem.LiveConfiguration liveConfiguration;

    @Nullable
    private final Object manifest;

    @Nullable
    private final MediaItem mediaItem;
    private final long periodDurationUs;
    private final long presentationStartTimeMs;
    private final boolean suppressPositionProjection;
    private final long windowDefaultStartPositionUs;
    private final long windowDurationUs;
    private final long windowPositionInPeriodUs;
    private final long windowStartTimeMs;
    private static final Object UID = new Object();
    private static final MediaItem MEDIA_ITEM = new MediaItem.Builder().setMediaId("SinglePeriodTimeline").setUri(Uri.EMPTY).build();

    @Deprecated
    public SinglePeriodTimeline(long j10, boolean z10, boolean z11, boolean z12, @Nullable Object obj, @Nullable Object obj2) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, obj2);
    }

    @Override // io.bidmachine.media3.common.Timeline
    public Timeline.Period getPeriod(int i10, Timeline.Period period, boolean z10) {
        Assertions.checkIndex(i10, 0, 1);
        return period.set(null, z10 ? UID : null, 0, this.periodDurationUs, -this.windowPositionInPeriodUs);
    }

    @Override // io.bidmachine.media3.common.Timeline
    public int getPeriodCount() {
        return 1;
    }

    @Override // io.bidmachine.media3.common.Timeline
    public Object getUidOfPeriod(int i10) {
        Assertions.checkIndex(i10, 0, 1);
        return UID;
    }

    @Override // io.bidmachine.media3.common.Timeline
    public int getWindowCount() {
        return 1;
    }

    public SinglePeriodTimeline(long j10, boolean z10, boolean z11, boolean z12, @Nullable Object obj, MediaItem mediaItem) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, mediaItem);
    }

    @Override // io.bidmachine.media3.common.Timeline
    public int getIndexOfPeriod(Object obj) {
        return UID.equals(obj) ? 0 : -1;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e A[PHI: r1
  0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x0012, B:5:0x0016, B:7:0x001c, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // io.bidmachine.media3.common.Timeline
    public Timeline.Window getWindow(int i10, Timeline.Window window, long j10) {
        long j11;
        Assertions.checkIndex(i10, 0, 1);
        long j12 = this.windowDefaultStartPositionUs;
        boolean z10 = this.isDynamic;
        if (!z10 || this.suppressPositionProjection || j10 == 0) {
            j11 = j12;
        } else {
            long j13 = this.windowDurationUs;
            if (j13 != -9223372036854775807L) {
                j12 += j10;
                if (j12 <= j13) {
                    j11 = j12;
                }
            }
            j11 = -9223372036854775807L;
        }
        return window.set(Timeline.Window.SINGLE_WINDOW_UID, this.mediaItem, this.manifest, this.presentationStartTimeMs, this.windowStartTimeMs, this.elapsedRealtimeEpochOffsetMs, this.isSeekable, z10, this.liveConfiguration, j11, this.windowDurationUs, 0, 0, this.windowPositionInPeriodUs);
    }

    @Deprecated
    public SinglePeriodTimeline(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, @Nullable Object obj, @Nullable Object obj2) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, z12, obj, obj2);
    }

    public SinglePeriodTimeline(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, @Nullable Object obj, MediaItem mediaItem) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, false, obj, mediaItem, z12 ? mediaItem.liveConfiguration : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public SinglePeriodTimeline(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, @Nullable Object obj, @Nullable Object obj2) {
        MediaItem mediaItem = MEDIA_ITEM;
        this(j10, j11, j12, j13, j14, j15, j16, z10, z11, false, obj, mediaItem.buildUpon().setTag(obj2).build(), z12 ? mediaItem.liveConfiguration : null);
    }

    @Deprecated
    public SinglePeriodTimeline(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, @Nullable Object obj, MediaItem mediaItem, @Nullable MediaItem.LiveConfiguration liveConfiguration) {
        this(j10, j11, j12, j13, j14, j15, j16, z10, z11, false, obj, mediaItem, liveConfiguration);
    }

    public SinglePeriodTimeline(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, @Nullable Object obj, MediaItem mediaItem, @Nullable MediaItem.LiveConfiguration liveConfiguration) {
        this.presentationStartTimeMs = j10;
        this.windowStartTimeMs = j11;
        this.elapsedRealtimeEpochOffsetMs = j12;
        this.periodDurationUs = j13;
        this.windowDurationUs = j14;
        this.windowPositionInPeriodUs = j15;
        this.windowDefaultStartPositionUs = j16;
        this.isSeekable = z10;
        this.isDynamic = z11;
        this.suppressPositionProjection = z12;
        this.manifest = obj;
        this.mediaItem = (MediaItem) Assertions.checkNotNull(mediaItem);
        this.liveConfiguration = liveConfiguration;
    }
}
