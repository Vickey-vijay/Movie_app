package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.WorkerThread;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ki, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4325ki implements Ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f57119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cf f57120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4650xi f57121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f57122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Pl f57123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4544tc f57124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f57125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Fn f57126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f57127i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C4268ic f57128j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C4364m6 f57129k;

    @Override // io.appmetrica.analytics.impl.Ta, io.appmetrica.analytics.impl.Ua
    public final Ta a() {
        return this;
    }

    public final C4325ki b() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ta
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized C4268ic b(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C4333l0 c4333l0) {
        C4268ic c4268ic;
        c4268ic = this.f57128j;
        if (c4268ic != null) {
            C4544tc c4544tc = this.f57124f;
            c4544tc.getClass();
            publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new Object[0]);
            c4544tc.f57721f.f55335b.applyFromAnonymousConfig(appMetricaConfig);
        } else {
            this.f57126h.a(appMetricaConfig.apiKey);
            C4544tc c4544tc2 = this.f57124f;
            c4544tc2.getClass();
            publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new Object[0]);
            c4544tc2.f57721f.f55335b.applyFromAnonymousConfig(appMetricaConfig);
            c4268ic = new C4268ic(this.f57124f);
            c4268ic.f55385i = new C4444pb(this.f57122d, c4268ic);
            Pl pl2 = this.f57123e;
            Gh gh2 = c4268ic.f55378b;
            if (pl2 != null) {
                gh2.f55335b.setUuid(pl2.g());
            } else {
                gh2.getClass();
            }
            c4268ic.a(appMetricaConfig, c4333l0);
            c4268ic.k();
            this.f57121c.f57943f.f56297c = new C4299ji(c4268ic);
            this.f57125g.put(appMetricaConfig.apiKey, c4268ic);
            this.f57128j = c4268ic;
        }
        return c4268ic;
    }

    @Override // io.appmetrica.analytics.impl.Ta
    @WorkerThread
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized C4268ic a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C4333l0 c4333l0) {
        C4268ic c4268ic;
        c4268ic = this.f57128j;
        if (c4268ic != null) {
            this.f57124f.a(appMetricaConfig, publicLogger);
            c4268ic.a(appMetricaConfig, c4333l0);
            C4105c4.l().getClass();
            this.f57125g.put(appMetricaConfig.apiKey, c4268ic);
        } else {
            this.f57126h.a(appMetricaConfig.apiKey);
            this.f57124f.a(appMetricaConfig, publicLogger);
            c4268ic = new C4268ic(this.f57124f);
            c4268ic.f55385i = new C4444pb(this.f57122d, c4268ic);
            Pl pl2 = this.f57123e;
            Gh gh2 = c4268ic.f55378b;
            if (pl2 != null) {
                gh2.f55335b.setUuid(pl2.g());
            } else {
                gh2.getClass();
            }
            c4268ic.a(appMetricaConfig, c4333l0);
            c4268ic.k();
            this.f57121c.f57943f.f56297c = new C4299ji(c4268ic);
            this.f57125g.put(appMetricaConfig.apiKey, c4268ic);
            C4105c4.l().getClass();
            this.f57128j = c4268ic;
        }
        return c4268ic;
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final synchronized void a(ReporterConfig reporterConfig) {
        if (this.f57125g.containsKey(reporterConfig.apiKey)) {
            LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey).warning("Reporter with apiKey=%s already exists.", ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey));
        } else {
            b(reporterConfig);
            ImportantLogger.INSTANCE.info(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, "Activate reporter with APIKey " + ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey), new Object[0]);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final synchronized Sa b(ReporterConfig reporterConfig) {
        Sa sa2;
        sa2 = (Sa) this.f57125g.get(reporterConfig.apiKey);
        if (sa2 == null) {
            if (!this.f57127i.contains(reporterConfig.apiKey)) {
                this.f57123e.i();
            }
            Context context = this.f57119a;
            C4694zc c4694zc = new C4694zc(context, this.f57120b, reporterConfig, this.f57121c, new N9(context));
            c4694zc.f55385i = new C4444pb(this.f57122d, c4694zc);
            Pl pl2 = this.f57123e;
            Gh gh2 = c4694zc.f55378b;
            if (pl2 != null) {
                gh2.f55335b.setUuid(pl2.g());
            } else {
                gh2.getClass();
            }
            c4694zc.k();
            this.f57125g.put(reporterConfig.apiKey, c4694zc);
            sa2 = c4694zc;
        }
        return sa2;
    }

    public C4325ki(Context context, Cf cf2, C4650xi c4650xi, Handler handler, Pl pl2) {
        this.f57119a = context;
        this.f57120b = cf2;
        this.f57121c = c4650xi;
        this.f57122d = handler;
        this.f57123e = pl2;
        this.f57124f = new C4544tc(context, cf2, c4650xi, pl2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f57125g = linkedHashMap;
        this.f57126h = new Fn(new C4376mi(linkedHashMap));
        this.f57127i = nj.s.n("20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72");
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final synchronized Va a(AppMetricaConfig appMetricaConfig) {
        C4364m6 c4364m6;
        c4364m6 = this.f57129k;
        if (c4364m6 != null) {
            c4364m6.a(appMetricaConfig);
        } else {
            C4364m6 c4364m7 = new C4364m6(new C4389n6(this.f57120b, this.f57124f.f57720e, this.f57121c, appMetricaConfig));
            this.f57129k = c4364m7;
            c4364m6 = c4364m7;
        }
        return c4364m6;
    }
}
