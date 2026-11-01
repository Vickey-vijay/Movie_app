package io.bidmachine.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.datasource.TransferListener;
import io.bidmachine.media3.exoplayer.AbstractConcatenatedTimeline;
import io.bidmachine.media3.exoplayer.upstream.Allocator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
@UnstableApi
@Deprecated
public final class ConcatenatingMediaSource extends CompositeMediaSource<e> {
    private static final int MSG_ADD = 1;
    private static final int MSG_MOVE = 3;
    private static final int MSG_ON_COMPLETION = 6;
    private static final int MSG_REMOVE = 2;
    private static final int MSG_SET_SHUFFLE_ORDER = 4;
    private static final int MSG_UPDATE_TIMELINE = 5;
    private static final MediaItem PLACEHOLDER_MEDIA_ITEM = new MediaItem.Builder().setUri(Uri.EMPTY).build();
    private final Set<e> enabledMediaSourceHolders;
    private final boolean isAtomic;
    private final IdentityHashMap<MediaPeriod, e> mediaSourceByMediaPeriod;
    private final Map<Object, e> mediaSourceByUid;
    private final List<e> mediaSourceHolders;

    @GuardedBy("this")
    private final List<e> mediaSourcesPublic;
    private Set<d> nextTimelineUpdateOnCompletionActions;

    @GuardedBy("this")
    private final Set<d> pendingOnCompletionActions;

    @Nullable
    @GuardedBy("this")
    private Handler playbackThreadHandler;
    private ShuffleOrder shuffleOrder;
    private boolean timelineUpdateScheduled;
    private final boolean useLazyPreparation;

    public static final class b extends AbstractConcatenatedTimeline {
        private final HashMap<Object, Integer> childIndexByUid;
        private final int[] firstPeriodInChildIndices;
        private final int[] firstWindowInChildIndices;
        private final int periodCount;
        private final Timeline[] timelines;
        private final Object[] uids;
        private final int windowCount;

        @Override // io.bidmachine.media3.exoplayer.AbstractConcatenatedTimeline
        public int getChildIndexByChildUid(Object obj) {
            Integer num = this.childIndexByUid.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // io.bidmachine.media3.exoplayer.AbstractConcatenatedTimeline
        public int getChildIndexByPeriodIndex(int i10) {
            return Util.binarySearchFloor(this.firstPeriodInChildIndices, i10 + 1, false, false);
        }

        @Override // io.bidmachine.media3.exoplayer.AbstractConcatenatedTimeline
        public int getChildIndexByWindowIndex(int i10) {
            return Util.binarySearchFloor(this.firstWindowInChildIndices, i10 + 1, false, false);
        }

        @Override // io.bidmachine.media3.exoplayer.AbstractConcatenatedTimeline
        public Object getChildUidByChildIndex(int i10) {
            return this.uids[i10];
        }

        @Override // io.bidmachine.media3.exoplayer.AbstractConcatenatedTimeline
        public int getFirstPeriodIndexByChildIndex(int i10) {
            return this.firstPeriodInChildIndices[i10];
        }

        @Override // io.bidmachine.media3.exoplayer.AbstractConcatenatedTimeline
        public int getFirstWindowIndexByChildIndex(int i10) {
            return this.firstWindowInChildIndices[i10];
        }

        @Override // io.bidmachine.media3.common.Timeline
        public int getPeriodCount() {
            return this.periodCount;
        }

        @Override // io.bidmachine.media3.exoplayer.AbstractConcatenatedTimeline
        public Timeline getTimelineByChildIndex(int i10) {
            return this.timelines[i10];
        }

        @Override // io.bidmachine.media3.common.Timeline
        public int getWindowCount() {
            return this.windowCount;
        }

        public b(Collection<e> collection, ShuffleOrder shuffleOrder, boolean z10) {
            super(z10, shuffleOrder);
            int size = collection.size();
            this.firstPeriodInChildIndices = new int[size];
            this.firstWindowInChildIndices = new int[size];
            this.timelines = new Timeline[size];
            this.uids = new Object[size];
            this.childIndexByUid = new HashMap<>();
            int windowCount = 0;
            int periodCount = 0;
            int i10 = 0;
            for (e eVar : collection) {
                this.timelines[i10] = eVar.mediaSource.getTimeline();
                this.firstWindowInChildIndices[i10] = windowCount;
                this.firstPeriodInChildIndices[i10] = periodCount;
                windowCount += this.timelines[i10].getWindowCount();
                periodCount += this.timelines[i10].getPeriodCount();
                Object[] objArr = this.uids;
                Object obj = eVar.uid;
                objArr[i10] = obj;
                this.childIndexByUid.put(obj, Integer.valueOf(i10));
                i10++;
            }
            this.windowCount = windowCount;
            this.periodCount = periodCount;
        }
    }

