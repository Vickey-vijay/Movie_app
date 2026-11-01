package com.unity3d.ads.core.utils;

import bk.a;
import bk.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.g;
import mj.r;
import nk.h0;
import nk.j;
import nk.j2;
import nk.l0;
import nk.s0;
import nk.x;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: CommonCoroutineTimer.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class CommonCoroutineTimer implements CoroutineTimer {
    private final h0 dispatcher;
    private final x job;
    private final l0 scope;

    /* JADX INFO: renamed from: com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommonCoroutineTimer.kt */
    @d(c = "com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1", f = "CommonCoroutineTimer.kt", l = {21, 24}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ a<r> $action;
        public final /* synthetic */ long $delayStartMillis;
        public final /* synthetic */ long $repeatMillis;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j10, a<r> aVar, long j11, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$delayStartMillis = j10;
            this.$action = aVar;
            this.$repeatMillis = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$delayStartMillis, this.$action, this.$repeatMillis, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            l0 l0Var;
            Object objF = sj.a.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2) {
                    l0Var = (l0) this.L$0;
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                l0Var = (l0) this.L$0;
                long j10 = this.$delayStartMillis;
                this.L$0 = l0Var;
                this.label = 1;
                if (s0.a(j10, this) == objF) {
                    return objF;
                }
            }
            while (kotlinx.coroutines.d.g(l0Var)) {
                this.$action.invoke();
                long j11 = this.$repeatMillis;
                this.L$0 = l0Var;
                this.label = 2;
                if (s0.a(j11, this) == objF) {
                    return objF;
                }
            }
            return r.f64562a;
        }
    }

    public CommonCoroutineTimer(h0 h0Var) {
        ck.p.j(h0Var, "dispatcher");
        this.dispatcher = h0Var;
        x xVarB = j2.b(null, 1, null);
        this.job = xVarB;
        this.scope = kotlinx.coroutines.d.a(h0Var.plus(xVarB));
    }

    @Override // com.unity3d.ads.core.utils.CoroutineTimer
    public g start(long j10, long j11, a<r> aVar) {
        ck.p.j(aVar, "action");
        return j.d(this.scope, this.dispatcher, null, new AnonymousClass1(j10, aVar, j11, null), 2, null);
    }
}
