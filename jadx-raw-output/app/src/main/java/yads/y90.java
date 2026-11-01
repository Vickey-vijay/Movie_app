package yads;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class y90 extends ba0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x80 f84856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q50 f84857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f84858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f84859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f84860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f84861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f84862i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c50 f84863j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f84864k;

    public y90(String str, String str2, x80 x80Var, q50 q50Var, String str3, String str4, String str5, List list, List list2, c50 c50Var, String str6) {
        super(0);
        this.f84854a = str;
        this.f84855b = str2;
        this.f84856c = x80Var;
        this.f84857d = q50Var;
        this.f84858e = str3;
        this.f84859f = str4;
        this.f84860g = str5;
        this.f84861h = list;
        this.f84862i = list2;
        this.f84863j = c50Var;
        this.f84864k = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y90)) {
            return false;
        }
        y90 y90Var = (y90) obj;
        return ck.p.e(this.f84854a, y90Var.f84854a) && ck.p.e(this.f84855b, y90Var.f84855b) && ck.p.e(this.f84856c, y90Var.f84856c) && ck.p.e(this.f84857d, y90Var.f84857d) && ck.p.e(this.f84858e, y90Var.f84858e) && ck.p.e(this.f84859f, y90Var.f84859f) && ck.p.e(this.f84860g, y90Var.f84860g) && ck.p.e(this.f84861h, y90Var.f84861h) && ck.p.e(this.f84862i, y90Var.f84862i) && this.f84863j == y90Var.f84863j && ck.p.e(this.f84864k, y90Var.f84864k);
    }

    public final String a() {
        return this.f84859f;
    }

    public final List b() {
        return this.f84862i;
    }

    public final String c() {
        return this.f84854a;
    }

    public final String d() {
        return this.f84860g;
    }

    public final List e() {
        return this.f84861h;
    }

    public final c50 f() {
        return this.f84863j;
    }

    public final int hashCode() {
        int iHashCode = this.f84854a.hashCode() * 31;
        String str = this.f84855b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        x80 x80Var = this.f84856c;
        int iHashCode3 = (this.f84857d.hashCode() + ((iHashCode2 + (x80Var == null ? 0 : x80Var.hashCode())) * 31)) * 31;
        String str2 = this.f84858e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f84859f;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f84860g;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.f84861h;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f84862i;
        int iHashCode8 = (this.f84863j.hashCode() + ((iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31;
        String str5 = this.f84864k;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        return "MediationAdapter(name=" + this.f84854a + ", logoUrl=" + this.f84855b + ", infoFirst=" + this.f84856c + ", infoSecond=" + this.f84857d + ", waringMessage=" + this.f84858e + ", adUnitId=" + this.f84859f + ", networkAdUnitIdName=" + this.f84860g + ", parameters=" + this.f84861h + ", cpmFloors=" + this.f84862i + ", type=" + this.f84863j + ", sdk=" + this.f84864k + ")";
    }

    public /* synthetic */ y90(String str, String str2, x80 x80Var, q50 q50Var, String str3, String str4, String str5, List list, List list2, c50 c50Var, String str6, int i10) {
        this(str, str2, x80Var, q50Var, str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : str5, (i10 & 128) != 0 ? null : list, (i10 & 256) != 0 ? null : list2, (i10 & 512) != 0 ? c50.f76169e : c50Var, (i10 & 1024) != 0 ? null : str6);
    }
}
