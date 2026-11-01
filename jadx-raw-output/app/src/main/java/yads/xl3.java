package yads;

/* JADX INFO: loaded from: classes8.dex */
public final class xl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84629b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl3)) {
            return false;
        }
        xl3 xl3Var = (xl3) obj;
        return this.f84628a == xl3Var.f84628a && ck.p.e(this.f84629b, xl3Var.f84629b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f84628a) * 31;
        String str = this.f84629b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "VisibleAreaResult(area=" + this.f84628a + ", description=" + this.f84629b + ")";
    }

    public xl3(int i10, String str) {
        this.f84628a = i10;
        this.f84629b = str;
    }
}
