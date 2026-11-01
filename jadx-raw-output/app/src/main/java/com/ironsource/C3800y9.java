package com.ironsource;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.y9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3800y9 implements Cb, InterfaceC3464f6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterstitialAdRequest f31634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Db f31635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final U<InterstitialAd> f31636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3585m2 f31637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3735uc f31638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3657q1 f31639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC3422d0<InterstitialAd> f31640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Uf.c f31641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Executor f31642i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C3570l5 f31643j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Uf f31644k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private W1 f31645l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f31646m;

    /* JADX INFO: renamed from: com.ironsource.y9$a */
    public static final class a implements Uf.a {
        public a() {
        }

        @Override // com.ironsource.Uf.a
        public void a() {
            C3800y9.this.a(C3813z5.f31697a.s());
        }
    }

    public C3800y9(InterstitialAdRequest interstitialAdRequest, Db db2, U<InterstitialAd> u10, InterfaceC3585m2 interfaceC3585m2, InterfaceC3735uc interfaceC3735uc, InterfaceC3657q1 interfaceC3657q1, InterfaceC3422d0<InterstitialAd> interfaceC3422d0, Uf.c cVar, Executor executor) {
        ck.p.j(interstitialAdRequest, "adRequest");
        ck.p.j(db2, "loadTaskConfig");
        ck.p.j(u10, "adLoadTaskListener");
        ck.p.j(interfaceC3585m2, "auctionResponseFetcher");
        ck.p.j(interfaceC3735uc, "networkLoadApi");
        ck.p.j(interfaceC3657q1, "analytics");
        ck.p.j(interfaceC3422d0, "adObjectFactory");
        ck.p.j(cVar, "timerFactory");
        ck.p.j(executor, "taskFinishedExecutor");
        this.f31634a = interstitialAdRequest;
        this.f31635b = db2;
        this.f31636c = u10;
        this.f31637d = interfaceC3585m2;
        this.f31638e = interfaceC3735uc;
        this.f31639f = interfaceC3657q1;
        this.f31640g = interfaceC3422d0;
        this.f31641h = cVar;
        this.f31642i = executor;
    }

    private final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Map<String, String> mapA = U5.f27747a.a(bundle);
        for (String str : mapA.keySet()) {
            String strValueOf = String.valueOf(mapA.get(str));
            InterfaceC3530j1.c.f29197a.a(new C3584m1.l(str + "=" + strValueOf)).a(this.f31639f);
        }
    }

    @Override // com.ironsource.Cb
    public void start() {
        this.f31643j = new C3570l5();
        this.f31639f.a(new C3584m1.s(this.f31635b.f()), new C3584m1.n(this.f31635b.g().b()), new C3584m1.b(this.f31634a.getAdId$mediationsdk_release()));
        InterfaceC3530j1.c.f29197a.a().a(this.f31639f);
        a(this.f31634a.getExtraParams());
        long jH = this.f31635b.h();
        Uf.c cVar = this.f31641h;
        Uf.b bVar = new Uf.b();
        bVar.b(jH);
        mj.r rVar = mj.r.f64562a;
        Uf ufA = cVar.a(bVar);
        this.f31644k = ufA;
        if (ufA != null) {
            ufA.a(new a());
        }
        Object objA = this.f31637d.a();
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
        InterfaceC3657q1 interfaceC3657q1 = this.f31639f;
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
        EnumC3648p9 enumC3648p9G = this.f31635b.g();
        C3446e6 c3446e6 = new C3446e6();
        c3446e6.a(this);
        O9 o9A = new P9(this.f31634a.getProviderName$mediationsdk_release().value(), c3446e6).a(enumC3648p9G.b(EnumC3648p9.Bidder)).b(this.f31635b.i()).a(this.f31634a.getAdId$mediationsdk_release()).a(kotlin.collections.a.q(new C3615nc().a(), U5.f27747a.a(this.f31634a.getExtraParams()))).a();
        InterfaceC3657q1 interfaceC3657q2 = this.f31639f;
        String strE = o9A.e();
        ck.p.i(strE, "adInstance.id");
        interfaceC3657q2.a(new C3584m1.b(strE));
        C3769wc c3769wc = new C3769wc(c3531j2, this.f31635b.j());
        this.f31645l = new W1(new C3630o9(this.f31634a.getInstanceId(), enumC3648p9G.b(), c3531j2.a()), new com.ironsource.mediationsdk.d(), c3531j2.c());
        InterfaceC3530j1.d.f29206a.c().a(this.f31639f);
        InterfaceC3735uc interfaceC3735uc = this.f31638e;
        ck.p.i(o9A, C3426d4.i.f28559p0);
        interfaceC3735uc.a(o9A, c3769wc);
    }

    @Override // com.ironsource.InterfaceC3464f6
    public void a(final O9 o10) {
        ck.p.j(o10, C3426d4.i.f28559p0);
        this.f31642i.execute(new Runnable() { // from class: com.ironsource.ym
            @Override // java.lang.Runnable
            public final void run() {
                C3800y9.a(this.f31681b, o10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3800y9 c3800y9, O9 o10) {
        ck.p.j(c3800y9, "this$0");
        ck.p.j(o10, "$adInstance");
        if (c3800y9.f31646m) {
            return;
        }
        c3800y9.f31646m = true;
        Uf uf2 = c3800y9.f31644k;
        if (uf2 != null) {
            uf2.cancel();
        }
        C3570l5 c3570l5 = c3800y9.f31643j;
        if (c3570l5 == null) {
            ck.p.B("taskStartedTime");
            c3570l5 = null;
        }
        InterfaceC3530j1.c.f29197a.a(new C3584m1.f(C3570l5.a(c3570l5))).a(c3800y9.f31639f);
        W1 w10 = c3800y9.f31645l;
        if (w10 != null) {
            w10.c("onAdInstanceDidLoad");
        }
        InterfaceC3422d0<InterstitialAd> interfaceC3422d0 = c3800y9.f31640g;
        W1 w11 = c3800y9.f31645l;
        ck.p.g(w11);
        c3800y9.f31636c.a(interfaceC3422d0.a(o10, w11));
    }

    public /* synthetic */ C3800y9(InterstitialAdRequest interstitialAdRequest, Db db2, U u10, InterfaceC3585m2 interfaceC3585m2, InterfaceC3735uc interfaceC3735uc, InterfaceC3657q1 interfaceC3657q1, InterfaceC3422d0 interfaceC3422d0, Uf.c cVar, Executor executor, int i10, ck.i iVar) {
        this(interstitialAdRequest, db2, u10, interfaceC3585m2, interfaceC3735uc, interfaceC3657q1, interfaceC3422d0, (i10 & 128) != 0 ? new Uf.d() : cVar, (i10 & 256) != 0 ? V7.f27797a.c() : executor);
    }

    @Override // com.ironsource.InterfaceC3464f6
    public void a(String str) {
        ck.p.j(str, UnifiedMediationParams.KEY_DESCRIPTION);
        a(C3813z5.f31697a.c(str));
    }

    public final void a(final IronSourceError ironSourceError) {
        ck.p.j(ironSourceError, "error");
        this.f31642i.execute(new Runnable() { // from class: com.ironsource.xm
            @Override // java.lang.Runnable
            public final void run() {
                C3800y9.a(this.f31610b, ironSourceError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3800y9 c3800y9, IronSourceError ironSourceError) {
        ck.p.j(c3800y9, "this$0");
        ck.p.j(ironSourceError, "$error");
        if (c3800y9.f31646m) {
            return;
        }
        c3800y9.f31646m = true;
        Uf uf2 = c3800y9.f31644k;
        if (uf2 != null) {
            uf2.cancel();
        }
        InterfaceC3530j1.c.a aVar = InterfaceC3530j1.c.f29197a;
        C3584m1.j jVar = new C3584m1.j(ironSourceError.getErrorCode());
        C3584m1.k kVar = new C3584m1.k(ironSourceError.getErrorMessage());
        C3570l5 c3570l5 = c3800y9.f31643j;
        if (c3570l5 == null) {
            ck.p.B("taskStartedTime");
            c3570l5 = null;
        }
        aVar.a(jVar, kVar, new C3584m1.f(C3570l5.a(c3570l5))).a(c3800y9.f31639f);
        W1 w10 = c3800y9.f31645l;
        if (w10 != null) {
            w10.a("onAdInstanceDidFailToLoad");
        }
        c3800y9.f31636c.b(ironSourceError);
    }
}
