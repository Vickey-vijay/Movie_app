package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class fl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77437b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl3)) {
            return false;
        }
        fl3 fl3Var = (fl3) obj;
        return ck.p.e(this.f77436a, fl3Var.f77436a) && this.f77437b == fl3Var.f77437b;
    }

    public final String a() {
        return this.f77436a;
    }

    public final int b() {
        return this.f77437b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f77437b) + (this.f77436a.hashCode() * 31);
    }

    public final String toString() {
        return "ViewSizeKey(adUnitId=" + this.f77436a + ", screenOrientation=" + this.f77437b + ")";
    }

    public fl3(int i10, String str) {
        this.f77436a = str;
        this.f77437b = i10;
    }
}
