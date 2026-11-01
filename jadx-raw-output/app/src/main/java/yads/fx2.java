package yads;

/* JADX INFO: loaded from: classes8.dex */
public final class fx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f77539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f77540b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fx2.class != obj.getClass()) {
            return false;
        }
        fx2 fx2Var = (fx2) obj;
        return this.f77539a == fx2Var.f77539a && this.f77540b == fx2Var.f77540b;
    }

    public final int hashCode() {
        return (((int) this.f77539a) * 31) + ((int) this.f77540b);
    }

    public fx2(long j10, long j11) {
        this.f77539a = j10;
        this.f77540b = j11;
    }
}
