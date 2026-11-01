package io.bidmachine.media3.exoplayer.offline;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.PriorityTaskManager;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.RunnableFutureTask;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.datasource.DataSpec;
import io.bidmachine.media3.datasource.cache.CacheDataSource;
import io.bidmachine.media3.datasource.cache.CacheWriter;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
@UnstableApi
public final class ProgressiveDownloader implements Downloader {
    private final CacheWriter cacheWriter;
    private final CacheDataSource dataSource;
    private final DataSpec dataSpec;
    private volatile RunnableFutureTask<Void, IOException> downloadRunnable;
    private final Executor executor;
    private volatile boolean isCanceled;

    @Nullable
    private final PriorityTaskManager priorityTaskManager;

    @Nullable
    private Downloader.ProgressListener progressListener;

    public class a extends RunnableFutureTask<Void, IOException> {
        public a() {
        }

        @Override // io.bidmachine.media3.common.util.RunnableFutureTask
        public void cancelWork() {
            ProgressiveDownloader.this.cacheWriter.cancel();
        }

        @Override // io.bidmachine.media3.common.util.RunnableFutureTask
        public Void doWork() throws IOException {
            ProgressiveDownloader.this.cacheWriter.cache();
            return null;
        }
    }

    public ProgressiveDownloader(MediaItem mediaItem, CacheDataSource.Factory factory) {
        this(mediaItem, factory, new androidx.media3.exoplayer.dash.offline.a());
    }

    @Override // io.bidmachine.media3.exoplayer.offline.Downloader
    public void cancel() {
        this.isCanceled = true;
        RunnableFutureTask<Void, IOException> runnableFutureTask = this.downloadRunnable;
        if (runnableFutureTask != null) {
            runnableFutureTask.cancel(true);
        }
    }

