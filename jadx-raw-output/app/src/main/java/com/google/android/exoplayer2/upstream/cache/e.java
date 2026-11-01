package com.google.android.exoplayer2.upstream.cache;

import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: compiled from: LeastRecentlyUsedCacheEvictor.java */
/* JADX INFO: loaded from: classes6.dex */
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TreeSet<f5.e> f20153b = new TreeSet<>(new Comparator() { // from class: f5.l
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return com.google.android.exoplayer2.upstream.cache.e.f((e) obj, (e) obj2);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f20154c;

    @Override // com.google.android.exoplayer2.upstream.cache.c
    public void onCacheInitialized() {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.c
    public boolean requiresCacheSpanTouches() {
        return true;
    }

    public static int f(f5.e eVar, f5.e eVar2) {
        long j10 = eVar.f52849g;
        long j11 = eVar2.f52849g;
        if (j10 - j11 == 0) {
            return eVar.compareTo(eVar2);
        }
        return j10 < j11 ? -1 : 1;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.a
    public void b(Cache cache, f5.e eVar) {
        this.f20153b.remove(eVar);
        this.f20154c -= eVar.f52846d;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.c
    public void c(Cache cache, String str, long j10, long j11) {
        if (j11 != -1) {
            g(cache, j11);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.a
    public void d(Cache cache, f5.e eVar) {
        this.f20153b.add(eVar);
        this.f20154c += eVar.f52846d;
        g(cache, 0L);
    }

    public final void g(Cache cache, long j10) {
        while (this.f20154c + j10 > this.f20152a && !this.f20153b.isEmpty()) {
            try {
                cache.b(this.f20153b.first());
            } catch (Cache.CacheException unused) {
            }
        }
    }

    public e(long j10) {
        this.f20152a = j10;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.a
    public void a(Cache cache, f5.e eVar, f5.e eVar2) {
        b(cache, eVar);
        d(cache, eVar2);
    }
}
