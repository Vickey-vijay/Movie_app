package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.ne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3058ne extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3207te f24898b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3058ne(C3207te c3207te, rj.c cVar) {
        super(2, cVar);
        this.f24898b = c3207te;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3058ne(this.f24898b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3058ne(this.f24898b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24897a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            InterfaceC3028m9 interfaceC3028m9L = this.f24898b.l();
            if (interfaceC3028m9L != null) {
                ((C3053n9) interfaceC3028m9L).a("NativeRenderedState", "Impression Tracking Started - waiting for viewability criteria");
            }
            qk.c cVarB = ((C2857fd) this.f24898b.f25388b.f25472j.getValue()).b();
            C3033me c3033me = new C3033me(null);
            this.f24897a = 1;
            if (qk.e.q(cVarB, c3033me, this) == objF) {
                return objF;
            }
        }
        this.f24898b.m();
        ((C2857fd) this.f24898b.f25388b.f25472j.getValue()).a();
        return mj.r.f64562a;
    }
}
