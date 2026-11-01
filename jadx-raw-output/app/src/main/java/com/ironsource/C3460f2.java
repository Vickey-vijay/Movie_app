package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3460f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC3757w0 f28857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Object> f28858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<String> f28859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final StringBuilder f28860d;

    public final Map<String, Object> a() {
        return this.f28858b;
    }

    public C3460f2(AbstractC3757w0 abstractC3757w0) {
        ck.p.j(abstractC3757w0, "adUnitData");
        this.f28857a = abstractC3757w0;
        this.f28858b = new HashMap();
        this.f28859c = new ArrayList();
        this.f28860d = new StringBuilder();
    }

    public final void a(NetworkSettings networkSettings) {
        ck.p.j(networkSettings, "providerSettings");
        List<String> list = this.f28859c;
        String providerInstanceName = networkSettings.getProviderInstanceName();
        ck.p.i(providerInstanceName, "providerSettings.providerInstanceName");
        list.add(providerInstanceName);
        StringBuilder sb2 = this.f28860d;
        sb2.append(networkSettings.getInstanceType(this.f28857a.b().a()));
        sb2.append(networkSettings.getProviderInstanceName());
        sb2.append(StringUtils.COMMA);
    }

    public final List<String> b() {
        return this.f28859c;
    }

    public final StringBuilder c() {
        return this.f28860d;
    }

    public final boolean d() {
        return (this.f28858b.isEmpty() && this.f28859c.isEmpty()) ? false : true;
    }

    public final void a(NetworkSettings networkSettings, Map<String, ? extends Object> map) {
        ck.p.j(networkSettings, "providerSettings");
        ck.p.j(map, "biddingData");
        String providerInstanceName = networkSettings.getProviderInstanceName();
        ck.p.i(providerInstanceName, "providerSettings.providerInstanceName");
        a(providerInstanceName, networkSettings.getInstanceType(this.f28857a.b().a()), map);
    }

    public final void a(B3 b10) {
        ck.p.j(b10, "biddingResponse");
        String strC = b10.c();
        ck.p.i(strC, "biddingResponse.instanceName");
        int iD = b10.d();
        Map<String, Object> mapA = b10.a();
        ck.p.i(mapA, "biddingResponse.biddingData");
        a(strC, iD, mapA);
    }

    private final void a(String str, int i10, Map<String, ? extends Object> map) {
        this.f28858b.put(str, map);
        StringBuilder sb2 = this.f28860d;
        sb2.append(i10);
        sb2.append(str);
        sb2.append(StringUtils.COMMA);
    }
}
