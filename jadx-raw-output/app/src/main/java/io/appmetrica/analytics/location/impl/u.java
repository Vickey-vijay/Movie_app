package io.appmetrica.analytics.location.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.location.impl.u;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;

/* JADX INFO: loaded from: classes2.dex */
public class u implements LastKnownLocationExtractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f58138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f58139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocationListener f58140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f58141d;

    public final Context a() {
        return this.f58138a;
    }

    public static final Location a(u uVar, LocationManager locationManager) {
        return locationManager.getLastKnownLocation(uVar.f58141d);
    }

    public final LocationListener b() {
        return this.f58140c;
    }

    public final PermissionResolutionStrategy c() {
        return this.f58139b;
    }

    public final String d() {
        return this.f58141d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    @SuppressLint({"MissingPermission"})
    public final void updateLastKnownLocation() {
        if (this.f58139b.hasNecessaryPermissions(this.f58138a)) {
            Location location = (Location) SystemServiceUtils.accessSystemServiceByNameSafely(this.f58138a, "location", "getting last known location for provider " + this.f58141d, "location manager", new FunctionWithThrowable() { // from class: bf.c
                @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
                public final Object apply(Object obj) {
                    return u.a(this.f5350a, (LocationManager) obj);
                }
            });
            if (location != null) {
                this.f58140c.onLocationChanged(location);
            }
        }
    }

    public u(Context context, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener, String str) {
        this.f58138a = context;
        this.f58139b = permissionResolutionStrategy;
        this.f58140c = locationListener;
        this.f58141d = str;
    }
}
