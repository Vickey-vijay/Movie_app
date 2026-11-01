package io.appmetrica.analytics.impl;

import android.app.Activity;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class RunnableC4306k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f57062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4357m f57063b;

    public RunnableC4306k(C4357m c4357m, Activity activity) {
        this.f57063b = c4357m;
        this.f57062a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f57063b.a(this.f57062a);
    }
}
