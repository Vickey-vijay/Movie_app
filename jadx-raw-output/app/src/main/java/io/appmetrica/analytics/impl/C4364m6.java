package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4364m6 implements Va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4389n6 f57249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gh f57250b;

    @Override // io.appmetrica.analytics.impl.Va
    public final void a(Rn rn2) {
        C4650xi c4650xi = this.f57249a.f57312a;
        C4624wh c4624whA = c4650xi.a(rn2, this.f57250b);
        Gh gh2 = c4624whA.f57891e;
        Ql ql2 = c4650xi.f57942e;
        if (ql2 != null) {
            gh2.f55335b.setUuid(((Pl) ql2).g());
        } else {
            gh2.getClass();
        }
        c4650xi.f57940c.b(c4624whA);
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Unhandled exception received: " + rn2, new Object[0]);
    }

    public C4364m6(C4389n6 c4389n6) {
        this.f57249a = c4389n6;
        this.f57250b = c4389n6.a();
        C4105c4.l().getClass();
    }

    public final void a(AppMetricaConfig appMetricaConfig) {
        Map<String, String> map = appMetricaConfig.errorEnvironment;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                Gh gh2 = this.f57250b;
                String key = entry.getKey();
                String value = entry.getValue();
                synchronized (gh2) {
                    E8 e10 = gh2.f55268c;
                    e10.f55174b.b(e10.f55173a, key, value);
                }
            }
        }
    }
}
