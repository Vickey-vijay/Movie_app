package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.zn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3366zn extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qk.l f25875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bn f25876d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3366zn(qk.l lVar, rj.c cVar, Bn bn2) {
        super(2, cVar);
        this.f25875c = lVar;
        this.f25876d = bn2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        C3366zn c3366zn = new C3366zn(this.f25875c, cVar, this.f25876d);
        c3366zn.f25874b = obj;
        return c3366zn;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C3366zn) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25873a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            nk.l0 l0Var = (nk.l0) this.f25874b;
            qk.l lVar = this.f25875c;
            C3341yn c3341yn = new C3341yn(l0Var, this.f25876d);
            this.f25873a = 1;
            if (lVar.collect(c3341yn, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
