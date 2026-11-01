package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class py2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f81649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f81651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qy2 f81652d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof py2)) {
            return false;
        }
        py2 py2Var = (py2) obj;
        return this.f81649a == py2Var.f81649a && ck.p.e(this.f81650b, py2Var.f81650b) && this.f81651c == py2Var.f81651c && this.f81652d == py2Var.f81652d;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f81649a) * 31;
        String str = this.f81650b;
        return this.f81652d.hashCode() + nd3.a(this.f81651c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "ShowNotice(delay=" + this.f81649a + ", url=" + this.f81650b + ", visibilityPercent=" + this.f81651c + ", type=" + this.f81652d + ")";
    }

    public py2(int i10, long j10, qy2 qy2Var, String str) {
        this.f81649a = j10;
        this.f81650b = str;
        this.f81651c = i10;
        this.f81652d = qy2Var;
    }
}
