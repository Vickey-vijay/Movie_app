package yads;

/* JADX INFO: loaded from: classes6.dex */
public final class b40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75720c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b40)) {
            return false;
        }
        b40 b40Var = (b40) obj;
        return ck.p.e(this.f75718a, b40Var.f75718a) && ck.p.e(this.f75719b, b40Var.f75719b) && ck.p.e(this.f75720c, b40Var.f75720c);
    }

    public final int hashCode() {
        String str = this.f75718a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f75719b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f75720c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "DebugPanelAdNetworkSettingsData(pageId=" + this.f75718a + ", appReviewStatus=" + this.f75719b + ", appAdsTxt=" + this.f75720c + ")";
    }

    public b40(String str, String str2, String str3) {
        this.f75718a = str;
        this.f75719b = str2;
        this.f75720c = str3;
    }
}
