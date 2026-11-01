package com.google.android.exoplayer2.upstream.cache;

/* JADX INFO: compiled from: CacheEvictor.java */
/* JADX INFO: loaded from: classes6.dex */
public interface c extends Cache.a {
    void c(Cache cache, String str, long j10, long j11);

    void onCacheInitialized();

    boolean requiresCacheSpanTouches();
}
