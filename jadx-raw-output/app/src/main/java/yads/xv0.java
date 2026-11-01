package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class xv0 implements p92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bw0 f84702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0 f84703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f84704c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f84705d = -1;

    @Override // yads.p92
    public final vw2 a() {
        long j10 = this.f84704c;
        if (j10 != -1) {
            return new zv0(this.f84702a, j10);
        }
        throw new IllegalStateException();
    }

    public xv0(bw0 bw0Var, aw0 aw0Var) {
        this.f84702a = bw0Var;
        this.f84703b = aw0Var;
    }

    @Override // yads.p92
    public final long a(ld0 ld0Var) {
        long j10 = this.f84705d;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f84705d = -1L;
        return j11;
    }

    @Override // yads.p92
    public final void a(long j10) {
        long[] jArr = this.f84703b.f75637a;
        this.f84705d = jArr[ib3.b(jArr, j10, true)];
    }
}
