package kotlinx.coroutines.flow;

import bk.q;
import ck.n;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.SafeCollector;
import mj.r;
import qk.c;
import qk.x;
import tj.d;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1<T> implements c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f63092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f63093c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1, reason: invalid class name */
    @d(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {110, 117, 124}, m = "collect")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(rj.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(c cVar, q qVar) {
        this.f63092b = cVar;
        this.f63093c = qVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0086 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qk.c
    public Object collect(qk.d<? super T> dVar, rj.c<? super r> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1<T> flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
        x xVar;
        q qVar;
        SafeCollector safeCollector;
        Throwable th2;
        SafeCollector safeCollector2;
        Object objInvoke;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj = anonymousClass1.result;
        Object objF = sj.a.f();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            kotlin.c.b(obj);
            try {
                c cVar2 = this.f63092b;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = dVar;
                anonymousClass1.label = 1;
                if (cVar2.collect(dVar, anonymousClass1) == objF) {
                    return objF;
                }
                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = this;
                safeCollector = new SafeCollector(dVar, anonymousClass1.getContext());
                q qVar2 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f63093c;
                anonymousClass1.L$0 = safeCollector;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 3;
                n.c(6);
                objInvoke = qVar2.invoke(safeCollector, null, anonymousClass1);
                n.c(7);
                if (objInvoke == objF) {
                    return objF;
                }
                safeCollector2 = safeCollector;
                safeCollector2.releaseIntercepted();
                return r.f64562a;
            } catch (Throwable th3) {
                th = th3;
                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = this;
                xVar = new x(th);
                qVar = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f63093c;
                anonymousClass1.L$0 = th;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 2;
                if (FlowKt__EmittersKt.c(xVar, qVar, th, anonymousClass1) == objF) {
                    return objF;
                }
                throw th;
            }
        }
        if (i11 != 1) {
            if (i11 == 2) {
                Throwable th4 = (Throwable) anonymousClass1.L$0;
                kotlin.c.b(obj);
                throw th4;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            safeCollector2 = (SafeCollector) anonymousClass1.L$0;
            try {
                kotlin.c.b(obj);
                safeCollector2.releaseIntercepted();
                return r.f64562a;
            } catch (Throwable th5) {
                th2 = th5;
                safeCollector2.releaseIntercepted();
                throw th2;
            }
        }
        dVar = (qk.d) anonymousClass1.L$1;
        flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = (FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1) anonymousClass1.L$0;
        try {
            kotlin.c.b(obj);
            safeCollector = new SafeCollector(dVar, anonymousClass1.getContext());
            try {
                q qVar3 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f63093c;
                anonymousClass1.L$0 = safeCollector;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 3;
                n.c(6);
                objInvoke = qVar3.invoke(safeCollector, null, anonymousClass1);
                n.c(7);
                if (objInvoke == objF) {
                    return objF;
                }
                safeCollector2 = safeCollector;
                safeCollector2.releaseIntercepted();
                return r.f64562a;
            } catch (Throwable th6) {
                th2 = th6;
                safeCollector2 = safeCollector;
                safeCollector2.releaseIntercepted();
                throw th2;
            }
        } catch (Throwable th7) {
            th = th7;
            xVar = new x(th);
            qVar = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f63093c;
            anonymousClass1.L$0 = th;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 2;
            if (FlowKt__EmittersKt.c(xVar, qVar, th, anonymousClass1) == objF) {
                return objF;
            }
            throw th;
        }
    }
}
