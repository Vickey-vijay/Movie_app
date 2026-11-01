package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.li, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4351li implements Ta {
    @Override // io.appmetrica.analytics.impl.Ta
    @NonNull
    public final Ja a(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, @NonNull C4333l0 c4333l0) {
        return new C4669yc();
    }

    @Override // io.appmetrica.analytics.impl.Ta, io.appmetrica.analytics.impl.Ua
    @NonNull
    public final Ta a() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final void a(@NonNull ReporterConfig reporterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.Ta
    @NonNull
    public final Ja b(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, @NonNull C4333l0 c4333l0) {
        return new C4669yc();
    }

    @Override // io.appmetrica.analytics.impl.Ta
    @NonNull
    public final Va a(@NonNull AppMetricaConfig appMetricaConfig) {
        return new C4273ii();
    }

    @Override // io.appmetrica.analytics.impl.Ta
    @NonNull
    public final Sa b(@NonNull ReporterConfig reporterConfig) {
        return new C4273ii();
    }
}
