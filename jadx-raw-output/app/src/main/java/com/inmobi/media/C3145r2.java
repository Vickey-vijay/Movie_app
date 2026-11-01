package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3145r2 extends SuspendLambda implements bk.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC3170s2 f25228b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3145r2(AbstractC3170s2 abstractC3170s2, rj.c cVar) {
        super(3, cVar);
        this.f25228b = abstractC3170s2;
    }

    @Override // bk.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new C3145r2(this.f25228b, (rj.c) obj3).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25227a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            AbstractC3170s2 abstractC3170s2 = this.f25228b;
            this.f25227a = 1;
            if (AbstractC3170s2.a(abstractC3170s2, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
