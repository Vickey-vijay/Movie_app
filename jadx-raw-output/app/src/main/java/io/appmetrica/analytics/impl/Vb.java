package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class Vb implements PermissionStrategy, LocationControllerObserver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Ub f56019b = new Ub();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f56020c = nj.s.n("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f56021a;

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void startLocationTracking() {
        this.f56021a = true;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void stopLocationTracking() {
        this.f56021a = false;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(String str) {
        if (f56020c.contains(str)) {
            return !this.f56021a;
        }
        return false;
    }

    public final String toString() {
        return "LocationFlagStrategy(enabled=" + this.f56021a + ", locationPermissions=" + f56020c + ')';
    }
}
