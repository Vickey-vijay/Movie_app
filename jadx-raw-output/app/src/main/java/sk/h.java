package sk;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlinx.coroutines.DispatchException;
import nk.c1;
import nk.l2;
import nk.o2;

/* JADX INFO: compiled from: DispatchedContinuation.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f71951a = new d0("UNDEFINED");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f71952b = new d0("REUSABLE_CLAIMED");

    public static final <T> void b(rj.c<? super T> cVar, Object obj) {
        boolean z10;
        if (!(cVar instanceof g)) {
            cVar.resumeWith(obj);
            return;
        }
        g gVar = (g) cVar;
        Object objB = nk.a0.b(obj);
        if (d(gVar.f71947e, gVar.getContext())) {
            gVar.f71949g = objB;
            gVar.f63084d = 1;
            c(gVar.f71947e, gVar.getContext(), gVar);
            return;
        }
        c1 c1VarB = l2.f64799a.b();
        if (c1VarB.C()) {
            gVar.f71949g = objB;
            gVar.f63084d = 1;
            c1VarB.r(gVar);
            return;
        }
        c1VarB.x(true);
        try {
            kotlinx.coroutines.g gVar2 = (kotlinx.coroutines.g) gVar.getContext().get(kotlinx.coroutines.g.E8);
            if (gVar2 == null || gVar2.isActive()) {
                z10 = false;
            } else {
                CancellationException cancellationExceptionB = gVar2.B();
                gVar.a(objB, cancellationExceptionB);
                Result.a aVar = Result.Companion;
                gVar.resumeWith(Result.m3458constructorimpl(kotlin.c.a(cancellationExceptionB)));
                z10 = true;
            }
            if (!z10) {
                rj.c<T> cVar2 = gVar.f71948f;
                Object obj2 = gVar.f71950h;
                kotlin.coroutines.d context = cVar2.getContext();
                Object objI = k0.i(context, obj2);
                o2<?> o2VarM = objI != k0.f71955a ? nk.f0.m(cVar2, context, objI) : null;
                try {
                    gVar.f71948f.resumeWith(obj);
                    mj.r rVar = mj.r.f64562a;
                    if (o2VarM == null || o2VarM.j1()) {
                        k0.f(context, objI);
                    }
                } catch (Throwable th2) {
                    if (o2VarM == null || o2VarM.j1()) {
                        k0.f(context, objI);
                    }
                    throw th2;
                }
            }
            while (c1VarB.K()) {
            }
        } catch (Throwable th3) {
            try {
                gVar.h(th3);
            } finally {
                c1VarB.n(true);
            }
        }
    }

    public static final boolean e(g<? super mj.r> gVar) {
        mj.r rVar = mj.r.f64562a;
        c1 c1VarB = l2.f64799a.b();
        if (c1VarB.D()) {
            return false;
        }
        if (c1VarB.C()) {
            gVar.f71949g = rVar;
            gVar.f63084d = 1;
            c1VarB.r(gVar);
            return true;
        }
        c1VarB.x(true);
        try {
            gVar.run();
            do {
            } while (c1VarB.K());
        } catch (Throwable th2) {
            try {
                gVar.h(th2);
            } finally {
                c1VarB.n(true);
            }
        }
        return false;
    }

    public static final void c(nk.h0 h0Var, kotlin.coroutines.d dVar, Runnable runnable) {
        try {
            h0Var.dispatch(dVar, runnable);
        } catch (Throwable th2) {
            throw new DispatchException(th2, h0Var, dVar);
        }
    }

    public static final boolean d(nk.h0 h0Var, kotlin.coroutines.d dVar) throws DispatchException {
        try {
            return h0Var.isDispatchNeeded(dVar);
        } catch (Throwable th2) {
            throw new DispatchException(th2, h0Var, dVar);
        }
    }
}
