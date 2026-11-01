package nk;

import kotlin.Result;

/* JADX INFO: compiled from: DispatchedTask.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class u0 {
    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    public static final void e(kotlinx.coroutines.f<?> fVar) {
        c1 c1VarB = l2.f64799a.b();
        if (c1VarB.C()) {
            c1VarB.r(fVar);
            return;
        }
        c1VarB.x(true);
        try {
            d(fVar, fVar.e(), true);
            do {
            } while (c1VarB.K());
        } catch (Throwable th2) {
            try {
                fVar.h(th2);
            } finally {
                c1VarB.n(true);
            }
        }
    }

    public static final <T> void a(kotlinx.coroutines.f<? super T> fVar, int i10) {
        boolean z10;
        rj.c<? super T> cVarE = fVar.e();
        if (i10 == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && (cVarE instanceof sk.g) && b(i10) == b(fVar.f63084d)) {
            sk.g gVar = (sk.g) cVarE;
            h0 h0Var = gVar.f71947e;
            kotlin.coroutines.d context = gVar.getContext();
            if (sk.h.d(h0Var, context)) {
                sk.h.c(h0Var, context, fVar);
                return;
            } else {
                e(fVar);
                return;
            }
        }
        d(fVar, cVarE, z10);
    }

    public static final <T> void d(kotlinx.coroutines.f<? super T> fVar, rj.c<? super T> cVar, boolean z10) {
        Object objG;
        o2<?> o2VarM;
        boolean zJ1;
        Object objI = fVar.i();
        Throwable thF = fVar.f(objI);
        if (thF != null) {
            Result.a aVar = Result.Companion;
            objG = kotlin.c.a(thF);
        } else {
            Result.a aVar2 = Result.Companion;
            objG = fVar.g(objI);
        }
        Object objM3458constructorimpl = Result.m3458constructorimpl(objG);
        if (z10) {
            ck.p.h(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            sk.g gVar = (sk.g) cVar;
            rj.c<T> cVar2 = gVar.f71948f;
            Object obj = gVar.f71950h;
            kotlin.coroutines.d context = cVar2.getContext();
            Object objI2 = sk.k0.i(context, obj);
            if (objI2 != sk.k0.f71955a) {
                o2VarM = f0.m(cVar2, context, objI2);
            } else {
                o2VarM = null;
            }
            try {
                gVar.f71948f.resumeWith(objM3458constructorimpl);
                mj.r rVar = mj.r.f64562a;
                if (o2VarM != null) {
                    if (!zJ1) {
                        return;
                    }
                }
                return;
            } finally {
                if (o2VarM == null || o2VarM.j1()) {
                    sk.k0.f(context, objI2);
                }
            }
        }
        cVar.resumeWith(objM3458constructorimpl);
    }
}
