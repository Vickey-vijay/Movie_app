package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* JADX INFO: loaded from: classes.dex */
public final class Qh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f55803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4248hi f55804b;

    public Qh(C4248hi c4248hi, AdRevenue adRevenue) {
        this.f55804b = c4248hi;
        this.f55803a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4248hi c4248hi = this.f55804b;
        C4248hi.a(c4248hi.f56907a, c4248hi.f56910d, c4248hi.f56911e).reportAdRevenue(this.f55803a);
    }
}
