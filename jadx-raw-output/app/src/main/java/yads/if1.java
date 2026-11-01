package yads;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class if1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f78621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dr0 f78622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f78623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f78624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f78625e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if1)) {
            return false;
        }
        if1 if1Var = (if1) obj;
        return ck.p.e(this.f78621a, if1Var.f78621a) && ck.p.e(this.f78622b, if1Var.f78622b) && ck.p.e(this.f78623c, if1Var.f78623c) && ck.p.e(this.f78624d, if1Var.f78624d) && this.f78625e == if1Var.f78625e;
    }

    public final int hashCode() {
        List list = this.f78621a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        dr0 dr0Var = this.f78622b;
        int iA = eb.a(this.f78623c, (iHashCode + (dr0Var == null ? 0 : dr0Var.hashCode())) * 31, 31);
        String str = this.f78624d;
        return Long.hashCode(this.f78625e) + ((iA + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Link(actions=" + this.f78621a + ", falseClick=" + this.f78622b + ", trackingUrls=" + this.f78623c + ", url=" + this.f78624d + ", clickableDelay=" + this.f78625e + ")";
    }

    public if1(List list, dr0 dr0Var, List list2, String str, long j10) {
        this.f78621a = list;
        this.f78622b = dr0Var;
        this.f78623c = list2;
        this.f78624d = str;
        this.f78625e = j10;
    }
}
