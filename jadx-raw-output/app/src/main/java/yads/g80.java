package yads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@xk.f
public final class g80 {
    public static final f80 Companion = new f80();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final xk.b[] f77684g = {null, null, null, null, new bl.f(bl.d2.f5397a), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f77688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f77689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f77690f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g80)) {
            return false;
        }
        g80 g80Var = (g80) obj;
        return ck.p.e(this.f77685a, g80Var.f77685a) && ck.p.e(this.f77686b, g80Var.f77686b) && ck.p.e(this.f77687c, g80Var.f77687c) && ck.p.e(this.f77688d, g80Var.f77688d) && ck.p.e(this.f77689e, g80Var.f77689e) && ck.p.e(this.f77690f, g80Var.f77690f);
    }

    public /* synthetic */ g80(int i10, String str, String str2, String str3, String str4, List list, String str5) {
        if (18 != (i10 & 18)) {
            bl.o1.a(i10, 18, e80.f76974a.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f77685a = null;
        } else {
            this.f77685a = str;
        }
        this.f77686b = str2;
        if ((i10 & 4) == 0) {
            this.f77687c = null;
        } else {
            this.f77687c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f77688d = null;
        } else {
            this.f77688d = str4;
        }
        this.f77689e = list;
        if ((i10 & 32) == 0) {
            this.f77690f = null;
        } else {
            this.f77690f = str5;
        }
    }

    public final int hashCode() {
        String str = this.f77685a;
        int iA = k4.a(this.f77686b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.f77687c;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f77688d;
        int iA2 = eb.a(this.f77689e, (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.f77690f;
        return iA2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "DebugPanelMediationNetwork(id=" + this.f77685a + ", name=" + this.f77686b + ", logoUrl=" + this.f77687c + ", adapterStatus=" + this.f77688d + ", adapters=" + this.f77689e + ", latestAdapterVersion=" + this.f77690f + ")";
    }
}
