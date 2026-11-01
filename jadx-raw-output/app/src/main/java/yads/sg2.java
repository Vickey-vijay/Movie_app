package yads;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class sg2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f82635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f82636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bb0 f82637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f82638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f82639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f82640h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f82641i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg2)) {
            return false;
        }
        sg2 sg2Var = (sg2) obj;
        return ck.p.e(this.f82633a, sg2Var.f82633a) && ck.p.e(this.f82634b, sg2Var.f82634b) && ck.p.e(this.f82635c, sg2Var.f82635c) && ck.p.e(this.f82636d, sg2Var.f82636d) && this.f82637e == sg2Var.f82637e && ck.p.e(this.f82638f, sg2Var.f82638f) && ck.p.e(this.f82639g, sg2Var.f82639g) && ck.p.e(this.f82640h, sg2Var.f82640h) && ck.p.e(this.f82641i, sg2Var.f82641i);
    }

    public final int hashCode() {
        int iA = k4.a(this.f82634b, this.f82633a.hashCode() * 31, 31);
        Map map = this.f82635c;
        int iHashCode = (iA + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.f82636d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        bb0 bb0Var = this.f82637e;
        int iHashCode3 = (iHashCode2 + (bb0Var == null ? 0 : bb0Var.hashCode())) * 31;
        List list = this.f82638f;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f82639g;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.f82640h;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f82641i;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "PreferredPackage(packageName=" + this.f82633a + ", url=" + this.f82634b + ", extras=" + this.f82635c + ", flags=" + this.f82636d + ", launchMode=" + this.f82637e + ", trackingUrls=" + this.f82638f + ", fallbackTrackingUrls=" + this.f82639g + ", deeplinkType=" + this.f82640h + ", className=" + this.f82641i + ")";
    }

    public sg2(String str, String str2, Map map, Integer num, bb0 bb0Var, List list, List list2, String str3, String str4) {
        this.f82633a = str;
        this.f82634b = str2;
        this.f82635c = map;
        this.f82636d = num;
        this.f82637e = bb0Var;
        this.f82638f = list;
        this.f82639g = list2;
        this.f82640h = str3;
        this.f82641i = str4;
    }
}
