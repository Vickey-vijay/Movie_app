package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.browser.customtabs.CustomTabsSession;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.c2;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.e8;
import com.applovin.impl.f2;
import com.applovin.impl.f4;
import com.applovin.impl.h4;
import com.applovin.impl.l2;
import com.applovin.impl.n1;
import com.applovin.impl.n7;
import com.applovin.impl.o8;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.t4;
import com.applovin.impl.v2;
import com.applovin.impl.x4;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class a implements AppLovinCommunicatorSubscriber, AppLovinBroadcastManager.Receiver {
    private volatile AppLovinAdLoadListener A;
    private volatile AppLovinAdDisplayListener B;
    private volatile AppLovinAdViewEventListener C;
    private volatile AppLovinAdClickListener D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f6878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewGroup f6879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.applovin.impl.sdk.k f6880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppLovinAdServiceImpl f6881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.o f6882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AppLovinCommunicator f6883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f6884g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AppLovinAdSize f6886i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f6887j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CustomTabsSession f6888k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.applovin.impl.adview.c f6889l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private e f6890m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.applovin.impl.adview.b f6891n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private WebView f6892o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private k f6893p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Runnable f6894q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Runnable f6895r;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f6885h = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile com.applovin.impl.sdk.ad.b f6896s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile AppLovinAd f6897t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private f f6898u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private f f6899v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final AtomicReference f6900w = new AtomicReference();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f6901x = new AtomicBoolean();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private volatile boolean f6902y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private volatile boolean f6903z = false;

    /* JADX INFO: renamed from: com.applovin.impl.adview.a$a, reason: collision with other inner class name */
    public class C0030a extends t4 {
        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44955a, view, url);
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44955a, view, url);
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f44955a, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
            return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f44955a, view, url, super.shouldInterceptRequest(view, url));
        }

        public C0030a() {
        }

        @Override // com.applovin.impl.t4
        public Map a() {
            return CollectionUtils.hashMap("name", "AdViewController:GAWebView");
        }
    }

    public interface b {
        void a(a aVar);
    }

    public class c implements Runnable {
        private c() {
        }

        public /* synthetic */ c(a aVar, C0030a c0030a) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f6891n != null) {
                a.this.f6891n.setVisibility(8);
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: com.applovin.impl.adview.a$d$a, reason: collision with other inner class name */
        public class C0031a implements k.a {
            public C0031a() {
            }

            @Override // com.applovin.impl.adview.k.a
            public void a() {
                a.this.f6891n.addView(a.this.f6893p, new ViewGroup.LayoutParams(-1, -1));
            }

            @Override // com.applovin.impl.adview.k.a
            public void b() {
                com.applovin.impl.sdk.o unused = a.this.f6882e;
                if (com.applovin.impl.sdk.o.a()) {
                    a.this.f6882e.b("AppLovinAdView", "Watermark failed to render.");
                }
            }
        }

        private d() {
        }

        public /* synthetic */ d(a aVar, C0030a c0030a) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f6896s != null) {
                if (a.this.f6891n == null) {
                    com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to render advertisement for ad #" + a.this.f6896s.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
                    t2.a(a.this.C, a.this.f6896s, (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "renderTask");
                    CollectionUtils.putStringIfValid("error_message", "Ad view failed to render due to null adView", mapHashMap);
                    a.this.f6880c.g().a(d2.F, a.this.f6896s, mapHashMap);
                    return;
                }
                a.this.v();
                com.applovin.impl.sdk.o unused = a.this.f6882e;
                if (com.applovin.impl.sdk.o.a()) {
                    a.this.f6882e.a("AppLovinAdView", "Rendering advertisement ad for #" + a.this.f6896s.getAdIdNumber() + "...");
                }
                a.b(a.this.f6891n, a.this.f6896s.getSize());
                if (a.this.f6893p != null) {
                    e8.c(a.this.f6893p);
                    a.this.f6893p = null;
                }
                c2 c2Var = new c2(a.this.f6885h, a.this.f6880c);
                if (c2Var.c()) {
                    a.this.f6893p = new k(c2Var, a.this.f6878a);
                    a.this.f6893p.a(new C0031a());
                }
                a.this.f6891n.setAdHtmlLoaded(false);
                a.this.f6891n.a(a.this.f6896s);
                if (a.this.f6896s.getSize() == AppLovinAdSize.INTERSTITIAL || a.this.f6903z) {
                    return;
                }
                a.this.f6896s.setHasShown(true);
            }
        }
    }

    public static class e implements AppLovinAdLoadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f6908a;

        private a a() {
            return this.f6908a;
        }

        public e(a aVar, com.applovin.impl.sdk.k kVar) {
            if (aVar != null) {
                if (kVar != null) {
                    this.f6908a = aVar;
                    return;
                }
                throw new IllegalArgumentException("No sdk specified");
            }
            throw new IllegalArgumentException("No view specified");
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            a aVarA = a();
            if (aVarA != null) {
                aVarA.b(appLovinAd);
            } else {
                com.applovin.impl.sdk.o.h("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            a aVarA = a();
            if (aVarA != null) {
                aVarA.b(i10);
            }
        }
    }

    private void m() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f6882e.a("AppLovinAdView", "handleApplicationPaused()");
        }
        b("javascript:al_onAppPaused();");
    }

    private void n() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f6882e.a("AppLovinAdView", "handleApplicationResumed()");
        }
        b("javascript:al_onAppResumed();");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this.f6891n, "/", "<html></html>", "text/html", null, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        com.applovin.impl.adview.b bVar;
        d();
        if (this.f6879b == null || (bVar = this.f6891n) == null || bVar.getParent() != null) {
            return;
        }
        this.f6879b.addView(this.f6891n);
        b(this.f6891n, this.f6896s.getSize());
        if (this.f6896s.isOpenMeasurementEnabled()) {
            this.f6896s.getAdEventTracker().a((View) this.f6891n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        if (this.f6891n != null && this.f6898u != null) {
            a();
        }
        E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        if (this.f6898u != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6882e.a("AppLovinAdView", "Detaching expanded ad: " + this.f6898u.b());
            }
            this.f6899v = this.f6898u;
            this.f6898u = null;
            a(this.f6886i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        com.applovin.impl.sdk.ad.a aVarB;
        f fVar = this.f6899v;
        if (fVar == null && this.f6898u == null) {
            return;
        }
        if (fVar != null) {
            aVarB = fVar.b();
            this.f6899v.dismiss();
            this.f6899v = null;
        } else {
            aVarB = this.f6898u.b();
            this.f6898u.dismiss();
            this.f6898u = null;
        }
        t2.a(this.C, aVarB, (AppLovinAdView) this.f6879b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        AppLovinNetworkBridge.webviewLoadUrl(f(), "chrome://crash");
    }

    public AppLovinAdSize k() {
        return this.f6886i;
    }

    public String l() {
        return this.f6887j;
    }

    private void E() {
        if (this.f6882e != null && com.applovin.impl.sdk.o.a() && com.applovin.impl.sdk.o.a()) {
            this.f6882e.a("AppLovinAdView", "Destroying...");
        }
        o8.b(this.f6891n);
        this.f6891n = null;
        o8.b(this.f6892o);
        this.f6892o = null;
        this.f6888k = null;
        this.A = null;
        this.B = null;
        this.D = null;
        this.C = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f6903z = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(View view, AppLovinAdSize appLovinAdSize) {
        int iApplyDimension;
        if (view == null) {
            return;
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        AppLovinAdSize appLovinAdSize2 = AppLovinAdSize.INTERSTITIAL;
        int iApplyDimension2 = -1;
        if (appLovinAdSize == appLovinAdSize2 || appLovinAdSize == AppLovinAdSize.BANNER) {
            iApplyDimension = -1;
        } else {
            iApplyDimension = appLovinAdSize.getWidth() == -1 ? displayMetrics.widthPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getWidth(), displayMetrics);
        }
        if (appLovinAdSize != appLovinAdSize2 && appLovinAdSize != AppLovinAdSize.BANNER) {
            iApplyDimension2 = appLovinAdSize.getHeight() == -1 ? displayMetrics.heightPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getHeight(), displayMetrics);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = iApplyDimension;
        layoutParams.height = iApplyDimension2;
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(13);
        }
        view.setLayoutParams(layoutParams);
    }

    private void c() {
        a(new Runnable() { // from class: com.applovin.impl.adview.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f6982b.r();
            }
        });
    }

    private void d() {
        a(new Runnable() { // from class: com.applovin.impl.adview.a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f6909b.s();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        com.applovin.impl.sdk.ad.b bVar = this.f6896s;
        v2 v2Var = new v2();
        v2Var.a().a(bVar).a(i());
        if (!n7.a(bVar.getSize())) {
            v2Var.a().a("Fullscreen Ad Properties").b(bVar);
        }
        v2Var.a(this.f6880c);
        v2Var.a();
        if (com.applovin.impl.sdk.o.a()) {
            this.f6882e.a("AppLovinAdView", v2Var.toString());
        }
    }

    private void x() {
        if (this.f6896s.P0()) {
            int iC = this.f6880c.p().c();
            if (com.applovin.impl.sdk.i.a(iC)) {
                this.f6891n.a("javascript:al_muteSwitchOn();");
            } else if (iC == 2) {
                this.f6891n.a("javascript:al_muteSwitchOff();");
            }
        }
    }

    private void y() {
        if (n7.a(this.f6886i)) {
            if (((Boolean) this.f6880c.a(x4.E1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
            if (((Boolean) this.f6880c.a(x4.F1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_shown"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_hidden"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_failure"));
            }
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_success"));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_failure"));
            if (((Boolean) this.f6880c.a(x4.G1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_success"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_failure"));
            }
            if (((Boolean) this.f6880c.a(x4.H1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_success"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_failure"));
            }
        }
    }

    public void C() {
        if (this.f6902y) {
            if (this.f6896s == null || !this.f6896s.Z0()) {
                t2.b(this.B, this.f6896s);
            }
            if (this.f6896s != null && this.f6896s.isOpenMeasurementEnabled() && n7.a(this.f6896s.getSize())) {
                this.f6896s.getAdEventTracker().f();
            }
            if (this.f6891n != null && this.f6898u != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6882e.a("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
                }
                c();
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f6882e.a("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
            }
            b("javascript:al_onDetachedFromWindow();");
        }
    }

    public void D() {
        if (!this.f6902y || this.f6903z) {
            return;
        }
        this.f6903z = true;
    }

    public void F() {
        if (this.f6902y) {
            AppLovinAd appLovinAd = (AppLovinAd) this.f6900w.getAndSet(null);
            if (appLovinAd != null) {
                c(appLovinAd);
            }
            this.f6903z = false;
        }
    }

    public AppLovinAdViewEventListener e() {
        return this.C;
    }

    public com.applovin.impl.adview.b f() {
        return this.f6891n;
    }

    public com.applovin.impl.sdk.ad.b g() {
        return this.f6896s;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return a.class.getSimpleName();
    }

    public CustomTabsSession h() {
        return this.f6888k;
    }

    public AppLovinAdView i() {
        return (AppLovinAdView) this.f6879b;
    }

    public com.applovin.impl.sdk.k j() {
        return this.f6880c;
    }

    public void u() {
        if (this.f6880c == null || this.f6890m == null || this.f6878a == null || !this.f6902y) {
            com.applovin.impl.sdk.o.i("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        } else {
            this.f6881d.loadNextAd(this.f6887j, this.f6886i, this.f6890m);
        }
    }

    public void w() {
        if ((this.f6878a instanceof n1) && this.f6896s != null && this.f6896s.K() == com.applovin.impl.sdk.ad.b.EnumC0045b.DISMISS) {
            ((n1) this.f6878a).dismiss("postitial_click");
        }
    }

    public void z() {
        if (this.f6898u != null || this.f6899v != null) {
            a();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f6882e.a("AppLovinAdView", "Ad: " + this.f6896s + " closed.");
        }
        a(this.f6895r);
        t2.b(this.B, this.f6896s);
        this.f6896s = null;
    }

    private void d(String str, Map map) {
        a(o8.d(str, map));
    }

    public void A() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f6882e.a("AppLovinAdView", "AdView fully watched...");
        }
        b bVar = this.f6884g;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void B() {
        y();
        if (this.f6896s != null && this.f6896s.r0()) {
            com.applovin.impl.g.a(this.f6891n, this.f6880c);
        }
        b("javascript:al_onAttachedToWindow();");
    }

    public void c(int i10) {
        String strA = e8.a(i10);
        if (com.applovin.impl.sdk.o.a()) {
            this.f6882e.a("AppLovinAdView", "onWindowVisibilityChanged( " + strA + " )");
        }
        b("javascript:al_onWindowVisibilityChanged( " + strA + " );");
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            a(new Runnable() { // from class: com.applovin.impl.adview.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6997b.t();
                }
            });
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (action == null) {
        }
        switch (action) {
            case "com.applovin.custom_intent_launch_failure":
            case "com.applovin.custom_intent_launch_success":
                a(action, map);
                break;
            case "com.applovin.external_redirect_success":
            case "com.applovin.external_redirect_failure":
                c(action, map);
                break;
            case "com.applovin.custom_tabs_failure":
            case "com.applovin.custom_tabs_hidden":
            case "com.applovin.custom_tabs_shown":
                b(action, map);
                break;
            case "com.applovin.application_paused":
                m();
                break;
            case "com.applovin.application_resumed":
                n();
                break;
            case "com.applovin.preload_success":
            case "com.applovin.preload_failure":
                d(action, map);
                break;
        }
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.A = appLovinAdLoadListener;
    }

    public void a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.B = appLovinAdDisplayListener;
    }

    public void c(AppLovinAd appLovinAd) {
        a(appLovinAd, (String) null);
    }

    public void a(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.C = appLovinAdViewEventListener;
    }

    public void c(WebView webView) {
        a(webView, (String) null);
    }

    private void c(String str, Map map) {
        a(o8.c(str, map));
    }

    public void a(AppLovinAdClickListener appLovinAdClickListener) {
        this.D = appLovinAdClickListener;
    }

    private void a(AppLovinAdView appLovinAdView, com.applovin.impl.sdk.k kVar, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (appLovinAdSize != null) {
            this.f6880c = kVar;
            this.f6881d = kVar.k();
            this.f6882e = kVar.O();
            this.f6883f = AppLovinCommunicator.getInstance(context);
            this.f6886i = appLovinAdSize;
            this.f6887j = str;
            if (!(context instanceof AppLovinFullscreenActivity)) {
                context = context.getApplicationContext();
            }
            this.f6878a = context;
            this.f6879b = appLovinAdView;
            this.f6889l = new com.applovin.impl.adview.c(this, kVar);
            C0030a c0030a = null;
            this.f6895r = new c(this, c0030a);
            this.f6894q = new d(this, c0030a);
            this.f6890m = new e(this, kVar);
            a(appLovinAdSize);
            return;
        }
        throw new IllegalArgumentException("No ad size specified");
    }

    public void b() {
        a(new Runnable() { // from class: com.applovin.impl.adview.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f6996b.q();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView) {
        this.f6896s.getAdEventTracker().c(webView);
        k kVar = this.f6893p;
        if (kVar != null && kVar.a()) {
            f4 adEventTracker = this.f6896s.getAdEventTracker();
            k kVar2 = this.f6893p;
            adEventTracker.b(webView, Collections.singletonList(new h4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier())));
        } else {
            this.f6896s.getAdEventTracker().a((View) webView);
        }
        this.f6896s.getAdEventTracker().h();
        this.f6896s.getAdEventTracker().g();
    }

    public void a(AppLovinAdSize appLovinAdSize) {
        try {
            com.applovin.impl.adview.b bVar = new com.applovin.impl.adview.b(this.f6889l, this.f6880c, this.f6878a);
            this.f6891n = bVar;
            bVar.setBackgroundColor(0);
            this.f6891n.setWillNotCacheDrawing(false);
            this.f6879b.setBackgroundColor(0);
            this.f6879b.addView(this.f6891n);
            b(this.f6891n, appLovinAdSize);
            if (!this.f6902y) {
                a(this.f6895r);
            }
            a(new Runnable() { // from class: com.applovin.impl.adview.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6985b.o();
                }
            });
            this.f6902y = true;
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("AppLovinAdView", "Failed to initialize AdWebView", th2);
            this.f6880c.D().a("AppLovinAdView", "initAdWebView", th2);
            this.f6901x.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(MotionEvent motionEvent) {
        if (this.f6898u == null && (this.f6896s instanceof com.applovin.impl.sdk.ad.a) && this.f6891n != null) {
            com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f6896s;
            Context context = this.f6878a;
            Activity activityB = context instanceof Activity ? (Activity) context : e8.b(this.f6891n, this.f6880c);
            if (activityB != null && !activityB.isFinishing()) {
                ViewGroup viewGroup = this.f6879b;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f6891n);
                }
                f fVar = new f(aVar, this.f6891n, activityB, this.f6880c);
                this.f6898u = fVar;
                fVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.u
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        this.f6992b.a(dialogInterface);
                    }
                });
                this.f6898u.show();
                t2.c(this.C, this.f6896s, (AppLovinAdView) this.f6879b);
                if (this.f6896s.isOpenMeasurementEnabled()) {
                    this.f6896s.getAdEventTracker().a((View) this.f6898u.c());
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to expand ad. No Activity found.");
            Uri uriE1 = aVar.e1();
            if (uriE1 != null) {
                this.f6881d.trackAndLaunchClick(aVar, i(), this, uriE1, motionEvent);
            }
            this.f6891n.a("javascript:al_onFailedExpand();");
        }
    }

    public void a(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (context == null) {
            com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
            return;
        }
        if (appLovinAdSize == null && (appLovinAdSize = com.applovin.impl.s.a(attributeSet)) == null) {
            appLovinAdSize = AppLovinAdSize.BANNER;
        }
        AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
        if (appLovinSdk == null) {
            appLovinSdk = AppLovinSdk.getInstance(context);
        }
        if (appLovinSdk != null) {
            a(appLovinAdView, appLovinSdk.a(), appLovinAdSize2, str, context);
            if (com.applovin.impl.s.b(attributeSet)) {
                u();
            }
        }
    }

    public void a(String str, Object obj) {
        this.f6885h.put(str, obj);
    }

    public void b(final AppLovinAd appLovinAd) {
        if (appLovinAd != null) {
            if (!this.f6903z) {
                c(appLovinAd);
            } else {
                this.f6900w.set(appLovinAd);
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6882e.a("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
                }
            }
            a(new Runnable() { // from class: com.applovin.impl.adview.t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6990b.a(appLovinAd);
                }
            });
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f6882e.b("AppLovinAdView", "No provided when to the view controller");
        }
        b(-1);
    }

    public void a(boolean z10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f6882e.a("AppLovinAdView", "onWindowFocusChanged( " + z10 + " )");
        }
        b("javascript:al_onWindowFocusChanged( " + z10 + " );");
    }

    public void a(AppLovinAd appLovinAd, String str) {
        if (appLovinAd != null) {
            n7.b(appLovinAd, this.f6880c);
            if (this.f6902y) {
                if (appLovinAd.getSize() != AppLovinAdSize.INTERSTITIAL) {
                    Map mapA = f2.a((AppLovinAdImpl) appLovinAd);
                    CollectionUtils.putStringIfValid("source", "renderAd", mapA);
                    this.f6880c.g().d(d2.C, mapA);
                }
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) n7.a(appLovinAd, this.f6880c);
                if (bVar == null) {
                    com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to retrieve the loaded ad: " + appLovinAd);
                    t2.a(this.B, "Unable to retrieve the loaded ad");
                    Map mapA2 = f2.a((AppLovinAdImpl) appLovinAd);
                    CollectionUtils.putStringIfValid("source", "noAdToRender", mapA2);
                    CollectionUtils.putStringIfValid("error_message", "Unable to retrieve the loaded ad", mapA2);
                    this.f6880c.g().d(d2.F, mapA2);
                    return;
                }
                if (bVar == this.f6896s) {
                    com.applovin.impl.sdk.o.h("AppLovinAdView", "Attempting to show ad again: " + bVar);
                    if (((Boolean) this.f6880c.a(x4.I1)).booleanValue()) {
                        if (this.B instanceof l2) {
                            t2.a(this.B, "Attempting to show ad again");
                        } else if (!n7.c(this.f6880c)) {
                            this.f6880c.g().a(d2.S0, bVar, CollectionUtils.hashMap("source", "attemptingAdReRender"));
                        } else {
                            throw new IllegalStateException("Attempting to show ad again");
                        }
                    }
                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "attemptingAdReRender");
                    CollectionUtils.putStringIfValid("error_message", "Attempting to show ad again", mapHashMap);
                    this.f6880c.g().a(d2.F, bVar, mapHashMap);
                    return;
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6882e.a("AppLovinAdView", "Rendering ad #" + bVar.getAdIdNumber() + " (" + bVar.getSize() + ")");
                }
                t2.b(this.B, this.f6896s);
                if (this.f6896s != null && this.f6896s.isOpenMeasurementEnabled()) {
                    this.f6896s.getAdEventTracker().f();
                }
                this.f6900w.set(null);
                this.f6897t = null;
                this.f6896s = bVar;
                if (this.f6896s.isCustomTabsEnabled()) {
                    this.f6888k = this.f6880c.z().a(this);
                    this.f6880c.z().b(this.f6896s.getCustomTabsWarmupUrls(), this.f6888k);
                }
                if (!this.f6903z && n7.a(this.f6886i)) {
                    this.f6880c.k().trackImpression(bVar);
                }
                if (this.f6898u != null) {
                    c();
                }
                a(this.f6894q);
                return;
            }
            com.applovin.impl.sdk.o.i("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            return;
        }
        throw new IllegalArgumentException("No ad specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i10) {
        if (!this.f6903z) {
            a(this.f6895r);
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f6998b.a(i10);
            }
        });
    }

    private void b(String str) {
        if (((Boolean) this.f6880c.a(x4.E1)).booleanValue()) {
            a(str);
        }
    }

    private void b(String str, Map map) {
        a(o8.b(str, map));
    }

    public void b(Uri uri) {
        if (this.f6896s != null && this.f6896s.w0() && this.f6892o == null) {
            String queryParameter = uri.getQueryParameter("tracking_id");
            if (TextUtils.isEmpty(queryParameter)) {
                this.f6880c.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6880c.O().b("AppLovinAdView", "Invalid tracking id. Cannot initialize GA");
                    return;
                }
                return;
            }
            WebView webView = new WebView(this.f6878a);
            this.f6892o = webView;
            webView.setWebViewClient(new C0030a());
            this.f6892o.getSettings().setJavaScriptEnabled(true);
            AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this.f6892o, (String) this.f6880c.a(x4.f9953i7), "<html><head><link rel=\"icon\" href=\"data:,\"><G-SCRIPT_TAG></head><body></body></html>".replace("<G-SCRIPT_TAG>", "<script src='https://www.googletagmanager.com/gtag/js?id=<G-TRACKING_ID>'></script><script>window.dataLayer = window.dataLayer || [];function gtag(){dataLayer.push(arguments);}gtag('js', new Date());gtag('config', '<G-TRACKING_ID>')</script>".replace("<G-TRACKING_ID>", queryParameter)), "text/html", "UTF-8", null);
        }
    }

    public void a(final WebView webView, String str) {
        if (this.f6896s == null) {
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.v
            @Override // java.lang.Runnable
            public final void run() {
                webView.setVisibility(0);
            }
        });
        if (!((Boolean) this.f6880c.a(x4.f10084y6)).booleanValue() || (str != null && str.startsWith(this.f6896s.k()))) {
            try {
                if (this.f6896s != this.f6897t) {
                    this.f6897t = this.f6896s;
                    x();
                    this.f6891n.setAdHtmlLoaded(true);
                    if (this.B != null) {
                        this.f6880c.y().d(this.f6896s);
                        if (this.f6896s.s0()) {
                            this.f6880c.g().a(d2.E, this.f6896s, CollectionUtils.hashMap("details", f2.b(this.f6896s)));
                        } else {
                            this.f6880c.g().a(d2.D, this.f6896s, CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f6896s.z())));
                            t2.a(this.B, this.f6896s);
                        }
                        if (this.f6896s.Q0()) {
                            String str2 = (String) this.f6880c.p0().a(z4.T, "");
                            JSONObject jSONObject = new JSONObject();
                            JsonUtils.putString(jSONObject, "template_browser_package_name", str2);
                            this.f6891n.a("javascript:al_onAdViewRendered(" + jSONObject + ");");
                        } else {
                            this.f6891n.a("javascript:al_onAdViewRendered();");
                        }
                        if (this.f6896s.s0()) {
                            this.f6891n.a("javascript:al_onAdRestored( '" + this.f6896s.X() + "' );");
                        }
                    }
                    if ((this.f6896s instanceof com.applovin.impl.sdk.ad.a) && this.f6896s.isOpenMeasurementEnabled()) {
                        this.f6880c.q0().a(new r6(this.f6880c, "StartOMSDK", new Runnable() { // from class: com.applovin.impl.adview.w
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f6994b.b(webView);
                            }
                        }), d6.b.OTHER, 500L);
                    }
                }
            } catch (Throwable th2) {
                com.applovin.impl.sdk.o.c("AppLovinAdView", "Exception while notifying ad display listener", th2);
                com.applovin.impl.sdk.k kVar = this.f6880c;
                if (kVar != null) {
                    kVar.D().a("AppLovinAdView", "onAdHtmlLoaded", th2);
                }
            }
        }
    }

    public void a(final MotionEvent motionEvent) {
        a(new Runnable() { // from class: com.applovin.impl.adview.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f6983b.b(motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        a();
    }

    public void a() {
        a(new Runnable() { // from class: com.applovin.impl.adview.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f6989b.p();
            }
        });
    }

    public void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, Uri uri, MotionEvent motionEvent) {
        if (appLovinAdView != null) {
            this.f6881d.trackAndLaunchClick(bVar, appLovinAdView, this, uri, motionEvent);
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f6882e.b("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
        }
        t2.a(this.D, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAd appLovinAd) {
        if (this.f6901x.compareAndSet(true, false)) {
            a(this.f6886i);
        }
        try {
            if (this.A != null) {
                this.A.adReceived(appLovinAd);
            }
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.h("AppLovinAdView", "Exception while running ad load callback: " + th2.getMessage());
            com.applovin.impl.sdk.k kVar = this.f6880c;
            if (kVar != null) {
                kVar.D().a("AppLovinAdView", "notifyAdLoadedCallback", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i10) {
        try {
            if (this.A != null) {
                this.A.failedToReceiveAd(i10);
            }
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("AppLovinAdView", "Exception while running app load callback", th2);
            com.applovin.impl.sdk.k kVar = this.f6880c;
            if (kVar != null) {
                kVar.D().a("AppLovinAdView", "notifyAdLoadFailedCallback", th2);
            }
        }
    }

    private void a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    public void a(b bVar) {
        this.f6884g = bVar;
    }

    private void a(String str, Map map) {
        a(o8.a(str, map));
    }

    private void a(String str) {
        if (this.f6896s == null || this.f6891n == null || !n7.a(this.f6896s.getSize()) || !StringUtils.isValidString(str)) {
            return;
        }
        this.f6891n.a(str);
    }

    public void a(Uri uri) {
        if (this.f6896s == null || !this.f6896s.w0()) {
            return;
        }
        if (this.f6892o == null) {
            this.f6880c.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f6880c.O().a("AppLovinAdView", "GA is not initialized. Cannot fire GA event");
                return;
            }
            return;
        }
        final String queryParameter = uri.getQueryParameter("event_name");
        final String queryParameter2 = uri.getQueryParameter("event_params_json");
        if (TextUtils.isEmpty(queryParameter)) {
            this.f6880c.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f6880c.O().a("AppLovinAdView", "Invalid GA event name. Cannot fire GA event");
                return;
            }
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f6986b.a(queryParameter2, queryParameter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2) {
        String str3;
        if (StringUtils.isValidString(str)) {
            str3 = "gtag('event', '" + str2 + "', " + str + ");";
        } else {
            str3 = "gtag('event', '" + str2 + "')";
        }
        if (((Boolean) this.f6880c.a(x4.Q2)).booleanValue()) {
            o8.a(this.f6892o, str3, this.f6880c);
        } else {
            o8.a(this.f6892o, str3);
        }
    }
}
