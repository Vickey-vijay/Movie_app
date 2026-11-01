package yads;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
@xk.f
public final class m80 {
    public static final l80 Companion = new l80();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final xk.b[] f80123g = {null, null, new bl.f(wq1.f84294a), null, new bl.f(xu1.f84694a), new bl.f(fu1.f77496a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m50 f80124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t80 f80125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f80126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t50 f80127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f80128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f80129f;

    public /* synthetic */ m80(int i10, m50 m50Var, t80 t80Var, List list, t50 t50Var, List list2, List list3) {
        if (63 != (i10 & 63)) {
            bl.o1.a(i10, 63, k80.f79327a.getDescriptor());
        }
        this.f80124a = m50Var;
        this.f80125b = t80Var;
        this.f80126c = list;
        this.f80127d = t50Var;
        this.f80128e = list2;
        this.f80129f = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m80)) {
            return false;
        }
        m80 m80Var = (m80) obj;
        return ck.p.e(this.f80124a, m80Var.f80124a) && ck.p.e(this.f80125b, m80Var.f80125b) && ck.p.e(this.f80126c, m80Var.f80126c) && ck.p.e(this.f80127d, m80Var.f80127d) && ck.p.e(this.f80128e, m80Var.f80128e) && ck.p.e(this.f80129f, m80Var.f80129f);
    }

    public m80(m50 m50Var, t80 t80Var, List list, t50 t50Var, List list2, List list3) {
        this.f80124a = m50Var;
        this.f80125b = t80Var;
        this.f80126c = list;
        this.f80127d = t50Var;
        this.f80128e = list2;
        this.f80129f = list3;
    }

    public final int hashCode() {
        return this.f80129f.hashCode() + eb.a(this.f80128e, (this.f80127d.hashCode() + eb.a(this.f80126c, (this.f80125b.hashCode() + (this.f80124a.hashCode() * 31)) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        return "DebugPanelReportData(appData=" + this.f80124a + ", sdkData=" + this.f80125b + ", networksData=" + this.f80126c + ", consentsData=" + this.f80127d + ", sdkLogs=" + this.f80128e + ", networkLogs=" + this.f80129f + ")";
    }
}
