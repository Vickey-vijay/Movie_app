package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class zm0 implements ns2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mx0 f85479b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f85481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f85482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public an0 f85483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f85484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f85485h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ym0 f85480c = new ym0();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f85486i = -9223372036854775807L;

    @Override // yads.ns2
    public final int a(nx0 nx0Var, sa0 sa0Var, int i10) {
        int i11 = this.f85485h;
        boolean z10 = i11 == this.f85481d.length;
        if (z10 && !this.f85482e) {
            sa0Var.f82731b = 4;
            return -4;
        }
        if ((i10 & 2) != 0 || !this.f85484g) {
            nx0Var.f80854b = this.f85479b;
            this.f85484g = true;
            return -5;
        }
        if (z10) {
            return -3;
        }
        if ((i10 & 1) == 0) {
            this.f85485h = i11 + 1;
        }
        if ((i10 & 4) == 0) {
            byte[] bArrA = this.f85480c.a(this.f85483f.f75571a[i11]);
            sa0Var.c(bArrA.length);
            sa0Var.f82568d.put(bArrA);
        }
        sa0Var.f82570f = this.f85481d[i11];
        sa0Var.f82731b = 1;
        return -4;
    }

    @Override // yads.ns2
    public final void a() {
    }

    @Override // yads.ns2
    public final boolean isReady() {
        return true;
    }

    public zm0(an0 an0Var, mx0 mx0Var, boolean z10) {
        this.f85479b = mx0Var;
        this.f85483f = an0Var;
        this.f85481d = an0Var.f75572b;
        a(an0Var, z10);
    }

    @Override // yads.ns2
    public final int a(long j10) {
        int iMax = Math.max(this.f85485h, ib3.a(this.f85481d, j10, true));
        int i10 = iMax - this.f85485h;
        this.f85485h = iMax;
        return i10;
    }

    public final void a(an0 an0Var, boolean z10) {
        int i10 = this.f85485h;
        long j10 = -9223372036854775807L;
        long j11 = i10 == 0 ? -9223372036854775807L : this.f85481d[i10 - 1];
        this.f85482e = z10;
        this.f85483f = an0Var;
        long[] jArr = an0Var.f75572b;
        this.f85481d = jArr;
        long j12 = this.f85486i;
        if (j12 == -9223372036854775807L) {
            if (j11 != -9223372036854775807L) {
                this.f85485h = ib3.a(jArr, j11, false);
            }
        } else {
            int iA = ib3.a(jArr, j12, true);
            this.f85485h = iA;
            if (this.f85482e && iA == this.f85481d.length) {
                j10 = j12;
            }
            this.f85486i = j10;
        }
    }
}
