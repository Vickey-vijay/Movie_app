package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2870g0 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3019m0 f24400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ short f24401b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2870g0(C3019m0 c3019m0, short s10, rj.c cVar) {
        super(2, cVar);
        this.f24400a = c3019m0;
        this.f24401b = s10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2870g0(this.f24400a, this.f24401b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2870g0(this.f24400a, this.f24401b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        Map mapA = AbstractC2939ik.a(this.f24400a.f24794b);
        mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, tj.a.f(this.f24401b));
        Wj wj2 = Wj.f23753a;
        Wj.b("AdLoadDroppedAtSDK", mapA, EnumC2735ak.SDK);
        return mj.r.f64562a;
    }
}
