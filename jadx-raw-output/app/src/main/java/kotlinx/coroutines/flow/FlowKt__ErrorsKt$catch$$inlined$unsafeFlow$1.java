package kotlinx.coroutines.flow;

import bk.q;
import ck.n;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mj.r;
import qk.c;
import qk.e;
import tj.d;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1<T> implements c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f63096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f63097c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1, reason: invalid class name */
    @d(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {109, 110}, m = "collect")
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
            return FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(c cVar, q qVar) {
        this.f63096b = cVar;
        this.f63097c = qVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qk.c
    public Object collect(qk.d<? super T> dVar, rj.c<? super r> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1<T> flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
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
        Object objG = anonymousClass1.result;
        Object objF = sj.a.f();
        int i11 = anonymousClass1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                dVar = (qk.d) anonymousClass1.L$1;
                flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = (FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1) anonymousClass1.L$0;
                kotlin.c.b(objG);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(objG);
            }
            return r.f64562a;
        }
        kotlin.c.b(objG);
        c cVar2 = this.f63096b;
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = dVar;
        anonymousClass1.label = 1;
        objG = e.g(cVar2, dVar, anonymousClass1);
        if (objG == objF) {
            return objF;
        }
        flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = this;
        Throwable th2 = (Throwable) objG;
        if (th2 != null) {
            q qVar = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.f63097c;
            anonymousClass1.L$0 = null;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 2;
            n.c(6);
            Object objInvoke = qVar.invoke(dVar, th2, anonymousClass1);
            n.c(7);
            if (objInvoke == objF) {
                return objF;
            }
        }
        return r.f64562a;
    }
}
