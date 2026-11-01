package io.bidmachine.media3.exoplayer;

import android.util.Pair;
import androidx.annotation.Nullable;
import cg.f2;
import cg.p1;
import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.HandlerWrapper;
import io.bidmachine.media3.exoplayer.analytics.AnalyticsCollector;
import io.bidmachine.media3.exoplayer.source.MediaPeriod;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: MediaPeriodQueue.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c {
    public static final long INITIAL_RENDERER_POSITION_OFFSET_US = 1000000000000L;
    private static final int MAXIMUM_BUFFER_AHEAD_PERIODS = 100;
    private final AnalyticsCollector analyticsCollector;
    private final HandlerWrapper analyticsCollectorHandler;
    private int length;

    @Nullable
    private b loading;
    private final b.a mediaPeriodHolderFactory;
    private long nextWindowSequenceNumber;

    @Nullable
    private Object oldFrontPeriodUid;
    private long oldFrontPeriodWindowSequenceNumber;

    @Nullable
    private b playing;
    private ExoPlayer.PreloadConfiguration preloadConfiguration;

    @Nullable
    private b reading;
    private int repeatMode;
    private boolean shuffleModeEnabled;
    private final Timeline.Period period = new Timeline.Period();
    private final Timeline.Window window = new Timeline.Window();
    private List<b> preloadPriorityList = new ArrayList();

    public static boolean areDurationsCompatible(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    @Nullable
    private p1 getFollowingMediaPeriodInfoOfCurrentPeriod(Timeline timeline, b bVar, long j10) {
        p1 p1Var = bVar.info;
        MediaSource.MediaPeriodId mediaPeriodId = p1Var.f5876id;
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        if (!mediaPeriodId.isAd()) {
            int i10 = mediaPeriodId.nextAdGroupIndex;
            if (i10 != -1 && this.period.isLivePostrollPlaceholder(i10)) {
                return getFirstMediaPeriodInfoOfNextPeriod(timeline, bVar, j10);
            }
            int firstAdIndexToPlay = this.period.getFirstAdIndexToPlay(mediaPeriodId.nextAdGroupIndex);
            boolean z10 = this.period.isServerSideInsertedAdGroup(mediaPeriodId.nextAdGroupIndex) && this.period.getAdState(mediaPeriodId.nextAdGroupIndex, firstAdIndexToPlay) == 3;
            if (firstAdIndexToPlay == this.period.getAdCountInAdGroup(mediaPeriodId.nextAdGroupIndex) || z10) {
                return getMediaPeriodInfoForContent(timeline, mediaPeriodId.periodUid, getMinStartPositionAfterAdGroupUs(timeline, mediaPeriodId.periodUid, mediaPeriodId.nextAdGroupIndex), p1Var.durationUs, mediaPeriodId.windowSequenceNumber);
            }
            return getMediaPeriodInfoForAd(timeline, mediaPeriodId.periodUid, mediaPeriodId.nextAdGroupIndex, firstAdIndexToPlay, p1Var.durationUs, mediaPeriodId.windowSequenceNumber);
        }
        int i11 = mediaPeriodId.adGroupIndex;
        int adCountInAdGroup = this.period.getAdCountInAdGroup(i11);
        if (adCountInAdGroup == -1) {
            return null;
        }
        int nextAdIndexToPlay = this.period.getNextAdIndexToPlay(i11, mediaPeriodId.adIndexInAdGroup);
        if (nextAdIndexToPlay < adCountInAdGroup) {
            return getMediaPeriodInfoForAd(timeline, mediaPeriodId.periodUid, i11, nextAdIndexToPlay, p1Var.requestedContentPositionUs, mediaPeriodId.windowSequenceNumber);
        }
        long jLongValue = p1Var.requestedContentPositionUs;
        if (jLongValue == -9223372036854775807L) {
            Timeline.Window window = this.window;
            Timeline.Period period = this.period;
            Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(window, period, period.windowIndex, -9223372036854775807L, Math.max(0L, j10));
            if (periodPositionUs == null) {
                return null;
            }
            jLongValue = ((Long) periodPositionUs.second).longValue();
        }
        return getMediaPeriodInfoForContent(timeline, mediaPeriodId.periodUid, Math.max(getMinStartPositionAfterAdGroupUs(timeline, mediaPeriodId.periodUid, mediaPeriodId.adGroupIndex), jLongValue), p1Var.requestedContentPositionUs, mediaPeriodId.windowSequenceNumber);
    }

    private p1 getMediaPeriodInfo(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j10, long j11) {
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        return mediaPeriodId.isAd() ? getMediaPeriodInfoForAd(timeline, mediaPeriodId.periodUid, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, j10, mediaPeriodId.windowSequenceNumber) : getMediaPeriodInfoForContent(timeline, mediaPeriodId.periodUid, j11, j10, mediaPeriodId.windowSequenceNumber);
    }

    private void releaseAndResetPreloadPriorityList(List<b> list) {
        for (int i10 = 0; i10 < this.preloadPriorityList.size(); i10++) {
            this.preloadPriorityList.get(i10).release();
        }
        this.preloadPriorityList = list;
    }

    @Nullable
    private b removePreloadedMediaPeriodHolder(p1 p1Var) {
        for (int i10 = 0; i10 < this.preloadPriorityList.size(); i10++) {
            if (this.preloadPriorityList.get(i10).canBeUsedForMediaPeriodInfo(p1Var)) {
                return this.preloadPriorityList.remove(i10);
            }
        }
        return null;
    }

    private long resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(Object obj) {
        for (int i10 = 0; i10 < this.preloadPriorityList.size(); i10++) {
            b bVar = this.preloadPriorityList.get(i10);
            if (bVar.uid.equals(obj)) {
                return bVar.info.f5876id.windowSequenceNumber;
            }
        }
        return -1L;
    }

    public MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(Timeline timeline, Object obj, long j10) {
        return resolveMediaPeriodIdForAds(timeline, obj, j10, resolvePeriodUidToWindowSequenceNumber(timeline, obj), this.window, this.period);
    }

    private boolean canKeepMediaPeriodHolder(p1 p1Var, p1 p1Var2) {
        return p1Var.startPositionUs == p1Var2.startPositionUs && p1Var.f5876id.equals(p1Var2.f5876id);
    }

    @Nullable
    private Pair<Object, Long> getDefaultPeriodPositionOfNextWindow(Timeline timeline, Object obj, long j10) {
        int nextWindowIndex = timeline.getNextWindowIndex(timeline.getPeriodByUid(obj, this.period).windowIndex, this.repeatMode, this.shuffleModeEnabled);
        if (nextWindowIndex != -1) {
            return timeline.getPeriodPositionUs(this.window, this.period, nextWindowIndex, -9223372036854775807L, j10);
        }
        return null;
    }

    @Nullable
    private p1 getFirstMediaPeriodInfo(f2 f2Var) {
        return getMediaPeriodInfo(f2Var.timeline, f2Var.periodId, f2Var.requestedContentPositionUs, f2Var.positionUs);
    }

    @Nullable
    private p1 getFirstMediaPeriodInfoOfNextPeriod(Timeline timeline, b bVar, long j10) {
        long j11;
        long j12;
        Object obj;
        long j13;
        long j14;
        long jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
        p1 p1Var = bVar.info;
        int nextPeriodIndex = timeline.getNextPeriodIndex(timeline.getIndexOfPeriod(p1Var.f5876id.periodUid), this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
        if (nextPeriodIndex == -1) {
            return null;
        }
        int i10 = timeline.getPeriod(nextPeriodIndex, this.period, true).windowIndex;
        Object objCheckNotNull = Assertions.checkNotNull(this.period.uid);
        long j15 = p1Var.f5876id.windowSequenceNumber;
        if (timeline.getWindow(i10, this.window).firstPeriodIndex == nextPeriodIndex) {
            Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, i10, -9223372036854775807L, Math.max(0L, j10));
            if (periodPositionUs == null) {
                return null;
            }
            Object obj2 = periodPositionUs.first;
            long jLongValue = ((Long) periodPositionUs.second).longValue();
            b next = bVar.getNext();
            if (next == null || !next.uid.equals(obj2)) {
                jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(obj2);
                if (jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods == -1) {
                    jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods = this.nextWindowSequenceNumber;
                    this.nextWindowSequenceNumber = 1 + jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
                }
            } else {
                jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods = next.info.f5876id.windowSequenceNumber;
            }
            j11 = jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
            j12 = -9223372036854775807L;
            obj = obj2;
            j13 = jLongValue;
        } else {
            j11 = j15;
            j12 = 0;
            obj = objCheckNotNull;
            j13 = 0;
        }
        MediaSource.MediaPeriodId mediaPeriodIdResolveMediaPeriodIdForAds = resolveMediaPeriodIdForAds(timeline, obj, j13, j11, this.window, this.period);
        if (j12 == -9223372036854775807L || p1Var.requestedContentPositionUs == -9223372036854775807L) {
            j14 = j13;
        } else {
            boolean zHasServerSideInsertedAds = hasServerSideInsertedAds(p1Var.f5876id.periodUid, timeline);
            if (mediaPeriodIdResolveMediaPeriodIdForAds.isAd() && zHasServerSideInsertedAds) {
                j12 = p1Var.requestedContentPositionUs;
            } else if (zHasServerSideInsertedAds) {
                j14 = p1Var.requestedContentPositionUs;
            }
            j14 = j13;
        }
        return getMediaPeriodInfo(timeline, mediaPeriodIdResolveMediaPeriodIdForAds, j12, j14);
    }

    @Nullable
    private p1 getFollowingMediaPeriodInfo(Timeline timeline, b bVar, long j10) {
        p1 p1Var = bVar.info;
        long rendererOffset = (bVar.getRendererOffset() + p1Var.durationUs) - j10;
        return p1Var.isLastInTimelinePeriod ? getFirstMediaPeriodInfoOfNextPeriod(timeline, bVar, rendererOffset) : getFollowingMediaPeriodInfoOfCurrentPeriod(timeline, bVar, rendererOffset);
    }

    private p1 getMediaPeriodInfoForAd(Timeline timeline, Object obj, int i10, int i11, long j10, long j11) {
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(obj, i10, i11, j11);
        long adDurationUs = timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        long adResumePositionUs = i11 == this.period.getFirstAdIndexToPlay(i10) ? this.period.getAdResumePositionUs() : 0L;
        return new p1(mediaPeriodId, (adDurationUs == -9223372036854775807L || adResumePositionUs < adDurationUs) ? adResumePositionUs : Math.max(0L, adDurationUs - 1), j10, -9223372036854775807L, adDurationUs, this.period.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex), false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    private p1 getMediaPeriodInfoForContent(Timeline timeline, Object obj, long j10, long j11, long j12) {
        boolean z10;
        long j13;
        long adGroupTimeUs;
        long j14;
        long jMax = j10;
        timeline.getPeriodByUid(obj, this.period);
        int adGroupIndexAfterPositionUs = this.period.getAdGroupIndexAfterPositionUs(jMax);
        int i10 = 1;
        boolean z11 = adGroupIndexAfterPositionUs != -1 && this.period.isLivePostrollPlaceholder(adGroupIndexAfterPositionUs);
        if (adGroupIndexAfterPositionUs == -1) {
            if (this.period.getAdGroupCount() > 0) {
                Timeline.Period period = this.period;
                if (period.isServerSideInsertedAdGroup(period.getRemovedAdGroupCount())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        } else if (this.period.isServerSideInsertedAdGroup(adGroupIndexAfterPositionUs)) {
            long adGroupTimeUs2 = this.period.getAdGroupTimeUs(adGroupIndexAfterPositionUs);
            Timeline.Period period2 = this.period;
            if (adGroupTimeUs2 == period2.durationUs && period2.hasPlayedAdGroup(adGroupIndexAfterPositionUs)) {
                z10 = true;
                adGroupIndexAfterPositionUs = -1;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(obj, j12, adGroupIndexAfterPositionUs);
        boolean zIsLastInPeriod = isLastInPeriod(mediaPeriodId);
        boolean zIsLastInWindow = isLastInWindow(timeline, mediaPeriodId);
        boolean zIsLastInTimeline = isLastInTimeline(timeline, mediaPeriodId, zIsLastInPeriod);
        boolean z12 = (adGroupIndexAfterPositionUs == -1 || !this.period.isServerSideInsertedAdGroup(adGroupIndexAfterPositionUs) || z11) ? false : true;
        if (adGroupIndexAfterPositionUs == -1 || z11) {
            if (z10) {
                adGroupTimeUs = this.period.durationUs;
            } else {
                j13 = -9223372036854775807L;
            }
            if (j13 != -9223372036854775807L || j13 == Long.MIN_VALUE) {
                j14 = this.period.durationUs;
            } else {
                j14 = j13;
            }
            if (j14 != -9223372036854775807L && jMax >= j14) {
                if (!zIsLastInTimeline && z10) {
                    i10 = 0;
                }
                jMax = Math.max(0L, j14 - ((long) i10));
            }
            return new p1(mediaPeriodId, jMax, j11, j13, j14, z12, zIsLastInPeriod, zIsLastInWindow, zIsLastInTimeline);
        }
        adGroupTimeUs = this.period.getAdGroupTimeUs(adGroupIndexAfterPositionUs);
        j13 = adGroupTimeUs;
        if (j13 != -9223372036854775807L) {
            j14 = this.period.durationUs;
        } else {
            j14 = this.period.durationUs;
        }
        if (j14 != -9223372036854775807L) {
            if (!zIsLastInTimeline) {
                i10 = 0;
            }
            jMax = Math.max(0L, j14 - ((long) i10));
        }
        return new p1(mediaPeriodId, jMax, j11, j13, j14, z12, zIsLastInPeriod, zIsLastInWindow, zIsLastInTimeline);
    }

    private p1 getMediaPeriodInfoForPeriodPosition(Timeline timeline, Object obj, long j10, long j11) {
        MediaSource.MediaPeriodId mediaPeriodIdResolveMediaPeriodIdForAds = resolveMediaPeriodIdForAds(timeline, obj, j10, j11, this.window, this.period);
        return mediaPeriodIdResolveMediaPeriodIdForAds.isAd() ? getMediaPeriodInfoForAd(timeline, mediaPeriodIdResolveMediaPeriodIdForAds.periodUid, mediaPeriodIdResolveMediaPeriodIdForAds.adGroupIndex, mediaPeriodIdResolveMediaPeriodIdForAds.adIndexInAdGroup, j10, mediaPeriodIdResolveMediaPeriodIdForAds.windowSequenceNumber) : getMediaPeriodInfoForContent(timeline, mediaPeriodIdResolveMediaPeriodIdForAds.periodUid, j10, -9223372036854775807L, mediaPeriodIdResolveMediaPeriodIdForAds.windowSequenceNumber);
    }

    private long getMinStartPositionAfterAdGroupUs(Timeline timeline, Object obj, int i10) {
        timeline.getPeriodByUid(obj, this.period);
        long adGroupTimeUs = this.period.getAdGroupTimeUs(i10);
        return adGroupTimeUs == Long.MIN_VALUE ? this.period.durationUs : adGroupTimeUs + this.period.getContentResumeOffsetUs(i10);
    }

    private boolean hasServerSideInsertedAds(Object obj, Timeline timeline) {
        int adGroupCount = timeline.getPeriodByUid(obj, this.period).getAdGroupCount();
        int removedAdGroupCount = this.period.getRemovedAdGroupCount();
        return adGroupCount > 0 && this.period.isServerSideInsertedAdGroup(removedAdGroupCount) && (adGroupCount > 1 || this.period.getAdGroupTimeUs(removedAdGroupCount) != Long.MIN_VALUE);
    }

    private boolean isLastInTimeline(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, boolean z10) {
        int indexOfPeriod = timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
        return !timeline.getWindow(timeline.getPeriod(indexOfPeriod, this.period).windowIndex, this.window).isDynamic && timeline.isLastPeriod(indexOfPeriod, this.period, this.window, this.repeatMode, this.shuffleModeEnabled) && z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyQueueUpdate$0(ImmutableList.a aVar, MediaSource.MediaPeriodId mediaPeriodId) {
        this.analyticsCollector.updateMediaPeriodQueueInfo(aVar.m(), mediaPeriodId);
    }

    private long resolvePeriodUidToWindowSequenceNumber(Timeline timeline, Object obj) {
        int indexOfPeriod;
        int i10 = timeline.getPeriodByUid(obj, this.period).windowIndex;
        Object obj2 = this.oldFrontPeriodUid;
        if (obj2 != null && (indexOfPeriod = timeline.getIndexOfPeriod(obj2)) != -1 && timeline.getPeriod(indexOfPeriod, this.period).windowIndex == i10) {
            return this.oldFrontPeriodWindowSequenceNumber;
        }
        for (b next = this.playing; next != null; next = next.getNext()) {
            if (next.uid.equals(obj)) {
                return next.info.f5876id.windowSequenceNumber;
            }
        }
        for (b next2 = this.playing; next2 != null; next2 = next2.getNext()) {
            int indexOfPeriod2 = timeline.getIndexOfPeriod(next2.uid);
            if (indexOfPeriod2 != -1 && timeline.getPeriod(indexOfPeriod2, this.period).windowIndex == i10) {
                return next2.info.f5876id.windowSequenceNumber;
            }
        }
        long jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(obj);
        if (jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods != -1) {
            return jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
        }
        long j10 = this.nextWindowSequenceNumber;
        this.nextWindowSequenceNumber = 1 + j10;
        if (this.playing == null) {
            this.oldFrontPeriodUid = obj;
            this.oldFrontPeriodWindowSequenceNumber = j10;
        }
        return j10;
    }

    private boolean updateForPlaybackModeChange(Timeline timeline) {
        b next = this.playing;
        if (next == null) {
            return true;
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(next.uid);
        while (true) {
            indexOfPeriod = timeline.getNextPeriodIndex(indexOfPeriod, this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
            while (((b) Assertions.checkNotNull(next)).getNext() != null && !next.info.isLastInTimelinePeriod) {
                next = next.getNext();
            }
            b next2 = next.getNext();
            if (indexOfPeriod == -1 || next2 == null || timeline.getIndexOfPeriod(next2.uid) != indexOfPeriod) {
                break;
            }
            next = next2;
        }
        boolean zRemoveAfter = removeAfter(next);
        next.info = getUpdatedMediaPeriodInfo(timeline, next.info);
        return !zRemoveAfter;
    }

    @Nullable
    public b advancePlayingPeriod() {
        b bVar = this.playing;
        if (bVar == null) {
            return null;
        }
        if (bVar == this.reading) {
            this.reading = bVar.getNext();
        }
        this.playing.release();
        int i10 = this.length - 1;
        this.length = i10;
        if (i10 == 0) {
            this.loading = null;
            b bVar2 = this.playing;
            this.oldFrontPeriodUid = bVar2.uid;
            this.oldFrontPeriodWindowSequenceNumber = bVar2.info.f5876id.windowSequenceNumber;
        }
        this.playing = this.playing.getNext();
        notifyQueueUpdate();
        return this.playing;
    }

    public b advanceReadingPeriod() {
        this.reading = ((b) Assertions.checkStateNotNull(this.reading)).getNext();
        notifyQueueUpdate();
        return (b) Assertions.checkStateNotNull(this.reading);
    }

    public void clear() {
        if (this.length == 0) {
            return;
        }
        b next = (b) Assertions.checkStateNotNull(this.playing);
        this.oldFrontPeriodUid = next.uid;
        this.oldFrontPeriodWindowSequenceNumber = next.info.f5876id.windowSequenceNumber;
        while (next != null) {
            next.release();
            next = next.getNext();
        }
        this.playing = null;
        this.loading = null;
        this.reading = null;
        this.length = 0;
        notifyQueueUpdate();
    }

    public b enqueueNextMediaPeriodHolder(p1 p1Var) {
        b bVar = this.loading;
        long rendererOffset = bVar == null ? 1000000000000L : (bVar.getRendererOffset() + this.loading.info.durationUs) - p1Var.startPositionUs;
        b bVarRemovePreloadedMediaPeriodHolder = removePreloadedMediaPeriodHolder(p1Var);
        if (bVarRemovePreloadedMediaPeriodHolder == null) {
            bVarRemovePreloadedMediaPeriodHolder = this.mediaPeriodHolderFactory.create(p1Var, rendererOffset);
        } else {
            bVarRemovePreloadedMediaPeriodHolder.info = p1Var;
            bVarRemovePreloadedMediaPeriodHolder.setRendererOffset(rendererOffset);
        }
        b bVar2 = this.loading;
        if (bVar2 != null) {
            bVar2.setNext(bVarRemovePreloadedMediaPeriodHolder);
        } else {
            this.playing = bVarRemovePreloadedMediaPeriodHolder;
            this.reading = bVarRemovePreloadedMediaPeriodHolder;
        }
        this.oldFrontPeriodUid = null;
        this.loading = bVarRemovePreloadedMediaPeriodHolder;
        this.length++;
        notifyQueueUpdate();
        return bVarRemovePreloadedMediaPeriodHolder;
    }

    @Nullable
    public b getLoadingPeriod() {
        return this.loading;
    }

    @Nullable
    public p1 getNextMediaPeriodInfo(long j10, f2 f2Var) {
        b bVar = this.loading;
        return bVar == null ? getFirstMediaPeriodInfo(f2Var) : getFollowingMediaPeriodInfo(f2Var.timeline, bVar, j10);
    }

    @Nullable
    public b getPlayingPeriod() {
        return this.playing;
    }

    @Nullable
    public b getReadingPeriod() {
        return this.reading;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    public p1 getUpdatedMediaPeriodInfo(Timeline timeline, p1 p1Var) {
        long durationUs;
        long j10;
        int i10;
        boolean zIsServerSideInsertedAdGroup;
        int i11;
        MediaSource.MediaPeriodId mediaPeriodId = p1Var.f5876id;
        boolean zIsLastInPeriod = isLastInPeriod(mediaPeriodId);
        boolean zIsLastInWindow = isLastInWindow(timeline, mediaPeriodId);
        boolean zIsLastInTimeline = isLastInTimeline(timeline, mediaPeriodId, zIsLastInPeriod);
        timeline.getPeriodByUid(p1Var.f5876id.periodUid, this.period);
        long adGroupTimeUs = (mediaPeriodId.isAd() || (i11 = mediaPeriodId.nextAdGroupIndex) == -1) ? -9223372036854775807L : this.period.getAdGroupTimeUs(i11);
        if (!mediaPeriodId.isAd()) {
            if (adGroupTimeUs == -9223372036854775807L || adGroupTimeUs == Long.MIN_VALUE) {
                durationUs = this.period.getDurationUs();
            } else {
                j10 = adGroupTimeUs;
            }
            if (mediaPeriodId.isAd()) {
                zIsServerSideInsertedAdGroup = this.period.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex);
            } else {
                i10 = mediaPeriodId.nextAdGroupIndex;
                if (i10 == -1 && this.period.isServerSideInsertedAdGroup(i10)) {
                    zIsServerSideInsertedAdGroup = true;
                } else {
                    zIsServerSideInsertedAdGroup = false;
                }
            }
            return new p1(mediaPeriodId, p1Var.startPositionUs, p1Var.requestedContentPositionUs, adGroupTimeUs, j10, zIsServerSideInsertedAdGroup, zIsLastInPeriod, zIsLastInWindow, zIsLastInTimeline);
        }
        durationUs = this.period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        j10 = durationUs;
        if (mediaPeriodId.isAd()) {
            zIsServerSideInsertedAdGroup = this.period.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex);
        } else {
            i10 = mediaPeriodId.nextAdGroupIndex;
            if (i10 == -1) {
                zIsServerSideInsertedAdGroup = false;
            } else {
                zIsServerSideInsertedAdGroup = false;
            }
        }
        return new p1(mediaPeriodId, p1Var.startPositionUs, p1Var.requestedContentPositionUs, adGroupTimeUs, j10, zIsServerSideInsertedAdGroup, zIsLastInPeriod, zIsLastInWindow, zIsLastInTimeline);
    }

    public void invalidatePreloadPool(Timeline timeline) {
        b bVar;
        if (this.preloadConfiguration.targetPreloadDurationUs == -9223372036854775807L || (bVar = this.loading) == null) {
            releasePreloadPool();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Pair<Object, Long> defaultPeriodPositionOfNextWindow = getDefaultPeriodPositionOfNextWindow(timeline, bVar.info.f5876id.periodUid, 0L);
        if (defaultPeriodPositionOfNextWindow != null && !timeline.getWindow(timeline.getPeriodByUid(defaultPeriodPositionOfNextWindow.first, this.period).windowIndex, this.window).isLive()) {
            long jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(defaultPeriodPositionOfNextWindow.first);
            if (jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods == -1) {
                jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods = this.nextWindowSequenceNumber;
                this.nextWindowSequenceNumber = 1 + jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
            }
            p1 mediaPeriodInfoForPeriodPosition = getMediaPeriodInfoForPeriodPosition(timeline, defaultPeriodPositionOfNextWindow.first, ((Long) defaultPeriodPositionOfNextWindow.second).longValue(), jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods);
            b bVarRemovePreloadedMediaPeriodHolder = removePreloadedMediaPeriodHolder(mediaPeriodInfoForPeriodPosition);
            if (bVarRemovePreloadedMediaPeriodHolder == null) {
                bVarRemovePreloadedMediaPeriodHolder = this.mediaPeriodHolderFactory.create(mediaPeriodInfoForPeriodPosition, (bVar.getRendererOffset() + bVar.info.durationUs) - mediaPeriodInfoForPeriodPosition.startPositionUs);
            }
            arrayList.add(bVarRemovePreloadedMediaPeriodHolder);
        }
        releaseAndResetPreloadPriorityList(arrayList);
    }

    public boolean isLoading(MediaPeriod mediaPeriod) {
        b bVar = this.loading;
        return bVar != null && bVar.mediaPeriod == mediaPeriod;
    }

    public void reevaluateBuffer(long j10) {
        b bVar = this.loading;
        if (bVar != null) {
            bVar.reevaluateBuffer(j10);
        }
    }

    public void releasePreloadPool() {
        if (this.preloadPriorityList.isEmpty()) {
            return;
        }
        releaseAndResetPreloadPriorityList(new ArrayList());
    }

    public boolean shouldLoadNextMediaPeriod() {
        b bVar = this.loading;
        return bVar == null || (!bVar.info.isFinal && bVar.isFullyBuffered() && this.loading.info.durationUs != -9223372036854775807L && this.length < 100);
    }

    public void updatePreloadConfiguration(Timeline timeline, ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.preloadConfiguration = preloadConfiguration;
        invalidatePreloadPool(timeline);
    }

    public boolean updateQueuedPeriods(Timeline timeline, long j10, long j11) {
        p1 updatedMediaPeriodInfo;
        b next = this.playing;
        b bVar = null;
        while (next != null) {
            p1 p1Var = next.info;
            if (bVar == null) {
                updatedMediaPeriodInfo = getUpdatedMediaPeriodInfo(timeline, p1Var);
            } else {
                p1 followingMediaPeriodInfo = getFollowingMediaPeriodInfo(timeline, bVar, j10);
                if (followingMediaPeriodInfo == null) {
                    return !removeAfter(bVar);
                }
                if (!canKeepMediaPeriodHolder(p1Var, followingMediaPeriodInfo)) {
                    return !removeAfter(bVar);
                }
                updatedMediaPeriodInfo = followingMediaPeriodInfo;
            }
            next.info = updatedMediaPeriodInfo.copyWithRequestedContentPositionUs(p1Var.requestedContentPositionUs);
            if (!areDurationsCompatible(p1Var.durationUs, updatedMediaPeriodInfo.durationUs)) {
                next.updateClipping();
                long j12 = updatedMediaPeriodInfo.durationUs;
                return (removeAfter(next) || (next == this.reading && !next.info.isFollowedByTransitionToSameStream && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : next.toRendererTime(j12)) ? 1 : (j11 == ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : next.toRendererTime(j12)) ? 0 : -1)) >= 0))) ? false : true;
            }
            bVar = next;
            next = next.getNext();
        }
        return true;
    }

    public boolean updateRepeatMode(Timeline timeline, int i10) {
        this.repeatMode = i10;
        return updateForPlaybackModeChange(timeline);
    }

    public boolean updateShuffleModeEnabled(Timeline timeline, boolean z10) {
        this.shuffleModeEnabled = z10;
        return updateForPlaybackModeChange(timeline);
    }

    public c(AnalyticsCollector analyticsCollector, HandlerWrapper handlerWrapper, b.a aVar, ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.analyticsCollector = analyticsCollector;
        this.analyticsCollectorHandler = handlerWrapper;
        this.mediaPeriodHolderFactory = aVar;
        this.preloadConfiguration = preloadConfiguration;
    }

    private boolean isLastInPeriod(MediaSource.MediaPeriodId mediaPeriodId) {
        if (!mediaPeriodId.isAd() && mediaPeriodId.nextAdGroupIndex == -1) {
            return true;
        }
        return false;
    }

    private boolean isLastInWindow(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        if (!isLastInPeriod(mediaPeriodId)) {
            return false;
        }
        int i10 = timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex;
        if (timeline.getWindow(i10, this.window).lastPeriodIndex != timeline.getIndexOfPeriod(mediaPeriodId.periodUid)) {
            return false;
        }
        return true;
    }

    private static boolean isSkippableAdPeriod(Timeline.Period period) {
        int i10;
        int adGroupCount = period.getAdGroupCount();
        if (adGroupCount == 0) {
            return false;
        }
        if ((adGroupCount == 1 && period.isLivePostrollPlaceholder(0)) || !period.isServerSideInsertedAdGroup(period.getRemovedAdGroupCount())) {
            return false;
        }
        long contentResumeOffsetUs = 0;
        if (period.getAdGroupIndexForPositionUs(0L) != -1) {
            return false;
        }
        if (period.durationUs == 0) {
            return true;
        }
        if (period.isLivePostrollPlaceholder(adGroupCount - 1)) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        int i11 = adGroupCount - i10;
        for (int i12 = 0; i12 <= i11; i12++) {
            contentResumeOffsetUs += period.getContentResumeOffsetUs(i12);
        }
        if (period.durationUs > contentResumeOffsetUs) {
            return false;
        }
        return true;
    }

    private void notifyQueueUpdate() {
        final MediaSource.MediaPeriodId mediaPeriodId;
        final ImmutableList.a aVarBuilder = ImmutableList.builder();
        for (b next = this.playing; next != null; next = next.getNext()) {
            aVarBuilder.a(next.info.f5876id);
        }
        b bVar = this.reading;
        if (bVar == null) {
            mediaPeriodId = null;
        } else {
            mediaPeriodId = bVar.info.f5876id;
        }
        this.analyticsCollectorHandler.post(new Runnable() { // from class: cg.q1
            @Override // java.lang.Runnable
            public final void run() {
                this.f5880b.lambda$notifyQueueUpdate$0(aVarBuilder, mediaPeriodId);
            }
        });
    }

    private static MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(Timeline timeline, Object obj, long j10, long j11, Timeline.Window window, Timeline.Period period) {
        timeline.getPeriodByUid(obj, period);
        timeline.getWindow(period.windowIndex, window);
        Object objCheckNotNull = obj;
        for (int indexOfPeriod = timeline.getIndexOfPeriod(obj); isSkippableAdPeriod(period) && indexOfPeriod <= window.lastPeriodIndex; indexOfPeriod++) {
            timeline.getPeriod(indexOfPeriod, period, true);
            objCheckNotNull = Assertions.checkNotNull(period.uid);
        }
        timeline.getPeriodByUid(objCheckNotNull, period);
        int adGroupIndexForPositionUs = period.getAdGroupIndexForPositionUs(j10);
        if (adGroupIndexForPositionUs == -1) {
            return new MediaSource.MediaPeriodId(objCheckNotNull, j11, period.getAdGroupIndexAfterPositionUs(j10));
        }
        return new MediaSource.MediaPeriodId(objCheckNotNull, adGroupIndexForPositionUs, period.getFirstAdIndexToPlay(adGroupIndexForPositionUs), j11);
    }

    public boolean removeAfter(b bVar) {
        Assertions.checkStateNotNull(bVar);
        boolean z10 = false;
        if (bVar.equals(this.loading)) {
            return false;
        }
        this.loading = bVar;
        while (bVar.getNext() != null) {
            bVar = (b) Assertions.checkNotNull(bVar.getNext());
            if (bVar == this.reading) {
                this.reading = this.playing;
                z10 = true;
            }
            bVar.release();
            this.length--;
        }
        ((b) Assertions.checkNotNull(this.loading)).setNext(null);
        notifyQueueUpdate();
        return z10;
    }

    public MediaSource.MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange(Timeline timeline, Object obj, long j10) {
        long jResolvePeriodUidToWindowSequenceNumber = resolvePeriodUidToWindowSequenceNumber(timeline, obj);
        timeline.getPeriodByUid(obj, this.period);
        timeline.getWindow(this.period.windowIndex, this.window);
        boolean z10 = false;
        for (int indexOfPeriod = timeline.getIndexOfPeriod(obj); indexOfPeriod >= this.window.firstPeriodIndex; indexOfPeriod--) {
            boolean z11 = true;
            timeline.getPeriod(indexOfPeriod, this.period, true);
            if (this.period.getAdGroupCount() <= 0) {
                z11 = false;
            }
            z10 |= z11;
            Timeline.Period period = this.period;
            if (period.getAdGroupIndexForPositionUs(period.durationUs) != -1) {
                obj = Assertions.checkNotNull(this.period.uid);
            }
            if (z10 && (!z11 || this.period.durationUs != 0)) {
                break;
            }
        }
        return resolveMediaPeriodIdForAds(timeline, obj, j10, jResolvePeriodUidToWindowSequenceNumber, this.window, this.period);
    }
}
