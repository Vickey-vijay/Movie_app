package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class Zm extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qk.k f23928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2764bn f23929d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zm(qk.k kVar, rj.c cVar, C2764bn c2764bn) {
        super(2, cVar);
        this.f23928c = kVar;
        this.f23929d = c2764bn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        Zm zm2 = new Zm(this.f23928c, cVar, this.f23929d);
        zm2.f23927b = obj;
        return zm2;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((Zm) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f23926a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            nk.l0 l0Var = (nk.l0) this.f23927b;
            qk.k kVar = this.f23928c;
            Ym ym2 = new Ym(l0Var, this.f23929d);
            this.f23926a = 1;
            if (kVar.collect(ym2, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
