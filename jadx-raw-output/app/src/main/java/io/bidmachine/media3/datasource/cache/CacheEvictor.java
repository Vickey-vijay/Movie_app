package io.bidmachine.media3.datasource.cache;

import io.bidmachine.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes4.dex */
@UnstableApi
public interface CacheEvictor extends Cache.Listener {
    void onCacheInitialized();

    @Override // io.bidmachine.media3.datasource.cache.Cache.Listener
    /* synthetic */ void onSpanAdded(Cache cache, CacheSpan cacheSpan);

    @Override // io.bidmachine.media3.datasource.cache.Cache.Listener
    /* synthetic */ void onSpanRemoved(Cache cache, CacheSpan cacheSpan);

    @Override // io.bidmachine.media3.datasource.cache.Cache.Listener
    /* synthetic */ void onSpanTouched(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2);

    void onStartFile(Cache cache, String str, long j10, long j11);

    boolean requiresCacheSpanTouches();
}
