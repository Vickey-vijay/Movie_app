package yads;

/* JADX INFO: loaded from: classes7.dex */
public final class qz2 extends jo {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f82050o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mx0 f82051p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f82052q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f82053r;

    @Override // yads.bg1
    public final void b() {
    }

    public qz2(p30 p30Var, u30 u30Var, mx0 mx0Var, int i10, Object obj, long j10, long j11, long j12, int i11, mx0 mx0Var2) {
        super(p30Var, u30Var, mx0Var, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.f82050o = i11;
        this.f82051p = mx0Var2;
    }

    @Override // yads.bg1
    public final void a() {
        m73 al0Var;
        lo loVar = this.f79133m;
        if (loVar == null) {
            throw new IllegalStateException();
        }
        for (ms2 ms2Var : loVar.f79867b) {
            if (ms2Var.E != 0) {
                ms2Var.E = 0L;
                ms2Var.f80375z = true;
            }
        }
        int i10 = this.f82050o;
        int i11 = 0;
        while (true) {
            int[] iArr = loVar.f79866a;
            if (i11 >= iArr.length) {
                ih1.b("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                al0Var = new al0();
                break;
            }
            if (i10 == iArr[i11]) {
                al0Var = loVar.f79867b[i11];
                break;
            }
            i11++;
        }
        m73 m73Var = al0Var;
        m73Var.a(this.f82051p);
        try {
            u30 u30Var = this.f76425b;
            long j10 = this.f82052q;
            long j11 = u30Var.f83347g;
            long jA = this.f76432i.a(u30Var.a(j10, j11 == -1 ? -1L : j11 - j10));
            if (jA != -1) {
                jA += this.f82052q;
            }
            ld0 ld0Var = new ld0(this.f76432i, this.f82052q, jA);
            for (int iA = 0; iA != -1; iA = m73Var.a(ld0Var, Integer.MAX_VALUE, true)) {
                this.f82052q += (long) iA;
            }
            m73Var.a(this.f76430g, 1, (int) this.f82052q, 0, null);
            s30.a(this.f76432i);
            this.f82053r = true;
        } catch (Throwable th2) {
            s30.a(this.f76432i);
            throw th2;
        }
    }

    @Override // yads.jo
    public final boolean d() {
        return this.f82053r;
    }
}
