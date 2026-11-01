package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.impl.C4075b0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4075b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4682z0 f56388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Xk f56389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S3 f56390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f56391d = TimeUnit.SECONDS.toMillis(10);

    public final synchronized void a(final Context context, final AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        this.f56388a.getClass();
        if (C4682z0.a()) {
            return;
        }
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Session autotracking enabled", new Object[0]);
        this.f56389b.a();
        this.f56388a.getClass();
        C4657y0 c4657y0A = C4657y0.a(context);
        c4657y0A.f57986d.a(null, c4657y0A);
        IHandlerExecutor iHandlerExecutorA = this.f56390c.a();
        ((A9) iHandlerExecutorA).f54955b.post(new Runnable() { // from class: af.z
            @Override // java.lang.Runnable
            public final void run() {
                C4075b0.a(this.f3600b, context, appMetricaLibraryAdapterConfig);
            }
        });
        this.f56388a.getClass();
        C4682z0.b();
    }

    public C4075b0(C4682z0 c4682z0, Xk xk2, S3 s10) {
        this.f56388a = c4682z0;
        this.f56389b = xk2;
        this.f56390c = s10;
    }

    public static final void a(C4075b0 c4075b0, Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        c4075b0.f56388a.getClass();
        C4657y0 c4657y0A = C4657y0.a(context);
        c4657y0A.f().a(appMetricaLibraryAdapterConfig);
        C4105c4.l().f56438c.a().execute(new RunnableC4633x1(c4657y0A.f57983a));
    }
}
