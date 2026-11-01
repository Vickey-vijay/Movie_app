package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4544tc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f57716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4650xi f57717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Cd f57718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N9 f57719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final E8 f57720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Gh f57721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C4180f2 f57722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C4513s6 f57723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C4457q f57724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Ke f57725j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Sn f57726k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Fg f57727l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C4613w6 f57728m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C4127d0 f57729n;

    public final C4127d0 a() {
        return this.f57729n;
    }

    public final void a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        publicLogger.info("Update config with value " + appMetricaConfig.toJson(), new Object[0]);
        this.f57721f.f55335b.applyFromConfig(appMetricaConfig);
        Gh gh2 = this.f57721f;
        String str = appMetricaConfig.userProfileID;
        synchronized (gh2) {
            gh2.f55271f = str;
        }
        Gh gh3 = this.f57721f;
        PreloadInfo preloadInfo = appMetricaConfig.preloadInfo;
        Boolean bool = (Boolean) appMetricaConfig.additionalConfig.get("YMM_preloadInfoAutoTracking");
        gh3.f55269d = new C4597vf(preloadInfo, publicLogger, bool != null ? bool.booleanValue() : false);
        StringBuilder sb2 = new StringBuilder("Actual session timeout is ");
        Integer num = appMetricaConfig.sessionTimeout;
        if (num == null) {
            num = 10;
        }
        sb2.append(num.intValue());
        publicLogger.info(sb2.toString(), new Object[0]);
    }

    public final Context b() {
        return this.f57716a;
    }

    public final C4613w6 c() {
        return this.f57728m;
    }

    public final N9 d() {
        return this.f57719d;
    }

    public final Ke e() {
        return this.f57725j;
    }

    public final C4513s6 f() {
        return this.f57723h;
    }

    public final Fg g() {
        return this.f57727l;
    }

    public final Gh h() {
        return this.f57721f;
    }

    public final C4650xi i() {
        return this.f57717b;
    }

    public final Sn j() {
        return this.f57726k;
    }

    public C4544tc(Context context, Cf cf2, C4650xi c4650xi, Pl pl2) {
        this.f57716a = context;
        this.f57717b = c4650xi;
        this.f57718c = new Cd(cf2);
        N9 n10 = new N9(context);
        this.f57719d = n10;
        E8 e10 = new E8(new C4528sl(LoggerStorage.getMainPublicOrAnonymousLogger(), "Crash Environment"));
        this.f57720e = e10;
        this.f57721f = new Gh(cf2, new CounterConfiguration(CounterConfigurationReporterType.MAIN), e10);
        this.f57722g = new C4180f2();
        this.f57723h = C4105c4.l().n();
        this.f57724i = new C4457q();
        this.f57725j = new Ke(n10);
        this.f57726k = new Sn();
        this.f57727l = new Fg();
        this.f57728m = new C4613w6();
        this.f57729n = new C4127d0();
    }
}
