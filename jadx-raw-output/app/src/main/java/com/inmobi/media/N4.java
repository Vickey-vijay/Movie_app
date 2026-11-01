package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class N4 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qk.u f23189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M1 f23190c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N4(qk.u uVar, M1 m10, rj.c cVar) {
        super(2, cVar);
        this.f23189b = uVar;
        this.f23190c = m10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new N4(this.f23189b, this.f23190c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new N4(this.f23189b, this.f23190c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f23188a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            qk.u uVar = this.f23189b;
            M1 m10 = this.f23190c;
            this.f23188a = 1;
            if (uVar.collect(m10, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
