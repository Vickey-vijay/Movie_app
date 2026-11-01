package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C3068o extends SuspendLambda implements bk.l {
    public C3068o(rj.c cVar) {
        super(1, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new C3068o(cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return new C3068o((rj.c) obj).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        if (C3118q.f25120d.get() && C3118q.b()) {
            C3118q.a(tj.a.c(0.0f));
        }
        return mj.r.f64562a;
    }
}
