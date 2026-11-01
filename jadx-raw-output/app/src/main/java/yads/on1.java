package yads;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class on1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oj1 f81110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sd3 f81111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f81112c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on1)) {
            return false;
        }
        on1 on1Var = (on1) obj;
        return ck.p.e(this.f81110a, on1Var.f81110a) && ck.p.e(this.f81111b, on1Var.f81111b) && ck.p.e(this.f81112c, on1Var.f81112c);
    }

    public final int hashCode() {
        oj1 oj1Var = this.f81110a;
        int iHashCode = (oj1Var == null ? 0 : oj1Var.hashCode()) * 31;
        sd3 sd3Var = this.f81111b;
        int iHashCode2 = (iHashCode + (sd3Var == null ? 0 : sd3Var.hashCode())) * 31;
        List list = this.f81112c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "MediaValue(media=" + this.f81110a + ", video=" + this.f81111b + ", imageValues=" + this.f81112c + ")";
    }

    public on1(oj1 oj1Var, sd3 sd3Var, List list) {
        this.f81110a = oj1Var;
        this.f81111b = sd3Var;
        this.f81112c = list;
    }
}
