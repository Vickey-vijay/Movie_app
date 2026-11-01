package nk;

import kotlin.Pair;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class o2<T> extends sk.z<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ThreadLocal<Pair<kotlin.coroutines.d, Object>> f64811f;
    private volatile boolean threadLocalIsSet;

    public final void l1(kotlin.coroutines.d dVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f64811f.set(mj.h.a(dVar, obj));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o2(kotlin.coroutines.d dVar, rj.c<? super T> cVar) {
        p2 p2Var = p2.f64814b;
        super(dVar.get(p2Var) == null ? dVar.plus(p2Var) : dVar, cVar);
        this.f64811f = new ThreadLocal<>();
        if (cVar.getContext().get(kotlin.coroutines.c.D8) instanceof h0) {
            return;
        }
        Object objI = sk.k0.i(dVar, null);
        sk.k0.f(dVar, objI);
        l1(dVar, objI);
    }

    public final boolean j1() {
        boolean z10 = this.threadLocalIsSet && this.f64811f.get() == null;
        this.f64811f.remove();
        return !z10;
    }

    public final void k1() {
        if (this.threadLocalIsSet) {
            Pair<kotlin.coroutines.d, Object> pair = this.f64811f.get();
            if (pair != null) {
                sk.k0.f(pair.component1(), pair.component2());
            }
            this.f64811f.remove();
        }
    }

    @Override // sk.z, kotlinx.coroutines.a
    public void e1(Object obj) {
        k1();
        Object objA = a0.a(obj, this.f71995e);
        rj.c<T> cVar = this.f71995e;
        kotlin.coroutines.d context = cVar.getContext();
        o2<?> o2VarM = null;
        Object objI = sk.k0.i(context, null);
        if (objI != sk.k0.f71955a) {
            o2VarM = f0.m(cVar, context, objI);
        }
        try {
            this.f71995e.resumeWith(objA);
            mj.r rVar = mj.r.f64562a;
        } finally {
            if (o2VarM == null || o2VarM.j1()) {
                sk.k0.f(context, objI);
            }
        }
    }

    @Override // sk.z
    public void i1() {
        k1();
    }
}
