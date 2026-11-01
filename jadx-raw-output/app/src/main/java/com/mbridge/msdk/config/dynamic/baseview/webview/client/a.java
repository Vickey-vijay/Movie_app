package com.mbridge.msdk.config.dynamic.baseview.webview.client;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: compiled from: MBWebChromeClient.java */
/* JADX INFO: loaded from: classes6.dex */
public class a extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33861a = "MBWebChromeClient";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.webview.listener.a f33862b;

    public void a(com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar) {
        this.f33862b = aVar;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar = this.f33862b;
        if (aVar != null) {
            aVar.onProgressChanged(webView, i10);
        }
    }
}
