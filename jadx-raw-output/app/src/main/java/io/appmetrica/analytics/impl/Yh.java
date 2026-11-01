package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* JADX INFO: loaded from: classes7.dex */
public final class Yh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f56251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f56252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4248hi f56253c;

    public Yh(C4248hi c4248hi, AdRevenue adRevenue, boolean z10) {
        this.f56253c = c4248hi;
        this.f56251a = adRevenue;
        this.f56252b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4248hi c4248hi = this.f56253c;
        C4248hi.a(c4248hi.f56907a, c4248hi.f56910d, c4248hi.f56911e).reportAdRevenue(this.f56251a, this.f56252b);
    }
}
