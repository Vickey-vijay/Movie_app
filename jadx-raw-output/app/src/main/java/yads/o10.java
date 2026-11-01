package yads;

/* JADX INFO: loaded from: classes7.dex */
public final class o10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n10 f80888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80889b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o10)) {
            return false;
        }
        o10 o10Var = (o10) obj;
        return this.f80888a == o10Var.f80888a && ck.p.e(this.f80889b, o10Var.f80889b);
    }

    public final int hashCode() {
        int iHashCode = this.f80888a.hashCode() * 31;
        String str = this.f80889b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CoreNativeCloseButton(type=" + this.f80888a + ", text=" + this.f80889b + ")";
    }

    public o10(n10 n10Var, String str) {
        this.f80888a = n10Var;
        this.f80889b = str;
    }
}
