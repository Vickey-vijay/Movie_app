package yads;

/* JADX INFO: loaded from: classes.dex */
public final class g13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f77586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f77588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f77589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f77590e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g13)) {
            return false;
        }
        g13 g13Var = (g13) obj;
        return this.f77586a == g13Var.f77586a && this.f77587b == g13Var.f77587b && this.f77588c == g13Var.f77588c && this.f77589d == g13Var.f77589d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f77589d) + nd3.a(this.f77588c, nd3.a(this.f77587b, Integer.hashCode(this.f77586a) * 31, 31), 31);
    }

    public final String toString() {
        return "SmartCenter(x=" + this.f77586a + ", y=" + this.f77587b + ", width=" + this.f77588c + ", height=" + this.f77589d + ")";
    }

    public g13(int i10, int i11, int i12, int i13) {
        this.f77586a = i10;
        this.f77587b = i11;
        this.f77588c = i12;
        this.f77589d = i13;
        this.f77590e = i12 * i13;
    }
}
