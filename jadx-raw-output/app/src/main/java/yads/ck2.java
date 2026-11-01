package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class ck2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f76304b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ck2.class != obj.getClass()) {
            return false;
        }
        ck2 ck2Var = (ck2) obj;
        return this.f76303a == ck2Var.f76303a && this.f76304b == ck2Var.f76304b;
    }

    public final int hashCode() {
        return (this.f76303a * 31) + (this.f76304b ? 1 : 0);
    }

    public ck2(boolean z10, int i10) {
        this.f76303a = i10;
        this.f76304b = z10;
    }
}
