package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class si1 implements pm1, om1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ym1 f82654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f82655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qe f82656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public mo f82657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pm1 f82658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public om1 f82659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f82660h = -9223372036854775807L;

    public final void a(ym1 ym1Var) {
        long j10 = this.f82655c;
        long j11 = this.f82660h;
        if (j11 != -9223372036854775807L) {
            j10 = j11;
        }
        mo moVar = this.f82657e;
        moVar.getClass();
        pm1 pm1VarA = moVar.a(ym1Var, this.f82656d, j10);
        this.f82658f = pm1VarA;
        if (this.f82659g != null) {
            pm1VarA.a(this, j10);
        }
    }

    @Override // yads.rx2
    public final boolean continueLoading(long j10) {
        pm1 pm1Var = this.f82658f;
        return pm1Var != null && pm1Var.continueLoading(j10);
    }

    @Override // yads.pm1
    public final void discardBuffer(long j10, boolean z10) {
        pm1 pm1Var = this.f82658f;
        int i10 = ib3.f78556a;
        pm1Var.discardBuffer(j10, z10);
    }

    @Override // yads.rx2
    public final long getBufferedPositionUs() {
        pm1 pm1Var = this.f82658f;
        int i10 = ib3.f78556a;
        return pm1Var.getBufferedPositionUs();
    }

    @Override // yads.rx2
    public final long getNextLoadPositionUs() {
        pm1 pm1Var = this.f82658f;
        int i10 = ib3.f78556a;
        return pm1Var.getNextLoadPositionUs();
    }

    @Override // yads.pm1
    public final i73 getTrackGroups() {
        pm1 pm1Var = this.f82658f;
        int i10 = ib3.f78556a;
        return pm1Var.getTrackGroups();
    }

    @Override // yads.rx2
    public final boolean isLoading() {
        pm1 pm1Var = this.f82658f;
        return pm1Var != null && pm1Var.isLoading();
    }

    @Override // yads.pm1
    public final void maybeThrowPrepareError() {
        pm1 pm1Var = this.f82658f;
        if (pm1Var != null) {
            pm1Var.maybeThrowPrepareError();
            return;
        }
        mo moVar = this.f82657e;
        if (moVar != null) {
            moVar.d();
        }
    }

    @Override // yads.pm1
    public final long readDiscontinuity() {
        pm1 pm1Var = this.f82658f;
        int i10 = ib3.f78556a;
        return pm1Var.readDiscontinuity();
    }

    @Override // yads.rx2
    public final void reevaluateBuffer(long j10) {
        pm1 pm1Var = this.f82658f;
        int i10 = ib3.f78556a;
        pm1Var.reevaluateBuffer(j10);
    }

    @Override // yads.pm1
    public final long seekToUs(long j10) {
        pm1 pm1Var = this.f82658f;
        int i10 = ib3.f78556a;
        return pm1Var.seekToUs(j10);
    }

    public si1(ym1 ym1Var, qe qeVar, long j10) {
        this.f82654b = ym1Var;
        this.f82656d = qeVar;
        this.f82655c = j10;
    }

    @Override // yads.pm1
    public final long a(long j10, ww2 ww2Var) {
        pm1 pm1Var = this.f82658f;
        int i10 = ib3.f78556a;
        return pm1Var.a(j10, ww2Var);
    }

    @Override // yads.qx2
    public final void a(rx2 rx2Var) {
        om1 om1Var = this.f82659g;
        int i10 = ib3.f78556a;
        om1Var.a((rx2) this);
    }

    @Override // yads.om1
    public final void a(pm1 pm1Var) {
        om1 om1Var = this.f82659g;
        int i10 = ib3.f78556a;
        om1Var.a((pm1) this);
    }

    @Override // yads.pm1
    public final void a(om1 om1Var, long j10) {
        this.f82659g = om1Var;
        pm1 pm1Var = this.f82658f;
        if (pm1Var != null) {
            long j11 = this.f82655c;
            long j12 = this.f82660h;
            if (j12 != -9223372036854775807L) {
                j11 = j12;
            }
            pm1Var.a(this, j11);
        }
    }

    public final void a() {
        if (this.f82658f != null) {
            mo moVar = this.f82657e;
            moVar.getClass();
            moVar.a(this.f82658f);
        }
    }

    @Override // yads.pm1
    public final long a(op0[] op0VarArr, boolean[] zArr, ns2[] ns2VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f82660h;
        if (j12 == -9223372036854775807L || j10 != this.f82655c) {
            j11 = j10;
        } else {
            this.f82660h = -9223372036854775807L;
            j11 = j12;
        }
        pm1 pm1Var = this.f82658f;
        int i10 = ib3.f78556a;
        return pm1Var.a(op0VarArr, zArr, ns2VarArr, zArr2, j11);
    }

    public final void a(mo moVar) {
        if (this.f82657e == null) {
            this.f82657e = moVar;
            return;
        }
        throw new IllegalStateException();
    }
}
