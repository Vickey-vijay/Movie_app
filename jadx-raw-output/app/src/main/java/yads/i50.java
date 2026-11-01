package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class i50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h50 f78497c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i50)) {
            return false;
        }
        i50 i50Var = (i50) obj;
        return ck.p.e(this.f78495a, i50Var.f78495a) && ck.p.e(this.f78496b, i50Var.f78496b) && this.f78497c == i50Var.f78497c;
    }

    public final int hashCode() {
        String str = this.f78495a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f78496b;
        return this.f78497c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelAlertData(title=" + this.f78495a + ", message=" + this.f78496b + ", type=" + this.f78497c + ")";
    }

    public i50(String str, String str2, h50 h50Var) {
        this.f78495a = str;
        this.f78496b = str2;
        this.f78497c = h50Var;
    }
}
