package com.mbridge.msdk.dycreator.baseview.webview.client;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import com.ironsource.G5;
import com.mbridge.msdk.dycreator.baseview.webview.MBWebView;
import com.mbridge.msdk.dycreator.baseview.webview.listener.WebViewEventListener;
import com.mbridge.msdk.dycreator.baseview.webview.util.MBHybridUtil;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.image.a;
import com.mbridge.msdk.foundation.same.image.b;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes10.dex */
public class MBWebViewClient extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34291a = "MBWebViewClient";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WebViewEventListener f34292b;

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(g.f44969o, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/dycreator/baseview/webview/client/MBWebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(g.f44969o, webView, str);
        safedk_MBWebViewClient_onPageFinished_b4a2bb72f5962b3e7f89906f36f9aba7(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    public boolean safedk_MBWebViewClient_shouldOverrideUrlLoading_2adfd40ef2c0c0873b3ab240cdac4526(WebView p10, String p11) {
        WebViewEventListener webViewEventListener = this.f34292b;
        return webViewEventListener != null ? webViewEventListener.shouldOverrideUrlLoading(p10, p11) : super.shouldOverrideUrlLoading(p10, p11);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(g.f44969o, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/dycreator/baseview/webview/client/MBWebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(g.f44969o, webView, str, safedk_MBWebViewClient_shouldInterceptRequest_22183f214e3ee160a47e6252f37381c6(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/dycreator/baseview/webview/client/MBWebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean zSafedk_MBWebViewClient_shouldOverrideUrlLoading_c3ec35bddd454570e78aa39f086db1a4 = safedk_MBWebViewClient_shouldOverrideUrlLoading_c3ec35bddd454570e78aa39f086db1a4(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoadingWithHeaders(g.f44969o, webView, webResourceRequest, zSafedk_MBWebViewClient_shouldOverrideUrlLoading_c3ec35bddd454570e78aa39f086db1a4);
        return zSafedk_MBWebViewClient_shouldOverrideUrlLoading_c3ec35bddd454570e78aa39f086db1a4;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/dycreator/baseview/webview/client/MBWebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_MBWebViewClient_shouldOverrideUrlLoading_2adfd40ef2c0c0873b3ab240cdac4526 = safedk_MBWebViewClient_shouldOverrideUrlLoading_2adfd40ef2c0c0873b3ab240cdac4526(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(g.f44969o, webView, str, zSafedk_MBWebViewClient_shouldOverrideUrlLoading_2adfd40ef2c0c0873b3ab240cdac4526);
        return zSafedk_MBWebViewClient_shouldOverrideUrlLoading_2adfd40ef2c0c0873b3ab240cdac4526;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        WebViewEventListener webViewEventListener = this.f34292b;
        if (webViewEventListener != null) {
            webViewEventListener.onReceivedError(webView, i10, str, str2);
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
                if (webView instanceof MBWebView) {
                    MBWebView mBWebView = (MBWebView) webView;
                    if (!mBWebView.isDestroyed()) {
                        mBWebView.destroy();
                    }
                } else {
                    webView.destroy();
                }
            } catch (Throwable th2) {
                q0.b("MBWebViewClient", th2.getMessage());
                return true;
            }
        }
        WebViewEventListener webViewEventListener = this.f34292b;
        if (webViewEventListener != null) {
            webViewEventListener.onRenderProcessGone(webView);
        }
        return true;
    }

    public void setWebViewEventListener(WebViewEventListener webViewEventListener) {
        this.f34292b = webViewEventListener;
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        WebViewEventListener webViewEventListener = this.f34292b;
        if (webViewEventListener != null) {
            webViewEventListener.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        WebViewEventListener webViewEventListener = this.f34292b;
        if (webViewEventListener != null) {
            webViewEventListener.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    public void safedk_MBWebViewClient_onPageFinished_b4a2bb72f5962b3e7f89906f36f9aba7(WebView p10, String p11) {
        super.onPageFinished(p10, p11);
        WebViewEventListener webViewEventListener = this.f34292b;
        if (webViewEventListener != null) {
            webViewEventListener.onPageFinished(p10, p11);
        }
    }

    @Nullable
    public WebResourceResponse safedk_MBWebViewClient_shouldInterceptRequest_22183f214e3ee160a47e6252f37381c6(WebView p10, String p11) {
        Bitmap bitmapB;
        try {
            if (!TextUtils.isEmpty(p11)) {
                String imageMimeType = MBHybridUtil.getImageMimeType(p11);
                if (!TextUtils.isEmpty(imageMimeType) && (bitmapB = b.a(c.n().d()).b(p11)) != null && !bitmapB.isRecycled()) {
                    return new WebResourceResponse(imageMimeType, G5.N, a.a(bitmapB));
                }
            }
        } catch (Throwable th2) {
            q0.b("MBWebViewClient", th2.getMessage());
        }
        return super.shouldInterceptRequest(p10, p11);
    }

    public boolean safedk_MBWebViewClient_shouldOverrideUrlLoading_c3ec35bddd454570e78aa39f086db1a4(WebView p10, WebResourceRequest p11) {
        WebViewEventListener webViewEventListener = this.f34292b;
        if (webViewEventListener != null) {
            return webViewEventListener.shouldOverrideUrlLoading(p10, p11.getUrl().toString());
        }
        return super.shouldOverrideUrlLoading(p10, p11);
    }
}
