package yads;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class ny0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f80863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f80864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f80865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f80866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gp2 f80867g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny0)) {
            return false;
        }
        ny0 ny0Var = (ny0) obj;
        return ck.p.e(this.f80861a, ny0Var.f80861a) && ck.p.e(this.f80862b, ny0Var.f80862b) && ck.p.e(this.f80863c, ny0Var.f80863c) && ck.p.e(this.f80864d, ny0Var.f80864d) && ck.p.e(this.f80865e, ny0Var.f80865e) && ck.p.e(this.f80866f, ny0Var.f80866f) && this.f80867g == ny0Var.f80867g;
    }

    public final int hashCode() {
        int iHashCode = this.f80861a.hashCode() * 31;
        String str = this.f80862b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f80863c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f80864d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f80865e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.f80866f;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        gp2 gp2Var = this.f80867g;
        return iHashCode6 + (gp2Var != null ? gp2Var.hashCode() : 0);
    }

    public final String toString() {
        return "FullscreenCacheParams(adUnitId=" + this.f80861a + ", age=" + this.f80862b + ", gender=" + this.f80863c + ", contextQuery=" + this.f80864d + ", contextTags=" + this.f80865e + ", parameters=" + this.f80866f + ", preferredTheme=" + this.f80867g + ")";
    }

    public ny0(String str, String str2, String str3, String str4, List list, Map map, gp2 gp2Var) {
        this.f80861a = str;
        this.f80862b = str2;
        this.f80863c = str3;
        this.f80864d = str4;
        this.f80865e = list;
        this.f80866f = map;
        this.f80867g = gp2Var;
    }
}
