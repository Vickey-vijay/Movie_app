package com.inmobi.media;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: com.inmobi.media.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2898h3 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f24475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f24476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2923i3 f24477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S2 f24478d;

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44963i, view, url);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/h3;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44963i, webView, str);
        safedk_h3_onPageFinished_d95b7ace30509833f0457edf6a35d1dc(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        ck.p.j(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(str, UnifiedMediationParams.KEY_DESCRIPTION);
        ck.p.j(str2, "failingUrl");
        C2923i3.a(this.f24475a, this.f24476b, this.f24477c, this.f24478d, false);
    }

    public boolean safedk_h3_shouldOverrideUrlLoading_ef7b54c034a5482f39626c2abf695b2e(WebView p10, WebResourceRequest p11) {
        ck.p.j(p10, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(p11, AdActivity.REQUEST_KEY_EXTRA);
        return (this.f24478d.f23481d || ck.p.e(p11.getUrl().toString(), this.f24478d.f23479b)) ? false : true;
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
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/h3;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean zSafedk_h3_shouldOverrideUrlLoading_ef7b54c034a5482f39626c2abf695b2e = safedk_h3_shouldOverrideUrlLoading_ef7b54c034a5482f39626c2abf695b2e(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoadingWithHeaders(com.safedk.android.utils.g.f44963i, webView, webResourceRequest, zSafedk_h3_shouldOverrideUrlLoading_ef7b54c034a5482f39626c2abf695b2e);
        return zSafedk_h3_shouldOverrideUrlLoading_ef7b54c034a5482f39626c2abf695b2e;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/h3;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_h3_shouldOverrideUrlLoading_98b7c73acc447aaf353a32d7d6b19fcc = safedk_h3_shouldOverrideUrlLoading_98b7c73acc447aaf353a32d7d6b19fcc(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f44963i, webView, str, zSafedk_h3_shouldOverrideUrlLoading_98b7c73acc447aaf353a32d7d6b19fcc);
        return zSafedk_h3_shouldOverrideUrlLoading_98b7c73acc447aaf353a32d7d6b19fcc;
    }

    public C2898h3(AtomicBoolean atomicBoolean, Ref$ObjectRef ref$ObjectRef, C2923i3 c2923i3, S2 s10) {
        this.f24475a = atomicBoolean;
        this.f24476b = ref$ObjectRef;
        this.f24477c = c2923i3;
        this.f24478d = s10;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        ck.p.j(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(webResourceRequest, AdActivity.REQUEST_KEY_EXTRA);
        ck.p.j(webResourceError, "error");
        C2923i3.a(this.f24475a, this.f24476b, this.f24477c, this.f24478d, false);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        ck.p.j(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(webResourceRequest, AdActivity.REQUEST_KEY_EXTRA);
        ck.p.j(webResourceResponse, "errorResponse");
        C2923i3.a(this.f24475a, this.f24476b, this.f24477c, this.f24478d, false);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        ck.p.j(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(renderProcessGoneDetail, "detail");
        C2923i3.a(this.f24475a, this.f24476b, this.f24477c, this.f24478d, false);
        return oo.a(webView, renderProcessGoneDetail, "click_mgr");
    }

    public void safedk_h3_onPageFinished_d95b7ace30509833f0457edf6a35d1dc(WebView p10, String p11) {
        C2923i3.a(this.f24475a, this.f24476b, this.f24477c, this.f24478d, true);
    }

    public boolean safedk_h3_shouldOverrideUrlLoading_98b7c73acc447aaf353a32d7d6b19fcc(WebView p10, String p11) {
        ck.p.j(p10, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(p11, "url");
        S2 s10 = this.f24478d;
        return (s10.f23481d || ck.p.e(p11, s10.f23479b)) ? false : true;
    }
}
