package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class gu2 implements iu2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final im3 f77940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xy f77941b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu2)) {
            return false;
        }
        gu2 gu2Var = (gu2) obj;
        return ck.p.e(this.f77940a, gu2Var.f77940a) && this.f77941b == gu2Var.f77941b;
    }

    public final int hashCode() {
        return this.f77941b.hashCode() + (this.f77940a.hashCode() * 31);
    }

    public final String toString() {
        return "Failure(error=" + this.f77940a + ", configurationSource=" + this.f77941b + ")";
    }

    public gu2(im3 im3Var, xy xyVar) {
        this.f77940a = im3Var;
        this.f77941b = xyVar;
    }
}
