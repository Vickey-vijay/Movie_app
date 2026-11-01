package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* JADX INFO: loaded from: classes.dex */
public final class Ph implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f55737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4248hi f55738b;

    public Ph(C4248hi c4248hi, Revenue revenue) {
        this.f55738b = c4248hi;
        this.f55737a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4248hi c4248hi = this.f55738b;
        C4248hi.a(c4248hi.f56907a, c4248hi.f56910d, c4248hi.f56911e).reportRevenue(this.f55737a);
    }
}
