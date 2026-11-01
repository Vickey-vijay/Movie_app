package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class Nb implements Lb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4621we f55621a = new C4621we();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4593vb f55622b = new C4593vb();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Xb f55623c = new Xb();

    @Override // io.appmetrica.analytics.impl.Lb, io.appmetrica.analytics.impl.Ob
    public final void a(Location location) {
    }

    @Override // io.appmetrica.analytics.impl.Lb, io.appmetrica.analytics.impl.Ob
    public final void a(Object obj) {
    }

    @Override // io.appmetrica.analytics.impl.Lb, io.appmetrica.analytics.impl.Ob
    public final void a(boolean z10) {
    }

    @Override // io.appmetrica.analytics.impl.Lb, io.appmetrica.analytics.impl.Ob
    public final void b(Object obj) {
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public final Location getSystemLocation() {
        return null;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public final Location getUserLocation() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Lb, io.appmetrica.analytics.impl.Ob
    public final void init() {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerControllerObserver(LocationControllerObserver locationControllerObserver) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LocationReceiverProvider locationReceiverProvider) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LocationReceiverProvider locationReceiverProvider) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void updateLocationFilter(LocationFilter locationFilter) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f55622b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f55623c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final PermissionExtractor getPermissionExtractor() {
        return this.f55621a;
    }
}
