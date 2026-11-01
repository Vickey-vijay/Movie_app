package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class r42 implements nk.i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hz1 f82100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nk.i0.b f82101c = nk.i0.F8;

    @Override // kotlin.coroutines.d.b
    public final kotlin.coroutines.d.c getKey() {
        return this.f82101c;
    }

    public r42(hz1 hz1Var) {
        this.f82100b = hz1Var;
    }

    @Override // kotlin.coroutines.d
    public final Object fold(Object obj, bk.p pVar) {
        return nk.i0.a.a(this, obj, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    public final kotlin.coroutines.d.b get(kotlin.coroutines.d.c cVar) {
        return nk.i0.a.b(this, cVar);
    }

    @Override // nk.i0
    public final void handleException(kotlin.coroutines.d dVar, Throwable th2) {
        th2.toString();
        boolean z10 = ad1.f75480a;
        this.f82100b.a(h9.f78123w);
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d minusKey(kotlin.coroutines.d.c cVar) {
        return nk.i0.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d plus(kotlin.coroutines.d dVar) {
        return nk.i0.a.d(this, dVar);
    }
}
