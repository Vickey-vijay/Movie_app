package yads;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class fy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cq2 f77545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f77546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f77548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final if1 f77549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j5 f77550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f77551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f77552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final gc f77553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f77554j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f77555k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f77556l;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy1)) {
            return false;
        }
        fy1 fy1Var = (fy1) obj;
        return this.f77545a == fy1Var.f77545a && ck.p.e(this.f77546b, fy1Var.f77546b) && ck.p.e(this.f77547c, fy1Var.f77547c) && ck.p.e(this.f77548d, fy1Var.f77548d) && ck.p.e(this.f77549e, fy1Var.f77549e) && ck.p.e(this.f77550f, fy1Var.f77550f) && ck.p.e(this.f77551g, fy1Var.f77551g) && ck.p.e(this.f77552h, fy1Var.f77552h) && ck.p.e(this.f77553i, fy1Var.f77553i) && ck.p.e(this.f77554j, fy1Var.f77554j) && ck.p.e(this.f77555k, fy1Var.f77555k) && ck.p.e(this.f77556l, fy1Var.f77556l);
    }

    public final if1 a() {
        return this.f77549e;
    }

    public final int hashCode() {
        int iA = eb.a(this.f77546b, this.f77545a.hashCode() * 31, 31);
        String str = this.f77547c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f77548d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        if1 if1Var = this.f77549e;
        int iHashCode3 = (iHashCode2 + (if1Var == null ? 0 : if1Var.hashCode())) * 31;
        j5 j5Var = this.f77550f;
        int iA2 = eb.a(this.f77552h, eb.a(this.f77551g, (iHashCode3 + (j5Var == null ? 0 : j5Var.f78915b.hashCode())) * 31, 31), 31);
        gc gcVar = this.f77553i;
        int iHashCode4 = (iA2 + (gcVar == null ? 0 : gcVar.hashCode())) * 31;
        String str3 = this.f77554j;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f77555k;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map map = this.f77556l;
        return iHashCode6 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "Native(responseNativeType=" + this.f77545a + ", assets=" + this.f77546b + ", adId=" + this.f77547c + ", info=" + this.f77548d + ", link=" + this.f77549e + ", impressionData=" + this.f77550f + ", renderTrackingUrls=" + this.f77551g + ", showNotices=" + this.f77552h + ", additionalInfo=" + this.f77553i + ", creativeId=" + this.f77554j + ", campaignId=" + this.f77555k + ", analyticsParameters=" + this.f77556l + ")";
    }

    public fy1(cq2 cq2Var, List list, String str, String str2, if1 if1Var, j5 j5Var, List list2, List list3, gc gcVar, String str3, String str4, Map map) {
        this.f77545a = cq2Var;
        this.f77546b = list;
        this.f77547c = str;
        this.f77548d = str2;
        this.f77549e = if1Var;
        this.f77550f = j5Var;
        this.f77551g = list2;
        this.f77552h = list3;
        this.f77553i = gcVar;
        this.f77554j = str3;
        this.f77555k = str4;
        this.f77556l = map;
    }
}
