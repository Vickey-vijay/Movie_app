package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4069ak implements ServiceComponentModuleConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4437p4 f56380a;

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig
    public final boolean isRevenueAutoTrackingEnabled() {
        return ((Boolean) WrapUtils.getOrDefault(this.f56380a.f57487m, Boolean.TRUE)).booleanValue();
    }

    public C4069ak(C4437p4 c4437p4) {
        this.f56380a = c4437p4;
    }
}
