package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class ft2 extends SuspendLambda implements bk.l {
    public ft2(rj.c cVar) {
        super(1, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new ft2(cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) throws Throwable {
        new ft2((rj.c) obj);
        mj.r rVar = mj.r.f64562a;
        sj.a.f();
        kotlin.c.b(rVar);
        return kt2.f79566d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        return kt2.f79566d;
    }
}
