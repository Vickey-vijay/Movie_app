package yads;

/* JADX INFO: loaded from: classes7.dex */
@xk.f
public final class zu1 {
    public static final yu1 Companion = new yu1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f85590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f85593d;

    public /* synthetic */ zu1(int i10, long j10, String str, String str2, String str3) {
        if (15 != (i10 & 15)) {
            bl.o1.a(i10, 15, xu1.f84694a.getDescriptor());
        }
        this.f85590a = j10;
        this.f85591b = str;
        this.f85592c = str2;
        this.f85593d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu1)) {
            return false;
        }
        zu1 zu1Var = (zu1) obj;
        return this.f85590a == zu1Var.f85590a && ck.p.e(this.f85591b, zu1Var.f85591b) && ck.p.e(this.f85592c, zu1Var.f85592c) && ck.p.e(this.f85593d, zu1Var.f85593d);
    }

    public zu1(long j10, String str, String str2, String str3) {
        this.f85590a = j10;
        this.f85591b = str;
        this.f85592c = str2;
        this.f85593d = str3;
    }

    public final int hashCode() {
        return this.f85593d.hashCode() + k4.a(this.f85592c, k4.a(this.f85591b, Long.hashCode(this.f85590a) * 31, 31), 31);
    }

    public final String toString() {
        return "MobileAdsSdkLog(timestamp=" + this.f85590a + ", type=" + this.f85591b + ", tag=" + this.f85592c + ", text=" + this.f85593d + ")";
    }
}
