package yads;

/* JADX INFO: loaded from: classes8.dex */
public final class rc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f82189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f82190d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc1)) {
            return false;
        }
        rc1 rc1Var = (rc1) obj;
        return ck.p.e(this.f82187a, rc1Var.f82187a) && ck.p.e(this.f82188b, rc1Var.f82188b) && this.f82189c == rc1Var.f82189c && this.f82190d == rc1Var.f82190d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f82190d) + nd3.a(this.f82189c, k4.a(this.f82188b, this.f82187a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "InteractiveCreativeFile(html=" + this.f82187a + ", mimeType=" + this.f82188b + ", height=" + this.f82189c + ", width=" + this.f82190d + ")";
    }

    public rc1(int i10, int i11, String str, String str2) {
        this.f82187a = str;
        this.f82188b = str2;
        this.f82189c = i10;
        this.f82190d = i11;
    }
}
