package com.mbridge.msdk.config.dynamic.baseview.webview.client;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.config.dynamic.baseview.webview.ComponentWebView;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* JADX INFO: compiled from: MBWebViewClient.java */
/* JADX INFO: loaded from: classes6.dex */
public class b extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33863a = "MBWebViewClient";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.webview.listener.a f33864b;

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(g.f44969o, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/config/dynamic/baseview/webview/client/b;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(g.f44969o, webView, str);
        safedk_b_onPageFinished_ff7cdbd9826546e44d6b6f2be9837822(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    public boolean safedk_b_shouldOverrideUrlLoading_2b95b7b644d607f8d0738201379b4d99(WebView p10, String p11) {
        com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar = this.f33864b;
        return aVar != null ? aVar.shouldOverrideUrlLoading(p10, p11) : super.shouldOverrideUrlLoading(p10, p11);
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
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/config/dynamic/baseview/webview/client/b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean zSafedk_b_shouldOverrideUrlLoading_679281cc165927fd5a2cf89f070c4b44 = safedk_b_shouldOverrideUrlLoading_679281cc165927fd5a2cf89f070c4b44(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoadingWithHeaders(g.f44969o, webView, webResourceRequest, zSafedk_b_shouldOverrideUrlLoading_679281cc165927fd5a2cf89f070c4b44);
        return zSafedk_b_shouldOverrideUrlLoading_679281cc165927fd5a2cf89f070c4b44;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/config/dynamic/baseview/webview/client/b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_b_shouldOverrideUrlLoading_2b95b7b644d607f8d0738201379b4d99 = safedk_b_shouldOverrideUrlLoading_2b95b7b644d607f8d0738201379b4d99(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(g.f44969o, webView, str, zSafedk_b_shouldOverrideUrlLoading_2b95b7b644d607f8d0738201379b4d99);
        return zSafedk_b_shouldOverrideUrlLoading_2b95b7b644d607f8d0738201379b4d99;
    }

    public void a(com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar) {
        this.f33864b = aVar;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar = this.f33864b;
        if (aVar != null) {
            aVar.onReceivedError(webView, i10, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        q0.b("MBWebViewClient", "WebView called onRenderProcessGone");
        if (webView != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) webView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                if (webView instanceof ComponentWebView) {
                    ComponentWebView componentWebView = (ComponentWebView) webView;
                    if (!componentWebView.isDestroyed()) {
                        componentWebView.destroy();
                    }
                } else {
                    webView.destroy();
                }
            } catch (Throwable th2) {
                q0.b("MBWebViewClient", th2.getMessage());
                return true;
            }
        }
        com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar = this.f33864b;
        if (aVar != null) {
            aVar.onRenderProcessGone(webView);
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar = this.f33864b;
        if (aVar != null) {
            aVar.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar = this.f33864b;
        if (aVar != null) {
            aVar.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    public void safedk_b_onPageFinished_ff7cdbd9826546e44d6b6f2be9837822(WebView p10, String p11) {
        super.onPageFinished(p10, p11);
        com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar = this.f33864b;
        if (aVar != null) {
            aVar.onPageFinished(p10, p11);
        }
    }

    public boolean safedk_b_shouldOverrideUrlLoading_679281cc165927fd5a2cf89f070c4b44(WebView p10, WebResourceRequest p11) {
        com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar = this.f33864b;
        if (aVar != null) {
            return aVar.shouldOverrideUrlLoading(p10, p11.getUrl().toString());
        }
        return super.shouldOverrideUrlLoading(p10, p11);
    }
}
