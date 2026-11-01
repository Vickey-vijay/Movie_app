package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class Xe extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2782cf f23797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rf f23798c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xe(C2782cf c2782cf, Rf rf2, rj.c cVar) {
        super(2, cVar);
        this.f23797b = c2782cf;
        this.f23798c = rf2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new Xe(this.f23797b, this.f23798c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new Xe(this.f23797b, this.f23798c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f23796a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            C2782cf c2782cf = this.f23797b;
            Rf rf2 = this.f23798c;
            We we2 = new We(c2782cf, null);
            this.f23796a = 1;
            if (c2782cf.a(rf2, we2, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
