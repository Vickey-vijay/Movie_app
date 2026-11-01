package io.appmetrica.analytics.identifiers.impl;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f54827c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return ck.p.e(this.f54825a, aVar.f54825a) && ck.p.e(this.f54826b, aVar.f54826b) && ck.p.e(this.f54827c, aVar.f54827c);
    }

    public final int hashCode() {
        int iHashCode = this.f54825a.hashCode() * 31;
        String str = this.f54826b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f54827c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "AdvIdInfo(provider=" + this.f54825a + ", advId=" + this.f54826b + ", limitedAdTracking=" + this.f54827c + ')';
    }

    public a(String str, String str2, Boolean bool) {
        this.f54825a = str;
        this.f54826b = str2;
        this.f54827c = bool;
    }
}
