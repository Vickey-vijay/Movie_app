package kotlinx.coroutines.flow;

import bk.p;
import bk.q;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import mj.r;
import qk.c;
import qk.d;
import qk.e;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class FlowKt__LimitKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    public static final class a<T> implements c<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f63100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f63101c;

        public a(c cVar, p pVar) {
            this.f63100b = cVar;
            this.f63101c = pVar;
        }

        @Override // qk.c
        public Object collect(d<? super T> dVar, rj.c<? super r> cVar) {
            Object objCollect = this.f63100b.collect(new FlowKt__LimitKt$dropWhile$1$1(new Ref$BooleanRef(), dVar, this.f63101c), cVar);
            return objCollect == sj.a.f() ? objCollect : r.f64562a;
        }
    }

    public static final <T> c<T> b(c<? extends T> cVar, p<? super T, ? super rj.c<? super Boolean>, ? extends Object> pVar) {
        return new a(cVar, pVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object c(d<? super T> dVar, T t10, Object obj, rj.c<? super r> cVar) throws Throwable {
        FlowKt__LimitKt$emitAbort$1 flowKt__LimitKt$emitAbort$1;
        if (cVar instanceof FlowKt__LimitKt$emitAbort$1) {
            flowKt__LimitKt$emitAbort$1 = (FlowKt__LimitKt$emitAbort$1) cVar;
            int i10 = flowKt__LimitKt$emitAbort$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$emitAbort$1.label = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$emitAbort$1 = new FlowKt__LimitKt$emitAbort$1(cVar);
            }
        } else {
            flowKt__LimitKt$emitAbort$1 = new FlowKt__LimitKt$emitAbort$1(cVar);
        }
        Object obj2 = flowKt__LimitKt$emitAbort$1.result;
        Object objF = sj.a.f();
        int i11 = flowKt__LimitKt$emitAbort$1.label;
        if (i11 == 0) {
            kotlin.c.b(obj2);
            flowKt__LimitKt$emitAbort$1.L$0 = obj;
            flowKt__LimitKt$emitAbort$1.label = 1;
            if (dVar.emit(t10, flowKt__LimitKt$emitAbort$1) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = flowKt__LimitKt$emitAbort$1.L$0;
            kotlin.c.b(obj2);
        }
        throw new AbortFlowException(obj);
    }

    public static final <T> c<T> d(c<? extends T> cVar, int i10) {
        if (i10 > 0) {
            return new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(cVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " should be positive").toString());
    }

    public static final <T, R> c<R> e(c<? extends T> cVar, q<? super d<? super R>, ? super T, ? super rj.c<? super Boolean>, ? extends Object> qVar) {
        return e.t(new FlowKt__LimitKt$transformWhile$1(cVar, qVar, null));
    }
}
