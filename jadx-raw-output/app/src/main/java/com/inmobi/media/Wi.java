package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class Wi extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23752a;

    public Wi(rj.c cVar) {
        super(1, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new Wi(cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return new Wi((rj.c) obj).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f23752a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            ck.p.i(Yi.f23857b, "access$getTAG$p(...)");
            Qi qi2 = Qi.f23392a;
            boolean zIsSessionEnabled = Yi.a().isSessionEnabled();
            qi2.getClass();
            Qi.f23396e = zIsSessionEnabled;
            if (!zIsSessionEnabled) {
                Qi.f23395d = null;
            }
            Qi.c();
            if (Ji.b() == null || Yi.a().isLocationEnabled()) {
                C3030mb c3030mb = C3030mb.f24820a;
                this.f23752a = 1;
                if (c3030mb.a(this) == objF) {
                    return objF;
                }
            }
        }
        return mj.r.f64562a;
    }
}
