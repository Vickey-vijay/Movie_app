package io.bidmachine.media3.exoplayer.source;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.datasource.TransferListener;
import io.bidmachine.media3.exoplayer.upstream.Allocator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@UnstableApi
public final class ConcatenatingMediaSource2 extends CompositeMediaSource<Integer> {
    private static final int MSG_UPDATE_TIMELINE = 1;

    @GuardedBy("this")
    private MediaItem mediaItem;
    private final IdentityHashMap<MediaPeriod, c> mediaSourceByMediaPeriod;
    private final ImmutableList<c> mediaSourceHolders;

    @Nullable
    private Handler playbackThreadHandler;
    private boolean timelineUpdateScheduled;

    public static final class Builder {
        private int index;

        @Nullable
        private MediaItem mediaItem;

        @Nullable
        private MediaSource.Factory mediaSourceFactory;
        private final ImmutableList.a<c> mediaSourceHoldersBuilder = ImmutableList.builder();

        public Builder add(MediaItem mediaItem) {
            return add(mediaItem, -9223372036854775807L);
        }

        public Builder add(MediaItem mediaItem, long j10) {
            Assertions.checkNotNull(mediaItem);
            if (j10 == -9223372036854775807L) {
                MediaItem.ClippingConfiguration clippingConfiguration = mediaItem.clippingConfiguration;
                if (clippingConfiguration.endPositionMs != Long.MIN_VALUE) {
                    j10 = Util.usToMs(clippingConfiguration.endPositionUs - clippingConfiguration.startPositionUs);
                }
            }
            Assertions.checkStateNotNull(this.mediaSourceFactory, "Must use useDefaultMediaSourceFactory or setMediaSourceFactory first.");
            return add(this.mediaSourceFactory.createMediaSource(mediaItem), j10);
        }

        public ConcatenatingMediaSource2 build() {
            Assertions.checkArgument(this.index > 0, "Must add at least one source to the concatenation.");
            if (this.mediaItem == null) {
                this.mediaItem = MediaItem.fromUri(Uri.EMPTY);
            }
            return new ConcatenatingMediaSource2(this.mediaItem, this.mediaSourceHoldersBuilder.m());
        }

        public Builder setMediaItem(MediaItem mediaItem) {
            this.mediaItem = mediaItem;
            return this;
        }

        public Builder useDefaultMediaSourceFactory(Context context) {
            return setMediaSourceFactory(new DefaultMediaSourceFactory(context));
        }

        public Builder setMediaSourceFactory(MediaSource.Factory factory) {
            this.mediaSourceFactory = (MediaSource.Factory) Assertions.checkNotNull(factory);
            return this;
        }

        public Builder add(MediaSource mediaSource) {
            return add(mediaSource, -9223372036854775807L);
        }

        public Builder add(MediaSource mediaSource, long j10) {
            Assertions.checkNotNull(mediaSource);
            Assertions.checkState(((mediaSource instanceof ProgressiveMediaSource) && j10 == -9223372036854775807L) ? false : true, "Progressive media source must define an initial placeholder duration.");
            ImmutableList.a<c> aVar = this.mediaSourceHoldersBuilder;
            int i10 = this.index;
            this.index = i10 + 1;
            aVar.a(new c(mediaSource, i10, Util.msToUs(j10)));
            return this;
        }
    }

    public static final class b extends Timeline {
        private final long defaultPositionUs;
        private final long durationUs;
        private final ImmutableList<Integer> firstPeriodIndices;
        private final boolean isDynamic;
        private final boolean isSeekable;

        @Nullable
        private final Object manifest;
        private final MediaItem mediaItem;
        private final ImmutableList<Long> periodOffsetsInWindowUs;
        private final ImmutableList<Timeline> timelines;

        @Override // io.bidmachine.media3.common.Timeline
        public int getWindowCount() {
            return 1;
        }

        private int getChildIndexByPeriodIndex(int i10) {
            return Util.binarySearchFloor((List<? extends Comparable<? super Integer>>) this.firstPeriodIndices, Integer.valueOf(i10 + 1), false, false);
        }

