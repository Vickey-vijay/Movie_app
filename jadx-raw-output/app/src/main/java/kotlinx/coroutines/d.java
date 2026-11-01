package kotlinx.coroutines;

import bk.p;
import java.util.concurrent.CancellationException;
import nk.j2;
import nk.l0;
import nk.t1;
import nk.w0;
import sk.z;

/* JADX INFO: compiled from: CoroutineScope.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class d {
    public static final l0 a(kotlin.coroutines.d dVar) {
        if (dVar.get(g.E8) == null) {
            dVar = dVar.plus(JobKt__JobKt.b(null, 1, null));
        }
        return new sk.d(dVar);
    }

    public static final l0 b() {
        return new sk.d(j2.b(null, 1, null).plus(w0.c()));
    }

    public static /* synthetic */ void d(l0 l0Var, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        c(l0Var, cancellationException);
    }

    public static final <R> Object e(p<? super l0, ? super rj.c<? super R>, ? extends Object> pVar, rj.c<? super R> cVar) {
        z zVar = new z(cVar.getContext(), cVar);
        Object objB = tk.b.b(zVar, zVar, pVar);
        if (objB == sj.a.f()) {
            tj.f.c(cVar);
        }
        return objB;
    }

    public static final l0 h(l0 l0Var, kotlin.coroutines.d dVar) {
        return new sk.d(l0Var.getCoroutineContext().plus(dVar));
    }

    public static final void c(l0 l0Var, CancellationException cancellationException) {
        g gVar = (g) l0Var.getCoroutineContext().get(g.E8);
        if (gVar != null) {
            gVar.a(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + l0Var).toString());
    }

    public static final void f(l0 l0Var) {
        t1.h(l0Var.getCoroutineContext());
    }

    public static final boolean g(l0 l0Var) {
        g gVar = (g) l0Var.getCoroutineContext().get(g.E8);
        if (gVar != null) {
            return gVar.isActive();
        }
        return true;
    }
}
