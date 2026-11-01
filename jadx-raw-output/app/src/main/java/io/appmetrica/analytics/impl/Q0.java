package io.appmetrica.analytics.impl;

import android.location.Location;

/* JADX INFO: loaded from: classes.dex */
public final class Q0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Location f55762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f55763b;

    public Q0(C4558u1 c4558u1, Location location) {
        this.f55763b = c4558u1;
        this.f55762a = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4682z0 c4682z0 = this.f55763b.f57743a;
        Location location = this.f55762a;
        c4682z0.getClass();
        C4657y0.c().a(location);
    }
}
