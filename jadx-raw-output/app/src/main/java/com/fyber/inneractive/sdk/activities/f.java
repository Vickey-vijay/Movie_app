package com.fyber.inneractive.sdk.activities;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.click.r;
import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.j1;
import com.fyber.inneractive.sdk.util.v;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import com.safedk.android.utils.Logger;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f14856a;

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44970p, view, url);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/activities/f;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44970p, webView, str);
        safedk_f_onPageFinished_515348b3f79421f62d9f99783f61f562(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f44970p, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f44970p, view, url, super.shouldInterceptRequest(view, url));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/activities/f;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_f_shouldOverrideUrlLoading_2d5eae6a8dbd2c6a8ce724f3c448f1e6 = safedk_f_shouldOverrideUrlLoading_2d5eae6a8dbd2c6a8ce724f3c448f1e6(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f44970p, webView, str, zSafedk_f_shouldOverrideUrlLoading_2d5eae6a8dbd2c6a8ce724f3c448f1e6);
        return zSafedk_f_shouldOverrideUrlLoading_2d5eae6a8dbd2c6a8ce724f3c448f1e6;
    }

    public f(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f14856a = inneractiveInternalBrowserActivity;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        z.a("WebViewRendererProcessGone", "Web view renderer process has gone. Web view destroyed", null, null);
        InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity = this.f14856a;
        if (inneractiveInternalBrowserActivity.f14840e == webView) {
            inneractiveInternalBrowserActivity.f14840e = null;
        }
        if (webView != null) {
            v.a(webView);
            webView.destroy();
        }
        this.f14856a.finish();
        return true;
    }

    public boolean safedk_f_shouldOverrideUrlLoading_2d5eae6a8dbd2c6a8ce724f3c448f1e6(WebView p10, String p11) {
        if (TextUtils.isEmpty(p11)) {
            return false;
        }
        if (j1.a(p11)) {
            WebView webView = this.f14856a.f14840e;
            if (webView != null) {
                DTExchangeNetworkBridge.webviewLoadUrl(webView, "chrome://crash");
            }
            return true;
        }
        InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity = this.f14856a;
        String str = InneractiveInternalBrowserActivity.URL_EXTRA;
        inneractiveInternalBrowserActivity.getClass();
        com.fyber.inneractive.sdk.click.g gVar = new com.fyber.inneractive.sdk.click.g(new g(inneractiveInternalBrowserActivity), null, com.fyber.inneractive.sdk.util.g.VIDEO_CTA);
        r rVar = new r(false);
        rVar.f15001i.addAll(Arrays.asList(gVar, new com.fyber.inneractive.sdk.click.d(), new com.fyber.inneractive.sdk.click.h(), new com.fyber.inneractive.sdk.click.l(), new com.fyber.inneractive.sdk.click.i(false, TextUtils.isEmpty(p11) ? null : Uri.parse(p11).getScheme())));
        rVar.a(inneractiveInternalBrowserActivity.getApplicationContext(), p11, new h(inneractiveInternalBrowserActivity), null, false, com.fyber.inneractive.sdk.ignite.m.NONE, "");
        return !p11.startsWith("http");
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f14856a.f14842g.setImageDrawable(com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_unright_arrow));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        IAlog.f("Received Error on WebViewClient: Code: %d, Description: %s, failingUrl: %s", Integer.valueOf(i10), str, str2);
    }

    public void safedk_f_onPageFinished_515348b3f79421f62d9f99783f61f562(WebView p10, String p11) {
        Drawable drawableD;
        Drawable drawableD2;
        super.onPageFinished(p10, p11);
        if (p10.canGoBack()) {
            drawableD = com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_left_arrow);
        } else {
            drawableD = com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_unleft_arrow);
        }
        this.f14856a.f14841f.setImageDrawable(drawableD);
        if (p10.canGoForward()) {
            drawableD2 = com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_right_arrow);
        } else {
            drawableD2 = com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_unright_arrow);
        }
        this.f14856a.f14842g.setImageDrawable(drawableD2);
    }
}
