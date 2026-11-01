package com.ironsource;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class Pd implements Cb, InterfaceC3464f6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RewardedAdRequest f27342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Db f27343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final U<RewardedAd> f27344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3585m2 f27345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3735uc f27346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3657q1 f27347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC3422d0<RewardedAd> f27348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Uf.c f27349h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Executor f27350i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C3570l5 f27351j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Uf f27352k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private W1 f27353l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f27354m;

    public static final class a implements Uf.a {
        public a() {
        }

        @Override // com.ironsource.Uf.a
        public void a() {
            Pd.this.a(C3813z5.f31697a.s());
        }
    }

    public Pd(RewardedAdRequest rewardedAdRequest, Db db2, U<RewardedAd> u10, InterfaceC3585m2 interfaceC3585m2, InterfaceC3735uc interfaceC3735uc, InterfaceC3657q1 interfaceC3657q1, InterfaceC3422d0<RewardedAd> interfaceC3422d0, Uf.c cVar, Executor executor) {
        ck.p.j(rewardedAdRequest, "adRequest");
        ck.p.j(db2, "loadTaskConfig");
        ck.p.j(u10, "adLoadTaskListener");
        ck.p.j(interfaceC3585m2, "auctionResponseFetcher");
        ck.p.j(interfaceC3735uc, "networkLoadApi");
        ck.p.j(interfaceC3657q1, "analytics");
        ck.p.j(interfaceC3422d0, "adObjectFactory");
        ck.p.j(cVar, "timerFactory");
        ck.p.j(executor, "taskFinishedExecutor");
        this.f27342a = rewardedAdRequest;
        this.f27343b = db2;
        this.f27344c = u10;
        this.f27345d = interfaceC3585m2;
        this.f27346e = interfaceC3735uc;
        this.f27347f = interfaceC3657q1;
        this.f27348g = interfaceC3422d0;
        this.f27349h = cVar;
        this.f27350i = executor;
    }

    @Override // com.ironsource.InterfaceC3464f6
    public void a(final O9 o10) {
        ck.p.j(o10, C3426d4.i.f28559p0);
        this.f27350i.execute(new Runnable() { // from class: com.ironsource.xi
            @Override // java.lang.Runnable
            public final void run() {
                Pd.a(this.f31605b, o10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Pd pd2, O9 o10) {
        ck.p.j(pd2, "this$0");
        ck.p.j(o10, "$adInstance");
        if (pd2.f27354m) {
            return;
        }
        pd2.f27354m = true;
        Uf uf2 = pd2.f27352k;
        if (uf2 != null) {
            uf2.cancel();
        }
        C3570l5 c3570l5 = pd2.f27351j;
        if (c3570l5 == null) {
            ck.p.B("taskStartedTime");
            c3570l5 = null;
        }
        InterfaceC3530j1.c.f29197a.a(new C3584m1.f(C3570l5.a(c3570l5))).a(pd2.f27347f);
        W1 w10 = pd2.f27353l;
        if (w10 != null) {
            w10.c("onAdInstanceLoadSuccess");
        }
        InterfaceC3422d0<RewardedAd> interfaceC3422d0 = pd2.f27348g;
        W1 w11 = pd2.f27353l;
        ck.p.g(w11);
        pd2.f27344c.a(interfaceC3422d0.a(o10, w11));
    }

    @Override // com.ironsource.Cb
    public void start() {
        this.f27351j = new C3570l5();
        this.f27347f.a(new C3584m1.s(this.f27343b.f()), new C3584m1.n(this.f27343b.g().b()), new C3584m1.b(this.f27342a.getAdId$mediationsdk_release()));
        InterfaceC3530j1.c.f29197a.a().a(this.f27347f);
        a(this.f27342a.getExtraParams());
        long jH = this.f27343b.h();
        Uf.c cVar = this.f27349h;
        Uf.b bVar = new Uf.b();
        bVar.b(jH);
        mj.r rVar = mj.r.f64562a;
        Uf ufA = cVar.a(bVar);
        this.f27352k = ufA;
        if (ufA != null) {
            ufA.a(new a());
        }
        Object objA = this.f27345d.a();
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objA);
        if (thM3461exceptionOrNullimpl != null) {
            ck.p.h(thM3461exceptionOrNullimpl, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.error.ISException");
            a(((C3466f8) thM3461exceptionOrNullimpl).a());
            objA = null;
        }
        C3531j2 c3531j2 = (C3531j2) objA;
        if (c3531j2 == null) {
            return;
        }
        InterfaceC3657q1 interfaceC3657q1 = this.f27347f;
        String strB = c3531j2.b();
        if (strB != null) {
            interfaceC3657q1.a(new C3584m1.d(strB));
        }
        JSONObject jSONObjectF = c3531j2.f();
        if (jSONObjectF != null) {
            interfaceC3657q1.a(new C3584m1.m(jSONObjectF));
        }
        String strA = c3531j2.a();
        if (strA != null) {
            interfaceC3657q1.a(new C3584m1.g(strA));
        }
        EnumC3648p9 enumC3648p9G = this.f27343b.g();
        C3446e6 c3446e6 = new C3446e6();
        c3446e6.a(this);
        O9 o9A = new P9(this.f27342a.getProviderName$mediationsdk_release().value(), c3446e6).a(enumC3648p9G.b(EnumC3648p9.Bidder)).b(this.f27343b.i()).c().a(this.f27342a.getAdId$mediationsdk_release()).a(kotlin.collections.a.q(new C3615nc().a(), U5.f27747a.a(this.f27342a.getExtraParams()))).a();
        InterfaceC3657q1 interfaceC3657q2 = this.f27347f;
        String strE = o9A.e();
        ck.p.i(strE, "adInstance.id");
        interfaceC3657q2.a(new C3584m1.b(strE));
        C3769wc c3769wc = new C3769wc(c3531j2, this.f27343b.j());
        this.f27353l = new W1(new C3630o9(this.f27342a.getInstanceId(), enumC3648p9G.b(), c3531j2.a()), new com.ironsource.mediationsdk.d(), c3531j2.c());
        InterfaceC3530j1.d.f29206a.c().a(this.f27347f);
        InterfaceC3735uc interfaceC3735uc = this.f27346e;
        ck.p.i(o9A, C3426d4.i.f28559p0);
        interfaceC3735uc.a(o9A, c3769wc);
    }

    private final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Map<String, String> mapA = U5.f27747a.a(bundle);
        for (String str : mapA.keySet()) {
            String strValueOf = String.valueOf(mapA.get(str));
            InterfaceC3530j1.c.f29197a.a(new C3584m1.l(str + "=" + strValueOf)).a(this.f27347f);
        }
    }

    public /* synthetic */ Pd(RewardedAdRequest rewardedAdRequest, Db db2, U u10, InterfaceC3585m2 interfaceC3585m2, InterfaceC3735uc interfaceC3735uc, InterfaceC3657q1 interfaceC3657q1, InterfaceC3422d0 interfaceC3422d0, Uf.c cVar, Executor executor, int i10, ck.i iVar) {
        this(rewardedAdRequest, db2, u10, interfaceC3585m2, interfaceC3735uc, interfaceC3657q1, interfaceC3422d0, (i10 & 128) != 0 ? new Uf.d() : cVar, (i10 & 256) != 0 ? V7.f27797a.c() : executor);
    }

    @Override // com.ironsource.InterfaceC3464f6
    public void a(String str) {
        ck.p.j(str, UnifiedMediationParams.KEY_DESCRIPTION);
        a(C3813z5.f31697a.c(str));
    }

    public final void a(final IronSourceError ironSourceError) {
        ck.p.j(ironSourceError, "error");
        this.f27350i.execute(new Runnable() { // from class: com.ironsource.wi
            @Override // java.lang.Runnable
            public final void run() {
                Pd.a(this.f31560b, ironSourceError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Pd pd2, IronSourceError ironSourceError) {
        ck.p.j(pd2, "this$0");
        ck.p.j(ironSourceError, "$error");
        if (pd2.f27354m) {
            return;
        }
        pd2.f27354m = true;
        Uf uf2 = pd2.f27352k;
        if (uf2 != null) {
            uf2.cancel();
        }
        InterfaceC3530j1.c.a aVar = InterfaceC3530j1.c.f29197a;
        C3584m1.j jVar = new C3584m1.j(ironSourceError.getErrorCode());
        C3584m1.k kVar = new C3584m1.k(ironSourceError.getErrorMessage());
        C3570l5 c3570l5 = pd2.f27351j;
        if (c3570l5 == null) {
            ck.p.B("taskStartedTime");
            c3570l5 = null;
        }
        aVar.a(jVar, kVar, new C3584m1.f(C3570l5.a(c3570l5))).a(pd2.f27347f);
        W1 w10 = pd2.f27353l;
        if (w10 != null) {
            w10.a("onAdInstanceLoadFail");
        }
        pd2.f27344c.b(ironSourceError);
    }
}
