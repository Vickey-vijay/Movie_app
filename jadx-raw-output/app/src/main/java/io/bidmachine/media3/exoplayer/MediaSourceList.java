package io.bidmachine.media3.exoplayer;

import android.util.Pair;
import androidx.annotation.Nullable;
import cg.g2;
import cg.r1;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.HandlerWrapper;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.datasource.TransferListener;
import io.bidmachine.media3.exoplayer.analytics.AnalyticsCollector;
import io.bidmachine.media3.exoplayer.analytics.PlayerId;
import io.bidmachine.media3.exoplayer.drm.DrmSessionEventListener;
import io.bidmachine.media3.exoplayer.source.LoadEventInfo;
import io.bidmachine.media3.exoplayer.source.MaskingMediaPeriod;
import io.bidmachine.media3.exoplayer.source.MaskingMediaSource;
import io.bidmachine.media3.exoplayer.source.MediaLoadData;
import io.bidmachine.media3.exoplayer.source.MediaPeriod;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import io.bidmachine.media3.exoplayer.source.MediaSourceEventListener;
import io.bidmachine.media3.exoplayer.source.ShuffleOrder;
import io.bidmachine.media3.exoplayer.upstream.Allocator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaSourceList {
    private static final String TAG = "MediaSourceList";
    private final HandlerWrapper eventHandler;
    private final AnalyticsCollector eventListener;
    private boolean isPrepared;
    private final MediaSourceListInfoRefreshListener mediaSourceListInfoListener;

    @Nullable
    private TransferListener mediaTransferListener;
    private final PlayerId playerId;
    private ShuffleOrder shuffleOrder = new ShuffleOrder.DefaultShuffleOrder(0);
    private final IdentityHashMap<MediaPeriod, c> mediaSourceByMediaPeriod = new IdentityHashMap<>();
    private final Map<Object, c> mediaSourceByUid = new HashMap();
    private final List<c> mediaSourceHolders = new ArrayList();
    private final HashMap<c, b> childSources = new HashMap<>();
    private final Set<c> enabledMediaSourceHolders = new HashSet();

    public interface MediaSourceListInfoRefreshListener {
        void onPlaylistUpdateRequested();
    }

    public final class a implements MediaSourceEventListener, DrmSessionEventListener {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final c f59882id;

        @Nullable
        private Pair<Integer, MediaSource.MediaPeriodId> getEventParameters(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            MediaSource.MediaPeriodId mediaPeriodId2 = null;
            if (mediaPeriodId != null) {
                MediaSource.MediaPeriodId mediaPeriodIdForChildMediaPeriodId = MediaSourceList.getMediaPeriodIdForChildMediaPeriodId(this.f59882id, mediaPeriodId);
                if (mediaPeriodIdForChildMediaPeriodId == null) {
                    return null;
                }
                mediaPeriodId2 = mediaPeriodIdForChildMediaPeriodId;
            }
            return Pair.create(Integer.valueOf(MediaSourceList.getWindowIndexForChildWindowIndex(this.f59882id, i10)), mediaPeriodId2);
        }

        @Override // io.bidmachine.media3.exoplayer.drm.DrmSessionEventListener
        @Deprecated
        public /* bridge */ /* synthetic */ void onDrmSessionAcquired(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            super.onDrmSessionAcquired(i10, mediaPeriodId);
        }

        @Override // io.bidmachine.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmSessionAcquired(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final int i11) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i10, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: cg.a2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5818b.lambda$onDrmSessionAcquired$6(eventParameters, i11);
                    }
                });
            }
        }

        public a(c cVar) {
            this.f59882id = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDownstreamFormatChanged$5(Pair pair, MediaLoadData mediaLoadData) {
            MediaSourceList.this.eventListener.onDownstreamFormatChanged(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, mediaLoadData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDrmKeysLoaded$7(Pair pair) {
            MediaSourceList.this.eventListener.onDrmKeysLoaded(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDrmKeysRemoved$10(Pair pair) {
            MediaSourceList.this.eventListener.onDrmKeysRemoved(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDrmKeysRestored$9(Pair pair) {
            MediaSourceList.this.eventListener.onDrmKeysRestored(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDrmSessionAcquired$6(Pair pair, int i10) {
            MediaSourceList.this.eventListener.onDrmSessionAcquired(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDrmSessionManagerError$8(Pair pair, Exception exc) {
            MediaSourceList.this.eventListener.onDrmSessionManagerError(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDrmSessionReleased$11(Pair pair) {
            MediaSourceList.this.eventListener.onDrmSessionReleased(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLoadCanceled$2(Pair pair, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            MediaSourceList.this.eventListener.onLoadCanceled(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, loadEventInfo, mediaLoadData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLoadCompleted$1(Pair pair, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            MediaSourceList.this.eventListener.onLoadCompleted(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, loadEventInfo, mediaLoadData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLoadError$3(Pair pair, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z10) {
            MediaSourceList.this.eventListener.onLoadError(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, loadEventInfo, mediaLoadData, iOException, z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLoadStarted$0(Pair pair, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            MediaSourceList.this.eventListener.onLoadStarted(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, loadEventInfo, mediaLoadData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onUpstreamDiscarded$4(Pair pair, MediaLoadData mediaLoadData) {
            MediaSourceList.this.eventListener.onUpstreamDiscarded(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) Assertions.checkNotNull((MediaSource.MediaPeriodId) pair.second), mediaLoadData);
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSourceEventListener
        public void onDownstreamFormatChanged(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final MediaLoadData mediaLoadData) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i10, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: cg.b2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5824b.lambda$onDownstreamFormatChanged$5(eventParameters, mediaLoadData);
                    }
                });
            }
        }

        @Override // io.bidmachine.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmKeysLoaded(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i10, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: cg.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5902b.lambda$onDrmKeysLoaded$7(eventParameters);
                    }
                });
            }
        }

        @Override // io.bidmachine.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmKeysRemoved(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i10, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: cg.c2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5829b.lambda$onDrmKeysRemoved$10(eventParameters);
                    }
                });
            }
        }

        @Override // io.bidmachine.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmKeysRestored(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i10, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: cg.d2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5834b.lambda$onDrmKeysRestored$9(eventParameters);
                    }
                });
            }
        }

        @Override // io.bidmachine.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmSessionManagerError(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final Exception exc) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i10, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: cg.y1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5918b.lambda$onDrmSessionManagerError$8(eventParameters, exc);
                    }
                });
            }
        }

        @Override // io.bidmachine.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmSessionReleased(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i10, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: cg.x1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5912b.lambda$onDrmSessionReleased$11(eventParameters);
                    }
                });
            }
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSourceEventListener
        public void onLoadCanceled(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i10, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: cg.z1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5924b.lambda$onLoadCanceled$2(eventParameters, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSourceEventListener
        public void onLoadCompleted(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i10, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: cg.w1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5906b.lambda$onLoadCompleted$1(eventParameters, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSourceEventListener
        public void onLoadError(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final IOException iOException, final boolean z10) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i10, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: cg.u1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5895b.lambda$onLoadError$3(eventParameters, loadEventInfo, mediaLoadData, iOException, z10);
                    }
                });
            }
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSourceEventListener
        public void onLoadStarted(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i10, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: cg.t1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5889b.lambda$onLoadStarted$0(eventParameters, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSourceEventListener
        public void onUpstreamDiscarded(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final MediaLoadData mediaLoadData) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i10, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: cg.e2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5839b.lambda$onUpstreamDiscarded$4(eventParameters, mediaLoadData);
                    }
                });
            }
        }
    }

    public static final class c implements r1 {
        public int firstWindowIndexInChild;
        public boolean isRemoved;
        public final MaskingMediaSource mediaSource;
        public final List<MediaSource.MediaPeriodId> activeMediaPeriodIds = new ArrayList();
        public final Object uid = new Object();

        @Override // cg.r1
        public Timeline getTimeline() {
            return this.mediaSource.getTimeline();
        }

        @Override // cg.r1
        public Object getUid() {
            return this.uid;
        }

        public void reset(int i10) {
            this.firstWindowIndexInChild = i10;
            this.isRemoved = false;
            this.activeMediaPeriodIds.clear();
        }

        public c(MediaSource mediaSource, boolean z10) {
            this.mediaSource = new MaskingMediaSource(mediaSource, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(c cVar, MediaSource.MediaPeriodId mediaPeriodId) {
        for (int i10 = 0; i10 < cVar.activeMediaPeriodIds.size(); i10++) {
            if (cVar.activeMediaPeriodIds.get(i10).windowSequenceNumber == mediaPeriodId.windowSequenceNumber) {
                return mediaPeriodId.copyWithPeriodUid(getPeriodUid(cVar, mediaPeriodId.periodUid));
            }
        }
        return null;
    }

    private void removeMediaSourcesInternal(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c cVarRemove = this.mediaSourceHolders.remove(i12);
            this.mediaSourceByUid.remove(cVarRemove.uid);
            correctOffsets(i12, -cVarRemove.mediaSource.getTimeline().getWindowCount());
            cVarRemove.isRemoved = true;
            if (this.isPrepared) {
                maybeReleaseChildSource(cVarRemove);
            }
        }
    }

    public Timeline moveMediaSourceRange(int i10, int i11, int i12, ShuffleOrder shuffleOrder) {
        Assertions.checkArgument(i10 >= 0 && i10 <= i11 && i11 <= getSize() && i12 >= 0);
        this.shuffleOrder = shuffleOrder;
        if (i10 == i11 || i10 == i12) {
            return createTimeline();
        }
        int iMin = Math.min(i10, i12);
        int iMax = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
        int windowCount = this.mediaSourceHolders.get(iMin).firstWindowIndexInChild;
        Util.moveItems(this.mediaSourceHolders, i10, i11, i12);
        while (iMin <= iMax) {
            c cVar = this.mediaSourceHolders.get(iMin);
            cVar.firstWindowIndexInChild = windowCount;
            windowCount += cVar.mediaSource.getTimeline().getWindowCount();
            iMin++;
        }
        return createTimeline();
    }

    public Timeline updateMediaSourcesWithMediaItems(int i10, int i11, List<MediaItem> list) {
        Assertions.checkArgument(i10 >= 0 && i10 <= i11 && i11 <= getSize());
        Assertions.checkArgument(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            this.mediaSourceHolders.get(i12).mediaSource.updateMediaItem(list.get(i12 - i10));
        }
        return createTimeline();
    }

    public static final class b {
        public final MediaSource.MediaSourceCaller caller;
        public final a eventListener;
        public final MediaSource mediaSource;

        public b(MediaSource mediaSource, MediaSource.MediaSourceCaller mediaSourceCaller, a aVar) {
            this.mediaSource = mediaSource;
            this.caller = mediaSourceCaller;
            this.eventListener = aVar;
        }
    }

    private void correctOffsets(int i10, int i11) {
        while (i10 < this.mediaSourceHolders.size()) {
            this.mediaSourceHolders.get(i10).firstWindowIndexInChild += i11;
            i10++;
        }
    }

    private void disableChildSource(c cVar) {
        b bVar = this.childSources.get(cVar);
        if (bVar != null) {
            bVar.mediaSource.disable(bVar.caller);
        }
    }

    private void disableUnusedMediaSources() {
        Iterator<c> it = this.enabledMediaSourceHolders.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.activeMediaPeriodIds.isEmpty()) {
                disableChildSource(next);
                it.remove();
            }
        }
    }

    private void enableMediaSource(c cVar) {
        this.enabledMediaSourceHolders.add(cVar);
        b bVar = this.childSources.get(cVar);
        if (bVar != null) {
            bVar.mediaSource.enable(bVar.caller);
        }
    }

    private static Object getPeriodUid(c cVar, Object obj) {
        return AbstractConcatenatedTimeline.getConcatenatedUid(cVar.uid, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getWindowIndexForChildWindowIndex(c cVar, int i10) {
        return i10 + cVar.firstWindowIndexInChild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareChildSource$0(MediaSource mediaSource, Timeline timeline) {
        this.mediaSourceListInfoListener.onPlaylistUpdateRequested();
    }

    private void maybeReleaseChildSource(c cVar) {
        if (cVar.isRemoved && cVar.activeMediaPeriodIds.isEmpty()) {
            b bVar = (b) Assertions.checkNotNull(this.childSources.remove(cVar));
            bVar.mediaSource.releaseSource(bVar.caller);
            bVar.mediaSource.removeEventListener(bVar.eventListener);
            bVar.mediaSource.removeDrmEventListener(bVar.eventListener);
            this.enabledMediaSourceHolders.remove(cVar);
        }
    }

    private void prepareChildSource(c cVar) {
        MaskingMediaSource maskingMediaSource = cVar.mediaSource;
        MediaSource.MediaSourceCaller mediaSourceCaller = new MediaSource.MediaSourceCaller() { // from class: cg.s1
            @Override // io.bidmachine.media3.exoplayer.source.MediaSource.MediaSourceCaller
            public final void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline) {
                this.f5887b.lambda$prepareChildSource$0(mediaSource, timeline);
            }
        };
        a aVar = new a(cVar);
        this.childSources.put(cVar, new b(maskingMediaSource, mediaSourceCaller, aVar));
        maskingMediaSource.addEventListener(Util.createHandlerForCurrentOrMainLooper(), aVar);
        maskingMediaSource.addDrmEventListener(Util.createHandlerForCurrentOrMainLooper(), aVar);
        maskingMediaSource.prepareSource(mediaSourceCaller, this.mediaTransferListener, this.playerId);
    }

    public Timeline clear(@Nullable ShuffleOrder shuffleOrder) {
        if (shuffleOrder == null) {
            shuffleOrder = this.shuffleOrder.cloneAndClear();
        }
        this.shuffleOrder = shuffleOrder;
        removeMediaSourcesInternal(0, getSize());
        return createTimeline();
    }

    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j10) {
        Object mediaSourceHolderUid = getMediaSourceHolderUid(mediaPeriodId.periodUid);
        MediaSource.MediaPeriodId mediaPeriodIdCopyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(getChildPeriodUid(mediaPeriodId.periodUid));
        c cVar = (c) Assertions.checkNotNull(this.mediaSourceByUid.get(mediaSourceHolderUid));
        enableMediaSource(cVar);
        cVar.activeMediaPeriodIds.add(mediaPeriodIdCopyWithPeriodUid);
        MaskingMediaPeriod maskingMediaPeriodCreatePeriod = cVar.mediaSource.createPeriod(mediaPeriodIdCopyWithPeriodUid, allocator, j10);
        this.mediaSourceByMediaPeriod.put(maskingMediaPeriodCreatePeriod, cVar);
        disableUnusedMediaSources();
        return maskingMediaPeriodCreatePeriod;
    }

    public Timeline createTimeline() {
        if (this.mediaSourceHolders.isEmpty()) {
            return Timeline.EMPTY;
        }
        int windowCount = 0;
        for (int i10 = 0; i10 < this.mediaSourceHolders.size(); i10++) {
            c cVar = this.mediaSourceHolders.get(i10);
            cVar.firstWindowIndexInChild = windowCount;
            windowCount += cVar.mediaSource.getTimeline().getWindowCount();
        }
        return new g2(this.mediaSourceHolders, this.shuffleOrder);
    }

    public ShuffleOrder getShuffleOrder() {
        return this.shuffleOrder;
    }

    public int getSize() {
        return this.mediaSourceHolders.size();
    }

    public boolean isPrepared() {
        return this.isPrepared;
    }

    public Timeline moveMediaSource(int i10, int i11, ShuffleOrder shuffleOrder) {
        return moveMediaSourceRange(i10, i10 + 1, i11, shuffleOrder);
    }

    public void prepare(@Nullable TransferListener transferListener) {
        Assertions.checkState(!this.isPrepared);
        this.mediaTransferListener = transferListener;
        for (int i10 = 0; i10 < this.mediaSourceHolders.size(); i10++) {
            c cVar = this.mediaSourceHolders.get(i10);
            prepareChildSource(cVar);
            this.enabledMediaSourceHolders.add(cVar);
        }
        this.isPrepared = true;
    }

    public void release() {
        for (b bVar : this.childSources.values()) {
            try {
                bVar.mediaSource.releaseSource(bVar.caller);
            } catch (RuntimeException e10) {
                Log.e(TAG, "Failed to release child source.", e10);
            }
            bVar.mediaSource.removeEventListener(bVar.eventListener);
            bVar.mediaSource.removeDrmEventListener(bVar.eventListener);
        }
        this.childSources.clear();
        this.enabledMediaSourceHolders.clear();
        this.isPrepared = false;
    }

    public void releasePeriod(MediaPeriod mediaPeriod) {
        c cVar = (c) Assertions.checkNotNull(this.mediaSourceByMediaPeriod.remove(mediaPeriod));
        cVar.mediaSource.releasePeriod(mediaPeriod);
        cVar.activeMediaPeriodIds.remove(((MaskingMediaPeriod) mediaPeriod).f59892id);
        if (!this.mediaSourceByMediaPeriod.isEmpty()) {
            disableUnusedMediaSources();
        }
        maybeReleaseChildSource(cVar);
    }

    public Timeline removeMediaSourceRange(int i10, int i11, ShuffleOrder shuffleOrder) {
        Assertions.checkArgument(i10 >= 0 && i10 <= i11 && i11 <= getSize());
        this.shuffleOrder = shuffleOrder;
        removeMediaSourcesInternal(i10, i11);
        return createTimeline();
    }

    public Timeline setMediaSources(List<c> list, ShuffleOrder shuffleOrder) {
        removeMediaSourcesInternal(0, this.mediaSourceHolders.size());
        return addMediaSources(this.mediaSourceHolders.size(), list, shuffleOrder);
    }

    public MediaSourceList(MediaSourceListInfoRefreshListener mediaSourceListInfoRefreshListener, AnalyticsCollector analyticsCollector, HandlerWrapper handlerWrapper, PlayerId playerId) {
        this.playerId = playerId;
        this.mediaSourceListInfoListener = mediaSourceListInfoRefreshListener;
        this.eventListener = analyticsCollector;
        this.eventHandler = handlerWrapper;
    }

    private static Object getChildPeriodUid(Object obj) {
        return AbstractConcatenatedTimeline.getChildPeriodUidFromConcatenatedUid(obj);
    }

    private static Object getMediaSourceHolderUid(Object obj) {
        return AbstractConcatenatedTimeline.getChildTimelineUidFromConcatenatedUid(obj);
    }

    public Timeline addMediaSources(int i10, List<c> list, ShuffleOrder shuffleOrder) {
        if (!list.isEmpty()) {
            this.shuffleOrder = shuffleOrder;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = this.mediaSourceHolders.get(i11 - 1);
                    cVar.reset(cVar2.firstWindowIndexInChild + cVar2.mediaSource.getTimeline().getWindowCount());
                } else {
                    cVar.reset(0);
                }
                correctOffsets(i11, cVar.mediaSource.getTimeline().getWindowCount());
                this.mediaSourceHolders.add(i11, cVar);
                this.mediaSourceByUid.put(cVar.uid, cVar);
                if (this.isPrepared) {
                    prepareChildSource(cVar);
                    if (this.mediaSourceByMediaPeriod.isEmpty()) {
                        this.enabledMediaSourceHolders.add(cVar);
                    } else {
                        disableChildSource(cVar);
                    }
                }
            }
        }
        return createTimeline();
    }

    public Timeline setShuffleOrder(ShuffleOrder shuffleOrder) {
        int size = getSize();
        if (shuffleOrder.getLength() != size) {
            shuffleOrder = shuffleOrder.cloneAndClear().cloneAndInsert(0, size);
        }
        this.shuffleOrder = shuffleOrder;
        return createTimeline();
    }
}
