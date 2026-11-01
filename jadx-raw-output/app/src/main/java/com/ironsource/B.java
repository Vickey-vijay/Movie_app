package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC3757w0 f25947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NetworkSettings f25948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3549k2 f25949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3405c1 f25950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3605n2 f25951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f25952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final I f25953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final IronSource.a f25954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final JSONObject f25955i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f25956j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f25957k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f25958l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C3605n2 f25959m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f25960n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f25961o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f25962p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AdData f25963q;

    public final AbstractC3757w0 a() {
        return this.f25947a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        return ck.p.e(this.f25947a, b10.f25947a) && ck.p.e(this.f25948b, b10.f25948b) && ck.p.e(this.f25949c, b10.f25949c) && ck.p.e(this.f25950d, b10.f25950d) && ck.p.e(this.f25951e, b10.f25951e) && this.f25952f == b10.f25952f;
    }

    public B(AbstractC3757w0 abstractC3757w0, NetworkSettings networkSettings, C3549k2 c3549k2, C3405c1 c3405c1, C3605n2 c3605n2, int i10) {
        ck.p.j(abstractC3757w0, "adUnitData");
        ck.p.j(networkSettings, "providerSettings");
        ck.p.j(c3549k2, Ne.E1);
        ck.p.j(c3405c1, "adapterConfig");
        ck.p.j(c3605n2, "auctionResponseItem");
        this.f25947a = abstractC3757w0;
        this.f25948b = networkSettings;
        this.f25949c = c3549k2;
        this.f25950d = c3405c1;
        this.f25951e = c3605n2;
        this.f25952f = i10;
        this.f25953g = new I(C3656q0.a.DidntAttemptToLoad);
        IronSource.a aVarA = abstractC3757w0.b().a();
        this.f25954h = aVarA;
        this.f25955i = c3549k2.h();
        this.f25956j = c3549k2.g();
        this.f25957k = c3549k2.i();
        this.f25958l = c3549k2.f();
        this.f25959m = c3549k2.j();
        String strF = c3405c1.f();
        ck.p.i(strF, "adapterConfig.providerName");
        this.f25960n = strF;
        ck.w wVar = ck.w.f6066a;
        String str = String.format("%s %s", Arrays.copyOf(new Object[]{strF, Integer.valueOf(hashCode())}, 2));
        ck.p.i(str, "format(format, *args)");
        this.f25961o = str;
        this.f25962p = c3405c1.d();
        String strK = c3605n2.k();
        Map<String, Object> mapA = C3575la.a(c3605n2.a());
        ck.p.i(mapA, "jsonObjectToMap(auctionResponseItem.adData)");
        mapA.put("adUnit", aVarA);
        HashMap map = new HashMap();
        Map<String, Object> mapA2 = C3575la.a(c3405c1.c());
        ck.p.i(mapA2, "jsonObjectToMap(adapterConfig.adUnitSettings)");
        map.putAll(mapA2);
        mapA.put("userId", abstractC3757w0.r());
        mapA.put("adUnitId", abstractC3757w0.b().c());
        mapA.put("isMultipleAdUnits", Boolean.TRUE);
        this.f25963q = new AdData(strK, map, mapA);
    }

    public final B a(AbstractC3757w0 abstractC3757w0, NetworkSettings networkSettings, C3549k2 c3549k2, C3405c1 c3405c1, C3605n2 c3605n2, int i10) {
        ck.p.j(abstractC3757w0, "adUnitData");
        ck.p.j(networkSettings, "providerSettings");
        ck.p.j(c3549k2, Ne.E1);
        ck.p.j(c3405c1, "adapterConfig");
        ck.p.j(c3605n2, "auctionResponseItem");
        return new B(abstractC3757w0, networkSettings, c3549k2, c3405c1, c3605n2, i10);
    }

    public final NetworkSettings b() {
        return this.f25948b;
    }

    public final C3549k2 c() {
        return this.f25949c;
    }

    public final C3405c1 d() {
        return this.f25950d;
    }

    public final C3605n2 e() {
        return this.f25951e;
    }

    public final int f() {
        return this.f25952f;
    }

    public final AdData g() {
        return this.f25963q;
    }

    public final IronSource.a h() {
        return this.f25954h;
    }

    public int hashCode() {
        return (((((((((this.f25947a.hashCode() * 31) + this.f25948b.hashCode()) * 31) + this.f25949c.hashCode()) * 31) + this.f25950d.hashCode()) * 31) + this.f25951e.hashCode()) * 31) + Integer.hashCode(this.f25952f);
    }

    public final AbstractC3757w0 i() {
        return this.f25947a;
    }

    public final C3405c1 j() {
        return this.f25950d;
    }

    public final C3549k2 k() {
        return this.f25949c;
    }

    public final String l() {
        return this.f25958l;
    }

    public final String m() {
        return this.f25956j;
    }

    public final C3605n2 n() {
        return this.f25951e;
    }

    public final int o() {
        return this.f25957k;
    }

    public final C3605n2 p() {
        return this.f25959m;
    }

    public final JSONObject q() {
        return this.f25955i;
    }

    public final String r() {
        return this.f25960n;
    }

    public final int s() {
        return this.f25962p;
    }

    public final I t() {
        return this.f25953g;
    }

    public String toString() {
        return "AdInstanceData(adUnitData=" + this.f25947a + ", providerSettings=" + this.f25948b + ", auctionData=" + this.f25949c + ", adapterConfig=" + this.f25950d + ", auctionResponseItem=" + this.f25951e + ", sessionDepth=" + this.f25952f + ")";
    }

    public final NetworkSettings u() {
        return this.f25948b;
    }

    public final int v() {
        return this.f25952f;
    }

    public final String w() {
        return this.f25961o;
    }

    public static /* synthetic */ B a(B b10, AbstractC3757w0 abstractC3757w0, NetworkSettings networkSettings, C3549k2 c3549k2, C3405c1 c3405c1, C3605n2 c3605n2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            abstractC3757w0 = b10.f25947a;
        }
        if ((i11 & 2) != 0) {
            networkSettings = b10.f25948b;
        }
        NetworkSettings networkSettings2 = networkSettings;
        if ((i11 & 4) != 0) {
            c3549k2 = b10.f25949c;
        }
        C3549k2 c3549k3 = c3549k2;
        if ((i11 & 8) != 0) {
            c3405c1 = b10.f25950d;
        }
        C3405c1 c3405c2 = c3405c1;
        if ((i11 & 16) != 0) {
            c3605n2 = b10.f25951e;
        }
        C3605n2 c3605n3 = c3605n2;
        if ((i11 & 32) != 0) {
            i10 = b10.f25952f;
        }
        return b10.a(abstractC3757w0, networkSettings2, c3549k3, c3405c2, c3605n3, i10);
    }

    public final void a(C3656q0.a aVar) {
        ck.p.j(aVar, "performance");
        this.f25953g.b(aVar);
    }
}
