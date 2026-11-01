package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.ln, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3017ln extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3117pn f24790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ij f24791b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3017ln(C3117pn c3117pn, Ij ij2, rj.c cVar) {
        super(2, cVar);
        this.f24790a = c3117pn;
        this.f24791b = ij2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3017ln(this.f24790a, this.f24791b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3017ln(this.f24790a, this.f24791b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        C3117pn c3117pn = this.f24790a;
        c3117pn.f25111h = this.f24791b;
        c3117pn.f25109f.a(c3117pn.f25113j);
        return mj.r.f64562a;
    }
}
