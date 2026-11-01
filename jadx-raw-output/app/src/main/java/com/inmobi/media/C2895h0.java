package com.inmobi.media;

import android.os.SystemClock;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2895h0 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f24470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3019m0 f24471b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2895h0(C3019m0 c3019m0, Map map, rj.c cVar) {
        super(2, cVar);
        this.f24470a = map;
        this.f24471b = c3019m0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2895h0(this.f24471b, this.f24470a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        Map map = this.f24470a;
        return new C2895h0(this.f24471b, map, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Short sh2;
        long j10;
        long jElapsedRealtime;
        sj.a.f();
        kotlin.c.b(obj);
        Object obj2 = this.f24470a.get(IronSourceConstants.EVENTS_ERROR_CODE);
        if (obj2 instanceof Short) {
            sh2 = (Short) obj2;
        } else {
            sh2 = null;
        }
        Map mapA = AbstractC2939ik.a(this.f24471b.f24794b);
        C3019m0 c3019m0 = this.f24471b;
        if (sh2 != null && sh2.shortValue() == 2138) {
            j10 = c3019m0.f24795c.f24104c;
            nk.l0 l0Var = AbstractC2940il.f24565a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else if ((sh2 != null && sh2.shortValue() == 2139) || (sh2 != null && sh2.shortValue() == 2203)) {
            j10 = c3019m0.f24795c.f24106e;
            nk.l0 l0Var2 = AbstractC2940il.f24565a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            j10 = c3019m0.f24795c.f24102a;
            nk.l0 l0Var3 = AbstractC2940il.f24565a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        mapA.put("latency", tj.a.e(jElapsedRealtime - j10));
        mapA.putAll(this.f24470a);
        Wj wj2 = Wj.f23753a;
        Wj.b("AdLoadFailed", mapA, EnumC2735ak.SDK);
        return mj.r.f64562a;
    }
}
