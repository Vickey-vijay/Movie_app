package com.inmobi.media;

import android.os.SystemClock;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2920i0 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G f24521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3019m0 f24522b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2920i0(G g10, C3019m0 c3019m0, rj.c cVar) {
        super(2, cVar);
        this.f24521a = g10;
        this.f24522b = c3019m0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2920i0(this.f24521a, this.f24522b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2920i0(this.f24521a, this.f24522b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        Map mapA = AbstractC2939ik.a(this.f24521a);
        C3019m0 c3019m0 = this.f24522b;
        mapA.put("networkType", C3298x5.m());
        long j10 = c3019m0.f24795c.f24107f;
        nk.l0 l0Var = AbstractC2940il.f24565a;
        mapA.put("latency", tj.a.e(SystemClock.elapsedRealtime() - j10));
        Wj wj2 = Wj.f23753a;
        Wj.b("ParseSuccess", mapA, EnumC2735ak.SDK);
        return mj.r.f64562a;
    }
}
