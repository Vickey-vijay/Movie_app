package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class Ia extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ La f22855b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ia(La la2, rj.c cVar) {
        super(1, cVar);
        this.f22855b = la2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new Ia(this.f22855b, cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return new Ia(this.f22855b, (rj.c) obj).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f22854a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            La la2 = this.f22855b;
            la2.getClass();
            la2.f23068b = new C3000l6("crash", (N9) P9.f23321a.getValue(), la2, la2.f23067a.getEventConfig(), null);
            La la3 = this.f22855b;
            this.f22854a = 1;
            if (La.a(la3, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
