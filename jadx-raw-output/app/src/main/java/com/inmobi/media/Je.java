package com.inmobi.media;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class Je extends Me {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f22930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3114pk f22931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f22932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ai f22933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f22934f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Je)) {
            return false;
        }
        Je je2 = (Je) obj;
        return ck.p.e(this.f22929a, je2.f22929a) && ck.p.e(this.f22930b, je2.f22930b) && ck.p.e(this.f22931c, je2.f22931c) && ck.p.e(this.f22932d, je2.f22932d) && ck.p.e(this.f22933e, je2.f22933e) && this.f22934f == je2.f22934f;
    }

    public Je(String str, HashMap map, C3114pk c3114pk, Map map2, Ai ai2, boolean z10, int i10) {
        map = (i10 & 2) != 0 ? null : map;
        c3114pk = (i10 & 4) != 0 ? null : c3114pk;
        map2 = (i10 & 8) != 0 ? null : map2;
        ai2 = (i10 & 16) != 0 ? null : ai2;
        z10 = (i10 & 32) != 0 ? true : z10;
        ck.p.j(str, "url");
        this.f22929a = str;
        this.f22930b = map;
        this.f22931c = c3114pk;
        this.f22932d = map2;
        this.f22933e = ai2;
        this.f22934f = z10;
        String strA = Se.a(str, map2);
        ck.p.j(strA, "<set-?>");
        this.f22929a = strA;
    }

    @Override // com.inmobi.media.Me
    public final Map a() {
        return this.f22930b;
    }

    @Override // com.inmobi.media.Me
    public final Ai b() {
        return this.f22933e;
    }

    @Override // com.inmobi.media.Me
    public final String c() {
        return this.f22929a;
    }

    public final int hashCode() {
        int iHashCode = this.f22929a.hashCode() * 31;
        Map map = this.f22930b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        C3114pk c3114pk = this.f22931c;
        int iHashCode3 = (iHashCode2 + (c3114pk == null ? 0 : c3114pk.hashCode())) * 31;
        Map map2 = this.f22932d;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Ai ai2 = this.f22933e;
        return Boolean.hashCode(this.f22934f) + ((iHashCode4 + (ai2 != null ? ai2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "GetRequest(url='" + this.f22929a + "', headers=" + this.f22930b + ", queryParams=" + this.f22932d + ", retryPolicy=" + this.f22933e + ", timeouts=" + this.f22931c + ", followRedirects=" + this.f22934f + ")";
    }
}
