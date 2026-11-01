package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.nn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3067nn extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Vm f24915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3117pn f24916d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3067nn(Vm vm2, rj.c cVar, C3117pn c3117pn) {
        super(2, cVar);
        this.f24915c = vm2;
        this.f24916d = c3117pn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        C3067nn c3067nn = new C3067nn(this.f24915c, cVar, this.f24916d);
        c3067nn.f24914b = obj;
        return c3067nn;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C3067nn) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24913a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            nk.l0 l0Var = (nk.l0) this.f24914b;
            Vm vm2 = this.f24915c;
            C3042mn c3042mn = new C3042mn(l0Var, this.f24916d);
            this.f24913a = 1;
            if (vm2.collect(c3042mn, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
