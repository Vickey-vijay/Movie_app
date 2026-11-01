package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class kl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f79458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jl1 f79459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f79460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f79461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Float f79462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f79463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f79464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f79465i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f79466j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f79467k;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl1)) {
            return false;
        }
        kl1 kl1Var = (kl1) obj;
        return ck.p.e(this.f79457a, kl1Var.f79457a) && ck.p.e(this.f79458b, kl1Var.f79458b) && this.f79459c == kl1Var.f79459c && ck.p.e(this.f79460d, kl1Var.f79460d) && ck.p.e(this.f79461e, kl1Var.f79461e) && ck.p.e(this.f79462f, kl1Var.f79462f) && this.f79463g == kl1Var.f79463g && this.f79464h == kl1Var.f79464h && this.f79465i == kl1Var.f79465i && ck.p.e(this.f79466j, kl1Var.f79466j);
    }

    public final int hashCode() {
        int iHashCode = this.f79457a.hashCode() * 31;
        String str = this.f79458b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        jl1 jl1Var = this.f79459c;
        int iHashCode3 = (iHashCode2 + (jl1Var == null ? 0 : jl1Var.hashCode())) * 31;
        String str2 = this.f79460d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f79461e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f10 = this.f79462f;
        int iA = nd3.a(this.f79465i, nd3.a(this.f79464h, nd3.a(this.f79463g, (iHashCode5 + (f10 == null ? 0 : f10.hashCode())) * 31, 31), 31), 31);
        String str4 = this.f79466j;
        return iA + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "MediaFile(uri=" + this.f79457a + ", id=" + this.f79458b + ", deliveryMethod=" + this.f79459c + ", mimeType=" + this.f79460d + ", codec=" + this.f79461e + ", vmafMetric=" + this.f79462f + ", height=" + this.f79463g + ", width=" + this.f79464h + ", bitrate=" + this.f79465i + ", apiFramework=" + this.f79466j + ")";
    }

    public kl1(String str, String str2, jl1 jl1Var, String str3, String str4, Float f10, int i10, int i11, int i12, String str5) {
        this.f79457a = str;
        this.f79458b = str2;
        this.f79459c = jl1Var;
        this.f79460d = str3;
        this.f79461e = str4;
        this.f79462f = f10;
        this.f79463g = i10;
        this.f79464h = i11;
        this.f79465i = i12;
        this.f79466j = str5;
        this.f79467k = ck.p.e(str5, "VPAID");
    }
}
