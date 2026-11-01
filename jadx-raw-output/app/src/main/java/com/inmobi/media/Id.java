package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class Id extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Jd f22863c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Id(Jd jd2, rj.c cVar) {
        super(2, cVar);
        this.f22863c = jd2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        Id id2 = new Id(this.f22863c, cVar);
        id2.f22862b = obj;
        return id2;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        Id id2 = new Id(this.f22863c, (rj.c) obj2);
        id2.f22862b = (pk.n) obj;
        return id2.invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f22861a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            pk.n nVar = (pk.n) this.f22862b;
            Jd jd2 = this.f22863c;
            qk.k kVar = jd2.f22925a.f23258a;
            Hd hd2 = new Hd(jd2, nVar);
            this.f22861a = 1;
            if (kVar.collect(hd2, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
