package com.fyber.inneractive.sdk.flow.storepromo.loader;

import com.safedk.android.internal.partials.DTExchangeNetworkBridge;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f15615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f15616b;

    public c(d dVar, String str) {
        this.f15616b = dVar;
        this.f15615a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f15616b.f15617a;
        String str = this.f15615a;
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = fVar.f15620a;
        if (aVar != null) {
            try {
                DTExchangeNetworkBridge.webviewLoadDataWithBaseURL(aVar, null, str, "text/html", "UTF-8", null);
            } catch (Throwable th2) {
                if (fVar.f15624e != null) {
                    fVar.f15624e.a(com.fyber.inneractive.sdk.network.events.b.WEB_VIEW_CRASH_ERROR, "Unable to load data: " + th2.getMessage(), "");
                }
            }
        }
    }
}
