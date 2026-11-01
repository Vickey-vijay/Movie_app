package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class kx2 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f79618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u30 f79619c;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j10 = this.f79618b;
        long j11 = ((kx2) obj).f79618b;
        int i10 = ib3.f78556a;
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public kx2(long j10, u30 u30Var) {
        this.f79618b = j10;
        this.f79619c = u30Var;
    }
}
