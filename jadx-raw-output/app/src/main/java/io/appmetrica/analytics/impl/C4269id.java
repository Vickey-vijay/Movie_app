package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.id, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4269id extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4421od f56969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f56970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f56971c;

    public C4269id(C4421od c4421od, AdRevenue adRevenue, boolean z10) {
        this.f56969a = c4421od;
        this.f56970b = adRevenue;
        this.f56971c = z10;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C4421od.a(this.f56969a).reportAdRevenue(this.f56970b, this.f56971c);
    }
}
