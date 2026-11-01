package kotlinx.coroutines.flow;

import bk.p;
import bk.q;
import mj.r;
import qk.d;
import qk.x;
import rj.c;

/* JADX INFO: compiled from: Emitters.kt */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class FlowKt__EmittersKt {
    public static final void b(d<?> dVar) {
        if (dVar instanceof x) {
            throw ((x) dVar).f66603b;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object c(d<? super T> dVar, q<? super d<? super T>, ? super Throwable, ? super c<? super r>, ? extends Object> qVar, Throwable th2, c<? super r> cVar) throws Throwable {
        FlowKt__EmittersKt$invokeSafely$1 flowKt__EmittersKt$invokeSafely$1;
        if (cVar instanceof FlowKt__EmittersKt$invokeSafely$1) {
            flowKt__EmittersKt$invokeSafely$1 = (FlowKt__EmittersKt$invokeSafely$1) cVar;
            int i10 = flowKt__EmittersKt$invokeSafely$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__EmittersKt$invokeSafely$1.label = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1(cVar);
            }
        } else {
            flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1(cVar);
        }
        Object obj = flowKt__EmittersKt$invokeSafely$1.result;
        Object objF = sj.a.f();
        int i11 = flowKt__EmittersKt$invokeSafely$1.label;
        try {
            if (i11 == 0) {
                kotlin.c.b(obj);
                flowKt__EmittersKt$invokeSafely$1.L$0 = th2;
                flowKt__EmittersKt$invokeSafely$1.label = 1;
                if (qVar.invoke(dVar, th2, flowKt__EmittersKt$invokeSafely$1) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th2 = (Throwable) flowKt__EmittersKt$invokeSafely$1.L$0;
                kotlin.c.b(obj);
            }
            return r.f64562a;
        } catch (Throwable th3) {
            if (th2 != null && th2 != th3) {
                mj.d.a(th3, th2);
            }
            throw th3;
        }
    }

    public static final <T> qk.c<T> d(qk.c<? extends T> cVar, q<? super d<? super T>, ? super Throwable, ? super c<? super r>, ? extends Object> qVar) {
        return new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(cVar, qVar);
    }

    public static final <T> qk.c<T> e(qk.c<? extends T> cVar, p<? super d<? super T>, ? super c<? super r>, ? extends Object> pVar) {
        return new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(pVar, cVar);
    }
}
