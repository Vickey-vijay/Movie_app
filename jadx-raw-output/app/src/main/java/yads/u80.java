package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class u80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w80 f83396b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u80)) {
            return false;
        }
        u80 u80Var = (u80) obj;
        return ck.p.e(this.f83395a, u80Var.f83395a) && ck.p.e(this.f83396b, u80Var.f83396b);
    }

    public final int hashCode() {
        return this.f83396b.hashCode() + (this.f83395a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelSdkIntegrationData(sdkVersion=" + this.f83395a + ", sdkIntegrationStatusData=" + this.f83396b + ")";
    }

    public u80(String str, w80 w80Var) {
        this.f83395a = str;
        this.f83396b = w80Var;
    }
}
