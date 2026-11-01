package io.bidmachine.media3.exoplayer.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.PriorityTaskManager;
import io.bidmachine.media3.common.StreamKey;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.RunnableFutureTask;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.datasource.DataSource;
import io.bidmachine.media3.datasource.DataSpec;
import io.bidmachine.media3.datasource.cache.Cache;
import io.bidmachine.media3.datasource.cache.CacheDataSource;
import io.bidmachine.media3.datasource.cache.CacheKeyFactory;
import io.bidmachine.media3.datasource.cache.CacheWriter;
import io.bidmachine.media3.exoplayer.offline.FilterableManifest;
import io.bidmachine.media3.exoplayer.upstream.ParsingLoadable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class SegmentDownloader<M extends FilterableManifest<M>> implements Downloader {
    private static final int BUFFER_SIZE_BYTES = 131072;
    public static final long DEFAULT_MAX_MERGED_SEGMENT_START_TIME_DIFF_MS = 20000;
    private final ArrayList<RunnableFutureTask<?, ?>> activeRunnables;
    private final Cache cache;
    private final CacheDataSource.Factory cacheDataSourceFactory;
    private final CacheKeyFactory cacheKeyFactory;
    private final Executor executor;
    private volatile boolean isCanceled;
    private final DataSpec manifestDataSpec;
    private final ParsingLoadable.Parser<M> manifestParser;
    private final long maxMergedSegmentStartTimeDiffUs;

    @Nullable
    private final PriorityTaskManager priorityTaskManager;
    private final ArrayList<StreamKey> streamKeys;

    public static class Segment implements Comparable<Segment> {
        public final DataSpec dataSpec;
        public final long startTimeUs;

        @Override // java.lang.Comparable
        public int compareTo(Segment segment) {
            return Util.compareLong(this.startTimeUs, segment.startTimeUs);
        }

        public Segment(long j10, DataSpec dataSpec) {
            this.startTimeUs = j10;
            this.dataSpec = dataSpec;
        }
    }

    public class a extends RunnableFutureTask<M, IOException> {
        public final /* synthetic */ DataSource val$dataSource;
        public final /* synthetic */ DataSpec val$dataSpec;

        public a(DataSource dataSource, DataSpec dataSpec) {
            this.val$dataSource = dataSource;
            this.val$dataSpec = dataSpec;
        }

        @Override // io.bidmachine.media3.common.util.RunnableFutureTask
        public M doWork() throws IOException {
            return (M) ParsingLoadable.load(this.val$dataSource, SegmentDownloader.this.manifestParser, this.val$dataSpec, 4);
        }
    }

    public static final class b implements CacheWriter.ProgressListener {
        private long bytesDownloaded;
        private final long contentLength;
        private final Downloader.ProgressListener progressListener;
        private int segmentsDownloaded;
        private final int totalSegments;

        private float getPercentDownloaded() {
            long j10 = this.contentLength;
            if (j10 != -1 && j10 != 0) {
                return (this.bytesDownloaded * 100.0f) / j10;
            }
            int i10 = this.totalSegments;
            if (i10 != 0) {
                return (this.segmentsDownloaded * 100.0f) / i10;
            }
            return -1.0f;
        }

        @Override // io.bidmachine.media3.datasource.cache.CacheWriter.ProgressListener
        public void onProgress(long j10, long j11, long j12) {
            long j13 = this.bytesDownloaded + j12;
            this.bytesDownloaded = j13;
            this.progressListener.onProgress(this.contentLength, j13, getPercentDownloaded());
        }

        public void onSegmentDownloaded() {
            this.segmentsDownloaded++;
            this.progressListener.onProgress(this.contentLength, this.bytesDownloaded, getPercentDownloaded());
        }

        public b(Downloader.ProgressListener progressListener, long j10, int i10, long j11, int i11) {
            this.progressListener = progressListener;
            this.contentLength = j10;
            this.totalSegments = i10;
            this.bytesDownloaded = j11;
            this.segmentsDownloaded = i11;
        }
    }

    public static final class c extends RunnableFutureTask<Void, IOException> {
        private final CacheWriter cacheWriter;
        public final CacheDataSource dataSource;

        @Nullable
        private final b progressNotifier;
        public final Segment segment;
        public final byte[] temporaryBuffer;

        @Override // io.bidmachine.media3.common.util.RunnableFutureTask
        public void cancelWork() {
            this.cacheWriter.cancel();
        }

        @Override // io.bidmachine.media3.common.util.RunnableFutureTask
        public Void doWork() throws IOException {
            this.cacheWriter.cache();
            b bVar = this.progressNotifier;
            if (bVar == null) {
                return null;
            }
            bVar.onSegmentDownloaded();
            return null;
        }

        public c(Segment segment, CacheDataSource cacheDataSource, @Nullable b bVar, byte[] bArr) {
            this.segment = segment;
            this.dataSource = cacheDataSource;
            this.progressNotifier = bVar;
            this.temporaryBuffer = bArr;
            this.cacheWriter = new CacheWriter(cacheDataSource, segment.dataSpec, bArr, bVar);
        }
    }

    @Deprecated
    public SegmentDownloader(MediaItem mediaItem, ParsingLoadable.Parser<M> parser, CacheDataSource.Factory factory, Executor executor) {
        this(mediaItem, parser, factory, executor, 20000L);
    }

    private void removeActiveRunnable(RunnableFutureTask<?, ?> runnableFutureTask) {
        synchronized (this.activeRunnables) {
            this.activeRunnables.remove(runnableFutureTask);
        }
    }

    public abstract List<Segment> getSegments(DataSource dataSource, M m10, boolean z10) throws InterruptedException, IOException;

    public SegmentDownloader(MediaItem mediaItem, ParsingLoadable.Parser<M> parser, CacheDataSource.Factory factory, Executor executor, long j10) {
        Assertions.checkNotNull(mediaItem.localConfiguration);
        this.manifestDataSpec = getCompressibleDataSpec(mediaItem.localConfiguration.uri);
        this.manifestParser = parser;
        this.streamKeys = new ArrayList<>(mediaItem.localConfiguration.streamKeys);
        this.cacheDataSourceFactory = factory;
        this.executor = executor;
        this.cache = (Cache) Assertions.checkNotNull(factory.getCache());
        this.cacheKeyFactory = factory.getCacheKeyFactory();
        this.priorityTaskManager = factory.getUpstreamPriorityTaskManager();
        this.activeRunnables = new ArrayList<>();
        this.maxMergedSegmentStartTimeDiffUs = Util.msToUs(j10);
    }

    private <T> void addActiveRunnable(RunnableFutureTask<T, ?> runnableFutureTask) throws InterruptedException {
        synchronized (this.activeRunnables) {
            if (this.isCanceled) {
                throw new InterruptedException();
            }
            this.activeRunnables.add(runnableFutureTask);
        }
    }

    private static boolean canMergeSegments(DataSpec dataSpec, DataSpec dataSpec2) {
        if (dataSpec.uri.equals(dataSpec2.uri)) {
            long j10 = dataSpec.length;
            if (j10 != -1 && dataSpec.position + j10 == dataSpec2.position && Util.areEqual(dataSpec.key, dataSpec2.key) && dataSpec.flags == dataSpec2.flags && dataSpec.httpMethod == dataSpec2.httpMethod && dataSpec.httpRequestHeaders.equals(dataSpec2.httpRequestHeaders)) {
                return true;
            }
        }
        return false;
    }

    public static DataSpec getCompressibleDataSpec(Uri uri) {
        return new DataSpec.Builder().setUri(uri).setFlags(1).build();
    }

    private static void mergeSegments(List<Segment> list, CacheKeyFactory cacheKeyFactory, long j10) {
        HashMap map = new HashMap();
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            Segment segment = list.get(i11);
            String strBuildCacheKey = cacheKeyFactory.buildCacheKey(segment.dataSpec);
            Integer num = (Integer) map.get(strBuildCacheKey);
            Segment segment2 = num == null ? null : list.get(num.intValue());
            if (segment2 == null || segment.startTimeUs > segment2.startTimeUs + j10 || !canMergeSegments(segment2.dataSpec, segment.dataSpec)) {
                map.put(strBuildCacheKey, Integer.valueOf(i10));
                list.set(i10, segment);
                i10++;
            } else {
                long j11 = segment.dataSpec.length;
                list.set(((Integer) Assertions.checkNotNull(num)).intValue(), new Segment(segment2.startTimeUs, segment2.dataSpec.subrange(0L, j11 != -1 ? segment2.dataSpec.length + j11 : -1L)));
            }
        }
        Util.removeRange(list, i10, list.size());
    }

    @Override // io.bidmachine.media3.exoplayer.offline.Downloader
    public void cancel() {
        synchronized (this.activeRunnables) {
            this.isCanceled = true;
            for (int i10 = 0; i10 < this.activeRunnables.size(); i10++) {
                this.activeRunnables.get(i10).cancel(true);
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x018e */
    @Override // io.bidmachine.media3.exoplayer.offline.Downloader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void download(@androidx.annotation.Nullable io.bidmachine.media3.exoplayer.offline.Downloader.ProgressListener r28) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.offline.SegmentDownloader.download(io.bidmachine.media3.exoplayer.offline.Downloader$ProgressListener):void");
    }

    public final <T> T execute(RunnableFutureTask<T, ?> runnableFutureTask, boolean z10) throws Throwable {
        if (z10) {
            runnableFutureTask.run();
            try {
                return runnableFutureTask.get();
            } catch (ExecutionException e10) {
                Throwable th2 = (Throwable) Assertions.checkNotNull(e10.getCause());
                if (th2 instanceof IOException) {
                    throw ((IOException) th2);
                }
                Util.sneakyThrow(e10);
            }
        }
        while (!this.isCanceled) {
            PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
            if (priorityTaskManager != null) {
                priorityTaskManager.proceed(-4000);
            }
            addActiveRunnable(runnableFutureTask);
            this.executor.execute(runnableFutureTask);
            try {
                T t10 = runnableFutureTask.get();
                runnableFutureTask.blockUntilFinished();
                removeActiveRunnable((RunnableFutureTask<?, ?>) runnableFutureTask);
                return t10;
            } catch (ExecutionException e11) {
                try {
                    Throwable th3 = (Throwable) Assertions.checkNotNull(e11.getCause());
                    if (!(th3 instanceof PriorityTaskManager.PriorityTooLowException)) {
                        if (th3 instanceof IOException) {
                            throw ((IOException) th3);
                        }
                        Util.sneakyThrow(e11);
                    }
                    runnableFutureTask.blockUntilFinished();
                    removeActiveRunnable((RunnableFutureTask<?, ?>) runnableFutureTask);
                } catch (Throwable th4) {
                    runnableFutureTask.blockUntilFinished();
                    removeActiveRunnable((RunnableFutureTask<?, ?>) runnableFutureTask);
                    throw th4;
                }
            }
        }
        throw new InterruptedException();
    }

    public final M getManifest(DataSource dataSource, DataSpec dataSpec, boolean z10) throws InterruptedException, IOException {
        return (M) execute(new a(dataSource, dataSpec), z10);
    }

    @Override // io.bidmachine.media3.exoplayer.offline.Downloader
    public final void remove() {
        CacheDataSource cacheDataSourceCreateDataSourceForRemovingDownload = this.cacheDataSourceFactory.createDataSourceForRemovingDownload();
        try {
            List<Segment> segments = getSegments(cacheDataSourceCreateDataSourceForRemovingDownload, getManifest(cacheDataSourceCreateDataSourceForRemovingDownload, this.manifestDataSpec, true), true);
            for (int i10 = 0; i10 < segments.size(); i10++) {
                this.cache.removeResource(this.cacheKeyFactory.buildCacheKey(segments.get(i10).dataSpec));
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception unused2) {
        } finally {
            this.cache.removeResource(this.cacheKeyFactory.buildCacheKey(this.manifestDataSpec));
        }
    }

    private void removeActiveRunnable(int i10) {
        synchronized (this.activeRunnables) {
            this.activeRunnables.remove(i10);
        }
    }
}
