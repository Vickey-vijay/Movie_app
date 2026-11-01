package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig;

/* JADX INFO: loaded from: classes7.dex */
public final class X3 implements ModuleServiceConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SdkIdentifiers f56130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f56131b;

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig
    public final Object getFeaturesConfig() {
        return this.f56131b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig
    public final SdkIdentifiers getIdentifiers() {
        return this.f56130a;
    }

    public X3(SdkIdentifiers sdkIdentifiers, Object obj) {
        this.f56130a = sdkIdentifiers;
        this.f56131b = obj;
    }
}
