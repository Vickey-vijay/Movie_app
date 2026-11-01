package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class b20 implements vj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f75699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f75700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f75701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f75702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e20 f75703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f75704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n03 f75705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f75706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f75707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f75708j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b20)) {
            return false;
        }
        b20 b20Var = (b20) obj;
        return ck.p.e(this.f75699a, b20Var.f75699a) && ck.p.e(this.f75700b, b20Var.f75700b) && ck.p.e(this.f75701c, b20Var.f75701c) && ck.p.e(this.f75702d, b20Var.f75702d) && ck.p.e(this.f75703e, b20Var.f75703e) && ck.p.e(this.f75704f, b20Var.f75704f) && ck.p.e(this.f75705g, b20Var.f75705g) && ck.p.e(this.f75706h, b20Var.f75706h) && this.f75707i == b20Var.f75707i && ck.p.e(this.f75708j, b20Var.f75708j);
    }

    @Override // yads.vj3
    public final Map a() {
        List<x73> list = this.f75702d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (x73 x73Var : list) {
            String str = x73Var.f84470a;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(x73Var.f84471b);
        }
        return linkedHashMap;
    }

    public final int hashCode() {
        int iA = eb.a(this.f75702d, eb.a(this.f75701c, eb.a(this.f75700b, this.f75699a.hashCode() * 31, 31), 31), 31);
        e20 e20Var = this.f75703e;
        int iHashCode = (iA + (e20Var == null ? 0 : e20Var.hashCode())) * 31;
        String str = this.f75704f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        n03 n03Var = this.f75705g;
        int iHashCode3 = (iHashCode2 + (n03Var == null ? 0 : n03Var.hashCode())) * 31;
        String str2 = this.f75706h;
        int iA2 = nd3.a(this.f75707i, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f75708j;
        return iA2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "Creative(mediaFiles=" + this.f75699a + ", interactiveCreativeFiles=" + this.f75700b + ", icons=" + this.f75701c + ", trackingEventsList=" + this.f75702d + ", creativeExtensions=" + this.f75703e + ", clickThroughUrl=" + this.f75704f + ", skipOffset=" + this.f75705g + ", id=" + this.f75706h + ", durationMillis=" + this.f75707i + ", adParameters=" + this.f75708j + ")";
    }

    public b20(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, e20 e20Var, String str, n03 n03Var, String str2, int i10, String str3) {
        this.f75699a = arrayList;
        this.f75700b = arrayList2;
        this.f75701c = arrayList3;
        this.f75702d = arrayList4;
        this.f75703e = e20Var;
        this.f75704f = str;
        this.f75705g = n03Var;
        this.f75706h = str2;
        this.f75707i = i10;
        this.f75708j = str3;
    }
}
