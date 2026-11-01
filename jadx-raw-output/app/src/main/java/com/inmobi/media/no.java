package com.inmobi.media;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;

/* JADX INFO: loaded from: classes9.dex */
public final class no extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44963i, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44963i, view, url);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f44963i, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f44963i, view, url, super.shouldInterceptRequest(view, url));
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        ck.p.j(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        return oo.a(webView, renderProcessGoneDetail, "safe_web_view");
    }
}
