package io.appmetrica.analytics.gpllibrary.internal;

import android.location.LocationListener;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: loaded from: classes2.dex */
class GplLocationCallback extends LocationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocationListener f54823a;

    public void onLocationResult(LocationResult locationResult) {
        this.f54823a.onLocationChanged(locationResult.getLastLocation());
    }

    public GplLocationCallback(LocationListener locationListener) {
        this.f54823a = locationListener;
    }
}
