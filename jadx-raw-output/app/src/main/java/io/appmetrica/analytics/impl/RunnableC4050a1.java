package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkParametersListener;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC4050a1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeferredDeeplinkParametersListener f56314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f56315b;

    public RunnableC4050a1(C4558u1 c4558u1, DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f56315b = c4558u1;
        this.f56314a = deferredDeeplinkParametersListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f56315b.f57743a.getClass();
        C4657y0 c4657y0 = C4657y0.f57980e;
        c4657y0.f().a(this.f56314a);
    }
}
