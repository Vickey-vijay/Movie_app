package androidx.lifecycle;

import bk.l;
import ck.n;
import ck.p;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.Lambda;
import mj.r;
import nk.h0;
import nk.w0;
import nk.y1;

/* JADX INFO: compiled from: WithLifecycleState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class WithLifecycleStateKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2, reason: invalid class name */
    /* JADX INFO: compiled from: WithLifecycleState.kt */
    public static final class AnonymousClass2<R> extends Lambda implements bk.a<R> {
        public final /* synthetic */ bk.a<R> $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(bk.a<? extends R> aVar) {
            super(0);
            this.$block = aVar;
        }

        @Override // bk.a
        public final R invoke() {
            return this.$block.invoke();
        }
    }

    public static final <R> Object withCreated(Lifecycle lifecycle, bk.a<? extends R> aVar, rj.c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        y1 y1VarN = w0.c().n();
        boolean zIsDispatchNeeded = y1VarN.isDispatchNeeded(cVar.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, y1VarN, new AnonymousClass2(aVar), cVar);
    }

    private static final <R> Object withCreated$$forInline(Lifecycle lifecycle, bk.a<? extends R> aVar, rj.c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        w0.c().n();
        n.c(3);
        throw null;
    }

    public static final <R> Object withResumed(Lifecycle lifecycle, bk.a<? extends R> aVar, rj.c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        y1 y1VarN = w0.c().n();
        boolean zIsDispatchNeeded = y1VarN.isDispatchNeeded(cVar.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, y1VarN, new AnonymousClass2(aVar), cVar);
    }

    private static final <R> Object withResumed$$forInline(Lifecycle lifecycle, bk.a<? extends R> aVar, rj.c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        w0.c().n();
        n.c(3);
        throw null;
    }

    public static final <R> Object withStarted(Lifecycle lifecycle, bk.a<? extends R> aVar, rj.c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        y1 y1VarN = w0.c().n();
        boolean zIsDispatchNeeded = y1VarN.isDispatchNeeded(cVar.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, y1VarN, new AnonymousClass2(aVar), cVar);
    }

    private static final <R> Object withStarted$$forInline(Lifecycle lifecycle, bk.a<? extends R> aVar, rj.c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        w0.c().n();
        n.c(3);
        throw null;
    }

    public static final <R> Object withStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, bk.a<? extends R> aVar, rj.c<? super R> cVar) {
        if (!(state.compareTo(Lifecycle.State.CREATED) >= 0)) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
        }
        y1 y1VarN = w0.c().n();
        boolean zIsDispatchNeeded = y1VarN.isDispatchNeeded(cVar.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, y1VarN, new AnonymousClass2(aVar), cVar);
    }

    private static final <R> Object withStateAtLeast$$forInline(Lifecycle lifecycle, Lifecycle.State state, bk.a<? extends R> aVar, rj.c<? super R> cVar) {
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            w0.c().n();
            n.c(3);
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.LifecycleObserver, androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1] */
    public static final <R> Object suspendWithStateAtLeastUnchecked(final Lifecycle lifecycle, final Lifecycle.State state, boolean z10, final h0 h0Var, final bk.a<? extends R> aVar, rj.c<? super R> cVar) {
        final kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        cVar2.J();
        final ?? r10 = new LifecycleEventObserver() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Object objM3458constructorimpl;
                p.j(lifecycleOwner, "source");
                p.j(event, "event");
                if (event == Lifecycle.Event.Companion.upTo(state)) {
                    lifecycle.removeObserver(this);
                    rj.c cVar3 = cVar2;
                    bk.a<R> aVar2 = aVar;
                    try {
                        Result.a aVar3 = Result.Companion;
                        objM3458constructorimpl = Result.m3458constructorimpl(aVar2.invoke());
                    } catch (Throwable th2) {
                        Result.a aVar4 = Result.Companion;
                        objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
                    }
                    cVar3.resumeWith(objM3458constructorimpl);
                    return;
                }
                if (event == Lifecycle.Event.ON_DESTROY) {
                    lifecycle.removeObserver(this);
                    rj.c cVar4 = cVar2;
                    Result.a aVar5 = Result.Companion;
                    cVar4.resumeWith(Result.m3458constructorimpl(kotlin.c.a(new LifecycleDestroyedException())));
                }
            }
        };
        if (z10) {
            h0Var.dispatch(EmptyCoroutineContext.INSTANCE, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1
                @Override // java.lang.Runnable
                public final void run() {
                    lifecycle.addObserver(r10);
                }
            });
        } else {
            lifecycle.addObserver(r10);
        }
        cVar2.p(new l<Throwable, r>() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Throwable th2) {
                invoke2(th2);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                h0 h0Var2 = h0Var;
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                if (!h0Var2.isDispatchNeeded(emptyCoroutineContext)) {
                    lifecycle.removeObserver(r10);
                    return;
                }
                h0 h0Var3 = h0Var;
                final Lifecycle lifecycle2 = lifecycle;
                final WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = r10;
                h0Var3.dispatch(emptyCoroutineContext, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        lifecycle2.removeObserver(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1);
                    }
                });
            }
        });
        Object objB = cVar2.B();
        if (objB == sj.a.f()) {
            tj.f.c(cVar);
        }
        return objB;
    }

    public static final <R> Object withStateAtLeastUnchecked(Lifecycle lifecycle, Lifecycle.State state, bk.a<? extends R> aVar, rj.c<? super R> cVar) {
        y1 y1VarN = w0.c().n();
        boolean zIsDispatchNeeded = y1VarN.isDispatchNeeded(cVar.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return aVar.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, y1VarN, new AnonymousClass2(aVar), cVar);
    }

    private static final <R> Object withStateAtLeastUnchecked$$forInline(Lifecycle lifecycle, Lifecycle.State state, bk.a<? extends R> aVar, rj.c<? super R> cVar) {
        w0.c().n();
        n.c(3);
        throw null;
    }

    private static final <R> Object withCreated$$forInline(LifecycleOwner lifecycleOwner, bk.a<? extends R> aVar, rj.c<? super R> cVar) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        w0.c().n();
        n.c(3);
        throw null;
    }

    private static final <R> Object withResumed$$forInline(LifecycleOwner lifecycleOwner, bk.a<? extends R> aVar, rj.c<? super R> cVar) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        w0.c().n();
        n.c(3);
        throw null;
    }

    private static final <R> Object withStarted$$forInline(LifecycleOwner lifecycleOwner, bk.a<? extends R> aVar, rj.c<? super R> cVar) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        w0.c().n();
        n.c(3);
        throw null;
    }

    private static final <R> Object withStateAtLeast$$forInline(LifecycleOwner lifecycleOwner, Lifecycle.State state, bk.a<? extends R> aVar, rj.c<? super R> cVar) {
        lifecycleOwner.getLifecycle();
        if (!(state.compareTo(Lifecycle.State.CREATED) >= 0)) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
        }
        w0.c().n();
        n.c(3);
        throw null;
    }

    public static final <R> Object withCreated(LifecycleOwner lifecycleOwner, bk.a<? extends R> aVar, rj.c<? super R> cVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.CREATED;
        y1 y1VarN = w0.c().n();
        boolean zIsDispatchNeeded = y1VarN.isDispatchNeeded(cVar.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return aVar.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, y1VarN, new AnonymousClass2(aVar), cVar);
    }

    public static final <R> Object withResumed(LifecycleOwner lifecycleOwner, bk.a<? extends R> aVar, rj.c<? super R> cVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        y1 y1VarN = w0.c().n();
        boolean zIsDispatchNeeded = y1VarN.isDispatchNeeded(cVar.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return aVar.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, y1VarN, new AnonymousClass2(aVar), cVar);
    }

    public static final <R> Object withStarted(LifecycleOwner lifecycleOwner, bk.a<? extends R> aVar, rj.c<? super R> cVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        y1 y1VarN = w0.c().n();
        boolean zIsDispatchNeeded = y1VarN.isDispatchNeeded(cVar.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return aVar.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, y1VarN, new AnonymousClass2(aVar), cVar);
    }

    public static final <R> Object withStateAtLeast(LifecycleOwner lifecycleOwner, Lifecycle.State state, bk.a<? extends R> aVar, rj.c<? super R> cVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            y1 y1VarN = w0.c().n();
            boolean zIsDispatchNeeded = y1VarN.isDispatchNeeded(cVar.getContext());
            if (!zIsDispatchNeeded) {
                if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                    if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                        return aVar.invoke();
                    }
                } else {
                    throw new LifecycleDestroyedException();
                }
            }
            return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, y1VarN, new AnonymousClass2(aVar), cVar);
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }
}
