package com.fyber.inneractive.sdk.web;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.util.e f18659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.util.d f18660d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f18663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f18664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f18665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f18666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f18667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f18668l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f18658b = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f18661e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18662f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f18657a = Executors.newSingleThreadExecutor(new com.fyber.inneractive.sdk.util.b());

    public e(i1 i1Var, String str, boolean z10, String str2, String str3, String str4) {
        this.f18668l = i1Var;
        this.f18663g = str;
        this.f18664h = z10;
        this.f18665i = str2;
        this.f18666j = str3;
        this.f18667k = str4;
    }

    public final Handler a() {
        if (this.f18658b == null) {
            synchronized (this.f18661e) {
                this.f18658b = new Handler(Looper.getMainLooper());
            }
        }
        return this.f18658b;
    }
}
