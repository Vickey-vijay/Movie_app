package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;

/* JADX INFO: loaded from: classes7.dex */
public final class Xb implements LocationReceiverProviderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Yb f56141a = new Yb();

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory
    public final LocationReceiverProvider getPassiveLocationReceiverProvider() {
        return this.f56141a;
    }
}
