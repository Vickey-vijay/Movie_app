package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class x8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f84474b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8)) {
            return false;
        }
        x8 x8Var = (x8) obj;
        return this.f84473a == x8Var.f84473a && this.f84474b == x8Var.f84474b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f84474b) + (Integer.hashCode(this.f84473a) * 31);
    }

    public final String toString() {
        return "AdQualityVerifierNetworkConfiguration(usagePercent=" + this.f84473a + ", disabled=" + this.f84474b + ")";
    }

    public x8(boolean z10, int i10) {
        this.f84473a = i10;
        this.f84474b = z10;
    }
}
