package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC4632x0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4657y0 f57901a;

    public RunnableC4632x0(C4657y0 c4657y0) {
        this.f57901a = c4657y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4105c4.l().f56438c.a().executeDelayed(new RunnableC4608w1(this.f57901a.f57983a), TimeUnit.SECONDS.toMillis(5L));
    }
}
