package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class r70 extends s70 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82136b;

    public r70(String str) {
        super(str, 0);
        this.f82136b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r70) && ck.p.e(this.f82136b, ((r70) obj).f82136b);
    }

    public final int hashCode() {
        return this.f82136b.hashCode();
    }

    public final String toString() {
        return "MediationNetwork(network=" + this.f82136b + ")";
    }
}
