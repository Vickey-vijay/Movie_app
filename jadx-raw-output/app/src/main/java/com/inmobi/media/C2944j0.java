package com.inmobi.media;

import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2944j0 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3019m0 f24574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f24575b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2944j0(C3019m0 c3019m0, Map map, rj.c cVar) {
        super(2, cVar);
        this.f24574a = c3019m0;
        this.f24575b = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2944j0(this.f24574a, this.f24575b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2944j0(this.f24574a, this.f24575b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        Map mapA = AbstractC2939ik.a(this.f24574a.f24794b);
        mapA.putAll(this.f24575b);
        Wj wj2 = Wj.f23753a;
        Wj.b("ServerError", mapA, EnumC2735ak.SDK);
        return mj.r.f64562a;
    }
}
