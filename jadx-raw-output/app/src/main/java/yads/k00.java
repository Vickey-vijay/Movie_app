package yads;

/* JADX INFO: loaded from: classes7.dex */
public final class k00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f79257b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k00)) {
            return false;
        }
        k00 k00Var = (k00) obj;
        return ck.p.e(this.f79256a, k00Var.f79256a) && ck.p.e(this.f79257b, k00Var.f79257b);
    }

    public final int hashCode() {
        String str = this.f79256a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f79257b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "CoreCreative(creativeId=" + this.f79256a + ", campaignId=" + this.f79257b + ")";
    }

    public k00(String str, String str2) {
        this.f79256a = str;
        this.f79257b = str2;
    }
}
