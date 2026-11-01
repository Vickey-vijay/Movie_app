package com.inmobi.media;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class S extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f23475a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(U u10, rj.c cVar) {
        super(1, cVar);
        this.f23475a = u10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new S(this.f23475a, cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return new S(this.f23475a, (rj.c) obj).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        Object objA = H3.a(new Q(this.f23475a));
        U u10 = this.f23475a;
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objA);
        if (thM3461exceptionOrNullimpl != null) {
            u10.a(thM3461exceptionOrNullimpl);
        }
        return mj.r.f64562a;
    }
}
