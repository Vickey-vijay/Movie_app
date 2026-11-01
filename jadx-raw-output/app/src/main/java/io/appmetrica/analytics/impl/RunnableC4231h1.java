package io.appmetrica.analytics.impl;

import android.app.Activity;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class RunnableC4231h1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f56869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f56870b;

    public RunnableC4231h1(C4558u1 c4558u1, Activity activity) {
        this.f56870b = c4558u1;
        this.f56869a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4558u1 c4558u1 = this.f56870b;
        Xk xk2 = c4558u1.f57750h;
        Activity activity = this.f56869a;
        Ja ja2 = c4558u1.d().f57104a;
        if (activity != null) {
            xk2.f56172f.a(activity);
        }
        if (xk2.f56171e.a(activity, EnumC4432p.RESUMED)) {
            ja2.a(activity);
        }
    }
}
