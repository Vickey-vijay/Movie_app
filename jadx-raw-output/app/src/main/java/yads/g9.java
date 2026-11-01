package yads;

import android.location.Location;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class g9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f77699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f77700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Location f77701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f77702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f77703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f77704i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final gp2 f77705j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f77706k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f77707l;

    public static g9 a(g9 g9Var, Map map, String str, int i10) {
        return new g9(g9Var.f77696a, g9Var.f77697b, g9Var.f77698c, g9Var.f77699d, g9Var.f77700e, g9Var.f77701f, (i10 & 64) != 0 ? g9Var.f77702g : map, g9Var.f77703h, g9Var.f77704i, g9Var.f77705j, g9Var.f77706k, (i10 & 2048) != 0 ? g9Var.f77707l : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9)) {
            return false;
        }
        g9 g9Var = (g9) obj;
        return ck.p.e(this.f77696a, g9Var.f77696a) && ck.p.e(this.f77697b, g9Var.f77697b) && ck.p.e(this.f77698c, g9Var.f77698c) && ck.p.e(this.f77699d, g9Var.f77699d) && ck.p.e(this.f77700e, g9Var.f77700e) && ck.p.e(this.f77701f, g9Var.f77701f) && ck.p.e(this.f77702g, g9Var.f77702g) && ck.p.e(this.f77703h, g9Var.f77703h) && ck.p.e(this.f77704i, g9Var.f77704i) && this.f77705j == g9Var.f77705j && this.f77706k == g9Var.f77706k && ck.p.e(this.f77707l, g9Var.f77707l);
    }

    public final int hashCode() {
        int iHashCode = this.f77696a.hashCode() * 31;
        String str = this.f77697b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f77698c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f77699d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f77700e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Location location = this.f77701f;
        int iHashCode6 = (iHashCode5 + (location == null ? 0 : location.hashCode())) * 31;
        Map map = this.f77702g;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        String str4 = this.f77703h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f77704i;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        gp2 gp2Var = this.f77705j;
        int iHashCode10 = (Boolean.hashCode(this.f77706k) + ((iHashCode9 + (gp2Var == null ? 0 : gp2Var.hashCode())) * 31)) * 31;
        String str6 = this.f77707l;
        return iHashCode10 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        return "AdRequestData(adUnitId=" + this.f77696a + ", age=" + this.f77697b + ", gender=" + this.f77698c + ", contextQuery=" + this.f77699d + ", contextTags=" + this.f77700e + ", location=" + this.f77701f + ", parameters=" + this.f77702g + ", openBiddingData=" + this.f77703h + ", readyResponse=" + this.f77704i + ", preferredTheme=" + this.f77705j + ", shouldLoadImagesAutomatically=" + this.f77706k + ", preloadType=" + this.f77707l + ")";
    }

    public g9(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, String str6, gp2 gp2Var, boolean z10, String str7) {
        this.f77696a = str;
        this.f77697b = str2;
        this.f77698c = str3;
        this.f77699d = str4;
        this.f77700e = list;
        this.f77701f = location;
        this.f77702g = map;
        this.f77703h = str5;
        this.f77704i = str6;
        this.f77705j = gp2Var;
        this.f77706k = z10;
        this.f77707l = str7;
    }
}
