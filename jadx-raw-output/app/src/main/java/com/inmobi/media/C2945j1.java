package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C2945j1;
import com.inmobi.media.W;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2945j1 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f24577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC2995l1 f24578c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2945j1(byte[] bArr, AbstractC2995l1 abstractC2995l1, rj.c cVar) {
        super(2, cVar);
        this.f24577b = bArr;
        this.f24578c = abstractC2995l1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2945j1(this.f24577b, this.f24578c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2945j1(this.f24577b, this.f24578c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    public static final mj.r a(AbstractC2995l1 abstractC2995l1, W w10) {
        AbstractC2995l1.a(abstractC2995l1, w10);
        return mj.r.f64562a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24576a;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                byte[] bArr = this.f24577b;
                AbstractC2995l1 abstractC2995l1 = this.f24578c;
                C2714a c2714a = new C2714a(bArr, abstractC2995l1.f24720l.f25505a, abstractC2995l1.f24717i);
                final AbstractC2995l1 abstractC2995l2 = this.f24578c;
                bk.l lVar = new bk.l() { // from class: b7.a8
                    @Override // bk.l
                    public final Object invoke(Object obj2) {
                        return C2945j1.a(abstractC2995l2, (W) obj2);
                    }
                };
                this.f24576a = 1;
                obj = c2714a.a(lVar, this);
                if (obj == objF) {
                    return objF;
                }
            }
            AdResponse adResponse = (AdResponse) obj;
            AbstractC2995l1 abstractC2995l3 = this.f24578c;
            C3053n9 c3053n9 = abstractC2995l3.f24717i;
            if (c3053n9 != null) {
                C3243v0 c3243v0 = abstractC2995l3.f24720l;
                AbstractC2793d0.a(c3243v0.f25509e, c3243v0.f25510f, adResponse, c3053n9);
            }
            this.f24578c.a(adResponse);
        } catch (Y e10) {
            AbstractC2995l1 abstractC2995l4 = this.f24578c;
            V v10 = e10.f23812b;
            if (v10 instanceof Ni) {
                abstractC2995l4.b(((Ni) v10).f23251a);
            }
            abstractC2995l4.b(e10.f23811a, true, (short) 0);
        } catch (Throwable th2) {
            C3053n9 c3053n10 = this.f24578c.f24717i;
            if (c3053n10 != null) {
                ck.p.i("l1", "<get-TAG>(...)");
                c3053n10.a("l1", "doAdLoadWork: " + th2);
            }
            mj.g gVar = P9.f23321a;
            P9.a(new L2(th2));
            AbstractC2995l1 abstractC2995l5 = this.f24578c;
            abstractC2995l5.getClass();
            abstractC2995l5.b(kotlin.collections.a.o(mj.h.a(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2363)));
            abstractC2995l5.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 0);
        }
        return mj.r.f64562a;
    }
}
