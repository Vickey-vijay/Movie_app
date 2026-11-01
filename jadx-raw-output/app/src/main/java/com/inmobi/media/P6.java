package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class P6 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R6 f23314b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P6(R6 r10, rj.c cVar) {
        super(2, cVar);
        this.f23314b = r10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new P6(this.f23314b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new P6(this.f23314b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f23313a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        Z z10 = this.f23314b.f23439n;
        this.f23313a = 1;
        Object objA = z10.a(this);
        if (objA == objF) {
            return objF;
        }
        return objA;
    }
}
