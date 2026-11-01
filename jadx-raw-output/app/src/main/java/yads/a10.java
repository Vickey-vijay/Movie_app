package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class a10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bk.a f75358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f75360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f75361d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a10)) {
            return false;
        }
        a10 a10Var = (a10) obj;
        return ck.p.e(this.f75358a, a10Var.f75358a) && ck.p.e(this.f75359b, a10Var.f75359b) && this.f75360c == a10Var.f75360c && this.f75361d == a10Var.f75361d;
    }

    public final int hashCode() {
        int iHashCode = this.f75358a.hashCode() * 31;
        String str = this.f75359b;
        return Integer.hashCode(this.f75361d) + nd3.a(this.f75360c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "CoreNativeAdImage(getBitmap=" + this.f75358a + ", sizeType=" + this.f75359b + ", width=" + this.f75360c + ", height=" + this.f75361d + ")";
    }

    public a10(f02 f02Var, String str, int i10, int i11) {
        this.f75358a = f02Var;
        this.f75359b = str;
        this.f75360c = i10;
        this.f75361d = i11;
    }
}
