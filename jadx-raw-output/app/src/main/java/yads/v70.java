package yads;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class v70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f83791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m50 f83792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u80 f83793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b40 f83794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d50 f83795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t50 f83796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u70 f83797g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v70)) {
            return false;
        }
        v70 v70Var = (v70) obj;
        return ck.p.e(this.f83791a, v70Var.f83791a) && ck.p.e(this.f83792b, v70Var.f83792b) && ck.p.e(this.f83793c, v70Var.f83793c) && ck.p.e(this.f83794d, v70Var.f83794d) && ck.p.e(this.f83795e, v70Var.f83795e) && ck.p.e(this.f83796f, v70Var.f83796f) && ck.p.e(this.f83797g, v70Var.f83797g);
    }

    public final int hashCode() {
        return this.f83797g.hashCode() + ((this.f83796f.hashCode() + eb.a(this.f83795e.f76578a, (this.f83794d.hashCode() + ((this.f83793c.hashCode() + ((this.f83792b.hashCode() + (this.f83791a.hashCode() * 31)) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "DebugPanelFeedData(alertsData=" + this.f83791a + ", appData=" + this.f83792b + ", sdkIntegrationData=" + this.f83793c + ", adNetworkSettingsData=" + this.f83794d + ", adaptersData=" + this.f83795e + ", consentsData=" + this.f83796f + ", debugErrorIndicatorData=" + this.f83797g + ")";
    }

    public v70(List list, m50 m50Var, u80 u80Var, b40 b40Var, d50 d50Var, t50 t50Var, u70 u70Var) {
        this.f83791a = list;
        this.f83792b = m50Var;
        this.f83793c = u80Var;
        this.f83794d = b40Var;
        this.f83795e = d50Var;
        this.f83796f = t50Var;
        this.f83797g = u70Var;
    }
}
