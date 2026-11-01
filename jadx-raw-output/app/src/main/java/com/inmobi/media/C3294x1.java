package com.inmobi.media;

import android.app.ApplicationExitInfo;
import com.ironsource.C3426d4;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3294x1 extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3319y1 f25680a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3294x1(C3319y1 c3319y1, rj.c cVar) {
        super(1, cVar);
        this.f25680a = c3319y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new C3294x1(this.f25680a, cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return new C3294x1(this.f25680a, (rj.c) obj).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        C3319y1 c3319y1 = this.f25680a;
        List<ApplicationExitInfo> historicalProcessExitReasons = c3319y1.f25765e.getHistoricalProcessExitReasons(c3319y1.f25762b.getPackageName(), 0, 10);
        ck.p.i(historicalProcessExitReasons, "getHistoricalProcessExitReasons(...)");
        Ea ea2 = this.f25680a.f25766f;
        ea2.getClass();
        ck.p.j("exitReasonTimestamp", C3426d4.i.W);
        long j10 = ea2.f22577a.getLong("exitReasonTimestamp", 0L);
        C3319y1 c3319y2 = this.f25680a;
        long timestamp = j10;
        for (ApplicationExitInfo applicationExitInfo : historicalProcessExitReasons) {
            if (applicationExitInfo.getTimestamp() > j10) {
                long j11 = c3319y2.f25763c;
                C3269w1 c3269w1 = new C3269w1(c3319y2, applicationExitInfo, null);
                nk.l0 l0Var = AbstractC2940il.f24565a;
                ck.p.j(c3269w1, "runnable");
                nk.j.d(AbstractC2940il.f24565a, null, null, new C2865fl(j11, null, c3269w1), 3, null);
                if (applicationExitInfo.getTimestamp() > timestamp) {
                    timestamp = applicationExitInfo.getTimestamp();
                }
            }
        }
        this.f25680a.f25766f.a("exitReasonTimestamp", timestamp, false);
        return mj.r.f64562a;
    }
}
