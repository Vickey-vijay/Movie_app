package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class xx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f84739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f84740d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx1)) {
            return false;
        }
        xx1 xx1Var = (xx1) obj;
        return this.f84737a == xx1Var.f84737a && this.f84738b == xx1Var.f84738b && this.f84739c == xx1Var.f84739c && this.f84740d == xx1Var.f84740d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f84740d) + nd3.a(this.f84739c, nd3.a(this.f84738b, Integer.hashCode(this.f84737a) * 31, 31), 31);
    }

    public final String toString() {
        return "MuteControlResources(mutedResourceId=" + this.f84737a + ", unmutedResourceId=" + this.f84738b + ", mutedContentDescriptionId=" + this.f84739c + ", unmutedContentDescriptionId=" + this.f84740d + ")";
    }

    public xx1(int i10, int i11, int i12, int i13) {
        this.f84737a = i10;
        this.f84738b = i11;
        this.f84739c = i12;
        this.f84740d = i13;
    }
}
