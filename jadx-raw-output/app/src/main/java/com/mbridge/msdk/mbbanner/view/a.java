package com.mbridge.msdk.mbbanner.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.mbridge.msdk.mbsignalcommon.base.b;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.List;

/* JADX INFO: compiled from: BannerWebViewClient.java */
/* JADX INFO: loaded from: classes10.dex */
public class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f35763c = "BannerWebViewClient";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f35764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<CampaignEx> f35765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.mbridge.msdk.mbbanner.common.listener.a f35766f;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.view.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BannerWebViewClient.java */
    public class C0346a implements ValueCallback<String> {
        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(String str) {
        }

        public C0346a() {
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, g.f44969o);
        p10.startActivity(p11);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(g.f44969o, view, url);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        CreativeInfoManager.onWebViewPageFinished(g.f44969o, view, url);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(g.f44969o, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        return CreativeInfoManager.onWebViewResponse(g.f44969o, view, url, super.shouldInterceptRequest(view, url));
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbbanner/view/a;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_a_shouldOverrideUrlLoading_078b6b002ab25c1d646f13a68f3d4eb0 = safedk_a_shouldOverrideUrlLoading_078b6b002ab25c1d646f13a68f3d4eb0(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(g.f44969o, webView, str, zSafedk_a_shouldOverrideUrlLoading_078b6b002ab25c1d646f13a68f3d4eb0);
        return zSafedk_a_shouldOverrideUrlLoading_078b6b002ab25c1d646f13a68f3d4eb0;
    }

    private void a(WebView webView, String str) {
        webView.evaluateJavascript(str, new C0346a());
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        CampaignEx campaignEx;
        super.onPageStarted(webView, str, bitmap);
        try {
            a(webView, SafeDKWebAppInterface.f44738f + com.mbridge.msdk.setting.util.a.a().b());
            List<CampaignEx> list = this.f35765e;
            if (list == null || list.isEmpty() || (campaignEx = this.f35765e.get(0)) == null || !campaignEx.isActiveOm()) {
                return;
            }
            a(webView, SafeDKWebAppInterface.f44738f + MBridgeConstans.OMID_JS_SERVICE_CONTENT);
        } catch (Throwable th2) {
            q0.b("BannerWebViewClient", "onPageStarted", th2);
        }
    }

    public boolean safedk_a_shouldOverrideUrlLoading_078b6b002ab25c1d646f13a68f3d4eb0(WebView p10, String p11) {
        try {
            q0.b("BannerWebViewClient", "Use html to open url.");
            BaseWebView baseWebView = (BaseWebView) p10;
            if (System.currentTimeMillis() - baseWebView.lastTouchTime > com.mbridge.msdk.click.utils.a.f32945d && com.mbridge.msdk.click.utils.a.a(this.f35765e.get(0), baseWebView.getUrl(), com.mbridge.msdk.click.utils.a.f32943b)) {
                return false;
            }
            if (this.f35765e.size() > 1) {
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(c.n().d(), new Intent("android.intent.action.VIEW", Uri.parse(p11)));
                p11 = null;
            }
            com.mbridge.msdk.mbbanner.common.listener.a aVar = this.f35766f;
            if (aVar != null) {
                aVar.a(false, p11);
            }
            return true;
        } catch (Throwable th2) {
            q0.b("BannerWebViewClient", "shouldOverrideUrlLoading", th2);
            return false;
        }
    }

    public a(String str, List<CampaignEx> list, com.mbridge.msdk.mbbanner.common.listener.a aVar) {
        this.f35764d = str;
        this.f35765e = list;
        this.f35766f = aVar;
    }
}
