package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import yads.iv1;
import yads.mq0;

/* JADX INFO: loaded from: classes5.dex */
public final class iv1 implements mq0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s21 f78819t;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final al0 f78825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public pq0 f78826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m73 f78827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m73 f78828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f78829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ts1 f78830k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f78832m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f78833n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f78834o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public zw2 f78835p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f78836q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f78837r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f78838s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78820a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f78821b = new jb2(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ov1 f78822c = new ov1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zy0 f78823d = new zy0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f78831l = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w21 f78824e = new w21();

    public static long a(ts1 ts1Var) {
        if (ts1Var == null) {
            return -9223372036854775807L;
        }
        int length = ts1Var.f83163b.length;
        for (int i10 = 0; i10 < length; i10++) {
            ss1 ss1Var = ts1Var.f83163b[i10];
            if (ss1Var instanceof y53) {
                y53 y53Var = (y53) ss1Var;
                if (y53Var.f83729b.equals("TLEN")) {
                    return ib3.a(Long.parseLong(y53Var.f84829d));
                }
            }
        }
        return -9223372036854775807L;
    }

    public static /* synthetic */ boolean a(int i10, int i11, int i12, int i13, int i14) {
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    @Override // yads.mq0
    public final void release() {
    }

    @Override // yads.mq0
    public final void seek(long j10, long j11) {
        this.f78829j = 0;
        this.f78831l = -9223372036854775807L;
        this.f78832m = 0L;
        this.f78834o = 0;
        this.f78838s = j11;
        zw2 zw2Var = this.f78835p;
        if (!(zw2Var instanceof j61) || ((j61) zw2Var).c(j11)) {
            return;
        }
        this.f78837r = true;
        this.f78828i = this.f78825f;
    }

    static {
        new rq0() { // from class: cp.h3
            @Override // yads.rq0
            public final mq0[] createExtractors() {
                return iv1.a();
            }
        };
        f78819t = new s21() { // from class: cp.i3
            @Override // yads.s21
            public final boolean a(int i10, int i11, int i12, int i13, int i14) {
                return iv1.a(i10, i11, i12, i13, i14);
            }
        };
    }

    public iv1(int i10) {
        al0 al0Var = new al0();
        this.f78825f = al0Var;
        this.f78828i = al0Var;
    }

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        this.f78826g = pq0Var;
        m73 m73VarA = pq0Var.a(0, 1);
        this.f78827h = m73VarA;
        this.f78828i = m73VarA;
        this.f78826g.a();
    }

    public final boolean a(ld0 ld0Var) {
        zw2 zw2Var = this.f78835p;
        if (zw2Var != null) {
            long jA = zw2Var.a();
            if (jA != -1 && ld0Var.f79757d + ((long) ld0Var.f79759f) > jA - 4) {
                return true;
            }
        }
        try {
            return !ld0Var.b(this.f78821b.f78966a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x027a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0280  */
    /* JADX WARN: Code duplicated, block: B:109:0x02a3 A[LOOP:1: B:108:0x02a1->B:109:0x02a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x02c5 A[LOOP:0: B:104:0x027e->B:111:0x02c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x02c8 A[EDGE_INSN: B:112:0x02c8->B:113:0x02ca BREAK  A[LOOP:0: B:104:0x027e->B:111:0x02c5]] */
    /* JADX WARN: Code duplicated, block: B:115:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:116:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:118:0x02db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:11:0x003b  */
    /* JADX WARN: Code duplicated, block: B:122:0x02e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:124:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:126:0x02ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x0301  */
    /* JADX WARN: Code duplicated, block: B:128:0x0303 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x0306  */
    /* JADX WARN: Code duplicated, block: B:138:0x0319  */
    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:140:0x031f  */
    /* JADX WARN: Code duplicated, block: B:141:0x0321  */
    /* JADX WARN: Code duplicated, block: B:145:0x0377  */
    /* JADX WARN: Code duplicated, block: B:146:0x037a  */
    /* JADX WARN: Code duplicated, block: B:148:0x038b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:150:0x0393  */
    /* JADX WARN: Code duplicated, block: B:152:0x039e  */
    /* JADX WARN: Code duplicated, block: B:156:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:159:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:161:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:179:0x0445  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:181:0x0451 A[PHI: r0
  0x0451: PHI (r0v1 'this' yads.iv1) = (r0v0 'this' yads.iv1), (r0v3 'this' yads.iv1), (r0v3 'this' yads.iv1) binds: [B:195:0x0451, B:180:0x044f, B:157:0x03b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:182:0x0454  */
    /* JADX WARN: Code duplicated, block: B:184:0x045b  */
    /* JADX WARN: Code duplicated, block: B:185:0x045e  */
    /* JADX WARN: Code duplicated, block: B:198:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0288 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:66:0x0163  */
    /* JADX WARN: Code duplicated, block: B:68:0x0178  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:87:0x0206  */
    /* JADX WARN: Code duplicated, block: B:90:0x020b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0232 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x0234  */
    /* JADX WARN: Code duplicated, block: B:96:0x0241  */
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    @Override // yads.mq0
    public final int a(nq0 nq0Var, gg2 gg2Var) throws ob2, EOFException, InterruptedIOException {
        int i10;
        int i11;
        long j10;
        nq0 nq0Var2;
        ld0 ld0Var;
        long j11;
        int iA;
        int i12;
        ld0 ld0Var2;
        int iB;
        jb2 jb2Var;
        ld0 ld0Var3;
        ov1 ov1Var;
        int i13;
        int iB2;
        long jA;
        int iB3;
        ld0 ld0Var4;
        int i14;
        int i15;
        zw2 hzVar;
        zy0 zy0Var;
        zy0 zy0Var2;
        int i16;
        int i17;
        int iP;
        ts1 ts1Var;
        long j12;
        lt1 lt1Var;
        boolean z10;
        zw2 hzVar2;
        long jA2;
        long j13;
        ts1 ts1Var2;
        int length;
        int i18;
        ss1 ss1Var;
        kt1 kt1Var;
        int length2;
        long[] jArr;
        long[] jArr2;
        int i19;
        long j14;
        ld0 ld0Var5;
        int iM;
        this = this;
        if (this.f78827h != null) {
            int i20 = ib3.f78556a;
            if (this.f78829j == 0) {
                try {
                    this.a((ld0) nq0Var, false);
                    if (this.f78835p == null) {
                        jb2Var = new jb2(this.f78822c.f81158c);
                        ld0Var3 = (ld0) nq0Var;
                        ld0Var3.b(jb2Var.f78966a, 0, this.f78822c.f81158c, false);
                        ov1Var = this.f78822c;
                        if ((ov1Var.f81156a & 1) != 0) {
                            if (ov1Var.f81160e != 1) {
                                i13 = 36;
                            } else {
                                i13 = 21;
                            }
                        } else if (ov1Var.f81160e != 1) {
                            i13 = 21;
                        } else {
                            i13 = 13;
                        }
                        if (jb2Var.f78968c >= i13 + 4) {
                            jb2Var.e(i13);
                            iB2 = jb2Var.b();
                            if (iB2 != 1483304551 && iB2 != 1231971951) {
                                if (jb2Var.f78968c >= 40) {
                                    jb2Var.e(36);
                                    if (jb2Var.b() == 1447187017) {
                                        iB2 = 1447187017;
                                    } else {
                                        iB2 = 0;
                                    }
                                } else {
                                    iB2 = 0;
                                }
                            }
                        } else if (jb2Var.f78968c >= 40) {
                            jb2Var.e(36);
                            if (jb2Var.b() == 1447187017) {
                                iB2 = 1447187017;
                            } else {
                                iB2 = 0;
                            }
                        } else {
                            iB2 = 0;
                        }
                        String str = ", ";
                        jA = -1;
                        if (iB2 != 1483304551 || iB2 == 1231971951) {
                            long j15 = ld0Var3.f79756c;
                            long j16 = ld0Var3.f79757d;
                            ov1 ov1Var2 = this.f78822c;
                            int i21 = ov1Var2.f81162g;
                            int i22 = ov1Var2.f81159d;
                            iB3 = jb2Var.b();
                            if ((iB3 & 1) == 1 || (iP = jb2Var.p()) == 0) {
                                ld0Var4 = ld0Var3;
                                i14 = i13;
                                i15 = iB2;
                                hzVar = null;
                            } else {
                                i14 = i13;
                                i15 = iB2;
                                long j17 = iP;
                                ld0Var4 = ld0Var3;
                                long jA3 = ib3.a(j17, ((long) i21) * 1000000, i22);
                                if ((iB3 & 6) != 6) {
                                    hzVar = new op3(j16, ov1Var2.f81158c, jA3, -1L, null);
                                } else {
                                    long jN = jb2Var.n();
                                    long[] jArr3 = new long[100];
                                    for (int i23 = 0; i23 < 100; i23++) {
                                        jArr3[i23] = jb2Var.m();
                                    }
                                    if (j15 != -1) {
                                        long j18 = j16 + jN;
                                        if (j15 != j18) {
                                            ih1.d("XingSeeker", "XING data size mismatch: " + j15 + ", " + j18);
                                        }
                                    }
                                    hzVar = new op3(j16, ov1Var2.f81158c, jA3, jN, jArr3);
                                }
                            }
                            if (hzVar != null) {
                                zy0Var = this.f78823d;
                                if (zy0Var.f85653a != -1 || zy0Var.f85654b == -1) {
                                    ld0Var4.f79759f = 0;
                                    ld0Var4.a(false, i14 + 141);
                                    ld0Var4.b(this.f78821b.f78966a, 0, 3, false);
                                    this.f78821b.e(0);
                                    zy0Var2 = this.f78823d;
                                    int iO = this.f78821b.o();
                                    zy0Var2.getClass();
                                    i16 = iO >> 12;
                                    i17 = iO & 4095;
                                    if (i16 <= 0 || i17 > 0) {
                                        zy0Var2.f85653a = i16;
                                        zy0Var2.f85654b = i17;
                                    }
                                }
                            }
                            ld0Var4.a(this.f78822c.f81158c);
                            if (hzVar != null && !hzVar.b() && i15 == 1231971951) {
                                ld0Var4.b(this.f78821b.f78966a, 0, 4, false);
                                this.f78821b.e(0);
                                this.f78822c.a(this.f78821b.b());
                                hzVar = new hz(ld0Var4.f79756c, ld0Var4.f79757d, this.f78822c, false);
                            }
                        } else if (iB2 == 1447187017) {
                            long j19 = ld0Var3.f79756c;
                            long j20 = ld0Var3.f79757d;
                            ov1 ov1Var3 = this.f78822c;
                            jb2Var.e(jb2Var.f78967b + 10);
                            int iB4 = jb2Var.b();
                            if (iB4 <= 0) {
                                ld0Var5 = ld0Var3;
                            } else {
                                int i24 = ov1Var3.f81159d;
                                long jA4 = ib3.a(iB4, ((long) (i24 >= 32000 ? 1152 : 576)) * 1000000, i24);
                                int iR = jb2Var.r();
                                int iR2 = jb2Var.r();
                                int iR3 = jb2Var.r();
                                jb2Var.e(jb2Var.f78967b + 2);
                                long j21 = j20 + ((long) ov1Var3.f81158c);
                                long[] jArr4 = new long[iR];
                                long[] jArr5 = new long[iR];
                                long j22 = j20;
                                int i25 = 0;
                                while (true) {
                                    if (i25 < iR) {
                                        ld0Var5 = ld0Var3;
                                        String str2 = str;
                                        long j23 = j19;
                                        jArr4[i25] = (((long) i25) * jA4) / ((long) iR);
                                        jArr5[i25] = Math.max(j22, j21);
                                        if (iR3 == 1) {
                                            iM = jb2Var.m();
                                        } else if (iR3 == 2) {
                                            iM = jb2Var.r();
                                        } else if (iR3 == 3) {
                                            iM = jb2Var.o();
                                        } else if (iR3 == 4) {
                                            iM = jb2Var.p();
                                        }
                                        j22 += ((long) iM) * ((long) iR2);
                                        i25++;
                                        ld0Var3 = ld0Var5;
                                        str = str2;
                                        j19 = j23;
                                    } else {
                                        long j24 = j19;
                                        ld0Var5 = ld0Var3;
                                        String str3 = str;
                                        if (j24 != -1 && j24 != j22) {
                                            ih1.d("VbriSeeker", "VBRI data size mismatch: " + j24 + str3 + j22);
                                        }
                                        hzVar = new fd3(jArr4, jArr5, jA4, j22);
                                        break;
                                    }
                                }
                                ld0Var5.a(this.f78822c.f81158c);
                                ld0Var4 = ld0Var5;
                            }
                            hzVar = null;
                            ld0Var5.a(this.f78822c.f81158c);
                            ld0Var4 = ld0Var5;
                        } else {
                            ld0Var3.f79759f = 0;
                            ld0Var4 = ld0Var3;
                            hzVar = null;
                        }
                        ts1Var = this.f78830k;
                        j12 = ld0Var4.f79757d;
                        if (ts1Var != null) {
                            lt1Var = null;
                            break;
                        }
                        length = ts1Var.f83163b.length;
                        i18 = 0;
                        while (true) {
                            if (i18 < length) {
                                lt1Var = null;
                                break;
                            }
                            ss1Var = ts1Var.f83163b[i18];
                            if (ss1Var instanceof kt1) {
                                kt1Var = (kt1) ss1Var;
                                long jA5 = a(ts1Var);
                                length2 = kt1Var.f79563f.length;
                                int i26 = length2 + 1;
                                jArr = new long[i26];
                                jArr2 = new long[i26];
                                jArr[0] = j12;
                                jArr2[0] = 0;
                                j14 = 0;
                                for (i19 = 1; i19 <= length2; i19++) {
                                    int i27 = i19 - 1;
                                    j12 += (long) (kt1Var.f79561d + kt1Var.f79563f[i27]);
                                    j14 += (long) (kt1Var.f79562e + kt1Var.f79564g[i27]);
                                    jArr[i19] = j12;
                                    jArr2[i19] = j14;
                                }
                                lt1Var = new lt1(jA5, jArr, jArr2);
                                break;
                            }
                            i18++;
                        }
                        if (this.f78836q) {
                            hzVar2 = new yw2();
                        } else {
                            if ((this.f78820a & 4) != 0) {
                                if (lt1Var != null) {
                                    jA2 = lt1Var.f79909c;
                                } else {
                                    if (hzVar != null) {
                                        long jC = hzVar.c();
                                        jA = hzVar.a();
                                        j13 = jC;
                                    } else {
                                        jA2 = a(this.f78830k);
                                    }
                                    hzVar = new j61(j13, ld0Var4.f79757d, jA);
                                }
                                j13 = jA2;
                                hzVar = new j61(j13, ld0Var4.f79757d, jA);
                            } else if (lt1Var != null) {
                                hzVar = lt1Var;
                            } else if (hzVar == null) {
                                hzVar = null;
                            }
                            if (hzVar == null && (hzVar.b() || (this.f78820a & 1) == 0)) {
                                hzVar2 = hzVar;
                            } else {
                                if ((this.f78820a & 2) != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                ld0Var4.b(this.f78821b.f78966a, 0, 4, false);
                                this.f78821b.e(0);
                                this.f78822c.a(this.f78821b.b());
                                hzVar2 = new hz(ld0Var4.f79756c, ld0Var4.f79757d, this.f78822c, z10);
                            }
                        }
                        this.f78835p = hzVar2;
                        this.f78826g.a(hzVar2);
                        m73 m73Var = this.f78828i;
                        lx0 lx0Var = new lx0();
                        ov1 ov1Var4 = this.f78822c;
                        lx0Var.f79967k = ov1Var4.f81157b;
                        lx0Var.f79968l = 4096;
                        lx0Var.f79980x = ov1Var4.f81160e;
                        lx0Var.f79981y = ov1Var4.f81159d;
                        zy0 zy0Var3 = this.f78823d;
                        lx0Var.A = zy0Var3.f85653a;
                        lx0Var.B = zy0Var3.f85654b;
                        if ((this.f78820a & 8) != 0) {
                            ts1Var2 = null;
                        } else {
                            ts1Var2 = this.f78830k;
                        }
                        lx0Var.f79965i = ts1Var2;
                        m73Var.a(new mx0(lx0Var));
                        this.f78833n = ld0Var4.f79757d;
                    } else {
                        j10 = this.f78833n;
                        if (j10 != 0) {
                            nq0Var2 = nq0Var;
                            ld0Var = (ld0) nq0Var2;
                            j11 = ld0Var.f79757d;
                            if (j11 < j10) {
                                ld0Var.a((int) (j10 - j11));
                            }
                        }
                        if (this.f78834o == 0) {
                            ld0Var2 = (ld0) nq0Var2;
                            ld0Var2.f79759f = 0;
                            if (this.a(ld0Var2)) {
                                i10 = -1;
                                i11 = -1;
                            } else {
                                this.f78821b.e(0);
                                iB = this.f78821b.b();
                                if (((-128000) & iB) != (((long) this.f78829j) & (-128000)) && pv1.a(iB) != -1) {
                                    this.f78822c.a(iB);
                                    if (this.f78831l == -9223372036854775807L) {
                                        this.f78831l = this.f78835p.a(ld0Var2.f79757d);
                                    }
                                    ov1 ov1Var5 = this.f78822c;
                                    int i28 = ov1Var5.f81158c;
                                    this.f78834o = i28;
                                    zw2 zw2Var = this.f78835p;
                                    if (zw2Var instanceof j61) {
                                        j61 j61Var = (j61) zw2Var;
                                        long j25 = (((this.f78832m + ((long) ov1Var5.f81162g)) * 1000000) / ((long) ov1Var5.f81159d)) + this.f78831l;
                                        long j26 = ld0Var2.f79757d + ((long) i28);
                                        if (!j61Var.c(j25)) {
                                            j61Var.f78923b.a(j25);
                                            j61Var.f78924c.a(j26);
                                        }
                                        if (this.f78837r && j61Var.c(this.f78838s)) {
                                            this.f78837r = false;
                                            this.f78828i = this.f78827h;
                                        }
                                    }
                                    iA = this.f78828i.a(nq0Var2, this.f78834o, true);
                                    if (iA == -1) {
                                        i10 = -1;
                                        i11 = -1;
                                    } else {
                                        i12 = this.f78834o - iA;
                                        this.f78834o = i12;
                                        if (i12 <= 0) {
                                            m73 m73Var2 = this.f78828i;
                                            long j27 = this.f78832m;
                                            long j28 = this.f78831l;
                                            ov1 ov1Var6 = this.f78822c;
                                            m73Var2.a(j28 + ((j27 * 1000000) / ((long) ov1Var6.f81159d)), 1, ov1Var6.f81158c, 0, null);
                                            this.f78832m += (long) this.f78822c.f81162g;
                                            this.f78834o = 0;
                                            i11 = 0;
                                            i10 = -1;
                                        }
                                    }
                                } else {
                                    ld0Var2.a(1);
                                    this.f78829j = 0;
                                }
                                i10 = -1;
                                i11 = 0;
                            }
                        } else {
                            iA = this.f78828i.a(nq0Var2, this.f78834o, true);
                            if (iA == -1) {
                                i10 = -1;
                                i11 = -1;
                            } else {
                                i12 = this.f78834o - iA;
                                this.f78834o = i12;
                                if (i12 <= 0) {
                                    i10 = -1;
                                    i11 = 0;
                                } else {
                                    m73 m73Var3 = this.f78828i;
                                    long j29 = this.f78832m;
                                    long j210 = this.f78831l;
                                    ov1 ov1Var7 = this.f78822c;
                                    m73Var3.a(j210 + ((j29 * 1000000) / ((long) ov1Var7.f81159d)), 1, ov1Var7.f81158c, 0, null);
                                    this.f78832m += (long) this.f78822c.f81162g;
                                    this.f78834o = 0;
                                    i11 = 0;
                                    i10 = -1;
                                }
                            }
                        }
                    }
                    nq0Var2 = nq0Var;
                    if (this.f78834o == 0) {
                        ld0Var2 = (ld0) nq0Var2;
                        ld0Var2.f79759f = 0;
                        if (this.a(ld0Var2)) {
                            i10 = -1;
                            i11 = -1;
                        } else {
                            this.f78821b.e(0);
                            iB = this.f78821b.b();
                            if (((-128000) & iB) != (((long) this.f78829j) & (-128000))) {
                            }
                            ld0Var2.a(1);
                            this.f78829j = 0;
                            i10 = -1;
                            i11 = 0;
                        }
                    } else {
                        iA = this.f78828i.a(nq0Var2, this.f78834o, true);
                        if (iA == -1) {
                            i10 = -1;
                            i11 = -1;
                        } else {
                            i12 = this.f78834o - iA;
                            this.f78834o = i12;
                            if (i12 <= 0) {
                                i10 = -1;
                                i11 = 0;
                            } else {
                                m73 m73Var4 = this.f78828i;
                                long j211 = this.f78832m;
                                long j212 = this.f78831l;
                                ov1 ov1Var8 = this.f78822c;
                                m73Var4.a(j212 + ((j211 * 1000000) / ((long) ov1Var8.f81159d)), 1, ov1Var8.f81158c, 0, null);
                                this.f78832m += (long) this.f78822c.f81162g;
                                this.f78834o = 0;
                                i11 = 0;
                                i10 = -1;
                            }
                        }
                    }
                } catch (EOFException unused) {
                }
            } else {
                if (this.f78835p == null) {
                    jb2Var = new jb2(this.f78822c.f81158c);
                    ld0Var3 = (ld0) nq0Var;
                    ld0Var3.b(jb2Var.f78966a, 0, this.f78822c.f81158c, false);
                    ov1Var = this.f78822c;
                    if ((ov1Var.f81156a & 1) != 0) {
                        if (ov1Var.f81160e != 1) {
                            i13 = 36;
                        } else {
                            i13 = 21;
                        }
                    } else if (ov1Var.f81160e != 1) {
                        i13 = 21;
                    } else {
                        i13 = 13;
                    }
                    if (jb2Var.f78968c >= i13 + 4) {
                        jb2Var.e(i13);
                        iB2 = jb2Var.b();
                        if (iB2 != 1483304551) {
                            if (jb2Var.f78968c >= 40) {
                                jb2Var.e(36);
                                if (jb2Var.b() == 1447187017) {
                                    iB2 = 1447187017;
                                } else {
                                    iB2 = 0;
                                }
                            } else {
                                iB2 = 0;
                            }
                        }
                    } else if (jb2Var.f78968c >= 40) {
                        jb2Var.e(36);
                        if (jb2Var.b() == 1447187017) {
                            iB2 = 1447187017;
                        } else {
                            iB2 = 0;
                        }
                    } else {
                        iB2 = 0;
                    }
                    String str4 = ", ";
                    jA = -1;
                    if (iB2 != 1483304551) {
                        long j110 = ld0Var3.f79756c;
                        long j111 = ld0Var3.f79757d;
                        ov1 ov1Var9 = this.f78822c;
                        int i29 = ov1Var9.f81162g;
                        int i210 = ov1Var9.f81159d;
                        iB3 = jb2Var.b();
                        if ((iB3 & 1) == 1) {
                            ld0Var4 = ld0Var3;
                            i14 = i13;
                            i15 = iB2;
                            hzVar = null;
                        } else {
                            ld0Var4 = ld0Var3;
                            i14 = i13;
                            i15 = iB2;
                            hzVar = null;
                        }
                        if (hzVar != null) {
                            zy0Var = this.f78823d;
                            if (zy0Var.f85653a != -1) {
                                ld0Var4.f79759f = 0;
                                ld0Var4.a(false, i14 + 141);
                                ld0Var4.b(this.f78821b.f78966a, 0, 3, false);
                                this.f78821b.e(0);
                                zy0Var2 = this.f78823d;
                                int iO2 = this.f78821b.o();
                                zy0Var2.getClass();
                                i16 = iO2 >> 12;
                                i17 = iO2 & 4095;
                                if (i16 <= 0) {
                                    zy0Var2.f85653a = i16;
                                    zy0Var2.f85654b = i17;
                                } else {
                                    zy0Var2.f85653a = i16;
                                    zy0Var2.f85654b = i17;
                                }
                            } else {
                                ld0Var4.f79759f = 0;
                                ld0Var4.a(false, i14 + 141);
                                ld0Var4.b(this.f78821b.f78966a, 0, 3, false);
                                this.f78821b.e(0);
                                zy0Var2 = this.f78823d;
                                int iO3 = this.f78821b.o();
                                zy0Var2.getClass();
                                i16 = iO3 >> 12;
                                i17 = iO3 & 4095;
                                if (i16 <= 0) {
                                    zy0Var2.f85653a = i16;
                                    zy0Var2.f85654b = i17;
                                } else {
                                    zy0Var2.f85653a = i16;
                                    zy0Var2.f85654b = i17;
                                }
                            }
                        }
                        ld0Var4.a(this.f78822c.f81158c);
                        if (hzVar != null) {
                            ld0Var4.b(this.f78821b.f78966a, 0, 4, false);
                            this.f78821b.e(0);
                            this.f78822c.a(this.f78821b.b());
                            hzVar = new hz(ld0Var4.f79756c, ld0Var4.f79757d, this.f78822c, false);
                        }
                    } else {
                        long j112 = ld0Var3.f79756c;
                        long j113 = ld0Var3.f79757d;
                        ov1 ov1Var10 = this.f78822c;
                        int i211 = ov1Var10.f81162g;
                        int i212 = ov1Var10.f81159d;
                        iB3 = jb2Var.b();
                        if ((iB3 & 1) == 1) {
                            ld0Var4 = ld0Var3;
                            i14 = i13;
                            i15 = iB2;
                            hzVar = null;
                        } else {
                            ld0Var4 = ld0Var3;
                            i14 = i13;
                            i15 = iB2;
                            hzVar = null;
                        }
                        if (hzVar != null) {
                            zy0Var = this.f78823d;
                            if (zy0Var.f85653a != -1) {
                                ld0Var4.f79759f = 0;
                                ld0Var4.a(false, i14 + 141);
                                ld0Var4.b(this.f78821b.f78966a, 0, 3, false);
                                this.f78821b.e(0);
                                zy0Var2 = this.f78823d;
                                int iO4 = this.f78821b.o();
                                zy0Var2.getClass();
                                i16 = iO4 >> 12;
                                i17 = iO4 & 4095;
                                if (i16 <= 0) {
                                    zy0Var2.f85653a = i16;
                                    zy0Var2.f85654b = i17;
                                } else {
                                    zy0Var2.f85653a = i16;
                                    zy0Var2.f85654b = i17;
                                }
                            } else {
                                ld0Var4.f79759f = 0;
                                ld0Var4.a(false, i14 + 141);
                                ld0Var4.b(this.f78821b.f78966a, 0, 3, false);
                                this.f78821b.e(0);
                                zy0Var2 = this.f78823d;
                                int iO5 = this.f78821b.o();
                                zy0Var2.getClass();
                                i16 = iO5 >> 12;
                                i17 = iO5 & 4095;
                                if (i16 <= 0) {
                                    zy0Var2.f85653a = i16;
                                    zy0Var2.f85654b = i17;
                                } else {
                                    zy0Var2.f85653a = i16;
                                    zy0Var2.f85654b = i17;
                                }
                            }
                        }
                        ld0Var4.a(this.f78822c.f81158c);
                        if (hzVar != null) {
                            ld0Var4.b(this.f78821b.f78966a, 0, 4, false);
                            this.f78821b.e(0);
                            this.f78822c.a(this.f78821b.b());
                            hzVar = new hz(ld0Var4.f79756c, ld0Var4.f79757d, this.f78822c, false);
                        }
                    }
                    ts1Var = this.f78830k;
                    j12 = ld0Var4.f79757d;
                    if (ts1Var != null) {
                        lt1Var = null;
                        break;
                    }
                    length = ts1Var.f83163b.length;
                    i18 = 0;
                    while (true) {
                        if (i18 < length) {
                            lt1Var = null;
                            break;
                        }
                        ss1Var = ts1Var.f83163b[i18];
                        if (ss1Var instanceof kt1) {
                            kt1Var = (kt1) ss1Var;
                            long jA6 = a(ts1Var);
                            length2 = kt1Var.f79563f.length;
                            int i213 = length2 + 1;
                            jArr = new long[i213];
                            jArr2 = new long[i213];
                            jArr[0] = j12;
                            jArr2[0] = 0;
                            j14 = 0;
                            while (i19 <= length2) {
                                int i214 = i19 - 1;
                                j12 += (long) (kt1Var.f79561d + kt1Var.f79563f[i214]);
                                j14 += (long) (kt1Var.f79562e + kt1Var.f79564g[i214]);
                                jArr[i19] = j12;
                                jArr2[i19] = j14;
                            }
                            lt1Var = new lt1(jA6, jArr, jArr2);
                            break;
                        }
                        i18++;
                    }
                    if (this.f78836q) {
                        hzVar2 = new yw2();
                    } else {
                        if ((this.f78820a & 4) != 0) {
                            if (lt1Var != null) {
                                jA2 = lt1Var.f79909c;
                            } else {
                                if (hzVar != null) {
                                    long jC2 = hzVar.c();
                                    jA = hzVar.a();
                                    j13 = jC2;
                                } else {
                                    jA2 = a(this.f78830k);
                                }
                                hzVar = new j61(j13, ld0Var4.f79757d, jA);
                            }
                            j13 = jA2;
                            hzVar = new j61(j13, ld0Var4.f79757d, jA);
                        } else if (lt1Var != null) {
                            hzVar = lt1Var;
                        } else if (hzVar == null) {
                            hzVar = null;
                        }
                        if (hzVar == null) {
                            if ((this.f78820a & 2) != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ld0Var4.b(this.f78821b.f78966a, 0, 4, false);
                            this.f78821b.e(0);
                            this.f78822c.a(this.f78821b.b());
                            hzVar2 = new hz(ld0Var4.f79756c, ld0Var4.f79757d, this.f78822c, z10);
                        } else {
                            if ((this.f78820a & 2) != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ld0Var4.b(this.f78821b.f78966a, 0, 4, false);
                            this.f78821b.e(0);
                            this.f78822c.a(this.f78821b.b());
                            hzVar2 = new hz(ld0Var4.f79756c, ld0Var4.f79757d, this.f78822c, z10);
                        }
                    }
                    this.f78835p = hzVar2;
                    this.f78826g.a(hzVar2);
                    m73 m73Var5 = this.f78828i;
                    lx0 lx0Var2 = new lx0();
                    ov1 ov1Var11 = this.f78822c;
                    lx0Var2.f79967k = ov1Var11.f81157b;
                    lx0Var2.f79968l = 4096;
                    lx0Var2.f79980x = ov1Var11.f81160e;
                    lx0Var2.f79981y = ov1Var11.f81159d;
                    zy0 zy0Var4 = this.f78823d;
                    lx0Var2.A = zy0Var4.f85653a;
                    lx0Var2.B = zy0Var4.f85654b;
                    if ((this.f78820a & 8) != 0) {
                        ts1Var2 = null;
                    } else {
                        ts1Var2 = this.f78830k;
                    }
                    lx0Var2.f79965i = ts1Var2;
                    m73Var5.a(new mx0(lx0Var2));
                    this.f78833n = ld0Var4.f79757d;
                } else {
                    j10 = this.f78833n;
                    if (j10 != 0) {
                        nq0Var2 = nq0Var;
                        ld0Var = (ld0) nq0Var2;
                        j11 = ld0Var.f79757d;
                        if (j11 < j10) {
                            ld0Var.a((int) (j10 - j11));
                        }
                    }
                    if (this.f78834o == 0) {
                        ld0Var2 = (ld0) nq0Var2;
                        ld0Var2.f79759f = 0;
                        if (this.a(ld0Var2)) {
                            i10 = -1;
                            i11 = -1;
                        } else {
                            this.f78821b.e(0);
                            iB = this.f78821b.b();
                            if (((-128000) & iB) != (((long) this.f78829j) & (-128000))) {
                            }
                            ld0Var2.a(1);
                            this.f78829j = 0;
                            i10 = -1;
                            i11 = 0;
                        }
                    } else {
                        iA = this.f78828i.a(nq0Var2, this.f78834o, true);
                        if (iA == -1) {
                            i10 = -1;
                            i11 = -1;
                        } else {
                            i12 = this.f78834o - iA;
                            this.f78834o = i12;
                            if (i12 <= 0) {
                                i10 = -1;
                                i11 = 0;
                            } else {
                                m73 m73Var6 = this.f78828i;
                                long j213 = this.f78832m;
                                long j214 = this.f78831l;
                                ov1 ov1Var12 = this.f78822c;
                                m73Var6.a(j214 + ((j213 * 1000000) / ((long) ov1Var12.f81159d)), 1, ov1Var12.f81158c, 0, null);
                                this.f78832m += (long) this.f78822c.f81162g;
                                this.f78834o = 0;
                                i11 = 0;
                                i10 = -1;
                            }
                        }
                    }
                }
                nq0Var2 = nq0Var;
                if (this.f78834o == 0) {
                    ld0Var2 = (ld0) nq0Var2;
                    ld0Var2.f79759f = 0;
                    if (this.a(ld0Var2)) {
                        i10 = -1;
                        i11 = -1;
                    } else {
                        this.f78821b.e(0);
                        iB = this.f78821b.b();
                        if (((-128000) & iB) != (((long) this.f78829j) & (-128000))) {
                        }
                        ld0Var2.a(1);
                        this.f78829j = 0;
                        i10 = -1;
                        i11 = 0;
                    }
                } else {
                    iA = this.f78828i.a(nq0Var2, this.f78834o, true);
                    if (iA == -1) {
                        i10 = -1;
                        i11 = -1;
                    } else {
                        i12 = this.f78834o - iA;
                        this.f78834o = i12;
                        if (i12 <= 0) {
                            i10 = -1;
                            i11 = 0;
                        } else {
                            m73 m73Var7 = this.f78828i;
                            long j215 = this.f78832m;
                            long j216 = this.f78831l;
                            ov1 ov1Var13 = this.f78822c;
                            m73Var7.a(j216 + ((j215 * 1000000) / ((long) ov1Var13.f81159d)), 1, ov1Var13.f81158c, 0, null);
                            this.f78832m += (long) this.f78822c.f81162g;
                            this.f78834o = 0;
                            i11 = 0;
                            i10 = -1;
                        }
                    }
                }
            }
            if (i11 == i10) {
                zw2 zw2Var2 = this.f78835p;
                if (zw2Var2 instanceof j61) {
                    long j30 = ((this.f78832m * 1000000) / ((long) this.f78822c.f81159d)) + this.f78831l;
                    if (zw2Var2.c() != j30) {
                        zw2 zw2Var3 = this.f78835p;
                        ((j61) zw2Var3).f78925d = j30;
                        this.f78826g.a(zw2Var3);
                    }
                }
            }
            return i11;
        }
        throw new IllegalStateException();
    }

    @Override // yads.mq0
    public final boolean a(nq0 nq0Var) {
        return a((ld0) nq0Var, true);
    }

    public final boolean a(ld0 ld0Var, boolean z10) throws ob2, EOFException, InterruptedIOException {
        int i10;
        int i11;
        int iA;
        int i12 = z10 ? 32768 : 131072;
        ld0Var.f79759f = 0;
        if (ld0Var.f79757d == 0) {
            ts1 ts1VarA = this.f78824e.a(ld0Var, (this.f78820a & 8) == 0 ? null : f78819t);
            this.f78830k = ts1VarA;
            if (ts1VarA != null) {
                this.f78823d.a(ts1VarA);
            }
            i10 = (int) (ld0Var.f79757d + ((long) ld0Var.f79759f));
            if (!z10) {
                ld0Var.a(i10);
            }
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        int i13 = i11;
        int i14 = i13;
        while (true) {
            if (a(ld0Var)) {
                if (i13 > 0) {
                    break;
                }
                throw new EOFException();
            }
            this.f78821b.e(0);
            int iB = this.f78821b.b();
            if ((i11 == 0 || ((-128000) & iB) == (((long) i11) & (-128000))) && (iA = pv1.a(iB)) != -1) {
                i13++;
                if (i13 != 1) {
                    if (i13 == 4) {
                        break;
                    }
                } else {
                    this.f78822c.a(iB);
                    i11 = iB;
                }
                ld0Var.a(false, iA - 4);
            } else {
                int i15 = i14 + 1;
                if (i14 == i12) {
                    if (z10) {
                        return false;
                    }
                    throw new ob2("Searched too many bytes.", null, true, 1);
                }
                if (z10) {
                    ld0Var.f79759f = 0;
                    ld0Var.a(false, i10 + i15);
                } else {
                    ld0Var.a(1);
                }
                i13 = 0;
                i14 = i15;
                i11 = 0;
            }
        }
        if (z10) {
            ld0Var.a(i10 + i14);
        } else {
            ld0Var.f79759f = 0;
        }
        this.f78829j = i11;
        return true;
    }

    public static mq0[] a() {
        return new mq0[]{new iv1(0)};
    }
}
