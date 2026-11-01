package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class dp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e00 f76762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a03 f76763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f76764c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp)) {
            return false;
        }
        dp dpVar = (dp) obj;
        return this.f76762a == dpVar.f76762a && ck.p.e(this.f76763b, dpVar.f76763b) && ck.p.e(this.f76764c, dpVar.f76764c);
    }

    public final int hashCode() {
        e00 e00Var = this.f76762a;
        int iHashCode = (e00Var == null ? 0 : e00Var.hashCode()) * 31;
        a03 a03Var = this.f76763b;
        return this.f76764c.hashCode() + ((iHashCode + (a03Var != null ? a03Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "BidderTokenRequestData(adType=" + this.f76762a + ", sizeInfo=" + this.f76763b + ", parameters=" + this.f76764c + ")";
    }

    public dp(e00 e00Var, a03 a03Var, Map map) {
        this.f76762a = e00Var;
        this.f76763b = a03Var;
        this.f76764c = map;
    }
}
