package yads;

/* JADX INFO: loaded from: classes11.dex */
public class gz implements vw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f77975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f77976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f77977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f77978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f77979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f77980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f77981g;

    public static long a(int i10, long j10, long j11) {
        return (Math.max(0L, j10 - j11) * 8000000) / ((long) i10);
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        long j11 = this.f77978d;
        if (j11 == -1 && !this.f77981g) {
            xw2 xw2Var = new xw2(0L, this.f77976b);
            return new tw2(xw2Var, xw2Var);
        }
        long j12 = (((long) this.f77979e) * j10) / 8000000;
        long j13 = this.f77977c;
        long jMin = (j12 / j13) * j13;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11 - j13);
        }
        long jMax = Math.max(jMin, 0L);
        long j14 = this.f77976b;
        long j15 = jMax + j14;
        long jA = a(this.f77979e, j15, j14);
        xw2 xw2Var2 = new xw2(jA, j15);
        if (this.f77978d != -1 && jA < j10) {
            long j16 = j15 + ((long) this.f77977c);
            if (j16 < this.f77975a) {
                return new tw2(xw2Var2, new xw2(a(this.f77979e, j16, this.f77976b), j16));
            }
        }
        return new tw2(xw2Var2, xw2Var2);
    }

    @Override // yads.vw2
    public final long c() {
        return this.f77980f;
    }

    public gz(int i10, int i11, long j10, long j11, boolean z10) {
        this.f77975a = j10;
        this.f77976b = j11;
        this.f77977c = i11 == -1 ? 1 : i11;
        this.f77979e = i10;
        this.f77981g = z10;
        if (j10 == -1) {
            this.f77978d = -1L;
            this.f77980f = -9223372036854775807L;
        } else {
            this.f77978d = j10 - j11;
            this.f77980f = a(i10, j10, j11);
        }
    }

    @Override // yads.vw2
    public final boolean b() {
        return this.f77978d != -1 || this.f77981g;
    }
}
