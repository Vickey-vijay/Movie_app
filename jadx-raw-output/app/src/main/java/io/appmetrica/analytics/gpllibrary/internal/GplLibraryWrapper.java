package io.appmetrica.analytics.gpllibrary.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes9.dex */
public class GplLibraryWrapper implements IGplLibraryWrapper {
    public static final String FUSED_PROVIDER = "fused";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FusedLocationProviderClient f54814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocationListener f54815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LocationCallback f54816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Looper f54817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f54818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f54819f;

    public static class ClientProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f54821a;

        public final FusedLocationProviderClient a() {
            return LocationServices.getFusedLocationProviderClient(this.f54821a);
        }

        public ClientProvider(Context context) {
            this.f54821a = context;
        }
    }

    public enum Priority {
        PRIORITY_NO_POWER,
        PRIORITY_LOW_POWER,
        PRIORITY_BALANCED_POWER_ACCURACY,
        PRIORITY_HIGH_ACCURACY
    }

    public GplLibraryWrapper(@NonNull Context context, @NonNull LocationListener locationListener, @NonNull Looper looper, @NonNull Executor executor, long j10) throws Throwable {
        this(new ClientProvider(context), locationListener, looper, executor, j10);
    }

    /* JADX INFO: renamed from: io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f54820a;

        static {
            int[] iArr = new int[Priority.values().length];
            f54820a = iArr;
            try {
                iArr[Priority.PRIORITY_LOW_POWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54820a[Priority.PRIORITY_BALANCED_POWER_ACCURACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54820a[Priority.PRIORITY_HIGH_ACCURACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public GplLibraryWrapper(ClientProvider clientProvider, LocationListener locationListener, Looper looper, Executor executor, long j10) {
        this.f54814a = clientProvider.a();
        this.f54815b = locationListener;
        this.f54817d = looper;
        this.f54818e = executor;
        this.f54819f = j10;
        this.f54816c = new GplLocationCallback(locationListener);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @SuppressLint({"MissingPermission"})
    public void startLocationUpdates(@NonNull Priority priority) throws Throwable {
        int i10;
        FusedLocationProviderClient fusedLocationProviderClient = this.f54814a;
        LocationRequest interval = LocationRequest.create().setInterval(this.f54819f);
        int i11 = AnonymousClass1.f54820a[priority.ordinal()];
        if (i11 == 1) {
            i10 = 104;
        } else if (i11 != 2) {
            i10 = i11 != 3 ? 105 : 100;
        } else {
            i10 = 102;
        }
        fusedLocationProviderClient.requestLocationUpdates(interval.setPriority(i10), this.f54816c, this.f54817d);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void stopLocationUpdates() throws Throwable {
        this.f54814a.removeLocationUpdates(this.f54816c);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @SuppressLint({"MissingPermission"})
    public void updateLastKnownLocation() throws Throwable {
        this.f54814a.getLastLocation().addOnSuccessListener(this.f54818e, new GplOnSuccessListener(this.f54815b));
    }
}
