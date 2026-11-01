package yads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class w80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v80 f84123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f84124b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w80)) {
            return false;
        }
        w80 w80Var = (w80) obj;
        return this.f84123a == w80Var.f84123a && ck.p.e(this.f84124b, w80Var.f84124b);
    }

    public final int hashCode() {
        int iHashCode = this.f84123a.hashCode() * 31;
        List list = this.f84124b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "DebugPanelSdkIntegrationStatusData(status=" + this.f84123a + ", messages=" + this.f84124b + ")";
    }

    public w80(v80 v80Var, List list) {
        this.f84123a = v80Var;
        this.f84124b = list;
    }
}
