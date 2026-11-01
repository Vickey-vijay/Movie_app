package com.fyber.inneractive.sdk.activities;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.j1;
import com.fyber.inneractive.sdk.util.q0;
import com.fyber.inneractive.sdk.util.v;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import com.safedk.android.utils.Logger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FyberReportAdActivity f14851a;

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44970p, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44970p, view, url);
    }

    public boolean safedk_a_shouldOverrideUrlLoading_0e0a97058b8988959ba7eb7368f3240a(WebView p10, String p11) {
        com.fyber.inneractive.sdk.flow.h hVar;
        if (p11 == null) {
            return false;
        }
        if (j1.a(p11)) {
            WebView p12 = this.f14851a.f14822b;
            if (p12 != null) {
                DTExchangeNetworkBridge.webviewLoadUrl(p12, "chrome://crash");
            }
            return true;
        }
        if (!p11.startsWith("fybermarketplace://reportAd?") || (hVar = FyberReportAdActivity.f14821f) == null) {
            return false;
        }
        String p13 = p11.substring(28);
        com.fyber.inneractive.sdk.flow.g gVar = (com.fyber.inneractive.sdk.flow.g) hVar;
        w wVar = new w(u.FYBER_REPORT_AD, gVar.f15445b, gVar.f15446c);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("message", p13);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "message", p13);
        }
        wVar.f16132f.put(jSONObject);
        wVar.f16133g = true;
        wVar.a((String) null);
        WebView p14 = this.f14851a.f14822b;
        if (p14 != null) {
            q0.a(p14, "reportSent();");
        }
        return true;
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
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/activities/a;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_a_shouldOverrideUrlLoading_0e0a97058b8988959ba7eb7368f3240a = safedk_a_shouldOverrideUrlLoading_0e0a97058b8988959ba7eb7368f3240a(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f44970p, webView, str, zSafedk_a_shouldOverrideUrlLoading_0e0a97058b8988959ba7eb7368f3240a);
        return zSafedk_a_shouldOverrideUrlLoading_0e0a97058b8988959ba7eb7368f3240a;
    }

    public a(FyberReportAdActivity fyberReportAdActivity) {
        this.f14851a = fyberReportAdActivity;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        z.a("WebViewRendererProcessGone", "Web view renderer process has gone. Web view destroyed", null, null);
        FyberReportAdActivity fyberReportAdActivity = this.f14851a;
        if (fyberReportAdActivity.f14822b == webView) {
            fyberReportAdActivity.f14822b = null;
        }
        if (webView != null) {
            v.a(webView);
            webView.destroy();
        }
        this.f14851a.finish();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        IAlog.f("Received Error on WebViewClient: Code: %d, Description: %s, failingUrl: %s", Integer.valueOf(i10), str, str2);
    }
}
