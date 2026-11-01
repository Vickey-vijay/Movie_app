package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class U6 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V6 f23623c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U6(V6 v10, rj.c cVar) {
        super(2, cVar);
        this.f23623c = v10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        U6 u10 = new U6(this.f23623c, cVar);
        u10.f23622b = obj;
        return u10;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        U6 u10 = new U6(this.f23623c, (rj.c) obj2);
        u10.f23622b = (nk.l0) obj;
        return u10.invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        nk.l0 l0Var;
        boolean z10;
        Object objF = sj.a.f();
        int i10 = this.f23621a;
        if (i10 != 0) {
            if (i10 == 1) {
                l0Var = (nk.l0) this.f23622b;
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            l0Var = (nk.l0) this.f23622b;
        }
        while (kotlinx.coroutines.d.g(l0Var)) {
            V6 v10 = this.f23623c;
            qk.l lVar = v10.f23689d;
            if (v10.f23687b.getWindowVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            lVar.setValue(tj.a.a(z10));
            long j10 = this.f23623c.f23688c;
            this.f23622b = l0Var;
            this.f23621a = 1;
            if (nk.s0.a(j10, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
