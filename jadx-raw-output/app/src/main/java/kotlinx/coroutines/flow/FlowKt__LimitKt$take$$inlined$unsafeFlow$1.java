package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import mj.r;
import qk.c;
import rk.i;
import tj.d;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class FlowKt__LimitKt$take$$inlined$unsafeFlow$1<T> implements c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f63105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f63106c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1, reason: invalid class name */
    @d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", l = {112}, m = "collect")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(rj.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$take$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__LimitKt$take$$inlined$unsafeFlow$1(c cVar, int i10) {
        this.f63105b = cVar;
        this.f63106c = i10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qk.c
    public Object collect(qk.d<? super T> dVar, rj.c<? super r> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        AbortFlowException e10;
        Object obj;
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
        Object obj2 = anonymousClass1.result;
        Object objF = sj.a.f();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            kotlin.c.b(obj2);
            Object obj3 = new Object();
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            try {
                c cVar2 = this.f63105b;
                FlowKt__LimitKt$take$2$1 flowKt__LimitKt$take$2$1 = new FlowKt__LimitKt$take$2$1(ref$IntRef, this.f63106c, dVar, obj3);
                anonymousClass1.L$0 = obj3;
                anonymousClass1.label = 1;
                if (cVar2.collect(flowKt__LimitKt$take$2$1, anonymousClass1) == objF) {
                    return objF;
                }
            } catch (AbortFlowException e11) {
                e10 = e11;
                obj = obj3;
                i.a(e10, obj);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = anonymousClass1.L$0;
            try {
                kotlin.c.b(obj2);
            } catch (AbortFlowException e12) {
                e10 = e12;
                i.a(e10, obj);
            }
        }
        return r.f64562a;
    }
}
