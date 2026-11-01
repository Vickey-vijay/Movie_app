package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes5.dex */
public final class Gk extends SuspendLambda implements bk.l {
    public Gk(rj.c cVar) {
        super(1, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new Gk(cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return new Gk((rj.c) obj).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        nk.p0 p0Var;
        sj.a.f();
        kotlin.c.b(obj);
        if (Jk.f22961b.f25187b.get() != null && (p0Var = Jk.f22963d) != null) {
            kotlinx.coroutines.g.a.a(p0Var, null, 1, null);
        }
        return mj.r.f64562a;
    }
}
