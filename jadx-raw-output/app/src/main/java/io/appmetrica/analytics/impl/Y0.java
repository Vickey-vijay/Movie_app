package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* JADX INFO: loaded from: classes7.dex */
public final class Y0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f56193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f56194b;

    public Y0(C4558u1 c4558u1, AdRevenue adRevenue) {
        this.f56194b = c4558u1;
        this.f56193a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4558u1.a(this.f56194b).reportAdRevenue(this.f56193a);
    }
}
