package io.bidmachine.media3.datasource.cache;

import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.datasource.cache.CacheSpan;
import io.bidmachine.media3.datasource.cache.LeastRecentlyUsedCacheEvictor;
import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes11.dex */
@UnstableApi
public final class LeastRecentlyUsedCacheEvictor implements CacheEvictor {
    private long currentSize;
    private final TreeSet<CacheSpan> leastRecentlyUsed = new TreeSet<>(new Comparator() { // from class: bg.f
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return LeastRecentlyUsedCacheEvictor.compare((CacheSpan) obj, (CacheSpan) obj2);
        }
    });
    private final long maxBytes;

    @Override // io.bidmachine.media3.datasource.cache.CacheEvictor
    public void onCacheInitialized() {
    }

    @Override // io.bidmachine.media3.datasource.cache.CacheEvictor
    public boolean requiresCacheSpanTouches() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int compare(CacheSpan cacheSpan, CacheSpan cacheSpan2) {
        long j10 = cacheSpan.lastTouchTimestamp;
        long j11 = cacheSpan2.lastTouchTimestamp;
        if (j10 - j11 == 0) {
            return cacheSpan.compareTo(cacheSpan2);
        }
        return j10 < j11 ? -1 : 1;
    }

    private void evictCache(Cache cache, long j10) {
        while (this.currentSize + j10 > this.maxBytes && !this.leastRecentlyUsed.isEmpty()) {
            cache.removeSpan(this.leastRecentlyUsed.first());
        }
    }

    @Override // io.bidmachine.media3.datasource.cache.CacheEvictor, io.bidmachine.media3.datasource.cache.Cache.Listener
    public void onSpanAdded(Cache cache, CacheSpan cacheSpan) {
        this.leastRecentlyUsed.add(cacheSpan);
        this.currentSize += cacheSpan.length;
        evictCache(cache, 0L);
    }

    @Override // io.bidmachine.media3.datasource.cache.CacheEvictor, io.bidmachine.media3.datasource.cache.Cache.Listener
    public void onSpanRemoved(Cache cache, CacheSpan cacheSpan) {
        this.leastRecentlyUsed.remove(cacheSpan);
        this.currentSize -= cacheSpan.length;
    }

    @Override // io.bidmachine.media3.datasource.cache.CacheEvictor
    public void onStartFile(Cache cache, String str, long j10, long j11) {
        if (j11 != -1) {
            evictCache(cache, j11);
        }
    }

    public LeastRecentlyUsedCacheEvictor(long j10) {
        this.maxBytes = j10;
    }

    @Override // io.bidmachine.media3.datasource.cache.CacheEvictor, io.bidmachine.media3.datasource.cache.Cache.Listener
    public void onSpanTouched(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2) {
        onSpanRemoved(cache, cacheSpan);
        onSpanAdded(cache, cacheSpan2);
    }
}
