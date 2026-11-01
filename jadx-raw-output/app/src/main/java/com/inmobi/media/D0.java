package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class D0 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f22487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bk.a f22488c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(long j10, bk.a aVar, rj.c cVar) {
        super(2, cVar);
        this.f22487b = j10;
        this.f22488c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new D0(this.f22487b, this.f22488c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new D0(this.f22487b, this.f22488c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f22486a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            long j10 = this.f22487b;
            this.f22486a = 1;
            if (nk.s0.a(j10, this) == objF) {
                return objF;
            }
        }
        this.f22488c.invoke();
        return mj.r.f64562a;
    }
}
