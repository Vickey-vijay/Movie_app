package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C2896h1;
import com.inmobi.media.W;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2896h1 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC2995l1 f24473b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2896h1(AbstractC2995l1 abstractC2995l1, rj.c cVar) {
        super(2, cVar);
        this.f24473b = abstractC2995l1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2896h1(this.f24473b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2896h1(this.f24473b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    public static final mj.r a(AbstractC2995l1 abstractC2995l1, W w10) {
        AbstractC2995l1.a(abstractC2995l1, w10);
        return mj.r.f64562a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24472a;
        try {
            if (i10 != 0) {
                try {
                    if (i10 == 1) {
                        kotlin.c.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (Throwable th2) {
                    this.f24473b.b((byte) 0);
                    throw th2;
                }
            } else {
                kotlin.c.b(obj);
                Yn yn2 = new Yn(this.f24473b.G(), this.f24473b.f24717i);
                final AbstractC2995l1 abstractC2995l1 = this.f24473b;
                bk.l lVar = new bk.l() { // from class: b7.t7
                    @Override // bk.l
                    public final Object invoke(Object obj2) {
                        return C2896h1.a(abstractC2995l1, (W) obj2);
                    }
                };
                this.f24472a = 1;
                obj = yn2.a(lVar, this);
                if (obj == objF) {
                    return objF;
                }
            }
            AdResponse adResponse = (AdResponse) obj;
            AbstractC2995l1 abstractC2995l2 = this.f24473b;
            C3053n9 c3053n9 = abstractC2995l2.f24717i;
            if (c3053n9 != null) {
                C3243v0 c3243v0 = abstractC2995l2.f24720l;
                AbstractC2793d0.a(c3243v0.f25509e, c3243v0.f25510f, adResponse, c3053n9);
            }
            this.f24473b.a(adResponse);
        } catch (Y e10) {
            AbstractC2995l1.a(this.f24473b, e10);
        } catch (Throwable th3) {
            C3053n9 c3053n10 = this.f24473b.f24717i;
            if (c3053n10 != null) {
                ck.p.i("l1", "<get-TAG>(...)");
                c3053n10.a("l1", "doAdLoadWork: " + th3);
            }
            mj.g gVar = P9.f23321a;
            P9.a(new L2(th3));
            AbstractC2995l1 abstractC2995l3 = this.f24473b;
            abstractC2995l3.getClass();
            abstractC2995l3.b(kotlin.collections.a.o(mj.h.a(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2363)));
            abstractC2995l3.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 0);
        }
        this.f24473b.b((byte) 0);
        return mj.r.f64562a;
    }
}
