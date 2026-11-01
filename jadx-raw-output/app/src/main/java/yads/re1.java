package yads;

import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class re1 implements ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f82226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ib2 f82227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m73 f82228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f82229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public mx0 f82230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f82231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f82232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f82233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f82234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f82235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f82236l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f82237m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f82238n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f82239o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f82240p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f82241q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f82242r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f82243s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f82244t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f82245u;

    @Override // yads.ul0
    public final void a(jb2 jb2Var) throws ob2 {
        int i10;
        boolean zE;
        if (this.f82228d == null) {
            throw new IllegalStateException();
        }
        while (true) {
            int i11 = jb2Var.f78968c - jb2Var.f78967b;
            if (i11 <= 0) {
                return;
            }
            int i12 = this.f82231g;
            if (i12 != 0) {
                if (i12 == 1) {
                    int iM = jb2Var.m();
                    if ((iM & 224) == 224) {
                        this.f82234j = iM;
                        this.f82231g = 2;
                    } else if (iM != 86) {
                        this.f82231g = 0;
                    }
                } else if (i12 == 2) {
                    int iM2 = ((this.f82234j & (-225)) << 8) | jb2Var.m();
                    this.f82233i = iM2;
                    jb2 jb2Var2 = this.f82226b;
                    if (iM2 > jb2Var2.f78966a.length) {
                        jb2Var2.c(iM2);
                        ib2 ib2Var = this.f82227c;
                        byte[] bArr = this.f82226b.f78966a;
                        ib2Var.getClass();
                        ib2Var.a(bArr.length, bArr);
                    }
                    this.f82232h = 0;
                    this.f82231g = 3;
                } else {
                    if (i12 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(i11, this.f82233i - this.f82232h);
                    jb2Var.a(this.f82227c.f78552a, this.f82232h, iMin);
                    int i13 = this.f82232h + iMin;
                    this.f82232h = i13;
                    if (i13 == this.f82233i) {
                        this.f82227c.b(0);
                        ib2 ib2Var2 = this.f82227c;
                        if (ib2Var2.e()) {
                            if (this.f82236l) {
                            }
                            this.f82231g = 0;
                        } else {
                            this.f82236l = true;
                            int iA = ib2Var2.a(1);
                            int iA2 = iA == 1 ? ib2Var2.a(1) : 0;
                            this.f82237m = iA2;
                            if (iA2 != 0) {
                                throw new ob2(null, null, true, 1);
                            }
                            if (iA == 1) {
                                ib2Var2.a((ib2Var2.a(2) + 1) * 8);
                            }
                            if (!ib2Var2.e()) {
                                throw new ob2(null, null, true, 1);
                            }
                            this.f82238n = ib2Var2.a(6);
                            int iA3 = ib2Var2.a(4);
                            int iA4 = ib2Var2.a(3);
                            if (iA3 != 0 || iA4 != 0) {
                                throw new ob2(null, null, true, 1);
                            }
                            if (iA == 0) {
                                int iD = ib2Var2.d();
                                int iB = ib2Var2.b();
                                a aVarA = b.a(ib2Var2, true);
                                this.f82245u = aVarA.f75343c;
                                this.f82242r = aVarA.f75341a;
                                this.f82244t = aVarA.f75342b;
                                int iB2 = iB - ib2Var2.b();
                                ib2Var2.b(iD);
                                byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                ib2Var2.a(bArr2, iB2);
                                lx0 lx0Var = new lx0();
                                lx0Var.f79957a = this.f82229e;
                                lx0Var.f79967k = "audio/mp4a-latm";
                                lx0Var.f79964h = this.f82245u;
                                lx0Var.f79980x = this.f82244t;
                                lx0Var.f79981y = this.f82242r;
                                lx0Var.f79969m = Collections.singletonList(bArr2);
                                lx0Var.f79959c = this.f82225a;
                                mx0 mx0Var = new mx0(lx0Var);
                                if (!mx0Var.equals(this.f82230f)) {
                                    this.f82230f = mx0Var;
                                    this.f82243s = 1024000000 / ((long) mx0Var.A);
                                    this.f82228d.a(mx0Var);
                                }
                            } else {
                                int iA5 = ib2Var2.a((ib2Var2.a(2) + 1) * 8);
                                int iB3 = ib2Var2.b();
                                a aVarA2 = b.a(ib2Var2, true);
                                this.f82245u = aVarA2.f75343c;
                                this.f82242r = aVarA2.f75341a;
                                this.f82244t = aVarA2.f75342b;
                                ib2Var2.c(iA5 - (iB3 - ib2Var2.b()));
                            }
                            int iA6 = ib2Var2.a(3);
                            this.f82239o = iA6;
                            if (iA6 == 0) {
                                ib2Var2.c(8);
                            } else if (iA6 == 1) {
                                ib2Var2.c(9);
                            } else if (iA6 == 3 || iA6 == 4 || iA6 == 5) {
                                ib2Var2.c(6);
                            } else {
                                if (iA6 != 6 && iA6 != 7) {
                                    throw new IllegalStateException();
                                }
                                ib2Var2.c(1);
                            }
                            boolean zE2 = ib2Var2.e();
                            this.f82240p = zE2;
                            this.f82241q = 0L;
                            if (zE2) {
                                if (iA == 1) {
                                    this.f82241q = ib2Var2.a((ib2Var2.a(2) + 1) * 8);
                                } else {
                                    do {
                                        zE = ib2Var2.e();
                                        this.f82241q = (this.f82241q << 8) + ((long) ib2Var2.a(8));
                                    } while (zE);
                                }
                            }
                            if (ib2Var2.e()) {
                                ib2Var2.c(8);
                            }
                        }
                        if (this.f82237m != 0) {
                            throw new ob2(null, null, true, 1);
                        }
                        if (this.f82238n != 0) {
                            throw new ob2(null, null, true, 1);
                        }
                        if (this.f82239o != 0) {
                            throw new ob2(null, null, true, 1);
                        }
                        int i14 = 0;
                        while (true) {
                            int iA7 = ib2Var2.a(8);
                            i10 = i14 + iA7;
                            if (iA7 != 255) {
                                break;
                            } else {
                                i14 = i10;
                            }
                        }
                        int iD2 = ib2Var2.d();
                        if ((iD2 & 7) == 0) {
                            this.f82226b.e(iD2 >> 3);
                        } else {
                            ib2Var2.a(this.f82226b.f78966a, i10 * 8);
                            this.f82226b.e(0);
                        }
                        this.f82228d.a(i10, this.f82226b);
                        long j10 = this.f82235k;
                        if (j10 != -9223372036854775807L) {
                            this.f82228d.a(j10, 1, i10, 0, null);
                            this.f82235k += this.f82243s;
                        }
                        if (this.f82240p) {
                            ib2Var2.c((int) this.f82241q);
                        }
                        this.f82231g = 0;
                    } else {
                        continue;
                    }
                }
            } else if (jb2Var.m() == 86) {
                this.f82231g = 1;
            }
        }
    }

    @Override // yads.ul0
    public final void b() {
    }

    public re1(String str) {
        this.f82225a = str;
        jb2 jb2Var = new jb2(1024);
        this.f82226b = jb2Var;
        this.f82227c = new ib2(jb2Var.a());
        this.f82235k = -9223372036854775807L;
    }

    @Override // yads.ul0
    public final void a(pq0 pq0Var, l93 l93Var) {
        l93Var.a();
        l93Var.b();
        this.f82228d = pq0Var.a(l93Var.f79733d, 1);
        l93Var.b();
        this.f82229e = l93Var.f79734e;
    }

    @Override // yads.ul0
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f82235k = j10;
        }
    }

    @Override // yads.ul0
    public final void a() {
        this.f82231g = 0;
        this.f82235k = -9223372036854775807L;
        this.f82236l = false;
    }
}
