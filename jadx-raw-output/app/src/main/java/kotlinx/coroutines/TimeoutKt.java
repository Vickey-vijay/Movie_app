package kotlinx.coroutines;

import bk.p;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.time.DurationUnit;
import nk.l0;
import nk.m2;
import nk.r0;
import nk.s0;
import nk.t0;
import nk.t1;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class TimeoutKt {
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Instruction removed from duplicated block: B:9:0x0018, please report this as an issue */
    public static final TimeoutCancellationException a(long j10, r0 r0Var, g gVar) {
        String strH;
        t0 t0Var = r0Var instanceof t0 ? (t0) r0Var : null;
        if (t0Var != null) {
            mk.b.a aVar = mk.b.f64563c;
            strH = t0Var.h(mk.d.t(j10, DurationUnit.MILLISECONDS));
            if (strH == null) {
                strH = "Timed out waiting for " + j10 + " ms";
            }
        } else {
            strH = "Timed out waiting for " + j10 + " ms";
        }
        return new TimeoutCancellationException(strH, gVar);
    }

    public static final <U, T extends U> Object b(m2<U, ? super T> m2Var, p<? super l0, ? super rj.c<? super T>, ? extends Object> pVar) {
        t1.g(m2Var, s0.c(m2Var.f71995e.getContext()).j(m2Var.f64803f, m2Var, m2Var.getContext()));
        return tk.b.c(m2Var, m2Var, pVar);
    }

    public static final <T> Object c(long j10, p<? super l0, ? super rj.c<? super T>, ? extends Object> pVar, rj.c<? super T> cVar) {
        if (j10 <= 0) {
            throw new TimeoutCancellationException("Timed out immediately");
        }
        Object objB = b(new m2(j10, cVar), pVar);
        if (objB == sj.a.f()) {
            tj.f.c(cVar);
        }
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, nk.m2] */
    public static final <T> Object d(long j10, p<? super l0, ? super rj.c<? super T>, ? extends Object> pVar, rj.c<? super T> cVar) throws Throwable {
        TimeoutKt$withTimeoutOrNull$1 timeoutKt$withTimeoutOrNull$1;
        Ref$ObjectRef ref$ObjectRef;
        if (cVar instanceof TimeoutKt$withTimeoutOrNull$1) {
            timeoutKt$withTimeoutOrNull$1 = (TimeoutKt$withTimeoutOrNull$1) cVar;
            int i10 = timeoutKt$withTimeoutOrNull$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                timeoutKt$withTimeoutOrNull$1.label = i10 - Integer.MIN_VALUE;
            } else {
                timeoutKt$withTimeoutOrNull$1 = new TimeoutKt$withTimeoutOrNull$1(cVar);
            }
        } else {
            timeoutKt$withTimeoutOrNull$1 = new TimeoutKt$withTimeoutOrNull$1(cVar);
        }
        Object obj = timeoutKt$withTimeoutOrNull$1.result;
        Object objF = sj.a.f();
        int i11 = timeoutKt$withTimeoutOrNull$1.label;
        if (i11 == 0) {
            kotlin.c.b(obj);
            if (j10 <= 0) {
                return null;
            }
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            try {
                timeoutKt$withTimeoutOrNull$1.L$0 = pVar;
                timeoutKt$withTimeoutOrNull$1.L$1 = ref$ObjectRef2;
                timeoutKt$withTimeoutOrNull$1.J$0 = j10;
                timeoutKt$withTimeoutOrNull$1.label = 1;
                ?? r10 = (T) new m2(j10, timeoutKt$withTimeoutOrNull$1);
                ref$ObjectRef2.element = r10;
                Object objB = b(r10, pVar);
                if (objB == sj.a.f()) {
                    tj.f.c(timeoutKt$withTimeoutOrNull$1);
                }
                return objB == objF ? objF : objB;
            } catch (TimeoutCancellationException e10) {
                e = e10;
                ref$ObjectRef = ref$ObjectRef2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef = (Ref$ObjectRef) timeoutKt$withTimeoutOrNull$1.L$1;
            try {
                kotlin.c.b(obj);
                return obj;
            } catch (TimeoutCancellationException e11) {
                e = e11;
            }
        }
        if (e.coroutine == ref$ObjectRef.element) {
            return null;
        }
        throw e;
    }

    public static final <T> Object e(long j10, p<? super l0, ? super rj.c<? super T>, ? extends Object> pVar, rj.c<? super T> cVar) {
        return d(s0.d(j10), pVar, cVar);
    }
}
