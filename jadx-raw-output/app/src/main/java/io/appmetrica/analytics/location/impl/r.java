package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.location.impl.r;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends u implements LocationReceiver {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Looper f58131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f58132f;

    public r(Context context, Looper looper, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener) {
        super(context, permissionResolutionStrategy, locationListener, "passive");
        this.f58131e = looper;
        this.f58132f = TimeUnit.SECONDS.toMillis(1L);
    }

    public static final mj.r a(r rVar, LocationManager locationManager) {
        locationManager.requestLocationUpdates(rVar.f58141d, rVar.f58132f, 0.0f, rVar.f58140c, rVar.f58131e);
        return mj.r.f64562a;
    }

    public static final mj.r b(r rVar, LocationManager locationManager) {
        locationManager.removeUpdates(rVar.f58140c);
        return mj.r.f64562a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void startLocationUpdates() {
        if (this.f58139b.hasNecessaryPermissions(this.f58138a)) {
            SystemServiceUtils.accessSystemServiceByNameSafely(this.f58138a, "location", "request location updates for " + this.f58141d + " provider", "location manager", new FunctionWithThrowable() { // from class: bf.a
                @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
                public final Object apply(Object obj) {
                    return r.a(this.f5348a, (LocationManager) obj);
                }
            });
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void stopLocationUpdates() {
        SystemServiceUtils.accessSystemServiceByNameSafely(this.f58138a, "location", "stop location updates for passive provider", "location manager", new FunctionWithThrowable() { // from class: bf.b
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return r.b(this.f5349a, (LocationManager) obj);
            }
        });
    }
}
