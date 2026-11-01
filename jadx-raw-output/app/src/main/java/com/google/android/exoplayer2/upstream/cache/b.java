package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.FileDataSource;

/* JADX INFO: compiled from: CacheDataSourceFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements com.google.android.exoplayer2.upstream.a.InterfaceC0188a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cache f20144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a.InterfaceC0188a f20145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a.InterfaceC0188a f20146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final e5.f.a f20148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final a.InterfaceC0189a f20149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final f5.d f20150g;

    public b(Cache cache, com.google.android.exoplayer2.upstream.a.InterfaceC0188a interfaceC0188a, int i10) {
        this(cache, interfaceC0188a, new FileDataSource.a(), new f5.a(cache, 5242880L), i10, null);
    }

    public b(Cache cache, com.google.android.exoplayer2.upstream.a.InterfaceC0188a interfaceC0188a, com.google.android.exoplayer2.upstream.a.InterfaceC0188a interfaceC0188a2, @Nullable e5.f.a aVar, int i10, @Nullable a.InterfaceC0189a interfaceC0189a) {
        this(cache, interfaceC0188a, interfaceC0188a2, aVar, i10, interfaceC0189a, null);
    }

    @Override // com.google.android.exoplayer2.upstream.a.InterfaceC0188a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a createDataSource() {
        Cache cache = this.f20144a;
        com.google.android.exoplayer2.upstream.a aVarCreateDataSource = this.f20145b.createDataSource();
        com.google.android.exoplayer2.upstream.a aVarCreateDataSource2 = this.f20146c.createDataSource();
        e5.f.a aVar = this.f20148e;
        return new a(cache, aVarCreateDataSource, aVarCreateDataSource2, aVar == null ? null : aVar.createDataSink(), this.f20147d, this.f20149f, this.f20150g);
    }

    public b(Cache cache, com.google.android.exoplayer2.upstream.a.InterfaceC0188a interfaceC0188a, com.google.android.exoplayer2.upstream.a.InterfaceC0188a interfaceC0188a2, @Nullable e5.f.a aVar, int i10, @Nullable a.InterfaceC0189a interfaceC0189a, @Nullable f5.d dVar) {
        this.f20144a = cache;
        this.f20145b = interfaceC0188a;
        this.f20146c = interfaceC0188a2;
        this.f20148e = aVar;
        this.f20147d = i10;
        this.f20149f = interfaceC0189a;
        this.f20150g = dVar;
    }
}
