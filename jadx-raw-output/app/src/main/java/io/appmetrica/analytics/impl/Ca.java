package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* JADX INFO: loaded from: classes2.dex */
public interface Ca {
    C4182f4 a();

    void a(AppMetricaConfig appMetricaConfig, Ua ua2);

    Handler b();

    T1 c();

    C4344lb d();

    ICommonExecutor getDefaultExecutor();
}
