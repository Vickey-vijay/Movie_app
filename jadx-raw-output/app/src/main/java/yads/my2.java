package yads;

/* JADX INFO: loaded from: classes6.dex */
public final class my2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f80464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f80465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f80466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yz2 f80467e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my2)) {
            return false;
        }
        my2 my2Var = (my2) obj;
        return ck.p.e(this.f80463a, my2Var.f80463a) && ck.p.e(this.f80464b, my2Var.f80464b) && this.f80465c == my2Var.f80465c && this.f80466d == my2Var.f80466d && ck.p.e(this.f80467e, my2Var.f80467e);
    }

    public final int hashCode() {
        String str = this.f80463a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l10 = this.f80464b;
        int iHashCode2 = (Boolean.hashCode(this.f80466d) + ((Boolean.hashCode(this.f80465c) + ((iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31)) * 31)) * 31;
        yz2 yz2Var = this.f80467e;
        return iHashCode2 + (yz2Var != null ? yz2Var.hashCode() : 0);
    }

    public final String toString() {
        return "Settings(templateType=" + this.f80463a + ", multiBannerAutoScrollInterval=" + this.f80464b + ", isHighlightingEnabled=" + this.f80465c + ", isLoopingVideo=" + this.f80466d + ", mediaAssetImageFallbackSize=" + this.f80467e + ")";
    }

    public my2(String str, Long l10, boolean z10, boolean z11, yz2 yz2Var) {
        this.f80463a = str;
        this.f80464b = l10;
        this.f80465c = z10;
        this.f80466d = z11;
        this.f80467e = yz2Var;
    }
}
