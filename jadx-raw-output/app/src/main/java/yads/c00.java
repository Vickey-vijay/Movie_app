package yads;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class c00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final la f76075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f76077d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c00)) {
            return false;
        }
        c00 c00Var = (c00) obj;
        return ck.p.e(this.f76074a, c00Var.f76074a) && ck.p.e(this.f76075b, c00Var.f76075b) && ck.p.e(this.f76076c, c00Var.f76076c) && ck.p.e(this.f76077d, c00Var.f76077d);
    }

    public final int hashCode() {
        int iHashCode = this.f76074a.hashCode() * 31;
        la laVar = this.f76075b;
        int iHashCode2 = (iHashCode + (laVar == null ? 0 : laVar.hashCode())) * 31;
        String str = this.f76076c;
        return this.f76077d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CoreAdInfo(adUnitId=" + this.f76074a + ", adSize=" + this.f76075b + ", data=" + this.f76076c + ", creatives=" + this.f76077d + ")";
    }

    public c00(String str, la laVar, String str2, List list) {
        this.f76074a = str;
        this.f76075b = laVar;
        this.f76076c = str2;
        this.f76077d = list;
    }
}
