package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2778cb extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2804db f24129a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2778cb(C2804db c2804db, rj.c cVar) {
        super(2, cVar);
        this.f24129a = c2804db;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2778cb(this.f24129a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2778cb(this.f24129a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        C2804db c2804db = this.f24129a;
        Hc hc2 = c2804db.f24233f;
        InMobiAdRequestStatus inMobiAdRequestStatus = c2804db.f24232e;
        hc2.getClass();
        ck.p.j(inMobiAdRequestStatus, "status");
        hc2.onAdLoadFailed(inMobiAdRequestStatus);
        return mj.r.f64562a;
    }
}
