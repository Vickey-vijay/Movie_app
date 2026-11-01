package yads;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@xk.f
public final class u40 {
    public static final t40 Companion = new t40();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final xk.b[] f83359g = {null, null, new bl.f(la0.f79737a), null, null, new bl.f(fa0.f77340a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f83362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f83363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ka0 f83364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f83365f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u40)) {
            return false;
        }
        u40 u40Var = (u40) obj;
        return ck.p.e(this.f83360a, u40Var.f83360a) && ck.p.e(this.f83361b, u40Var.f83361b) && ck.p.e(this.f83362c, u40Var.f83362c) && ck.p.e(this.f83363d, u40Var.f83363d) && ck.p.e(this.f83364e, u40Var.f83364e) && ck.p.e(this.f83365f, u40Var.f83365f);
    }

    public /* synthetic */ u40(int i10, String str, String str2, List list, String str3, ka0 ka0Var, List list2) {
        if (54 != (i10 & 54)) {
            bl.o1.a(i10, 54, s40.f82517a.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f83360a = null;
        } else {
            this.f83360a = str;
        }
        this.f83361b = str2;
        this.f83362c = list;
        if ((i10 & 8) == 0) {
            this.f83363d = null;
        } else {
            this.f83363d = str3;
        }
        this.f83364e = ka0Var;
        this.f83365f = list2;
    }

    public final int hashCode() {
        String str = this.f83360a;
        int iA = eb.a(this.f83362c, k4.a(this.f83361b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.f83363d;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        ka0 ka0Var = this.f83364e;
        return this.f83365f.hashCode() + ((iHashCode + (ka0Var != null ? ka0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelAdUnitWaterfallMediation(adapter=" + this.f83360a + ", networkName=" + this.f83361b + ", waterfallParameters=" + this.f83362c + ", networkAdUnitIdName=" + this.f83363d + ", currency=" + this.f83364e + ", cpmFloors=" + this.f83365f + ")";
    }
}
