package com.inmobi.media;

import android.os.SystemClock;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2994l0 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3019m0 f24708a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2994l0(C3019m0 c3019m0, rj.c cVar) {
        super(2, cVar);
        this.f24708a = c3019m0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2994l0(this.f24708a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2994l0(this.f24708a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        Map mapA = AbstractC2939ik.a(this.f24708a.f24794b);
        long j10 = this.f24708a.f24795c.f24103b;
        nk.l0 l0Var = AbstractC2940il.f24565a;
        mapA.put("latency", tj.a.e(SystemClock.elapsedRealtime() - j10));
        mapA.put("networkType", C3298x5.m());
        Wj wj2 = Wj.f23753a;
        Wj.b("ServerNoFill", mapA, EnumC2735ak.SDK);
        return mj.r.f64562a;
    }
}
