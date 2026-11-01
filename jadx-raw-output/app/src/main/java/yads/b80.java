package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class b80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m50 f75759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t80 f75760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f75761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t50 f75762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u70 f75763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c80 f75764f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b80)) {
            return false;
        }
        b80 b80Var = (b80) obj;
        return ck.p.e(this.f75759a, b80Var.f75759a) && ck.p.e(this.f75760b, b80Var.f75760b) && ck.p.e(this.f75761c, b80Var.f75761c) && ck.p.e(this.f75762d, b80Var.f75762d) && ck.p.e(this.f75763e, b80Var.f75763e) && ck.p.e(this.f75764f, b80Var.f75764f);
    }

    public final int hashCode() {
        int iHashCode = (this.f75763e.hashCode() + ((this.f75762d.hashCode() + eb.a(this.f75761c, (this.f75760b.hashCode() + (this.f75759a.hashCode() * 31)) * 31, 31)) * 31)) * 31;
        c80 c80Var = this.f75764f;
        return iHashCode + (c80Var == null ? 0 : c80Var.hashCode());
    }

    public final String toString() {
        return "DebugPanelLocalData(appData=" + this.f75759a + ", sdkData=" + this.f75760b + ", mediationNetworksData=" + this.f75761c + ", consentsData=" + this.f75762d + ", debugErrorIndicatorData=" + this.f75763e + ", logsData=" + this.f75764f + ")";
    }

    public b80(m50 m50Var, t80 t80Var, ArrayList arrayList, t50 t50Var, u70 u70Var, c80 c80Var) {
        this.f75759a = m50Var;
        this.f75760b = t80Var;
        this.f75761c = arrayList;
        this.f75762d = t50Var;
        this.f75763e = u70Var;
        this.f75764f = c80Var;
    }
}
