package kotlin.coroutines;

import ck.p;
import com.ironsource.C3426d4;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a implements d.b {
    private final d.c<?> key;

    public a(d.c<?> cVar) {
        p.j(cVar, C3426d4.i.W);
        this.key = cVar;
    }

    @Override // kotlin.coroutines.d.b
    public d.c<?> getKey() {
        return this.key;
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r10, bk.p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) d.b.a.a(this, r10, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    public <E extends d.b> E get(d.c<E> cVar) {
        return (E) d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public d minusKey(d.c<?> cVar) {
        return d.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public d plus(d dVar) {
        return d.b.a.d(this, dVar);
    }
}
