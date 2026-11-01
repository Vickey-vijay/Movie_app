package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class ry1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d12 f82466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f82467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d4 f82468c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry1)) {
            return false;
        }
        ry1 ry1Var = (ry1) obj;
        return ck.p.e(this.f82466a, ry1Var.f82466a) && ck.p.e(this.f82467b, ry1Var.f82467b) && ck.p.e(this.f82468c, ry1Var.f82468c);
    }

    public final d4 a() {
        return this.f82468c;
    }

    public final v9 b() {
        return this.f82467b;
    }

    public final d12 c() {
        return this.f82466a;
    }

    public final int hashCode() {
        return this.f82468c.hashCode() + ((this.f82467b.hashCode() + (this.f82466a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "NativeAdBlock(nativeAdResponse=" + this.f82466a + ", adResponse=" + this.f82467b + ", adConfiguration=" + this.f82468c + ")";
    }

    public ry1(v9 v9Var, d4 d4Var, d12 d12Var) {
        this.f82466a = d12Var;
        this.f82467b = v9Var;
        this.f82468c = d4Var;
    }
}
