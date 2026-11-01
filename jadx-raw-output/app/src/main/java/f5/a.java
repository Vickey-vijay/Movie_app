package f5;

import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;

/* JADX INFO: compiled from: CacheDataSinkFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements e5.f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cache f52836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f52837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f52838c;

    public a(Cache cache, long j10) {
        this(cache, j10, 20480);
    }

    public a(Cache cache, long j10, int i10) {
        this.f52836a = cache;
        this.f52837b = j10;
        this.f52838c = i10;
    }

    @Override // e5.f.a
    public e5.f createDataSink() {
        return new CacheDataSink(this.f52836a, this.f52837b, this.f52838c);
    }
}
