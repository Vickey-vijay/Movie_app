package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes5.dex */
public final class Ch extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Gh f22474a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ch(Gh gh2, rj.c cVar) {
        super(1, cVar);
        this.f22474a = gh2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new Ch(this.f22474a, cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return new Ch(this.f22474a, (rj.c) obj).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        this.f22474a.f22746k.getAndIncrement();
        this.f22474a.getClass();
        this.f22474a.a(false);
        return mj.r.f64562a;
    }
}
