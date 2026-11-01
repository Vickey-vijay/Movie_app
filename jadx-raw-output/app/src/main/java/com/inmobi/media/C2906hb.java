package com.inmobi.media;

import com.inmobi.media.C2906hb;
import com.inmobi.media.W;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.hb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2906hb extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2714a f24490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC2931ib f24491c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2906hb(C2714a c2714a, AbstractC2931ib abstractC2931ib, rj.c cVar) {
        super(2, cVar);
        this.f24490b = c2714a;
        this.f24491c = abstractC2931ib;
    }

    public static final mj.r a(AbstractC2931ib abstractC2931ib, W w10) {
        abstractC2931ib.f24553m.a(w10);
        return mj.r.f64562a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2906hb(this.f24490b, this.f24491c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2906hb(this.f24490b, this.f24491c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24489a;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                C2714a c2714a = this.f24490b;
                final AbstractC2931ib abstractC2931ib = this.f24491c;
                bk.l lVar = new bk.l() { // from class: b7.v7
                    @Override // bk.l
                    public final Object invoke(Object obj2) {
                        return C2906hb.a(abstractC2931ib, (W) obj2);
                    }
                };
                this.f24489a = 1;
                obj = c2714a.a(lVar, this);
                if (obj == objF) {
                    return objF;
                }
            }
            AdResponse adResponse = (AdResponse) obj;
            this.f24491c.f24269a.getClass();
            AbstractC2931ib abstractC2931ib2 = this.f24491c;
            AbstractC2793d0.a("native", abstractC2931ib2.f24272d.f22941g, adResponse, abstractC2931ib2.f24273e);
            C3053n9 c3053n9 = this.f24491c.f24273e;
            if (c3053n9 != null) {
                c3053n9.a("AUM-LoadResponseState", "AdResponse Parse Success");
            }
            this.f24491c.a(adResponse);
        } catch (Y e10) {
            C3053n9 c3053n10 = this.f24491c.f24273e;
            if (c3053n10 != null) {
                c3053n10.b("AUM-LoadResponseState", "AdResponse Parse Failure " + e10);
            }
            AbstractC2931ib abstractC2931ib3 = this.f24491c;
            abstractC2931ib3.getClass();
            V v10 = e10.f23812b;
            if (v10 instanceof Pi) {
                C3019m0 c3019m0 = abstractC2931ib3.f24275g;
                nk.j.d(c3019m0.f24793a, null, null, new C2994l0(c3019m0, null), 3, null);
                abstractC2931ib3.a(kotlin.collections.a.o(mj.h.a(IronSourceConstants.EVENTS_ERROR_CODE, (short) 0)), e10.f23811a);
            } else if (v10 instanceof J6) {
                abstractC2931ib3.a(kotlin.collections.a.o(mj.h.a(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(((J6) v10).f22902a))), e10.f23811a);
            } else if (v10 instanceof K6) {
                abstractC2931ib3.a(kotlin.collections.a.o(mj.h.a(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf((short) ((K6) v10).f23004a))), e10.f23811a);
            } else if (v10 instanceof Ni) {
                abstractC2931ib3.a(((Ni) v10).f23251a, e10.f23811a);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return mj.r.f64562a;
    }
}
