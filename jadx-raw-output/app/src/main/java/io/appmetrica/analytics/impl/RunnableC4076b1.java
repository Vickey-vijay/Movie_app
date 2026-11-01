package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC4076b1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeferredDeeplinkListener f56392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f56393b;

    public RunnableC4076b1(C4558u1 c4558u1, DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f56393b = c4558u1;
        this.f56392a = deferredDeeplinkListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f56393b.f57743a.getClass();
        C4657y0 c4657y0 = C4657y0.f57980e;
        c4657y0.f().a(this.f56392a);
    }
}
