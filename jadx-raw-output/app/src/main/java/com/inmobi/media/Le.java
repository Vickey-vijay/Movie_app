package com.inmobi.media;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class Le extends Me {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f23083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3114pk f23084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC3236ui f23085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ai f23086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f23087f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Le)) {
            return false;
        }
        Le le2 = (Le) obj;
        return ck.p.e(this.f23082a, le2.f23082a) && ck.p.e(this.f23083b, le2.f23083b) && ck.p.e(this.f23084c, le2.f23084c) && ck.p.e(this.f23085d, le2.f23085d) && ck.p.e(this.f23086e, le2.f23086e) && this.f23087f == le2.f23087f;
    }

    public Le(String str, Map map, C3114pk c3114pk, AbstractC3236ui abstractC3236ui, Ai ai2, int i10) {
        map = (i10 & 2) != 0 ? null : map;
        c3114pk = (i10 & 4) != 0 ? null : c3114pk;
        ai2 = (i10 & 16) != 0 ? null : ai2;
        ck.p.j(str, "url");
        this.f23082a = str;
        this.f23083b = map;
        this.f23084c = c3114pk;
        this.f23085d = abstractC3236ui;
        this.f23086e = ai2;
        this.f23087f = true;
    }

    @Override // com.inmobi.media.Me
    public final Map a() {
        return this.f23083b;
    }

    @Override // com.inmobi.media.Me
    public final Ai b() {
        return this.f23086e;
    }

    @Override // com.inmobi.media.Me
    public final String c() {
        return this.f23082a;
    }

    public final int hashCode() {
        int iHashCode = this.f23082a.hashCode() * 31;
        Map map = this.f23083b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        C3114pk c3114pk = this.f23084c;
        int iHashCode3 = (iHashCode2 + (c3114pk == null ? 0 : c3114pk.hashCode())) * 31;
        AbstractC3236ui abstractC3236ui = this.f23085d;
        int iHashCode4 = (iHashCode3 + (abstractC3236ui == null ? 0 : abstractC3236ui.hashCode())) * 31;
        Ai ai2 = this.f23086e;
        return Boolean.hashCode(this.f23087f) + ((iHashCode4 + (ai2 != null ? ai2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PostRequest(url='" + this.f23082a + "', headers=" + this.f23083b + ", body=" + this.f23085d + ", retryPolicy=" + this.f23086e + ", timeouts=" + this.f23084c + ", followRedirects=" + this.f23087f + ")";
    }
}
