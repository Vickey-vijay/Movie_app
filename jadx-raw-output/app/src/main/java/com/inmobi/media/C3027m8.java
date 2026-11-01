package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.m8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3027m8 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3077o8 f24817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ij f24818b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3027m8(C3077o8 c3077o8, Ij ij2, rj.c cVar) {
        super(2, cVar);
        this.f24817a = c3077o8;
        this.f24818b = ij2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3027m8(this.f24817a, this.f24818b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3027m8(this.f24817a, this.f24818b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        C3077o8 c3077o8 = this.f24817a;
        c3077o8.f24968f = this.f24818b;
        c3077o8.f24966d.a(c3077o8.f24970h);
        return mj.r.f64562a;
    }
}
