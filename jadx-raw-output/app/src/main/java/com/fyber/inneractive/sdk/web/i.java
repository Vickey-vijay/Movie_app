package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Rect;
import android.os.Handler;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i implements j, com.fyber.inneractive.sdk.util.m0, l, x0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f18682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j0 f18683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k0 f18684d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f18686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j1 f18687g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f18690j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f18691k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f18692l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f18693m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f18694n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e f18695o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f18696p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f18697q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InneractiveAdRequest f18698r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.x f18699s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.e f18700t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18681a = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f18688h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f18689i = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18685e = false;

    public final void a(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        m mVar = this.f18682b;
        if (mVar != null) {
            if (layoutParams != null) {
                viewGroup.addView(mVar, layoutParams);
            } else {
                viewGroup.addView(mVar);
            }
            com.fyber.inneractive.sdk.util.l0.f18590a.a(viewGroup.getContext(), this.f18682b, this);
            this.f18682b.setTapListener(this);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.j
    public void a(WebView webView) {
    }

    public abstract boolean a(String str, com.fyber.inneractive.sdk.util.g1 g1Var);

    @Override // com.fyber.inneractive.sdk.web.j
    public void d() {
    }

    public void e() {
        b(false);
    }

    public abstract com.fyber.inneractive.sdk.measurement.tracker.e f();

    public final void i() {
        IAlog.a("IAWebViewController resetClick()", new Object[0]);
        c cVar = this.f18694n;
        if (cVar != null) {
            com.fyber.inneractive.sdk.util.r.f18607b.removeCallbacks(cVar);
        }
        d dVar = this.f18693m;
        if (dVar != null) {
            com.fyber.inneractive.sdk.util.r.f18607b.removeCallbacks(dVar);
        }
        this.f18690j = false;
    }

    public com.fyber.inneractive.sdk.util.g1 g() {
        m mVar = this.f18682b;
        return mVar != null ? mVar.getLastClickedLocation() : new com.fyber.inneractive.sdk.util.g1();
    }

    public void h() {
        WebSettings settings = this.f18682b.getSettings();
        boolean z10 = true;
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (!IAConfigManager.O.f15022q && com.fyber.inneractive.sdk.util.s.a()) {
            settings.setMixedContentMode(2);
        }
        if (this.f18685e) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        m mVar = this.f18682b;
        mVar.setHorizontalScrollBarEnabled(false);
        mVar.setHorizontalScrollbarOverlay(false);
        mVar.setVerticalScrollBarEnabled(false);
        mVar.setVerticalScrollbarOverlay(false);
        mVar.getSettings().setSupportZoom(false);
        this.f18682b.setFocusable(true);
        this.f18682b.setBackgroundColor(0);
        j0 j0Var = new j0();
        this.f18683c = j0Var;
        this.f18682b.setWebChromeClient(j0Var);
        try {
            Context context = this.f18682b.getContext();
            ApplicationInfo applicationInfo = context != null ? context.getApplicationInfo() : null;
            if (applicationInfo == null || (applicationInfo.flags & 2) == 0) {
                z10 = false;
            }
            WebView.setWebContentsDebuggingEnabled(z10);
        } catch (Exception unused) {
            IAlog.a("Could not set web contents debugging flag", new Object[0]);
        }
        this.f18682b.setListener(this);
    }

    public void setAdContent(com.fyber.inneractive.sdk.flow.x xVar) {
        this.f18699s = xVar;
    }

    public void setAdRequest(InneractiveAdRequest inneractiveAdRequest) {
        this.f18698r = inneractiveAdRequest;
    }

    public void setAdResponse(com.fyber.inneractive.sdk.response.e eVar) {
        this.f18700t = eVar;
    }

    public void setListener(j1 j1Var) {
        this.f18687g = j1Var;
    }

    public i(boolean z10, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.f18691k = z10;
        this.f18682b = a(rVar);
        i1 i1Var = (i1) this;
        this.f18694n = new c(i1Var);
        this.f18693m = new d(i1Var);
    }

    public void b(boolean z10) {
        int i10 = 0;
        IAlog.a("%s destroy is fatal: %b", IAlog.a(this), Boolean.valueOf(z10));
        e eVar = this.f18695o;
        if (eVar != null && !eVar.f18657a.isTerminated() && !eVar.f18657a.isShutdown()) {
            e eVar2 = this.f18695o;
            eVar2.f18662f = true;
            eVar2.f18657a.shutdownNow();
            Handler handler = eVar2.f18658b;
            if (handler != null) {
                com.fyber.inneractive.sdk.util.d dVar = eVar2.f18660d;
                if (dVar != null) {
                    handler.removeCallbacks(dVar);
                }
                com.fyber.inneractive.sdk.util.e eVar3 = eVar2.f18659c;
                if (eVar3 != null) {
                    eVar2.f18658b.removeCallbacks(eVar3);
                }
                eVar2.f18658b = null;
            }
            this.f18695o = null;
        }
        m mVar = this.f18682b;
        if (mVar != null) {
            com.fyber.inneractive.sdk.util.l0.f18590a.a(mVar);
            com.fyber.inneractive.sdk.util.v.a(this.f18682b);
            this.f18682b.setWebChromeClient(null);
            if (f() == null) {
                this.f18682b.destroy();
            } else {
                com.fyber.inneractive.sdk.measurement.tracker.e eVarF = f();
                AdSession adSession = eVarF.f15831a;
                if (adSession != null) {
                    try {
                        adSession.finish();
                    } catch (Throwable unused) {
                    }
                    if (!z10) {
                        i10 = 1000;
                    }
                    com.fyber.inneractive.sdk.util.r.f18607b.postDelayed(new com.fyber.inneractive.sdk.measurement.tracker.c(eVarF), i10);
                    eVarF.f15831a = null;
                    eVarF.f15832b = null;
                }
            }
        }
        k0 k0Var = this.f18684d;
        if (k0Var != null) {
            k0Var.f18727e = null;
        }
        c cVar = this.f18694n;
        if (cVar != null) {
            com.fyber.inneractive.sdk.util.r.f18607b.removeCallbacks(cVar);
        }
        d dVar2 = this.f18693m;
        if (dVar2 != null) {
            com.fyber.inneractive.sdk.util.r.f18607b.removeCallbacks(dVar2);
        }
        this.f18687g = null;
        if (!z10) {
            this.f18686f = null;
        }
        this.f18682b = null;
        this.f18683c = null;
        this.f18684d = null;
        this.f18699s = null;
        this.f18698r = null;
    }

    public final m a(com.fyber.inneractive.sdk.config.global.r rVar) {
        int iMax;
        boolean z10;
        int i10;
        int i11;
        m mVar = new m();
        if (rVar != null) {
            com.fyber.inneractive.sdk.config.global.features.f fVar = (com.fyber.inneractive.sdk.config.global.features.f) rVar.a(com.fyber.inneractive.sdk.config.global.features.f.class);
            Boolean boolC = fVar.c("agg_res");
            boolean zBooleanValue = boolC != null ? boolC.booleanValue() : false;
            Integer numA = fVar.a("agg_res_ct");
            int iMax2 = Math.max(numA != null ? numA.intValue() : 500, 50);
            Integer numA2 = fVar.a("agg_res_rt");
            int iMax3 = Math.max(numA2 != null ? numA2.intValue() : 500, 50);
            Integer numA3 = fVar.a("agg_res_retries");
            iMax = Math.max(numA3 != null ? numA3.intValue() : 2, 1);
            z10 = zBooleanValue;
            i11 = iMax3;
            i10 = iMax2;
        } else {
            iMax = 2;
            z10 = false;
            i10 = 500;
            i11 = 500;
        }
        k0 k0Var = new k0(this, z10, i10, i11, iMax);
        this.f18684d = k0Var;
        mVar.setWebViewClient(k0Var);
        return mVar;
    }

    @Override // com.fyber.inneractive.sdk.util.m0
    public final void a(float f10, Rect rect) {
        if (f10 == this.f18688h && rect.equals(this.f18689i)) {
            return;
        }
        this.f18688h = f10;
        this.f18689i.set(rect);
        m mVar = this.f18682b;
        if (mVar != null) {
            mVar.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.j
    public boolean a(WebView webView, String str) {
        IAlog.a("%shandleUrl called with: %s", IAlog.a(this), str);
        if (this.f18682b == null) {
            IAlog.a("handleUrl: web view already destroyed. Cannot handle url", new Object[0]);
            return false;
        }
        if (com.fyber.inneractive.sdk.util.j1.a(str)) {
            DTExchangeNetworkBridge.webviewLoadUrl(this.f18682b, "chrome://crash");
            return true;
        }
        if (str != null && str.startsWith("data:")) {
            return false;
        }
        com.fyber.inneractive.sdk.util.g1 g1VarG = g();
        if (a(str, g1VarG)) {
            return true;
        }
        a(new h(this, str, g1VarG));
        return true;
    }

    public void a(boolean z10) {
        IAlog.a("%sonWebViewVisibilityChanged called with: %s", IAlog.a(this), Boolean.valueOf(z10));
        j1 j1Var = this.f18687g;
        if (j1Var != null) {
            j1Var.a(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.j
    public void a() {
        j1 j1Var = this.f18687g;
        if (j1Var != null) {
            j1Var.a();
        }
        b(true);
    }

    public final void a(f fVar) {
        IAlog.e("IAWebViewController Web view click detected", new Object[0]);
        if (this.f18690j) {
            IAlog.e("IAWebViewController Native click detected before web view request. Processing click", new Object[0]);
            fVar.d();
            i();
            return;
        }
        if (this.f18691k) {
            IAlog.e("IAWebViewController Native click was not detected yet. Caching click request and waiting", new Object[0]);
            d dVar = this.f18693m;
            if (dVar != null) {
                com.fyber.inneractive.sdk.util.r.f18607b.removeCallbacks(dVar);
            }
            this.f18692l = fVar;
            if (this.f18693m != null) {
                com.fyber.inneractive.sdk.util.r.f18607b.postDelayed(this.f18693m, IAConfigManager.O.f15026u.f15195b.a("click_timeout", 1000, 1000));
                return;
            }
            return;
        }
        d dVar2 = this.f18693m;
        if (dVar2 != null) {
            com.fyber.inneractive.sdk.util.r.f18607b.removeCallbacks(dVar2);
        }
        this.f18692l = null;
        fVar.d();
    }
}
