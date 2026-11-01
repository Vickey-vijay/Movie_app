package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class gx2 extends hx2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f77967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f77968e;

    public final pl2 b() {
        long j10 = this.f77968e;
        if (j10 <= 0) {
            return null;
        }
        return new pl2(null, this.f77967d, j10);
    }

    public gx2(pl2 pl2Var, long j10, long j11, long j12, long j13) {
        super(pl2Var, j10, j11);
        this.f77967d = j12;
        this.f77968e = j13;
    }
}
