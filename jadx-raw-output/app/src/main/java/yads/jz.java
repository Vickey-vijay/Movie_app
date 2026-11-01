package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class jz extends jo {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f79239o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f79240p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fu f79241q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f79242r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile boolean f79243s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f79244t;

    public jz(p30 p30Var, u30 u30Var, mx0 mx0Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, fu fuVar) {
        super(p30Var, u30Var, mx0Var, i10, obj, j10, j11, j12, j13, j14);
        this.f79239o = i11;
        this.f79240p = j15;
        this.f79241q = fuVar;
    }

    @Override // yads.bg1
    public final void b() {
        this.f79243s = true;
    }

    @Override // yads.bg1
    public final void a() {
        int iA;
        if (this.f79242r == 0) {
            lo loVar = this.f79133m;
            if (loVar == null) {
                throw new IllegalStateException();
            }
            long j10 = this.f79240p;
            for (ms2 ms2Var : loVar.f79867b) {
                if (ms2Var.E != j10) {
                    ms2Var.E = j10;
                    ms2Var.f80375z = true;
                }
            }
            fu fuVar = this.f79241q;
            long j11 = this.f79131k;
            long j12 = j11 == -9223372036854775807L ? -9223372036854775807L : j11 - this.f79240p;
            long j13 = this.f79132l;
            ((ar) fuVar).a(loVar, j12, j13 != -9223372036854775807L ? j13 - this.f79240p : -9223372036854775807L);
        }
        try {
            u30 u30Var = this.f76425b;
            long j14 = this.f79242r;
            long j15 = u30Var.f83347g;
            long j16 = -1;
            if (j15 != -1) {
                j16 = j15 - j14;
            }
            u30 u30VarA = u30Var.a(j14, j16);
            r33 r33Var = this.f76432i;
            ld0 ld0Var = new ld0(r33Var, u30VarA.f83346f, r33Var.a(u30VarA));
            do {
                try {
                    if (this.f79243s) {
                        break;
                    }
                    iA = ((ar) this.f79241q).f75599b.a(ld0Var, ar.f75598l);
                    if (iA == 1) {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th2) {
                    this.f79242r = ld0Var.f79757d - this.f76425b.f83346f;
                    throw th2;
                }
            } while (iA == 0);
            this.f79242r = ld0Var.f79757d - this.f76425b.f83346f;
            s30.a(this.f76432i);
            this.f79244t = !this.f79243s;
        } catch (Throwable th3) {
            s30.a(this.f76432i);
            throw th3;
        }
    }

    @Override // yads.jo
    public final long c() {
        return this.f79130j + ((long) this.f79239o);
    }

    @Override // yads.jo
    public final boolean d() {
        return this.f79244t;
    }
}
