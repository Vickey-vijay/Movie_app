package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.G5;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f15061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15062b;

    public f0(String str, String str2) {
        this.f15061a = str;
        this.f15062b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        WebView webView;
        IAConfigManager iAConfigManager = IAConfigManager.O;
        if (iAConfigManager.L == null && (context = iAConfigManager.f15011f) != null) {
            try {
                webView = new WebView(context);
                webView.setWebViewClient(new y());
            } catch (Throwable unused) {
                IAlog.a("failed to create a new webview", new Object[0]);
                webView = null;
            }
            iAConfigManager.L = webView;
        }
        WebView webView2 = iAConfigManager.L;
        String str = this.f15061a;
        String str2 = this.f15062b;
        if (webView2 != null) {
            if (str2 == null) {
                str2 = "";
            }
            DTExchangeNetworkBridge.webviewLoadDataWithBaseURL(webView2, str, str2, "text/html", G5.N, null);
        }
        com.fyber.inneractive.sdk.util.r.f18607b.postDelayed(IAConfigManager.Q, TimeUnit.SECONDS.toMillis(10L));
    }
}
