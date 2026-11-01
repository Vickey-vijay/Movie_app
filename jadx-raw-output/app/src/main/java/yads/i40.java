package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class i40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78481c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i40)) {
            return false;
        }
        i40 i40Var = (i40) obj;
        return ck.p.e(this.f78479a, i40Var.f78479a) && ck.p.e(this.f78480b, i40Var.f78480b) && ck.p.e(this.f78481c, i40Var.f78481c);
    }

    public final int hashCode() {
        return this.f78481c.hashCode() + k4.a(this.f78480b, this.f78479a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DebugPanelAdUnitData(name=" + this.f78479a + ", format=" + this.f78480b + ", adUnitId=" + this.f78481c + ")";
    }

    public i40(String str, String str2, String str3) {
        this.f78479a = str;
        this.f78480b = str2;
        this.f78481c = str3;
    }
}
