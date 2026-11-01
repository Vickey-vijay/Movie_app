package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import e5.q;

/* JADX INFO: compiled from: DefaultHttpDataSourceFactory.java */
/* JADX INFO: loaded from: classes11.dex */
public final class e extends HttpDataSource.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final q f20188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f20191f;

    public e(String str, @Nullable q qVar) {
        this(str, qVar, 8000, 8000, false);
    }

    public e(String str, @Nullable q qVar, int i10, int i11, boolean z10) {
        this.f20187b = g5.a.d(str);
        this.f20188c = qVar;
        this.f20189d = i10;
        this.f20190e = i11;
        this.f20191f = z10;
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d b(HttpDataSource.c cVar) {
        d dVar = new d(this.f20187b, this.f20189d, this.f20190e, this.f20191f, cVar);
        q qVar = this.f20188c;
        if (qVar != null) {
            dVar.b(qVar);
        }
        return dVar;
    }
}
