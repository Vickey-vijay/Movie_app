package androidx.lifecycle;

import bk.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.l0;
import pk.n;
import pk.q;

/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class FlowExtKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1, reason: invalid class name */
    /* JADX INFO: compiled from: FlowExt.kt */
    @tj.d(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", l = {91}, m = "invokeSuspend")
    public static final class AnonymousClass1<T> extends SuspendLambda implements p<n<? super T>, rj.c<? super r>, Object> {
        public final /* synthetic */ Lifecycle $lifecycle;
        public final /* synthetic */ Lifecycle.State $minActiveState;
        public final /* synthetic */ qk.c<T> $this_flowWithLifecycle;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, qk.c<? extends T> cVar, rj.c<? super AnonymousClass1> cVar2) {
            super(2, cVar2);
            this.$lifecycle = lifecycle;
            this.$minActiveState = state;
            this.$this_flowWithLifecycle = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<r> create(Object obj, rj.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(n<? super T> nVar, rj.c<? super r> cVar) {
            return ((AnonymousClass1) create(nVar, cVar)).invokeSuspend(r.f64562a);
        }

        /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: FlowExt.kt */
        @tj.d(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", l = {92}, m = "invokeSuspend")
        public static final class C00061 extends SuspendLambda implements p<l0, rj.c<? super r>, Object> {
            public final /* synthetic */ n<T> $$this$callbackFlow;
            public final /* synthetic */ qk.c<T> $this_flowWithLifecycle;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C00061(qk.c<? extends T> cVar, n<? super T> nVar, rj.c<? super C00061> cVar2) {
                super(2, cVar2);
                this.$this_flowWithLifecycle = cVar;
                this.$$this$callbackFlow = nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final rj.c<r> create(Object obj, rj.c<?> cVar) {
                return new C00061(this.$this_flowWithLifecycle, this.$$this$callbackFlow, cVar);
            }

            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo1invoke(l0 l0Var, rj.c<? super r> cVar) {
                return ((C00061) create(l0Var, cVar)).invokeSuspend(r.f64562a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = sj.a.f();
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 == 1) {
                        kotlin.c.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    kotlin.c.b(obj);
                    qk.c<T> cVar = this.$this_flowWithLifecycle;
                    final n<T> nVar = this.$$this$callbackFlow;
                    qk.d<? super T> dVar = new qk.d() { // from class: androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1
                        @Override // qk.d
                        public final Object emit(T t10, rj.c<? super r> cVar2) {
                            Object objU = nVar.u(t10, cVar2);
                            return objU == sj.a.f() ? objU : r.f64562a;
                        }
                    };
                    this.label = 1;
                    if (cVar.collect(dVar, this) == objF) {
                        return objF;
                    }
                }
                return r.f64562a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            n nVar;
            Object objF = sj.a.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    nVar = (n) this.L$0;
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                n nVar2 = (n) this.L$0;
                Lifecycle lifecycle = this.$lifecycle;
                Lifecycle.State state = this.$minActiveState;
                C00061 c00061 = new C00061(this.$this_flowWithLifecycle, nVar2, null);
                this.L$0 = nVar2;
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c00061, this) == objF) {
                    return objF;
                }
                nVar = nVar2;
            }
            q.a.a(nVar, null, 1, null);
            return r.f64562a;
        }
    }

    public static final <T> qk.c<T> flowWithLifecycle(qk.c<? extends T> cVar, Lifecycle lifecycle, Lifecycle.State state) {
        ck.p.j(cVar, "<this>");
        ck.p.j(lifecycle, "lifecycle");
        ck.p.j(state, "minActiveState");
        return qk.e.e(new AnonymousClass1(lifecycle, state, cVar, null));
    }

    public static /* synthetic */ qk.c flowWithLifecycle$default(qk.c cVar, Lifecycle lifecycle, Lifecycle.State state, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return flowWithLifecycle(cVar, lifecycle, state);
    }
}
