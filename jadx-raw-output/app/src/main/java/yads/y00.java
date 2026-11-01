package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class y00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h10 f84766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a10 f84767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a10 f84768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a10 f84769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o10 f84770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f84771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f84772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f84773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f84774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f84775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Float f84776k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f84777l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f84778m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f84779n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f84780o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f84781p;

    public y00(h10 h10Var, a10 a10Var, a10 a10Var2, a10 a10Var3, o10 o10Var, String str, String str2, String str3, String str4, String str5, Float f10, String str6, String str7, String str8, String str9, boolean z10) {
        this.f84766a = h10Var;
        this.f84767b = a10Var;
        this.f84768c = a10Var2;
        this.f84769d = a10Var3;
        this.f84770e = o10Var;
        this.f84771f = str;
        this.f84772g = str2;
        this.f84773h = str3;
        this.f84774i = str4;
        this.f84775j = str5;
        this.f84776k = f10;
        this.f84777l = str6;
        this.f84778m = str7;
        this.f84779n = str8;
        this.f84780o = str9;
        this.f84781p = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y00)) {
            return false;
        }
        y00 y00Var = (y00) obj;
        return ck.p.e(this.f84766a, y00Var.f84766a) && ck.p.e(this.f84767b, y00Var.f84767b) && ck.p.e(this.f84768c, y00Var.f84768c) && ck.p.e(this.f84769d, y00Var.f84769d) && ck.p.e(this.f84770e, y00Var.f84770e) && ck.p.e(this.f84771f, y00Var.f84771f) && ck.p.e(this.f84772g, y00Var.f84772g) && ck.p.e(this.f84773h, y00Var.f84773h) && ck.p.e(this.f84774i, y00Var.f84774i) && ck.p.e(this.f84775j, y00Var.f84775j) && ck.p.e(this.f84776k, y00Var.f84776k) && ck.p.e(this.f84777l, y00Var.f84777l) && ck.p.e(this.f84778m, y00Var.f84778m) && ck.p.e(this.f84779n, y00Var.f84779n) && ck.p.e(this.f84780o, y00Var.f84780o) && this.f84781p == y00Var.f84781p;
    }

    public final int hashCode() {
        h10 h10Var = this.f84766a;
        int iHashCode = (h10Var == null ? 0 : Float.hashCode(h10Var.f78012a)) * 31;
        a10 a10Var = this.f84767b;
        int iHashCode2 = (iHashCode + (a10Var == null ? 0 : a10Var.hashCode())) * 31;
        a10 a10Var2 = this.f84768c;
        int iHashCode3 = (iHashCode2 + (a10Var2 == null ? 0 : a10Var2.hashCode())) * 31;
        a10 a10Var3 = this.f84769d;
        int iHashCode4 = (iHashCode3 + (a10Var3 == null ? 0 : a10Var3.hashCode())) * 31;
        o10 o10Var = this.f84770e;
        int iHashCode5 = (iHashCode4 + (o10Var == null ? 0 : o10Var.hashCode())) * 31;
        String str = this.f84771f;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f84772g;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f84773h;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f84774i;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f84775j;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Float f10 = this.f84776k;
        int iHashCode11 = (iHashCode10 + (f10 == null ? 0 : f10.hashCode())) * 31;
        String str6 = this.f84777l;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f84778m;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f84779n;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f84780o;
        return Boolean.hashCode(this.f84781p) + ((iHashCode14 + (str9 != null ? str9.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CoreNativeAdAssets(media=" + this.f84766a + ", favicon=" + this.f84767b + ", icon=" + this.f84768c + ", image=" + this.f84769d + ", closeButton=" + this.f84770e + ", age=" + this.f84771f + ", body=" + this.f84772g + ", callToAction=" + this.f84773h + ", domain=" + this.f84774i + ", price=" + this.f84775j + ", rating=" + this.f84776k + ", reviewCount=" + this.f84777l + ", sponsored=" + this.f84778m + ", title=" + this.f84779n + ", warning=" + this.f84780o + ", feedbackAvailable=" + this.f84781p + ")";
    }
}
