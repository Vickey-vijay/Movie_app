package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class pn3 implements vw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mn3 f81473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f81474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f81475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f81476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f81477e;

    @Override // yads.vw2
    public final boolean b() {
        return true;
    }

    public final long c(long j10) {
        return ib3.a(j10 * ((long) this.f81474b), 1000000L, this.f81473a.f80289b);
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        long j11 = (((long) this.f81473a.f80289b) * j10) / (((long) this.f81474b) * 1000000);
        long j12 = this.f81476d - 1;
        int i10 = ib3.f78556a;
        long jMax = Math.max(0L, Math.min(j11, j12));
        long j13 = (((long) this.f81473a.f80290c) * jMax) + this.f81475c;
        long jC = c(jMax);
        xw2 xw2Var = new xw2(jC, j13);
        if (jC >= j10 || jMax == this.f81476d - 1) {
            return new tw2(xw2Var, xw2Var);
        }
        long j14 = jMax + 1;
        return new tw2(xw2Var, new xw2(c(j14), (((long) this.f81473a.f80290c) * j14) + this.f81475c));
    }

    @Override // yads.vw2
    public final long c() {
        return this.f81477e;
    }

    public pn3(mn3 mn3Var, int i10, long j10, long j11) {
        this.f81473a = mn3Var;
        this.f81474b = i10;
        this.f81475c = j10;
        long j12 = (j11 - j10) / ((long) mn3Var.f80290c);
        this.f81476d = j12;
        this.f81477e = c(j12);
    }
}
