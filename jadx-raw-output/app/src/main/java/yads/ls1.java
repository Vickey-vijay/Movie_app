package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class ls1 implements pm1, om1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pm1 f79900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f79901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public om1 f79902d;

    @Override // yads.pm1
    public final long a(long j10, ww2 ww2Var) {
        return this.f79900b.a(j10 - this.f79901c, ww2Var) + this.f79901c;
    }

    @Override // yads.qx2
    public final void a(rx2 rx2Var) {
        om1 om1Var = this.f79902d;
        om1Var.getClass();
        om1Var.a((rx2) this);
    }

    @Override // yads.rx2
    public final boolean continueLoading(long j10) {
        return this.f79900b.continueLoading(j10 - this.f79901c);
    }

    @Override // yads.pm1
    public final void discardBuffer(long j10, boolean z10) {
        this.f79900b.discardBuffer(j10 - this.f79901c, z10);
    }

    @Override // yads.rx2
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.f79900b.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f79901c + bufferedPositionUs;
    }

    @Override // yads.rx2
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f79900b.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f79901c + nextLoadPositionUs;
    }

    @Override // yads.pm1
    public final i73 getTrackGroups() {
        return this.f79900b.getTrackGroups();
    }

    @Override // yads.rx2
    public final boolean isLoading() {
        return this.f79900b.isLoading();
    }

    @Override // yads.pm1
    public final void maybeThrowPrepareError() {
        this.f79900b.maybeThrowPrepareError();
    }

    @Override // yads.pm1
    public final long readDiscontinuity() {
        long discontinuity = this.f79900b.readDiscontinuity();
        if (discontinuity == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f79901c + discontinuity;
    }

    @Override // yads.rx2
    public final void reevaluateBuffer(long j10) {
        this.f79900b.reevaluateBuffer(j10 - this.f79901c);
    }

    @Override // yads.pm1
    public final long seekToUs(long j10) {
        return this.f79900b.seekToUs(j10 - this.f79901c) + this.f79901c;
    }

    public ls1(pm1 pm1Var, long j10) {
        this.f79900b = pm1Var;
        this.f79901c = j10;
    }

    @Override // yads.om1
    public final void a(pm1 pm1Var) {
        om1 om1Var = this.f79902d;
        om1Var.getClass();
        om1Var.a((pm1) this);
    }

    @Override // yads.pm1
    public final void a(om1 om1Var, long j10) {
        this.f79902d = om1Var;
        this.f79900b.a(this, j10 - this.f79901c);
    }

    @Override // yads.pm1
    public final long a(op0[] op0VarArr, boolean[] zArr, ns2[] ns2VarArr, boolean[] zArr2, long j10) {
        ns2[] ns2VarArr2 = new ns2[ns2VarArr.length];
        int i10 = 0;
        while (true) {
            ns2 ns2Var = null;
            if (i10 >= ns2VarArr.length) {
                break;
            }
            ms1 ms1Var = (ms1) ns2VarArr[i10];
            if (ms1Var != null) {
                ns2Var = ms1Var.f80348b;
            }
            ns2VarArr2[i10] = ns2Var;
            i10++;
        }
        long jA = this.f79900b.a(op0VarArr, zArr, ns2VarArr2, zArr2, j10 - this.f79901c);
        for (int i11 = 0; i11 < ns2VarArr.length; i11++) {
            ns2 ns2Var2 = ns2VarArr2[i11];
            if (ns2Var2 == null) {
                ns2VarArr[i11] = null;
            } else {
                ns2 ns2Var3 = ns2VarArr[i11];
                if (ns2Var3 == null || ((ms1) ns2Var3).f80348b != ns2Var2) {
                    ns2VarArr[i11] = new ms1(ns2Var2, this.f79901c);
                }
            }
        }
        return jA + this.f79901c;
    }
}
