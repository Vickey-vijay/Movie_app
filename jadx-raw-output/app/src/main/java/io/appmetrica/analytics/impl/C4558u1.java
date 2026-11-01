package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.impl.C4558u1;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.internal.js.AppMetricaInitializerJsInterface;
import io.appmetrica.analytics.internal.js.AppMetricaJsInterface;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4558u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4682z0 f57743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Io f57744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4451pi f57745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E7 f57746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4276il f57747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final B2 f57748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C4253hn f57749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Xk f57750h;

    public C4558u1(C4682z0 c4682z0, B2 b10, C4276il c4276il, Io io2, C4253hn c4253hn, C4451pi c4451pi, E7 e10, Xk xk2) {
        this.f57743a = c4682z0;
        this.f57744b = io2;
        this.f57745c = c4451pi;
        this.f57746d = e10;
        this.f57748f = b10;
        this.f57749g = c4253hn;
        this.f57747e = c4276il;
        this.f57750h = xk2;
    }

    public static IHandlerExecutor c() {
        return C4105c4.l().f56438c.a();
    }

    public final void a(@NonNull final Context context, @NonNull final AppMetricaConfig appMetricaConfig) {
        B2 b10 = this.f57748f;
        b10.f54980f.a(context);
        b10.f54976b.a(appMetricaConfig);
        C4253hn c4253hn = this.f57749g;
        Context applicationContext = context.getApplicationContext();
        c4253hn.f56928e.a(applicationContext);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(appMetricaConfig.apiKey);
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, Boolean.TRUE)).booleanValue()) {
            orCreatePublicLogger.info("Session auto tracking enabled", new Object[0]);
            c4253hn.f56927d.a();
        } else {
            orCreatePublicLogger.info("Session auto tracking disabled", new Object[0]);
        }
        c4253hn.f56924a.getClass();
        C4657y0 c4657y0A = C4657y0.a(applicationContext);
        c4657y0A.f57986d.a(appMetricaConfig, c4657y0A);
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new Runnable() { // from class: af.q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3579b.b(context, appMetricaConfig);
            }
        });
        this.f57743a.getClass();
        C4682z0.b();
    }

    @Nullable
    public final String b() {
        this.f57743a.getClass();
        C4657y0 c4657y0 = C4657y0.f57980e;
        if (c4657y0 == null) {
            return null;
        }
        return c4657y0.f().e();
    }

    public final C4319kc d() {
        this.f57743a.getClass();
        return C4657y0.f57980e.f().i();
    }

    public final void e() {
        d().f57104a.a(this.f57750h.a());
    }

    public final void f() {
        this.f57748f.f54975a.a(null);
        this.f57749g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new W0(this));
    }

    public final void c(@Nullable Activity activity) {
        this.f57748f.f54975a.a(null);
        this.f57749g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new RunnableC4231h1(this, activity));
    }

    public final void b(Context context, AppMetricaConfig appMetricaConfig) {
        C4682z0 c4682z0 = this.f57743a;
        Context applicationContext = context.getApplicationContext();
        c4682z0.getClass();
        C4657y0 c4657y0A = C4657y0.a(applicationContext);
        c4657y0A.f().b(this.f57746d.a(appMetricaConfig));
        Context context2 = c4657y0A.f57983a;
        ((A9) C4105c4.l().f56438c.a()).execute(new RunnableC4633x1(context2));
    }

    public final void e(@Nullable String str) {
        this.f57748f.getClass();
        this.f57749g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new U0(this, str));
    }

    public final void d(@NonNull String str) {
        B2 b10 = this.f57748f;
        b10.f54975a.a(null);
        b10.f54984j.a(str);
        this.f57749g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new P0(this, str));
    }

    public C4558u1() {
        this(C4105c4.l().d(), new Io());
    }

    public final void c(@NonNull String str, @Nullable String str2) {
        B2 b10 = this.f57748f;
        b10.f54975a.a(null);
        b10.f54993s.a(str);
        this.f57749g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new RunnableC4434p1(this, str, str2));
    }

    public C4558u1(C4682z0 c4682z0, Io io2) {
        this(c4682z0, new B2(c4682z0), new C4276il(c4682z0), io2, new C4253hn(c4682z0, io2), C4451pi.a(), C4105c4.l().j(), C4105c4.l().o());
    }

    public final void d(@NonNull String str, @Nullable String str2) {
        B2 b10 = this.f57748f;
        b10.f54975a.a(null);
        if (b10.f54989o.a(str).f57616a) {
            this.f57749g.getClass();
            IHandlerExecutor iHandlerExecutorC = c();
            ((A9) iHandlerExecutorC).f54955b.post(new RunnableC4153e1(this, str, str2));
        }
    }

    public final void b(@NonNull String str) {
        B2 b10 = this.f57748f;
        b10.f54975a.a(null);
        b10.f54993s.a(str);
        this.f57749g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new RunnableC4409o1(this, str));
    }

    public final void c(boolean z10) {
        this.f57748f.getClass();
        this.f57749g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new R0(this, z10));
    }

    public final void a(@Nullable Activity activity) {
        this.f57748f.f54975a.a(null);
        this.f57749g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new RunnableC4384n1(this, activity));
    }

    public final void b(@NonNull Activity activity) {
        B2 b10 = this.f57748f;
        b10.f54975a.a(null);
        b10.f54977c.a(activity);
        this.f57749g.getClass();
        Intent intentA = C4253hn.a(activity);
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new M0(this, intentA));
    }

    public final void c(@NonNull String str) {
        if (this.f57747e.a((Void) null).f57616a && this.f57748f.f54988n.a(str).f57616a) {
            this.f57749g.getClass();
            IHandlerExecutor iHandlerExecutorC = c();
            ((A9) iHandlerExecutorC).f54955b.post(new RunnableC4179f1(this, str));
        }
    }

    public final void a(@NonNull Application application) {
        this.f57748f.f54979e.a(application);
        this.f57749g.f56926c.a(application);
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new Runnable() { // from class: af.p0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3575b.e();
            }
        });
    }

    public final void b(boolean z10) {
        this.f57748f.getClass();
        this.f57749g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new T0(this, z10));
    }

    public final void b(@NonNull String str, @Nullable String str2) {
        this.f57748f.f54986l.a(str);
        this.f57749g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new RunnableC4102c1(this, str, str2));
    }

    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        B2 b10 = this.f57748f;
        b10.f54975a.a(null);
        b10.f54993s.a(str);
        this.f57749g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new RunnableC4459q1(this, str, listFromMap));
    }

    public final void b(@NonNull final Object... objArr) {
        this.f57748f.f54975a.a(null);
        this.f57749g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new Runnable() { // from class: af.r0
            @Override // java.lang.Runnable
            public final void run() {
                C4558u1.a(objArr);
            }
        });
    }

    public final void a(@NonNull String str, @Nullable Throwable th2) {
        B2 b10 = this.f57748f;
        b10.f54975a.a(null);
        b10.f54994t.a(str);
        this.f57749g.getClass();
        if (th2 == null) {
            th2 = new O1();
            th2.fillInStackTrace();
        }
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new RunnableC4483r1(this, str, th2));
    }

    public final void b(@NonNull Context context) {
        this.f57748f.f54980f.a(context);
        this.f57749g.f56928e.a(context);
        this.f57743a.getClass();
        C4657y0.a(context);
    }

    public final void a(@NonNull String str, @Nullable String str2, @Nullable Throwable th2) {
        B2 b10 = this.f57748f;
        b10.f54975a.a(null);
        b10.f54995u.a(str);
        this.f57749g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new RunnableC4508s1(this, str, str2, th2));
    }

    public final void a(@NonNull Throwable th2) {
        B2 b10 = this.f57748f;
        b10.f54975a.a(null);
        b10.f54996v.a(th2);
        this.f57749g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new RunnableC4533t1(this, th2));
    }

    public final void a(@NonNull String str) {
        B2 b10 = this.f57748f;
        b10.f54975a.a(null);
        b10.f54983i.a(str);
        this.f57749g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new N0(this, str));
    }

    public final void a(@NonNull Intent intent) {
        B2 b10 = this.f57748f;
        b10.f54975a.a(null);
        b10.f54978d.a(intent);
        this.f57749g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new O0(this, intent));
    }

    public final void a(@Nullable Location location) {
        this.f57748f.getClass();
        this.f57749g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new Q0(this, location));
    }

    public final void a(boolean z10) {
        this.f57748f.getClass();
        this.f57749g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new S0(this, z10));
    }

    public final void a(@NonNull UserProfile userProfile) {
        B2 b10 = this.f57748f;
        b10.f54975a.a(null);
        b10.f54997w.a(userProfile);
        this.f57749g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new V0(this, userProfile));
    }

    public final void a(@NonNull Revenue revenue) {
        B2 b10 = this.f57748f;
        b10.f54975a.a(null);
        b10.f54998x.a(revenue);
        this.f57749g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new X0(this, revenue));
    }

    public final void a(@NonNull AdRevenue adRevenue) {
        B2 b10 = this.f57748f;
        b10.f54975a.a(null);
        b10.f54999y.a(adRevenue);
        this.f57749g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new Y0(this, adRevenue));
    }

    public final void a(@NonNull ECommerceEvent eCommerceEvent) {
        B2 b10 = this.f57748f;
        b10.f54975a.a(null);
        b10.f55000z.a(eCommerceEvent);
        this.f57749g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new Z0(this, eCommerceEvent));
    }

    public final void a(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        B2 b10 = this.f57748f;
        b10.f54975a.a(null);
        b10.f54981g.a(deferredDeeplinkParametersListener);
        this.f57749g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new RunnableC4050a1(this, deferredDeeplinkParametersListener));
    }

    public final void a(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        B2 b10 = this.f57748f;
        b10.f54975a.a(null);
        b10.f54981g.a(deferredDeeplinkListener);
        this.f57749g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new RunnableC4076b1(this, deferredDeeplinkListener));
    }

    @NonNull
    public final Sa a(@NonNull Context context, @NonNull String str) {
        B2 b10 = this.f57748f;
        b10.f54980f.a(context);
        b10.f54985k.a(str);
        C4253hn c4253hn = this.f57749g;
        c4253hn.f56928e.a(context.getApplicationContext());
        return this.f57745c.a(context.getApplicationContext(), str);
    }

    public final void a(@NonNull Context context, @NonNull ReporterConfig reporterConfig) {
        B2 b10 = this.f57748f;
        b10.f54980f.a(context);
        b10.f54982h.a(reporterConfig);
        C4253hn c4253hn = this.f57749g;
        c4253hn.f56928e.a(context.getApplicationContext());
        C4451pi c4451pi = this.f57745c;
        Context applicationContext = context.getApplicationContext();
        if (((C4248hi) c4451pi.f57518a.get(reporterConfig.apiKey)) == null) {
            synchronized (c4451pi.f57518a) {
                if (((C4248hi) c4451pi.f57518a.get(reporterConfig.apiKey)) == null) {
                    String str = reporterConfig.apiKey;
                    IHandlerExecutor iHandlerExecutorA = C4105c4.l().f56438c.a();
                    c4451pi.f57519b.getClass();
                    if (C4657y0.f57980e == null) {
                        ((A9) iHandlerExecutorA).f54955b.post(new RunnableC4401ni(c4451pi, applicationContext));
                    }
                    C4248hi c4248hi = new C4248hi(applicationContext.getApplicationContext(), str, new C4682z0());
                    c4451pi.f57518a.put(str, c4248hi);
                    c4248hi.a(reporterConfig);
                }
            }
        }
    }

    public final void a(@NonNull WebView webView) {
        B2 b10 = this.f57748f;
        b10.f54975a.a(null);
        b10.f54987m.a(webView);
        Io io2 = this.f57749g.f56925b;
        io2.getClass();
        try {
            if (webView.getSettings().getJavaScriptEnabled()) {
                webView.addJavascriptInterface(new AppMetricaJsInterface(this), MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA);
                webView.addJavascriptInterface(new AppMetricaInitializerJsInterface(this), "AppMetricaInitializer");
                Fo fo2 = new Fo();
                synchronized (io2) {
                    PublicLogger publicLogger = io2.f55366b;
                    if (publicLogger == null) {
                        io2.f55365a.add(fo2);
                    } else {
                        fo2.consume(publicLogger);
                    }
                }
            } else {
                io2.a(new Go());
            }
        } catch (Throwable th2) {
            io2.a(new Ho(th2));
        }
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new RunnableC4128d1(this));
    }

    @NonNull
    public final IdentifiersResult a(@NonNull Context context) {
        this.f57748f.f54980f.a(context);
        C4253hn c4253hn = this.f57749g;
        Context applicationContext = context.getApplicationContext();
        c4253hn.f56928e.a(applicationContext);
        c4253hn.f56929f.a(applicationContext);
        return C4105c4.l().a(context.getApplicationContext()).a();
    }

    public final void a(@NonNull String str, @Nullable String str2) {
        this.f57748f.getClass();
        this.f57749g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new RunnableC4205g1(this, str, str2));
    }

    public final void a() {
        this.f57748f.getClass();
        this.f57749g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new RunnableC4257i1(this));
    }

    public final void a(@NonNull Context context, @NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        B2 b10 = this.f57748f;
        b10.f54980f.a(context);
        b10.f54990p.a(startupParamsCallback);
        C4253hn c4253hn = this.f57749g;
        c4253hn.f56928e.a(context.getApplicationContext());
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new RunnableC4282j1(this, context, startupParamsCallback, list));
    }

    public final void a(@NonNull AnrListener anrListener) {
        B2 b10 = this.f57748f;
        b10.f54975a.a(null);
        b10.f54991q.a(anrListener);
        this.f57749g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new RunnableC4308k1(this, anrListener));
    }

    public final void a(@NonNull ExternalAttribution externalAttribution) {
        B2 b10 = this.f57748f;
        b10.f54975a.a(null);
        b10.f54992r.a(externalAttribution);
        this.f57749g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new RunnableC4334l1(this, externalAttribution));
    }

    public static /* synthetic */ void a(Object[] objArr) {
        ModuleAdRevenueProcessor moduleAdRevenueProcessorB = C4105c4.l().m().b();
        if (moduleAdRevenueProcessorB != null) {
            moduleAdRevenueProcessorB.process(objArr);
        }
    }

    public final void a(@NonNull Map<Thread, StackTraceElement[]> map) {
        this.f57748f.A.a(map);
        this.f57749g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f54955b.post(new RunnableC4359m1(this, listFromMap));
    }

    public static Ja a(C4558u1 c4558u1) {
        return c4558u1.d().f57104a;
    }
}
