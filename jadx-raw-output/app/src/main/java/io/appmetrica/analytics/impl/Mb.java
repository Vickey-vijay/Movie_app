package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationClient;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;

/* JADX INFO: loaded from: classes5.dex */
public final class Mb implements Lb, InterfaceC4355lm, LocationProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Qb f55568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocationClient f55569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4578ul f55570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4677yk f55571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LastKnownLocationExtractorProviderFactory f55572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocationReceiverProviderFactory f55573g;

    @Override // io.appmetrica.analytics.impl.InterfaceC4355lm
    public final void a(C4226gm c4226gm) {
        C4155e3 c4155e3 = c4226gm.f56854x;
        if (c4155e3 != null) {
            long j10 = c4155e3.f56634a;
            this.f55569c.updateCacheArguments(new CacheArguments(j10, ((long) 2) * j10));
        }
    }

    public final C4578ul b() {
        return this.f55570d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public final Location getSystemLocation() {
        return this.f55569c.getSystemLocation();
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public final Location getUserLocation() {
        return this.f55569c.getUserLocation();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f55569c.registerSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f55569c.unregisterSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.impl.Lb, io.appmetrica.analytics.impl.Ob
    public final void b(Object obj) {
        ((Tb) this.f55568b).a(obj);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f55572f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f55573g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final PermissionExtractor getPermissionExtractor() {
        return this.f55570d;
    }

    @Override // io.appmetrica.analytics.impl.Lb, io.appmetrica.analytics.impl.Ob
    public final void init() {
        this.f55569c.init(this.f55567a, this.f55570d, C4418oa.I.f57406d.b(), this.f55571e.e());
        ModuleLocationSourcesServiceController moduleLocationSourcesServiceControllerF = this.f55571e.f();
        if (moduleLocationSourcesServiceControllerF != null) {
            moduleLocationSourcesServiceControllerF.init();
        } else {
            LocationClient locationClient = this.f55569c;
            locationClient.registerSystemLocationSource(locationClient.getLastKnownExtractorProviderFactory().getGplLastKnownLocationExtractorProvider());
            LocationClient locationClient2 = this.f55569c;
            locationClient2.registerSystemLocationSource(locationClient2.getLastKnownExtractorProviderFactory().getNetworkLastKnownLocationExtractorProvider());
        }
        ((Tb) this.f55568b).a(this.f55571e.g());
        C4418oa.I.f57423u.a(this);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerControllerObserver(LocationControllerObserver locationControllerObserver) {
        ((Tb) this.f55568b).a(locationControllerObserver, true);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LocationReceiverProvider locationReceiverProvider) {
        this.f55569c.registerSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LocationReceiverProvider locationReceiverProvider) {
        this.f55569c.unregisterSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void updateLocationFilter(LocationFilter locationFilter) {
        this.f55569c.updateLocationFilter(locationFilter);
    }

    public Mb(Context context, Qb qb2, LocationClient locationClient) {
        this.f55567a = context;
        this.f55568b = qb2;
        this.f55569c = locationClient;
        Vb vb2 = new Vb();
        this.f55570d = new C4578ul(new C4312k5(vb2, C4418oa.k().p().getAskForPermissionStrategy()));
        this.f55571e = C4418oa.k().p();
        ((Tb) qb2).a(vb2, true);
        ((Tb) qb2).a(locationClient, true);
        this.f55572f = locationClient.getLastKnownExtractorProviderFactory();
        this.f55573g = locationClient.getLocationReceiverProviderFactory();
    }

    @Override // io.appmetrica.analytics.impl.Lb, io.appmetrica.analytics.impl.Ob
    public final void a(Object obj) {
        ((Tb) this.f55568b).b(obj);
    }

    @Override // io.appmetrica.analytics.impl.Lb, io.appmetrica.analytics.impl.Ob
    public final void a(boolean z10) {
        ((Tb) this.f55568b).a(z10);
    }

    @Override // io.appmetrica.analytics.impl.Lb, io.appmetrica.analytics.impl.Ob
    public final void a(Location location) {
        this.f55569c.updateUserLocation(location);
    }
}
