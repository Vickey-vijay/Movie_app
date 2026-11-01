package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* JADX INFO: loaded from: classes6.dex */
public final class Ij implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f55358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f55359b;

    public Ij(AdRevenue adRevenue, boolean z10) {
        this.f55358a = adRevenue;
        this.f55359b = z10;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa2) {
        sa2.reportAdRevenue(this.f55358a, this.f55359b);
    }
}
