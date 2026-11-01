package nk;

import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: compiled from: Yield.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class s2 {
    public static final Object a(rj.c<? super mj.r> cVar) {
        sk.g gVar;
        Object objF;
        kotlin.coroutines.d context = cVar.getContext();
        t1.h(context);
        rj.c cVarC = IntrinsicsKt__IntrinsicsJvmKt.c(cVar);
        if (cVarC instanceof sk.g) {
            gVar = (sk.g) cVarC;
        } else {
            gVar = null;
        }
        if (gVar == null) {
            objF = mj.r.f64562a;
        } else {
            if (sk.h.d(gVar.f71947e, context)) {
                gVar.m(context, mj.r.f64562a);
            } else {
                r2 r2Var = new r2();
                kotlin.coroutines.d dVarPlus = context.plus(r2Var);
                mj.r rVar = mj.r.f64562a;
                gVar.m(dVarPlus, rVar);
                if (!r2Var.f64820b || sk.h.e(gVar)) {
                    objF = sj.a.f();
                } else {
                    objF = rVar;
                }
            }
            objF = sj.a.f();
        }
        if (objF == sj.a.f()) {
            tj.f.c(cVar);
        }
        if (objF == sj.a.f()) {
            return objF;
        }
        return mj.r.f64562a;
    }
}
