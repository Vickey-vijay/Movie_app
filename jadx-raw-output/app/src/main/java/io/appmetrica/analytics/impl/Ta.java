package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: loaded from: classes4.dex */
public interface Ta extends Ua {
    @NonNull
    @WorkerThread
    Ja a(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, @NonNull C4333l0 c4333l0);

    @Override // io.appmetrica.analytics.impl.Ua
    @NonNull
    /* synthetic */ Ta a();

    @NonNull
    Va a(@NonNull AppMetricaConfig appMetricaConfig);

    void a(@NonNull ReporterConfig reporterConfig);

    @NonNull
    @WorkerThread
    Ja b(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, @NonNull C4333l0 c4333l0);

    @NonNull
    Sa b(@NonNull ReporterConfig reporterConfig);
}
