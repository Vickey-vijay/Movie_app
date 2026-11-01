package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes8.dex */
public class js implements jk {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Map<WebView, js> f2880 = new WeakHashMap();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f2881;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Set<jk> f2882 = new HashSet();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private jt f2883;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.js$2, reason: invalid class name */
    public class AnonymousClass2 extends WebViewClient {

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private boolean f2887 = false;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private boolean f2885 = false;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private String f2886 = null;

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44960f, view, url);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/js$2;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
            CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44960f, webView, str);
            safedk_js$2_onPageFinished_7b9c1b9fd7cfdfdadfc561f45118cf9d(webView, str);
        }

        public boolean safedk_js$2_shouldOverrideUrlLoading_267ac2d1718033f4f47bb58953824792(WebView p10, String p11) {
            if (m2727(p10, p11)) {
                return true;
            }
            if (this.f2886 == null) {
                this.f2886 = p10.getOriginalUrl();
            }
            js.this.mo275(p10, p11, m2726(p10));
            this.f2885 = true;
            this.f2887 = false;
            return false;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f44960f, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
            return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f44960f, view, url, super.shouldInterceptRequest(view, url));
        }

        @Override // android.webkit.WebViewClient
        @RequiresApi(api = 24)
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/js$2;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
            boolean zSafedk_js$2_shouldOverrideUrlLoading_05e45263fbdc9e2511712c77c9068285 = safedk_js$2_shouldOverrideUrlLoading_05e45263fbdc9e2511712c77c9068285(webView, webResourceRequest);
            BrandSafetyUtils.onShouldOverrideUrlLoadingWithHeaders(com.safedk.android.utils.g.f44960f, webView, webResourceRequest, zSafedk_js$2_shouldOverrideUrlLoading_05e45263fbdc9e2511712c77c9068285);
            return zSafedk_js$2_shouldOverrideUrlLoading_05e45263fbdc9e2511712c77c9068285;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/js$2;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_js$2_shouldOverrideUrlLoading_267ac2d1718033f4f47bb58953824792 = safedk_js$2_shouldOverrideUrlLoading_267ac2d1718033f4f47bb58953824792(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f44960f, webView, str, zSafedk_js$2_shouldOverrideUrlLoading_267ac2d1718033f4f47bb58953824792);
            return zSafedk_js$2_shouldOverrideUrlLoading_267ac2d1718033f4f47bb58953824792;
        }

        public AnonymousClass2() {
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private boolean m2726(WebView webView) {
            if (this.f2887 && this.f2885) {
                return true;
            }
            return (webView.getOriginalUrl() == null || this.f2886 == null || webView.getOriginalUrl().equals(this.f2886)) ? false : true;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private boolean m2727(WebView webView, String str) {
            if (!str.startsWith(js.this.f2881)) {
                return false;
            }
            this.f2886 = webView.getOriginalUrl();
            String strSubstring = str.substring(js.this.f2881.length());
            js jsVar = js.this;
            jsVar.mo274(webView, jsVar.f2881, strSubstring);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            js.this.mo272(webView);
            this.f2887 = true;
        }

        public void safedk_js$2_onPageFinished_7b9c1b9fd7cfdfdadfc561f45118cf9d(WebView p10, String p11) {
            js.this.mo272(p10);
            this.f2887 = false;
            this.f2885 = true;
            String p12 = this.f2886;
            if (p12 == null) {
                this.f2886 = p10.getOriginalUrl();
            }
        }

        @RequiresApi(api = 24)
        public boolean safedk_js$2_shouldOverrideUrlLoading_05e45263fbdc9e2511712c77c9068285(WebView p10, WebResourceRequest p11) {
            return shouldOverrideUrlLoading(p10, p11.getUrl().toString());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.js$4, reason: invalid class name */
    public class AnonymousClass4 extends WebChromeClient {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private boolean f2888 = false;

        public AnonymousClass4() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            js.this.mo273(webView, str2);
            return false;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i10) {
            if (i10 != 100 || this.f2888) {
                return;
            }
            this.f2888 = true;
            js.this.mo272(webView);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static js m2717(WebView webView, String str) {
        js jsVar = f2880.get(webView);
        if (jsVar != null) {
            return jsVar;
        }
        js jsVar2 = new js(webView, str);
        f2880.put(webView, jsVar2);
        return jsVar2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2720(jk jkVar) {
        this.f2882.add(jkVar);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final bb.e m2722() {
        return this.f2883.m2731();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2725(jk jkVar) {
        this.f2882.remove(jkVar);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m2721() {
        return this.f2883.m2734();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jk
    /* JADX INFO: renamed from: ｋ */
    public final void mo275(WebView webView, String str, boolean z10) {
        for (jk jkVar : new HashSet(this.f2882)) {
            if (jkVar != null) {
                jkVar.mo275(webView, str, z10);
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2723() {
        this.f2883.m2735(new AnonymousClass2());
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final WebView m2724() {
        return this.f2883.m2732();
    }

    private js(WebView webView, String str) {
        this.f2881 = str;
        jt jtVar = new jt(webView);
        this.f2883 = jtVar;
        jtVar.m2735(new AnonymousClass2());
        this.f2883.m2733(new AnonymousClass4());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jk
    /* JADX INFO: renamed from: ﻛ */
    public final void mo274(WebView webView, String str, String str2) {
        for (jk jkVar : new HashSet(this.f2882)) {
            if (jkVar != null) {
                jkVar.mo274(webView, str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2719() {
        this.f2883.m2733(new AnonymousClass4());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jk
    /* JADX INFO: renamed from: ﻛ */
    public final void mo273(WebView webView, String str) {
        for (jk jkVar : new HashSet(this.f2882)) {
            if (jkVar != null) {
                jkVar.mo273(webView, str);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jk
    /* JADX INFO: renamed from: ﻐ */
    public final void mo272(WebView webView) {
        for (jk jkVar : new HashSet(this.f2882)) {
            if (jkVar != null) {
                jkVar.mo272(webView);
            }
        }
    }
}
