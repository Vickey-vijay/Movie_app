package com.fyber.inneractive.sdk.util;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes6.dex */
public final class o0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f18600a;

    public o0(WebView webView) {
        this.f18600a = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18600a.getSettings().setDisplayZoomControls(false);
    }
}
