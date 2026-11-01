package yads;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class qc implements ul0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte[] f81801v = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f81802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ib2 f81803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jb2 f81804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f81805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f81806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m73 f81807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m73 f81808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f81809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f81810i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f81811j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f81812k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f81813l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f81814m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f81815n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f81816o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f81817p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f81818q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f81819r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f81820s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public m73 f81821t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f81822u;

    public qc() {
        this(null, true);
    }

    /* JADX WARN: Code duplicated, block: B:116:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:121:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:123:0x02be  */
    /* JADX WARN: Code duplicated, block: B:125:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:156:0x028b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x028b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x028b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x02ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x02e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0231  */
    /* JADX WARN: Code duplicated, block: B:79:0x0246  */
    /* JADX WARN: Code duplicated, block: B:80:0x0249  */
    /* JADX WARN: Code duplicated, block: B:83:0x0251  */
    /* JADX WARN: Code duplicated, block: B:85:0x0256  */
    /* JADX WARN: Code duplicated, block: B:88:0x025b  */
    /* JADX WARN: Code duplicated, block: B:93:0x026f  */
    @Override // yads.ul0
    public final void a(jb2 jb2Var) throws ob2 {
        int i10;
        int i11;
        char c10;
        char c11;
        byte[] bArr;
        int iA;
        byte[] bArr2;
        int i12;
        int i13;
        byte b10;
        int i14;
        int i15;
        int i16;
        byte b11;
        this.f81807f.getClass();
        int i17 = ib3.f78556a;
        while (true) {
            int i18 = jb2Var.f78968c;
            int i19 = jb2Var.f78967b;
            int i20 = i18 - i19;
            if (i20 <= 0) {
                return;
            }
            int i21 = this.f81809h;
            int i22 = -1;
            int i23 = 4;
            if (i21 == 0) {
                byte[] bArr3 = jb2Var.f78966a;
                while (true) {
                    if (i19 < i18) {
                        int i24 = i19 + 1;
                        byte b12 = bArr3[i19];
                        int i25 = b12 & 255;
                        if (this.f81811j == 512 && (((((byte) i25) & 255) | 65280) & 65526) == 65520) {
                            if (!this.f81813l) {
                                int i26 = i19 - 1;
                                jb2Var.e(i19);
                                byte[] bArr4 = this.f81803b.f78552a;
                                if (jb2Var.f78968c - jb2Var.f78967b < 1) {
                                    i22 = i22;
                                } else {
                                    jb2Var.a(bArr4, 0, 1);
                                    this.f81803b.b(i23);
                                    int iA2 = this.f81803b.a(1);
                                    int i27 = this.f81814m;
                                    if (i27 != i22 && iA2 != i27) {
                                        i22 = i22;
                                    } else if (this.f81815n != i22) {
                                        byte[] bArr5 = this.f81803b.f78552a;
                                        if (jb2Var.f78968c - jb2Var.f78967b >= 1) {
                                            jb2Var.a(bArr5, 0, 1);
                                            this.f81803b.b(2);
                                            if (this.f81803b.a(i23) != this.f81815n) {
                                                i22 = -1;
                                            } else {
                                                jb2Var.e(i24);
                                                bArr = this.f81803b.f78552a;
                                                if (jb2Var.f78968c - jb2Var.f78967b < i23) {
                                                    jb2Var.a(bArr, 0, i23);
                                                    this.f81803b.b(14);
                                                    iA = this.f81803b.a(13);
                                                    if (iA < 7) {
                                                        i22 = -1;
                                                    } else {
                                                        bArr2 = jb2Var.f78966a;
                                                        i12 = jb2Var.f78968c;
                                                        i13 = i26 + iA;
                                                        if (i13 >= i12) {
                                                            b10 = bArr2[i13];
                                                            i22 = -1;
                                                            if (b10 == -1) {
                                                                i16 = i13 + 1;
                                                                if (i16 == i12) {
                                                                    b11 = bArr2[i16];
                                                                    if ((((b11 & 255) | 65280) & 65526) == 65520 || ((b11 & 8) >> 3) != iA2) {
                                                                    }
                                                                }
                                                            } else if (b10 == 73 && ((i14 = i13 + 1) == i12 || (bArr2[i14] == 68 && ((i15 = i13 + 2) == i12 || bArr2[i15] == 51)))) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        bArr = this.f81803b.f78552a;
                                        if (jb2Var.f78968c - jb2Var.f78967b < i23) {
                                            jb2Var.a(bArr, 0, i23);
                                            this.f81803b.b(14);
                                            iA = this.f81803b.a(13);
                                            if (iA < 7) {
                                                i22 = -1;
                                            } else {
                                                bArr2 = jb2Var.f78966a;
                                                i12 = jb2Var.f78968c;
                                                i13 = i26 + iA;
                                                if (i13 >= i12) {
                                                    b10 = bArr2[i13];
                                                    i22 = -1;
                                                    if (b10 == -1) {
                                                        i16 = i13 + 1;
                                                        if (i16 == i12) {
                                                            b11 = bArr2[i16];
                                                            if ((((b11 & 255) | 65280) & 65526) == 65520) {
                                                            }
                                                        }
                                                    } else if (b10 == 73) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = this.f81811j;
                                i11 = i10 | i25;
                                if (i11 != 329) {
                                    c10 = 2;
                                    c11 = 3;
                                    this.f81811j = 768;
                                } else if (i11 != 511) {
                                    c10 = 2;
                                    c11 = 3;
                                    this.f81811j = 512;
                                } else if (i11 != 836) {
                                    c10 = 2;
                                    c11 = 3;
                                    this.f81811j = 1024;
                                } else if (i11 != 1075) {
                                    this.f81809h = 2;
                                    this.f81810i = 3;
                                    this.f81819r = 0;
                                    this.f81804c.e(0);
                                    jb2Var.e(i24);
                                } else if (i10 != 256) {
                                    this.f81811j = 256;
                                    i23 = 4;
                                } else {
                                    c10 = 2;
                                    c11 = 3;
                                }
                                i19 = i24;
                                i23 = 4;
                            }
                            this.f81816o = (b12 & 8) >> 3;
                            this.f81812k = (b12 & 1) == 0;
                            if (this.f81813l) {
                                this.f81809h = 3;
                                this.f81810i = 0;
                            } else {
                                this.f81809h = 1;
                                this.f81810i = 0;
                            }
                            jb2Var.e(i24);
                        } else {
                            i22 = i22;
                            i10 = this.f81811j;
                            i11 = i10 | i25;
                            if (i11 != 329) {
                                c10 = 2;
                                c11 = 3;
                                this.f81811j = 768;
                            } else if (i11 != 511) {
                                c10 = 2;
                                c11 = 3;
                                this.f81811j = 512;
                            } else if (i11 != 836) {
                                c10 = 2;
                                c11 = 3;
                                this.f81811j = 1024;
                            } else if (i11 != 1075) {
                                this.f81809h = 2;
                                this.f81810i = 3;
                                this.f81819r = 0;
                                this.f81804c.e(0);
                                jb2Var.e(i24);
                            } else if (i10 != 256) {
                                this.f81811j = 256;
                                i23 = 4;
                            } else {
                                c10 = 2;
                                c11 = 3;
                            }
                            i19 = i24;
                            i23 = 4;
                        }
                    } else {
                        jb2Var.e(i19);
                    }
                }
            } else if (i21 != 1) {
                if (i21 == 2) {
                    byte[] bArr6 = this.f81804c.f78966a;
                    int iMin = Math.min(i20, 10 - this.f81810i);
                    jb2Var.a(bArr6, this.f81810i, iMin);
                    int i28 = this.f81810i + iMin;
                    this.f81810i = i28;
                    if (i28 == 10) {
                        this.f81808g.a(10, this.f81804c);
                        this.f81804c.e(6);
                        m73 m73Var = this.f81808g;
                        int iL = this.f81804c.l() + 10;
                        this.f81809h = 4;
                        this.f81810i = 10;
                        this.f81821t = m73Var;
                        this.f81822u = 0L;
                        this.f81819r = iL;
                    }
                } else if (i21 == 3) {
                    int i29 = this.f81812k ? 7 : 5;
                    byte[] bArr7 = this.f81803b.f78552a;
                    int iMin2 = Math.min(i20, i29 - this.f81810i);
                    jb2Var.a(bArr7, this.f81810i, iMin2);
                    int i30 = this.f81810i + iMin2;
                    this.f81810i = i30;
                    if (i30 == i29) {
                        this.f81803b.b(0);
                        if (this.f81817p) {
                            this.f81803b.c(10);
                        } else {
                            int iA3 = this.f81803b.a(2) + 1;
                            if (iA3 != 2) {
                                ih1.d("AdtsReader", "Detected audio object type: " + iA3 + ", but assuming AAC LC.");
                                iA3 = 2;
                            }
                            this.f81803b.c(5);
                            int iA4 = this.f81803b.a(3);
                            int i31 = this.f81815n;
                            byte[] bArr8 = {(byte) (((iA3 << 3) & 248) | ((i31 >> 1) & 7)), (byte) (((iA4 << 3) & 120) | ((i31 << 7) & 128))};
                            a aVarA = b.a(new ib2(2, bArr8), false);
                            lx0 lx0Var = new lx0();
                            lx0Var.f79957a = this.f81806e;
                            lx0Var.f79967k = "audio/mp4a-latm";
                            lx0Var.f79964h = aVarA.f75343c;
                            lx0Var.f79980x = aVarA.f75342b;
                            lx0Var.f79981y = aVarA.f75341a;
                            lx0Var.f79969m = Collections.singletonList(bArr8);
                            lx0Var.f79959c = this.f81805d;
                            mx0 mx0Var = new mx0(lx0Var);
                            this.f81818q = 1024000000 / ((long) mx0Var.A);
                            this.f81807f.a(mx0Var);
                            this.f81817p = true;
                        }
                        this.f81803b.c(4);
                        int iA5 = this.f81803b.a(13);
                        int i32 = iA5 - 7;
                        if (this.f81812k) {
                            i32 = iA5 - 9;
                        }
                        m73 m73Var2 = this.f81807f;
                        long j10 = this.f81818q;
                        this.f81809h = 4;
                        this.f81810i = 0;
                        this.f81821t = m73Var2;
                        this.f81822u = j10;
                        this.f81819r = i32;
                    }
                } else {
                    if (i21 != 4) {
                        throw new IllegalStateException();
                    }
                    int iMin3 = Math.min(i20, this.f81819r - this.f81810i);
                    this.f81821t.a(iMin3, jb2Var);
                    int i33 = this.f81810i + iMin3;
                    this.f81810i = i33;
                    int i34 = this.f81819r;
                    if (i33 == i34) {
                        long j11 = this.f81820s;
                        if (j11 != -9223372036854775807L) {
                            this.f81821t.a(j11, 1, i34, 0, null);
                            this.f81820s += this.f81822u;
                        }
                        c();
                    }
                }
            } else if (i20 != 0) {
                ib2 ib2Var = this.f81803b;
                ib2Var.f78552a[0] = jb2Var.f78966a[i19];
                ib2Var.b(2);
                int iA6 = this.f81803b.a(4);
                int i35 = this.f81815n;
                if (i35 == -1 || iA6 == i35) {
                    if (!this.f81813l) {
                        this.f81813l = true;
                        this.f81814m = this.f81816o;
                        this.f81815n = iA6;
                    }
                    this.f81809h = 3;
                    this.f81810i = 0;
                } else {
                    this.f81813l = false;
                    c();
                }
            }
        }
    }

    @Override // yads.ul0
    public final void b() {
    }

    public final void c() {
        this.f81809h = 0;
        this.f81810i = 0;
        this.f81811j = 256;
    }

    public qc(String str, boolean z10) {
        this.f81803b = new ib2(new byte[7]);
        this.f81804c = new jb2(Arrays.copyOf(f81801v, 10));
        c();
        this.f81814m = -1;
        this.f81815n = -1;
        this.f81818q = -9223372036854775807L;
        this.f81820s = -9223372036854775807L;
        this.f81802a = z10;
        this.f81805d = str;
    }

    @Override // yads.ul0
    public final void a(pq0 pq0Var, l93 l93Var) {
        l93Var.a();
        l93Var.b();
        this.f81806e = l93Var.f79734e;
        l93Var.b();
        m73 m73VarA = pq0Var.a(l93Var.f79733d, 1);
        this.f81807f = m73VarA;
        this.f81821t = m73VarA;
        if (this.f81802a) {
            l93Var.a();
            l93Var.b();
            m73 m73VarA2 = pq0Var.a(l93Var.f79733d, 5);
            this.f81808g = m73VarA2;
            lx0 lx0Var = new lx0();
            l93Var.b();
            lx0Var.f79957a = l93Var.f79734e;
            lx0Var.f79967k = "application/id3";
            m73VarA2.a(new mx0(lx0Var));
            return;
        }
        this.f81808g = new al0();
    }

    @Override // yads.ul0
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f81820s = j10;
        }
    }

    @Override // yads.ul0
    public final void a() {
        this.f81820s = -9223372036854775807L;
        this.f81813l = false;
        c();
    }
}
