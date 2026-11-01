package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class Yl extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qk.l f23870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3091om f23871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yl(qk.l lVar, rj.c cVar, C3091om c3091om) {
        super(2, cVar);
        this.f23870c = lVar;
        this.f23871d = c3091om;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        Yl yl2 = new Yl(this.f23870c, cVar, this.f23871d);
        yl2.f23869b = obj;
        return yl2;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((Yl) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f23868a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            nk.l0 l0Var = (nk.l0) this.f23869b;
            qk.l lVar = this.f23870c;
            Xl xl2 = new Xl(l0Var, this.f23871d);
            this.f23868a = 1;
            if (lVar.collect(xl2, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
