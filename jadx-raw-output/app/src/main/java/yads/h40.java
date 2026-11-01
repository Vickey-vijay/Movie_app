package yads;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@xk.f
public final class h40 {
    public static final g40 Companion = new g40();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final xk.b[] f78055f = {null, null, new bl.f(n50.f80560a), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f78058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f78059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f78060e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h40)) {
            return false;
        }
        h40 h40Var = (h40) obj;
        return ck.p.e(this.f78056a, h40Var.f78056a) && ck.p.e(this.f78057b, h40Var.f78057b) && ck.p.e(this.f78058c, h40Var.f78058c) && ck.p.e(this.f78059d, h40Var.f78059d) && ck.p.e(this.f78060e, h40Var.f78060e);
    }

    public /* synthetic */ h40(int i10, String str, String str2, List list, String str3, String str4) {
        if (6 != (i10 & 6)) {
            bl.o1.a(i10, 6, f40.f77294a.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f78056a = null;
        } else {
            this.f78056a = str;
        }
        this.f78057b = str2;
        this.f78058c = list;
        if ((i10 & 8) == 0) {
            this.f78059d = null;
        } else {
            this.f78059d = str3;
        }
        if ((i10 & 16) == 0) {
            this.f78060e = null;
        } else {
            this.f78060e = str4;
        }
    }

    public final int hashCode() {
        String str = this.f78056a;
        int iA = eb.a(this.f78058c, k4.a(this.f78057b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.f78059d;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f78060e;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "DebugPanelAdUnitBiddingMediation(adapter=" + this.f78056a + ", networkName=" + this.f78057b + ", biddingParameters=" + this.f78058c + ", adUnitId=" + this.f78059d + ", networkAdUnitIdName=" + this.f78060e + ")";
    }
}
