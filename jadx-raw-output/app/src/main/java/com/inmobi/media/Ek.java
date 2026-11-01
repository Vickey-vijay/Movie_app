package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes5.dex */
public final class Ek extends SuspendLambda implements bk.l {
    public Ek(rj.c cVar) {
        super(1, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new Ek(cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return new Ek((rj.c) obj).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        Jk.f22963d = null;
        return mj.r.f64562a;
    }
}
