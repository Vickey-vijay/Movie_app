package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class Ik extends SuspendLambda implements bk.l {
    public Ik(rj.c cVar) {
        super(1, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new Ik(cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return new Ik((rj.c) obj).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        nk.p0 p0Var = Jk.f22963d;
        if (p0Var != null) {
            kotlinx.coroutines.g.a.a(p0Var, null, 1, null);
        }
        Jk.f22963d = null;
        Jk.f22962c.clear();
        return mj.r.f64562a;
    }
}