    public ProgressiveDownloader(MediaItem mediaItem, CacheDataSource.Factory factory, Executor executor) {
        this.executor = (Executor) Assertions.checkNotNull(executor);
        Assertions.checkNotNull(mediaItem.localConfiguration);
        DataSpec dataSpecBuild = new DataSpec.Builder().setUri(mediaItem.localConfiguration.uri).setKey(mediaItem.localConfiguration.customCacheKey).setFlags(4).build();
        this.dataSpec = dataSpecBuild;
        CacheDataSource cacheDataSourceCreateDataSourceForDownloading = factory.createDataSourceForDownloading();
        this.dataSource = cacheDataSourceCreateDataSourceForDownloading;
        this.cacheWriter = new CacheWriter(cacheDataSourceCreateDataSourceForDownloading, dataSpecBuild, null, new CacheWriter.ProgressListener() { // from class: mg.n
            @Override // io.bidmachine.media3.datasource.cache.CacheWriter.ProgressListener
            public final void onProgress(long j10, long j11, long j12) {
                this.f64532a.onProgress(j10, j11, j12);
            }
        });
        this.priorityTaskManager = factory.getUpstreamPriorityTaskManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProgress(long j10, long j11, long j12) {
        Downloader.ProgressListener progressListener = this.progressListener;
        if (progressListener == null) {
            return;
        }
        progressListener.onProgress(j10, j11, (j10 == -1 || j10 == 0) ? -1.0f : (j11 * 100.0f) / j10);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0049 */
    @Override // io.bidmachine.media3.exoplayer.offline.Downloader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void download(@androidx.annotation.Nullable io.bidmachine.media3.exoplayer.offline.Downloader.ProgressListener r4) throws java.lang.InterruptedException, java.io.IOException {
        /*
            r3 = this;
            r3.progressListener = r4
            io.bidmachine.media3.common.PriorityTaskManager r4 = r3.priorityTaskManager
            r0 = -4000(0xfffffffffffff060, float:NaN)
            if (r4 == 0) goto Lb
            r4.add(r0)
        Lb:
            r4 = 0
        Lc:
            if (r4 != 0) goto L5d
            boolean r1 = r3.isCanceled     // Catch: java.lang.Throwable -> L49
            if (r1 != 0) goto L5d
            io.bidmachine.media3.exoplayer.offline.ProgressiveDownloader$a r1 = new io.bidmachine.media3.exoplayer.offline.ProgressiveDownloader$a     // Catch: java.lang.Throwable -> L49
            r1.<init>()     // Catch: java.lang.Throwable -> L49
            r3.downloadRunnable = r1     // Catch: java.lang.Throwable -> L49
            io.bidmachine.media3.common.PriorityTaskManager r1 = r3.priorityTaskManager     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L20
            r1.proceed(r0)     // Catch: java.lang.Throwable -> L49
        L20:
            java.util.concurrent.Executor r1 = r3.executor     // Catch: java.lang.Throwable -> L49
            io.bidmachine.media3.common.util.RunnableFutureTask<java.lang.Void, java.io.IOException> r2 = r3.downloadRunnable     // Catch: java.lang.Throwable -> L49
            r1.execute(r2)     // Catch: java.lang.Throwable -> L49
            io.bidmachine.media3.common.util.RunnableFutureTask<java.lang.Void, java.io.IOException> r1 = r3.downloadRunnable     // Catch: java.util.concurrent.ExecutionException -> L2e java.lang.Throwable -> L49
            r1.get()     // Catch: java.util.concurrent.ExecutionException -> L2e java.lang.Throwable -> L49
            r4 = 1
            goto Lc
        L2e:
            r1 = move-exception
            java.lang.Throwable r1 = r1.getCause()     // Catch: java.lang.Throwable -> L49
            java.lang.Object r1 = io.bidmachine.media3.common.util.Assertions.checkNotNull(r1)     // Catch: java.lang.Throwable -> L49
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch: java.lang.Throwable -> L49
            boolean r2 = r1 instanceof io.bidmachine.media3.common.PriorityTaskManager.PriorityTooLowException     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L3e
            goto Lc
        L3e:
            boolean r2 = r1 instanceof java.io.IOException     // Catch: java.lang.Throwable -> L49
            if (r2 != 0) goto L46
            io.bidmachine.media3.common.util.Util.sneakyThrow(r1)     // Catch: java.lang.Throwable -> L49
            goto Lc
        L46:
            java.io.IOException r1 = (java.io.IOException) r1     // Catch: java.lang.Throwable -> L49
            throw r1     // Catch: java.lang.Throwable -> L49
        L49:
            r4 = move-exception
            io.bidmachine.media3.common.util.RunnableFutureTask<java.lang.Void, java.io.IOException> r1 = r3.downloadRunnable
            java.lang.Object r1 = io.bidmachine.media3.common.util.Assertions.checkNotNull(r1)
            io.bidmachine.media3.common.util.RunnableFutureTask r1 = (io.bidmachine.media3.common.util.RunnableFutureTask) r1
            r1.blockUntilFinished()
            io.bidmachine.media3.common.PriorityTaskManager r1 = r3.priorityTaskManager
            if (r1 == 0) goto L5c
            r1.remove(r0)
        L5c:
            throw r4
        L5d:
            io.bidmachine.media3.common.util.RunnableFutureTask<java.lang.Void, java.io.IOException> r4 = r3.downloadRunnable
            java.lang.Object r4 = io.bidmachine.media3.common.util.Assertions.checkNotNull(r4)
            io.bidmachine.media3.common.util.RunnableFutureTask r4 = (io.bidmachine.media3.common.util.RunnableFutureTask) r4
            r4.blockUntilFinished()
            io.bidmachine.media3.common.PriorityTaskManager r4 = r3.priorityTaskManager
            if (r4 == 0) goto L6f
            r4.remove(r0)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.offline.ProgressiveDownloader.download(io.bidmachine.media3.exoplayer.offline.Downloader$ProgressListener):void");
    }

    @Override // io.bidmachine.media3.exoplayer.offline.Downloader
    public void remove() {
        this.dataSource.getCache().removeResource(this.dataSource.getCacheKeyFactory().buildCacheKey(this.dataSpec));
    }
}
