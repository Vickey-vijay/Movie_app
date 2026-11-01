package kotlinx.coroutines;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kk.i;
import nk.a1;
import nk.s1;
import nk.t1;
import nk.u1;
import nk.x;
import nk.y0;

/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class JobKt__JobKt {
    public static /* synthetic */ y0 l(g gVar, boolean z10, u1 u1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return t1.k(gVar, z10, u1Var);
    }

    public static final x a(g gVar) {
        return new s1(gVar);
    }

    public static /* synthetic */ x b(g gVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = null;
        }
        return t1.a(gVar);
    }

    public static final void c(kotlin.coroutines.d dVar, CancellationException cancellationException) {
        g gVar = (g) dVar.get(g.E8);
        if (gVar != null) {
            gVar.a(cancellationException);
        }
    }

    public static /* synthetic */ void d(kotlin.coroutines.d dVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        t1.c(dVar, cancellationException);
    }

    public static final void e(kotlin.coroutines.d dVar, CancellationException cancellationException) {
        i<g> iVarK;
        g gVar = (g) dVar.get(g.E8);
        if (gVar == null || (iVarK = gVar.k()) == null) {
            return;
        }
        Iterator<g> it = iVarK.iterator();
        while (it.hasNext()) {
            it.next().a(cancellationException);
        }
    }

    public static /* synthetic */ void f(kotlin.coroutines.d dVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        t1.e(dVar, cancellationException);
    }

    public static final y0 g(g gVar, y0 y0Var) {
        return l(gVar, false, new a1(y0Var), 1, null);
    }

    public static final void h(kotlin.coroutines.d dVar) {
        g gVar = (g) dVar.get(g.E8);
        if (gVar != null) {
            t1.i(gVar);
        }
    }

    public static final g j(kotlin.coroutines.d dVar) {
        g gVar = (g) dVar.get(g.E8);
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + dVar).toString());
    }

    public static final y0 k(g gVar, boolean z10, u1 u1Var) {
        return gVar instanceof JobSupport ? ((JobSupport) gVar).z0(z10, u1Var) : gVar.N(u1Var.u(), z10, new JobKt__JobKt$invokeOnCompletion$1(u1Var));
    }

    public static final void i(g gVar) {
        if (gVar.isActive()) {
        } else {
            throw gVar.B();
        }
    }
}
