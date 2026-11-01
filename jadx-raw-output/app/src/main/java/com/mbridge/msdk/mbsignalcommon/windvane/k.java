package com.mbridge.msdk.mbsignalcommon.windvane;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: compiled from: WindVaneWebViewClient.java */
/* JADX INFO: loaded from: classes11.dex */
public class k extends com.mbridge.msdk.mbsignalcommon.base.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f36152c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36153d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f36154e;

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44969o, view, url);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44969o, view, url);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f44969o, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/windvane/k;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f44969o, webView, str, safedk_k_shouldInterceptRequest_ea33cd8cea7780c2ad8461786cf124f9(webView, str));
    }

    @RequiresApi(api = 11)
    private WebResourceResponse a(String str) {
        try {
            if (TextUtils.isEmpty(str) || !i.e(str)) {
                return null;
            }
            q0.c("WindVaneWebViewClient", "is image " + str);
            Bitmap bitmapB = com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).b(str);
            q0.c("WindVaneWebViewClient", "find image from cache " + str);
            if (bitmapB == null || bitmapB.isRecycled()) {
                return null;
            }
            return new WebResourceResponse(i.b(str), G5.N, com.mbridge.msdk.foundation.same.image.a.a(bitmapB));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f36152c = str;
        c cVar = this.f36154e;
        if (cVar != null) {
            cVar.onPageStarted(webView, str, bitmap);
        }
    }

    @TargetApi(11)
    public WebResourceResponse safedk_k_shouldInterceptRequest_ea33cd8cea7780c2ad8461786cf124f9(WebView p10, String p11) {
        WebResourceResponse webResourceResponseA = a(p11);
        if (webResourceResponseA != null) {
            q0.c("WindVaneWebViewClient", "find WebResourceResponse url is " + p11);
            return webResourceResponseA;
        }
        return super.shouldInterceptRequest(p10, p11);
    }
}
