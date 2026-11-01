package kotlinx.coroutines.flow;

import bk.p;
import ck.n;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import mj.r;
import qk.d;
import rj.c;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class FlowKt__ReduceKt$first$$inlined$collectWhile$2<T> implements d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f63117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f63118c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2$1, reason: invalid class name */
    @tj.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "emit")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__ReduceKt$first$$inlined$collectWhile$2.this.emit(null, this);
        }
    }

    public FlowKt__ReduceKt$first$$inlined$collectWhile$2(p pVar, Ref$ObjectRef ref$ObjectRef) {
        this.f63117b = pVar;
        this.f63118c = ref$ObjectRef;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qk.d
    public Object emit(T t10, c<? super r> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        FlowKt__ReduceKt$first$$inlined$collectWhile$2<T> flowKt__ReduceKt$first$$inlined$collectWhile$2;
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
        Object objMo1invoke = anonymousClass1.result;
        Object objF = sj.a.f();
        int i11 = anonymousClass1.label;
        boolean z10 = true;
        if (i11 == 0) {
            kotlin.c.b(objMo1invoke);
            p pVar = this.f63117b;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = t10;
            anonymousClass1.label = 1;
            n.c(6);
            objMo1invoke = pVar.mo1invoke(t10, anonymousClass1);
            n.c(7);
            if (objMo1invoke == objF) {
                return objF;
            }
            flowKt__ReduceKt$first$$inlined$collectWhile$2 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t10 = (T) anonymousClass1.L$1;
            flowKt__ReduceKt$first$$inlined$collectWhile$2 = (FlowKt__ReduceKt$first$$inlined$collectWhile$2) anonymousClass1.L$0;
            kotlin.c.b(objMo1invoke);
        }
        if (((Boolean) objMo1invoke).booleanValue()) {
            flowKt__ReduceKt$first$$inlined$collectWhile$2.f63118c.element = t10;
            z10 = false;
        }
        if (z10) {
            return r.f64562a;
        }
        throw new AbortFlowException(flowKt__ReduceKt$first$$inlined$collectWhile$2);
    }
}
