package com.fyber.inneractive.sdk.measurement.tracker;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f15830a;

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.a("clearing webview", new Object[0]);
        WebView webView = this.f15830a.f15835e;
        if (webView != null) {
            webView.destroy();
            this.f15830a.f15835e = null;
        }
    }

    public c(e eVar) {
        this.f15830a = eVar;
    }
}
