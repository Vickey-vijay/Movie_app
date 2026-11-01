package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class g0 implements ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ib2 f77562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f77563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f77565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m73 f77566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f77567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f77568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f77569h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f77570i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public mx0 f77571j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f77572k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f77573l;

    public g0() {
        this(null);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x01ed  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.ul0
    public final void a(jb2 jb2Var) {
        int i10;
        int i11;
        int i12;
        String str;
        int iA;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        if (this.f77566e == null) {
            throw new IllegalStateException();
        }
        while (true) {
            int i21 = jb2Var.f78968c - jb2Var.f78967b;
            if (i21 <= 0) {
                return;
            }
            int i22 = this.f77567f;
            if (i22 == 0) {
                while (jb2Var.f78968c - jb2Var.f78967b > 0) {
                    if (this.f77569h) {
                        int iM = jb2Var.m();
                        if (iM == 119) {
                            this.f77569h = false;
                            this.f77567f = 1;
                            byte[] bArr = this.f77563b.f78966a;
                            bArr[0] = 11;
                            bArr[1] = 119;
                            this.f77568g = 2;
                            break;
                        }
                        this.f77569h = iM == 11;
                    } else {
                        this.f77569h = jb2Var.m() == 11;
                    }
                }
            } else if (i22 == 1) {
                byte[] bArr2 = this.f77563b.f78966a;
                int iMin = Math.min(i21, 128 - this.f77568g);
                jb2Var.a(bArr2, this.f77568g, iMin);
                int i23 = this.f77568g + iMin;
                this.f77568g = i23;
                if (i23 == 128) {
                    this.f77562a.b(0);
                    ib2 ib2Var = this.f77562a;
                    int iD = ib2Var.d();
                    ib2Var.c(40);
                    Object[] objArr = ib2Var.a(5) > 10;
                    ib2Var.b(iD);
                    int i24 = -1;
                    if (objArr == true) {
                        ib2Var.c(16);
                        int iA2 = ib2Var.a(2);
                        if (iA2 == 0) {
                            i24 = 0;
                        } else if (iA2 == 1) {
                            i24 = 1;
                        } else if (iA2 == 2) {
                            i24 = 2;
                        }
                        ib2Var.c(3);
                        iA = (ib2Var.a(11) + 1) * 2;
                        int iA3 = ib2Var.a(2);
                        if (iA3 == 3) {
                            i15 = h0.f77993c[ib2Var.a(2)];
                            i13 = 3;
                            i14 = 6;
                        } else {
                            int iA4 = ib2Var.a(2);
                            i13 = iA4;
                            i14 = h0.f77991a[iA4];
                            i15 = h0.f77992b[iA3];
                        }
                        i11 = i14 * 256;
                        int iA5 = ib2Var.a(3);
                        boolean zE = ib2Var.e();
                        i12 = h0.f77994d[iA5] + (zE ? 1 : 0);
                        ib2Var.c(10);
                        if (ib2Var.e()) {
                            ib2Var.c(8);
                        }
                        if (iA5 == 0) {
                            ib2Var.c(5);
                            if (ib2Var.e()) {
                                ib2Var.c(8);
                            }
                        }
                        if (i24 == 1 && ib2Var.e()) {
                            ib2Var.c(16);
                        }
                        if (ib2Var.e()) {
                            if (iA5 > 2) {
                                ib2Var.c(2);
                            }
                            if ((iA5 & 1) == 0 || iA5 <= 2) {
                                i18 = 6;
                            } else {
                                i18 = 6;
                                ib2Var.c(6);
                            }
                            if ((iA5 & 4) != 0) {
                                ib2Var.c(i18);
                            }
                            if (zE && ib2Var.e()) {
                                ib2Var.c(5);
                            }
                            if (i24 == 0) {
                                if (ib2Var.e()) {
                                    i19 = 6;
                                    ib2Var.c(6);
                                } else {
                                    i19 = 6;
                                }
                                if (iA5 == 0 && ib2Var.e()) {
                                    ib2Var.c(i19);
                                }
                                if (ib2Var.e()) {
                                    ib2Var.c(i19);
                                }
                                int i25 = 2;
                                int iA6 = ib2Var.a(2);
                                if (iA6 == 1) {
                                    ib2Var.c(5);
                                } else {
                                    if (iA6 == 2) {
                                        ib2Var.c(12);
                                    } else if (iA6 == 3) {
                                        int iA7 = ib2Var.a(5);
                                        if (ib2Var.e()) {
                                            ib2Var.c(5);
                                            if (ib2Var.e()) {
                                                ib2Var.c(4);
                                            }
                                            if (ib2Var.e()) {
                                                ib2Var.c(4);
                                            }
                                            if (ib2Var.e()) {
                                                ib2Var.c(4);
                                            }
                                            if (ib2Var.e()) {
                                                ib2Var.c(4);
                                            }
                                            if (ib2Var.e()) {
                                                ib2Var.c(4);
                                            }
                                            if (ib2Var.e()) {
                                                ib2Var.c(4);
                                            }
                                            if (ib2Var.e()) {
                                                ib2Var.c(4);
                                            }
                                            if (ib2Var.e()) {
                                                if (ib2Var.e()) {
                                                    ib2Var.c(4);
                                                }
                                                if (ib2Var.e()) {
                                                    ib2Var.c(4);
                                                }
                                            }
                                        }
                                        if (ib2Var.e()) {
                                            ib2Var.c(5);
                                            if (ib2Var.e()) {
                                                ib2Var.c(7);
                                                if (ib2Var.e()) {
                                                    i20 = 8;
                                                    ib2Var.c(8);
                                                } else {
                                                    i20 = 8;
                                                }
                                            } else {
                                                i20 = 8;
                                            }
                                        } else {
                                            i20 = 8;
                                        }
                                        ib2Var.c((iA7 + 2) * i20);
                                        if (ib2Var.f78554c != 0) {
                                            ib2Var.f78554c = 0;
                                            ib2Var.f78553b++;
                                            ib2Var.a();
                                        }
                                    }
                                    i25 = 2;
                                }
                                if (iA5 < i25) {
                                    if (ib2Var.e()) {
                                        ib2Var.c(14);
                                    }
                                    if (iA5 == 0 && ib2Var.e()) {
                                        ib2Var.c(14);
                                    }
                                }
                                if (ib2Var.e()) {
                                    if (i13 == 0) {
                                        ib2Var.c(5);
                                    } else {
                                        for (int i26 = 0; i26 < i14; i26++) {
                                            if (ib2Var.e()) {
                                                ib2Var.c(5);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (ib2Var.e()) {
                            ib2Var.c(5);
                            if (iA5 == 2) {
                                ib2Var.c(4);
                            }
                            if (iA5 >= 6) {
                                ib2Var.c(2);
                            }
                            if (ib2Var.e()) {
                                i17 = 8;
                                ib2Var.c(8);
                            } else {
                                i17 = 8;
                            }
                            if (iA5 == 0 && ib2Var.e()) {
                                ib2Var.c(i17);
                            }
                            if (iA3 < 3) {
                                ib2Var.g();
                            }
                        }
                        if (i24 == 0 && i13 != 3) {
                            ib2Var.g();
                        }
                        if (i24 == 2 && (i13 == 3 || ib2Var.e())) {
                            i16 = 6;
                            ib2Var.c(6);
                        } else {
                            i16 = 6;
                        }
                        str = (ib2Var.e() && ib2Var.a(i16) == 1 && ib2Var.a(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                        i24 = i15;
                    } else {
                        ib2Var.c(32);
                        int iA8 = ib2Var.a(2);
                        String str2 = iA8 == 3 ? null : "audio/ac3";
                        int iA9 = h0.a(iA8, ib2Var.a(6));
                        ib2Var.c(8);
                        int iA10 = ib2Var.a(3);
                        if ((iA10 & 1) == 0 || iA10 == 1) {
                            i10 = 2;
                        } else {
                            i10 = 2;
                            ib2Var.c(2);
                        }
                        if ((iA10 & 4) != 0) {
                            ib2Var.c(i10);
                        }
                        if (iA10 == i10) {
                            ib2Var.c(i10);
                        }
                        i24 = iA8 < 3 ? h0.f77992b[iA8] : -1;
                        i11 = 1536;
                        i12 = h0.f77994d[iA10] + (ib2Var.e() ? 1 : 0);
                        str = str2;
                        iA = iA9;
                    }
                    int i27 = i12;
                    mx0 mx0Var = this.f77571j;
                    if (mx0Var == null || i27 != mx0Var.f80442z || i24 != mx0Var.A || !ib3.a(str, mx0Var.f80429m)) {
                        lx0 lx0Var = new lx0();
                        lx0Var.f79957a = this.f77565d;
                        lx0Var.f79967k = str;
                        lx0Var.f79980x = i27;
                        lx0Var.f79981y = i24;
                        lx0Var.f79959c = this.f77564c;
                        mx0 mx0Var2 = new mx0(lx0Var);
                        this.f77571j = mx0Var2;
                        this.f77566e.a(mx0Var2);
                    }
                    this.f77572k = iA;
                    this.f77570i = (((long) i11) * 1000000) / ((long) this.f77571j.A);
                    this.f77563b.e(0);
                    this.f77566e.a(128, this.f77563b);
                    this.f77567f = 2;
                }
            } else if (i22 == 2) {
                int iMin2 = Math.min(i21, this.f77572k - this.f77568g);
                this.f77566e.a(iMin2, jb2Var);
                int i28 = this.f77568g + iMin2;
                this.f77568g = i28;
                int i29 = this.f77572k;
                if (i28 == i29) {
                    long j10 = this.f77573l;
                    if (j10 != -9223372036854775807L) {
                        this.f77566e.a(j10, 1, i29, 0, null);
                        this.f77573l += this.f77570i;
                    }
                    this.f77567f = 0;
                }
            }
        }
    }

    @Override // yads.ul0
    public final void b() {
    }

    public g0(String str) {
        byte[] bArr = new byte[128];
        this.f77562a = new ib2(bArr);
        this.f77563b = new jb2(bArr);
        this.f77567f = 0;
        this.f77573l = -9223372036854775807L;
        this.f77564c = str;
    }

    @Override // yads.ul0
    public final void a(pq0 pq0Var, l93 l93Var) {
        l93Var.a();
        l93Var.b();
        this.f77565d = l93Var.f79734e;
        l93Var.b();
        this.f77566e = pq0Var.a(l93Var.f79733d, 1);
    }

    @Override // yads.ul0
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f77573l = j10;
        }
    }

    @Override // yads.ul0
    public final void a() {
        this.f77567f = 0;
        this.f77568g = 0;
        this.f77569h = false;
        this.f77573l = -9223372036854775807L;
    }
}
