package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.CookieManager;
import com.inmobi.media.V5;
import com.inmobi.media.core.config.models.AdConfig;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.partials.NetworkBridge;
import com.safedk.android.utils.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class V5 extends AbstractC3320y2 implements InterfaceC3061nh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f23675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f23677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f23678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bk.l f23679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3028m9 f23680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public U5 f23681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f23682i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ya f23683j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f23684k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f23685l;

    public static final mj.r a(V5 v10) {
        T5 t10;
        ViewParent parent = v10.getParent();
        Q5 q10 = parent instanceof Q5 ? (Q5) parent : null;
        if (q10 != null && (t10 = q10.f23370d) != null) {
            C c10 = ((L8) t10).f23064a.f23142b;
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = c10 instanceof GestureDetectorOnGestureListenerC2785ci ? (GestureDetectorOnGestureListenerC2785ci) c10 : null;
            if (gestureDetectorOnGestureListenerC2785ci != null) {
                gestureDetectorOnGestureListenerC2785ci.D();
            }
        }
        return mj.r.f64562a;
    }

    private void safedk_webview_V5_webviewLoadData_172d49d32092f6f80826f3dca3960029(String p10, String p11, String p12) {
        Logger.d("InMobiNetwork|SafeDK: Partial-Network> Lcom/inmobi/media/V5;->safedk_webview_V5_webviewLoadData_172d49d32092f6f80826f3dca3960029(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        boolean z10 = SafeDK.getInstance() != null && SafeDK.getInstance().o();
        Logger.d("SafeDKNetwork", "webviewLoadData invoked, WebView address : " + this + ", isSafeDKInitialized = " + z10 + ", SDK_PACKAGE_NAME = " + com.safedk.android.utils.g.f44963i);
        if (z10) {
            CreativeInfoManager.a((String) null, p10, this, com.safedk.android.utils.g.f44963i);
            SafeDKWebAppInterface.a(com.safedk.android.utils.g.f44963i, this, p10);
        }
        super.loadData(p10, p11, p12);
    }

    private void safedk_webview_V5_webviewLoadUrl_e3177bcd2c23ea94d3766e04b80fd51e(String p10) {
        Logger.d("InMobiNetwork|SafeDK: Partial-Network> Lcom/inmobi/media/V5;->safedk_webview_V5_webviewLoadUrl_e3177bcd2c23ea94d3766e04b80fd51e(Ljava/lang/String;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: " + p10 + ", WebView address : " + toString() + "  SDK_PACKAGE_NAME = " + com.safedk.android.utils.g.f44963i);
            NetworkBridge.logWebviewLoadURLRequest(com.safedk.android.utils.g.f44963i, this, p10);
            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(com.safedk.android.utils.g.f44963i);
            if (adNetworkDiscoveryH != null && adNetworkDiscoveryH.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                CreativeInfoManager.a(p10, (String) null, this, com.safedk.android.utils.g.f44963i);
            }
            SafeDKWebAppInterface.a(com.safedk.android.utils.g.f44963i, this, p10);
        }
        super.loadUrl(p10);
    }

    @Override // com.inmobi.media.AbstractC3320y2, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44963i, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.inmobi.media.AbstractC3320y2, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V5(Context context, long j10, String str, String str2, String str3, bk.l lVar, InterfaceC3028m9 interfaceC3028m9) {
        super(context);
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(str, "placementType");
        ck.p.j(str2, "impressionId");
        ck.p.j(str3, "creativeId");
        ck.p.j(lVar, "onLpLifecycleEvent");
        this.f23675b = j10;
        this.f23676c = str;
        this.f23677d = str2;
        this.f23678e = str3;
        this.f23679f = lVar;
        this.f23680g = interfaceC3028m9;
        this.f23682i = V5.class.getSimpleName();
        setImportantForAccessibility(2);
        getSettings().setJavaScriptEnabled(true);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        e();
        if (getAdConfig().getEnableCookiesOnInAppBrowser()) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this, true);
        }
    }

    private final AdConfig getAdConfig() {
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(AdConfig.class, "clazz");
        return (AdConfig) Y3.f23815a.a(AdConfig.class);
    }

    private final AdConfig.RenderingConfig getRenderingConfig() {
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(AdConfig.class, "clazz");
        return ((AdConfig) Y3.f23815a.a(AdConfig.class)).getRendering();
    }

    @Override // com.inmobi.media.InterfaceC3061nh
    public final boolean c() {
        ck.p.i(this.f23682i, "TAG");
        return !getRenderingConfig().getAutoRedirectionEnforcement() || ((getViewTouchTimestamp() > (-1L) ? 1 : (getViewTouchTimestamp() == (-1L) ? 0 : -1)) != 0 && ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) > getRenderingConfig().getUserTouchResetTime() ? 1 : ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) == getRenderingConfig().getUserTouchResetTime() ? 0 : -1)) < 0);
    }

    @Override // com.inmobi.media.AbstractC3320y2
    public final Ua d() {
        Va va2 = new Va(true, null, getAdConfig().isCCTEnabled(), 18);
        Context context = getContext();
        ck.p.i(context, "getContext(...)");
        return new Ua(context, va2, null, this, null, this.f23680g, 140);
    }

    public final void e() {
        U5 u10 = new U5("IN_CUSTOM_EXPAND", new bk.a() { // from class: b7.v4
            @Override // bk.a
            public final Object invoke() {
                return V5.a(this.f5211b);
            }
        }, new bk.l() { // from class: b7.w4
            @Override // bk.l
            public final Object invoke(Object obj) {
                return V5.a(this.f5226b, (JSONObject) obj);
            }
        }, new bk.p() { // from class: b7.x4
            @Override // bk.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo1invoke(Object obj, Object obj2) {
                return V5.a(this.f5246b, (String) obj, (Map) obj2);
            }
        }, this.f23680g);
        setWebViewClient(u10);
        this.f23681h = u10;
    }

    public final Ya getLandingPageTelemetryControlInfo() {
        return this.f23683j;
    }

    @Override // com.inmobi.media.InterfaceC3061nh
    public long getViewTouchTimestamp() {
        return this.f23675b;
    }

    @Override // android.webkit.WebView
    public final void loadData(String str, String str2, String str3) {
        ck.p.j(str, "data");
        safedk_webview_V5_webviewLoadData_172d49d32092f6f80826f3dca3960029(str, str2, str3);
        U5 u10 = this.f23681h;
        if (u10 != null) {
            u10.f25825d = true;
        }
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str) {
        ck.p.j(str, "url");
        safedk_webview_V5_webviewLoadUrl_e3177bcd2c23ea94d3766e04b80fd51e(str);
        U5 u10 = this.f23681h;
        if (u10 != null) {
            u10.f25825d = true;
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        if (!this.f23685l) {
            this.f23685l = true;
            bk.l lVar = this.f23679f;
            GestureDetectorOnGestureListenerC2785ci.f24139e1.getClass();
            lVar.invoke(Mh.a("IN_CUSTOM_EXPAND", "onScroll"));
        }
        super.onScrollChanged(i10, i11, i12, i13);
    }

    public final void setLandingPageTelemetryControlInfo(Ya ya2) {
        this.f23683j = ya2;
        U5 u10 = this.f23681h;
        if (u10 != null) {
            u10.f23619j = ya2;
            u10.f23620k = new Wa(ya2, u10);
        }
    }

    public void setViewTouchTimestamp(long j10) {
        this.f23675b = j10;
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        if (!this.f23684k) {
            this.f23684k = true;
            bk.l lVar = this.f23679f;
            GestureDetectorOnGestureListenerC2785ci.f24139e1.getClass();
            lVar.invoke(Mh.a("IN_CUSTOM_EXPAND", "onInteraction"));
        }
        return super.onTouchEvent(motionEvent);
    }

    public static final mj.r a(V5 v10, JSONObject jSONObject) {
        ck.p.j(jSONObject, "it");
        v10.f23679f.invoke(jSONObject);
        return mj.r.f64562a;
    }

    public static final mj.r a(V5 v10, String str, Map map) {
        ck.p.j(str, "trackerName");
        ck.p.j(map, "macros");
        ViewParent parent = v10.getParent();
        Q5 q10 = parent instanceof Q5 ? (Q5) parent : null;
        if (q10 != null) {
            ck.p.j(str, "trackerName");
            ck.p.j(map, "macros");
            T5 t10 = q10.f23370d;
            if (t10 != null) {
                ck.p.j(str, "trackerName");
                ck.p.j(map, "macros");
                C c10 = ((L8) t10).f23064a.f23142b;
                GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = c10 instanceof GestureDetectorOnGestureListenerC2785ci ? (GestureDetectorOnGestureListenerC2785ci) c10 : null;
                if (gestureDetectorOnGestureListenerC2785ci != null) {
                    gestureDetectorOnGestureListenerC2785ci.b(str, map);
                }
            }
        }
        return mj.r.f64562a;
    }

    @Override // com.inmobi.media.InterfaceC3061nh
    public final boolean a() {
        ck.p.i(this.f23682i, "TAG");
        return !getRenderingConfig().getAutoRedirectionEnforcement() || ((getViewTouchTimestamp() > (-1L) ? 1 : (getViewTouchTimestamp() == (-1L) ? 0 : -1)) != 0 && ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) > getRenderingConfig().getUserTouchResetTime() ? 1 : ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) == getRenderingConfig().getUserTouchResetTime() ? 0 : -1)) < 0);
    }

    @Override // com.inmobi.media.InterfaceC3061nh
    public final void a(String str) {
        ck.p.j(str, "api");
        HashMap map = new HashMap();
        map.put("creativeId", this.f23678e);
        map.put("trigger", str);
        map.put("impressionId", this.f23677d);
        map.put("adType", this.f23676c);
        Wj wj2 = Wj.f23753a;
        Wj.b("BlockAutoRedirection", map, EnumC2735ak.SDK);
    }
}
