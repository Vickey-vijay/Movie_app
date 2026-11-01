package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: classes2.dex */
class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s f31054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f31055b = false;

    @JavascriptInterface
    public String getTokenForMessaging() {
        if (this.f31055b) {
            return "";
        }
        this.f31055b = true;
        return this.f31054a.b();
    }

    public r(s sVar) {
        this.f31054a = sVar;
    }
}