        private long getPeriodDurationUs(Timeline.Period period, int i10) {
            if (period.durationUs == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return (i10 == this.periodOffsetsInWindowUs.size() + (-1) ? this.durationUs : this.periodOffsetsInWindowUs.get(i10 + 1).longValue()) - this.periodOffsetsInWindowUs.get(i10).longValue();
        }

        @Override // io.bidmachine.media3.common.Timeline
        public int getIndexOfPeriod(Object obj) {
            if (!(obj instanceof Pair) || !(((Pair) obj).first instanceof Integer)) {
                return -1;
            }
            int childIndex = ConcatenatingMediaSource2.getChildIndex(obj);
            int indexOfPeriod = this.timelines.get(childIndex).getIndexOfPeriod(ConcatenatingMediaSource2.getChildPeriodUid(obj));
            if (indexOfPeriod == -1) {
                return -1;
            }
            return this.firstPeriodIndices.get(childIndex).intValue() + indexOfPeriod;
        }

        @Override // io.bidmachine.media3.common.Timeline
        public int getPeriodCount() {
            return this.periodOffsetsInWindowUs.size();
        }

        @Override // io.bidmachine.media3.common.Timeline
        public Timeline.Window getWindow(int i10, Timeline.Window window, long j10) {
            return window.set(Timeline.Window.SINGLE_WINDOW_UID, this.mediaItem, this.manifest, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.isSeekable, this.isDynamic, null, this.defaultPositionUs, this.durationUs, 0, getPeriodCount() - 1, -this.periodOffsetsInWindowUs.get(0).longValue());
        }

        public b(MediaItem mediaItem, ImmutableList<Timeline> immutableList, ImmutableList<Integer> immutableList2, ImmutableList<Long> immutableList3, boolean z10, boolean z11, long j10, long j11, @Nullable Object obj) {
            this.mediaItem = mediaItem;
            this.timelines = immutableList;
            this.firstPeriodIndices = immutableList2;
            this.periodOffsetsInWindowUs = immutableList3;
            this.isSeekable = z10;
            this.isDynamic = z11;
            this.durationUs = j10;
            this.defaultPositionUs = j11;
            this.manifest = obj;
        }

        @Override // io.bidmachine.media3.common.Timeline
        public Timeline.Period getPeriod(int i10, Timeline.Period period, boolean z10) {
            int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i10);
            this.timelines.get(childIndexByPeriodIndex).getPeriod(i10 - this.firstPeriodIndices.get(childIndexByPeriodIndex).intValue(), period, z10);
            period.windowIndex = 0;
            period.positionInWindowUs = this.periodOffsetsInWindowUs.get(i10).longValue();
            period.durationUs = getPeriodDurationUs(period, i10);
            if (z10) {
                period.uid = ConcatenatingMediaSource2.getPeriodUid(childIndexByPeriodIndex, Assertions.checkNotNull(period.uid));
            }
            return period;
        }

        @Override // io.bidmachine.media3.common.Timeline
        public Timeline.Period getPeriodByUid(Object obj, Timeline.Period period) {
            int childIndex = ConcatenatingMediaSource2.getChildIndex(obj);
            Object childPeriodUid = ConcatenatingMediaSource2.getChildPeriodUid(obj);
            Timeline timeline = this.timelines.get(childIndex);
            int iIntValue = this.firstPeriodIndices.get(childIndex).intValue() + timeline.getIndexOfPeriod(childPeriodUid);
            timeline.getPeriodByUid(childPeriodUid, period);
            period.windowIndex = 0;
            period.positionInWindowUs = this.periodOffsetsInWindowUs.get(iIntValue).longValue();
            period.durationUs = getPeriodDurationUs(period, iIntValue);
            period.uid = obj;
            return period;
        }

