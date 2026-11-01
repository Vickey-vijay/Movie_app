package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.AnyThread;
import androidx.annotation.WorkerThread;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class C0 implements Da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ca f55050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final We f55051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Pl f55052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4323kg f55053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Cf f55054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C4325ki f55055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C4650xi f55056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final E7 f55057i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Xk f55058j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile C4319kc f55059k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C4358m0 f55060l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f55061m;

    @Override // io.appmetrica.analytics.impl.Da
    @WorkerThread
    public final void a(AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        Boolean bool;
        C4358m0 c4358m0 = this.f55060l;
        C4607w0 c4607w0 = c4358m0.f57236b;
        c4607w0.getClass();
        AppMetricaConfig.Builder builderNewConfigBuilder = AppMetricaConfig.newConfigBuilder("629a824d-c717-4ba5-bc0f-3f3968554d01");
        if (c4607w0.f57855a.b() && ck.p.e(c4607w0.f57856b.f56580a, Boolean.TRUE)) {
            builderNewConfigBuilder.handleFirstActivationAsUpdate(true);
        }
        Boolean bool2 = appMetricaLibraryAdapterConfig.advIdentifiersTracking;
        if (bool2 == null) {
            bool2 = Boolean.FALSE;
        }
        builderNewConfigBuilder.withAdvIdentifiersTracking(bool2.booleanValue());
        AppMetricaConfig appMetricaConfigBuild = builderNewConfigBuilder.build();
        AppMetricaConfig.Builder builderF = c4358m0.f57235a.f();
        if (builderF != null) {
            if (builderF.build().advIdentifiersTracking == null && (bool = appMetricaConfigBuild.advIdentifiersTracking) != null) {
                builderF.withAdvIdentifiersTracking(bool.booleanValue());
            }
            appMetricaConfigBuild = builderF.build();
        }
        PublicLogger mainPublicOrAnonymousLogger = LoggerStorage.getMainPublicOrAnonymousLogger();
        if (a(mainPublicOrAnonymousLogger, appMetricaConfigBuild, new B0(this, appMetricaConfigBuild, mainPublicOrAnonymousLogger), false)) {
            ImportantLogger.INSTANCE.info(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, "Activate AppMetrica in anonymous mode", new Object[0]);
        }
    }

    @Override // io.appmetrica.analytics.impl.Da
    @WorkerThread
    public final void b(AppMetricaConfig appMetricaConfig) {
        boolean z10;
        PublicLogger orCreateMainPublicLogger = LoggerStorage.getOrCreateMainPublicLogger(appMetricaConfig.apiKey);
        boolean zA = a(orCreateMainPublicLogger, appMetricaConfig, new A0(this, appMetricaConfig, orCreateMainPublicLogger), true);
        if (zA || this.f55061m) {
            z10 = false;
        } else {
            a(orCreateMainPublicLogger, appMetricaConfig, true);
            z10 = true;
        }
        if (zA || z10) {
            this.f55051c.a(appMetricaConfig);
        } else {
            orCreateMainPublicLogger.warning("AppMetrica SDK already has been activated", new Object[0]);
        }
        if (zA) {
            ImportantLogger.INSTANCE.info(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, "Activate AppMetrica with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        if (z10) {
            ImportantLogger.INSTANCE.info(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, "Upgrade AppMetrica anonymous mode to normal with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        this.f55061m = true;
    }

    @Override // io.appmetrica.analytics.impl.Da
    @WorkerThread
    public final Sa c(ReporterConfig reporterConfig) {
        return this.f55055g.b(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Da
    @AnyThread
    public final Y9 d() {
        return this.f55052d.e();
    }

    @Override // io.appmetrica.analytics.impl.Da
    @AnyThread
    public final String e() {
        return this.f55052d.d();
    }

    @Override // io.appmetrica.analytics.impl.Da
    @AnyThread
    public final Map<String, String> g() {
        return this.f55052d.b();
    }

    @Override // io.appmetrica.analytics.impl.Da
    @AnyThread
    public final AdvIdentifiersResult h() {
        return this.f55052d.a();
    }

    @Override // io.appmetrica.analytics.impl.Da
    @AnyThread
    public final C4319kc i() {
        return this.f55059k;
    }

    public final Ja j() {
        C4319kc c4319kc = this.f55059k;
        ck.p.g(c4319kc);
        return c4319kc.f57104a;
    }

    @AnyThread
    public final C4325ki k() {
        return this.f55055g;
    }

    @WorkerThread
    public C0(Context context, Ca ca2) {
        this.f55049a = context;
        this.f55050b = ca2;
        We weB = C4105c4.l().b(context);
        this.f55051c = weB;
        ArrayList arrayListA = C4545td.a();
        C4105c4 c4105c4L = C4105c4.l();
        c4105c4L.m().a(new L3(context));
        D0.a(context).a(arrayListA);
        Cf cfA = D0.a(context, D0.a(ca2.b(), this));
        this.f55054f = cfA;
        E7 e7J = c4105c4L.j();
        this.f55057i = e7J;
        C4650xi c4650xiA = D0.a(cfA, context, ca2.getDefaultExecutor());
        this.f55056h = c4650xiA;
        e7J.a(c4650xiA);
        Pl plA = D0.a(context, c4650xiA, weB, ca2.b());
        this.f55052d = plA;
        c4650xiA.a(plA);
        this.f55053e = D0.a(c4650xiA, weB, ca2.b());
        this.f55055g = D0.a(context, cfA, c4650xiA, ca2.b(), plA);
        this.f55058j = c4105c4L.o();
        this.f55060l = new C4358m0(weB);
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    @WorkerThread
    public final void clearAppEnvironment() {
        j().clearAppEnvironment();
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    @WorkerThread
    public final void putAppEnvironmentValue(String str, String str2) {
        j().putAppEnvironmentValue(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    @WorkerThread
    public final void setDataSendingEnabled(boolean z10) {
        j().setDataSendingEnabled(z10);
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    @WorkerThread
    public final void setUserProfileID(String str) {
        j().setUserProfileID(str);
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.B6
    @AnyThread
    public final void a(int i10, Bundle bundle) {
        this.f55052d.b(bundle, null);
    }

    @Override // io.appmetrica.analytics.impl.Da
    @WorkerThread
    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f55053e.a(deferredDeeplinkParametersListener);
    }

    @Override // io.appmetrica.analytics.impl.Da
    @WorkerThread
    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f55053e.a(deferredDeeplinkListener);
    }

    @Override // io.appmetrica.analytics.impl.Da
    @WorkerThread
    public final void a(ReporterConfig reporterConfig) {
        this.f55055g.a(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Da
    @WorkerThread
    public final void a(StartupParamsCallback startupParamsCallback, List<String> list) {
        this.f55052d.a(startupParamsCallback, list, AbstractC4241hb.c(this.f55054f.f55103a.getAsString("PROCESS_CFG_CLIDS")));
    }

    public final boolean a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, InterfaceC4644xc interfaceC4644xc, boolean z10) {
        if (this.f55059k == null) {
            a(publicLogger, appMetricaConfig, z10);
            this.f55053e.a();
            C4268ic c4268icA = interfaceC4644xc.a();
            C4689z7 c4689z7 = new C4689z7(c4268icA);
            C4319kc c4319kc = new C4319kc(c4268icA, c4689z7);
            this.f55050b.c().a(c4689z7);
            this.f55059k = c4319kc;
            C4388n5 c4388n5 = this.f55058j.f56168b;
            synchronized (c4388n5) {
                c4388n5.f57310a = c4268icA;
                Iterator it = c4388n5.f57311b.iterator();
                while (it.hasNext()) {
                    ((InterfaceC4089be) it.next()).consume(c4268icA);
                }
                c4388n5.f57311b.clear();
            }
            return true;
        }
        interfaceC4644xc.a();
        return false;
    }

    public final void a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, boolean z10) {
        Boolean bool = appMetricaConfig.logs;
        Boolean bool2 = Boolean.TRUE;
        if (bool2.equals(bool)) {
            publicLogger.setEnabled(true);
            PublicLogger.INSTANCE.getAnonymousInstance().setEnabled(true);
        } else {
            publicLogger.setEnabled(false);
            PublicLogger.INSTANCE.getAnonymousInstance().setEnabled(false);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.crashReporting, bool2)).booleanValue()) {
            this.f55050b.d().a(this.f55049a, appMetricaConfig, this);
            this.f55050b.d().b();
            publicLogger.info("Register application crash handler", new Object[0]);
        } else {
            this.f55050b.d().a();
            publicLogger.info("Disable all crash handlers", new Object[0]);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, bool2)).booleanValue()) {
            this.f55058j.a();
        } else {
            Xk xk2 = this.f55058j;
            synchronized (xk2) {
                if (xk2.f56173g) {
                    xk2.f56167a.unregisterListener(xk2.f56169c, ActivityEvent.RESUMED);
                    xk2.f56167a.unregisterListener(xk2.f56170d, ActivityEvent.PAUSED);
                    xk2.f56173g = false;
                }
            }
        }
        this.f55054f.d(appMetricaConfig);
        Pl pl2 = this.f55052d;
        pl2.f55753e = publicLogger;
        pl2.b(appMetricaConfig.customHosts);
        Pl pl3 = this.f55052d;
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        pl3.a(obj instanceof Map ? (Map) obj : null);
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        this.f55052d.a(str);
        if (str != null) {
            this.f55052d.b("api");
        }
        this.f55056h.a(appMetricaConfig.locationTracking, appMetricaConfig.dataSendingEnabled, appMetricaConfig.advIdentifiersTracking, Boolean.valueOf(z10));
        this.f55052d.i();
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    @WorkerThread
    public final void a(Location location) {
        j().a(location);
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    @WorkerThread
    public final void a(boolean z10) {
        j().a(z10);
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    @WorkerThread
    public final void a(boolean z10, boolean z11) {
        j().a(z10, z11);
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    @WorkerThread
    public final void a(String str, String str2) {
        j().a(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    @WorkerThread
    public final void a(String str) {
        j().a(str);
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ua
    public final Ta a() {
        return this.f55055g;
    }
}
