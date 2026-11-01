package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes5.dex */
public final class H7 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f22787a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H7(rj.c cVar, N7 n10) {
        super(2, cVar);
        this.f22787a = n10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new H7(cVar, this.f22787a);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new H7((rj.c) obj2, this.f22787a).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        this.f22787a.f23211p.stop();
        this.f22787a.f23211p.clearMediaItems();
        this.f22787a.f23211p.release();
        this.f22787a.f23221z.a();
        this.f22787a.f23220y.f23492d.c();
        return mj.r.f64562a;
    }
}
