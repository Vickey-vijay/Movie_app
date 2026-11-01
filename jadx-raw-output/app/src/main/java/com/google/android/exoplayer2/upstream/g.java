package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import e5.h;
import e5.o;
import g5.k0;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ParsingLoadable.java */
/* JADX INFO: loaded from: classes11.dex */
public final class g<T> implements Loader.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f20193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f20195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a<? extends T> f20196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public volatile T f20197e;

    /* JADX INFO: compiled from: ParsingLoadable.java */
    public interface a<T> {
        T parse(Uri uri, InputStream inputStream) throws IOException;
    }

    public g(com.google.android.exoplayer2.upstream.a aVar, Uri uri, int i10, a<? extends T> aVar2) {
        this(aVar, new h(uri, 1), i10, aVar2);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void cancelLoad() {
    }

    public g(com.google.android.exoplayer2.upstream.a aVar, h hVar, int i10, a<? extends T> aVar2) {
        this.f20195c = new o(aVar);
        this.f20193a = hVar;
        this.f20194b = i10;
        this.f20196d = aVar2;
    }

    public long a() {
        return this.f20195c.c();
    }

    public Map<String, List<String>> b() {
        return this.f20195c.e();
    }

    @Nullable
    public final T c() {
        return this.f20197e;
    }

    public Uri d() {
        return this.f20195c.d();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void load() throws IOException {
        this.f20195c.f();
        e5.g gVar = new e5.g(this.f20195c, this.f20193a);
        try {
            gVar.h();
            this.f20197e = this.f20196d.parse((Uri) g5.a.e(this.f20195c.getUri()), gVar);
        } finally {
            k0.n(gVar);
        }
    }
}
