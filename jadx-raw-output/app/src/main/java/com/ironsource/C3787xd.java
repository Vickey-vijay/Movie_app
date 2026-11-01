package com.ironsource;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.xd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C3787xd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, List<String>> f31596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, List<String>> f31597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, List<String>> f31598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, List<String>> f31599d;

    public C3787xd() {
        this(null, null, null, null, 15, null);
    }

    public final Map<String, List<String>> a() {
        return this.f31596a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3787xd)) {
            return false;
        }
        C3787xd c3787xd = (C3787xd) obj;
        return ck.p.e(this.f31596a, c3787xd.f31596a) && ck.p.e(this.f31597b, c3787xd.f31597b) && ck.p.e(this.f31598c, c3787xd.f31598c) && ck.p.e(this.f31599d, c3787xd.f31599d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3787xd(Map<String, ? extends List<String>> map, Map<String, ? extends List<String>> map2, Map<String, ? extends List<String>> map3, Map<String, ? extends List<String>> map4) {
        this.f31596a = map;
        this.f31597b = map2;
        this.f31598c = map3;
        this.f31599d = map4;
    }

    public final C3787xd a(Map<String, ? extends List<String>> map, Map<String, ? extends List<String>> map2, Map<String, ? extends List<String>> map3, Map<String, ? extends List<String>> map4) {
        return new C3787xd(map, map2, map3, map4);
    }

    public final Map<String, List<String>> b() {
        return this.f31597b;
    }

    public final Map<String, List<String>> c() {
        return this.f31598c;
    }

    public final Map<String, List<String>> d() {
        return this.f31599d;
    }

    public final Map<String, List<String>> e() {
        return this.f31598c;
    }

    public final Map<String, List<String>> f() {
        return this.f31597b;
    }

    public final Map<String, List<String>> g() {
        return this.f31599d;
    }

    public final Map<String, List<String>> h() {
        return this.f31596a;
    }

    public int hashCode() {
        Map<String, List<String>> map = this.f31596a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, List<String>> map2 = this.f31597b;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, List<String>> map3 = this.f31598c;
        int iHashCode3 = (iHashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, List<String>> map4 = this.f31599d;
        return iHashCode3 + (map4 != null ? map4.hashCode() : 0);
    }

    public String toString() {
        return "ProviderOrder2(rewarded=" + this.f31596a + ", interstitial=" + this.f31597b + ", banner=" + this.f31598c + ", nativeAd=" + this.f31599d + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C3787xd a(C3787xd c3787xd, Map map, Map map2, Map map3, Map map4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = c3787xd.f31596a;
        }
        if ((i10 & 2) != 0) {
            map2 = c3787xd.f31597b;
        }
        if ((i10 & 4) != 0) {
            map3 = c3787xd.f31598c;
        }
        if ((i10 & 8) != 0) {
            map4 = c3787xd.f31599d;
        }
        return c3787xd.a(map, map2, map3, map4);
    }

    public /* synthetic */ C3787xd(Map map, Map map2, Map map3, Map map4, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? null : map, (i10 & 2) != 0 ? null : map2, (i10 & 4) != 0 ? null : map3, (i10 & 8) != 0 ? null : map4);
    }
}
