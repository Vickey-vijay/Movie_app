package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4657y0 implements Ua {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C4657y0 f57980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile boolean f57981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile boolean f57982g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f57983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4482r0 f57984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FutureTask f57985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ca f57986d;

    @NonNull
    @AnyThread
    public static C4657y0 a(@NonNull Context context) {
        C4657y0 c4657y0 = f57980e;
        if (c4657y0 == null) {
            synchronized (C4657y0.class) {
                c4657y0 = f57980e;
                if (c4657y0 == null) {
                    c4657y0 = new C4657y0(context);
                    c4657y0.j();
                    C4105c4.l().f56438c.a().execute(new RunnableC4632x0(c4657y0));
                    f57980e = c4657y0;
                }
            }
        }
        return c4657y0;
    }

    @WorkerThread
    public static void b(boolean z10) {
        c().a(z10, true);
    }

    @AnyThread
    public static void r() {
        f57982g = true;
    }

    @AnyThread
    public final void c(@Nullable AppMetricaConfig appMetricaConfig) {
        this.f57986d.a(appMetricaConfig, this);
    }

    @WorkerThread
    public final void d(@NonNull AppMetricaConfig appMetricaConfig) {
        f().b(appMetricaConfig);
        C4105c4.l().f56438c.a().execute(new RunnableC4633x1(this.f57983a));
    }

    @AnyThread
    public static synchronized boolean k() {
        return f57981f;
    }

    @AnyThread
    public static boolean l() {
        return f57982g;
    }

    @AnyThread
    public static synchronized boolean m() {
        C4657y0 c4657y0;
        c4657y0 = f57980e;
        return (c4657y0 == null || !c4657y0.f57985c.isDone() || c4657y0.f().i() == null) ? false : true;
    }

    @VisibleForTesting(otherwise = 5)
    public static synchronized void n() {
        f57980e = null;
        f57981f = false;
        f57982g = false;
    }

    @AnyThread
    public static synchronized void q() {
        f57981f = true;
    }

    @Nullable
    @AnyThread
    public static C4657y0 s() {
        return f57980e;
    }

    @WorkerThread
    public final void b(@NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        f().a(appMetricaLibraryAdapterConfig);
        C4105c4.l().f56438c.a().execute(new RunnableC4633x1(this.f57983a));
    }

    @NonNull
    @WorkerThread
    public final Sa c(@NonNull ReporterConfig reporterConfig) {
        return f().c(reporterConfig);
    }

    public final Da f() {
        try {
            return (Da) this.f57985c.get();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public final Da p() {
        Da da2;
        C4482r0 c4482r0 = this.f57984b;
        Context context = this.f57983a;
        Ca ca2 = this.f57986d;
        synchronized (c4482r0) {
            if (c4482r0.f57587d == null) {
                if (c4482r0.a(context)) {
                    c4482r0.f57587d = new E0();
                } else {
                    c4482r0.f57587d = new C0(context, ca2);
                }
            }
            da2 = c4482r0.f57587d;
        }
        return da2;
    }

    @AnyThread
    public C4657y0(@NonNull Context context) {
        this.f57983a = context;
        C4482r0 c4482r0C = C4105c4.l().c();
        this.f57984b = c4482r0C;
        this.f57986d = c4482r0C.a(context, C4105c4.l().g());
        this.f57985c = new FutureTask(new Callable() { // from class: af.y0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f3599b.p();
            }
        });
    }

    public static Ic c() {
        if (m()) {
            return f57980e.f();
        }
        return C4105c4.l().f56437b;
    }

    @WorkerThread
    public static void clearAppEnvironment() {
        c().clearAppEnvironment();
    }

    @WorkerThread
    public static void putAppEnvironmentValue(String str, String str2) {
        c().putAppEnvironmentValue(str, str2);
    }

    @WorkerThread
    public static void setDataSendingEnabled(boolean z10) {
        c().setDataSendingEnabled(z10);
    }

    @WorkerThread
    public static void setUserProfileID(@Nullable String str) {
        c().setUserProfileID(str);
    }

    @Nullable
    @AnyThread
    public final String e() {
        return f().e();
    }

    @Nullable
    @AnyThread
    public final Map<String, String> g() {
        return f().g();
    }

    @NonNull
    @AnyThread
    public final AdvIdentifiersResult h() {
        return f().h();
    }

    @Nullable
    @WorkerThread
    public final C4319kc i() {
        return f().i();
    }

    public final void j() {
        S3 s10 = C4105c4.l().f56438c;
        Runnable runnable = new Runnable() { // from class: af.z0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3603b.o();
            }
        };
        s10.f55846a.getClass();
        new InterruptionSafeThread(runnable, "IAA-INIT_CORE-" + Ad.f54959a.incrementAndGet()).start();
    }

    public final void o() {
        C4105c4.l().f56453r.a(this.f57983a);
        new W3(this.f57983a).a(this.f57983a);
        C4105c4.l().a(this.f57983a).a();
        this.f57985c.run();
    }

    @NonNull
    @AnyThread
    public final Y9 d() {
        return f().d();
    }

    @NonNull
    @AnyThread
    public final C4182f4 b() {
        return this.f57986d.a();
    }

    @WorkerThread
    public static void a(@Nullable Location location) {
        c().a(location);
    }

    @WorkerThread
    public static void a(boolean z10) {
        c().a(z10);
    }

    @WorkerThread
    public static void a(String str, String str2) {
        c().a(str, str2);
    }

    @WorkerThread
    public static void a(@NonNull String str) {
        c().a(str);
    }

    @WorkerThread
    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        f().a(deferredDeeplinkParametersListener);
    }

    @WorkerThread
    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        f().a(deferredDeeplinkListener);
    }

    @WorkerThread
    public final void a(@NonNull ReporterConfig reporterConfig) {
        f().a(reporterConfig);
    }

    @WorkerThread
    public final void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        f().a(startupParamsCallback, list);
    }

    @VisibleForTesting(otherwise = 5)
    public static synchronized void a(@Nullable C4657y0 c4657y0) {
        f57980e = c4657y0;
    }

    @Override // io.appmetrica.analytics.impl.Ua
    @NonNull
    public final Ta a() {
        return f().a();
    }
}
