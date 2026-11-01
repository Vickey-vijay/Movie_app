package yads;

/* JADX INFO: loaded from: classes8.dex */
@xk.f
public final class dx0 {
    public static final cx0 Companion = new cx0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f76838d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx0)) {
            return false;
        }
        dx0 dx0Var = (dx0) obj;
        return ck.p.e(this.f76835a, dx0Var.f76835a) && ck.p.e(this.f76836b, dx0Var.f76836b) && ck.p.e(this.f76837c, dx0Var.f76837c) && ck.p.e(this.f76838d, dx0Var.f76838d);
    }

    public /* synthetic */ dx0(int i10, String str, String str2, String str3, String str4) {
        if (15 != (i10 & 15)) {
            bl.o1.a(i10, 15, bx0.f76000a.getDescriptor());
        }
        this.f76835a = str;
        this.f76836b = str2;
        this.f76837c = str3;
        this.f76838d = str4;
    }

    public final int hashCode() {
        return this.f76838d.hashCode() + k4.a(this.f76837c, k4.a(this.f76836b, this.f76835a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "FontUrls(regular=" + this.f76835a + ", bold=" + this.f76836b + ", light=" + this.f76837c + ", medium=" + this.f76838d + ")";
    }
}
