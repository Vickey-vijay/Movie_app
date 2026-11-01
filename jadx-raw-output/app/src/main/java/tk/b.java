package tk;

import bk.p;
import ck.x;
import kotlin.Result;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;
import nk.v1;
import rj.c;
import sk.k0;
import sk.z;
import tj.f;

/* JADX INFO: compiled from: Undispatched.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static final <T, R> Object b(z<? super T> zVar, R r10, p<? super R, ? super c<? super T>, ? extends Object> pVar) {
        Object zVar2;
        try {
            zVar2 = !(pVar instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.d(pVar, r10, zVar) : ((p) x.e(pVar, 2)).mo1invoke(r10, zVar);
        } catch (Throwable th2) {
            zVar2 = new nk.z(th2, false, 2, null);
        }
        if (zVar2 == sj.a.f()) {
            return sj.a.f();
        }
        Object objF0 = zVar.F0(zVar2);
        if (objF0 == v1.f64826b) {
            return sj.a.f();
        }
        zVar.i1();
        if (objF0 instanceof nk.z) {
            throw ((nk.z) objF0).f64844a;
        }
        return v1.h(objF0);
    }

    public static final <T, R> Object c(z<? super T> zVar, R r10, p<? super R, ? super c<? super T>, ? extends Object> pVar) throws Throwable {
        Object zVar2;
        try {
            zVar2 = !(pVar instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.d(pVar, r10, zVar) : ((p) x.e(pVar, 2)).mo1invoke(r10, zVar);
        } catch (Throwable th2) {
            zVar2 = new nk.z(th2, false, 2, null);
        }
        if (zVar2 == sj.a.f()) {
            return sj.a.f();
        }
        Object objF0 = zVar.F0(zVar2);
        if (objF0 == v1.f64826b) {
            return sj.a.f();
        }
        zVar.i1();
        if (objF0 instanceof nk.z) {
            Throwable th3 = ((nk.z) objF0).f64844a;
            if (((th3 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th3).coroutine == zVar) ? false : true) {
                throw th3;
            }
            if (zVar2 instanceof nk.z) {
                throw ((nk.z) zVar2).f64844a;
            }
        } else {
            zVar2 = v1.h(objF0);
        }
        return zVar2;
    }

    public static final <R, T> void a(p<? super R, ? super c<? super T>, ? extends Object> pVar, R r10, c<? super T> cVar) {
        Object objMo1invoke;
        c cVarA = f.a(cVar);
        try {
            d context = cVarA.getContext();
            Object objI = k0.i(context, null);
            try {
                f.b(cVarA);
                if (!(pVar instanceof BaseContinuationImpl)) {
                    objMo1invoke = IntrinsicsKt__IntrinsicsJvmKt.d(pVar, r10, cVarA);
                } else {
                    objMo1invoke = ((p) x.e(pVar, 2)).mo1invoke(r10, cVarA);
                }
                k0.f(context, objI);
                if (objMo1invoke != sj.a.f()) {
                    cVarA.resumeWith(Result.m3458constructorimpl(objMo1invoke));
                }
            } catch (Throwable th2) {
                k0.f(context, objI);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).getCause();
            }
            Result.a aVar = Result.Companion;
            cVarA.resumeWith(Result.m3458constructorimpl(kotlin.c.a(th)));
        }
    }
}
