package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class j40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r40 f78911d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j40)) {
            return false;
        }
        j40 j40Var = (j40) obj;
        return ck.p.e(this.f78908a, j40Var.f78908a) && ck.p.e(this.f78909b, j40Var.f78909b) && ck.p.e(this.f78910c, j40Var.f78910c) && ck.p.e(this.f78911d, j40Var.f78911d);
    }

    public final int hashCode() {
        return this.f78911d.f82099a.hashCode() + k4.a(this.f78910c, k4.a(this.f78909b, this.f78908a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "DebugPanelAdUnitFullData(name=" + this.f78908a + ", format=" + this.f78909b + ", adUnitId=" + this.f78910c + ", mediation=" + this.f78911d + ")";
    }

    public j40(String str, String str2, String str3, r40 r40Var) {
        this.f78908a = str;
        this.f78909b = str2;
        this.f78910c = str3;
        this.f78911d = r40Var;
    }
}
