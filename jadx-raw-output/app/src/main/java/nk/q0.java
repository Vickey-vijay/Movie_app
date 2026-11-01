package nk;

/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes3.dex */
public class q0<T> extends kotlinx.coroutines.a<T> implements p0<T> {
    public q0(kotlin.coroutines.d dVar, boolean z10) {
        super(dVar, true, z10);
    }

    @Override // nk.p0
    public Object y(rj.c<? super T> cVar) {
        return i1(this, cVar);
    }

    public static /* synthetic */ <T> Object i1(q0<T> q0Var, rj.c<? super T> cVar) throws Throwable {
        Object objW = q0Var.W(cVar);
        sj.a.f();
        return objW;
    }

    @Override // nk.p0
    public vk.c<T> H() {
        vk.c<T> cVar = (vk.c<T>) o0();
        ck.p.h(cVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.DeferredCoroutine>");
        return cVar;
    }

    @Override // nk.p0
    public T l() {
        return (T) k0();
    }
}
