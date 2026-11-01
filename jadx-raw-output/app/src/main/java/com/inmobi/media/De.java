package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes5.dex */
public final class De extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qk.u f22526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk.l f22527d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public De(qk.u uVar, rj.c cVar, bk.l lVar) {
        super(2, cVar);
        this.f22526c = uVar;
        this.f22527d = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        De de2 = new De(this.f22526c, cVar, this.f22527d);
        de2.f22525b = obj;
        return de2;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((De) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f22524a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            nk.l0 l0Var = (nk.l0) this.f22525b;
            qk.u uVar = this.f22526c;
            Ce ce2 = new Ce(l0Var, this.f22527d);
            this.f22524a = 1;
            if (uVar.collect(ce2, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
