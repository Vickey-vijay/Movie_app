package io.appmetrica.analytics.gpllibrary.internal;

import android.location.Location;
import android.location.LocationListener;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: loaded from: classes5.dex */
class GplOnSuccessListener implements OnSuccessListener<Location> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocationListener f54824a;

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Location location) {
        this.f54824a.onLocationChanged(location);
    }

    public GplOnSuccessListener(LocationListener locationListener) {
        this.f54824a = locationListener;
    }
}
