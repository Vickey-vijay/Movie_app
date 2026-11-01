package com.fyber.inneractive.sdk.flow.storepromo.controller.webview;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.o;
import com.fyber.inneractive.sdk.config.s;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends WebViewClient {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f15611c = {"https://fonts.googleapis.com", "https://fonts.googleapis.com"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a f15612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a f15613b;

    public final void a(String str, RenderProcessGoneDetail renderProcessGoneDetail) {
        String strValueOf = "unknown";
        if (Build.VERSION.SDK_INT >= 26) {
            strValueOf = renderProcessGoneDetail != null ? String.valueOf(renderProcessGoneDetail.didCrash()) : "unknown";
            IAlog.a("%s: onRenderProcessGone: handled, webview crashed: %s view: %s", "StorePromoWebviewClient", strValueOf, str);
        } else {
            IAlog.a("%s: onRenderProcessGone: handled, view: %s", "StorePromoWebviewClient", str);
        }
        String str2 = "Webview did crash: " + strValueOf + " on webview: " + str;
        com.fyber.inneractive.sdk.network.events.b bVar = com.fyber.inneractive.sdk.network.events.b.WEB_VIEW_CRASH_ERROR;
        com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar = this.f15613b;
        if (aVar != null) {
            aVar.a(bVar, str2, null);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(g.f44970p, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        CreativeInfoManager.onWebViewPageFinished(g.f44970p, view, url);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        IAlog.a("%s: onReceivedError: error: %s errorCode: %d, failing url: %s", "StorePromoWebviewClient", str, Integer.valueOf(i10), str2);
        if (a(str2)) {
            return;
        }
        String str3 = str + " errCode: " + i10;
        com.fyber.inneractive.sdk.network.events.b bVar = com.fyber.inneractive.sdk.network.events.b.TEMPLATE_CONTENT_ERROR;
        com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar = this.f15613b;
        if (aVar != null) {
            aVar.a(bVar, str3, str2);
        }
    }

    public boolean safedk_b_shouldOverrideUrlLoading_db35551867e853a1fc9641a759277453(WebView p10, String p11) {
        IAlog.a("%s: shouldOverrideUrlLoading: url: %s", "StorePromoWebviewClient", p11);
        Uri uri = Uri.parse(p11);
        if (uri != null && !TextUtils.isEmpty(uri.getScheme()) && !TextUtils.isEmpty(uri.getAuthority()) && !TextUtils.isEmpty(uri.getHost()) && "FyRemote://".toLowerCase().contains(uri.getScheme())) {
            HashMap mapA = h0.a(uri);
            String host = uri.getHost();
            com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a aVar = this.f15612a;
            if (aVar != null) {
                aVar.a(host, mapA);
            }
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(g.f44970p, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        return CreativeInfoManager.onWebViewResponse(g.f44970p, view, url, super.shouldInterceptRequest(view, url));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/flow/storepromo/controller/webview/b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_b_shouldOverrideUrlLoading_db35551867e853a1fc9641a759277453 = safedk_b_shouldOverrideUrlLoading_db35551867e853a1fc9641a759277453(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(g.f44970p, webView, str, zSafedk_b_shouldOverrideUrlLoading_db35551867e853a1fc9641a759277453);
        return zSafedk_b_shouldOverrideUrlLoading_db35551867e853a1fc9641a759277453;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView == null) {
            a("unknown", renderProcessGoneDetail);
            return true;
        }
        a(webView.toString(), renderProcessGoneDetail);
        webView.destroy();
        return true;
    }

    public b(com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a aVar, com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar2) {
        this.f15612a = aVar;
        this.f15613b = aVar2;
    }

    public static boolean a(String str) {
        s sVar;
        if (str == null || (sVar = IAConfigManager.O.f15026u) == null) {
            return false;
        }
        o oVar = sVar.f15195b;
        String[] strArr = f15611c;
        String strA = oVar.a("font_urls", (String) null);
        if (strA != null) {
            try {
                JSONArray jSONArray = new JSONArray(strA);
                String[] strArr2 = new String[jSONArray.length()];
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    strArr2[i10] = jSONArray.getString(i10);
                }
                strArr = strArr2;
            } catch (JSONException unused) {
            }
        }
        for (String str2 : strArr) {
            if (str.contains(str2.trim())) {
                return true;
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        int errorCode;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        String string = "";
        if (webResourceError != null) {
            string = webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : "";
            errorCode = webResourceError.getErrorCode();
        } else {
            errorCode = -999;
        }
        String string2 = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? "unknown" : webResourceRequest.getUrl().toString();
        IAlog.a("%s: onReceivedError: error: %s errorCode: %d, failing url: %s", "StorePromoWebviewClient", string, Integer.valueOf(errorCode), string2);
        if (a(string2)) {
            return;
        }
        String str = string + " errCode: " + errorCode;
        com.fyber.inneractive.sdk.network.events.b bVar = com.fyber.inneractive.sdk.network.events.b.TEMPLATE_CONTENT_ERROR;
        com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar = this.f15613b;
        if (aVar != null) {
            aVar.a(bVar, str, string2);
        }
    }
}
