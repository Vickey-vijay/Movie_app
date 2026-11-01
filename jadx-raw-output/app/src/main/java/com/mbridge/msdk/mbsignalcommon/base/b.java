package com.mbridge.msdk.mbsignalcommon.base;

import android.net.http.SslError;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.io.File;

/* JADX INFO: compiled from: BaseWebViewClient.java */
/* JADX INFO: loaded from: classes2.dex */
public class b extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f36000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.windvane.c f36001b;

    public boolean a(String str, String str2) {
        try {
            return new File(str).getCanonicalFile().getPath().startsWith(new File(str2).getCanonicalFile().getPath());
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(g.f44969o, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/base/b;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(g.f44969o, webView, str);
        safedk_b_onPageFinished_d6339d7aa13731306daf8ed1861b283b(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(g.f44969o, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        return CreativeInfoManager.onWebViewResponse(g.f44969o, view, url, super.shouldInterceptRequest(view, url));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/base/b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_b_shouldOverrideUrlLoading_1c1dff4fd3ba810928c378cea4b7b38e = safedk_b_shouldOverrideUrlLoading_1c1dff4fd3ba810928c378cea4b7b38e(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(g.f44969o, webView, str, zSafedk_b_shouldOverrideUrlLoading_1c1dff4fd3ba810928c378cea4b7b38e);
        return zSafedk_b_shouldOverrideUrlLoading_1c1dff4fd3ba810928c378cea4b7b38e;
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        q0.b("BaseWebViewClient", "WebView called onRenderProcessGone");
        if (webView != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) webView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                if (webView instanceof WindVaneWebView) {
                    ((WindVaneWebView) webView).release();
                } else {
                    webView.destroy();
                }
            } catch (Throwable th2) {
                q0.b("BaseWebViewClient", th2.getMessage());
                return true;
            }
        }
        com.mbridge.msdk.mbsignalcommon.windvane.c cVar = this.f36001b;
        if (cVar != null) {
            cVar.onRenderProcessGone(webView);
        }
        return true;
    }

    public boolean safedk_b_shouldOverrideUrlLoading_1c1dff4fd3ba810928c378cea4b7b38e(WebView p10, String p11) {
        a aVar = this.f36000a;
        if (aVar != null && aVar.a(p11)) {
            return true;
        }
        com.mbridge.msdk.mbsignalcommon.windvane.c cVar = this.f36001b;
        if (cVar != null) {
            cVar.shouldOverrideUrlLoading(p10, p11);
        }
        return super.shouldOverrideUrlLoading(p10, p11);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        com.mbridge.msdk.mbsignalcommon.windvane.c cVar = this.f36001b;
        if (cVar != null) {
            cVar.onReceivedError(webView, i10, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        com.mbridge.msdk.mbsignalcommon.windvane.c cVar = this.f36001b;
        if (cVar != null) {
            cVar.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    public void safedk_b_onPageFinished_d6339d7aa13731306daf8ed1861b283b(WebView p10, String p11) {
        super.onPageFinished(p10, p11);
        com.mbridge.msdk.mbsignalcommon.windvane.c cVar = this.f36001b;
        if (cVar != null) {
            cVar.onPageFinished(p10, p11);
        }
    }

    public void a(a aVar) {
        this.f36000a = aVar;
    }

    public a a() {
        return this.f36000a;
    }

    public void a(com.mbridge.msdk.mbsignalcommon.windvane.c cVar) {
        this.f36001b = cVar;
    }
}
