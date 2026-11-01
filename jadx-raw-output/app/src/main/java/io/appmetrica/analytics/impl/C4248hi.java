package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4248hi implements Sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4682z0 f56907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bh f56908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f56909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f56910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ReporterConfig f56911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4500ri f56912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Pe f56913g;

    public C4248hi(@NonNull ICommonExecutor iCommonExecutor, @NonNull Context context, @NonNull String str) {
        this(context.getApplicationContext(), str, new C4682z0());
    }

    public static Sa a(C4682z0 c4682z0, Context context, ReporterConfig reporterConfig) {
        c4682z0.getClass();
        return C4657y0.a(context).f().c(reporterConfig);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        this.f56908b.f55037h.a(adRevenue);
        this.f56912f.getClass();
        this.f56909c.execute(new Qh(this, adRevenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable Throwable th2) {
        this.f56908b.f55031b.a(str);
        this.f56912f.getClass();
        if (th2 == null) {
            th2 = new O1();
            th2.fillInStackTrace();
        }
        this.f56909c.execute(new Ih(this, str, th2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str) {
        this.f56908b.f55030a.a(str);
        this.f56912f.getClass();
        this.f56909c.execute(new RunnableC4196fi(this, str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        this.f56908b.getClass();
        this.f56912f.getClass();
        this.f56909c.execute(new RunnableC4170ei(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this.f56913g;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f56908b.getClass();
        this.f56912f.getClass();
        this.f56909c.execute(new Mh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(@NonNull String str, @Nullable String str2) {
        this.f56908b.getClass();
        this.f56912f.getClass();
        this.f56909c.execute(new RunnableC4145di(this, str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        this.f56908b.f55039j.a(map);
        this.f56912f.getClass();
        this.f56909c.execute(new RunnableC4067ai(this, CollectionUtils.getListFromMap(map)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        this.f56908b.f55038i.a(eCommerceEvent);
        this.f56912f.getClass();
        this.f56909c.execute(new Sh(this, eCommerceEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(@NonNull Revenue revenue) {
        this.f56908b.f55036g.a(revenue);
        this.f56912f.getClass();
        this.f56909c.execute(new Ph(this, revenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(@NonNull Throwable th2) {
        this.f56908b.f55034e.a(th2);
        this.f56912f.getClass();
        this.f56909c.execute(new Kh(this, th2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(@NonNull UserProfile userProfile) {
        this.f56908b.f55035f.a(userProfile);
        this.f56912f.getClass();
        this.f56909c.execute(new Oh(this, userProfile));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        this.f56908b.getClass();
        this.f56912f.getClass();
        this.f56909c.execute(new Lh(this));
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.f56908b.getClass();
        this.f56912f.getClass();
        this.f56909c.execute(new RunnableC4119ci(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z10) {
        this.f56908b.getClass();
        this.f56912f.getClass();
        this.f56909c.execute(new Th(this, z10));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(@NonNull String str, @Nullable byte[] bArr) {
        this.f56908b.getClass();
        this.f56912f.getClass();
        this.f56909c.execute(new Xh(this, str, bArr));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(@Nullable String str) {
        this.f56908b.getClass();
        this.f56912f.getClass();
        this.f56909c.execute(new Nh(this, str));
    }

    public C4248hi(Context context, String str, C4682z0 c4682z0) {
        this(context, new Bh(), c4682z0, new C4500ri(), ReporterConfig.newConfigBuilder(str).build());
    }

    public final void d(@NonNull String str) {
        ReporterConfig reporterConfigBuild = ReporterConfig.newConfigBuilder(str).build();
        this.f56908b.getClass();
        this.f56912f.getClass();
        this.f56909c.execute(new Uh(this, reporterConfigBuild));
    }

    @Override // io.appmetrica.analytics.impl.Sa, io.appmetrica.analytics.impl.Va
    public final void a(@NonNull Rn rn2) {
        this.f56908b.f55033d.a(rn2);
        this.f56912f.getClass();
        this.f56909c.execute(new Zh(this, rn2));
    }

    public C4248hi(Context context, Bh bh2, C4682z0 c4682z0, C4500ri c4500ri, ReporterConfig reporterConfig) {
        this(context, bh2, c4682z0, c4500ri, reporterConfig, new Pe(new Rh(c4682z0, context, reporterConfig)));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z10) {
        this.f56908b.f55037h.a(adRevenue);
        this.f56912f.getClass();
        this.f56909c.execute(new Yh(this, adRevenue, z10));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable String str2) {
        this.f56908b.f55030a.a(str);
        this.f56912f.getClass();
        this.f56909c.execute(new RunnableC4222gi(this, str, str2));
    }

    public C4248hi(Context context, Bh bh2, C4682z0 c4682z0, C4500ri c4500ri, ReporterConfig reporterConfig, Pe pe2) {
        this.f56909c = C4105c4.l().g().a();
        this.f56910d = context;
        this.f56908b = bh2;
        this.f56907a = c4682z0;
        this.f56912f = c4500ri;
        this.f56911e = reporterConfig;
        this.f56913g = pe2;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2) {
        reportError(str, str2, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable Throwable th2) {
        this.f56908b.f55032c.a(str);
        this.f56912f.getClass();
        this.f56909c.execute(new Jh(this, str, str2, th2));
    }

    @Override // io.appmetrica.analytics.impl.Sa, io.appmetrica.analytics.impl.InterfaceC4204g0
    public final void a(@NonNull V v10) {
        this.f56908b.getClass();
        this.f56912f.getClass();
        this.f56909c.execute(new RunnableC4093bi(this, v10));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
        this.f56908b.f55030a.a(str);
        this.f56912f.getClass();
        this.f56909c.execute(new Hh(this, str, CollectionUtils.getListFromMap(map)));
    }

    public final void a(@NonNull ReporterConfig reporterConfig) {
        this.f56908b.getClass();
        this.f56912f.getClass();
        this.f56909c.execute(new Vh(this, reporterConfig));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
        this.f56908b.getClass();
        this.f56912f.getClass();
        this.f56909c.execute(new Wh(this, moduleEvent));
    }
}
