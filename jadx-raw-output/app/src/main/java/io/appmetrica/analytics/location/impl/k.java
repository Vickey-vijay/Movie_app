package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.Location;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.cache.LocationDataCacheUpdateScheduler;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements ILastKnownUpdater, LocationControllerObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f58105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PermissionExtractor f58106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f58107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IHandlerExecutor f58108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f58109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LocationDataCacheUpdateScheduler f58110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f58111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f58112h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f58113i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Location f58114j;

    @Nullable
    public final synchronized Location a() {
        return (Location) this.f58107c.f58125b.getData();
    }

    @AnyThread
    public final synchronized void b(@NonNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f58112h.remove(lastKnownLocationExtractorProvider.getIdentifier());
    }

    @Nullable
    public final synchronized Location c() {
        Location locationA;
        locationA = this.f58114j;
        if (locationA == null) {
            locationA = a();
        }
        return locationA;
    }

    public final synchronized void d() {
        this.f58110f.startUpdates();
        Iterator it = this.f58113i.values().iterator();
        while (it.hasNext()) {
            ((LocationReceiver) it.next()).startLocationUpdates();
        }
        updateLastKnown();
    }

    public final synchronized void e() {
        this.f58110f.stopUpdates();
        Iterator it = this.f58113i.values().iterator();
        while (it.hasNext()) {
            ((LocationReceiver) it.next()).stopLocationUpdates();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void startLocationTracking() {
        if (!this.f58111g) {
            this.f58111g = true;
            d();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void stopLocationTracking() {
        if (this.f58111g) {
            this.f58111g = false;
            e();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater
    public final synchronized void updateLastKnown() {
        Iterator it = this.f58112h.values().iterator();
        while (it.hasNext()) {
            ((LastKnownLocationExtractor) it.next()).updateLastKnownLocation();
        }
    }

    @AnyThread
    public final synchronized void b(@NonNull LocationReceiverProvider locationReceiverProvider) {
        LocationReceiver locationReceiver = (LocationReceiver) this.f58113i.remove(locationReceiverProvider.getIdentifier());
        if (locationReceiver != null && this.f58111g) {
            locationReceiver.stopLocationUpdates();
        }
    }

    public k(@NonNull Context context, @NonNull PermissionExtractor permissionExtractor, @NonNull IHandlerExecutor iHandlerExecutor, @NonNull p pVar) {
        this.f58105a = context;
        this.f58107c = pVar;
        this.f58106b = permissionExtractor;
        this.f58108d = iHandlerExecutor;
        this.f58109e = new n(pVar);
        LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler = new LocationDataCacheUpdateScheduler(iHandlerExecutor, this, pVar.a(), "loc");
        this.f58110f = locationDataCacheUpdateScheduler;
        pVar.a().setUpdateScheduler(locationDataCacheUpdateScheduler);
    }

    @AnyThread
    public final void a(@NonNull i iVar) {
        this.f58108d.execute(new j(this, iVar));
    }

    @AnyThread
    public final synchronized void a(@NonNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        LastKnownLocationExtractor extractor = lastKnownLocationExtractorProvider.getExtractor(this.f58105a, this.f58106b, this.f58108d, this.f58109e);
        this.f58112h.put(lastKnownLocationExtractorProvider.getIdentifier(), extractor);
        if (this.f58111g) {
            extractor.updateLastKnownLocation();
        }
    }

    @Nullable
    public final synchronized Location b() {
        return this.f58114j;
    }

    @AnyThread
    public final synchronized void a(@NonNull LocationReceiverProvider locationReceiverProvider) {
        LocationReceiver locationReceiver = locationReceiverProvider.getLocationReceiver(this.f58105a, this.f58106b, this.f58108d, this.f58109e);
        LocationReceiver locationReceiver2 = (LocationReceiver) this.f58113i.put(locationReceiverProvider.getIdentifier(), locationReceiver);
        if (this.f58111g) {
            if (locationReceiver2 != null) {
                locationReceiver2.stopLocationUpdates();
            }
            locationReceiver.startLocationUpdates();
        }
    }

    public final synchronized void a(@Nullable Location location) {
        if (location != null) {
            this.f58114j = location;
        }
    }
}
