package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class ud3 implements vj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f83421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f83422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f83423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final de3 f83424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f83425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f83426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f83427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f83428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f83429i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ol3 f83430j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Integer f83431k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f83432l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ip3 f83433m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f83434n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Map f83435o;

    public ud3(boolean z10, ArrayList arrayList, LinkedHashMap linkedHashMap, de3 de3Var, String str, String str2, String str3, String str4, String str5, ol3 ol3Var, Integer num, String str6, ip3 ip3Var, ArrayList arrayList2, Map map) {
        this.f83421a = z10;
        this.f83422b = arrayList;
        this.f83423c = linkedHashMap;
        this.f83424d = de3Var;
        this.f83425e = str;
        this.f83426f = str2;
        this.f83427g = str3;
        this.f83428h = str4;
        this.f83429i = str5;
        this.f83430j = ol3Var;
        this.f83431k = num;
        this.f83432l = str6;
        this.f83433m = ip3Var;
        this.f83434n = arrayList2;
        this.f83435o = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud3)) {
            return false;
        }
        ud3 ud3Var = (ud3) obj;
        return this.f83421a == ud3Var.f83421a && ck.p.e(this.f83422b, ud3Var.f83422b) && ck.p.e(this.f83423c, ud3Var.f83423c) && ck.p.e(this.f83424d, ud3Var.f83424d) && ck.p.e(this.f83425e, ud3Var.f83425e) && ck.p.e(this.f83426f, ud3Var.f83426f) && ck.p.e(this.f83427g, ud3Var.f83427g) && ck.p.e(this.f83428h, ud3Var.f83428h) && ck.p.e(this.f83429i, ud3Var.f83429i) && ck.p.e(this.f83430j, ud3Var.f83430j) && ck.p.e(this.f83431k, ud3Var.f83431k) && ck.p.e(this.f83432l, ud3Var.f83432l) && ck.p.e(this.f83433m, ud3Var.f83433m) && ck.p.e(this.f83434n, ud3Var.f83434n) && ck.p.e(this.f83435o, ud3Var.f83435o);
    }

    @Override // yads.vj3
    public final Map a() {
        return this.f83435o;
    }

    public final int hashCode() {
        int iHashCode = (this.f83424d.hashCode() + ((this.f83423c.hashCode() + eb.a(this.f83422b, Boolean.hashCode(this.f83421a) * 31, 31)) * 31)) * 31;
        String str = this.f83425e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f83426f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f83427g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f83428h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f83429i;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ol3 ol3Var = this.f83430j;
        int iHashCode7 = (iHashCode6 + (ol3Var == null ? 0 : ol3Var.f81099a.hashCode())) * 31;
        Integer num = this.f83431k;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.f83432l;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ip3 ip3Var = this.f83433m;
        return this.f83435o.hashCode() + eb.a(this.f83434n, (iHashCode9 + (ip3Var != null ? ip3Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "VideoAd(isWrapper=" + this.f83421a + ", creatives=" + this.f83422b + ", rawTrackingEvents=" + this.f83423c + ", videoAdExtensions=" + this.f83424d + ", adSystem=" + this.f83425e + ", adTitle=" + this.f83426f + ", description=" + this.f83427g + ", survey=" + this.f83428h + ", vastAdTagUri=" + this.f83429i + ", viewableImpression=" + this.f83430j + ", sequence=" + this.f83431k + ", id=" + this.f83432l + ", wrapperConfiguration=" + this.f83433m + ", adVerifications=" + this.f83434n + ", trackingEvents=" + this.f83435o + ")";
    }
}
