package com.inmobi.media;

import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2844f0 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3019m0 f24330a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2844f0(C3019m0 c3019m0, rj.c cVar) {
        super(2, cVar);
        this.f24330a = c3019m0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2844f0(this.f24330a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2844f0(this.f24330a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        Map mapA = AbstractC2939ik.a(this.f24330a.f24794b);
        mapA.put("networkType", C3298x5.m());
        Wj wj2 = Wj.f23753a;
        Wj.b("AdLoadCalled", mapA, EnumC2735ak.SDK);
        return mj.r.f64562a;
    }
}