    public static final class c extends BaseMediaSource {
        private c() {
        }

        @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
        @UnstableApi
        public /* bridge */ /* synthetic */ boolean canUpdateMediaItem(MediaItem mediaItem) {
            return super.canUpdateMediaItem(mediaItem);
        }

        @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
        @Nullable
        @UnstableApi
        public /* bridge */ /* synthetic */ Timeline getInitialTimeline() {
            return super.getInitialTimeline();
        }

        @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
        @UnstableApi
        public /* bridge */ /* synthetic */ boolean isSingleWindow() {
            return super.isSingleWindow();
        }

        @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
        public void maybeThrowSourceInfoRefreshError() {
        }

        @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource
        public void prepareSourceInternal(@Nullable TransferListener transferListener) {
        }

        @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
        public void releasePeriod(MediaPeriod mediaPeriod) {
        }

        @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource
        public void releaseSourceInternal() {
        }

        @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
        @UnstableApi
        public /* bridge */ /* synthetic */ void updateMediaItem(MediaItem mediaItem) {
            super.updateMediaItem(mediaItem);
        }

        @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
        public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
        public MediaItem getMediaItem() {
            return ConcatenatingMediaSource.PLACEHOLDER_MEDIA_ITEM;
        }
    }

    public static final class d {
        private final Handler handler;
        private final Runnable runnable;

        public void dispatch() {
            this.handler.post(this.runnable);
        }

        public d(Handler handler, Runnable runnable) {
            this.handler = handler;
            this.runnable = runnable;
        }
    }

    public static final class e {
        public int childIndex;
        public int firstWindowIndexInChild;
        public boolean isRemoved;
        public final MaskingMediaSource mediaSource;
        public final List<MediaSource.MediaPeriodId> activeMediaPeriodIds = new ArrayList();
        public final Object uid = new Object();

        public void reset(int i10, int i11) {
            this.childIndex = i10;
            this.firstWindowIndexInChild = i11;
            this.isRemoved = false;
            this.activeMediaPeriodIds.clear();
        }

        public e(MediaSource mediaSource, boolean z10) {
            this.mediaSource = new MaskingMediaSource(mediaSource, z10);
        }
    }

    public ConcatenatingMediaSource(MediaSource... mediaSourceArr) {
        this(false, mediaSourceArr);
    }

