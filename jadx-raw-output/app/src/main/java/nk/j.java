package nk;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class j {
    public static /* synthetic */ p0 b(l0 l0Var, kotlin.coroutines.d dVar, CoroutineStart coroutineStart, bk.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i10 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return h.a(l0Var, dVar, coroutineStart, pVar);
    }

    public static /* synthetic */ kotlinx.coroutines.g d(l0 l0Var, kotlin.coroutines.d dVar, CoroutineStart coroutineStart, bk.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i10 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return h.c(l0Var, dVar, coroutineStart, pVar);
    }

    public static final <T> p0<T> a(l0 l0Var, kotlin.coroutines.d dVar, CoroutineStart coroutineStart, bk.p<? super l0, ? super rj.c<? super T>, ? extends Object> pVar) {
        q0 q0Var;
        kotlin.coroutines.d dVarK = f0.k(l0Var, dVar);
        if (coroutineStart.isLazy()) {
            q0Var = new w1(dVarK, pVar);
        } else {
            q0Var = new q0(dVarK, true);
        }
        ((kotlinx.coroutines.a) q0Var).h1(coroutineStart, q0Var, pVar);
        return (p0<T>) q0Var;
    }

    public static final kotlinx.coroutines.g c(l0 l0Var, kotlin.coroutines.d dVar, CoroutineStart coroutineStart, bk.p<? super l0, ? super rj.c<? super mj.r>, ? extends Object> pVar) {
        kotlinx.coroutines.a g2Var;
        kotlin.coroutines.d dVarK = f0.k(l0Var, dVar);
        if (coroutineStart.isLazy()) {
            g2Var = new x1(dVarK, pVar);
        } else {
            g2Var = new g2(dVarK, true);
        }
        g2Var.h1(coroutineStart, g2Var, pVar);
        return g2Var;
    }

    public static final <T> Object e(kotlin.coroutines.d dVar, bk.p<? super l0, ? super rj.c<? super T>, ? extends Object> pVar, rj.c<? super T> cVar) {
        Object objJ1;
        kotlin.coroutines.d context = cVar.getContext();
        kotlin.coroutines.d dVarJ = f0.j(context, dVar);
        t1.h(dVarJ);
        if (dVarJ == context) {
            sk.z zVar = new sk.z(dVarJ, cVar);
            objJ1 = tk.b.b(zVar, zVar, pVar);
        } else {
            kotlin.coroutines.c.b bVar = kotlin.coroutines.c.D8;
            if (ck.p.e(dVarJ.get(bVar), context.get(bVar))) {
                o2 o2Var = new o2(dVarJ, cVar);
                kotlin.coroutines.d context2 = o2Var.getContext();
                Object objI = sk.k0.i(context2, null);
                try {
                    Object objB = tk.b.b(o2Var, o2Var, pVar);
                    sk.k0.f(context2, objI);
                    objJ1 = objB;
                } catch (Throwable th2) {
                    sk.k0.f(context2, objI);
                    throw th2;
                }
            } else {
                kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(dVarJ, cVar);
                tk.a.b(pVar, eVar, eVar);
                objJ1 = eVar.j1();
            }
        }
        if (objJ1 == sj.a.f()) {
            tj.f.c(cVar);
        }
        return objJ1;
    }
}
