package com.fyber.inneractive.sdk.web;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f18736a;

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
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/web/m0;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_m0_shouldOverrideUrlLoading_7aeb99688b0e69bc90d8de69d03a3f02 = safedk_m0_shouldOverrideUrlLoading_7aeb99688b0e69bc90d8de69d03a3f02(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f44970p, webView, str, zSafedk_m0_shouldOverrideUrlLoading_7aeb99688b0e69bc90d8de69d03a3f02);
        return zSafedk_m0_shouldOverrideUrlLoading_7aeb99688b0e69bc90d8de69d03a3f02;
    }

    public m0(v0 v0Var) {
        this.f18736a = v0Var;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Activity activity = (Activity) com.fyber.inneractive.sdk.util.v.a(this.f18736a.f18777q);
        if (activity != null) {
            activity.finish();
        }
        com.fyber.inneractive.sdk.util.r.f18607b.postDelayed(new l0(this), 1000L);
        return true;
    }

    public boolean safedk_m0_shouldOverrideUrlLoading_7aeb99688b0e69bc90d8de69d03a3f02(WebView p10, String p11) {
        if (p11.endsWith("success")) {
            v0 v0Var = this.f18736a;
            n0 n0Var = v0Var.f18776p;
            if (n0Var != null) {
                com.fyber.inneractive.sdk.util.r.f18607b.removeCallbacks(n0Var);
                v0Var.f18776p = null;
            }
            v0 v0Var2 = this.f18736a;
            v0Var2.getClass();
            IAlog.a("%sInternalStoreWebpageController: onWebviewLoaded - load took %d msec", IAlog.a(v0Var2), Long.valueOf(System.currentTimeMillis() - this.f18736a.f18775o));
            this.f18736a.f18772l = true;
            return true;
        }
        if (!p11.startsWith("exit")) {
            return false;
        }
        Activity activity = (Activity) com.fyber.inneractive.sdk.util.v.a(this.f18736a.f18777q);
        if (activity == null) {
            return true;
        }
        try {
            Uri uri = Uri.parse(p11);
            String queryParameter = uri.getQueryParameter(TypedValues.AttributesType.S_TARGET);
            boolean zEquals = TextUtils.equals("mail", uri.getAuthority());
            Intent intent = new Intent(zEquals ? "android.intent.action.SENDTO" : "android.intent.action.VIEW", Uri.parse(queryParameter));
            if (zEquals) {
                intent = Intent.createChooser(intent, "Choose an application");
            }
            com.fyber.inneractive.sdk.util.h0.a(activity, intent);
        } catch (Throwable th2) {
            com.fyber.inneractive.sdk.network.z.a(th2, null, null);
        }
        return true;
    }
}
