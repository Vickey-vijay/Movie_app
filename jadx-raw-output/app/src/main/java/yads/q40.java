package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class q40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f81700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f81701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f81702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p40 f81703f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q40)) {
            return false;
        }
        q40 q40Var = (q40) obj;
        return ck.p.e(this.f81698a, q40Var.f81698a) && ck.p.e(this.f81699b, q40Var.f81699b) && ck.p.e(this.f81700c, q40Var.f81700c) && ck.p.e(this.f81701d, q40Var.f81701d) && ck.p.e(this.f81702e, q40Var.f81702e) && ck.p.e(this.f81703f, q40Var.f81703f);
    }

    public final int hashCode() {
        String str = this.f81698a;
        int iA = eb.a(this.f81700c, k4.a(this.f81699b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.f81701d;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f81702e;
        return this.f81703f.hashCode() + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelAdUnitMediationAdapterData(logoUrl=" + this.f81698a + ", adapterName=" + this.f81699b + ", parameters=" + this.f81700c + ", adUnitId=" + this.f81701d + ", networkAdUnitIdName=" + this.f81702e + ", type=" + this.f81703f + ")";
    }

    public q40(String str, String str2, ArrayList arrayList, String str3, String str4, p40 p40Var) {
        this.f81698a = str;
        this.f81699b = str2;
        this.f81700c = arrayList;
        this.f81701d = str3;
        this.f81702e = str4;
        this.f81703f = p40Var;
    }
}
