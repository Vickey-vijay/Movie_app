package androidx.lifecycle;

import bk.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.j;
import nk.l0;

/* JADX INFO: compiled from: Lifecycle.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class LifecycleCoroutineScope implements l0 {
    @Override // nk.l0
    public abstract /* synthetic */ kotlin.coroutines.d getCoroutineContext();

    public abstract Lifecycle getLifecycle$lifecycle_common();

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1, reason: invalid class name */
    /* JADX INFO: compiled from: Lifecycle.kt */
    @tj.d(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", f = "Lifecycle.kt", l = {337}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, rj.c<? super r>, Object> {
        public final /* synthetic */ p<l0, rj.c<? super r>, Object> $block;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(p<? super l0, ? super rj.c<? super r>, ? extends Object> pVar, rj.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$block = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<r> create(Object obj, rj.c<?> cVar) {
            return LifecycleCoroutineScope.this.new AnonymousClass1(this.$block, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
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
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle$lifecycle_common();
                p<l0, rj.c<? super r>, Object> pVar = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.whenCreated(lifecycle$lifecycle_common, pVar, this) == objF) {
                    return objF;
                }
            }
            return r.f64562a;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Lifecycle.kt */
    @tj.d(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", f = "Lifecycle.kt", l = {375}, m = "invokeSuspend")
    public static final class C08401 extends SuspendLambda implements p<l0, rj.c<? super r>, Object> {
        public final /* synthetic */ p<l0, rj.c<? super r>, Object> $block;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C08401(p<? super l0, ? super rj.c<? super r>, ? extends Object> pVar, rj.c<? super C08401> cVar) {
            super(2, cVar);
            this.$block = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<r> create(Object obj, rj.c<?> cVar) {
            return LifecycleCoroutineScope.this.new C08401(this.$block, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c<? super r> cVar) {
            return ((C08401) create(l0Var, cVar)).invokeSuspend(r.f64562a);
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
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle$lifecycle_common();
                p<l0, rj.c<? super r>, Object> pVar = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.whenResumed(lifecycle$lifecycle_common, pVar, this) == objF) {
                    return objF;
                }
            }
            return r.f64562a;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Lifecycle.kt */
    @tj.d(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", f = "Lifecycle.kt", l = {356}, m = "invokeSuspend")
    public static final class C08411 extends SuspendLambda implements p<l0, rj.c<? super r>, Object> {
        public final /* synthetic */ p<l0, rj.c<? super r>, Object> $block;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C08411(p<? super l0, ? super rj.c<? super r>, ? extends Object> pVar, rj.c<? super C08411> cVar) {
            super(2, cVar);
            this.$block = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<r> create(Object obj, rj.c<?> cVar) {
            return LifecycleCoroutineScope.this.new C08411(this.$block, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c<? super r> cVar) {
            return ((C08411) create(l0Var, cVar)).invokeSuspend(r.f64562a);
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
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle$lifecycle_common();
                p<l0, rj.c<? super r>, Object> pVar = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.whenStarted(lifecycle$lifecycle_common, pVar, this) == objF) {
                    return objF;
                }
            }
            return r.f64562a;
        }
    }

    public final kotlinx.coroutines.g launchWhenCreated(p<? super l0, ? super rj.c<? super r>, ? extends Object> pVar) {
        ck.p.j(pVar, "block");
        return j.d(this, null, null, new AnonymousClass1(pVar, null), 3, null);
    }

    public final kotlinx.coroutines.g launchWhenResumed(p<? super l0, ? super rj.c<? super r>, ? extends Object> pVar) {
        ck.p.j(pVar, "block");
        return j.d(this, null, null, new C08401(pVar, null), 3, null);
    }

    public final kotlinx.coroutines.g launchWhenStarted(p<? super l0, ? super rj.c<? super r>, ? extends Object> pVar) {
        ck.p.j(pVar, "block");
        return j.d(this, null, null, new C08411(pVar, null), 3, null);
    }
}
