package yads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@xk.f
public final class j80 {
    public static final i80 Companion = new i80();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final xk.b[] f78937h = {null, null, null, null, new bl.f(e50.f76919a), new bl.f(c40.f76152a), new bl.f(e80.f76974a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f78941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f78942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f78943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f78944g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j80)) {
            return false;
        }
        j80 j80Var = (j80) obj;
        return ck.p.e(this.f78938a, j80Var.f78938a) && ck.p.e(this.f78939b, j80Var.f78939b) && ck.p.e(this.f78940c, j80Var.f78940c) && ck.p.e(this.f78941d, j80Var.f78941d) && ck.p.e(this.f78942e, j80Var.f78942e) && ck.p.e(this.f78943f, j80Var.f78943f) && ck.p.e(this.f78944g, j80Var.f78944g);
    }

    public /* synthetic */ j80(int i10, String str, String str2, String str3, String str4, List list, List list2, List list3) {
        if (64 != (i10 & 64)) {
            bl.o1.a(i10, 64, h80.f78094a.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f78938a = null;
        } else {
            this.f78938a = str;
        }
        if ((i10 & 2) == 0) {
            this.f78939b = null;
        } else {
            this.f78939b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f78940c = null;
        } else {
            this.f78940c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f78941d = null;
        } else {
            this.f78941d = str4;
        }
        if ((i10 & 16) == 0) {
            this.f78942e = null;
        } else {
            this.f78942e = list;
        }
        if ((i10 & 32) == 0) {
            this.f78943f = null;
        } else {
            this.f78943f = list2;
        }
        this.f78944g = list3;
    }

    public final int hashCode() {
        String str = this.f78938a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f78939b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f78940c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f78941d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.f78942e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f78943f;
        return this.f78944g.hashCode() + ((iHashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelRemoteData(pageId=" + this.f78938a + ", latestSdkVersion=" + this.f78939b + ", appAdsTxtUrl=" + this.f78940c + ", appStatus=" + this.f78941d + ", alerts=" + this.f78942e + ", adUnits=" + this.f78943f + ", mediationNetworks=" + this.f78944g + ")";
    }
}
