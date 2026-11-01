package yads;

/* JADX INFO: loaded from: classes4.dex */
@xk.f
public final class g50 {
    public static final f50 Companion = new f50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77635c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g50)) {
            return false;
        }
        g50 g50Var = (g50) obj;
        return ck.p.e(this.f77633a, g50Var.f77633a) && ck.p.e(this.f77634b, g50Var.f77634b) && ck.p.e(this.f77635c, g50Var.f77635c);
    }

    public final int hashCode() {
        String str = this.f77633a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f77634b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f77635c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "DebugPanelAlert(title=" + this.f77633a + ", message=" + this.f77634b + ", type=" + this.f77635c + ")";
    }

    public /* synthetic */ g50(int i10, String str, String str2, String str3) {
        if ((i10 & 1) == 0) {
            this.f77633a = null;
        } else {
            this.f77633a = str;
        }
        if ((i10 & 2) == 0) {
            this.f77634b = null;
        } else {
            this.f77634b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f77635c = null;
        } else {
            this.f77635c = str3;
        }
    }
}
