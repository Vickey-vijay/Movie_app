package nk;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.time.DurationUnit;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class s0 {
    public static final Object a(long j10, rj.c<? super mj.r> cVar) {
        if (j10 <= 0) {
            return mj.r.f64562a;
        }
        kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        cVar2.J();
        if (j10 < Long.MAX_VALUE) {
            c(cVar2.getContext()).e(j10, cVar2);
        }
        Object objB = cVar2.B();
        if (objB == sj.a.f()) {
            tj.f.c(cVar);
        }
        return objB == sj.a.f() ? objB : mj.r.f64562a;
    }

    public static final r0 c(kotlin.coroutines.d dVar) {
        kotlin.coroutines.d.b bVar = dVar.get(kotlin.coroutines.c.D8);
        r0 r0Var = bVar instanceof r0 ? (r0) bVar : null;
        return r0Var == null ? o0.a() : r0Var;
    }

    public static final Object b(long j10, rj.c<? super mj.r> cVar) {
        Object objA = a(d(j10), cVar);
        if (objA == sj.a.f()) {
            return objA;
        }
        return mj.r.f64562a;
    }

    public static final long d(long j10) {
        boolean zE = mk.b.E(j10);
        if (zE) {
            return mk.b.p(mk.b.F(j10, mk.d.t(999999L, DurationUnit.NANOSECONDS)));
        }
        if (!zE) {
            return 0L;
        }
        throw new NoWhenBranchMatchedException();
    }
}
