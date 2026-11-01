package kotlinx.coroutines.flow;

import bk.q;
import ck.p;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.g;
import mj.r;
import qk.c;
import qk.d;

/* JADX INFO: compiled from: Errors.kt */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class FlowKt__ErrorsKt {
    public static final <T> c<T> a(c<? extends T> cVar, q<? super d<? super T>, ? super Throwable, ? super rj.c<? super r>, ? extends Object> qVar) {
        return new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(cVar, qVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object b(c<? extends T> cVar, d<? super T> dVar, rj.c<? super Throwable> cVar2) throws Throwable {
        FlowKt__ErrorsKt$catchImpl$1 flowKt__ErrorsKt$catchImpl$1;
        Ref$ObjectRef ref$ObjectRef;
        if (cVar2 instanceof FlowKt__ErrorsKt$catchImpl$1) {
            flowKt__ErrorsKt$catchImpl$1 = (FlowKt__ErrorsKt$catchImpl$1) cVar2;
            int i10 = flowKt__ErrorsKt$catchImpl$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__ErrorsKt$catchImpl$1.label = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1(cVar2);
            }
        } else {
            flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1(cVar2);
        }
        Object obj = flowKt__ErrorsKt$catchImpl$1.result;
        Object objF = sj.a.f();
        int i11 = flowKt__ErrorsKt$catchImpl$1.label;
        if (i11 == 0) {
            kotlin.c.b(obj);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            try {
                d<? super Object> flowKt__ErrorsKt$catchImpl$2 = new FlowKt__ErrorsKt$catchImpl$2<>(dVar, ref$ObjectRef2);
                flowKt__ErrorsKt$catchImpl$1.L$0 = ref$ObjectRef2;
                flowKt__ErrorsKt$catchImpl$1.label = 1;
                if (cVar.collect(flowKt__ErrorsKt$catchImpl$2, flowKt__ErrorsKt$catchImpl$1) == objF) {
                    return objF;
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                ref$ObjectRef = ref$ObjectRef2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef = (Ref$ObjectRef) flowKt__ErrorsKt$catchImpl$1.L$0;
            try {
                kotlin.c.b(obj);
                return null;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        Throwable th4 = (Throwable) ref$ObjectRef.element;
        if (d(th, th4) || c(th, flowKt__ErrorsKt$catchImpl$1.getContext())) {
            throw th;
        }
        if (th4 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            mj.d.a(th4, th);
            throw th4;
        }
        mj.d.a(th, th4);
        throw th;
    }

    public static final boolean c(Throwable th2, kotlin.coroutines.d dVar) {
        g gVar = (g) dVar.get(g.E8);
        if (gVar == null || !gVar.isCancelled()) {
            return false;
        }
        return d(th2, gVar.B());
    }

    public static final boolean d(Throwable th2, Throwable th3) {
        return th3 != null && p.e(th3, th2);
    }
}
