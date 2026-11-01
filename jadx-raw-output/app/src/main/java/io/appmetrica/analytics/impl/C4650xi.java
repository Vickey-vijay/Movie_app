package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4650xi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G4 f57938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Tn f57939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4700zi f57940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4433p0 f57941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Ql f57942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Zj f57943f;

    public C4650xi(C4433p0 c4433p0, Tn tn2, G4 g10, Zj zj2) {
        this(c4433p0, tn2, g10, zj2, new C4700zi(c4433p0, zj2));
    }

    public final void a(C4624wh c4624wh) {
        Gh gh2 = c4624wh.f57891e;
        Ql ql2 = this.f57942e;
        if (ql2 != null) {
            gh2.f55335b.setUuid(((Pl) ql2).g());
        } else {
            gh2.getClass();
        }
        this.f57940c.a(c4624wh);
    }

    public C4650xi(C4433p0 c4433p0, Tn tn2, G4 g10, Zj zj2, C4700zi c4700zi) {
        this.f57941d = c4433p0;
        this.f57938a = g10;
        this.f57939b = tn2;
        this.f57943f = zj2;
        this.f57940c = c4700zi;
    }

    public final void b(String str) {
        Cf cf2 = this.f57938a.f55334a;
        synchronized (cf2) {
            cf2.f55103a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", str);
        }
    }

    public final void a(Pl pl2) {
        this.f57942e = pl2;
        this.f57938a.f55335b.setUuid(pl2.g());
    }

    public final void a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        if (mo.a(bool)) {
            this.f57938a.f55335b.setLocationTracking(bool.booleanValue());
        }
        if (mo.a(bool2)) {
            this.f57938a.f55335b.setDataSendingEnabled(bool2.booleanValue());
        }
        if (mo.a(bool3)) {
            this.f57938a.f55335b.setAdvIdentifiersTracking(bool3.booleanValue(), bool4.booleanValue());
        }
        Q5 q5A = Q5.a();
        G4 g10 = this.f57938a;
        a(a(q5A, g10), g10, 1, (Map) null);
    }

    public final void a(Q5 q10, Gh gh2, int i10, Map map) {
        String str;
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        this.f57941d.b();
        if (!mo.a(map)) {
            q10.setValue(AbstractC4241hb.b(map));
            a(q10, gh2);
        }
        Cf cf2 = new Cf(gh2.f55334a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(gh2.f55335b);
        E8 e10 = gh2.f55268c;
        synchronized (gh2) {
            str = gh2.f55271f;
        }
        a(new C4624wh(q10, false, i10, null, new Gh(cf2, counterConfiguration, e10, str)));
    }

    public static Q5 a(Q5 q10, Gh gh2) {
        if (AbstractC4641x9.f57918a.contains(Integer.valueOf(q10.f55776d))) {
            q10.f55775c = gh2.d();
        }
        return q10;
    }

    public final void a(List list) {
        Cf cf2 = this.f57938a.f55334a;
        synchronized (cf2) {
            cf2.f55103a.put("PROCESS_CFG_CUSTOM_HOSTS", mo.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
        }
    }

    public final void a(HashMap map) {
        Cf cf2 = this.f57938a.f55334a;
        synchronized (cf2) {
            cf2.f55103a.put("PROCESS_CFG_CLIDS", AbstractC4241hb.b(map));
        }
    }

    public final void a(String str) {
        Cf cf2 = this.f57938a.f55334a;
        synchronized (cf2) {
            cf2.f55103a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
        }
    }

    public final C4624wh a(Rn rn2, Gh gh2) {
        String str;
        this.f57941d.b();
        Tn tn2 = this.f57939b;
        tn2.getClass();
        Hn hn2 = rn2.f55830a;
        String str2 = hn2 == null ? "" : (String) WrapUtils.getOrDefault(hn2.f55325a, "");
        byte[] bArrFromModel = tn2.f55940a.fromModel(rn2);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(gh2.f55335b.getApiKey());
        Set set = AbstractC4641x9.f57918a;
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        N3 n10 = new N3(bArrFromModel, str2, 5891, orCreatePublicLogger);
        n10.f55775c = gh2.d();
        HashMap map = n10.f55601q;
        Cf cf2 = new Cf(gh2.f55334a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(gh2.f55335b);
        E8 e10 = gh2.f55268c;
        synchronized (gh2) {
            str = gh2.f55271f;
        }
        return new C4624wh(n10, true, 1, map, new Gh(cf2, counterConfiguration, e10, str));
    }
}
