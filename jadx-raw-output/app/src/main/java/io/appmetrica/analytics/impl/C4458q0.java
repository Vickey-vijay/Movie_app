package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.C4458q0;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4458q0 implements Ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f57530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f57531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4182f4 f57532c = new C4182f4();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f57533d = f().getHandler();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final T1 f57534e = new T1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4344lb f57535f = new C4344lb();

    @Override // io.appmetrica.analytics.impl.Ca
    public final C4182f4 a() {
        return this.f57532c;
    }

    public static final void e() {
        ImportantLogger.INSTANCE.info(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, "Initializing of AppMetrica, " + StringUtils.capitalize("release") + " type, Version 7.14.0, API Level " + AppMetrica.getLibraryApiLevel() + ", Dated 26.11.2025.", new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001c A[Catch: all -> 0x0052, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:10:0x000f, B:13:0x0016, B:18:0x0031, B:20:0x0035, B:22:0x0039, B:25:0x0040, B:28:0x004d, B:26:0x0046, B:14:0x001c, B:16:0x0028), top: B:34:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0028 A[Catch: all -> 0x0052, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:10:0x000f, B:13:0x0016, B:18:0x0031, B:20:0x0035, B:22:0x0039, B:25:0x0040, B:28:0x004d, B:26:0x0046, B:14:0x001c, B:16:0x0028), top: B:34:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046 A[Catch: all -> 0x0052, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:10:0x000f, B:13:0x0016, B:18:0x0031, B:20:0x0035, B:22:0x0039, B:25:0x0040, B:28:0x004d, B:26:0x0046, B:14:0x001c, B:16:0x0028), top: B:34:0x0001 }] */
    @Override // io.appmetrica.analytics.impl.Ca
    public final synchronized void a(AppMetricaConfig appMetricaConfig, Ua ua2) {
        if (!C4657y0.f57982g) {
            if (appMetricaConfig == null) {
                this.f57535f.c();
                this.f57535f.b();
                if (appMetricaConfig != null) {
                    this.f57535f.a(this.f57530a, appMetricaConfig, ua2);
                }
            } else {
                Boolean bool = appMetricaConfig.crashReporting;
                if (bool == null) {
                    bool = Boolean.TRUE;
                }
                if (bool == null || bool.booleanValue()) {
                    this.f57535f.c();
                    this.f57535f.b();
                    if (appMetricaConfig != null) {
                        this.f57535f.a(this.f57530a, appMetricaConfig, ua2);
                    }
                } else {
                    this.f57535f.a();
                }
            }
            if (appMetricaConfig == null) {
                this.f57534e.b();
            } else {
                Boolean bool2 = appMetricaConfig.appOpenTrackingEnabled;
                if (bool2 == null) {
                    bool2 = Boolean.TRUE;
                }
                if (bool2 == null || bool2.booleanValue()) {
                    this.f57534e.b();
                } else {
                    this.f57534e.c();
                }
            }
            if (appMetricaConfig != null) {
                C4657y0.f57982g = true;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final Handler b() {
        return this.f57533d;
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final T1 c() {
        return this.f57534e;
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final C4344lb d() {
        return this.f57535f;
    }

    public final IHandlerExecutor f() {
        return this.f57531b;
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final ICommonExecutor getDefaultExecutor() {
        return this.f57531b;
    }

    public C4458q0(Context context, S3 s10) {
        this.f57530a = context;
        this.f57531b = s10.a();
        BaseReleaseLogger.init(context);
        f().execute(new Runnable() { // from class: af.l0
            @Override // java.lang.Runnable
            public final void run() {
                C4458q0.e();
            }
        });
        a().a();
        G3.a().onCreate();
    }
}
