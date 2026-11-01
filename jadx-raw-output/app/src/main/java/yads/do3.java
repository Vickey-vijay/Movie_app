package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class do3 implements fo3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fw1 f76761a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof do3) && ck.p.e(this.f76761a, ((do3) obj).f76761a);
    }

    public final int hashCode() {
        fw1 fw1Var = this.f76761a;
        if (fw1Var == null) {
            return 0;
        }
        return fw1Var.hashCode();
    }

    public final String toString() {
        return "Loading(preloadingListener=" + this.f76761a + ")";
    }

    public do3(fw1 fw1Var) {
        this.f76761a = fw1Var;
    }
}
