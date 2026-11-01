package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class bl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final al3 f75885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final af1 f75886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jj1 f75887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f75888d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl3)) {
            return false;
        }
        bl3 bl3Var = (bl3) obj;
        return ck.p.e(this.f75885a, bl3Var.f75885a) && ck.p.e(this.f75886b, bl3Var.f75886b) && ck.p.e(this.f75887c, bl3Var.f75887c) && ck.p.e(this.f75888d, bl3Var.f75888d);
    }

    public final int hashCode() {
        return this.f75888d.hashCode() + ((this.f75887c.hashCode() + ((this.f75886b.hashCode() + (this.f75885a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ViewSizeInfo(view=" + this.f75885a + ", layoutParams=" + this.f75886b + ", measured=" + this.f75887c + ", additionalInfo=" + this.f75888d + ")";
    }

    public bl3(al3 al3Var, af1 af1Var, jj1 jj1Var, Map map) {
        this.f75885a = al3Var;
        this.f75886b = af1Var;
        this.f75887c = jj1Var;
        this.f75888d = map;
    }
}
