package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3121q2 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC3170s2 f25131b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3121q2(AbstractC3170s2 abstractC3170s2, rj.c cVar) {
        super(2, cVar);
        this.f25131b = abstractC3170s2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3121q2(this.f25131b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3121q2(this.f25131b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25130a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            AbstractC3170s2 abstractC3170s2 = this.f25131b;
            this.f25130a = 1;
            if (AbstractC3170s2.b(abstractC3170s2, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
