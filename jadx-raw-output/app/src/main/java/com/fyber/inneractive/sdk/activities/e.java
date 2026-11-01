package com.fyber.inneractive.sdk.activities;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f14855a;

    public e(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f14855a = inneractiveInternalBrowserActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        this.f14855a.setTitle("Page is Loading...");
        this.f14855a.setProgress(i10 * 100);
        if (i10 == 100) {
            this.f14855a.setTitle(webView.getUrl());
        }
    }
}
