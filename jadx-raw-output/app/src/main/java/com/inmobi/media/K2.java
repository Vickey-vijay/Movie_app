package com.inmobi.media;

import android.content.Context;
import android.os.storage.StorageManager;
import androidx.media3.common.MediaItem;
import androidx.media3.database.StandaloneDatabaseProvider;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.cache.CacheDataSink;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.datasource.cache.ContentMetadata;
import androidx.media3.datasource.cache.LeastRecentlyUsedCacheEvictor;
import androidx.media3.datasource.cache.SimpleCache;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource;
import com.inmobi.media.K2;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C3426d4;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes7.dex */
public final class K2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final mj.g f22978h = kotlin.b.b(LazyThreadSafetyMode.SYNCHRONIZED, new bk.a() { // from class: b7.f2
        @Override // bk.a
        public final Object invoke() {
            return K2.b();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22979a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f22980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdConfig.VideoCacheConfig f22981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LeastRecentlyUsedCacheEvictor f22982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StandaloneDatabaseProvider f22983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicInteger f22984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile SimpleCache f22985g;

    public final long a(Context context) {
        long j10 = 1024;
        long maxSize = this.f22981c.getMaxSize() * j10 * j10;
        C3298x5.f25687a.getClass();
        if (C3298x5.y()) {
            try {
                Object systemService = context.getSystemService(C3426d4.a.f28418k);
                ck.p.h(systemService, "null cannot be cast to non-null type android.os.storage.StorageManager");
                StorageManager storageManager = (StorageManager) systemService;
                UUID uuidForPath = storageManager.getUuidForPath(context.getCacheDir());
                ck.p.i(uuidForPath, "getUuidForPath(...)");
                return Math.min(maxSize, storageManager.getCacheQuotaBytes(uuidForPath));
            } catch (Exception e10) {
                e10.getMessage();
            }
        }
        return maxSize;
    }

    public static final K2 b() {
        return new K2();
    }

    public K2() {
        Context context = Ji.f22951a;
        ck.p.g(context);
        this.f22980b = context;
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(AdConfig.class, "clazz");
        this.f22981c = ((AdConfig) Y3.f23815a.a(AdConfig.class)).getHybridNative().getVideoCache();
        this.f22983e = new StandaloneDatabaseProvider(context);
        this.f22984f = new AtomicInteger(0);
        this.f22982d = new LeastRecentlyUsedCacheEvictor(a(context));
    }

    public final SimpleCache a() throws IOException {
        File file = new File(this.f22980b.getCacheDir(), "im_exoplayer_video_cache");
        if (!file.exists() && !file.mkdirs()) {
            throw new IOException("Could not create cache directory: " + file);
        }
        return new SimpleCache(file, this.f22982d, this.f22983e);
    }

    public final MediaSource a(String str, boolean z10) {
        DataSource.Factory factory;
        SimpleCache simpleCacheA;
        ck.p.j(str, "url");
        MediaItem mediaItemBuild = new MediaItem.Builder().setUri(str).setCustomCacheKey(str).build();
        ck.p.i(mediaItemBuild, "build(...)");
        if (this.f22981c.isEnabled() && z10) {
            DefaultDataSource.Factory factory2 = new DefaultDataSource.Factory(this.f22980b);
            synchronized (this.f22979a) {
                simpleCacheA = this.f22985g;
                if (simpleCacheA == null) {
                    simpleCacheA = a();
                    this.f22985g = simpleCacheA;
                }
            }
            factory = new CacheDataSource.Factory().setCache(simpleCacheA).setUpstreamDataSourceFactory(factory2).setCacheWriteDataSinkFactory(new CacheDataSink.Factory().setCache(simpleCacheA)).setCacheReadDataSourceFactory(new FileDataSource.Factory()).setFlags(2);
            ck.p.i(factory, "setFlags(...)");
        } else {
            factory = new DefaultDataSource.Factory(this.f22980b);
        }
        MediaSource mediaSourceCreateMediaSource = new DefaultMediaSourceFactory(factory).createMediaSource(mediaItemBuild);
        ck.p.i(mediaSourceCreateMediaSource, "createMediaSource(...)");
        return mediaSourceCreateMediaSource;
    }

    public final int a(String str) {
        SimpleCache simpleCache;
        ck.p.j(str, "url");
        try {
            synchronized (this.f22979a) {
                simpleCache = this.f22985g;
            }
            if (simpleCache == null) {
                return 0;
            }
            ContentMetadata contentMetadata = simpleCache.getContentMetadata(str);
            ck.p.i(contentMetadata, "getContentMetadata(...)");
            long contentLength = ContentMetadata.getContentLength(contentMetadata);
            if (contentLength <= 0) {
                return 0;
            }
            return (int) ((simpleCache.getCachedLength(str, 0L, contentLength) * ((long) 100)) / contentLength);
        } catch (Exception e10) {
            e10.getMessage();
            return 0;
        }
    }
}
