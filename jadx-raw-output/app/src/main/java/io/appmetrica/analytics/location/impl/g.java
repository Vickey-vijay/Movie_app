package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements LastKnownLocationExtractorProviderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LastKnownLocationExtractorProvider f58096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f58097b = new c("location-module-gpl");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f58098c = new v("network", new f(), "location-module-network");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f58099d = new v("gps", new e(), "location-module-gps");

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    public final LastKnownLocationExtractorProvider getGplLastKnownLocationExtractorProvider() {
        return this.f58097b;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    public final LastKnownLocationExtractorProvider getGpsLastKnownLocationExtractorProvider() {
        return this.f58099d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    public final LastKnownLocationExtractorProvider getNetworkLastKnownLocationExtractorProvider() {
        return this.f58098c;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    public final LastKnownLocationExtractorProvider getPassiveLastKnownLocationExtractorProvider() {
        return this.f58096a;
    }

    public g(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f58096a = lastKnownLocationExtractorProvider;
    }
}
