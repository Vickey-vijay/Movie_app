package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes11.dex */
public final class ce1 implements mq0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public pq0 f76239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f76240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f76241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f76242e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public hv1 f76244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public nq0 f76245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m33 f76246i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public kv1 f76247j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb2 f76238a = new jb2(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f76243f = -1;

    public final void a() {
        pq0 pq0Var = this.f76239b;
        pq0Var.getClass();
        m73 m73VarA = pq0Var.a(1024, 4);
        lx0 lx0Var = new lx0();
        lx0Var.f79966j = "image/jpeg";
        lx0Var.f79965i = new ts1(new ss1[0]);
        m73VarA.a(new mx0(lx0Var));
        pq0 pq0Var2 = this.f76239b;
        pq0Var2.getClass();
        pq0Var2.a();
        this.f76239b.a(new uw2(-9223372036854775807L, 0L));
        this.f76240c = 6;
    }

    @Override // yads.mq0
    public final void release() {
    }

    @Override // yads.mq0
    public final void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f76240c = 0;
            this.f76247j = null;
        } else if (this.f76240c == 5) {
            kv1 kv1Var = this.f76247j;
            kv1Var.getClass();
            kv1Var.seek(j10, j11);
        }
    }

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        this.f76239b = pq0Var;
    }

    /* JADX WARN: Code duplicated, block: B:99:0x019c  */
    @Override // yads.mq0
    public final int a(nq0 nq0Var, gg2 gg2Var) throws EOFException, InterruptedIOException {
        String strA;
        String strA2;
        fv1 fv1VarA;
        hv1 hv1Var;
        long j10;
        int i10 = this.f76240c;
        if (i10 == 0) {
            this.f76238a.c(2);
            ((ld0) nq0Var).a(this.f76238a.f78966a, 0, 2, false);
            int iR = this.f76238a.r();
            this.f76241d = iR;
            if (iR == 65498) {
                if (this.f76243f != -1) {
                    this.f76240c = 4;
                } else {
                    a();
                }
            } else if ((iR < 65488 || iR > 65497) && iR != 65281) {
                this.f76240c = 1;
            }
            return 0;
        }
        if (i10 == 1) {
            this.f76238a.c(2);
            ((ld0) nq0Var).a(this.f76238a.f78966a, 0, 2, false);
            this.f76242e = this.f76238a.r() - 2;
            this.f76240c = 2;
            return 0;
        }
        if (i10 != 2) {
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f76246i == null || nq0Var != this.f76245h) {
                    this.f76245h = nq0Var;
                    this.f76246i = new m33((ld0) nq0Var, this.f76243f);
                }
                kv1 kv1Var = this.f76247j;
                kv1Var.getClass();
                int iA = kv1Var.a(this.f76246i, gg2Var);
                if (iA == 1) {
                    gg2Var.f77799a += this.f76243f;
                }
                return iA;
            }
            ld0 ld0Var = (ld0) nq0Var;
            long j11 = ld0Var.f79757d;
            long j12 = this.f76243f;
            if (j11 != j12) {
                gg2Var.f77799a = j12;
                return 1;
            }
            if (!ld0Var.b(this.f76238a.f78966a, 0, 1, true)) {
                a();
            } else {
                ld0Var.f79759f = 0;
                if (this.f76247j == null) {
                    this.f76247j = new kv1();
                }
                m33 m33Var = new m33(ld0Var, this.f76243f);
                this.f76246i = m33Var;
                this.f76247j.getClass();
                if (s13.a(m33Var, false, false)) {
                    kv1 kv1Var2 = this.f76247j;
                    long j13 = this.f76243f;
                    pq0 pq0Var = this.f76239b;
                    pq0Var.getClass();
                    kv1Var2.f79596q = new o33(j13, pq0Var);
                    hv1 hv1Var2 = this.f76244g;
                    hv1Var2.getClass();
                    ss1[] ss1VarArr = {hv1Var2};
                    pq0 pq0Var2 = this.f76239b;
                    pq0Var2.getClass();
                    m73 m73VarA = pq0Var2.a(1024, 4);
                    lx0 lx0Var = new lx0();
                    lx0Var.f79966j = "image/jpeg";
                    lx0Var.f79965i = new ts1(ss1VarArr);
                    m73VarA.a(new mx0(lx0Var));
                    this.f76240c = 5;
                } else {
                    a();
                }
            }
            return 0;
        }
        if (this.f76241d == 65505) {
            int i11 = this.f76242e;
            byte[] bArr = new byte[i11];
            ld0 ld0Var2 = (ld0) nq0Var;
            ld0Var2.a(bArr, 0, i11, false);
            if (this.f76244g == null) {
                int i12 = 0;
                if (i11 == 0) {
                    strA = null;
                } else {
                    while (i12 < i11 && bArr[i12] != 0) {
                        i12++;
                    }
                    strA = ib3.a(bArr, 0, i12);
                    if (i12 < i11) {
                        i12++;
                    }
                }
                if ("http://ns.adobe.com/xap/1.0/".equals(strA)) {
                    if (i11 - i12 == 0) {
                        strA2 = null;
                    } else {
                        int i13 = i12;
                        while (i13 < i11 && bArr[i13] != 0) {
                            i13++;
                        }
                        strA2 = ib3.a(bArr, i12, i13 - i12);
                    }
                    if (strA2 != null) {
                        long j14 = ld0Var2.f79756c;
                        if (j14 == -1) {
                            hv1Var = null;
                        } else {
                            try {
                                fv1VarA = tp3.a(strA2);
                            } catch (NumberFormatException | XmlPullParserException | ob2 unused) {
                                ih1.d("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                                fv1VarA = null;
                            }
                            if (fv1VarA != null && fv1VarA.f77506b.size() >= 2) {
                                long j15 = -1;
                                long j16 = -1;
                                long j17 = -1;
                                long j18 = -1;
                                boolean zEquals = false;
                                for (int size = fv1VarA.f77506b.size() - 1; size >= 0; size--) {
                                    ev1 ev1Var = (ev1) fv1VarA.f77506b.get(size);
                                    zEquals |= "video/mp4".equals(ev1Var.f77207a);
                                    if (size == 0) {
                                        j10 = j14 - ev1Var.f77209c;
                                        j14 = 0;
                                    } else {
                                        j10 = j14;
                                        j14 -= ev1Var.f77208b;
                                    }
                                    if (zEquals && j14 != j10) {
                                        j18 = j10 - j14;
                                        zEquals = false;
                                        j17 = j14;
                                    }
                                    if (size == 0) {
                                        j16 = j10;
                                        j15 = j14;
                                    }
                                }
                                if (j17 == -1 || j18 == -1 || j15 == -1 || j16 == -1) {
                                    hv1Var = null;
                                } else {
                                    hv1Var = new hv1(j15, j16, fv1VarA.f77505a, j17, j18);
                                }
                            } else {
                                hv1Var = null;
                            }
                        }
                        this.f76244g = hv1Var;
                        if (hv1Var != null) {
                            this.f76243f = hv1Var.f78398e;
                        }
                    }
                }
            }
        } else {
            ((ld0) nq0Var).a(this.f76242e);
        }
        this.f76240c = 0;
        return 0;
    }

    @Override // yads.mq0
    public final boolean a(nq0 nq0Var) throws EOFException, InterruptedIOException {
        ld0 ld0Var = (ld0) nq0Var;
        this.f76238a.c(2);
        ld0Var.b(this.f76238a.f78966a, 0, 2, false);
        if (this.f76238a.r() != 65496) {
            return false;
        }
        this.f76238a.c(2);
        ld0Var.b(this.f76238a.f78966a, 0, 2, false);
        int iR = this.f76238a.r();
        this.f76241d = iR;
        if (iR == 65504) {
            this.f76238a.c(2);
            ld0Var.b(this.f76238a.f78966a, 0, 2, false);
            ld0Var.a(false, this.f76238a.r() - 2);
            this.f76238a.c(2);
            ld0Var.b(this.f76238a.f78966a, 0, 2, false);
            this.f76241d = this.f76238a.r();
        }
        if (this.f76241d != 65505) {
            return false;
        }
        ld0Var.a(false, 2);
        this.f76238a.c(6);
        ld0Var.b(this.f76238a.f78966a, 0, 6, false);
        return this.f76238a.n() == 1165519206 && this.f76238a.r() == 0;
    }
}
