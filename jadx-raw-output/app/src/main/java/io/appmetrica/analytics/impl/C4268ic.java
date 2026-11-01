package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientConfig;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ic, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4268ic extends J2 implements Ja {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Long f56965s = Long.valueOf(TimeUnit.SECONDS.toMillis(1));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Fn f56966p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C4544tc f56967q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C4293jc f56968r;

    public final void a(AppMetricaConfig appMetricaConfig, C4333l0 c4333l0) {
        if (c4333l0.f57159b) {
            clearAppEnvironment();
        }
        List<String> list = c4333l0.f57158a;
        if (!CollectionUtils.isNullOrEmpty(list)) {
            this.f55378b.f55335b.addAutoCollectedDataSubscribers(list);
        }
        a(appMetricaConfig.appEnvironment);
        b(appMetricaConfig.errorEnvironment);
        boolean zBooleanValue = ((Boolean) WrapUtils.getOrDefault(appMetricaConfig.nativeCrashReporting, Boolean.TRUE)).booleanValue();
        this.f55379c.info("native crash reporting enabled: %b", Boolean.valueOf(zBooleanValue));
        if (zBooleanValue) {
            Cd cd2 = this.f56967q.f57718c;
            Context context = this.f55377a;
            cd2.f55098d = new H0(this.f55378b.f55335b.getApiKey(), cd2.f55095a.f55103a.getAsString("PROCESS_CFG_PACKAGE_NAME"), CounterConfigurationReporterType.MAIN, cd2.f55095a.f55103a.getAsInteger("PROCESS_CFG_PROCESS_ID").intValue(), cd2.f55095a.f55103a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), this.f55378b.d());
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context);
            H0 h10 = null;
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                NativeCrashClientModule nativeCrashClientModule = cd2.f55096b;
                I0 i10 = cd2.f55097c;
                H0 h11 = cd2.f55098d;
                if (h11 == null) {
                    ck.p.B("nativeCrashMetadata");
                } else {
                    h10 = h11;
                }
                i10.getClass();
                nativeCrashClientModule.initHandling(context, new NativeCrashClientConfig(absolutePath, I0.a(h10)));
            }
        }
        C4293jc c4293jc = this.f56968r;
        synchronized (c4293jc) {
            Integer num = appMetricaConfig.anrMonitoringTimeout;
            c4293jc.f57014a = num != null ? num.intValue() : 5;
            Boolean bool = appMetricaConfig.anrMonitoring;
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            if (bool.booleanValue()) {
                c4293jc.f57015b.a(c4293jc.f57014a);
            } else {
                c4293jc.f57015b.b();
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void c() {
        C4293jc c4293jc = this.f56968r;
        synchronized (c4293jc) {
            c4293jc.f57015b.a(c4293jc.f57014a);
        }
    }

    @Override // io.appmetrica.analytics.impl.J2
    public final String j() {
        return "[MainReporter]";
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void b(@Nullable Activity activity) {
        if (this.f56967q.f57724i.a(activity, EnumC4432p.PAUSED)) {
            this.f55379c.info("Pause session", new Object[0]);
            d(activity != null ? activity.getClass().getSimpleName() : null);
            C4180f2 c4180f2 = this.f56967q.f57722g;
            synchronized (c4180f2) {
                for (C4154e2 c4154e2 : c4180f2.f56708a) {
                    if (!c4154e2.f56632d) {
                        c4154e2.f56632d = true;
                        c4154e2.f56630b.executeDelayed(c4154e2.f56633e, c4154e2.f56631c);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final List<String> f() {
        return this.f55378b.f55334a.b();
    }

    public final void l() {
        C4650xi c4650xi = this.f55384h;
        c4650xi.f57940c.a(this.f55378b.f55334a);
        C4180f2 c4180f2 = this.f56967q.f57722g;
        C4242hc c4242hc = new C4242hc(this);
        long jLongValue = f56965s.longValue();
        synchronized (c4180f2) {
            c4180f2.a(c4242hc, jLongValue);
        }
    }

    public C4268ic(C4544tc c4544tc) {
        super(c4544tc.b(), c4544tc.i(), c4544tc.h(), c4544tc.d(), c4544tc.f(), c4544tc.j(), c4544tc.g(), c4544tc.c(), c4544tc.a(), c4544tc.e());
        this.f56966p = new Fn(new C4063ae("Referral url"));
        this.f56967q = c4544tc;
        this.f56968r = new C4293jc(this);
        l();
    }

    @Override // io.appmetrica.analytics.impl.J2
    public final void k() {
        super.k();
        C4105c4.l().m().c();
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void c(@NonNull String str) {
        this.f56966p.a(str);
        C4650xi c4650xi = this.f55384h;
        PublicLogger publicLogger = this.f55379c;
        Set set = AbstractC4641x9.f57918a;
        HashMap map = new HashMap();
        map.put("type", "referral");
        map.put("link", str);
        map.put("auto", Boolean.FALSE);
        String strB = AbstractC4241hb.b(map);
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        N3 n10 = new N3(strB, "", 8208, 0, publicLogger);
        Gh gh2 = this.f55378b;
        c4650xi.getClass();
        c4650xi.a(C4650xi.a(n10, gh2), gh2, 1, (Map) null);
        this.f55379c.info("Referral URL received: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(@NonNull String str, boolean z10) {
        this.f55379c.info("App opened via deeplink: " + WrapUtils.wrapToTag(str), new Object[0]);
        C4650xi c4650xi = this.f55384h;
        PublicLogger publicLogger = this.f55379c;
        Set set = AbstractC4641x9.f57918a;
        HashMap map = new HashMap();
        map.put("type", "open");
        map.put("link", str);
        map.put("auto", Boolean.valueOf(z10));
        String strB = AbstractC4241hb.b(map);
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        N3 n10 = new N3(strB, "", 8208, 0, publicLogger);
        Gh gh2 = this.f55378b;
        c4650xi.getClass();
        c4650xi.a(C4650xi.a(n10, gh2), gh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(@NonNull EnumC4382n enumC4382n) {
        if (enumC4382n == EnumC4382n.f57296b) {
            this.f55379c.info("Enable activity auto tracking", new Object[0]);
            return;
        }
        this.f55379c.warning("Could not enable activity auto tracking. " + enumC4382n.f57300a, new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(@Nullable Activity activity) {
        if (this.f56967q.f57724i.a(activity, EnumC4432p.RESUMED)) {
            this.f55379c.info("Resume session", new Object[0]);
            e(activity != null ? activity.getClass().getSimpleName() : null);
            C4180f2 c4180f2 = this.f56967q.f57722g;
            synchronized (c4180f2) {
                for (C4154e2 c4154e2 : c4180f2.f56708a) {
                    if (c4154e2.f56632d) {
                        c4154e2.f56632d = false;
                        c4154e2.f56630b.remove(c4154e2.f56633e);
                        C4268ic c4268ic = c4154e2.f56629a.f56900a;
                        c4268ic.f55384h.f57940c.b(c4268ic.f55378b.f55334a);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Ic
    public final void a(@Nullable Location location) {
        this.f55378b.f55335b.setManualLocation(location);
        this.f55379c.info("Set location: %s", location);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Ic
    public final void a(boolean z10) {
        this.f55378b.f55335b.setLocationTracking(z10);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Ic
    public final void a(boolean z10, boolean z11) {
        this.f55379c.info("Set advIdentifiersTracking to %s", Boolean.valueOf(z10));
        this.f55378b.f55335b.setAdvIdentifiersTracking(z10, z11);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(@NonNull Io io2) {
        PublicLogger publicLogger = this.f55379c;
        synchronized (io2) {
            io2.f55366b = publicLogger;
        }
        Iterator it = io2.f55365a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(publicLogger);
        }
        io2.f55365a.clear();
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(@NonNull AnrListener anrListener) {
        this.f56968r.a(anrListener);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(@NonNull ExternalAttribution externalAttribution) {
        this.f55379c.info("External attribution received: %s", externalAttribution);
        C4650xi c4650xi = this.f55384h;
        byte[] bytes = externalAttribution.toBytes();
        PublicLogger publicLogger = this.f55379c;
        Set set = AbstractC4641x9.f57918a;
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        N3 n10 = new N3(bytes, "", 42, publicLogger);
        Gh gh2 = this.f55378b;
        c4650xi.getClass();
        c4650xi.a(C4650xi.a(n10, gh2), gh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.J2, io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Ic
    public final void a(String str, String str2) {
        super.a(str, str2);
        Cd cd2 = this.f56967q.f57718c;
        String strD = this.f55378b.d();
        H0 h10 = cd2.f55098d;
        if (h10 != null) {
            H0 h11 = new H0(h10.f55284a, h10.f55285b, h10.f55286c, h10.f55287d, h10.f55288e, strD);
            cd2.f55098d = h11;
            NativeCrashClientModule nativeCrashClientModule = cd2.f55096b;
            cd2.f55097c.getClass();
            nativeCrashClientModule.updateAppMetricaMetadata(I0.a(h11));
        }
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Ic
    public final void a(@NonNull String str) {
        this.f55379c.info("Add auto collected data subscriber: %s", str);
        this.f55378b.f55335b.addAutoCollectedDataSubscriber(str);
    }
}
