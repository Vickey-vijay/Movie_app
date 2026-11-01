package androidx.lifecycle;

import bk.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.l0;
import nk.w0;

/* JADX INFO: compiled from: PausingDispatcher.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class PausingDispatcherKt {
    public static final <T> Object whenCreated(LifecycleOwner lifecycleOwner, p<? super l0, ? super rj.c<? super T>, ? extends Object> pVar, rj.c<? super T> cVar) {
        return whenCreated(lifecycleOwner.getLifecycle(), pVar, cVar);
    }

    public static final <T> Object whenResumed(LifecycleOwner lifecycleOwner, p<? super l0, ? super rj.c<? super T>, ? extends Object> pVar, rj.c<? super T> cVar) {
        return whenResumed(lifecycleOwner.getLifecycle(), pVar, cVar);
    }

    public static final <T> Object whenStarted(LifecycleOwner lifecycleOwner, p<? super l0, ? super rj.c<? super T>, ? extends Object> pVar, rj.c<? super T> cVar) {
        return whenStarted(lifecycleOwner.getLifecycle(), pVar, cVar);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2, reason: invalid class name */
    /* JADX INFO: compiled from: PausingDispatcher.kt */
    @tj.d(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", l = {203}, m = "invokeSuspend")
    public static final class AnonymousClass2<T> extends SuspendLambda implements p<l0, rj.c<? super T>, Object> {
        public final /* synthetic */ p<l0, rj.c<? super T>, Object> $block;
        public final /* synthetic */ Lifecycle.State $minState;
        public final /* synthetic */ Lifecycle $this_whenStateAtLeast;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Lifecycle lifecycle, Lifecycle.State state, p<? super l0, ? super rj.c<? super T>, ? extends Object> pVar, rj.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$this_whenStateAtLeast = lifecycle;
            this.$minState = state;
            this.$block = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<r> create(Object obj, rj.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_whenStateAtLeast, this.$minState, this.$block, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c<? super T> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            LifecycleController lifecycleController;
            Object objF = sj.a.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    lifecycleController = (LifecycleController) this.L$0;
                    try {
                        kotlin.c.b(obj);
                        lifecycleController.finish();
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        lifecycleController.finish();
                        throw th;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            kotlinx.coroutines.g gVar = (kotlinx.coroutines.g) ((l0) this.L$0).getCoroutineContext().get(kotlinx.coroutines.g.E8);
            if (gVar != null) {
                PausingDispatcher pausingDispatcher = new PausingDispatcher();
                LifecycleController lifecycleController2 = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, pausingDispatcher.dispatchQueue, gVar);
                try {
                    p<l0, rj.c<? super T>, Object> pVar = this.$block;
                    this.L$0 = lifecycleController2;
                    this.label = 1;
                    obj = nk.h.g(pausingDispatcher, pVar, this);
                    if (obj == objF) {
                        return objF;
                    }
                    lifecycleController = lifecycleController2;
                    lifecycleController.finish();
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    lifecycleController = lifecycleController2;
                    lifecycleController.finish();
                    throw th;
                }
            }
            throw new IllegalStateException("when[State] methods should have a parent job".toString());
        }
    }

    public static final <T> Object whenCreated(Lifecycle lifecycle, p<? super l0, ? super rj.c<? super T>, ? extends Object> pVar, rj.c<? super T> cVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.CREATED, pVar, cVar);
    }

    public static final <T> Object whenResumed(Lifecycle lifecycle, p<? super l0, ? super rj.c<? super T>, ? extends Object> pVar, rj.c<? super T> cVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.RESUMED, pVar, cVar);
    }

    public static final <T> Object whenStarted(Lifecycle lifecycle, p<? super l0, ? super rj.c<? super T>, ? extends Object> pVar, rj.c<? super T> cVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.STARTED, pVar, cVar);
    }

    public static final <T> Object whenStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, p<? super l0, ? super rj.c<? super T>, ? extends Object> pVar, rj.c<? super T> cVar) {
        return nk.h.g(w0.c().n(), new AnonymousClass2(lifecycle, state, pVar, null), cVar);
    }
}
