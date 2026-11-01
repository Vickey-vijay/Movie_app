package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class d80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76593b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d80)) {
            return false;
        }
        d80 d80Var = (d80) obj;
        return ck.p.e(this.f76592a, d80Var.f76592a) && ck.p.e(this.f76593b, d80Var.f76593b);
    }

    public final String a() {
        return this.f76592a;
    }

    public final String b() {
        return this.f76593b;
    }

    public final int hashCode() {
        return this.f76593b.hashCode() + (this.f76592a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelMediationAdapterParameterData(name=" + this.f76592a + ", value=" + this.f76593b + ")";
    }

    public d80(String str, String str2) {
        this.f76592a = str;
        this.f76593b = str2;
    }
}
