package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class qu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u41 f81972a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qu0) && ck.p.e(this.f81972a, ((qu0) obj).f81972a);
    }

    public final int hashCode() {
        u41 u41Var = this.f81972a;
        if (u41Var == null) {
            return 0;
        }
        return u41Var.hashCode();
    }

    public final String toString() {
        return "FeedbackValue(imageValue=" + this.f81972a + ")";
    }

    public qu0(u41 u41Var) {
        this.f81972a = u41Var;
    }
}
