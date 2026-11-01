package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.s7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3175s7 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f25300a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3175s7(rj.c cVar, N7 n10) {
        super(2, cVar);
        this.f25300a = n10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3175s7(cVar, this.f25300a);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3175s7((rj.c) obj2, this.f25300a).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        N7 n10 = this.f25300a;
        n10.f23211p.addListener(n10.B);
        return mj.r.f64562a;
    }
}
