package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class kn3 implements jn3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pq0 f79487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m73 f79488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mn3 f79489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mx0 f79490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f79491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f79492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f79493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f79494h;

    @Override // yads.jn3
    public final void a(int i10, long j10) {
        this.f79487a.a(new pn3(this.f79489c, 1, i10, j10));
        this.f79488b.a(this.f79490d);
    }

    public kn3(pq0 pq0Var, m73 m73Var, mn3 mn3Var, String str, int i10) throws ob2 {
        this.f79487a = pq0Var;
        this.f79488b = m73Var;
        this.f79489c = mn3Var;
        int i11 = (mn3Var.f80288a * mn3Var.f80291d) / 8;
        if (mn3Var.f80290c == i11) {
            int i12 = mn3Var.f80289b * i11;
            int i13 = i12 * 8;
            int iMax = Math.max(i11, i12 / 10);
            this.f79491e = iMax;
            this.f79490d = new lx0().d(str).a(i13).e(i13).c(iMax).b(mn3Var.f80288a).g(mn3Var.f80289b).d(i10).a();
            return;
        }
        throw ob2.a("Expected block size: " + i11 + "; got: " + mn3Var.f80290c);
    }

    @Override // yads.jn3
    public final void a(long j10) {
        this.f79492f = j10;
        this.f79493g = 0;
        this.f79494h = 0L;
    }

    @Override // yads.jn3
    public final boolean a(ld0 ld0Var, long j10) {
        int i10;
        int i11;
        long j11 = j10;
        while (j11 > 0 && (i10 = this.f79493g) < (i11 = this.f79491e)) {
            int iA = this.f79488b.a(ld0Var, (int) Math.min(i11 - i10, j11), true);
            if (iA == -1) {
                j11 = 0;
            } else {
                this.f79493g += iA;
                j11 -= (long) iA;
            }
        }
        mn3 mn3Var = this.f79489c;
        int i12 = mn3Var.f80290c;
        int i13 = this.f79493g / i12;
        if (i13 > 0) {
            long jA = this.f79492f + ib3.a(this.f79494h, 1000000L, mn3Var.f80289b);
            int i14 = i13 * i12;
            int i15 = this.f79493g - i14;
            this.f79488b.a(jA, 1, i14, i15, null);
            this.f79494h += (long) i13;
            this.f79493g = i15;
        }
        return j11 <= 0;
    }
}
