package com.applovin.impl.adview;

import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.view.MotionEvent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.a8;
import com.applovin.impl.d2;
import com.applovin.impl.f2;
import com.applovin.impl.k7;
import com.applovin.impl.n7;
import com.applovin.impl.o7;
import com.applovin.impl.r7;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t4;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinAdSize;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class c extends t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f6940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f6941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f6942c;

    @Override // com.applovin.impl.t4
    public Map a() {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("name", "AdWebViewClient");
        mapHashMap.putAll(f2.a((AppLovinAdImpl) this.f6942c.g()));
        return mapHashMap;
    }

    @Override // com.applovin.impl.t4, android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/adview/c;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44955a, webView, str);
        safedk_c_onLoadResource_1af43fc902fb6865fb0a01b3cce96a24(webView, str);
    }

    @Override // com.applovin.impl.t4, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/adview/c;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44955a, webView, str);
        safedk_c_onPageFinished_a44c2ec5ed56e4c2419c3d079c098b25(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    public boolean safedk_c_shouldOverrideUrlLoading_678f8c4351efae3cc506edb28e260cba(WebView p10, WebResourceRequest p11) {
        Uri url = p11.getUrl();
        if (url != null) {
            return a(p10, url.toString());
        }
        if (!com.applovin.impl.sdk.o.a()) {
            return false;
        }
        this.f6941b.b("AdWebView", "No url found for request");
        return false;
    }

    @Override // com.applovin.impl.t4, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f44955a, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // com.applovin.impl.t4, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f44955a, view, url, super.shouldInterceptRequest(view, url));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/adview/c;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean zSafedk_c_shouldOverrideUrlLoading_678f8c4351efae3cc506edb28e260cba = safedk_c_shouldOverrideUrlLoading_678f8c4351efae3cc506edb28e260cba(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoadingWithHeaders(com.safedk.android.utils.g.f44955a, webView, webResourceRequest, zSafedk_c_shouldOverrideUrlLoading_678f8c4351efae3cc506edb28e260cba);
        return zSafedk_c_shouldOverrideUrlLoading_678f8c4351efae3cc506edb28e260cba;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/adview/c;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_c_shouldOverrideUrlLoading_2ce55369ff10fa536fb839524e517b10 = safedk_c_shouldOverrideUrlLoading_2ce55369ff10fa536fb839524e517b10(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f44955a, webView, str, zSafedk_c_shouldOverrideUrlLoading_2ce55369ff10fa536fb839524e517b10);
        return zSafedk_c_shouldOverrideUrlLoading_2ce55369ff10fa536fb839524e517b10;
    }

    private void b() {
        this.f6942c.z();
    }

    private void c() {
        this.f6942c.a();
    }

    public a d() {
        return this.f6942c;
    }

    @Override // com.applovin.impl.t4, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.render_process_gone"), null);
        com.applovin.impl.sdk.ad.b bVarG = this.f6942c.g();
        com.applovin.impl.sdk.o.h("AdWebView", "Render process gone for ad: " + bVarG + ". Process did crash: " + renderProcessGoneDetail.didCrash());
        boolean zOnRenderProcessGone = super.onRenderProcessGone(webView, renderProcessGoneDetail);
        if (((Boolean) this.f6940a.a(x4.R5)).booleanValue()) {
            a(webView, renderProcessGoneDetail, bVarG);
        }
        return zOnRenderProcessGone;
    }

    public c(a aVar, com.applovin.impl.sdk.k kVar) {
        this.f6940a = kVar;
        this.f6941b = kVar.O();
        this.f6942c = aVar;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        com.applovin.impl.sdk.ad.b bVarG = this.f6942c.g();
        String str3 = "Received error with error code: " + i10 + " with description \\'" + str + "\\' for URL: " + str2;
        if (com.applovin.impl.sdk.o.a()) {
            this.f6941b.b("AdWebView", str3 + " for ad: " + bVarG);
        }
        if (n7.a(str2, this.f6940a)) {
            this.f6940a.D().a("adWebViewReceivedError", str2, i10, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        com.applovin.impl.sdk.ad.b bVarG = this.f6942c.g();
        if (com.applovin.impl.sdk.o.a()) {
            this.f6941b.b("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + bVarG);
        }
        if (n7.a(webResourceRequest.getUrl().toString(), this.f6940a)) {
            this.f6940a.D().a("adWebViewReceivedHttpError", webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        com.applovin.impl.sdk.ad.b bVarG = this.f6942c.g();
        String str = "Received SSL error: " + sslError;
        if (com.applovin.impl.sdk.o.a()) {
            this.f6941b.b("AdWebView", str + " for ad: " + bVarG);
        }
    }

    public void safedk_c_onLoadResource_1af43fc902fb6865fb0a01b3cce96a24(WebView p10, String p11) {
        super.onLoadResource(p10, p11);
        if (com.applovin.impl.sdk.o.a()) {
            this.f6941b.d("AdWebView", "Loaded resource: " + p11);
        }
    }

    public void safedk_c_onPageFinished_a44c2ec5ed56e4c2419c3d079c098b25(WebView p10, String p11) {
        super.onPageFinished(p10, p11);
        if (com.applovin.impl.sdk.o.a()) {
            this.f6941b.d("AdWebView", "Loaded URL: " + p11);
        }
        this.f6942c.a(p10, p11);
    }

    /* JADX WARN: Code duplicated, block: B:145:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:78:0x0160  */
    public boolean a(WebView webView, String str) {
        boolean z10;
        if (this.f6942c == null) {
            return true;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f6941b.d("AdWebView", "Processing click on ad URL \"" + str + "\"");
        }
        if (str != null && (webView instanceof b)) {
            Uri uri = Uri.parse(str);
            b bVar = (b) webView;
            String scheme = uri.getScheme();
            String host = uri.getHost();
            String path = uri.getPath();
            com.applovin.impl.sdk.ad.b bVarG = this.f6942c.g();
            if (bVarG == null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6941b.b("AdWebView", "Unable to process click, ad not found!");
                }
                return true;
            }
            boolean zA = bVar.a();
            if ("applovin".equals(scheme) && AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equals(host)) {
                if ("/vibrate".equals(path)) {
                    long j10 = StringUtils.parseLong(uri.getQueryParameter("duration_ms"), 0L);
                    if (j10 > 0) {
                        n7.a(StringUtils.parseFloat(uri.getQueryParameter("intensity"), 0.5f), j10, this.f6940a);
                    }
                } else if ("/adservice/close_ad".equals(path)) {
                    b();
                } else if ("/adservice/expand_ad".equals(path)) {
                    if (a(zA, bVarG, uri)) {
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f6941b.b("AdWebView", "Skipping expand command without user interaction");
                        }
                        return true;
                    }
                    a(bVar.getLastClickEvent());
                } else if ("/adservice/contract_ad".equals(path)) {
                    c();
                } else {
                    if ("/adservice/no_op".equals(path)) {
                        return true;
                    }
                    if ("/adservice/load_url".equals(path)) {
                        if (a(zA, bVarG, uri)) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f6941b.b("AdWebView", "Skipping URL load command without user interaction");
                            }
                            return true;
                        }
                        k7.a(uri, this.f6942c, this.f6940a);
                    } else if ("/adservice/track_click_now".equals(path)) {
                        if (a(zA, bVarG, uri)) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f6941b.b("AdWebView", "Skipping click tracking command without user interaction");
                            }
                            return true;
                        }
                        if (bVarG instanceof o7) {
                            a((o7) bVarG, bVar);
                        } else {
                            a(bVar, Uri.parse("/adservice/track_click_now"));
                        }
                    } else if ("/adservice/deeplink".equals(path)) {
                        if (a(zA, bVarG, uri)) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f6941b.b("AdWebView", "Skipping deep link plus command without user interaction");
                            }
                            return true;
                        }
                        if (bVarG instanceof o7) {
                            o7 o7Var = (o7) bVarG;
                            if (o7Var.w1()) {
                                a(o7Var, bVar);
                            } else {
                                a(bVar, uri);
                            }
                        } else {
                            a(bVar, uri);
                        }
                    } else if ("/adservice/postback".equals(path)) {
                        k7.a(uri, bVarG, this.f6940a);
                    } else if ("/ga_init".equals(path)) {
                        this.f6942c.b(uri);
                    } else if ("/ga_event".equals(path)) {
                        this.f6942c.a(uri);
                    } else if ("/playable_event".equals(path)) {
                        a(uri);
                    } else if ("/save_template_state".equals(path)) {
                        bVarG.b(uri.getQueryParameter("state"));
                    } else if ("/template_error".equals(path)) {
                        k7.c(uri, bVarG, this.f6940a);
                    } else if ("/adservice/fully_watched".equals(path)) {
                        this.f6942c.A();
                    } else if ("/adservice/preload".equals(path)) {
                        k7.b(uri, bVarG, this.f6940a);
                    } else if ("/adservice/custom_intent".equals(path)) {
                        k7.a(uri, bVarG, this.f6942c.i(), this.f6940a);
                    } else {
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f6941b.k("AdWebView", "Unknown URL: " + str);
                        }
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f6941b.k("AdWebView", "Path: " + path);
                        }
                    }
                }
            } else {
                Iterator it = bVarG.V().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = true;
                        break;
                    }
                    String str2 = (String) it.next();
                    if (StringUtils.isValidString(path) && path.contains(str2)) {
                        z10 = false;
                        break;
                    }
                }
                if (!zA) {
                    boolean zX0 = bVarG.X0();
                    boolean z11 = zX0 ? false : z10;
                    a(uri, zX0, bVarG, this.f6940a);
                    z10 = z11;
                }
                if (z10) {
                    List listP0 = bVarG.p0();
                    List listO0 = bVarG.o0();
                    if ((!listP0.isEmpty() && !listP0.contains(scheme)) || (!listO0.isEmpty() && !listO0.contains(host))) {
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f6941b.b("AdWebView", "URL is not whitelisted - bypassing click");
                        }
                    } else if (bVarG instanceof o7) {
                        o7 o7Var2 = (o7) bVarG;
                        if (o7Var2.w1()) {
                            a(o7Var2, bVar);
                        } else {
                            a(bVar, uri);
                        }
                    } else {
                        a(bVar, uri);
                    }
                }
            }
        }
        return true;
    }

    public boolean safedk_c_shouldOverrideUrlLoading_2ce55369ff10fa536fb839524e517b10(WebView p10, String p11) {
        return a(p10, p11);
    }

    private void a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail, com.applovin.impl.sdk.ad.b bVar) {
        if (renderProcessGoneDetail.didCrash() && ((Boolean) this.f6940a.a(x4.Y5)).booleanValue()) {
            throw new RuntimeException("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: " + (bVar != null ? String.valueOf(bVar.getAdIdNumber()) : "null"));
        }
        if (webView == null || !webView.equals(this.f6942c.f())) {
            return;
        }
        this.f6942c.b();
        AppLovinAdSize appLovinAdSizeK = this.f6942c.k();
        if (n7.a(appLovinAdSizeK)) {
            this.f6942c.a(appLovinAdSizeK);
            this.f6942c.F();
        }
    }

    private boolean a(boolean z10, com.applovin.impl.sdk.ad.b bVar, Uri uri) {
        if (z10) {
            return false;
        }
        boolean zY0 = bVar.Y0();
        a(uri, zY0, bVar, this.f6940a);
        return zY0;
    }

    private static void a(Uri uri, boolean z10, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar) {
        if (kVar.c(x4.R6).contains(uri.getScheme())) {
            return;
        }
        kVar.D().d(d2.J0, a(bVar, uri, z10));
    }

    private static Map a(com.applovin.impl.sdk.ad.b bVar, Uri uri, boolean z10) {
        Map mapA = f2.a((AppLovinAdImpl) bVar);
        CollectionUtils.putStringIfValid("url", uri.toString(), mapA);
        CollectionUtils.putStringIfValid("is_blocked_auto_redirect", String.valueOf(z10), mapA);
        return mapA;
    }

    private void a(MotionEvent motionEvent) {
        this.f6942c.a(motionEvent);
    }

    private void a(o7 o7Var, b bVar) {
        r7 r7VarG1 = o7Var.g1();
        if (r7VarG1 != null) {
            a8.a(r7VarG1.b(), this.f6942c.j());
            a(bVar, r7VarG1.c());
        }
    }

    private void a(b bVar, Uri uri) {
        com.applovin.impl.sdk.ad.b currentAd = bVar.getCurrentAd();
        AppLovinAdView appLovinAdViewI = this.f6942c.i();
        if (appLovinAdViewI != null && currentAd != null) {
            if (currentAd instanceof o7) {
                ((o7) currentAd).getAdEventTracker().v();
            }
            this.f6942c.a(currentAd, appLovinAdViewI, uri, bVar.getAndClearLastClickEvent());
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f6941b.b("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
        }
    }

    private void a(Uri uri) {
        String str;
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("success", false);
        String queryParameter = uri.getQueryParameter("type");
        if (booleanQueryParameter) {
            str = "Tracked event: " + queryParameter;
        } else {
            str = "Failed to track event: " + queryParameter;
        }
        n7.a(str, com.applovin.impl.sdk.k.o());
    }
}
