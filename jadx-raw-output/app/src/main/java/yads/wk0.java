package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class wk0 implements ul0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f84229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m73 f84230d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f84232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f84233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f84234h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public mx0 f84235i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f84236j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb2 f84227a = new jb2(new byte[18]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f84231e = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f84237k = -9223372036854775807L;

    /* JADX WARN: Code duplicated, block: B:34:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:41:0x0103  */
    /* JADX WARN: Code duplicated, block: B:43:0x010d  */
    @Override // yads.ul0
    public final void a(jb2 jb2Var) {
        int i10;
        byte b10;
        boolean z10;
        int i11;
        int i12;
        byte b11;
        int i13;
        byte b12;
        int i14;
        if (this.f84230d == null) {
            throw new IllegalStateException();
        }
        while (true) {
            int i15 = jb2Var.f78968c - jb2Var.f78967b;
            if (i15 <= 0) {
                return;
            }
            int i16 = this.f84231e;
            if (i16 == 0) {
                while (jb2Var.f78968c - jb2Var.f78967b > 0) {
                    int i17 = this.f84233g << 8;
                    this.f84233g = i17;
                    int iM = i17 | jb2Var.m();
                    this.f84233g = iM;
                    if (iM == 2147385345 || iM == -25230976 || iM == 536864768 || iM == -14745368) {
                        byte[] bArr = this.f84227a.f78966a;
                        bArr[0] = (byte) ((iM >> 24) & 255);
                        bArr[1] = (byte) ((iM >> 16) & 255);
                        bArr[2] = (byte) ((iM >> 8) & 255);
                        bArr[3] = (byte) (iM & 255);
                        this.f84232f = 4;
                        this.f84233g = 0;
                        this.f84231e = 1;
                        break;
                    }
                }
            } else if (i16 == 1) {
                byte[] bArr2 = this.f84227a.f78966a;
                int iMin = Math.min(i15, 18 - this.f84232f);
                jb2Var.a(bArr2, this.f84232f, iMin);
                int i18 = this.f84232f + iMin;
                this.f84232f = i18;
                if (i18 == 18) {
                    byte[] bArr3 = this.f84227a.f78966a;
                    if (this.f84235i == null) {
                        mx0 mx0VarA = xk0.a(bArr3, this.f84229c, this.f84228b);
                        this.f84235i = mx0VarA;
                        this.f84230d.a(mx0VarA);
                    }
                    byte b13 = bArr3[0];
                    if (b13 != -2) {
                        if (b13 == -1) {
                            i14 = ((bArr3[7] & 3) << 12) | ((bArr3[6] & 255) << 4) | ((bArr3[9] & 60) >> 2);
                        } else if (b13 != 31) {
                            i10 = ((bArr3[5] & 3) << 12) | ((bArr3[6] & 255) << 4);
                            b10 = bArr3[7];
                        } else {
                            i14 = ((bArr3[8] & 60) >> 2) | ((bArr3[6] & 3) << 12) | ((bArr3[7] & 255) << 4);
                        }
                        i11 = i14 + 1;
                        z10 = true;
                        if (z10) {
                            i11 = (i11 * 16) / 14;
                        }
                        this.f84236j = i11;
                        if (b13 != -2) {
                            if (b13 != -1) {
                                i12 = (bArr3[4] & 7) << 4;
                                b12 = bArr3[7];
                            } else if (b13 != 31) {
                                i12 = (bArr3[4] & 1) << 6;
                                b11 = bArr3[5];
                            } else {
                                i12 = (bArr3[5] & 7) << 4;
                                b12 = bArr3[6];
                            }
                            i13 = b12 & 60;
                            this.f84234h = (int) ((((long) ((((i13 >> 2) | i12) + 1) * 32)) * 1000000) / ((long) this.f84235i.A));
                            this.f84227a.e(0);
                            this.f84230d.a(18, this.f84227a);
                            this.f84231e = 2;
                        } else {
                            i12 = (bArr3[5] & 1) << 6;
                            b11 = bArr3[4];
                        }
                        i13 = b11 & 252;
                        this.f84234h = (int) ((((long) ((((i13 >> 2) | i12) + 1) * 32)) * 1000000) / ((long) this.f84235i.A));
                        this.f84227a.e(0);
                        this.f84230d.a(18, this.f84227a);
                        this.f84231e = 2;
                    } else {
                        i10 = ((bArr3[4] & 3) << 12) | ((bArr3[7] & 255) << 4);
                        b10 = bArr3[6];
                    }
                    i11 = (i10 | ((b10 & 240) >> 4)) + 1;
                    z10 = false;
                    if (z10) {
                        i11 = (i11 * 16) / 14;
                    }
                    this.f84236j = i11;
                    if (b13 != -2) {
                        if (b13 != -1) {
                            i12 = (bArr3[4] & 7) << 4;
                            b12 = bArr3[7];
                        } else if (b13 != 31) {
                            i12 = (bArr3[4] & 1) << 6;
                            b11 = bArr3[5];
                        } else {
                            i12 = (bArr3[5] & 7) << 4;
                            b12 = bArr3[6];
                        }
                        i13 = b12 & 60;
                        this.f84234h = (int) ((((long) ((((i13 >> 2) | i12) + 1) * 32)) * 1000000) / ((long) this.f84235i.A));
                        this.f84227a.e(0);
                        this.f84230d.a(18, this.f84227a);
                        this.f84231e = 2;
                    } else {
                        i12 = (bArr3[5] & 1) << 6;
                        b11 = bArr3[4];
                    }
                    i13 = b11 & 252;
                    this.f84234h = (int) ((((long) ((((i13 >> 2) | i12) + 1) * 32)) * 1000000) / ((long) this.f84235i.A));
                    this.f84227a.e(0);
                    this.f84230d.a(18, this.f84227a);
                    this.f84231e = 2;
                }
            } else {
                if (i16 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(i15, this.f84236j - this.f84232f);
                this.f84230d.a(iMin2, jb2Var);
                int i19 = this.f84232f + iMin2;
                this.f84232f = i19;
                int i20 = this.f84236j;
                if (i19 == i20) {
                    long j10 = this.f84237k;
                    if (j10 != -9223372036854775807L) {
                        this.f84230d.a(j10, 1, i20, 0, null);
                        this.f84237k += this.f84234h;
                    }
                    this.f84231e = 0;
                }
            }
        }
    }

    @Override // yads.ul0
    public final void b() {
    }

    public wk0(String str) {
        this.f84228b = str;
    }

    @Override // yads.ul0
    public final void a(pq0 pq0Var, l93 l93Var) {
        l93Var.a();
        l93Var.b();
        this.f84229c = l93Var.f79734e;
        l93Var.b();
        this.f84230d = pq0Var.a(l93Var.f79733d, 1);
    }

    @Override // yads.ul0
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f84237k = j10;
        }
    }

    @Override // yads.ul0
    public final void a() {
        this.f84231e = 0;
        this.f84232f = 0;
        this.f84233g = 0;
        this.f84237k = -9223372036854775807L;
    }
}
