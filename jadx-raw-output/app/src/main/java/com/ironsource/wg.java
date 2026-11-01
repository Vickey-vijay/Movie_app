package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class wg {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f31555d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W0 f31556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC3757w0 f31557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Vc f31558c;

    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }

        public final wg a(W0 w10, AbstractC3757w0 abstractC3757w0) {
            ck.p.j(w10, "adTools");
            ck.p.j(abstractC3757w0, "adUnitData");
            return abstractC3757w0.t() ? new C3658q2(w10, abstractC3757w0) : new Ec(w10, abstractC3757w0);
        }
    }

    public static final class b implements Vc {
    }

    public Vc a() {
        return this.f31558c;
    }

    public abstract void a(D d10, xg xgVar);

    public wg(W0 w10, AbstractC3757w0 abstractC3757w0) {
        ck.p.j(w10, "adTools");
        ck.p.j(abstractC3757w0, "adUnitData");
        this.f31556a = w10;
        this.f31557b = abstractC3757w0;
        this.f31558c = new b();
    }

    public final yg a(List<? extends C3605n2> list, Map<String, H> map, C3549k2 c3549k2, D d10) {
        ck.p.j(list, "waterfallItems");
        ck.p.j(map, "adInstancePayloads");
        ck.p.j(c3549k2, Ne.E1);
        ck.p.j(d10, "adInstanceFactory");
        IronLog.INTERNAL.verbose(C3621o0.a(this.f31556a, "waterfall.size() = " + list.size(), (String) null, 2, (Object) null));
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C3605n2 c3605n2 = list.get(i10);
            A a10 = a(c3605n2, c3549k2, d10, map.get(c3605n2.c()));
            if (a10 != null && a10.g() != null) {
                arrayList.add(a10);
            }
        }
        yg ygVar = new yg(arrayList);
        IronLog.INTERNAL.verbose(C3621o0.a(this.f31556a, "updateWaterfall() - next waterfall is " + ygVar + ".toWaterfallString()", (String) null, 2, (Object) null));
        return ygVar;
    }

    private final A a(C3605n2 c3605n2, C3549k2 c3549k2, D d10, H h10) {
        AbstractC3757w0 abstractC3757w0 = this.f31557b;
        String strC = c3605n2.c();
        ck.p.i(strC, "item.instanceName");
        NetworkSettings networkSettingsA = abstractC3757w0.a(strC);
        if (networkSettingsA == null) {
            String strC2 = c3605n2.c();
            ck.p.i(strC2, "item.instanceName");
            a("Could not find matching provider settings for auction response item", strC2);
            return null;
        }
        if (h10 == null) {
            String strC3 = c3605n2.c();
            ck.p.i(strC3, "item.instanceName");
            a("Could not find matching adInstancePayload for auction response item", strC3);
            return null;
        }
        com.ironsource.mediationsdk.c.b().b(networkSettingsA, this.f31557b.b().a(), this.f31557b.b().b());
        int iF = this.f31556a.f();
        AbstractC3757w0 abstractC3757w1 = this.f31557b;
        return d10.a(new B(abstractC3757w1, networkSettingsA, c3549k2, new C3405c1(networkSettingsA, abstractC3757w1.b(networkSettingsA), this.f31557b.b().a()), c3605n2, iF), h10);
    }

    private final void a(String str, String str2) {
        String str3 = str + " - item = " + str2;
        IronLog.INTERNAL.error(C3621o0.a(this.f31556a, str3, (String) null, 2, (Object) null));
        this.f31556a.e().h().i(str3);
    }
}
