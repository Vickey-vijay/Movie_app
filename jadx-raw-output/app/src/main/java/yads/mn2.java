package yads;

/* JADX INFO: loaded from: classes7.dex */
public final class mn2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mn2 f80286b = new mn2(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f80287a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && mn2.class == obj.getClass() && this.f80287a == ((mn2) obj).f80287a;
    }

    public final int hashCode() {
        return !this.f80287a ? 1 : 0;
    }

    public mn2(boolean z10) {
        this.f80287a = z10;
    }
}
