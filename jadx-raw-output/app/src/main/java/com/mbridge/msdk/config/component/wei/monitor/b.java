package com.mbridge.msdk.config.component.wei.monitor;

import android.webkit.WebView;
import com.iab.omid.library.mmadbridge.adsession.AdSession;

/* JADX INFO: compiled from: OMSDKWebMonitor.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdSession f33655a;

    public void a(WebView webView) {
        this.f33655a.registerAdView(webView);
    }

    public b(AdSession adSession) {
        this.f33655a = adSession;
    }
}
