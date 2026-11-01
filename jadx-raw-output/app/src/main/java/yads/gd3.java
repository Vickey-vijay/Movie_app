package yads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class gd3 implements vj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ae1 f77772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f77774d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd3)) {
            return false;
        }
        gd3 gd3Var = (gd3) obj;
        return ck.p.e(this.f77771a, gd3Var.f77771a) && ck.p.e(this.f77772b, gd3Var.f77772b) && ck.p.e(this.f77773c, gd3Var.f77773c) && ck.p.e(this.f77774d, gd3Var.f77774d);
    }

    @Override // yads.vj3
    public final Map a() {
        return Collections.unmodifiableMap(this.f77774d);
    }

    public final int hashCode() {
        int iHashCode = this.f77771a.hashCode() * 31;
        ae1 ae1Var = this.f77772b;
        int iHashCode2 = (iHashCode + (ae1Var == null ? 0 : ae1Var.hashCode())) * 31;
        String str = this.f77773c;
        return this.f77774d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Verification(vendor=" + this.f77771a + ", javaScriptResource=" + this.f77772b + ", parameters=" + this.f77773c + ", events=" + this.f77774d + ")";
    }

    public gd3(String str, ae1 ae1Var, String str2, HashMap map) {
        this.f77771a = str;
        this.f77772b = ae1Var;
        this.f77773c = str2;
        this.f77774d = map;
    }
}
