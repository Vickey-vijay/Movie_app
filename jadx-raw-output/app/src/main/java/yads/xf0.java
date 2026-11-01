package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class xf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f84574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f84575e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf0)) {
            return false;
        }
        xf0 xf0Var = (xf0) obj;
        return ck.p.e(this.f84571a, xf0Var.f84571a) && ck.p.e(this.f84572b, xf0Var.f84572b) && ck.p.e(this.f84573c, xf0Var.f84573c) && ck.p.e(this.f84574d, xf0Var.f84574d) && ck.p.e(this.f84575e, xf0Var.f84575e);
    }

    public final int hashCode() {
        int iA = k4.a(this.f84573c, k4.a(this.f84572b, this.f84571a.hashCode() * 31, 31), 31);
        List list = this.f84574d;
        int iHashCode = (iA + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.f84575e;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "Design(type=" + this.f84571a + ", target=" + this.f84572b + ", layout=" + this.f84573c + ", images=" + this.f84574d + ", analyticsParameters=" + this.f84575e + ")";
    }

    public xf0(String str, String str2, String str3, ArrayList arrayList, LinkedHashMap linkedHashMap) {
        this.f84571a = str;
        this.f84572b = str2;
        this.f84573c = str3;
        this.f84574d = arrayList;
        this.f84575e = linkedHashMap;
    }
}
