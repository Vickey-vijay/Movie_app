package com.fyber.inneractive.sdk.web;

import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes8.dex */
public final class v0 implements com.fyber.inneractive.sdk.ignite.r {
    public boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebView f18761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.ignite.h f18762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.ignite.m f18764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f18766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f18767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.v f18768h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t0 f18769i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f18771k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f18773m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f18775o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public n0 f18776p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public WeakReference f18777q;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f18770j = "invalid_task_id";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f18772l = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f18774n = 10;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f18778r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f18779s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicInteger f18780t = new AtomicInteger(0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f18781u = new AtomicBoolean(false);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f18782v = new AtomicBoolean(false);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f18783w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f18784x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f18785y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f18786z = false;
    public boolean A = false;
    public boolean C = false;
    public boolean D = false;
    public final m0 E = new m0(this);

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str, String str2) {
        if (str == null || str2 == null || !str2.equals(this.f18763c)) {
            return;
        }
        this.f18770j = str;
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void b(String str) {
        this.f18786z = false;
        this.A = true;
        if (this.f18770j.equals(str)) {
            this.f18762b.m();
            d("onInstallationSuccess();");
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void c(String str) {
        com.fyber.inneractive.sdk.flow.v vVar;
        IIgniteServiceAPI iIgniteServiceAPI;
        if (this.f18782v.get() && str != null) {
            if (str.equals(com.fyber.inneractive.sdk.ignite.j.NOT_CONNECTED.a()) || str.equals(com.fyber.inneractive.sdk.ignite.j.SESSION_EXPIRED.a())) {
                if (this.f18780t.getAndIncrement() < 2) {
                    this.f18762b.a(new q0(this));
                    return;
                }
                com.fyber.inneractive.sdk.ignite.h hVar = this.f18762b;
                com.fyber.inneractive.sdk.ignite.l lVar = hVar.f15795p;
                if (lVar == null || !lVar.isConnected() || (iIgniteServiceAPI = hVar.f15781b) == null || !iIgniteServiceAPI.asBinder().isBinderAlive()) {
                    com.fyber.inneractive.sdk.ignite.j jVar = com.fyber.inneractive.sdk.ignite.j.FAILED_TO_BIND_SERVICE;
                    com.fyber.inneractive.sdk.ignite.h hVar2 = this.f18762b;
                    if (hVar2.f15788i || (vVar = this.f18768h) == null) {
                        return;
                    }
                    hVar2.f15788i = true;
                    vVar.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_START, null, jVar.a(), null);
                }
            }
        }
    }

    public final void d(String str) {
        com.fyber.inneractive.sdk.util.r.f18607b.post(new o0(this, str));
    }

    public v0(w0 w0Var) {
        this.f18763c = w0Var.f18788a;
        this.f18764d = w0Var.f18789b;
        this.f18765e = w0Var.f18790c;
        this.f18773m = w0Var.f18791d;
        this.f18766f = w0Var.f18792e;
        this.f18767g = w0Var.f18793f;
        this.f18768h = w0Var.f18794g;
        com.fyber.inneractive.sdk.ignite.h hVar = IAConfigManager.O.E;
        this.f18762b = hVar;
        hVar.f15787h.add(this);
        this.f18761a = new WebView(com.fyber.inneractive.sdk.util.o.f18599a);
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str) {
        this.f18786z = true;
        if (this.f18770j.equals(str)) {
            this.f18762b.m();
            d("onInstallStart();");
        }
    }

    public final void e(String str) {
        int iIntValue;
        if (!TextUtils.isEmpty(str)) {
            this.f18771k = str;
            WebSettings settings = this.f18761a.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setUseWideViewPort(true);
            this.f18761a.setInitialScale(1);
            this.f18761a.setBackgroundColor(-1);
            this.f18761a.setWebViewClient(this.E);
            WebView webView = this.f18761a;
            webView.setLongClickable(false);
            webView.setOnLongClickListener(new com.fyber.inneractive.sdk.util.p0());
            DTExchangeNetworkBridge.onAddedJavascriptInterface(this.f18761a, new u0(this), "nativeInterface");
            DTExchangeNetworkBridge.webviewLoadUrl(this.f18761a, str);
            com.fyber.inneractive.sdk.config.global.r rVar = this.f18773m;
            if (rVar != null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Integer numA = ((com.fyber.inneractive.sdk.config.global.features.q) rVar.a(com.fyber.inneractive.sdk.config.global.features.q.class)).a("load_timeout");
                int i10 = 10;
                if (numA != null) {
                    iIntValue = numA.intValue();
                } else {
                    iIntValue = 10;
                }
                if (iIntValue < 30 && iIntValue > 2) {
                    i10 = iIntValue;
                }
                long millis = timeUnit.toMillis(i10);
                this.f18774n = millis;
                IAlog.a("InternalStoreWebpageController: Starting load timeout with %d", Long.valueOf(millis));
            }
            this.f18775o = System.currentTimeMillis();
            n0 n0Var = new n0(this);
            this.f18776p = n0Var;
            com.fyber.inneractive.sdk.util.r.f18607b.postDelayed(n0Var, this.f18774n);
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str, int i10, double d10) {
        if (this.f18770j.equals(str)) {
            if (i10 == 0) {
                d(String.format("onDownloadProgress(%f);", Double.valueOf(d10)));
            } else {
                if (i10 != 1) {
                    return;
                }
                d("onInstallationProgress();");
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str, String str2, String str3) {
        com.fyber.inneractive.sdk.flow.v vVar;
        IIgniteServiceAPI iIgniteServiceAPI;
        if (this.D) {
            this.f18786z = false;
            if (this.f18770j.equals(str)) {
                this.f18762b.m();
                if (!this.f18782v.get() && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str2) && str2.equals("App already installed")) {
                    d("onInstallationSuccess();");
                    this.A = true;
                    return;
                }
            }
            if ((str2 != null && (str2.equals(com.fyber.inneractive.sdk.ignite.j.NOT_CONNECTED.a()) || str2.equals(com.fyber.inneractive.sdk.ignite.j.SESSION_EXPIRED.a()))) || !this.f18762b.n()) {
                if (this.f18780t.getAndIncrement() < 2) {
                    this.f18762b.a(new p0(this, str2, str3));
                    return;
                }
                this.f18762b.m();
                d("onInstallationFailed();");
                com.fyber.inneractive.sdk.ignite.h hVar = this.f18762b;
                com.fyber.inneractive.sdk.ignite.l lVar = hVar.f15795p;
                if (lVar == null || !lVar.isConnected() || (iIgniteServiceAPI = hVar.f15781b) == null || !iIgniteServiceAPI.asBinder().isBinderAlive()) {
                    com.fyber.inneractive.sdk.ignite.j jVar = com.fyber.inneractive.sdk.ignite.j.FAILED_TO_BIND_SERVICE;
                    com.fyber.inneractive.sdk.ignite.h hVar2 = this.f18762b;
                    if (!hVar2.f15788i && (vVar = this.f18768h) != null) {
                        hVar2.f15788i = true;
                        vVar.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_START, null, jVar.a(), null);
                    }
                }
            } else if (!TextUtils.equals(str2, com.fyber.inneractive.sdk.ignite.j.DOWNLOAD_IS_CANCELLED.a())) {
                this.f18762b.m();
                d("onInstallationFailed();");
            }
            com.fyber.inneractive.sdk.ignite.m mVar = this.f18764d;
            if (mVar != null) {
                this.f18768h.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_INSTALL_APP, str2, str3, mVar);
            }
        }
    }
}
