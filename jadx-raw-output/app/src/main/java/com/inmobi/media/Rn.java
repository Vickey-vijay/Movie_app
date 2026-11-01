package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class Rn extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Sn f23474b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rn(Sn sn2, rj.c cVar) {
        super(2, cVar);
        this.f23474b = sn2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new Rn(this.f23474b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new Rn(this.f23474b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f23473a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            long jC = this.f23474b.c();
            this.f23473a = 1;
            if (nk.s0.a(jC, this) == objF) {
                return objF;
            }
        }
        ((Runnable) this.f23474b.f23541j.getValue()).run();
        return mj.r.f64562a;
    }
}
