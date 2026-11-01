package com.inmobi.media;

import android.os.SystemClock;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2969k0 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3019m0 f24639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f24640b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2969k0(C3019m0 c3019m0, Map map, rj.c cVar) {
        super(2, cVar);
        this.f24639a = c3019m0;
        this.f24640b = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2969k0(this.f24639a, this.f24640b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2969k0(this.f24639a, this.f24640b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        Map mapA = AbstractC2939ik.a(this.f24639a.f24794b);
        long j10 = this.f24639a.f24795c.f24103b;
        nk.l0 l0Var = AbstractC2940il.f24565a;
        mapA.put("latency", tj.a.e(SystemClock.elapsedRealtime() - j10));
        mapA.put("networkType", C3298x5.m());
        mapA.putAll(this.f24640b);
        Wj wj2 = Wj.f23753a;
        Wj.b("ServerFill", mapA, EnumC2735ak.SDK);
        return mj.r.f64562a;
    }
}
