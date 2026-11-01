package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4389n6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4650xi f57312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gh f57313b;

    public final Gh a() {
        return this.f57313b;
    }

    public C4389n6(Cf cf2, E8 e10, C4650xi c4650xi, AppMetricaConfig appMetricaConfig) {
        this.f57312a = c4650xi;
        this.f57313b = new Gh(cf2, new CounterConfiguration(appMetricaConfig, CounterConfigurationReporterType.CRASH), e10, appMetricaConfig.userProfileID);
    }
}
