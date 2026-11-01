package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* JADX INFO: loaded from: classes2.dex */
public final class Bj implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f55040a;

    public Bj(AdRevenue adRevenue) {
        this.f55040a = adRevenue;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa2) {
        sa2.reportAdRevenue(this.f55040a);
    }
}
