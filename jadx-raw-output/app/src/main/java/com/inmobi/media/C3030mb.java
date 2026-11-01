package com.inmobi.media;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.provider.Settings;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import com.inmobi.media.C3030mb;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.UnityAdsConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.mb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3030mb implements LocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3030mb f24820a = new C3030mb();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LocationManager f24821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HandlerThread f24822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static GoogleApiClient f24823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f24824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f24825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wk.a f24826g;

    public static boolean d() {
        try {
            return Kf.a(Ji.f22951a, "android.permission.ACCESS_FINE_LOCATION") || Kf.a(Ji.f22951a, "android.permission.ACCESS_COARSE_LOCATION");
        } catch (Exception unused) {
            ck.p.i(f24824e, "TAG");
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) throws Throwable {
        C3005lb c3005lb;
        wk.a aVar;
        if (continuationImpl instanceof C3005lb) {
            c3005lb = (C3005lb) continuationImpl;
            int i10 = c3005lb.f24763d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3005lb.f24763d = i10 - Integer.MIN_VALUE;
            } else {
                c3005lb = new C3005lb(this, continuationImpl);
            }
        } else {
            c3005lb = new C3005lb(this, continuationImpl);
        }
        Object obj = c3005lb.f24761b;
        Object objF = sj.a.f();
        int i11 = c3005lb.f24763d;
        if (i11 == 0) {
            kotlin.c.b(obj);
            wk.a aVar2 = f24826g;
            c3005lb.f24760a = aVar2;
            c3005lb.f24763d = 1;
            if (aVar2.a(null, c3005lb) == objF) {
                return objF;
            }
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = c3005lb.f24760a;
            kotlin.c.b(obj);
        }
        try {
            try {
                C3030mb c3030mb = f24820a;
                if (d() && e()) {
                    c3030mb.b();
                    if (!f()) {
                        a(Ji.f22951a);
                    }
                }
            } catch (Exception e10) {
                ck.p.i(f24824e, "TAG");
                e10.getMessage();
            }
            return mj.r.f64562a;
        } finally {
            aVar.b(null);
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        ck.p.j(str, IronSourceConstants.EVENTS_PROVIDER);
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
        ck.p.j(str, IronSourceConstants.EVENTS_PROVIDER);
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i10, Bundle bundle) {
    }

    static {
        HandlerThread handlerThread = new HandlerThread("LThread");
        f24822c = handlerThread;
        f24824e = C3030mb.class.getSimpleName();
        f24826g = wk.g.b(false, 1, null);
        H6.a(handlerThread, "LThread");
        Context context = Ji.f22951a;
        if (context != null) {
            Object systemService = context.getSystemService("location");
            f24821b = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        }
    }

    public static Location c() {
        try {
            Context context = Ji.f22951a;
            ck.p.g(context);
            FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
            ck.p.i(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
            Task lastLocation = fusedLocationProviderClient.getLastLocation();
            ck.p.i(lastLocation, "getLastLocation(...)");
            return (Location) lastLocation.getResult();
        } catch (Exception unused) {
            return null;
        } catch (IncompatibleClassChangeError e10) {
            ck.p.i(f24824e, "TAG");
            e10.toString();
            return null;
        }
    }

    public static boolean e() {
        int i10;
        Context context = Ji.f22951a;
        if (context == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            LocationManager locationManager = f24821b;
            return locationManager != null && locationManager.isLocationEnabled();
        }
        try {
            i10 = Settings.Secure.getInt(context.getContentResolver(), "location_mode");
        } catch (Settings.SettingNotFoundException unused) {
            i10 = 0;
        }
        return i10 != 0;
    }

    public static boolean f() {
        try {
            ck.s.b(GoogleApiClient.class).i();
            ck.s.b(FusedLocationProviderClient.class).i();
            ck.s.b(LocationServices.class).i();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    public final void b() {
        LocationManager locationManager = f24821b;
        if (locationManager != null) {
            Criteria criteria = new Criteria();
            criteria.setBearingAccuracy(2);
            criteria.setPowerRequirement(2);
            criteria.setCostAllowed(false);
            String bestProvider = locationManager.getBestProvider(criteria, true);
            if (bestProvider != null) {
                ck.p.i(f24824e, "TAG");
                locationManager.requestSingleUpdate(bestProvider, this, f24822c.getLooper());
            } else {
                String str = f24824e;
                ck.p.i(str, "TAG");
                ck.p.i(str, "TAG");
            }
        }
        mj.r rVar = mj.r.f64562a;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        LocationManager locationManager;
        ck.p.j(location, "location");
        try {
            ck.p.i(f24824e, "TAG");
            location.getTime();
            location.getLatitude();
            location.getLongitude();
            location.getAccuracy();
            if (!d() || (locationManager = f24821b) == null) {
                return;
            }
            locationManager.removeUpdates(this);
        } catch (Exception e10) {
            mj.g gVar = P9.f23321a;
            AbstractC2929i9.a(e10);
        }
    }

    public static void a(Context context) {
        try {
            GoogleApiClient googleApiClient = f24823d;
            if (googleApiClient == null) {
                ck.p.i(f24824e, "TAG");
                ck.p.g(context);
                GoogleApiClient googleApiClientBuild = new GoogleApiClient.Builder(context).addConnectionCallbacks(new C2980kb()).addOnConnectionFailedListener(new GoogleApiClient.OnConnectionFailedListener() { // from class: b7.n9
                    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
                    public final void onConnectionFailed(ConnectionResult connectionResult) {
                        C3030mb.a(connectionResult);
                    }
                }).addApi(LocationServices.API).build();
                f24823d = googleApiClientBuild;
                if (googleApiClientBuild != null) {
                    googleApiClientBuild.connect();
                    return;
                }
                return;
            }
            googleApiClient.connect();
        } catch (Exception e10) {
            ck.p.i(f24824e, "TAG");
            e10.getMessage();
        }
    }

    public static final void a(ConnectionResult connectionResult) {
        ck.p.j(connectionResult, "it");
        f24825f = false;
    }

    public static Location a() {
        Location location;
        Location locationC;
        Location locationA;
        try {
            if (e() && d()) {
                locationC = f24825f ? c() : null;
                try {
                    locationA = (f24821b == null || !Kf.a(Ji.f22951a, "android.permission.ACCESS_COARSE_LOCATION")) ? null : a(2, 2);
                } catch (Exception e10) {
                    location = locationC;
                    e = e10;
                    ck.p.i(f24824e, "TAG");
                    e.getMessage();
                    locationC = location;
                }
            } else {
                locationC = null;
                locationA = null;
            }
        } catch (Exception e11) {
            e = e11;
            location = null;
        }
        if (locationC == null && locationA == null) {
            ck.p.i(f24824e, "TAG");
            return null;
        }
        return a(locationC, locationA);
    }

    public static Location a(Location location, Location location2) {
        if (location == null) {
            ck.p.i(f24824e, "TAG");
            if (location2 != null) {
                location2.getTime();
            }
            Objects.toString(location2);
            return location2;
        }
        if (location2 == null) {
            ck.p.i(f24824e, "TAG");
            location.getTime();
            location.toString();
            return location;
        }
        long time = location.getTime() - location2.getTime();
        boolean z10 = time > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        boolean z11 = time < -120000;
        boolean z12 = time > 0;
        if (z10) {
            ck.p.i(f24824e, "TAG");
            location.getTime();
            location.toString();
            return location;
        }
        if (z11) {
            ck.p.i(f24824e, "TAG");
            location2.getTime();
            location2.toString();
            return location2;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z13 = accuracy > 0;
        boolean z14 = accuracy < 0;
        boolean z15 = accuracy > 200;
        if (!z14 && (!z12 || (z13 && z15))) {
            ck.p.i(f24824e, "TAG");
            location2.getTime();
            location2.toString();
            return location2;
        }
        ck.p.i(f24824e, "TAG");
        location.getTime();
        location.toString();
        return location;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056 A[DONT_INVERT, PHI: r1
  0x0056: PHI (r1v5 android.location.Location) = 
  (r1v3 android.location.Location)
  (r1v3 android.location.Location)
  (r1v3 android.location.Location)
  (r1v7 android.location.Location)
 binds: [B:30:0x0056, B:17:0x0047, B:19:0x004d, B:21:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0059 A[LOOP:0: B:15:0x003d->B:25:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x005c A[EDGE_INSN: B:37:0x005c->B:27:0x005c BREAK  A[LOOP:0: B:15:0x003d->B:25:0x0059], SYNTHETIC] */
    public static Location a(int i10, int i11) {
        String bestProvider;
        Location lastKnownLocation;
        Criteria criteria = new Criteria();
        criteria.setAccuracy(i10);
        criteria.setPowerRequirement(i11);
        criteria.setCostAllowed(false);
        LocationManager locationManager = f24821b;
        Location lastKnownLocation2 = null;
        if (locationManager != null && (bestProvider = locationManager.getBestProvider(criteria, true)) != null) {
            try {
                lastKnownLocation = locationManager.getLastKnownLocation(bestProvider);
            } catch (Exception unused) {
                lastKnownLocation = null;
            }
            if (lastKnownLocation != null || i10 == 1) {
                lastKnownLocation2 = lastKnownLocation;
            } else {
                LocationManager locationManager2 = f24821b;
                if (locationManager2 != null) {
                    ck.p.g(locationManager2);
                    List<String> providers = locationManager2.getProviders(true);
                    ck.p.i(providers, "getProviders(...)");
                    int size = providers.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i12 = size - 1;
                            String str = providers.get(size);
                            try {
                                LocationManager locationManager3 = f24821b;
                                if (locationManager3 != null && locationManager3.isProviderEnabled(str)) {
                                    try {
                                        lastKnownLocation2 = locationManager3.getLastKnownLocation(str);
                                    } catch (SecurityException unused2) {
                                    }
                                    if (lastKnownLocation2 != null) {
                                        break;
                                    }
                                    if (i12 < 0) {
                                        break;
                                        break;
                                    }
                                    size = i12;
                                } else {
                                    if (i12 < 0) {
                                        break;
                                    }
                                    size = i12;
                                }
                            } catch (Exception unused3) {
                            }
                        }
                    }
                }
            }
        }
        ck.p.i(f24824e, "TAG");
        return lastKnownLocation2;
    }

    public static HashMap a(Location location, boolean z10, Location location2) {
        HashMap map = new HashMap();
        Context context = Ji.f22951a;
        if (context != null) {
            if (location != null) {
                if (location.getTime() > 0) {
                    map.put("u-ll-ts", Long.valueOf(location.getTime()));
                }
                map.put("u-latlong-accu", a(location));
                map.put("sdk-collected", Integer.valueOf(z10 ? 1 : 0));
            }
            C3136qh c3136qh = Yi.f23856a;
            if (Ji.b() == null || Yi.a().isLocationEnabled()) {
                map.put("loc-allowed", Integer.valueOf(e() ? 1 : 0));
            }
            if (location2 != null) {
                map.put("u-latlong-accu-fine", a(location2));
                map.put("u-ll-ts-fine", Long.valueOf(location2.getTime()));
            }
            if (e() && d()) {
                if (Kf.a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
                    map.put("loc-granularity", "coarse");
                }
            } else {
                map.put("loc-granularity", "none");
                return map;
            }
        }
        return map;
    }

    public static String a(Location location) {
        return location.getLatitude() + StringUtils.COMMA + location.getLongitude() + StringUtils.COMMA + ((int) location.getAccuracy());
    }
}
