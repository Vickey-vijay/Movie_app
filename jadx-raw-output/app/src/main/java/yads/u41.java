package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class u41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f83366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f83367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f83368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f83369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13 f83370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f83371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f83372g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u41)) {
            return false;
        }
        u41 u41Var = (u41) obj;
        return this.f83366a == u41Var.f83366a && this.f83367b == u41Var.f83367b && ck.p.e(this.f83368c, u41Var.f83368c) && ck.p.e(this.f83369d, u41Var.f83369d) && ck.p.e(this.f83370e, u41Var.f83370e) && this.f83371f == u41Var.f83371f && ck.p.e(this.f83372g, u41Var.f83372g);
    }

    public final int a() {
        return this.f83367b;
    }

    public final int b() {
        return this.f83366a;
    }

    public final int hashCode() {
        int iA = k4.a(this.f83368c, nd3.a(this.f83367b, Integer.hashCode(this.f83366a) * 31, 31), 31);
        String str = this.f83369d;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        o13 o13Var = this.f83370e;
        int iHashCode2 = (Boolean.hashCode(this.f83371f) + ((iHashCode + (o13Var == null ? 0 : o13Var.hashCode())) * 31)) * 31;
        String str2 = this.f83372g;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "ImageValue(width=" + this.f83366a + ", height=" + this.f83367b + ", url=" + this.f83368c + ", sizeType=" + this.f83369d + ", smartCenterSettings=" + this.f83370e + ", preload=" + this.f83371f + ", preview=" + this.f83372g + ")";
    }

    public u41(int i10, int i11, String str, String str2, o13 o13Var, boolean z10, String str3) {
        this.f83366a = i10;
        this.f83367b = i11;
        this.f83368c = str;
        this.f83369d = str2;
        this.f83370e = o13Var;
        this.f83371f = z10;
        this.f83372g = str3;
    }
}
