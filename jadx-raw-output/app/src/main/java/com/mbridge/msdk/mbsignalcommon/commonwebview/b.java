package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Message;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
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
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: CommonWebViewClient.java */
/* JADX INFO: loaded from: classes2.dex */
public class b extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<WebViewClient> f36061a = new CopyOnWriteArrayList<>();

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/commonwebview/b;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(g.f44969o, webView, str);
        safedk_b_onLoadResource_0782066d0b03b20ccd60b835604ecc29(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/commonwebview/b;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(g.f44969o, webView, str);
        safedk_b_onPageFinished_4e400b40fd4128bb927eb51d8ea0326d(webView, str);
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        Iterator<WebViewClient> it = this.f36061a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedError(webView, i10, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
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
                q0.b("CommonWebViewClient", th2.getMessage());
            }
        }
        return true;
    }

    @Deprecated
    public WebResourceResponse safedk_b_shouldInterceptRequest_59e16d28155978e1d5717688fcd22b49(WebView p10, String p11) {
        Iterator<WebViewClient> it = this.f36061a.iterator();
        WebResourceResponse webResourceResponseShouldInterceptRequest = null;
        while (it.hasNext()) {
            webResourceResponseShouldInterceptRequest = it.next().shouldInterceptRequest(p10, p11);
        }
        return webResourceResponseShouldInterceptRequest;
    }

    public boolean safedk_b_shouldOverrideUrlLoading_1d89a49476ba953906baff95e3f16175(WebView p10, String p11) {
        Iterator<WebViewClient> it = this.f36061a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            boolean zShouldOverrideUrlLoading = it.next().shouldOverrideUrlLoading(p10, p11);
            if (zShouldOverrideUrlLoading) {
                z10 = zShouldOverrideUrlLoading;
            }
        }
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/commonwebview/b;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(g.f44969o, webView, webResourceRequest, safedk_b_shouldInterceptRequest_e2d069ec271ea2797a5b11ba8077c8e2(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/commonwebview/b;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(g.f44969o, webView, str, safedk_b_shouldInterceptRequest_59e16d28155978e1d5717688fcd22b49(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/commonwebview/b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean zSafedk_b_shouldOverrideUrlLoading_4a315c1cf8cfa4be6a119ea0e3d3cb37 = safedk_b_shouldOverrideUrlLoading_4a315c1cf8cfa4be6a119ea0e3d3cb37(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoadingWithHeaders(g.f44969o, webView, webResourceRequest, zSafedk_b_shouldOverrideUrlLoading_4a315c1cf8cfa4be6a119ea0e3d3cb37);
        return zSafedk_b_shouldOverrideUrlLoading_4a315c1cf8cfa4be6a119ea0e3d3cb37;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/commonwebview/b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_b_shouldOverrideUrlLoading_1d89a49476ba953906baff95e3f16175 = safedk_b_shouldOverrideUrlLoading_1d89a49476ba953906baff95e3f16175(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(g.f44969o, webView, str, zSafedk_b_shouldOverrideUrlLoading_1d89a49476ba953906baff95e3f16175);
        return zSafedk_b_shouldOverrideUrlLoading_1d89a49476ba953906baff95e3f16175;
    }

    public void a(WebViewClient webViewClient) {
        this.f36061a.add(webViewClient);
    }

    public void b(WebViewClient webViewClient) {
        this.f36061a.remove(webViewClient);
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        Iterator<WebViewClient> it = this.f36061a.iterator();
        while (it.hasNext()) {
            it.next().doUpdateVisitedHistory(webView, str, z10);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        Iterator<WebViewClient> it = this.f36061a.iterator();
        while (it.hasNext()) {
            it.next().onFormResubmission(webView, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        try {
            Iterator<WebViewClient> it = this.f36061a.iterator();
            while (it.hasNext()) {
                it.next().onPageCommitVisible(webView, str);
            }
        } catch (Exception e10) {
            q0.b("CommonWebViewClient", e10.getMessage());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Iterator<WebViewClient> it = this.f36061a.iterator();
        while (it.hasNext()) {
            it.next().onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        try {
            Iterator<WebViewClient> it = this.f36061a.iterator();
            while (it.hasNext()) {
                it.next().onReceivedClientCertRequest(webView, clientCertRequest);
            }
        } catch (Exception e10) {
            q0.b("CommonWebViewClient", e10.getMessage());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        Iterator<WebViewClient> it = this.f36061a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        try {
            Iterator<WebViewClient> it = this.f36061a.iterator();
            while (it.hasNext()) {
                it.next().onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }
        } catch (Exception e10) {
            q0.b("CommonWebViewClient", e10.getMessage());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        Iterator<WebViewClient> it = this.f36061a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedLoginRequest(webView, str, str2, str3);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        Iterator<WebViewClient> it = this.f36061a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, SafeBrowsingResponse safeBrowsingResponse) {
        try {
            if (Build.VERSION.SDK_INT >= 27) {
                Iterator<WebViewClient> it = this.f36061a.iterator();
                while (it.hasNext()) {
                    it.next().onSafeBrowsingHit(webView, webResourceRequest, i10, safeBrowsingResponse);
                }
            }
        } catch (Exception e10) {
            q0.b("CommonWebViewClient", e10.getMessage());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f10, float f11) {
        Iterator<WebViewClient> it = this.f36061a.iterator();
        while (it.hasNext()) {
            it.next().onScaleChanged(webView, f10, f11);
        }
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        Iterator<WebViewClient> it = this.f36061a.iterator();
        while (it.hasNext()) {
            it.next().onTooManyRedirects(webView, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        Iterator<WebViewClient> it = this.f36061a.iterator();
        while (it.hasNext()) {
            it.next().onUnhandledKeyEvent(webView, keyEvent);
        }
    }

    public void safedk_b_onLoadResource_0782066d0b03b20ccd60b835604ecc29(WebView p10, String p11) {
        Iterator<WebViewClient> it = this.f36061a.iterator();
        while (it.hasNext()) {
            it.next().onLoadResource(p10, p11);
        }
    }

    public void safedk_b_onPageFinished_4e400b40fd4128bb927eb51d8ea0326d(WebView p10, String p11) {
        Iterator<WebViewClient> it = this.f36061a.iterator();
        while (it.hasNext()) {
            it.next().onPageFinished(p10, p11);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        Iterator<WebViewClient> it = this.f36061a.iterator();
        boolean zShouldOverrideKeyEvent = false;
        while (it.hasNext()) {
            zShouldOverrideKeyEvent = it.next().shouldOverrideKeyEvent(webView, keyEvent);
        }
        return zShouldOverrideKeyEvent;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        try {
            Iterator<WebViewClient> it = this.f36061a.iterator();
            while (it.hasNext()) {
                it.next().onReceivedError(webView, webResourceRequest, webResourceError);
            }
        } catch (Exception e10) {
            q0.b("CommonWebViewClient", e10.getMessage());
        }
    }

    public WebResourceResponse safedk_b_shouldInterceptRequest_e2d069ec271ea2797a5b11ba8077c8e2(WebView p10, WebResourceRequest p11) {
        WebResourceResponse webResourceResponseShouldInterceptRequest = null;
        try {
            Iterator<WebViewClient> it = this.f36061a.iterator();
            while (it.hasNext()) {
                webResourceResponseShouldInterceptRequest = it.next().shouldInterceptRequest(p10, p11);
            }
        } catch (Exception e10) {
            q0.b("CommonWebViewClient", e10.getMessage());
        }
        return webResourceResponseShouldInterceptRequest;
    }

    public boolean safedk_b_shouldOverrideUrlLoading_4a315c1cf8cfa4be6a119ea0e3d3cb37(WebView p10, WebResourceRequest p11) {
        boolean z10 = false;
        try {
            Iterator<WebViewClient> it = this.f36061a.iterator();
            while (it.hasNext()) {
                boolean zShouldOverrideUrlLoading = it.next().shouldOverrideUrlLoading(p10, p11);
                if (zShouldOverrideUrlLoading) {
                    z10 = zShouldOverrideUrlLoading;
                }
            }
        } catch (Exception e10) {
            q0.b("CommonWebViewClient", e10.getMessage());
        }
        return z10;
    }
}
