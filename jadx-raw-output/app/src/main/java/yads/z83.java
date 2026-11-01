package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class z83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f85244a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f85245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f85247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f85248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f85249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f85250g;

    public final void a(m73 m73Var, long j10, int i10, int i11, int i12, l73 l73Var) {
        if (!(this.f85250g <= i11 + i12)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.f85245b) {
            int i13 = this.f85246c;
            int i14 = i13 + 1;
            this.f85246c = i14;
            if (i13 == 0) {
                this.f85247d = j10;
                this.f85248e = i10;
                this.f85249f = 0;
            }
            int i15 = this.f85249f + i11;
            this.f85249f = i15;
            this.f85250g = i12;
            if (i14 < 16 || i14 <= 0) {
                return;
            }
            m73Var.a(this.f85247d, this.f85248e, i15, i12, l73Var);
            this.f85246c = 0;
        }
    }

    public final void a(nq0 nq0Var) {
        if (this.f85245b) {
            return;
        }
        nq0Var.a(this.f85244a, 0, 10);
        nq0Var.b();
        byte[] bArr = this.f85244a;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) != 186) {
                return;
            }
            if ((40 << ((bArr[(b10 & 255) == 187 ? '\t' : '\b'] >> 4) & 7)) == 0) {
                return;
            }
            this.f85245b = true;
        }
    }
}
