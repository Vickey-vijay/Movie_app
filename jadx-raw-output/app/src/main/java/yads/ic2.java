package yads;

/* JADX INFO: loaded from: classes7.dex */
public final class ic2 implements m93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ul0 f78575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ib2 f78576b = new ib2(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f78577c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f78578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y63 f78579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f78580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f78581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f78582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f78583i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f78584j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f78585k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f78586l;

    @Override // yads.m93
    public final void a(int i10, jb2 jb2Var) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (this.f78579e == null) {
            throw new IllegalStateException();
        }
        int i16 = 2;
        int i17 = 3;
        int i18 = -1;
        int i19 = 0;
        if ((i10 & 1) != 0) {
            int i20 = this.f78577c;
            if (i20 != 0 && i20 != 1) {
                if (i20 == 2) {
                    ih1.d("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i20 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f78584j != -1) {
                        ih1.d("PesReader", "Unexpected start indicator: expected " + this.f78584j + " more bytes");
                    }
                    this.f78575a.b();
                }
            }
            this.f78577c = 1;
            this.f78578d = 0;
        }
        int i21 = i10;
        while (true) {
            int i22 = jb2Var.f78968c;
            int i23 = jb2Var.f78967b;
            int i24 = i22 - i23;
            if (i24 <= 0) {
                return;
            }
            int i25 = this.f78577c;
            if (i25 == 0) {
                i11 = i16;
                i12 = i17;
                i13 = i18;
                i14 = i19;
                jb2Var.e(i24 + i23);
            } else if (i25 == 1) {
                i12 = i17;
                int i26 = i19;
                if (a(9, jb2Var, this.f78576b.f78552a)) {
                    this.f78576b.b(i26);
                    int iA = this.f78576b.a(24);
                    if (iA != 1) {
                        kf1.a("Unexpected start code prefix: ", iA, "PesReader");
                        i13 = -1;
                        this.f78584j = -1;
                        i15 = 0;
                        i11 = 2;
                    } else {
                        this.f78576b.c(8);
                        int iA2 = this.f78576b.a(16);
                        this.f78576b.c(5);
                        this.f78585k = this.f78576b.e();
                        i11 = 2;
                        this.f78576b.c(2);
                        this.f78580f = this.f78576b.e();
                        this.f78581g = this.f78576b.e();
                        this.f78576b.c(6);
                        int iA3 = this.f78576b.a(8);
                        this.f78583i = iA3;
                        if (iA2 == 0) {
                            this.f78584j = -1;
                            i13 = -1;
                        } else {
                            int i27 = (iA2 - 3) - iA3;
                            this.f78584j = i27;
                            if (i27 < 0) {
                                ih1.d("PesReader", "Found negative packet payload size: " + this.f78584j);
                                i13 = -1;
                                this.f78584j = -1;
                            } else {
                                i13 = -1;
                            }
                        }
                        i15 = 2;
                    }
                    this.f78577c = i15;
                    i14 = 0;
                    this.f78578d = 0;
                } else {
                    i14 = i26;
                    i13 = -1;
                    i11 = 2;
                }
            } else if (i25 != i16) {
                if (i25 != i17) {
                    throw new IllegalStateException();
                }
                int i28 = this.f78584j;
                int i29 = i28 == i18 ? i19 : i24 - i28;
                if (i29 > 0) {
                    i24 -= i29;
                    jb2Var.d(i23 + i24);
                }
                this.f78575a.a(jb2Var);
                int i30 = this.f78584j;
                if (i30 != i18) {
                    int i31 = i30 - i24;
                    this.f78584j = i31;
                    if (i31 == 0) {
                        this.f78575a.b();
                        this.f78577c = 1;
                        this.f78578d = i19;
                    }
                }
                i11 = i16;
                i12 = i17;
                i13 = i18;
                i14 = i19;
            } else if (a(Math.min(10, this.f78583i), jb2Var, this.f78576b.f78552a) && a(this.f78583i, jb2Var, (byte[]) null)) {
                this.f78576b.b(i19);
                this.f78586l = -9223372036854775807L;
                if (this.f78580f) {
                    this.f78576b.c(4);
                    long jA = ((long) this.f78576b.a(i17)) << 30;
                    this.f78576b.c(1);
                    long jA2 = ((long) (this.f78576b.a(15) << 15)) | jA;
                    this.f78576b.c(1);
                    long jA3 = jA2 | ((long) this.f78576b.a(15));
                    this.f78576b.c(1);
                    if (!this.f78582h && this.f78581g) {
                        this.f78576b.c(4);
                        long jA4 = ((long) this.f78576b.a(i17)) << 30;
                        this.f78576b.c(1);
                        long jA5 = ((long) (this.f78576b.a(15) << 15)) | jA4;
                        this.f78576b.c(1);
                        long jA6 = jA5 | ((long) this.f78576b.a(15));
                        this.f78576b.c(1);
                        this.f78579e.b(jA6);
                        this.f78582h = true;
                    }
                    this.f78586l = this.f78579e.b(jA3);
                }
                i21 |= this.f78585k ? 4 : 0;
                this.f78575a.a(i21, this.f78586l);
                this.f78577c = 3;
                this.f78578d = 0;
                i19 = 0;
                i18 = -1;
                i17 = 3;
                i16 = 2;
            } else {
                i12 = i17;
                i13 = i18;
                i14 = i19;
                i11 = 2;
            }
            i19 = i14;
            i18 = i13;
            i17 = i12;
            i16 = i11;
        }
    }

    public ic2(ul0 ul0Var) {
        this.f78575a = ul0Var;
    }

    public final boolean a(int i10, jb2 jb2Var, byte[] bArr) {
        int iMin = Math.min(jb2Var.f78968c - jb2Var.f78967b, i10 - this.f78578d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            jb2Var.e(jb2Var.f78967b + iMin);
        } else {
            jb2Var.a(bArr, this.f78578d, iMin);
        }
        int i11 = this.f78578d + iMin;
        this.f78578d = i11;
        return i11 == i10;
    }

    @Override // yads.m93
    public final void a(y63 y63Var, pq0 pq0Var, l93 l93Var) {
        this.f78579e = y63Var;
        this.f78575a.a(pq0Var, l93Var);
    }

    @Override // yads.m93
    public final void a() {
        this.f78577c = 0;
        this.f78578d = 0;
        this.f78582h = false;
        this.f78575a.a();
    }
}
