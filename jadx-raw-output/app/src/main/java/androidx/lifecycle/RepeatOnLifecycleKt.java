package androidx.lifecycle;

import bk.p;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import mj.r;
import nk.j;
import nk.l;
import nk.l0;
import nk.w0;
import nk.y1;

/* JADX INFO: compiled from: RepeatOnLifecycle.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class RepeatOnLifecycleKt {
    public static final Object repeatOnLifecycle(Lifecycle lifecycle, Lifecycle.State state, p<? super l0, ? super rj.c<? super r>, ? extends Object> pVar, rj.c<? super r> cVar) {
        if (!(state != Lifecycle.State.INITIALIZED)) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
        }
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return r.f64562a;
        }
        Object objE = kotlinx.coroutines.d.e(new AnonymousClass3(lifecycle, state, pVar, null), cVar);
        return objE == sj.a.f() ? objE : r.f64562a;
    }

    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3, reason: invalid class name */
    /* JADX INFO: compiled from: RepeatOnLifecycle.kt */
    @tj.d(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {84}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements p<l0, rj.c<? super r>, Object> {
        public final /* synthetic */ p<l0, rj.c<? super r>, Object> $block;
        public final /* synthetic */ Lifecycle.State $state;
        public final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: RepeatOnLifecycle.kt */
        @tj.d(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {166}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements p<l0, rj.c<? super r>, Object> {
            public final /* synthetic */ l0 $$this$coroutineScope;
            public final /* synthetic */ p<l0, rj.c<? super r>, Object> $block;
            public final /* synthetic */ Lifecycle.State $state;
            public final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
            public Object L$0;
            public Object L$1;
            public Object L$2;
            public Object L$3;
            public Object L$4;
            public Object L$5;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, l0 l0Var, p<? super l0, ? super rj.c<? super r>, ? extends Object> pVar, rj.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.$this_repeatOnLifecycle = lifecycle;
                this.$state = state;
                this.$$this$coroutineScope = l0Var;
                this.$block = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final rj.c<r> create(Object obj, rj.c<?> cVar) {
                return new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, cVar);
            }

            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo1invoke(l0 l0Var, rj.c<? super r> cVar) {
                return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
            }

            /* JADX WARN: Code duplicated, block: B:25:0x00b2  */
            /* JADX WARN: Code duplicated, block: B:28:0x00bc  */
            /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
            /* JADX WARN: Code duplicated, block: B:38:0x00d7  */
            /* JADX WARN: Type inference failed for: r10v0, types: [T, androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, java.lang.Object] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Ref$ObjectRef ref$ObjectRef;
                Ref$ObjectRef ref$ObjectRef2;
                kotlinx.coroutines.g gVar;
                LifecycleEventObserver lifecycleEventObserver;
                kotlinx.coroutines.g gVar2;
                LifecycleEventObserver lifecycleEventObserver2;
                Object objF = sj.a.f();
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef2 = (Ref$ObjectRef) this.L$1;
                    ref$ObjectRef = (Ref$ObjectRef) this.L$0;
                    try {
                        kotlin.c.b(obj);
                        gVar2 = (kotlinx.coroutines.g) ref$ObjectRef.element;
                        if (gVar2 != null) {
                            kotlinx.coroutines.g.a.a(gVar2, null, 1, null);
                        }
                        lifecycleEventObserver2 = (LifecycleEventObserver) ref$ObjectRef2.element;
                        if (lifecycleEventObserver2 != null) {
                            this.$this_repeatOnLifecycle.removeObserver(lifecycleEventObserver2);
                        }
                        return r.f64562a;
                    } catch (Throwable th2) {
                        th = th2;
                        gVar = (kotlinx.coroutines.g) ref$ObjectRef.element;
                        if (gVar != null) {
                            kotlinx.coroutines.g.a.a(gVar, null, 1, null);
                        }
                        lifecycleEventObserver = (LifecycleEventObserver) ref$ObjectRef2.element;
                        if (lifecycleEventObserver != null) {
                            this.$this_repeatOnLifecycle.removeObserver(lifecycleEventObserver);
                        }
                        throw th;
                    }
                }
                kotlin.c.b(obj);
                if (this.$this_repeatOnLifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                    return r.f64562a;
                }
                final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
                try {
                    Lifecycle.State state = this.$state;
                    Lifecycle lifecycle = this.$this_repeatOnLifecycle;
                    final l0 l0Var = this.$$this$coroutineScope;
                    final p<l0, rj.c<? super r>, Object> pVar = this.$block;
                    this.L$0 = ref$ObjectRef3;
                    this.L$1 = ref$ObjectRef4;
                    this.L$2 = state;
                    this.L$3 = lifecycle;
                    this.L$4 = l0Var;
                    this.L$5 = pVar;
                    this.label = 1;
                    final kotlinx.coroutines.c cVar = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(this), 1);
                    cVar.J();
                    Lifecycle.Event.Companion companion = Lifecycle.Event.Companion;
                    final Lifecycle.Event eventUpTo = companion.upTo(state);
                    final Lifecycle.Event eventDownFrom = companion.downFrom(state);
                    final wk.a aVarB = wk.g.b(false, 1, null);
                    ?? r10 = new LifecycleEventObserver() { // from class: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1

                        /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1, reason: invalid class name */
                        /* JADX INFO: compiled from: RepeatOnLifecycle.kt */
                        @tj.d(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {171, 110}, m = "invokeSuspend")
                        public static final class AnonymousClass1 extends SuspendLambda implements p<l0, rj.c<? super r>, Object> {
                            public final /* synthetic */ p<l0, rj.c<? super r>, Object> $block;
                            public final /* synthetic */ wk.a $mutex;
                            public Object L$0;
                            public Object L$1;
                            public int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public AnonymousClass1(wk.a aVar, p<? super l0, ? super rj.c<? super r>, ? extends Object> pVar, rj.c<? super AnonymousClass1> cVar) {
                                super(2, cVar);
                                this.$mutex = aVar;
                                this.$block = pVar;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final rj.c<r> create(Object obj, rj.c<?> cVar) {
                                return new AnonymousClass1(this.$mutex, this.$block, cVar);
                            }

                            @Override // bk.p
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                            public final Object mo1invoke(l0 l0Var, rj.c<? super r> cVar) {
                                return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) throws Throwable {
                                wk.a aVar;
                                p<l0, rj.c<? super r>, Object> pVar;
                                wk.a aVar2;
                                Throwable th2;
                                Object objF = sj.a.f();
                                int i10 = this.label;
                                try {
                                    if (i10 != 0) {
                                        if (i10 != 1) {
                                            if (i10 == 2) {
                                                aVar2 = (wk.a) this.L$0;
                                                try {
                                                    kotlin.c.b(obj);
                                                    r rVar = r.f64562a;
                                                    aVar2.b(null);
                                                    return r.f64562a;
                                                } catch (Throwable th3) {
                                                    th2 = th3;
                                                    aVar2.b(null);
                                                    throw th2;
                                                }
                                            }
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        pVar = (p) this.L$1;
                                        wk.a aVar3 = (wk.a) this.L$0;
                                        kotlin.c.b(obj);
                                        aVar = aVar3;
                                    } else {
                                        kotlin.c.b(obj);
                                        aVar = this.$mutex;
                                        pVar = this.$block;
                                        this.L$0 = aVar;
                                        this.L$1 = pVar;
                                        this.label = 1;
                                        if (aVar.a(null, this) == objF) {
                                            return objF;
                                        }
                                    }
                                    RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(pVar, null);
                                    this.L$0 = aVar;
                                    this.L$1 = null;
                                    this.label = 2;
                                    if (kotlinx.coroutines.d.e(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) == objF) {
                                        return objF;
                                    }
                                    aVar2 = aVar;
                                    r rVar2 = r.f64562a;
                                    aVar2.b(null);
                                    return r.f64562a;
                                } catch (Throwable th4) {
                                    aVar2 = aVar;
                                    th2 = th4;
                                    aVar2.b(null);
                                    throw th2;
                                }
                            }
                        }

                        /* JADX WARN: Type inference failed for: r9v5, types: [T, kotlinx.coroutines.g] */
                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                            ck.p.j(lifecycleOwner, "<anonymous parameter 0>");
                            ck.p.j(event, "event");
                            if (event == eventUpTo) {
                                ref$ObjectRef3.element = j.d(l0Var, null, null, new AnonymousClass1(aVarB, pVar, null), 3, null);
                                return;
                            }
                            if (event == eventDownFrom) {
                                kotlinx.coroutines.g gVar3 = ref$ObjectRef3.element;
                                if (gVar3 != null) {
                                    kotlinx.coroutines.g.a.a(gVar3, null, 1, null);
                                }
                                ref$ObjectRef3.element = null;
                            }
                            if (event == Lifecycle.Event.ON_DESTROY) {
                                l<r> lVar = cVar;
                                Result.a aVar = Result.Companion;
                                lVar.resumeWith(Result.m3458constructorimpl(r.f64562a));
                            }
                        }
                    };
                    ref$ObjectRef4.element = r10;
                    ck.p.h(r10, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
                    lifecycle.addObserver((LifecycleEventObserver) r10);
                    Object objB = cVar.B();
                    if (objB == sj.a.f()) {
                        tj.f.c(this);
                    }
                    if (objB == objF) {
                        return objF;
                    }
                    ref$ObjectRef = ref$ObjectRef3;
                    ref$ObjectRef2 = ref$ObjectRef4;
                    gVar2 = (kotlinx.coroutines.g) ref$ObjectRef.element;
                    if (gVar2 != null) {
                        kotlinx.coroutines.g.a.a(gVar2, null, 1, null);
                    }
                    lifecycleEventObserver2 = (LifecycleEventObserver) ref$ObjectRef2.element;
                    if (lifecycleEventObserver2 != null) {
                        this.$this_repeatOnLifecycle.removeObserver(lifecycleEventObserver2);
                    }
                    return r.f64562a;
                } catch (Throwable th3) {
                    th = th3;
                    ref$ObjectRef = ref$ObjectRef3;
                    ref$ObjectRef2 = ref$ObjectRef4;
                    gVar = (kotlinx.coroutines.g) ref$ObjectRef.element;
                    if (gVar != null) {
                        kotlinx.coroutines.g.a.a(gVar, null, 1, null);
                    }
                    lifecycleEventObserver = (LifecycleEventObserver) ref$ObjectRef2.element;
                    if (lifecycleEventObserver != null) {
                        this.$this_repeatOnLifecycle.removeObserver(lifecycleEventObserver);
                    }
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Lifecycle lifecycle, Lifecycle.State state, p<? super l0, ? super rj.c<? super r>, ? extends Object> pVar, rj.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$this_repeatOnLifecycle = lifecycle;
            this.$state = state;
            this.$block = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<r> create(Object obj, rj.c<?> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$this_repeatOnLifecycle, this.$state, this.$block, cVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c<? super r> cVar) {
            return ((AnonymousClass3) create(l0Var, cVar)).invokeSuspend(r.f64562a);
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
                l0 l0Var = (l0) this.L$0;
                y1 y1VarN = w0.c().n();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, l0Var, this.$block, null);
                this.label = 1;
                if (nk.h.g(y1VarN, anonymousClass1, this) == objF) {
                    return objF;
                }
            }
            return r.f64562a;
        }
    }

    public static final Object repeatOnLifecycle(LifecycleOwner lifecycleOwner, Lifecycle.State state, p<? super l0, ? super rj.c<? super r>, ? extends Object> pVar, rj.c<? super r> cVar) {
        Object objRepeatOnLifecycle = repeatOnLifecycle(lifecycleOwner.getLifecycle(), state, pVar, cVar);
        return objRepeatOnLifecycle == sj.a.f() ? objRepeatOnLifecycle : r.f64562a;
    }
}
