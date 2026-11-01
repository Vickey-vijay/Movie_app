package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;

/* JADX INFO: compiled from: WindVanePlugin.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f36135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f36136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WindVaneWebView f36137c;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.f36135a = context;
        this.f36137c = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.f36136b = obj;
        this.f36137c = windVaneWebView;
    }
}
