package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class L6 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M6 f23062a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L6(M6 m10, rj.c cVar) {
        super(2, cVar);
        this.f23062a = m10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new L6(this.f23062a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new L6(this.f23062a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        M6 m10 = this.f23062a;
        Hc hc2 = m10.f23138f;
        InMobiAdRequestStatus inMobiAdRequestStatus = m10.f23137e;
        hc2.getClass();
        ck.p.j(inMobiAdRequestStatus, "status");
        hc2.onAdLoadFailed(inMobiAdRequestStatus);
        return mj.r.f64562a;
    }
}
