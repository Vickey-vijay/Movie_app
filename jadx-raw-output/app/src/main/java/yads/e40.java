package yads;

/* JADX INFO: loaded from: classes2.dex */
@xk.f
public final class e40 {
    public static final d40 Companion = new d40();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m40 f76911d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e40)) {
            return false;
        }
        e40 e40Var = (e40) obj;
        return ck.p.e(this.f76908a, e40Var.f76908a) && ck.p.e(this.f76909b, e40Var.f76909b) && ck.p.e(this.f76910c, e40Var.f76910c) && ck.p.e(this.f76911d, e40Var.f76911d);
    }

    public /* synthetic */ e40(int i10, String str, String str2, String str3, m40 m40Var) {
        if (7 != (i10 & 7)) {
            bl.o1.a(i10, 7, c40.f76152a.getDescriptor());
        }
        this.f76908a = str;
        this.f76909b = str2;
        this.f76910c = str3;
        if ((i10 & 8) == 0) {
            this.f76911d = null;
        } else {
            this.f76911d = m40Var;
        }
    }

    public final int hashCode() {
        int iA = k4.a(this.f76910c, k4.a(this.f76909b, this.f76908a.hashCode() * 31, 31), 31);
        m40 m40Var = this.f76911d;
        return iA + (m40Var == null ? 0 : m40Var.hashCode());
    }

    public final String toString() {
        return "DebugPanelAdUnit(name=" + this.f76908a + ", format=" + this.f76909b + ", adUnitId=" + this.f76910c + ", mediation=" + this.f76911d + ")";
    }
}
