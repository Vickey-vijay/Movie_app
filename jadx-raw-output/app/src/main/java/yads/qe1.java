package yads;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qe1 implements ch1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eh1 f81840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationManager f81841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j53 f81842c;

    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    @Override // yads.ch1
    public final Location a() {
        List<String> allProviders;
        Location lastKnownLocation;
        try {
            LocationManager locationManager = this.f81841b;
            allProviders = locationManager != null ? locationManager.getAllProviders() : null;
        } catch (Throwable unused) {
            boolean z10 = ad1.f75480a;
        }
        if (allProviders == null) {
            return null;
        }
        List listC = nj.r.c();
        for (String str : allProviders) {
            j53 j53Var = this.f81842c;
            boolean zA = j53Var.f78920b.a("android.permission.ACCESS_COARSE_LOCATION");
            boolean zA2 = j53Var.f78920b.a("android.permission.ACCESS_FINE_LOCATION");
            boolean z11 = !j53.f78917c.contains(str);
            if (!j53.f78918d.contains(str) ? !(z11 && zA) : !(z11 && zA && zA2)) {
                lastKnownLocation = null;
            } else {
                try {
                    LocationManager locationManager2 = j53Var.f78919a;
                    if (locationManager2 != null) {
                        lastKnownLocation = locationManager2.getLastKnownLocation(str);
                        boolean z12 = ad1.f75480a;
                    } else {
                        lastKnownLocation = null;
                    }
                } catch (Throwable unused2) {
                    boolean z13 = ad1.f75480a;
                }
            }
            if (lastKnownLocation != null) {
                listC.add(lastKnownLocation);
            }
        }
        return this.f81840a.a(nj.r.a(listC));
    }

    public qe1(Context context, eh1 eh1Var) {
        LocationManager locationManager;
        this.f81840a = eh1Var;
        Object systemService = context.getApplicationContext().getSystemService("location");
        if (systemService instanceof LocationManager) {
            locationManager = (LocationManager) systemService;
        } else {
            locationManager = null;
        }
        this.f81841b = locationManager;
        this.f81842c = new j53(context.getApplicationContext(), locationManager);
    }
}
