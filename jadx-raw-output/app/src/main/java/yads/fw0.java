package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import yads.fw0;
import yads.mq0;

/* JADX INFO: loaded from: classes8.dex */
public final class fw0 implements mq0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pq0 f77516f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f77518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f77519i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f77520j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f77521k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f77522l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f77523m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f77524n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public kl f77525o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public uj3 f77526p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb2 f77511a = new jb2(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f77512b = new jb2(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jb2 f77513c = new jb2(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jb2 f77514d = new jb2();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final us2 f77515e = new us2();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f77517g = 1;

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        this.f77516f = pq0Var;
    }

    @Override // yads.mq0
    public final void release() {
    }

    static {
        new rq0() { // from class: cp.a2
            @Override // yads.rq0
            public final mq0[] createExtractors() {
                return fw0.a();
            }
        };
    }

    public final jb2 a(ld0 ld0Var) throws EOFException, InterruptedIOException {
        int i10 = this.f77522l;
        jb2 jb2Var = this.f77514d;
        byte[] bArr = jb2Var.f78966a;
        if (i10 > bArr.length) {
            jb2Var.f78966a = new byte[Math.max(bArr.length * 2, i10)];
            jb2Var.f78968c = 0;
            jb2Var.f78967b = 0;
        } else {
            jb2Var.e(0);
        }
        this.f77514d.d(this.f77522l);
        ld0Var.a(this.f77514d.f78966a, 0, this.f77522l, false);
        return this.f77514d;
    }

    @Override // yads.mq0
    public final void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f77517g = 1;
            this.f77518h = false;
        } else {
            this.f77517g = 3;
        }
        this.f77520j = 0;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00df  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0005 A[SYNTHETIC] */
    @Override // yads.mq0
    public final int a(nq0 nq0Var, gg2 gg2Var) throws ob2, EOFException, InterruptedIOException {
        long j10;
        boolean zA;
        boolean z10;
        if (this.f77516f == null) {
            throw new IllegalStateException();
        }
        while (true) {
            int i10 = this.f77517g;
            if (i10 == 1) {
                if (!((ld0) nq0Var).a(this.f77512b.f78966a, 0, 9, true)) {
                    return -1;
                }
                this.f77512b.e(0);
                jb2 jb2Var = this.f77512b;
                jb2Var.e(jb2Var.f78967b + 4);
                int iM = this.f77512b.m();
                boolean z11 = (iM & 4) != 0;
                boolean z12 = (iM & 1) != 0;
                if (z11 && this.f77525o == null) {
                    this.f77525o = new kl(this.f77516f.a(8, 1));
                }
                if (z12 && this.f77526p == null) {
                    this.f77526p = new uj3(this.f77516f.a(9, 2));
                }
                this.f77516f.a();
                this.f77520j = this.f77512b.b() - 5;
                this.f77517g = 2;
            } else if (i10 == 2) {
                ((ld0) nq0Var).a(this.f77520j);
                this.f77520j = 0;
                this.f77517g = 3;
            } else if (i10 == 3) {
                if (!((ld0) nq0Var).a(this.f77513c.f78966a, 0, 11, true)) {
                    return -1;
                }
                this.f77513c.e(0);
                this.f77521k = this.f77513c.m();
                this.f77522l = this.f77513c.o();
                this.f77523m = this.f77513c.o();
                this.f77523m = (((long) (this.f77513c.m() << 24)) | this.f77523m) * 1000;
                jb2 jb2Var2 = this.f77513c;
                jb2Var2.e(jb2Var2.f78967b + 3);
                this.f77517g = 4;
            } else if (i10 == 4) {
                if (this.f77518h) {
                    j10 = this.f77519i + this.f77523m;
                } else {
                    j10 = this.f77515e.f83591b == -9223372036854775807L ? 0L : this.f77523m;
                }
                int i11 = this.f77521k;
                if (i11 == 8 && this.f77525o != null) {
                    if (!this.f77524n) {
                        this.f77516f.a(new uw2(-9223372036854775807L, 0L));
                        this.f77524n = true;
                    }
                    kl klVar = this.f77525o;
                    jb2 jb2VarA = a((ld0) nq0Var);
                    klVar.a(jb2VarA);
                    zA = klVar.a(j10, jb2VarA);
                } else {
                    if (i11 == 9 && this.f77526p != null) {
                        if (!this.f77524n) {
                            this.f77516f.a(new uw2(-9223372036854775807L, 0L));
                            this.f77524n = true;
                        }
                        uj3 uj3Var = this.f77526p;
                        jb2 jb2VarA2 = a((ld0) nq0Var);
                        if (uj3Var.a(jb2VarA2) && uj3Var.a(j10, jb2VarA2)) {
                            zA = true;
                            z10 = zA;
                        } else {
                            zA = false;
                        }
                    } else if (i11 == 18 && !this.f77524n) {
                        us2 us2Var = this.f77515e;
                        jb2 jb2VarA3 = a((ld0) nq0Var);
                        us2Var.getClass();
                        zA = us2Var.a(j10, jb2VarA3);
                        us2 us2Var2 = this.f77515e;
                        long j11 = us2Var2.f83591b;
                        if (j11 != -9223372036854775807L) {
                            this.f77516f.a(new i61(j11, us2Var2.f83593d, us2Var2.f83592c));
                            this.f77524n = true;
                        }
                    } else {
                        ((ld0) nq0Var).a(this.f77522l);
                        zA = false;
                        z10 = zA;
                    }
                    if (!this.f77518h && zA) {
                        this.f77518h = true;
                        this.f77519i = this.f77515e.f83591b == -9223372036854775807L ? -this.f77523m : 0L;
                    }
                    this.f77520j = 4;
                    this.f77517g = 2;
                    if (z10) {
                        return 0;
                    }
                }
                z10 = true;
                if (!this.f77518h) {
                    this.f77518h = true;
                    this.f77519i = this.f77515e.f83591b == -9223372036854775807L ? -this.f77523m : 0L;
                }
                this.f77520j = 4;
                this.f77517g = 2;
                if (z10) {
                    return 0;
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // yads.mq0
    public final boolean a(nq0 nq0Var) throws EOFException, InterruptedIOException {
        ld0 ld0Var = (ld0) nq0Var;
        ld0Var.b(this.f77511a.f78966a, 0, 3, false);
        this.f77511a.e(0);
        if (this.f77511a.o() != 4607062) {
            return false;
        }
        ld0Var.b(this.f77511a.f78966a, 0, 2, false);
        this.f77511a.e(0);
        if ((this.f77511a.r() & 250) != 0) {
            return false;
        }
        ld0Var.b(this.f77511a.f78966a, 0, 4, false);
        this.f77511a.e(0);
        int iB = this.f77511a.b();
        ld0Var.f79759f = 0;
        ld0Var.a(false, iB);
        ld0Var.b(this.f77511a.f78966a, 0, 4, false);
        this.f77511a.e(0);
        return this.f77511a.b() == 0;
    }

    public static /* synthetic */ mq0[] a() {
        return new mq0[]{new fw0()};
    }
}
