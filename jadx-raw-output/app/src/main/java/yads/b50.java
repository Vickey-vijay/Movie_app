package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class b50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f75727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f75728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f75729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f75730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a50 f75731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f75732h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b50)) {
            return false;
        }
        b50 b50Var = (b50) obj;
        return ck.p.e(this.f75725a, b50Var.f75725a) && ck.p.e(this.f75726b, b50Var.f75726b) && this.f75727c == b50Var.f75727c && ck.p.e(this.f75728d, b50Var.f75728d) && ck.p.e(this.f75729e, b50Var.f75729e) && ck.p.e(this.f75730f, b50Var.f75730f) && ck.p.e(this.f75731g, b50Var.f75731g) && ck.p.e(this.f75732h, b50Var.f75732h);
    }

    public final a50 a() {
        return this.f75731g;
    }

    public final String b() {
        return this.f75728d;
    }

    public final String c() {
        return this.f75729e;
    }

    public final String d() {
        return this.f75726b;
    }

    public final String e() {
        return this.f75725a;
    }

    public final String f() {
        return this.f75730f;
    }

    public final int hashCode() {
        int iHashCode = this.f75725a.hashCode() * 31;
        String str = this.f75726b;
        int iHashCode2 = (Boolean.hashCode(this.f75727c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.f75728d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f75729e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f75730f;
        int iHashCode5 = (this.f75731g.hashCode() + ((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        List list = this.f75732h;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "DebugPanelAdapterData(name=" + this.f75725a + ", logoUrl=" + this.f75726b + ", adapterIntegrationStatus=" + this.f75727c + ", adapterVersion=" + this.f75728d + ", latestAdapterVersion=" + this.f75729e + ", sdkVersion=" + this.f75730f + ", adapterStatus=" + this.f75731g + ", formats=" + this.f75732h + ")";
    }

    public b50(String str, String str2, boolean z10, String str3, String str4, String str5, a50 a50Var, ArrayList arrayList) {
        this.f75725a = str;
        this.f75726b = str2;
        this.f75727c = z10;
        this.f75728d = str3;
        this.f75729e = str4;
        this.f75730f = str5;
        this.f75731g = a50Var;
        this.f75732h = arrayList;
    }
}
