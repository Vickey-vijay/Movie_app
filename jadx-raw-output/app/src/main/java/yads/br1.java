package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@xk.f
public final class br1 {
    public static final xq1 Companion = new xq1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final xk.b[] f75933e = {null, null, null, new bl.f(yq1.f85088a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f75937d;

    public /* synthetic */ br1(int i10, String str, String str2, String str3, List list) {
        if (15 != (i10 & 15)) {
            bl.o1.a(i10, 15, wq1.f84294a.getDescriptor());
        }
        this.f75934a = str;
        this.f75935b = str2;
        this.f75936c = str3;
        this.f75937d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br1)) {
            return false;
        }
        br1 br1Var = (br1) obj;
        return ck.p.e(this.f75934a, br1Var.f75934a) && ck.p.e(this.f75935b, br1Var.f75935b) && ck.p.e(this.f75936c, br1Var.f75936c) && ck.p.e(this.f75937d, br1Var.f75937d);
    }

    public br1(String str, String str2, String str3, ArrayList arrayList) {
        this.f75934a = str;
        this.f75935b = str2;
        this.f75936c = str3;
        this.f75937d = arrayList;
    }

    public final int hashCode() {
        int iA = k4.a(this.f75935b, this.f75934a.hashCode() * 31, 31);
        String str = this.f75936c;
        return this.f75937d.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "MediationNetworkData(name=" + this.f75934a + ", id=" + this.f75935b + ", version=" + this.f75936c + ", adapters=" + this.f75937d + ")";
    }
}
