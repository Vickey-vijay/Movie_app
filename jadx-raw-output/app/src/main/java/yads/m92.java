package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import yads.m92;
import yads.mq0;

/* JADX INFO: loaded from: classes11.dex */
public final class m92 implements mq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pq0 f80130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z33 f80131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f80132c;

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        this.f80130a = pq0Var;
    }

    @Override // yads.mq0
    public final void release() {
    }

    static {
        new rq0() { // from class: cp.i6
            @Override // yads.rq0
            public final mq0[] createExtractors() {
                return m92.a();
            }
        };
    }

    @Override // yads.mq0
    public final int a(nq0 nq0Var, gg2 gg2Var) throws ob2, EOFException, InterruptedIOException {
        if (this.f80130a == null) {
            throw new IllegalStateException();
        }
        if (this.f80131b == null) {
            ld0 ld0Var = (ld0) nq0Var;
            if (!a(ld0Var)) {
                throw new ob2("Failed to determine bitstream type", null, true, 1);
            }
            ld0Var.f79759f = 0;
        }
        if (!this.f80132c) {
            m73 m73VarA = this.f80130a.a(0, 1);
            this.f80130a.a();
            z33 z33Var = this.f80131b;
            z33Var.f85197c = this.f80130a;
            z33Var.f85196b = m73VarA;
            z33Var.a(true);
            this.f80132c = true;
        }
        z33 z33Var2 = this.f80131b;
        if (z33Var2.f85196b == null) {
            throw new IllegalStateException();
        }
        int i10 = ib3.f78556a;
        int i11 = z33Var2.f85202h;
        if (i11 == 0) {
            while (true) {
                ld0 ld0Var2 = (ld0) nq0Var;
                if (!z33Var2.f85195a.a(ld0Var2)) {
                    z33Var2.f85202h = 3;
                    break;
                }
                long j10 = ld0Var2.f79757d;
                long j11 = z33Var2.f85200f;
                z33Var2.f85205k = j10 - j11;
                if (!z33Var2.a(z33Var2.f85195a.f80608b, j11, z33Var2.f85204j)) {
                    mx0 mx0Var = z33Var2.f85204j.f84445a;
                    z33Var2.f85203i = mx0Var.A;
                    if (!z33Var2.f85207m) {
                        z33Var2.f85196b.a(mx0Var);
                        z33Var2.f85207m = true;
                    }
                    xv0 xv0Var = z33Var2.f85204j.f84446b;
                    if (xv0Var == null) {
                        long j12 = ld0Var2.f79756c;
                        if (j12 == -1) {
                            z33Var2.f85198d = new y33();
                        } else {
                            o92 o92Var = z33Var2.f85195a.f80607a;
                            z33Var2.f85198d = new me0(z33Var2, z33Var2.f85200f, j12, o92Var.f80979d + o92Var.f80980e, o92Var.f80977b, (o92Var.f80976a & 4) != 0);
                        }
                        z33Var2.f85202h = 2;
                        z33Var2.f85195a.a();
                        return 0;
                    }
                    z33Var2.f85198d = xv0Var;
                    z33Var2.f85202h = 2;
                    z33Var2.f85195a.a();
                    return 0;
                }
                z33Var2.f85200f = ld0Var2.f79757d;
            }
        } else {
            if (i11 == 1) {
                ((ld0) nq0Var).a((int) z33Var2.f85200f);
                z33Var2.f85202h = 2;
                return 0;
            }
            if (i11 == 2) {
                ld0 ld0Var3 = (ld0) nq0Var;
                long jA = z33Var2.f85198d.a(ld0Var3);
                if (jA >= 0) {
                    gg2Var.f77799a = jA;
                    return 1;
                }
                if (jA < -1) {
                    z33Var2.a(-(jA + 2));
                }
                if (!z33Var2.f85206l) {
                    vw2 vw2VarA = z33Var2.f85198d.a();
                    if (vw2VarA == null) {
                        throw new IllegalStateException();
                    }
                    z33Var2.f85197c.a(vw2VarA);
                    z33Var2.f85206l = true;
                }
                if (z33Var2.f85205k > 0 || z33Var2.f85195a.a(ld0Var3)) {
                    z33Var2.f85205k = 0L;
                    jb2 jb2Var = z33Var2.f85195a.f80608b;
                    long jA2 = z33Var2.a(jb2Var);
                    if (jA2 >= 0) {
                        long j13 = z33Var2.f85201g;
                        if (j13 + jA2 >= z33Var2.f85199e) {
                            long j14 = (j13 * 1000000) / ((long) z33Var2.f85203i);
                            z33Var2.f85196b.a(jb2Var.f78968c, jb2Var);
                            z33Var2.f85196b.a(j14, 1, jb2Var.f78968c, 0, null);
                            z33Var2.f85199e = -1L;
                        }
                    }
                    z33Var2.f85201g += jA2;
                    return 0;
                }
                z33Var2.f85202h = 3;
            } else if (i11 != 3) {
                throw new IllegalStateException();
            }
        }
        return -1;
    }

    @Override // yads.mq0
    public final void seek(long j10, long j11) {
        z33 z33Var = this.f80131b;
        if (z33Var != null) {
            n92 n92Var = z33Var.f85195a;
            o92 o92Var = n92Var.f80607a;
            o92Var.f80976a = 0;
            o92Var.f80977b = 0L;
            o92Var.f80978c = 0;
            o92Var.f80979d = 0;
            o92Var.f80980e = 0;
            n92Var.f80608b.c(0);
            n92Var.f80609c = -1;
            n92Var.f80611e = false;
            if (j10 == 0) {
                z33Var.a(!z33Var.f85206l);
                return;
            }
            if (z33Var.f85202h != 0) {
                long j12 = (((long) z33Var.f85203i) * j11) / 1000000;
                z33Var.f85199e = j12;
                p92 p92Var = z33Var.f85198d;
                int i10 = ib3.f78556a;
                p92Var.a(j12);
                z33Var.f85202h = 2;
            }
        }
    }

    @Override // yads.mq0
    public final boolean a(nq0 nq0Var) {
        try {
            return a((ld0) nq0Var);
        } catch (ob2 unused) {
            return false;
        }
    }

    public static /* synthetic */ mq0[] a() {
        return new mq0[]{new m92()};
    }

    public final boolean a(ld0 ld0Var) {
        o92 o92Var = new o92();
        if (o92Var.a(ld0Var, true) && (o92Var.f80976a & 2) == 2) {
            int iMin = Math.min(o92Var.f80980e, 8);
            jb2 jb2Var = new jb2(iMin);
            ld0Var.b(jb2Var.f78966a, 0, iMin, false);
            jb2Var.e(0);
            if (jb2Var.f78968c - jb2Var.f78967b >= 5 && jb2Var.m() == 127 && jb2Var.n() == 1179402563) {
                this.f80131b = new yv0();
            } else {
                jb2Var.e(0);
                try {
                    if (dn3.a(1, jb2Var, true)) {
                        this.f80131b = new zm3();
                    } else {
                        jb2Var.e(0);
                        if (qa2.a(jb2Var, qa2.f81780o)) {
                            this.f80131b = new qa2();
                        }
                    }
                } catch (ob2 unused) {
                }
            }
            return true;
        }
        return false;
    }
}
