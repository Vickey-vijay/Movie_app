package yads;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class d12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f76509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f76510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f76511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j5 f76512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f76513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f76514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f76515g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f76516h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final my2 f76517i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c7 f76518j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d12)) {
            return false;
        }
        d12 d12Var = (d12) obj;
        return ck.p.e(this.f76509a, d12Var.f76509a) && ck.p.e(this.f76510b, d12Var.f76510b) && ck.p.e(this.f76511c, d12Var.f76511c) && ck.p.e(this.f76512d, d12Var.f76512d) && ck.p.e(this.f76513e, d12Var.f76513e) && ck.p.e(this.f76514f, d12Var.f76514f) && ck.p.e(this.f76515g, d12Var.f76515g) && ck.p.e(this.f76516h, d12Var.f76516h) && ck.p.e(this.f76517i, d12Var.f76517i) && ck.p.e(this.f76518j, d12Var.f76518j);
    }

    public final List a() {
        return this.f76514f;
    }

    public final my2 b() {
        return this.f76517i;
    }

    public final int hashCode() {
        int iA = eb.a(this.f76511c, eb.a(this.f76510b, this.f76509a.hashCode() * 31, 31), 31);
        j5 j5Var = this.f76512d;
        int iA2 = eb.a(this.f76515g, eb.a(this.f76514f, (this.f76513e.hashCode() + ((iA + (j5Var == null ? 0 : j5Var.f78915b.hashCode())) * 31)) * 31, 31), 31);
        String str = this.f76516h;
        int iHashCode = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
        my2 my2Var = this.f76517i;
        int iHashCode2 = (iHashCode + (my2Var == null ? 0 : my2Var.hashCode())) * 31;
        c7 c7Var = this.f76518j;
        return iHashCode2 + (c7Var != null ? c7Var.hashCode() : 0);
    }

    public final String toString() {
        return "NativeAdResponse(nativeAds=" + this.f76509a + ", assets=" + this.f76510b + ", renderTrackingUrls=" + this.f76511c + ", impressionData=" + this.f76512d + ", properties=" + this.f76513e + ", divKitDesigns=" + this.f76514f + ", showNotices=" + this.f76515g + ", version=" + this.f76516h + ", settings=" + this.f76517i + ", adPod=" + this.f76518j + ")";
    }

    public d12(List list, List list2, List list3, j5 j5Var, Map map, List list4, List list5, String str, my2 my2Var, c7 c7Var) {
        this.f76509a = list;
        this.f76510b = list2;
        this.f76511c = list3;
        this.f76512d = j5Var;
        this.f76513e = map;
        this.f76514f = list4;
        this.f76515g = list5;
        this.f76516h = str;
        this.f76517i = my2Var;
        this.f76518j = c7Var;
    }
}
