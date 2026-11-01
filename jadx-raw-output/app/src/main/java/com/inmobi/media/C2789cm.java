package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.cm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2789cm extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3091om f24202a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2789cm(C3091om c3091om, rj.c cVar) {
        super(2, cVar);
        this.f24202a = c3091om;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2789cm(this.f24202a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2789cm(this.f24202a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        C3091om c3091om = this.f24202a;
        return new Sd(c3091om.f24579a, c3091om.f25009b, c3091om.f25010c.f25100e, c3091om.f25012e);
    }
}
