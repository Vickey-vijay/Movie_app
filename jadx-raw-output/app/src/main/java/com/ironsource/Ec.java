package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class Ec extends wg {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final W0 f26466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC3757w0 f26467f;

    @Override // com.ironsource.wg
    public void a(D d10, xg xgVar) {
        ck.p.j(d10, "adInstanceFactory");
        ck.p.j(xgVar, "waterfallFetcherListener");
        IronLog.INTERNAL.verbose(C3621o0.a(this.f26466e, "auction disabled", (String) null, 2, (Object) null));
        a(xgVar, b(), d10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ec(W0 w10, AbstractC3757w0 abstractC3757w0) {
        super(w10, abstractC3757w0);
        ck.p.j(w10, "tools");
        ck.p.j(abstractC3757w0, "adUnitData");
        this.f26466e = w10;
        this.f26467f = abstractC3757w0;
    }

    private final C3549k2 b() {
        return new C3549k2("", IronSourceVideoBridge.jsonObjectInit(), null, 0, "");
    }

    private final Map<String, H> c() {
        Hf hfG = this.f26467f.b().g();
        List<NetworkSettings> listM = this.f26467f.m();
        ArrayList<NetworkSettings> arrayList = new ArrayList();
        for (Object obj : listM) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (hfG == null || hfG.a(networkSettings, this.f26467f.b().a())) {
                if (!networkSettings.isBidder(this.f26467f.b().a())) {
                    arrayList.add(obj);
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(ik.k.d(nj.l0.f(nj.t.v(arrayList, 10)), 16));
        for (NetworkSettings networkSettings2 : arrayList) {
            Pair pairA = mj.h.a(networkSettings2.getProviderInstanceName(), new H(this.f26466e, this.f26467f, networkSettings2));
            linkedHashMap.put(pairA.getFirst(), pairA.getSecond());
        }
        return linkedHashMap;
    }

    private final List<C3605n2> d() {
        Hf hfG = this.f26467f.b().g();
        List<NetworkSettings> listM = this.f26467f.m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (hfG == null || hfG.a(networkSettings, this.f26467f.b().a())) {
                if (!networkSettings.isBidder(this.f26467f.b().a())) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(nj.t.v(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C3605n2(((NetworkSettings) it.next()).getProviderInstanceName()));
        }
        return arrayList2;
    }

    public final void a(xg xgVar, int i10, String str, String str2, D d10) {
        ck.p.j(xgVar, "waterfallFetcherListener");
        ck.p.j(str, IronSourceConstants.AUCTION_FALLBACK);
        ck.p.j(str2, "auctionId");
        ck.p.j(d10, "adInstanceFactory");
        a(xgVar, new C3549k2(str2, IronSourceVideoBridge.jsonObjectInit(), null, i10, str), d10);
    }

    private final void a(xg xgVar, C3549k2 c3549k2, D d10) {
        IronLog.INTERNAL.verbose(C3621o0.a(this.f26466e, (String) null, (String) null, 3, (Object) null));
        xgVar.a(a(d(), c(), c3549k2, d10));
    }
}