    @GuardedBy("this")
    private void addPublicMediaSources(int i10, Collection<MediaSource> collection, @Nullable Handler handler, @Nullable Runnable runnable) {
        Assertions.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.playbackThreadHandler;
        Iterator<MediaSource> it = collection.iterator();
        while (it.hasNext()) {
            Assertions.checkNotNull(it.next());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<MediaSource> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new e(it2.next(), this.useLazyPreparation));
        }
        this.mediaSourcesPublic.addAll(i10, arrayList);
        if (handler2 != null && !collection.isEmpty()) {
            handler2.obtainMessage(1, new f(i10, arrayList, createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private synchronized void dispatchOnCompletionActions(Set<d> set) {
        Iterator<d> it = set.iterator();
        while (it.hasNext()) {
            it.next().dispatch();
        }
        this.pendingOnCompletionActions.removeAll(set);
    }

    @GuardedBy("this")
    private void movePublicMediaSource(int i10, int i11, @Nullable Handler handler, @Nullable Runnable runnable) {
        Assertions.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.playbackThreadHandler;
        List<e> list = this.mediaSourcesPublic;
        list.add(i11, list.remove(i10));
        if (handler2 != null) {
            handler2.obtainMessage(3, new f(i10, Integer.valueOf(i11), createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    @GuardedBy("this")
    private void removePublicMediaSources(int i10, int i11, @Nullable Handler handler, @Nullable Runnable runnable) {
        Assertions.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.playbackThreadHandler;
        Util.removeRange(this.mediaSourcesPublic, i10, i11);
        if (handler2 != null) {
            handler2.obtainMessage(2, new f(i10, Integer.valueOf(i11), createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void scheduleTimelineUpdate() {
        scheduleTimelineUpdate(null);
    }

    @GuardedBy("this")
    private void setPublicShuffleOrder(ShuffleOrder shuffleOrder, @Nullable Handler handler, @Nullable Runnable runnable) {
        Assertions.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.playbackThreadHandler;
        if (handler2 != null) {
            int size = getSize();
            if (shuffleOrder.getLength() != size) {
                shuffleOrder = shuffleOrder.cloneAndClear().cloneAndInsert(0, size);
            }
            handler2.obtainMessage(4, new f(0, shuffleOrder, createOnCompletionAction(handler, runnable))).sendToTarget();
            return;
        }
        if (shuffleOrder.getLength() > 0) {
            shuffleOrder = shuffleOrder.cloneAndClear();
        }
        this.shuffleOrder = shuffleOrder;
        if (runnable == null || handler == null) {
            return;
        }
        handler.post(runnable);
    }

    private void updateTimelineAndScheduleOnCompletionActions() {
        this.timelineUpdateScheduled = false;
        Set<d> set = this.nextTimelineUpdateOnCompletionActions;
        this.nextTimelineUpdateOnCompletionActions = new HashSet();
        refreshSourceInfo(new b(this.mediaSourceHolders, this.shuffleOrder, this.isAtomic));
        getPlaybackThreadHandlerOnPlaybackThread().obtainMessage(6, set).sendToTarget();
    }

    public synchronized void addMediaSource(MediaSource mediaSource) {
        addMediaSource(this.mediaSourcesPublic.size(), mediaSource);
    }

    public synchronized void addMediaSources(Collection<MediaSource> collection) {
        addPublicMediaSources(this.mediaSourcesPublic.size(), collection, null, null);
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    @UnstableApi
    public /* bridge */ /* synthetic */ boolean canUpdateMediaItem(MediaItem mediaItem) {
        return super.canUpdateMediaItem(mediaItem);
    }

    public synchronized void clear() {
        removeMediaSourceRange(0, getSize());
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource
    public void enableInternal() {
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public synchronized Timeline getInitialTimeline() {
        return new b(this.mediaSourcesPublic, this.shuffleOrder.getLength() != this.mediaSourcesPublic.size() ? this.shuffleOrder.cloneAndClear().cloneAndInsert(0, this.mediaSourcesPublic.size()) : this.shuffleOrder, this.isAtomic);
    }

    public synchronized MediaSource getMediaSource(int i10) {
        return this.mediaSourcesPublic.get(i10).mediaSource;
    }

    public synchronized int getSize() {
        return this.mediaSourcesPublic.size();
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public boolean isSingleWindow() {
        return false;
    }

    public synchronized void moveMediaSource(int i10, int i11) {
        movePublicMediaSource(i10, i11, null, null);
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource
    public synchronized void prepareSourceInternal(@Nullable TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        this.playbackThreadHandler = new Handler(new Handler.Callback() { // from class: og.c
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f65347b.handleMessage(message);
            }
        });
        if (this.mediaSourcesPublic.isEmpty()) {
            updateTimelineAndScheduleOnCompletionActions();
        } else {
            this.shuffleOrder = this.shuffleOrder.cloneAndInsert(0, this.mediaSourcesPublic.size());
            addMediaSourcesInternal(0, this.mediaSourcesPublic);
            scheduleTimelineUpdate();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource
    public synchronized void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.mediaSourceHolders.clear();
        this.enabledMediaSourceHolders.clear();
        this.mediaSourceByUid.clear();
        this.shuffleOrder = this.shuffleOrder.cloneAndClear();
        Handler handler = this.playbackThreadHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.playbackThreadHandler = null;
        }
        this.timelineUpdateScheduled = false;
        this.nextTimelineUpdateOnCompletionActions.clear();
        dispatchOnCompletionActions(this.pendingOnCompletionActions);
    }

    public synchronized MediaSource removeMediaSource(int i10) {
        MediaSource mediaSource;
        mediaSource = getMediaSource(i10);
        removePublicMediaSources(i10, i10 + 1, null, null);
        return mediaSource;
    }

    public synchronized void removeMediaSourceRange(int i10, int i11) {
        removePublicMediaSources(i10, i11, null, null);
    }

    public synchronized void setShuffleOrder(ShuffleOrder shuffleOrder) {
        setPublicShuffleOrder(shuffleOrder, null, null);
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    @UnstableApi
    public /* bridge */ /* synthetic */ void updateMediaItem(MediaItem mediaItem) {
        super.updateMediaItem(mediaItem);
    }

    public static final class f<T> {
        public final T customData;
        public final int index;

        @Nullable
        public final d onCompletionAction;

        public f(int i10, T t10, @Nullable d dVar) {
            this.index = i10;
            this.customData = t10;
            this.onCompletionAction = dVar;
        }
    }

    public ConcatenatingMediaSource(boolean z10, MediaSource... mediaSourceArr) {
        this(z10, new ShuffleOrder.DefaultShuffleOrder(0), mediaSourceArr);
    }

    private void addMediaSourceInternal(int i10, e eVar) {
        if (i10 > 0) {
            e eVar2 = this.mediaSourceHolders.get(i10 - 1);
            eVar.reset(i10, eVar2.firstWindowIndexInChild + eVar2.mediaSource.getTimeline().getWindowCount());
        } else {
            eVar.reset(i10, 0);
        }
        correctOffsets(i10, 1, eVar.mediaSource.getTimeline().getWindowCount());
        this.mediaSourceHolders.add(i10, eVar);
        this.mediaSourceByUid.put(eVar.uid, eVar);
        prepareChildSource(eVar, eVar.mediaSource);
        if (isEnabled() && this.mediaSourceByMediaPeriod.isEmpty()) {
            this.enabledMediaSourceHolders.add(eVar);
        } else {
            disableChildSource(eVar);
        }
    }

    private void correctOffsets(int i10, int i11, int i12) {
        while (i10 < this.mediaSourceHolders.size()) {
            e eVar = this.mediaSourceHolders.get(i10);
            eVar.childIndex += i11;
            eVar.firstWindowIndexInChild += i12;
            i10++;
        }
    }

    @Nullable
    @GuardedBy("this")
    private d createOnCompletionAction(@Nullable Handler handler, @Nullable Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        d dVar = new d(handler, runnable);
        this.pendingOnCompletionActions.add(dVar);
        return dVar;
    }

    private void disableUnusedMediaSources() {
        Iterator<e> it = this.enabledMediaSourceHolders.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.activeMediaPeriodIds.isEmpty()) {
                disableChildSource(next);
                it.remove();
            }
        }
    }

    private void enableMediaSource(e eVar) {
        this.enabledMediaSourceHolders.add(eVar);
        enableChildSource(eVar);
    }

    private static Object getPeriodUid(e eVar, Object obj) {
        return AbstractConcatenatedTimeline.getConcatenatedUid(eVar.uid, obj);
    }

    private Handler getPlaybackThreadHandlerOnPlaybackThread() {
        return (Handler) Assertions.checkNotNull(this.playbackThreadHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                f fVar = (f) Util.castNonNull(message.obj);
                this.shuffleOrder = this.shuffleOrder.cloneAndInsert(fVar.index, ((Collection) fVar.customData).size());
                addMediaSourcesInternal(fVar.index, (Collection) fVar.customData);
                scheduleTimelineUpdate(fVar.onCompletionAction);
                return true;
            case 2:
                f fVar2 = (f) Util.castNonNull(message.obj);
                int i10 = fVar2.index;
                int iIntValue = ((Integer) fVar2.customData).intValue();
                if (i10 == 0 && iIntValue == this.shuffleOrder.getLength()) {
                    this.shuffleOrder = this.shuffleOrder.cloneAndClear();
                } else {
                    this.shuffleOrder = this.shuffleOrder.cloneAndRemove(i10, iIntValue);
                }
                for (int i11 = iIntValue - 1; i11 >= i10; i11--) {
                    removeMediaSourceInternal(i11);
                }
                scheduleTimelineUpdate(fVar2.onCompletionAction);
                return true;
            case 3:
                f fVar3 = (f) Util.castNonNull(message.obj);
                ShuffleOrder shuffleOrder = this.shuffleOrder;
                int i12 = fVar3.index;
                ShuffleOrder shuffleOrderCloneAndRemove = shuffleOrder.cloneAndRemove(i12, i12 + 1);
                this.shuffleOrder = shuffleOrderCloneAndRemove;
                this.shuffleOrder = shuffleOrderCloneAndRemove.cloneAndInsert(((Integer) fVar3.customData).intValue(), 1);
                moveMediaSourceInternal(fVar3.index, ((Integer) fVar3.customData).intValue());
                scheduleTimelineUpdate(fVar3.onCompletionAction);
                return true;
            case 4:
                f fVar4 = (f) Util.castNonNull(message.obj);
                this.shuffleOrder = (ShuffleOrder) fVar4.customData;
                scheduleTimelineUpdate(fVar4.onCompletionAction);
                return true;
            case 5:
                updateTimelineAndScheduleOnCompletionActions();
                return true;
            case 6:
                dispatchOnCompletionActions((Set) Util.castNonNull(message.obj));
                return true;
            default:
                throw new IllegalStateException();
        }
    }

    private void maybeReleaseChildSource(e eVar) {
        if (eVar.isRemoved && eVar.activeMediaPeriodIds.isEmpty()) {
            this.enabledMediaSourceHolders.remove(eVar);
            releaseChildSource(eVar);
        }
    }

    private void removeMediaSourceInternal(int i10) {
        e eVarRemove = this.mediaSourceHolders.remove(i10);
        this.mediaSourceByUid.remove(eVarRemove.uid);
        correctOffsets(i10, -1, -eVarRemove.mediaSource.getTimeline().getWindowCount());
        eVarRemove.isRemoved = true;
        maybeReleaseChildSource(eVarRemove);
    }

    private void scheduleTimelineUpdate(@Nullable d dVar) {
        if (!this.timelineUpdateScheduled) {
            getPlaybackThreadHandlerOnPlaybackThread().obtainMessage(5).sendToTarget();
            this.timelineUpdateScheduled = true;
        }
        if (dVar != null) {
            this.nextTimelineUpdateOnCompletionActions.add(dVar);
        }
    }

    private void updateMediaSourceInternal(e eVar, Timeline timeline) {
        if (eVar.childIndex + 1 < this.mediaSourceHolders.size()) {
            int windowCount = timeline.getWindowCount() - (this.mediaSourceHolders.get(eVar.childIndex + 1).firstWindowIndexInChild - eVar.firstWindowIndexInChild);
            if (windowCount != 0) {
                correctOffsets(eVar.childIndex + 1, 0, windowCount);
            }
        }
        scheduleTimelineUpdate();
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j10) {
        Object mediaSourceHolderUid = getMediaSourceHolderUid(mediaPeriodId.periodUid);
        MediaSource.MediaPeriodId mediaPeriodIdCopyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(getChildPeriodUid(mediaPeriodId.periodUid));
        e eVar = this.mediaSourceByUid.get(mediaSourceHolderUid);
        if (eVar == null) {
            eVar = new e(new c(), this.useLazyPreparation);
            eVar.isRemoved = true;
            prepareChildSource(eVar, eVar.mediaSource);
        }
        enableMediaSource(eVar);
        eVar.activeMediaPeriodIds.add(mediaPeriodIdCopyWithPeriodUid);
        MaskingMediaPeriod maskingMediaPeriodCreatePeriod = eVar.mediaSource.createPeriod(mediaPeriodIdCopyWithPeriodUid, allocator, j10);
        this.mediaSourceByMediaPeriod.put(maskingMediaPeriodCreatePeriod, eVar);
        disableUnusedMediaSources();
        return maskingMediaPeriodCreatePeriod;
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public MediaItem getMediaItem() {
        return PLACEHOLDER_MEDIA_ITEM;
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource
    @Nullable
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(e eVar, MediaSource.MediaPeriodId mediaPeriodId) {
        for (int i10 = 0; i10 < eVar.activeMediaPeriodIds.size(); i10++) {
            if (eVar.activeMediaPeriodIds.get(i10).windowSequenceNumber == mediaPeriodId.windowSequenceNumber) {
                return mediaPeriodId.copyWithPeriodUid(getPeriodUid(eVar, mediaPeriodId.periodUid));
            }
        }
        return null;
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource
    public int getWindowIndexForChildWindowIndex(e eVar, int i10) {
        return i10 + eVar.firstWindowIndexInChild;
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource
    /* JADX INFO: renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void lambda$prepareChildSource$0(e eVar, MediaSource mediaSource, Timeline timeline) {
        updateMediaSourceInternal(eVar, timeline);
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        e eVar = (e) Assertions.checkNotNull(this.mediaSourceByMediaPeriod.remove(mediaPeriod));
        eVar.mediaSource.releasePeriod(mediaPeriod);
        eVar.activeMediaPeriodIds.remove(((MaskingMediaPeriod) mediaPeriod).f59892id);
        if (!this.mediaSourceByMediaPeriod.isEmpty()) {
            disableUnusedMediaSources();
        }
        maybeReleaseChildSource(eVar);
    }

    public ConcatenatingMediaSource(boolean z10, ShuffleOrder shuffleOrder, MediaSource... mediaSourceArr) {
        this(z10, false, shuffleOrder, mediaSourceArr);
    }

    private void addMediaSourcesInternal(int i10, Collection<e> collection) {
        Iterator<e> it = collection.iterator();
        while (it.hasNext()) {
            addMediaSourceInternal(i10, it.next());
            i10++;
        }
    }

    private static Object getChildPeriodUid(Object obj) {
        return AbstractConcatenatedTimeline.getChildPeriodUidFromConcatenatedUid(obj);
    }

    private static Object getMediaSourceHolderUid(Object obj) {
        return AbstractConcatenatedTimeline.getChildTimelineUidFromConcatenatedUid(obj);
    }

    private void moveMediaSourceInternal(int i10, int i11) {
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(i10, i11);
        int windowCount = this.mediaSourceHolders.get(iMin).firstWindowIndexInChild;
        List<e> list = this.mediaSourceHolders;
        list.add(i11, list.remove(i10));
        while (iMin <= iMax) {
            e eVar = this.mediaSourceHolders.get(iMin);
            eVar.childIndex = iMin;
            eVar.firstWindowIndexInChild = windowCount;
            windowCount += eVar.mediaSource.getTimeline().getWindowCount();
            iMin++;
        }
    }

    public synchronized void addMediaSource(MediaSource mediaSource, Handler handler, Runnable runnable) {
        addMediaSource(this.mediaSourcesPublic.size(), mediaSource, handler, runnable);
    }

    public synchronized void clear(Handler handler, Runnable runnable) {
        removeMediaSourceRange(0, getSize(), handler, runnable);
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource
    public void disableInternal() {
        super.disableInternal();
        this.enabledMediaSourceHolders.clear();
    }

    public synchronized void moveMediaSource(int i10, int i11, Handler handler, Runnable runnable) {
        movePublicMediaSource(i10, i11, handler, runnable);
    }

    public synchronized void removeMediaSourceRange(int i10, int i11, Handler handler, Runnable runnable) {
        removePublicMediaSources(i10, i11, handler, runnable);
    }

    public synchronized void setShuffleOrder(ShuffleOrder shuffleOrder, Handler handler, Runnable runnable) {
        setPublicShuffleOrder(shuffleOrder, handler, runnable);
    }

    public ConcatenatingMediaSource(boolean z10, boolean z11, ShuffleOrder shuffleOrder, MediaSource... mediaSourceArr) {
        for (MediaSource mediaSource : mediaSourceArr) {
            Assertions.checkNotNull(mediaSource);
        }
        this.shuffleOrder = shuffleOrder.getLength() > 0 ? shuffleOrder.cloneAndClear() : shuffleOrder;
        this.mediaSourceByMediaPeriod = new IdentityHashMap<>();
        this.mediaSourceByUid = new HashMap();
        this.mediaSourcesPublic = new ArrayList();
        this.mediaSourceHolders = new ArrayList();
        this.nextTimelineUpdateOnCompletionActions = new HashSet();
        this.pendingOnCompletionActions = new HashSet();
        this.enabledMediaSourceHolders = new HashSet();
        this.isAtomic = z10;
        this.useLazyPreparation = z11;
        addMediaSources(Arrays.asList(mediaSourceArr));
    }

    public synchronized MediaSource removeMediaSource(int i10, Handler handler, Runnable runnable) {
        MediaSource mediaSource;
        mediaSource = getMediaSource(i10);
        removePublicMediaSources(i10, i10 + 1, handler, runnable);
        return mediaSource;
    }

    public synchronized void addMediaSource(int i10, MediaSource mediaSource) {
        addPublicMediaSources(i10, Collections.singletonList(mediaSource), null, null);
    }

    public synchronized void addMediaSources(Collection<MediaSource> collection, Handler handler, Runnable runnable) {
        addPublicMediaSources(this.mediaSourcesPublic.size(), collection, handler, runnable);
    }

    public synchronized void addMediaSources(int i10, Collection<MediaSource> collection) {
        addPublicMediaSources(i10, collection, null, null);
    }

    public synchronized void addMediaSource(int i10, MediaSource mediaSource, Handler handler, Runnable runnable) {
        addPublicMediaSources(i10, Collections.singletonList(mediaSource), handler, runnable);
    }

    public synchronized void addMediaSources(int i10, Collection<MediaSource> collection, Handler handler, Runnable runnable) {
        addPublicMediaSources(i10, collection, handler, runnable);
    }
}
