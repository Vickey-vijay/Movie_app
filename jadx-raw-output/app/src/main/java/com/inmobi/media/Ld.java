package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class Ld extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Od f23080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Sd f23081d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ld(Od od2, rj.c cVar, Sd sd2) {
        super(2, cVar);
        this.f23080c = od2;
        this.f23081d = sd2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        Ld ld2 = new Ld(this.f23080c, cVar, this.f23081d);
        ld2.f23079b = obj;
        return ld2;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((Ld) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f23078a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            nk.l0 l0Var = (nk.l0) this.f23079b;
            Od od2 = this.f23080c;
            Kd kd2 = new Kd(l0Var, this.f23081d);
            this.f23078a = 1;
            if (od2.collect(kd2, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
