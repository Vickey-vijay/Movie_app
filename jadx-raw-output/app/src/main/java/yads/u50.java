package yads;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class u50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m50 f83376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t80 f83377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b40 f83378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d50 f83379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t50 f83380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u70 f83381f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f83382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f83383h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u50)) {
            return false;
        }
        u50 u50Var = (u50) obj;
        return ck.p.e(this.f83376a, u50Var.f83376a) && ck.p.e(this.f83377b, u50Var.f83377b) && ck.p.e(this.f83378c, u50Var.f83378c) && ck.p.e(this.f83379d, u50Var.f83379d) && ck.p.e(this.f83380e, u50Var.f83380e) && ck.p.e(this.f83381f, u50Var.f83381f) && ck.p.e(this.f83382g, u50Var.f83382g) && ck.p.e(this.f83383h, u50Var.f83383h);
    }

    public final int hashCode() {
        return this.f83383h.hashCode() + eb.a(this.f83382g, (this.f83381f.hashCode() + ((this.f83380e.hashCode() + eb.a(this.f83379d.f76578a, (this.f83378c.hashCode() + ((this.f83377b.hashCode() + (this.f83376a.hashCode() * 31)) * 31)) * 31, 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DebugPanelData(appData=" + this.f83376a + ", sdkData=" + this.f83377b + ", networkSettingsData=" + this.f83378c + ", adaptersData=" + this.f83379d + ", consentsData=" + this.f83380e + ", debugErrorIndicatorData=" + this.f83381f + ", adUnits=" + this.f83382g + ", alerts=" + this.f83383h + ")";
    }

    public u50(m50 m50Var, t80 t80Var, b40 b40Var, d50 d50Var, t50 t50Var, u70 u70Var, List list, List list2) {
        this.f83376a = m50Var;
        this.f83377b = t80Var;
        this.f83378c = b40Var;
        this.f83379d = d50Var;
        this.f83380e = t50Var;
        this.f83381f = u70Var;
        this.f83382g = list;
        this.f83383h = list2;
    }
}
