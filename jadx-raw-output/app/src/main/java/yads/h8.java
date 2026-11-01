package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class h8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f78093b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8)) {
            return false;
        }
        h8 h8Var = (h8) obj;
        return this.f78092a == h8Var.f78092a && this.f78093b == h8Var.f78093b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f78093b) + (Integer.hashCode(this.f78092a) * 31);
    }

    public final String toString() {
        return "AdQualityVerificationNetworkConfiguration(usagePercent=" + this.f78092a + ", disabled=" + this.f78093b + ")";
    }

    public h8(boolean z10, int i10) {
        this.f78092a = i10;
        this.f78093b = z10;
    }
}
