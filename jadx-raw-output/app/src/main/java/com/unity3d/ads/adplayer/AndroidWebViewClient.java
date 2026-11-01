package com.unity3d.ads.adplayer;

import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import ck.i;
import ck.p;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.unity3d.ads.adplayer.model.ErrorReason;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ViewExtensionsKt;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import lk.a0;
import mj.h;
import nj.b0;
import nj.l0;
import nj.s;
import nk.p0;
import nk.u;
import nk.w;
import qk.e;
import qk.l;
import qk.v;

/* JADX INFO: compiled from: AndroidWebViewClient.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class AndroidWebViewClient extends WebViewClientCompat {
    public static final String BLANK_PAGE = "about:blank";
    public static final Companion Companion = new Companion(null);
    private final l<Boolean> _isRenderProcessGone;
    private final u<List<WebViewClientError>> _onLoadFinished;
    private final GetCachedAsset getCachedAsset;
    private final qk.u<Boolean> isRenderProcessGone;
    private final l<List<WebViewClientError>> loadErrors;
    private final p0<List<WebViewClientError>> onLoadFinished;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final l<String> webviewType;

    /* JADX INFO: compiled from: AndroidWebViewClient.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded("com.unity3d.ads", view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Logger.d("UnityAds|SafeDK: Execution> Lcom/unity3d/ads/adplayer/AndroidWebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished("com.unity3d.ads", webView, str);
        safedk_AndroidWebViewClient_onPageFinished_c32d877a4f6d9be00042295319f45cf6(webView, str);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("UnityAds|SafeDK: Execution> Lcom/unity3d/ads/adplayer/AndroidWebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders("com.unity3d.ads", webView, webResourceRequest, safedk_AndroidWebViewClient_shouldInterceptRequest_1bf4791435f30a5bff2fd7f264c747a0(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        return CreativeInfoManager.onWebViewResponse("com.unity3d.ads", view, url, super.shouldInterceptRequest(view, url));
    }

    public AndroidWebViewClient(GetCachedAsset getCachedAsset, SendDiagnosticEvent sendDiagnosticEvent) {
        p.j(getCachedAsset, "getCachedAsset");
        p.j(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getCachedAsset = getCachedAsset;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.loadErrors = v.a(s.k());
        u<List<WebViewClientError>> uVarC = w.c(null, 1, null);
        this._onLoadFinished = uVarC;
        this.onLoadFinished = uVarC;
        l<Boolean> lVarA = v.a(Boolean.FALSE);
        this._isRenderProcessGone = lVarA;
        this.isRenderProcessGone = e.b(lVarA);
        this.webviewType = v.a("");
    }

    public final p0<List<WebViewClientError>> getOnLoadFinished() {
        return this.onLoadFinished;
    }

    public final qk.u<Boolean> isRenderProcessGone() {
        return this.isRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        List<WebViewClientError> value;
        p.j(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        p.j(renderProcessGoneDetail, "detail");
        ViewExtensionsKt.removeViewFromParent(webView);
        webView.destroy();
        if (!this._onLoadFinished.d()) {
            l<List<WebViewClientError>> lVar = this.loadErrors;
            do {
                value = lVar.getValue();
            } while (!lVar.a(value, b0.z0(value, new WebViewClientError(String.valueOf(webView.getUrl()), ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null))));
            this._onLoadFinished.i(this.loadErrors.getValue());
            return true;
        }
        this._isRenderProcessGone.setValue(Boolean.TRUE);
        return true;
    }

    public void safedk_AndroidWebViewClient_onPageFinished_c32d877a4f6d9be00042295319f45cf6(WebView p10, String p11) {
        List<WebViewClientError> value;
        p.j(p10, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        p.j(p11, "url");
        if (p.e(p11, BLANK_PAGE)) {
            l<List<WebViewClientError>> lVar = this.loadErrors;
            do {
                value = lVar.getValue();
            } while (!lVar.a(value, b0.z0(value, new WebViewClientError(p11, ErrorReason.REASON_WEB_BLANK, null, 4, null))));
        }
        super.onPageFinished(p10, p11);
        this._onLoadFinished.i(this.loadErrors.getValue());
    }

    public WebResourceResponse safedk_AndroidWebViewClient_shouldInterceptRequest_1bf4791435f30a5bff2fd7f264c747a0(WebView p10, WebResourceRequest p11) {
        Map mapJ;
        Object objM3458constructorimpl;
        boolean z10;
        p.j(p10, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        p.j(p11, AdActivity.REQUEST_KEY_EXTRA);
        Uri url = p11.getUrl();
        if (url == null) {
            return super.shouldInterceptRequest(p10, p11);
        }
        try {
            try {
                Result.a aVar = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(url.getQueryParameter("webviewType"));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
            }
            if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
                objM3458constructorimpl = null;
            }
            String str = (String) objM3458constructorimpl;
            if (str != null && !a0.n0(str)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                this.webviewType.setValue(str);
            }
            if (p.e(url.getLastPathSegment(), "favicon.ico")) {
                return new WebResourceResponse("image/png", null, null);
            }
            GetCachedAsset getCachedAsset = this.getCachedAsset;
            Uri url2 = p11.getUrl();
            p.i(url2, "request.url");
            return getCachedAsset.invoke(url2, this.webviewType.getValue());
        } catch (Throwable th3) {
            String message = th3.getMessage();
            if (message == null || (mapJ = l0.g(h.a("reason", message))) == null) {
                mapJ = kotlin.collections.a.j();
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "webview_could_not_handle_intercepted_url", null, mapJ, null, null, null, 58, null);
            return super.shouldInterceptRequest(p10, p11);
        }
    }
}
