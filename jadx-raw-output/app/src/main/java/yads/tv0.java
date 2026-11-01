package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import yads.mq0;
import yads.tv0;

/* JADX INFO: loaded from: classes11.dex */
public final class tv0 implements mq0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public pq0 f83192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m73 f83193f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ts1 f83195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public bw0 f83196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f83197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f83198k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public sv0 f83199l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f83200m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f83201n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f83188a = new byte[42];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f83189b = new jb2(0, new byte[32768]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f83190c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uv0 f83191d = new uv0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f83194g = 0;

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        this.f83192e = pq0Var;
        this.f83193f = pq0Var.a(0, 1);
        pq0Var.a();
    }

    @Override // yads.mq0
    public final void release() {
    }

    static {
        new rq0() { // from class: cp.sa
            @Override // yads.rq0
            public final mq0[] createExtractors() {
                return tv0.a();
            }
        };
    }

    @Override // yads.mq0
    public final void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f83194g = 0;
        } else {
            sv0 sv0Var = this.f83199l;
            if (sv0Var != null) {
                sv0Var.a(j11);
            }
        }
        this.f83201n = j11 != 0 ? -1L : 0L;
        this.f83200m = 0;
        this.f83189b.c(0);
    }

    /* JADX WARN: Code duplicated, block: B:122:0x02ba  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v8, types: [boolean, int] */
    @Override // yads.mq0
    public final int a(nq0 nq0Var, gg2 gg2Var) throws ob2, EOFException, InterruptedIOException {
        ts1 ts1Var;
        bw0 bw0Var;
        vw2 uw2Var;
        boolean z10;
        long j10;
        boolean zA;
        boolean z11;
        int i10 = this.f83194g;
        ts1 ts1Var2 = null;
        ?? r10 = 0;
        if (i10 == 0) {
            boolean z12 = !this.f83190c;
            ld0 ld0Var = (ld0) nq0Var;
            ld0Var.f79759f = 0;
            long j11 = ld0Var.f79757d + ((long) 0);
            ts1 ts1VarA = new w21().a(ld0Var, z12 ? null : u21.f83330b);
            if (ts1VarA != null && ts1VarA.f83163b.length != 0) {
                ts1Var2 = ts1VarA;
            }
            ld0Var.a((int) ((ld0Var.f79757d + ((long) ld0Var.f79759f)) - j11));
            this.f83195h = ts1Var2;
            this.f83194g = 1;
            return 0;
        }
        if (i10 == 1) {
            byte[] bArr = this.f83188a;
            ld0 ld0Var2 = (ld0) nq0Var;
            ld0Var2.b(bArr, 0, bArr.length, false);
            ld0Var2.f79759f = 0;
            this.f83194g = 2;
            return 0;
        }
        int i11 = 3;
        int i12 = 4;
        if (i10 == 2) {
            byte[] bArr2 = new byte[4];
            ((ld0) nq0Var).a(bArr2, 0, 4, false);
            if (((((long) bArr2[3]) & 255) | ((((long) bArr2[2]) & 255) << 8) | ((((long) bArr2[1]) & 255) << 16) | ((((long) bArr2[0]) & 255) << 24)) == 1716281667) {
                this.f83194g = 3;
                return 0;
            }
            throw new ob2("Failed to read FLAC stream marker.", null, true, 1);
        }
        int i13 = 7;
        if (i10 != 3) {
            long j12 = 0;
            if (i10 == 4) {
                ld0 ld0Var3 = (ld0) nq0Var;
                ld0Var3.f79759f = 0;
                byte[] bArr3 = new byte[2];
                ld0Var3.b(bArr3, 0, 2, false);
                int i14 = ((bArr3[0] & 255) << 8) | (bArr3[1] & 255);
                if ((i14 >> 2) == 16382) {
                    ld0Var3.f79759f = 0;
                    this.f83198k = i14;
                    pq0 pq0Var = this.f83192e;
                    int i15 = ib3.f78556a;
                    long j13 = ld0Var3.f79757d;
                    long j14 = ld0Var3.f79756c;
                    this.f83196i.getClass();
                    bw0 bw0Var2 = this.f83196i;
                    if (bw0Var2.f75991k != null) {
                        uw2Var = new zv0(bw0Var2, j13);
                    } else if (j14 != -1 && bw0Var2.f75990j > 0) {
                        sv0 sv0Var = new sv0(bw0Var2, this.f83198k, j13, j14);
                        this.f83199l = sv0Var;
                        uw2Var = sv0Var.f83130a;
                    } else {
                        uw2Var = new uw2(bw0Var2.b(), 0L);
                    }
                    pq0Var.a(uw2Var);
                    this.f83194g = 5;
                    return 0;
                }
                ld0Var3.f79759f = 0;
                throw new ob2("First frame does not start with sync code.", null, true, 1);
            }
            if (i10 == 5) {
                this.f83193f.getClass();
                this.f83196i.getClass();
                sv0 sv0Var2 = this.f83199l;
                if (sv0Var2 != null && sv0Var2.f83132c != null) {
                    return sv0Var2.a((ld0) nq0Var, gg2Var);
                }
                if (this.f83201n == -1) {
                    bw0 bw0Var3 = this.f83196i;
                    ld0 ld0Var4 = (ld0) nq0Var;
                    ld0Var4.f79759f = 0;
                    ld0Var4.a(false, 1);
                    byte[] bArr4 = new byte[1];
                    ld0Var4.b(bArr4, 0, 1, false);
                    boolean z13 = (bArr4[0] & 1) == 1;
                    ld0Var4.a(false, 2);
                    i13 = z13 ? 7 : 6;
                    jb2 jb2Var = new jb2(i13);
                    byte[] bArr5 = jb2Var.f78966a;
                    int i16 = 0;
                    while (i16 < i13) {
                        int iB = ld0Var4.b(bArr5, i16, i13 - i16);
                        if (iB == -1) {
                            break;
                        }
                        i16 += iB;
                    }
                    jb2Var.d(i16);
                    ld0Var4.f79759f = 0;
                    try {
                        long jS = jb2Var.s();
                        if (!z13) {
                            jS *= (long) bw0Var3.f75982b;
                        }
                        j12 = jS;
                        z11 = true;
                    } catch (NumberFormatException unused) {
                        z11 = false;
                    }
                    if (z11) {
                        this.f83201n = j12;
                        return 0;
                    }
                    throw new ob2(null, null, true, 1);
                }
                jb2 jb2Var2 = this.f83189b;
                int i17 = jb2Var2.f78968c;
                if (i17 < 32768) {
                    int i18 = ((ld0) nq0Var).read(jb2Var2.f78966a, i17, 32768 - i17);
                    z10 = i18 == -1;
                    if (!z10) {
                        this.f83189b.d(i17 + i18);
                    } else {
                        jb2 jb2Var3 = this.f83189b;
                        if (jb2Var3.f78968c - jb2Var3.f78967b == 0) {
                            long j15 = this.f83201n * 1000000;
                            bw0 bw0Var4 = this.f83196i;
                            int i19 = ib3.f78556a;
                            this.f83193f.a(j15 / ((long) bw0Var4.f75985e), 1, this.f83200m, 0, null);
                            return -1;
                        }
                    }
                } else {
                    z10 = false;
                }
                jb2 jb2Var4 = this.f83189b;
                int i20 = jb2Var4.f78967b;
                int i21 = this.f83200m;
                int i22 = this.f83197j;
                if (i21 < i22) {
                    jb2Var4.e(jb2Var4.f78967b + Math.min(i22 - i21, jb2Var4.f78968c - i20));
                }
                jb2 jb2Var5 = this.f83189b;
                this.f83196i.getClass();
                int i23 = jb2Var5.f78967b;
                while (true) {
                    if (i23 > jb2Var5.f78968c - 16) {
                        if (z10) {
                            while (true) {
                                int i24 = jb2Var5.f78968c;
                                if (i23 <= i24 - this.f83197j) {
                                    jb2Var5.e(i23);
                                    try {
                                        zA = vv0.a(jb2Var5, this.f83196i, this.f83198k, this.f83191d);
                                    } catch (IndexOutOfBoundsException unused2) {
                                        zA = false;
                                    }
                                    if (jb2Var5.f78967b <= jb2Var5.f78968c && zA) {
                                        jb2Var5.e(i23);
                                        j10 = this.f83191d.f83671a;
                                        break;
                                    }
                                    i23++;
                                } else {
                                    jb2Var5.e(i24);
                                }
                            }
                        } else {
                            jb2Var5.e(i23);
                        }
                        j10 = -1;
                        break;
                    }
                    jb2Var5.e(i23);
                    if (vv0.a(jb2Var5, this.f83196i, this.f83198k, this.f83191d)) {
                        jb2Var5.e(i23);
                        j10 = this.f83191d.f83671a;
                        break;
                    }
                    i23++;
                }
                jb2 jb2Var6 = this.f83189b;
                int i25 = jb2Var6.f78967b - i20;
                jb2Var6.e(i20);
                this.f83193f.a(i25, this.f83189b);
                int i26 = this.f83200m + i25;
                this.f83200m = i26;
                if (j10 != -1) {
                    long j16 = this.f83201n * 1000000;
                    bw0 bw0Var5 = this.f83196i;
                    int i27 = ib3.f78556a;
                    this.f83193f.a(j16 / ((long) bw0Var5.f75985e), 1, i26, 0, null);
                    this.f83200m = 0;
                    this.f83201n = j10;
                }
                jb2 jb2Var7 = this.f83189b;
                int i28 = jb2Var7.f78968c;
                int i29 = jb2Var7.f78967b;
                int i30 = i28 - i29;
                if (i30 >= 16) {
                    return 0;
                }
                byte[] bArr6 = jb2Var7.f78966a;
                System.arraycopy(bArr6, i29, bArr6, 0, i30);
                this.f83189b.e(0);
                this.f83189b.d(i30);
                return 0;
            }
            throw new IllegalStateException();
        }
        bw0 bw0Var6 = this.f83196i;
        while (true) {
            ld0 ld0Var5 = (ld0) nq0Var;
            ld0Var5.f79759f = r10;
            byte[] bArr7 = new byte[i12];
            ib2 ib2Var = new ib2(i12, bArr7);
            ld0Var5.b(bArr7, r10, i12, r10);
            boolean zE = ib2Var.e();
            int iA = ib2Var.a(i13);
            int iA2 = ib2Var.a(24) + i12;
            if (iA == 0) {
                byte[] bArr8 = new byte[38];
                ld0Var5.a(bArr8, r10, 38, r10);
                bw0Var6 = new bw0(i12, bArr8);
            } else {
                if (bw0Var6 == null) {
                    throw new IllegalArgumentException();
                }
                if (iA == i11) {
                    jb2 jb2Var8 = new jb2(iA2);
                    ld0Var5.a(jb2Var8.f78966a, r10, iA2, r10);
                    bw0Var = new bw0(bw0Var6.f75981a, bw0Var6.f75982b, bw0Var6.f75983c, bw0Var6.f75984d, bw0Var6.f75985e, bw0Var6.f75987g, bw0Var6.f75988h, bw0Var6.f75990j, wv0.a(jb2Var8), bw0Var6.f75992l);
                } else if (iA == i12) {
                    jb2 jb2Var9 = new jb2(iA2);
                    ld0Var5.a(jb2Var9.f78966a, 0, iA2, false);
                    jb2Var9.e(jb2Var9.f78967b + i12);
                    ts1 ts1VarA2 = dn3.a(Arrays.asList(dn3.a(jb2Var9, false, false).f75578a));
                    ts1 ts1Var3 = bw0Var6.f75992l;
                    if (ts1Var3 != null) {
                        if (ts1VarA2 == null) {
                            ts1VarA2 = ts1Var3;
                        } else {
                            ss1[] ss1VarArr = ts1VarA2.f83163b;
                            if (ss1VarArr.length == 0) {
                                ts1VarA2 = ts1Var3;
                            } else {
                                ts1VarA2 = new ts1((ss1[]) ib3.a((Object[]) ts1Var3.f83163b, (Object[]) ss1VarArr));
                            }
                        }
                    }
                    bw0Var = new bw0(bw0Var6.f75981a, bw0Var6.f75982b, bw0Var6.f75983c, bw0Var6.f75984d, bw0Var6.f75985e, bw0Var6.f75987g, bw0Var6.f75988h, bw0Var6.f75990j, bw0Var6.f75991k, ts1VarA2);
                } else if (iA == 6) {
                    jb2 jb2Var10 = new jb2(iA2);
                    ld0Var5.a(jb2Var10.f78966a, 0, iA2, false);
                    jb2Var10.e(jb2Var10.f78967b + 4);
                    int iB2 = jb2Var10.b();
                    String strA = jb2Var10.a(jb2Var10.b(), bu.f75962a);
                    String strA2 = jb2Var10.a(jb2Var10.b(), bu.f75964c);
                    int iB3 = jb2Var10.b();
                    int iB4 = jb2Var10.b();
                    int iB5 = jb2Var10.b();
                    int iB6 = jb2Var10.b();
                    int iB7 = jb2Var10.b();
                    byte[] bArr9 = new byte[iB7];
                    jb2Var10.a(bArr9, 0, iB7);
                    ts1 ts1Var4 = new ts1(p51.a(new ad2(iB2, strA, strA2, iB3, iB4, iB5, iB6, bArr9)));
                    ts1 ts1Var5 = bw0Var6.f75992l;
                    if (ts1Var5 == null) {
                        ts1Var = ts1Var4;
                    } else {
                        ss1[] ss1VarArr2 = ts1Var4.f83163b;
                        ts1Var = ss1VarArr2.length == 0 ? ts1Var5 : new ts1((ss1[]) ib3.a((Object[]) ts1Var5.f83163b, (Object[]) ss1VarArr2));
                    }
                    bw0Var = new bw0(bw0Var6.f75981a, bw0Var6.f75982b, bw0Var6.f75983c, bw0Var6.f75984d, bw0Var6.f75985e, bw0Var6.f75987g, bw0Var6.f75988h, bw0Var6.f75990j, bw0Var6.f75991k, ts1Var);
                } else {
                    ld0Var5.a(iA2);
                }
                bw0Var6 = bw0Var;
            }
            int i31 = ib3.f78556a;
            this.f83196i = bw0Var6;
            if (zE) {
                this.f83197j = Math.max(bw0Var6.f75983c, 6);
                this.f83193f.a(this.f83196i.a(this.f83188a, this.f83195h));
                this.f83194g = 4;
                return 0;
            }
            r10 = 0;
            i11 = 3;
            i12 = 4;
            i13 = 7;
        }
    }

    @Override // yads.mq0
    public final boolean a(nq0 nq0Var) throws EOFException, InterruptedIOException {
        ld0 ld0Var = (ld0) nq0Var;
        ts1 ts1VarA = new w21().a(ld0Var, u21.f83330b);
        if (ts1VarA != null) {
            int length = ts1VarA.f83163b.length;
        }
        byte[] bArr = new byte[4];
        ld0Var.b(bArr, 0, 4, false);
        return ((((long) bArr[3]) & 255) | ((((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16)) | ((((long) bArr[2]) & 255) << 8))) == 1716281667;
    }

    public static mq0[] a() {
        return new mq0[]{new tv0()};
    }
}
