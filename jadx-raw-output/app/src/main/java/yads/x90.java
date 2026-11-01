package yads;

/* JADX INFO: loaded from: classes7.dex */
public final class x90 extends ba0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x80 f84497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q50 f84498c;

    public x90(String str, String str2) {
        this(str, new x80(str2, 0, null, 0, 14));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x90)) {
            return false;
        }
        x90 x90Var = (x90) obj;
        return ck.p.e(this.f84496a, x90Var.f84496a) && ck.p.e(this.f84497b, x90Var.f84497b) && ck.p.e(this.f84498c, x90Var.f84498c);
    }

    public /* synthetic */ x90(String str, x80 x80Var) {
        this(str, x80Var, null);
    }

    public final int hashCode() {
        String str = this.f84496a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        x80 x80Var = this.f84497b;
        int iHashCode2 = (iHashCode + (x80Var == null ? 0 : x80Var.hashCode())) * 31;
        q50 q50Var = this.f84498c;
        return iHashCode2 + (q50Var != null ? q50Var.hashCode() : 0);
    }

    public final String toString() {
        return "KeyValue(title=" + this.f84496a + ", subtitle=" + this.f84497b + ", text=" + this.f84498c + ")";
    }

    public x90(String str, x80 x80Var, q50 q50Var) {
        super(0);
        this.f84496a = str;
        this.f84497b = x80Var;
        this.f84498c = q50Var;
    }
}
