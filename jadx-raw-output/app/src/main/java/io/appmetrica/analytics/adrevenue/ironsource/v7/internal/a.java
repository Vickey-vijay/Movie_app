package io.appmetrica.analytics.adrevenue.ironsource.v7.internal;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements AdRevenueCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IronSourceClientModuleEntryPoint f54417a;

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector
    public final String getSourceIdentifier() {
        return "ironsource";
    }

    public a(IronSourceClientModuleEntryPoint ironSourceClientModuleEntryPoint) {
        this.f54417a = ironSourceClientModuleEntryPoint;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector
    public final boolean getEnabled() {
        return this.f54417a.f54416b.get();
    }
}
