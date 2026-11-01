package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class jx2 implements as {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qj0 f79226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f79227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f79228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f79229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f79230e;

    @Override // yads.as
    public final void a(long j10, long j11, long j12) {
        float f10;
        float f11;
        long j13 = this.f79229d + j12;
        this.f79229d = j13;
        qj0 qj0Var = this.f79226a;
        long j14 = this.f79227b;
        if (j14 == -1 || j14 == 0) {
            int i10 = this.f79228c;
            if (i10 != 0) {
                f11 = (this.f79230e * 100.0f) / i10;
            } else {
                f10 = -1.0f;
            }
            ((lj0) qj0Var).a(j14, j13, f11);
        }
        f10 = (j13 * 100.0f) / j14;
        f11 = f10;
        ((lj0) qj0Var).a(j14, j13, f11);
    }

    public jx2(qj0 qj0Var, long j10, int i10, long j11, int i11) {
        this.f79226a = qj0Var;
        this.f79227b = j10;
        this.f79228c = i10;
        this.f79229d = j11;
        this.f79230e = i11;
    }
}
