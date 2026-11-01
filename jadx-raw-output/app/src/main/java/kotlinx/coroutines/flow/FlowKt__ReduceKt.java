package kotlinx.coroutines.flow;

import bk.p;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import mj.r;
import nk.t1;
import qk.d;
import rk.i;
import rk.m;

/* JADX INFO: compiled from: Reduce.kt */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class FlowKt__ReduceKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Limit.kt */
    public static final class a<T> implements d<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f63114b;

        public a(Ref$ObjectRef ref$ObjectRef) {
            this.f63114b = ref$ObjectRef;
        }

        @Override // qk.d
        public Object emit(T t10, rj.c<? super r> cVar) {
            this.f63114b.element = t10;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Limit.kt */
    public static final class b<T> implements d<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f63115b;

        public b(Ref$ObjectRef ref$ObjectRef) {
            this.f63115b = ref$ObjectRef;
        }

        @Override // qk.d
        public Object emit(T t10, rj.c<? super r> cVar) {
            this.f63115b.element = t10;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: compiled from: Reduce.kt */
    public static final class c<T> implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<Object> f63116b;

        public c(Ref$ObjectRef<Object> ref$ObjectRef) {
            this.f63116b = ref$ObjectRef;
        }

        @Override // qk.d
        public final Object emit(T t10, rj.c<? super r> cVar) {
            Ref$ObjectRef<Object> ref$ObjectRef = this.f63116b;
            if (!(ref$ObjectRef.element == m.f66793a)) {
                throw new IllegalArgumentException("Flow has more than one element".toString());
            }
            ref$ObjectRef.element = t10;
            return r.f64562a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object a(qk.c<? extends T> cVar, p<? super T, ? super rj.c<? super Boolean>, ? extends Object> pVar, rj.c<? super T> cVar2) throws Throwable {
        FlowKt__ReduceKt$first$3 flowKt__ReduceKt$first$3;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e10;
        d<? super Object> dVar;
        if (cVar2 instanceof FlowKt__ReduceKt$first$3) {
            flowKt__ReduceKt$first$3 = (FlowKt__ReduceKt$first$3) cVar2;
            int i10 = flowKt__ReduceKt$first$3.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$3.label = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3(cVar2);
            }
        } else {
            flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3(cVar2);
        }
        Object obj = flowKt__ReduceKt$first$3.result;
        Object objF = sj.a.f();
        int i11 = flowKt__ReduceKt$first$3.label;
        if (i11 == 0) {
            kotlin.c.b(obj);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.element = (T) m.f66793a;
            d<? super Object> flowKt__ReduceKt$first$$inlined$collectWhile$2 = new FlowKt__ReduceKt$first$$inlined$collectWhile$2<>(pVar, ref$ObjectRef2);
            try {
                flowKt__ReduceKt$first$3.L$0 = ref$ObjectRef2;
                flowKt__ReduceKt$first$3.L$1 = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                flowKt__ReduceKt$first$3.label = 1;
                if (cVar.collect(flowKt__ReduceKt$first$$inlined$collectWhile$2, flowKt__ReduceKt$first$3) == objF) {
                    return objF;
                }
                ref$ObjectRef = ref$ObjectRef2;
            } catch (AbortFlowException e11) {
                ref$ObjectRef = ref$ObjectRef2;
                e10 = e11;
                dVar = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                i.a(e10, dVar);
                t1.h(flowKt__ReduceKt$first$3.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = (FlowKt__ReduceKt$first$$inlined$collectWhile$2) flowKt__ReduceKt$first$3.L$1;
            ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$first$3.L$0;
            try {
                kotlin.c.b(obj);
            } catch (AbortFlowException e12) {
                e10 = e12;
                i.a(e10, dVar);
                t1.h(flowKt__ReduceKt$first$3.getContext());
            }
        }
        T t10 = ref$ObjectRef.element;
        if (t10 != m.f66793a) {
            return t10;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object b(qk.c<? extends T> cVar, rj.c<? super T> cVar2) throws Throwable {
        FlowKt__ReduceKt$first$1 flowKt__ReduceKt$first$1;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e10;
        d<? super Object> dVar;
        if (cVar2 instanceof FlowKt__ReduceKt$first$1) {
            flowKt__ReduceKt$first$1 = (FlowKt__ReduceKt$first$1) cVar2;
            int i10 = flowKt__ReduceKt$first$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$1.label = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(cVar2);
            }
        } else {
            flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(cVar2);
        }
        Object obj = flowKt__ReduceKt$first$1.result;
        Object objF = sj.a.f();
        int i11 = flowKt__ReduceKt$first$1.label;
        if (i11 == 0) {
            kotlin.c.b(obj);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.element = (T) m.f66793a;
            d<? super Object> aVar = new a<>(ref$ObjectRef2);
            try {
                flowKt__ReduceKt$first$1.L$0 = ref$ObjectRef2;
                flowKt__ReduceKt$first$1.L$1 = aVar;
                flowKt__ReduceKt$first$1.label = 1;
                if (cVar.collect(aVar, flowKt__ReduceKt$first$1) == objF) {
                    return objF;
                }
                ref$ObjectRef = ref$ObjectRef2;
            } catch (AbortFlowException e11) {
                ref$ObjectRef = ref$ObjectRef2;
                e10 = e11;
                dVar = aVar;
                i.a(e10, dVar);
                t1.h(flowKt__ReduceKt$first$1.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = (a) flowKt__ReduceKt$first$1.L$1;
            ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$first$1.L$0;
            try {
                kotlin.c.b(obj);
            } catch (AbortFlowException e12) {
                e10 = e12;
                i.a(e10, dVar);
                t1.h(flowKt__ReduceKt$first$1.getContext());
            }
        }
        T t10 = ref$ObjectRef.element;
        if (t10 != m.f66793a) {
            return t10;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object c(qk.c<? extends T> cVar, rj.c<? super T> cVar2) throws Throwable {
        FlowKt__ReduceKt$firstOrNull$1 flowKt__ReduceKt$firstOrNull$1;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e10;
        d<? super Object> dVar;
        if (cVar2 instanceof FlowKt__ReduceKt$firstOrNull$1) {
            flowKt__ReduceKt$firstOrNull$1 = (FlowKt__ReduceKt$firstOrNull$1) cVar2;
            int i10 = flowKt__ReduceKt$firstOrNull$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$firstOrNull$1.label = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$firstOrNull$1 = new FlowKt__ReduceKt$firstOrNull$1(cVar2);
            }
        } else {
            flowKt__ReduceKt$firstOrNull$1 = new FlowKt__ReduceKt$firstOrNull$1(cVar2);
        }
        Object obj = flowKt__ReduceKt$firstOrNull$1.result;
        Object objF = sj.a.f();
        int i11 = flowKt__ReduceKt$firstOrNull$1.label;
        if (i11 == 0) {
            kotlin.c.b(obj);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            d<? super Object> bVar = new b<>(ref$ObjectRef2);
            try {
                flowKt__ReduceKt$firstOrNull$1.L$0 = ref$ObjectRef2;
                flowKt__ReduceKt$firstOrNull$1.L$1 = bVar;
                flowKt__ReduceKt$firstOrNull$1.label = 1;
                if (cVar.collect(bVar, flowKt__ReduceKt$firstOrNull$1) == objF) {
                    return objF;
                }
                ref$ObjectRef = ref$ObjectRef2;
            } catch (AbortFlowException e11) {
                ref$ObjectRef = ref$ObjectRef2;
                e10 = e11;
                dVar = bVar;
                i.a(e10, dVar);
                t1.h(flowKt__ReduceKt$firstOrNull$1.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = (b) flowKt__ReduceKt$firstOrNull$1.L$1;
            ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$firstOrNull$1.L$0;
            try {
                kotlin.c.b(obj);
            } catch (AbortFlowException e12) {
                e10 = e12;
                i.a(e10, dVar);
                t1.h(flowKt__ReduceKt$firstOrNull$1.getContext());
            }
        }
        return ref$ObjectRef.element;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object d(qk.c<? extends T> cVar, rj.c<? super T> cVar2) throws Throwable {
        FlowKt__ReduceKt$single$1 flowKt__ReduceKt$single$1;
        Ref$ObjectRef ref$ObjectRef;
        if (cVar2 instanceof FlowKt__ReduceKt$single$1) {
            flowKt__ReduceKt$single$1 = (FlowKt__ReduceKt$single$1) cVar2;
            int i10 = flowKt__ReduceKt$single$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$single$1.label = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$single$1 = new FlowKt__ReduceKt$single$1(cVar2);
            }
        } else {
            flowKt__ReduceKt$single$1 = new FlowKt__ReduceKt$single$1(cVar2);
        }
        Object obj = flowKt__ReduceKt$single$1.result;
        Object objF = sj.a.f();
        int i11 = flowKt__ReduceKt$single$1.label;
        if (i11 == 0) {
            kotlin.c.b(obj);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.element = (T) m.f66793a;
            d<? super Object> cVar3 = new c<>(ref$ObjectRef2);
            flowKt__ReduceKt$single$1.L$0 = ref$ObjectRef2;
            flowKt__ReduceKt$single$1.label = 1;
            if (cVar.collect(cVar3, flowKt__ReduceKt$single$1) == objF) {
                return objF;
            }
            ref$ObjectRef = ref$ObjectRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$single$1.L$0;
            kotlin.c.b(obj);
        }
        T t10 = ref$ObjectRef.element;
        if (t10 != m.f66793a) {
            return t10;
        }
        throw new NoSuchElementException("Flow is empty");
    }
}
