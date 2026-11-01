package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: loaded from: classes6.dex */
public final class Q6 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R6 f23375b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q6(R6 r10, rj.c cVar) {
        super(2, cVar);
        this.f23375b = r10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new Q6(this.f23375b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new Q6(this.f23375b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int iIntValue;
        Object objF = sj.a.f();
        int i10 = this.f23374a;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                C2767c0 c2767c0 = this.f23375b.f24274f;
                c2767c0.getClass();
                c2767c0.f24104c = SystemClock.elapsedRealtime();
                Integer num = this.f23375b.f23438m.f24891d;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 15000;
                }
                long j10 = iIntValue;
                P6 p10 = new P6(this.f23375b, null);
                this.f23374a = 1;
                obj = TimeoutKt.c(j10, p10, this);
                if (obj == objF) {
                    return objF;
                }
            }
            AdResponse adResponse = (AdResponse) obj;
            this.f23375b.f24269a.getClass();
            R6 r10 = this.f23375b;
            AbstractC2793d0.a("native", r10.f24272d.f22941g, adResponse, r10.f24273e);
            C3053n9 c3053n9 = this.f23375b.f24273e;
            if (c3053n9 != null) {
                c3053n9.a("AUM-FetchingState", "AdResponse Parse Success");
            }
            this.f23375b.a(adResponse);
        } catch (Y e10) {
            C3053n9 c3053n10 = this.f23375b.f24273e;
            if (c3053n10 != null) {
                c3053n10.b("AUM-FetchingState", "AdResponse Parse Failure " + e10);
            }
            this.f23375b.a(e10);
        } catch (TimeoutCancellationException unused) {
            C3053n9 c3053n11 = this.f23375b.f24273e;
            if (c3053n11 != null) {
                c3053n11.b("AUM-FetchingState", "Ad fetch timed out");
            }
            this.f23375b.a(new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), new J6((short) 2138)));
        }
        return mj.r.f64562a;
    }
}
