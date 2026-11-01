package io.bidmachine.media3.exoplayer.source.preload;

import android.os.Handler;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class BasePreloadManager<T> {
    private final MediaSource.Factory mediaSourceFactory;
    public final Comparator<T> rankingDataComparator;
    private final TargetPreloadStatusControl<T> targetPreloadStatusControl;

    @Nullable
    @GuardedBy("lock")
    private TargetPreloadStatusControl.PreloadStatus targetPreloadStatusOfCurrentPreloadingSource;
    private final Object lock = new Object();
    private final Map<MediaItem, BasePreloadManager<T>.a> mediaItemMediaSourceHolderMap = new HashMap();
    private final Handler startPreloadingHandler = Util.createHandlerForCurrentOrMainLooper();

    @GuardedBy("lock")
    private final PriorityQueue<BasePreloadManager<T>.a> sourceHolderPriorityQueue = new PriorityQueue<>();

    public final class a implements Comparable<BasePreloadManager<T>.a> {
        public final MediaSource mediaSource;
        public final T rankingData;
        public final long startPositionUs;

        public a(BasePreloadManager basePreloadManager, MediaSource mediaSource, T t10) {
            this(mediaSource, t10, -9223372036854775807L);
        }

        public a(MediaSource mediaSource, T t10, long j10) {
            this.mediaSource = mediaSource;
            this.rankingData = t10;
            this.startPositionUs = j10;
        }

        @Override // java.lang.Comparable
        public int compareTo(BasePreloadManager<T>.a aVar) {
            return BasePreloadManager.this.rankingDataComparator.compare(this.rankingData, aVar.rankingData);
        }
    }

    public final void add(MediaItem mediaItem, T t10) {
        add(this.mediaSourceFactory.createMediaSource(mediaItem), t10);
    }

    public abstract void clearSourceInternal(MediaSource mediaSource);

    public MediaSource createMediaSourceForPreloading(MediaSource mediaSource) {
        return mediaSource;
    }

    public abstract void preloadSourceInternal(MediaSource mediaSource, long j10);

    public void releaseInternal() {
    }

    public abstract void releaseSourceInternal(MediaSource mediaSource);

    public final boolean remove(MediaItem mediaItem) {
        if (!this.mediaItemMediaSourceHolderMap.containsKey(mediaItem)) {
            return false;
        }
        MediaSource mediaSource = this.mediaItemMediaSourceHolderMap.get(mediaItem).mediaSource;
        this.mediaItemMediaSourceHolderMap.remove(mediaItem);
        releaseSourceInternal(mediaSource);
        return true;
    }

    public boolean shouldStartPreloadingNextSource() {
        return true;
    }

    public static abstract class BuilderBase<T> {
        public final MediaSource.Factory mediaSourceFactory;
        public final Comparator<T> rankingDataComparator;
        public final TargetPreloadStatusControl<T> targetPreloadStatusControl;

        public abstract BasePreloadManager<T> build();

        public BuilderBase(Comparator<T> comparator, TargetPreloadStatusControl<T> targetPreloadStatusControl, MediaSource.Factory factory) {
            this.rankingDataComparator = comparator;
            this.targetPreloadStatusControl = targetPreloadStatusControl;
            this.mediaSourceFactory = factory;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onPreloadCompleted$0(MediaSource mediaSource) {
        synchronized (this.lock) {
            if (!this.sourceHolderPriorityQueue.isEmpty() && ((a) Assertions.checkNotNull(this.sourceHolderPriorityQueue.peek())).mediaSource == mediaSource) {
                do {
                    this.sourceHolderPriorityQueue.poll();
                    if (this.sourceHolderPriorityQueue.isEmpty()) {
                        break;
                    }
                } while (!maybeStartPreloadNextSource());
            }
        }
    }

    public final void add(MediaSource mediaSource, T t10) {
        MediaSource mediaSourceCreateMediaSourceForPreloading = createMediaSourceForPreloading(mediaSource);
        this.mediaItemMediaSourceHolderMap.put(mediaSourceCreateMediaSourceForPreloading.getMediaItem(), new a(this, mediaSourceCreateMediaSourceForPreloading, t10));
    }

    @Nullable
    public final MediaSource getMediaSource(MediaItem mediaItem) {
        if (this.mediaItemMediaSourceHolderMap.containsKey(mediaItem)) {
            return this.mediaItemMediaSourceHolderMap.get(mediaItem).mediaSource;
        }
        return null;
    }

    public final int getSourceCount() {
        return this.mediaItemMediaSourceHolderMap.size();
    }

    @Nullable
    public final TargetPreloadStatusControl.PreloadStatus getTargetPreloadStatus(MediaSource mediaSource) {
        synchronized (this.lock) {
            if (!this.sourceHolderPriorityQueue.isEmpty() && ((a) Assertions.checkNotNull(this.sourceHolderPriorityQueue.peek())).mediaSource == mediaSource) {
                return this.targetPreloadStatusOfCurrentPreloadingSource;
            }
            return null;
        }
    }

    public final void invalidate() {
        synchronized (this.lock) {
            this.sourceHolderPriorityQueue.clear();
            this.sourceHolderPriorityQueue.addAll(this.mediaItemMediaSourceHolderMap.values());
            while (!this.sourceHolderPriorityQueue.isEmpty() && !maybeStartPreloadNextSource()) {
                this.sourceHolderPriorityQueue.poll();
            }
        }
    }

    public final void onPreloadCompleted(final MediaSource mediaSource) {
        this.startPreloadingHandler.post(new Runnable() { // from class: rg.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f66764b.lambda$onPreloadCompleted$0(mediaSource);
            }
        });
    }

    public final void reset() {
        Iterator<BasePreloadManager<T>.a> it = this.mediaItemMediaSourceHolderMap.values().iterator();
        while (it.hasNext()) {
            releaseSourceInternal(it.next().mediaSource);
        }
        this.mediaItemMediaSourceHolderMap.clear();
        synchronized (this.lock) {
            this.sourceHolderPriorityQueue.clear();
            this.targetPreloadStatusOfCurrentPreloadingSource = null;
        }
    }

    public BasePreloadManager(Comparator<T> comparator, TargetPreloadStatusControl<T> targetPreloadStatusControl, MediaSource.Factory factory) {
        this.rankingDataComparator = comparator;
        this.targetPreloadStatusControl = targetPreloadStatusControl;
        this.mediaSourceFactory = factory;
    }

    @GuardedBy("lock")
    private boolean maybeStartPreloadNextSource() {
        if (shouldStartPreloadingNextSource()) {
            a aVar = (a) Assertions.checkNotNull(this.sourceHolderPriorityQueue.peek());
            TargetPreloadStatusControl.PreloadStatus targetPreloadStatus = this.targetPreloadStatusControl.getTargetPreloadStatus(aVar.rankingData);
            this.targetPreloadStatusOfCurrentPreloadingSource = targetPreloadStatus;
            if (targetPreloadStatus != null) {
                preloadSourceInternal(aVar.mediaSource, aVar.startPositionUs);
                return true;
            }
            clearSourceInternal(aVar.mediaSource);
            return false;
        }
        return false;
    }

    public final void release() {
        reset();
        releaseInternal();
    }

    public final boolean remove(MediaSource mediaSource) {
        MediaItem mediaItem = mediaSource.getMediaItem();
        if (!this.mediaItemMediaSourceHolderMap.containsKey(mediaItem) || mediaSource != this.mediaItemMediaSourceHolderMap.get(mediaItem).mediaSource) {
            return false;
        }
        this.mediaItemMediaSourceHolderMap.remove(mediaItem);
        releaseSourceInternal(mediaSource);
        return true;
    }
}
