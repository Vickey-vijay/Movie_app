package yads;

/* JADX INFO: loaded from: classes7.dex */
public final class k30 implements i30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hu f79289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f79290b;

    @Override // yads.i30
    public final long a(long j10, long j11) {
        return ib3.b(this.f79289a.f78378e, j10 + this.f79290b, true);
    }

    @Override // yads.i30
    public final boolean a() {
        return true;
    }

    @Override // yads.i30
    public final long b() {
        return 0L;
    }

    @Override // yads.i30
    public final long b(long j10, long j11) {
        return this.f79289a.f78377d[(int) j10];
    }

    @Override // yads.i30
    public final long c(long j10, long j11) {
        return 0L;
    }

    @Override // yads.i30
    public final long d(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // yads.i30
    public final pl2 b(long j10) {
        hu huVar = this.f79289a;
        int i10 = (int) j10;
        return new pl2(null, huVar.f78376c[i10], huVar.f78375b[i10]);
    }

    @Override // yads.i30
    public final long c(long j10) {
        return this.f79289a.f78374a;
    }

    @Override // yads.i30
    public final long e(long j10, long j11) {
        return this.f79289a.f78374a;
    }

    public k30(hu huVar, long j10) {
        this.f79289a = huVar;
        this.f79290b = j10;
    }

    @Override // yads.i30
    public final long a(long j10) {
        return this.f79289a.f78378e[(int) j10] - this.f79290b;
    }
}
