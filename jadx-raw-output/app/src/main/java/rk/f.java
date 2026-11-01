package rk;

/* JADX INFO: compiled from: SafeCollector.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class f implements kotlin.coroutines.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.d f66788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f66789c;

    @Override // kotlin.coroutines.d
    public <R> R fold(R r10, bk.p<? super R, ? super kotlin.coroutines.d.b, ? extends R> pVar) {
        return (R) this.f66788b.fold(r10, pVar);
    }

    @Override // kotlin.coroutines.d
    public <E extends kotlin.coroutines.d.b> E get(kotlin.coroutines.d.c<E> cVar) {
        return (E) this.f66788b.get(cVar);
    }

    @Override // kotlin.coroutines.d
    public kotlin.coroutines.d minusKey(kotlin.coroutines.d.c<?> cVar) {
        return this.f66788b.minusKey(cVar);
    }

    @Override // kotlin.coroutines.d
    public kotlin.coroutines.d plus(kotlin.coroutines.d dVar) {
        return this.f66788b.plus(dVar);
    }

    public f(Throwable th2, kotlin.coroutines.d dVar) {
        this.f66788b = dVar;
        this.f66789c = th2;
    }
}
