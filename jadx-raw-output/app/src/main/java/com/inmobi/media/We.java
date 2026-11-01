package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class We extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2782cf f23744c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public We(C2782cf c2782cf, rj.c cVar) {
        super(2, cVar);
        this.f23744c = c2782cf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        We we2 = new We(this.f23744c, cVar);
        we2.f23743b = obj;
        return we2;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        We we2 = new We(this.f23744c, (rj.c) obj2);
        we2.f23743b = (Xf) obj;
        return we2.invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f23742a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            Xf xf2 = (Xf) this.f23743b;
            C2782cf c2782cf = this.f23744c;
            this.f23742a = 1;
            Object objA = c2782cf.f23915b.a(xf2, this);
            if (objA != sj.a.f()) {
                objA = mj.r.f64562a;
            }
            if (objA == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
