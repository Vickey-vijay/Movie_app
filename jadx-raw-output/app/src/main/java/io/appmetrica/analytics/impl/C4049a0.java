package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4049a0 extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4075b0 f56312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f56313b;

    public C4049a0(C4075b0 c4075b0, Context context) {
        this.f56312a = c4075b0;
        this.f56313b = context;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C4075b0 c4075b0 = this.f56312a;
        Context context = this.f56313b;
        c4075b0.getClass();
        c4075b0.a(context, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }
}
