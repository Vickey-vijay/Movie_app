package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class qb3 implements tb3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pb3 f81798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f81800c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb3)) {
            return false;
        }
        qb3 qb3Var = (qb3) obj;
        return this.f81798a == qb3Var.f81798a && ck.p.e(this.f81799b, qb3Var.f81799b) && ck.p.e(this.f81800c, qb3Var.f81800c);
    }

    public final int hashCode() {
        int iHashCode = this.f81798a.hashCode() * 31;
        String str = this.f81799b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f81800c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Failure(status=" + this.f81798a + ", assetName=" + this.f81799b + ", description=" + this.f81800c + ")";
    }

    public qb3(pb3 pb3Var, String str, String str2) {
        this.f81798a = pb3Var;
        this.f81799b = str;
        this.f81800c = str2;
    }
}
