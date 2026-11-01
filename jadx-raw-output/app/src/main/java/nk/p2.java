package nk;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class p2 implements kotlin.coroutines.d.b, kotlin.coroutines.d.c<p2> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p2 f64814b = new p2();

    @Override // kotlin.coroutines.d.b
    public kotlin.coroutines.d.c<?> getKey() {
        return this;
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r10, bk.p<? super R, ? super kotlin.coroutines.d.b, ? extends R> pVar) {
        return (R) kotlin.coroutines.d.b.a.a(this, r10, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    public <E extends kotlin.coroutines.d.b> E get(kotlin.coroutines.d.c<E> cVar) {
        return (E) kotlin.coroutines.d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public kotlin.coroutines.d minusKey(kotlin.coroutines.d.c<?> cVar) {
        return kotlin.coroutines.d.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public kotlin.coroutines.d plus(kotlin.coroutines.d dVar) {
        return kotlin.coroutines.d.b.a.d(this, dVar);
    }
}
