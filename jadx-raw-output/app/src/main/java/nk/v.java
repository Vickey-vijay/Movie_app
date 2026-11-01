package nk;

import kotlinx.coroutines.JobSupport;

/* JADX INFO: compiled from: CompletableDeferred.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class v<T> extends JobSupport implements u<T> {
    public v(kotlinx.coroutines.g gVar) {
        super(true);
        y0(gVar);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean p0() {
        return true;
    }

    @Override // nk.u
    public boolean g(Throwable th2) {
        return E0(new z(th2, false, 2, null));
    }

    @Override // nk.p0
    public vk.c<T> H() {
        vk.c<T> cVar = (vk.c<T>) o0();
        ck.p.h(cVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.CompletableDeferredImpl>");
        return cVar;
    }

    @Override // nk.u
    public boolean i(T t10) {
        return E0(t10);
    }

    @Override // nk.p0
    public T l() {
        return (T) k0();
    }

    @Override // nk.p0
    public Object y(rj.c<? super T> cVar) throws Throwable {
        Object objW = W(cVar);
        sj.a.f();
        return objW;
    }
}
