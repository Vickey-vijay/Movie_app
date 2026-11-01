package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes5.dex */
public final class Dh extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Gh f22533a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dh(Gh gh2, rj.c cVar) {
        super(1, cVar);
        this.f22533a = gh2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new Dh(this.f22533a, cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return new Dh(this.f22533a, (rj.c) obj).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        this.f22533a.a(true);
        return mj.r.f64562a;
    }
}
