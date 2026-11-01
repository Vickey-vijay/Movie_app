package yads;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class o40 implements p40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ka0 f80931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f80932b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o40)) {
            return false;
        }
        o40 o40Var = (o40) obj;
        return ck.p.e(this.f80931a, o40Var.f80931a) && ck.p.e(this.f80932b, o40Var.f80932b);
    }

    public final int hashCode() {
        ka0 ka0Var = this.f80931a;
        return this.f80932b.hashCode() + ((ka0Var == null ? 0 : ka0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "Waterfall(currency=" + this.f80931a + ", cpmFloors=" + this.f80932b + ")";
    }

    public o40(ka0 ka0Var, List list) {
        this.f80931a = ka0Var;
        this.f80932b = list;
    }
}
