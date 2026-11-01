package com.unity3d.ads.core.extensions;

import bk.a;
import bk.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import mj.r;
import nk.j;
import nk.l0;
import nk.s0;
import pk.n;
import pk.q;
import qk.e;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: FlowExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class FlowExtensionsKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1, reason: invalid class name */
    /* JADX INFO: compiled from: FlowExtensions.kt */
    @d(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1", f = "FlowExtensions.kt", l = {15, 17}, m = "invokeSuspend")
    public static final class AnonymousClass1<T> extends SuspendLambda implements p<n<? super T>, c<? super r>, Object> {
        public final /* synthetic */ boolean $active;
        public final /* synthetic */ p<a<r>, c<? super r>, Object> $block;
        public final /* synthetic */ qk.c<T> $this_timeoutAfter;
        public final /* synthetic */ long $timeoutMillis;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: FlowExtensions.kt */
        public /* synthetic */ class AnonymousClass2 extends AdaptedFunctionReference implements a<r> {
            public AnonymousClass2(Object obj) {
                super(0, obj, n.class, "close", "close(Ljava/lang/Throwable;)Z", 8);
            }

            @Override // bk.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                q.a.a((n) this.receiver, null, 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(long j10, boolean z10, p<? super a<r>, ? super c<? super r>, ? extends Object> pVar, qk.c<? extends T> cVar, c<? super AnonymousClass1> cVar2) {
            super(2, cVar2);
            this.$timeoutMillis = j10;
            this.$active = z10;
            this.$block = pVar;
            this.$this_timeoutAfter = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$timeoutMillis, this.$active, this.$block, this.$this_timeoutAfter, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(n<? super T> nVar, c<? super r> cVar) {
            return ((AnonymousClass1) create(nVar, cVar)).invokeSuspend(r.f64562a);
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: FlowExtensions.kt */
        @d(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1", f = "FlowExtensions.kt", l = {10}, m = "invokeSuspend")
        public static final class C04411 extends SuspendLambda implements p<l0, c<? super r>, Object> {
            public final /* synthetic */ n<T> $$this$channelFlow;
            public final /* synthetic */ qk.c<T> $this_timeoutAfter;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C04411(qk.c<? extends T> cVar, n<? super T> nVar, c<? super C04411> cVar2) {
                super(2, cVar2);
                this.$this_timeoutAfter = cVar;
                this.$$this$channelFlow = nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final c<r> create(Object obj, c<?> cVar) {
                return new C04411(this.$this_timeoutAfter, this.$$this$channelFlow, cVar);
            }

            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
                return ((C04411) create(l0Var, cVar)).invokeSuspend(r.f64562a);
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
                    qk.c<T> cVar = this.$this_timeoutAfter;
                    final n<T> nVar = this.$$this$channelFlow;
                    qk.d<? super T> dVar = new qk.d() { // from class: com.unity3d.ads.core.extensions.FlowExtensionsKt.timeoutAfter.1.1.1
                        @Override // qk.d
                        public final Object emit(T t10, c<? super r> cVar2) {
                            Object objU = nVar.u(t10, cVar2);
                            return objU == sj.a.f() ? objU : r.f64562a;
                        }
                    };
                    this.label = 1;
                    if (cVar.collect(dVar, this) == objF) {
                        return objF;
                    }
                }
                q.a.a(this.$$this$channelFlow, null, 1, null);
                return r.f64562a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            n nVar;
            Object objF = sj.a.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        kotlin.c.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nVar = (n) this.L$0;
                    kotlin.c.b(obj);
                }
                return r.f64562a;
            }
            kotlin.c.b(obj);
            nVar = (n) this.L$0;
            j.d(nVar, null, null, new C04411(this.$this_timeoutAfter, nVar, null), 3, null);
            long j10 = this.$timeoutMillis;
            this.L$0 = nVar;
            this.label = 1;
            if (s0.a(j10, this) == objF) {
                return objF;
            }
            if (this.$active) {
                p<a<r>, c<? super r>, Object> pVar = this.$block;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(nVar);
                this.L$0 = null;
                this.label = 2;
                if (pVar.mo1invoke(anonymousClass2, this) == objF) {
                    return objF;
                }
            }
            return r.f64562a;
        }
    }

    public static final <T> qk.c<T> timeoutAfter(qk.c<? extends T> cVar, long j10, boolean z10, p<? super a<r>, ? super c<? super r>, ? extends Object> pVar) {
        ck.p.j(cVar, "<this>");
        ck.p.j(pVar, "block");
        return e.h(new AnonymousClass1(j10, z10, pVar, cVar, null));
    }

    public static /* synthetic */ qk.c timeoutAfter$default(qk.c cVar, long j10, boolean z10, p pVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return timeoutAfter(cVar, j10, z10, pVar);
    }
}
