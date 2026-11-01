package com.vungle.ads.internal.ui.view;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import com.ironsource.C3426d4;
import com.ironsource.sdk.controller.f;
import com.mbridge.msdk.MBridgeConstans;
import com.vungle.ads.internal.omsdk.WebViewObserver;
import kotlin.Metadata;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: WebViewAPI.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\u0018\u0019J8\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H&J\u0012\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0002H&J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0002H&J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H&J\u0012\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H&¨\u0006\u001a"}, d2 = {"Lcom/vungle/ads/internal/ui/view/WebViewAPI;", "", "", "collectedConsent", "", "title", "message", "accept", "deny", "Lmj/r;", "setConsentStatus", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;", "mraidDelegate", "setMraidDelegate", "skipCmdQueue", "notifyPropertiesChange", C3426d4.i.f28556o, "setAdVisibility", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "errorHandler", "setErrorHandler", "Lcom/vungle/ads/internal/omsdk/WebViewObserver;", "webViewObserver", "setWebViewObserver", "MraidDelegate", "WebClientErrorHandler", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public interface WebViewAPI {

    /* JADX INFO: compiled from: WebViewAPI.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;", "", "processCommand", "", f.b.f30923g, "", "arguments", "Lkotlinx/serialization/json/JsonObject;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface MraidDelegate {
        boolean processCommand(String command, JsonObject arguments);
    }

    /* JADX INFO: compiled from: WebViewAPI.kt */
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J#\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u000f\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH&¨\u0006\u0010"}, d2 = {"Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "", "", "errorDesc", "", "didCrash", "Lmj/r;", "onReceivedError", "Landroid/webkit/WebView;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onWebRenderingProcessGone", "(Landroid/webkit/WebView;Ljava/lang/Boolean;)Z", "webView", "Landroid/webkit/WebViewRenderProcess;", "webViewRenderProcess", "onRenderProcessUnresponsive", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public interface WebClientErrorHandler {
        void onReceivedError(String str, boolean z10);

        void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess);

        boolean onWebRenderingProcessGone(WebView view, Boolean didCrash);
    }

    void notifyPropertiesChange(boolean z10);

    void setAdVisibility(boolean z10);

    void setConsentStatus(boolean z10, String str, String str2, String str3, String str4);

    void setErrorHandler(WebClientErrorHandler webClientErrorHandler);

    void setMraidDelegate(MraidDelegate mraidDelegate);

    void setWebViewObserver(WebViewObserver webViewObserver);
}
