package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface Da extends Ic, B6, Ua {
    @NonNull
    /* synthetic */ Ta a();

    /* synthetic */ void a(int i10, @NonNull Bundle bundle);

    @Override // io.appmetrica.analytics.impl.Ic
    /* synthetic */ void a(@Nullable Location location);

    @WorkerThread
    void a(@NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig);

    @WorkerThread
    void a(DeferredDeeplinkListener deferredDeeplinkListener);

    @WorkerThread
    void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener);

    @WorkerThread
    void a(@NonNull ReporterConfig reporterConfig);

    @WorkerThread
    void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list);

    @Override // io.appmetrica.analytics.impl.Ic
    /* synthetic */ void a(@NonNull String str);

    @Override // io.appmetrica.analytics.impl.Ic
    /* synthetic */ void a(String str, String str2);

    @Override // io.appmetrica.analytics.impl.Ic
    /* synthetic */ void a(boolean z10);

    @Override // io.appmetrica.analytics.impl.Ic
    /* synthetic */ void a(boolean z10, boolean z11);

    @WorkerThread
    void b(@NonNull AppMetricaConfig appMetricaConfig);

    @NonNull
    @WorkerThread
    Sa c(@NonNull ReporterConfig reporterConfig);

    @Override // io.appmetrica.analytics.impl.Ic
    /* synthetic */ void clearAppEnvironment();

    @NonNull
    @AnyThread
    Y9 d();

    @Nullable
    @AnyThread
    String e();

    @Nullable
    @AnyThread
    Map<String, String> g();

    @NonNull
    @AnyThread
    AdvIdentifiersResult h();

    @Nullable
    @AnyThread
    C4319kc i();

    @Override // io.appmetrica.analytics.impl.Ic
    /* synthetic */ void putAppEnvironmentValue(String str, String str2);

    @Override // io.appmetrica.analytics.impl.Ic
    /* synthetic */ void setDataSendingEnabled(boolean z10);

    @Override // io.appmetrica.analytics.impl.Ic
    /* synthetic */ void setUserProfileID(@Nullable String str);
}
