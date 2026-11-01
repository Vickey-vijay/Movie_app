package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class Ye extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2782cf f23848b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ye(C2782cf c2782cf, rj.c cVar) {
        super(2, cVar);
        this.f23848b = c2782cf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new Ye(this.f23848b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new Ye(this.f23848b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f23847a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            C2782cf c2782cf = this.f23848b;
            this.f23847a = 1;
            if (c2782cf.c(this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
