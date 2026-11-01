package yads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a03 f75579a;

    public final a03 a() {
        return this.f75579a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ao) && ck.p.e(((ao) obj).f75579a, this.f75579a);
    }

    public final int hashCode() {
        return this.f75579a.hashCode();
    }

    public final String toString() {
        return this.f75579a.toString();
    }

    public ao(a03 a03Var) {
        this.f75579a = a03Var;
    }
}
