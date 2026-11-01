package io.appmetrica.analytics.impl;

import android.app.Activity;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class RunnableC4384n1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f57302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f57303b;

    public RunnableC4384n1(C4558u1 c4558u1, Activity activity) {
        this.f57303b = c4558u1;
        this.f57302a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4558u1 c4558u1 = this.f57303b;
        Xk xk2 = c4558u1.f57750h;
        Activity activity = this.f57302a;
        Ja ja2 = c4558u1.d().f57104a;
        if (activity != null) {
            xk2.f56172f.a(activity);
        }
        if (xk2.f56171e.a(activity, EnumC4432p.PAUSED)) {
            ja2.b(activity);
        }
    }
}
