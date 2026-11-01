package com.ironsource;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3407c3 implements Cb, A2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BannerAdRequest f28300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSize f28301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3585m2 f28302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Db f28303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3735uc f28304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3657q1 f28305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final U<BannerAdView> f28306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final D2 f28307h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Uf.c f28308i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Executor f28309j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C3570l5 f28310k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Uf f28311l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private W1 f28312m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f28313n;

    /* JADX INFO: renamed from: com.ironsource.c3$a */
    public static final class a implements Uf.a {
        public a() {
        }

        @Override // com.ironsource.Uf.a
        public void a() {
            C3407c3.this.a(C3813z5.f31697a.s());
        }
    }

    public C3407c3(BannerAdRequest bannerAdRequest, AdSize adSize, InterfaceC3585m2 interfaceC3585m2, Db db2, InterfaceC3735uc interfaceC3735uc, InterfaceC3657q1 interfaceC3657q1, U<BannerAdView> u10, D2 d10, Uf.c cVar, Executor executor) {
        ck.p.j(bannerAdRequest, "adRequest");
        ck.p.j(adSize, "size");
        ck.p.j(interfaceC3585m2, "auctionResponseFetcher");
        ck.p.j(db2, "loadTaskConfig");
        ck.p.j(interfaceC3735uc, "networkLoadApi");
        ck.p.j(interfaceC3657q1, "analytics");
        ck.p.j(u10, "adLoadTaskListener");
        ck.p.j(d10, "adLayoutFactory");
        ck.p.j(cVar, "timerFactory");
        ck.p.j(executor, "taskFinishedExecutor");
        this.f28300a = bannerAdRequest;
        this.f28301b = adSize;
        this.f28302c = interfaceC3585m2;
        this.f28303d = db2;
        this.f28304e = interfaceC3735uc;
        this.f28305f = interfaceC3657q1;
        this.f28306g = u10;
        this.f28307h = d10;
        this.f28308i = cVar;
        this.f28309j = executor;
    }

    private final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Map<String, String> mapA = U5.f27747a.a(bundle);
        for (String str : mapA.keySet()) {
            String strValueOf = String.valueOf(mapA.get(str));
            InterfaceC3530j1.c.f29197a.a(new C3584m1.l(str + "=" + strValueOf)).a(this.f28305f);
        }
    }

    @Override // com.ironsource.A2
    public void onBannerLoadFail(String str) {
        ck.p.j(str, UnifiedMediationParams.KEY_DESCRIPTION);
        a(C3813z5.f31697a.c(str));
    }

    @Override // com.ironsource.A2
    public void onBannerLoadSuccess(final O9 o10, final C3555k8 c3555k8) {
        ck.p.j(o10, C3426d4.i.f28559p0);
        ck.p.j(c3555k8, "adContainer");
        this.f28309j.execute(new Runnable() { // from class: com.ironsource.ak
            @Override // java.lang.Runnable
            public final void run() {
                C3407c3.a(this.f28206b, o10, c3555k8);
            }
        });
    }

    @Override // com.ironsource.Cb
    public void start() {
        this.f28310k = new C3570l5();
        this.f28305f.a(new C3584m1.s(this.f28303d.f()), new C3584m1.n(this.f28303d.g().b()), new C3584m1.c(this.f28301b), new C3584m1.b(this.f28300a.getAdId$mediationsdk_release()));
        InterfaceC3530j1.c.f29197a.a().a(this.f28305f);
        a(this.f28300a.getExtraParams());
        long jH = this.f28303d.h();
        Uf.c cVar = this.f28308i;
        Uf.b bVar = new Uf.b();
        bVar.b(jH);
        mj.r rVar = mj.r.f64562a;
        Uf ufA = cVar.a(bVar);
        this.f28311l = ufA;
        if (ufA != null) {
            ufA.a(new a());
        }
        Object objA = this.f28302c.a();
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
        InterfaceC3657q1 interfaceC3657q1 = this.f28305f;
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
        EnumC3648p9 enumC3648p9G = this.f28303d.g();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        C3520i8 c3520i8 = new C3520i8(AdapterUtils.dpToPixels(applicationContext, this.f28301b.getWidth()), AdapterUtils.dpToPixels(applicationContext, this.f28301b.getHeight()), this.f28301b.getSizeDescription());
        Jc jc2 = new Jc();
        jc2.a(this);
        O9 o9A = new P9(this.f28300a.getProviderName$mediationsdk_release().value(), jc2).a(enumC3648p9G.b(EnumC3648p9.Bidder)).a(c3520i8).b(this.f28303d.i()).a(this.f28300a.getAdId$mediationsdk_release()).a(kotlin.collections.a.q(new C3615nc().a(), U5.f27747a.a(this.f28300a.getExtraParams()))).a();
        C3769wc c3769wc = new C3769wc(c3531j2, this.f28303d.j());
        this.f28312m = new W1(new C3630o9(this.f28300a.getInstanceId(), enumC3648p9G.b(), c3531j2.a()), new com.ironsource.mediationsdk.d(), c3531j2.c());
        InterfaceC3530j1.d.f29206a.c().a(this.f28305f);
        InterfaceC3735uc interfaceC3735uc = this.f28304e;
        ck.p.i(o9A, C3426d4.i.f28559p0);
        interfaceC3735uc.a(o9A, c3769wc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3407c3 c3407c3, O9 o10, C3555k8 c3555k8) {
        ck.p.j(c3407c3, "this$0");
        ck.p.j(o10, "$adInstance");
        ck.p.j(c3555k8, "$adContainer");
        if (c3407c3.f28313n) {
            return;
        }
        c3407c3.f28313n = true;
        Uf uf2 = c3407c3.f28311l;
        if (uf2 != null) {
            uf2.cancel();
        }
        C3570l5 c3570l5 = c3407c3.f28310k;
        if (c3570l5 == null) {
            ck.p.B("taskStartedTime");
            c3570l5 = null;
        }
        InterfaceC3530j1.c.f29197a.a(new C3584m1.f(C3570l5.a(c3570l5))).a(c3407c3.f28305f);
        W1 w10 = c3407c3.f28312m;
        if (w10 != null) {
            w10.c("onBannerLoadSuccess");
        }
        D2 d10 = c3407c3.f28307h;
        W1 w11 = c3407c3.f28312m;
        ck.p.g(w11);
        c3407c3.f28306g.a(d10.a(o10, c3555k8, w11));
    }

    public /* synthetic */ C3407c3(BannerAdRequest bannerAdRequest, AdSize adSize, InterfaceC3585m2 interfaceC3585m2, Db db2, InterfaceC3735uc interfaceC3735uc, InterfaceC3657q1 interfaceC3657q1, U u10, D2 d10, Uf.c cVar, Executor executor, int i10, ck.i iVar) {
        this(bannerAdRequest, adSize, interfaceC3585m2, db2, interfaceC3735uc, interfaceC3657q1, u10, d10, (i10 & 256) != 0 ? new Uf.d() : cVar, (i10 & 512) != 0 ? V7.f27797a.c() : executor);
    }

    public final void a(final IronSourceError ironSourceError) {
        ck.p.j(ironSourceError, "error");
        this.f28309j.execute(new Runnable() { // from class: com.ironsource.zj
            @Override // java.lang.Runnable
            public final void run() {
                C3407c3.a(this.f31772b, ironSourceError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3407c3 c3407c3, IronSourceError ironSourceError) {
        ck.p.j(c3407c3, "this$0");
        ck.p.j(ironSourceError, "$error");
        if (c3407c3.f28313n) {
            return;
        }
        c3407c3.f28313n = true;
        Uf uf2 = c3407c3.f28311l;
        if (uf2 != null) {
            uf2.cancel();
        }
        InterfaceC3530j1.c.a aVar = InterfaceC3530j1.c.f29197a;
        C3584m1.j jVar = new C3584m1.j(ironSourceError.getErrorCode());
        C3584m1.k kVar = new C3584m1.k(ironSourceError.getErrorMessage());
        C3570l5 c3570l5 = c3407c3.f28310k;
        if (c3570l5 == null) {
            ck.p.B("taskStartedTime");
            c3570l5 = null;
        }
        aVar.a(jVar, kVar, new C3584m1.f(C3570l5.a(c3570l5))).a(c3407c3.f28305f);
        W1 w10 = c3407c3.f28312m;
        if (w10 != null) {
            w10.a("onBannerLoadFail");
        }
        c3407c3.f28306g.b(ironSourceError);
    }
}
