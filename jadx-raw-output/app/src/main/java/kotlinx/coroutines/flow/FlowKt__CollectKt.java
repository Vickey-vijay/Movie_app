package kotlinx.coroutines.flow;

import bk.p;
import kotlinx.coroutines.g;
import mj.r;
import nk.j;
import nk.l0;
import qk.c;
import qk.d;
import qk.e;
import rk.l;

/* JADX INFO: compiled from: Collect.kt */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class FlowKt__CollectKt {
    public static final Object a(c<?> cVar, rj.c<? super r> cVar2) {
        Object objCollect = cVar.collect(l.f66792b, cVar2);
        return objCollect == sj.a.f() ? objCollect : r.f64562a;
    }

    public static final <T> g d(c<? extends T> cVar, l0 l0Var) {
        return j.d(l0Var, null, null, new FlowKt__CollectKt$launchIn$1(cVar, null), 3, null);
    }

    public static final <T> Object b(c<? extends T> cVar, p<? super T, ? super rj.c<? super r>, ? extends Object> pVar, rj.c<? super r> cVar2) {
        Object objI = e.i(qk.g.b(e.y(cVar, pVar), 0, null, 2, null), cVar2);
        if (objI == sj.a.f()) {
            return objI;
        }
        return r.f64562a;
    }

    public static final <T> Object c(d<? super T> dVar, c<? extends T> cVar, rj.c<? super r> cVar2) {
        e.o(dVar);
        Object objCollect = cVar.collect(dVar, cVar2);
        if (objCollect == sj.a.f()) {
            return objCollect;
        }
        return r.f64562a;
    }
}
