package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import yads.mq0;

/* JADX INFO: loaded from: classes10.dex */
public final class pc implements mq0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jb2 f81351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ib2 f81352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pq0 f81353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f81354g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f81357j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f81358k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f81359l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f81348a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qc f81349b = new qc();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jb2 f81350c = new jb2(2048);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f81356i = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f81355h = -1;

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        this.f81353f = pq0Var;
        this.f81349b.a(pq0Var, new l93(Integer.MIN_VALUE, 0, 1));
        pq0Var.a();
    }

    @Override // yads.mq0
    public final void release() {
    }

    @Override // yads.mq0
    public final void seek(long j10, long j11) {
        this.f81358k = false;
        this.f81349b.a();
        this.f81354g = j11;
    }

    static {
        new rq0() { // from class: cp.c8
            @Override // yads.rq0
            public final mq0[] createExtractors() {
                return yads.pc.a();
            }
        };
    }

    public pc() {
        jb2 jb2Var = new jb2(10);
        this.f81351d = jb2Var;
        this.f81352e = new ib2(jb2Var.a());
    }

    public final int a(ld0 ld0Var) throws EOFException, InterruptedIOException {
        int i10 = 0;
        while (true) {
            ld0Var.b(this.f81351d.f78966a, 0, 10, false);
            this.f81351d.e(0);
            if (this.f81351d.o() != 4801587) {
                break;
            }
            jb2 jb2Var = this.f81351d;
            jb2Var.e(jb2Var.f78967b + 3);
            int iL = this.f81351d.l();
            i10 += iL + 10;
            ld0Var.a(false, iL);
        }
        ld0Var.f79759f = 0;
        ld0Var.a(false, i10);
        if (this.f81355h == -1) {
            this.f81355h = i10;
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0119  */
    @Override // yads.mq0
    public final int a(nq0 nq0Var, gg2 gg2Var) throws ob2, EOFException, InterruptedIOException {
        long j10;
        if (this.f81353f != null) {
            ld0 ld0Var = (ld0) nq0Var;
            long j11 = ld0Var.f79756c;
            int i10 = this.f81348a;
            int i11 = 2;
            if (((i10 & 2) == 0 && ((i10 & 1) == 0 || j11 == -1)) || this.f81357j) {
                j10 = j11;
            } else {
                this.f81356i = -1;
                ld0Var.f79759f = 0;
                if (ld0Var.f79757d == 0) {
                    a(ld0Var);
                }
                long j12 = 0;
                int i12 = 0;
                while (true) {
                    try {
                        ld0 ld0Var2 = (ld0) nq0Var;
                        if (ld0Var2.b(this.f81351d.f78966a, 0, i11, true)) {
                            this.f81351d.e(0);
                            if ((this.f81351d.r() & 65526) != 65520) {
                                j10 = j11;
                                i12 = 0;
                                break;
                            }
                            if (ld0Var2.b(this.f81351d.f78966a, 0, 4, true)) {
                                this.f81352e.b(14);
                                int iA = this.f81352e.a(13);
                                if (iA <= 6) {
                                    j10 = j11;
                                    this.f81357j = true;
                                    throw new ob2("Malformed ADTS stream", null, true, 1);
                                }
                                j10 = j11;
                                j12 += (long) iA;
                                i12++;
                                if (i12 == 1000) {
                                    break;
                                }
                                try {
                                    if (!ld0Var2.a(true, iA - 6)) {
                                        break;
                                    }
                                    j11 = j10;
                                    i11 = 2;
                                } catch (EOFException unused) {
                                }
                            }
                        }
                    } catch (EOFException unused2) {
                    }
                    j10 = j11;
                    break;
                }
                ld0Var.f79759f = 0;
                if (i12 > 0) {
                    this.f81356i = (int) (j12 / ((long) i12));
                } else {
                    this.f81356i = -1;
                }
                this.f81357j = true;
            }
            int i13 = ld0Var.read(this.f81350c.f78966a, 0, 2048);
            boolean z10 = i13 == -1;
            if (!this.f81359l) {
                int i14 = this.f81348a;
                boolean z11 = (i14 & 1) != 0 && this.f81356i > 0;
                if (!z11 || this.f81349b.f81818q != -9223372036854775807L || z10) {
                    if (z11) {
                        long j13 = this.f81349b.f81818q;
                        if (j13 != -9223372036854775807L) {
                            pq0 pq0Var = this.f81353f;
                            boolean z12 = (i14 & 2) != 0;
                            int i15 = this.f81356i;
                            pq0Var.a(new gz((int) ((((long) i15) * 8000000) / j13), i15, j10, this.f81355h, z12));
                        } else {
                            this.f81353f.a(new uw2(-9223372036854775807L, 0L));
                        }
                    } else {
                        this.f81353f.a(new uw2(-9223372036854775807L, 0L));
                    }
                    this.f81359l = true;
                }
            }
            if (z10) {
                return -1;
            }
            this.f81350c.e(0);
            this.f81350c.d(i13);
            if (!this.f81358k) {
                this.f81349b.a(4, this.f81354g);
                this.f81358k = true;
            }
            this.f81349b.a(this.f81350c);
            return 0;
        }
        throw new IllegalStateException();
    }

    @Override // yads.mq0
    public final boolean a(nq0 nq0Var) throws EOFException, InterruptedIOException {
        ld0 ld0Var = (ld0) nq0Var;
        int iA = a(ld0Var);
        int i10 = iA;
        int i11 = 0;
        int i12 = 0;
        do {
            ld0Var.b(this.f81351d.f78966a, 0, 2, false);
            this.f81351d.e(0);
            if ((this.f81351d.r() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                ld0Var.b(this.f81351d.f78966a, 0, 4, false);
                this.f81352e.b(14);
                int iA2 = this.f81352e.a(13);
                if (iA2 <= 6) {
                    i10++;
                    ld0Var.f79759f = 0;
                    ld0Var.a(false, i10);
                } else {
                    ld0Var.a(false, iA2 - 6);
                    i12 += iA2;
                }
            } else {
                i10++;
                ld0Var.f79759f = 0;
                ld0Var.a(false, i10);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - iA < 8192);
        return false;
    }

    public static mq0[] a() {
        return new mq0[]{new pc()};
    }
}
