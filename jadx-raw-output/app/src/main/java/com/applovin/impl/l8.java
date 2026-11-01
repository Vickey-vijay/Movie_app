package com.applovin.impl;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import com.safedk.android.utils.Logger;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class l8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f7907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebView f7908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f7910e = Collections.synchronizedSet(new HashSet());

    public class a extends t4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f7911a;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            l8.this.f7908c.destroy();
            l8.this.f7908c = null;
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44955a, view, url);
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/l8$a;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
            CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44955a, webView, str);
            safedk_l8$a_onPageFinished_b22223da9b1058e4cf88973ae1cbbf7e(webView, str);
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f44955a, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
            return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f44955a, view, url, super.shouldInterceptRequest(view, url));
        }

        public a(boolean z10) {
            this.f7911a = z10;
        }

        @Override // com.applovin.impl.t4
        public Map a() {
            return CollectionUtils.hashMap("name", "WebTrackerManagerWebViewClient");
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView == l8.this.f7908c) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.gc
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7578b.b();
                    }
                });
            } else {
                l8.this.b(webView);
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        public void safedk_l8$a_onPageFinished_b22223da9b1058e4cf88973ae1cbbf7e(WebView p10, String p11) {
            if (this.f7911a) {
                com.applovin.impl.sdk.o unused = l8.this.f7907b;
                if (com.applovin.impl.sdk.o.a()) {
                    l8.this.f7907b.a("WebTrackerManager", "Successfully initialized web view for postbacks");
                }
                l8.this.f7909d = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        final WebView webViewA = a(str);
        if (webViewA != null) {
            this.f7910e.add(webViewA);
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.fc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7512b.b(webViewA);
                }
            }, ((Integer) this.f7906a.a(x4.K2)).intValue());
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f7907b.b("WebTrackerManager", "Failed to fire tracker since web view could not be created");
        }
    }

    public l8(com.applovin.impl.sdk.k kVar) {
        this.f7906a = kVar;
        this.f7907b = kVar.O();
    }

    public void b() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ac
            @Override // java.lang.Runnable
            public final void run() {
                this.f6865b.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        WebView webViewA = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
        this.f7908c = webViewA;
        if (webViewA == null && com.applovin.impl.sdk.o.a()) {
            this.f7907b.b("WebTrackerManager", "Failed to preload postback web view");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.network.e eVar, final AppLovinPostbackListener appLovinPostbackListener) {
        final String strAppendQueryParameters = StringUtils.appendQueryParameters(eVar.f(), eVar.i(), ((Boolean) this.f7906a.a(x4.f9949i3)).booleanValue());
        if (this.f7908c == null) {
            WebView webViewA = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
            this.f7908c = webViewA;
            if (webViewA == null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7907b.b("WebTrackerManager", "Failed to fire postback since web view could not be created");
                }
                appLovinPostbackListener.onPostbackFailure(strAppendQueryParameters, -1);
                return;
            }
        }
        if (c() && !this.f7909d) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7907b.b("WebTrackerManager", "Failed to fire postback since web view was not initialized in time");
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("top_main_method", "firePostback");
            mapHashMap.put("source", "webViewNotInitialized");
            mapHashMap.put("url", strAppendQueryParameters);
            this.f7906a.D().d(d2.f7196b1, mapHashMap);
            appLovinPostbackListener.onPostbackFailure(strAppendQueryParameters, -1);
            return;
        }
        String str = "al_firePostback('" + strAppendQueryParameters + "')";
        if (((Boolean) this.f7906a.a(x4.Q2)).booleanValue()) {
            o8.a(this.f7908c, str, this.f7906a).a(this.f7906a.q0().a("evaluateJavascriptPromise"), new s4.b() { // from class: com.applovin.impl.dc
                @Override // com.applovin.impl.s4.b
                public final void a(boolean z10, Object obj, Object obj2) {
                    this.f7322a.a(appLovinPostbackListener, strAppendQueryParameters, z10, (String) obj, (String) obj2);
                }
            });
        } else {
            o8.a(this.f7908c, str);
            appLovinPostbackListener.onPostbackSuccess(strAppendQueryParameters);
        }
    }

    public void a(final com.applovin.impl.sdk.network.e eVar, final AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.bc
            @Override // java.lang.Runnable
            public final void run() {
                this.f7089b.b(eVar, appLovinPostbackListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinPostbackListener appLovinPostbackListener, String str, boolean z10, String str2, String str3) {
        if (z10) {
            appLovinPostbackListener.onPostbackSuccess(str);
            return;
        }
        appLovinPostbackListener.onPostbackFailure(str, -1);
        Map map = CollectionUtils.map("top_main_method", "firePostback");
        map.put("source", "evaluateJavascriptFailed");
        map.put("url", str);
        CollectionUtils.putStringIfValid("error_message", str3, map);
        this.f7906a.D().d(d2.f7196b1, map);
    }

    private boolean c() {
        return ((Boolean) this.f7906a.a(x4.P2)).booleanValue();
    }

    private WebView a(String str) {
        return a(str, false);
    }

    private WebView a(String str, boolean z10) {
        n7.b();
        WebView webViewB = n7.b(com.applovin.impl.sdk.k.o(), "web tracker");
        if (webViewB == null) {
            return null;
        }
        webViewB.getSettings().setJavaScriptEnabled(true);
        webViewB.setWebViewClient(new a(z10 && c()));
        AppLovinNetworkBridge.webviewLoadData(webViewB, "<html><head><link rel=\"icon\" href=\"data:,\">" + str + "</head><body></body></html>", "text/html", "UTF-8");
        return webViewB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(final WebView webView) {
        if (webView == null || !this.f7910e.remove(webView)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.cc
            @Override // java.lang.Runnable
            public final void run() {
                webView.destroy();
            }
        });
    }

    public void b(final String str) {
        if (!AppLovinSdkUtils.isValidString(str)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7907b.b("WebTrackerManager", "Failed to fire tracker due to empty script string");
            }
        } else {
            if (!str.startsWith("<script")) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7907b.b("WebTrackerManager", "Failed to fire tracker due to improperly formatted script tag");
                    return;
                }
                return;
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ec
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7450b.c(str);
                }
            });
        }
    }
}