        @Override // io.bidmachine.media3.common.Timeline
        public Object getUidOfPeriod(int i10) {
            int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i10);
            return ConcatenatingMediaSource2.getPeriodUid(childIndexByPeriodIndex, this.timelines.get(childIndexByPeriodIndex).getUidOfPeriod(i10 - this.firstPeriodIndices.get(childIndexByPeriodIndex).intValue()));
        }
    }

    private void disableUnusedMediaSources() {
        for (int i10 = 0; i10 < this.mediaSourceHolders.size(); i10++) {
            c cVar = this.mediaSourceHolders.get(i10);
            if (cVar.activeMediaPeriods == 0) {
                disableChildSource(Integer.valueOf(cVar.index));
            }
        }
    }

    private static int getChildIndexFromChildWindowSequenceNumber(long j10, int i10) {
        return (int) (j10 % ((long) i10));
    }

    private static long getChildWindowSequenceNumber(long j10, int i10, int i11) {
        return (j10 * ((long) i10)) + ((long) i11);
    }

    private static long getWindowSequenceNumberFromChildWindowSequenceNumber(long j10, int i10) {
        return j10 / ((long) i10);
    }

    private void updateTimeline() {
        this.timelineUpdateScheduled = false;
        b bVarMaybeCreateConcatenatedTimeline = maybeCreateConcatenatedTimeline();
        if (bVarMaybeCreateConcatenatedTimeline != null) {
            refreshSourceInfo(bVarMaybeCreateConcatenatedTimeline);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource
    public void enableInternal() {
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public synchronized MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource
    public int getWindowIndexForChildWindowIndex(Integer num, int i10) {
        return 0;
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    @UnstableApi
    public /* bridge */ /* synthetic */ boolean isSingleWindow() {
        return super.isSingleWindow();
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(MediaItem mediaItem) {
        this.mediaItem = mediaItem;
    }

    public static final class c {
        public int activeMediaPeriods;
        public final int index;
        public final long initialPlaceholderDurationUs;
        public final MaskingMediaSource mediaSource;
        public final HashMap<Object, Long> periodTimeOffsetsByUid = new HashMap<>();

        public c(MediaSource mediaSource, int i10, long j10) {
            this.mediaSource = new MaskingMediaSource(mediaSource, false);
            this.index = i10;
            this.initialPlaceholderDurationUs = j10;
        }
    }

    private ConcatenatingMediaSource2(MediaItem mediaItem, ImmutableList<c> immutableList) {
        this.mediaItem = mediaItem;
        this.mediaSourceHolders = immutableList;
        this.mediaSourceByMediaPeriod = new IdentityHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getChildIndex(Object obj) {
        return ((Integer) ((Pair) obj).first).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getChildPeriodUid(Object obj) {
        return ((Pair) obj).second;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            updateTimeline();
        }
        return true;
    }

    @Nullable
    private b maybeCreateConcatenatedTimeline() {
        long j10;
        Timeline.Window window;
        boolean z10;
        ConcatenatingMediaSource2 concatenatingMediaSource2 = this;
        Timeline.Window window2 = new Timeline.Window();
        Timeline.Period period = new Timeline.Period();
        ImmutableList.a aVarBuilder = ImmutableList.builder();
        ImmutableList.a aVarBuilder2 = ImmutableList.builder();
        ImmutableList.a aVarBuilder3 = ImmutableList.builder();
        int size = concatenatingMediaSource2.mediaSourceHolders.size();
        boolean z11 = true;
        boolean z12 = true;
        int i10 = 0;
        Object obj = null;
        int periodCount = 0;
        boolean z13 = false;
        boolean z14 = false;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (i10 < size) {
            c cVar = concatenatingMediaSource2.mediaSourceHolders.get(i10);
            Timeline timeline = cVar.mediaSource.getTimeline();
            Assertions.checkArgument(!timeline.isEmpty(), "Can't concatenate empty child Timeline.");
            aVarBuilder.a(timeline);
            aVarBuilder2.a(Integer.valueOf(periodCount));
            periodCount += timeline.getPeriodCount();
            int i11 = 0;
            while (i11 < timeline.getWindowCount()) {
                timeline.getWindow(i11, window2);
                if (!z13) {
                    obj = window2.manifest;
                    z13 = true;
                }
                boolean z15 = z11 && Util.areEqual(obj, window2.manifest);
                long j14 = window2.durationUs;
                c cVar2 = cVar;
                if (j14 == -9223372036854775807L) {
                    j14 = cVar2.initialPlaceholderDurationUs;
                    if (j14 == -9223372036854775807L) {
                        return null;
                    }
                }
                j11 += j14;
                if (cVar2.index == 0 && i11 == 0) {
                    j12 = window2.defaultPositionUs;
                    j13 = -window2.positionInFirstPeriodUs;
                }
                z12 &= window2.isSeekable || window2.isPlaceholder;
                z14 |= window2.isDynamic;
                int i12 = window2.firstPeriodIndex;
                while (i12 <= window2.lastPeriodIndex) {
                    aVarBuilder3.a(Long.valueOf(j13));
                    timeline.getPeriod(i12, period, true);
                    int i13 = periodCount;
                    long j15 = period.durationUs;
                    if (j15 == -9223372036854775807L) {
                        Assertions.checkArgument(window2.firstPeriodIndex == window2.lastPeriodIndex, "Can't apply placeholder duration to multiple periods with unknown duration in a single window.");
                        j15 = window2.positionInFirstPeriodUs + j14;
                    }
                    Object obj2 = obj;
                    if (!(i12 == window2.firstPeriodIndex && !(cVar2.index == 0 && i11 == 0)) || j15 == -9223372036854775807L) {
                        j10 = 0;
                    } else {
                        j10 = -window2.positionInFirstPeriodUs;
                        j15 += j10;
                    }
                    Object objCheckNotNull = Assertions.checkNotNull(period.uid);
                    int i14 = size;
                    if (cVar2.activeMediaPeriods == 0 || !cVar2.periodTimeOffsetsByUid.containsKey(objCheckNotNull)) {
                        window = window2;
                    } else {
                        window = window2;
                        if (!cVar2.periodTimeOffsetsByUid.get(objCheckNotNull).equals(Long.valueOf(j10))) {
                            z10 = false;
                        }
                        Assertions.checkArgument(z10, "Can't handle windows with changing offset in first period.");
                        cVar2.periodTimeOffsetsByUid.put(objCheckNotNull, Long.valueOf(j10));
                        j13 += j15;
                        i12++;
                        periodCount = i13;
                        obj = obj2;
                        j14 = j14;
                        size = i14;
                        window2 = window;
                    }
                    z10 = true;
                    Assertions.checkArgument(z10, "Can't handle windows with changing offset in first period.");
                    cVar2.periodTimeOffsetsByUid.put(objCheckNotNull, Long.valueOf(j10));
                    j13 += j15;
                    i12++;
                    periodCount = i13;
                    obj = obj2;
                    j14 = j14;
                    size = i14;
                    window2 = window;
                }
                i11++;
                cVar = cVar2;
                z11 = z15;
                obj = obj;
            }
            i10++;
            concatenatingMediaSource2 = this;
        }
        return new b(getMediaItem(), aVarBuilder.m(), aVarBuilder2.m(), aVarBuilder3.m(), z12, z14, j11, j12, z11 ? obj : null);
    }

    private void scheduleTimelineUpdate() {
        if (this.timelineUpdateScheduled) {
            return;
        }
        ((Handler) Assertions.checkNotNull(this.playbackThreadHandler)).obtainMessage(1).sendToTarget();
        this.timelineUpdateScheduled = true;
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j10) {
        c cVar = this.mediaSourceHolders.get(getChildIndex(mediaPeriodId.periodUid));
        MediaSource.MediaPeriodId mediaPeriodIdCopyWithWindowSequenceNumber = mediaPeriodId.copyWithPeriodUid(getChildPeriodUid(mediaPeriodId.periodUid)).copyWithWindowSequenceNumber(getChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size(), cVar.index));
        enableChildSource(Integer.valueOf(cVar.index));
        cVar.activeMediaPeriods++;
        long jLongValue = mediaPeriodId.isAd() ? 0L : ((Long) Assertions.checkNotNull(cVar.periodTimeOffsetsByUid.get(mediaPeriodIdCopyWithWindowSequenceNumber.periodUid))).longValue();
        f fVar = new f(cVar.mediaSource.createPeriod(mediaPeriodIdCopyWithWindowSequenceNumber, allocator, j10 - jLongValue), jLongValue);
        this.mediaSourceByMediaPeriod.put(fVar, cVar);
        disableUnusedMediaSources();
        return fVar;
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource
    @Nullable
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Integer num, MediaSource.MediaPeriodId mediaPeriodId) {
        if (num.intValue() != getChildIndexFromChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size())) {
            return null;
        }
        return mediaPeriodId.copyWithPeriodUid(getPeriodUid(num.intValue(), mediaPeriodId.periodUid)).copyWithWindowSequenceNumber(getWindowSequenceNumberFromChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size()));
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource
    public long getMediaTimeForChildMediaTime(Integer num, long j10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        Long l10;
        return (j10 == -9223372036854775807L || mediaPeriodId == null || mediaPeriodId.isAd() || (l10 = this.mediaSourceHolders.get(num.intValue()).periodTimeOffsetsByUid.get(mediaPeriodId.periodUid)) == null) ? j10 : j10 + Util.usToMs(l10.longValue());
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource
    /* JADX INFO: renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void lambda$prepareChildSource$0(Integer num, MediaSource mediaSource, Timeline timeline) {
        scheduleTimelineUpdate();
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        c cVar = (c) Assertions.checkNotNull(this.mediaSourceByMediaPeriod.remove(mediaPeriod));
        cVar.mediaSource.releasePeriod(((f) mediaPeriod).getWrappedMediaPeriod());
        cVar.activeMediaPeriods--;
        if (this.mediaSourceByMediaPeriod.isEmpty()) {
            return;
        }
        disableUnusedMediaSources();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getPeriodUid(int i10, Object obj) {
        return Pair.create(Integer.valueOf(i10), obj);
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    @Nullable
    public Timeline getInitialTimeline() {
        return maybeCreateConcatenatedTimeline();
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        this.playbackThreadHandler = new Handler(new Handler.Callback() { // from class: og.d
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f65348b.handleMessage(message);
            }
        });
        for (int i10 = 0; i10 < this.mediaSourceHolders.size(); i10++) {
            prepareChildSource(Integer.valueOf(i10), this.mediaSourceHolders.get(i10).mediaSource);
        }
        scheduleTimelineUpdate();
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        Handler handler = this.playbackThreadHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.playbackThreadHandler = null;
        }
        this.timelineUpdateScheduled = false;
    }
}
