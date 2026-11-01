package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import yads.mq0;

/* JADX INFO: loaded from: classes11.dex */
public final class i0 implements mq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f78418a = new j0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f78419b = new jb2(16384);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f78420c;

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        j0 j0Var = this.f78418a;
        j0Var.getClass();
        j0Var.f78861d = "0";
        j0Var.f78862e = pq0Var.a(0, 1);
        pq0Var.a();
        pq0Var.a(new uw2(-9223372036854775807L, 0L));
    }

    @Override // yads.mq0
    public final void release() {
    }

    @Override // yads.mq0
    public final void seek(long j10, long j11) {
        this.f78420c = false;
        this.f78418a.a();
    }

    static {
        new rq0() { // from class: cp.n2
            @Override // yads.rq0
            public final mq0[] createExtractors() {
                return yads.i0.a();
            }
        };
    }

    @Override // yads.mq0
    public final int a(nq0 nq0Var, gg2 gg2Var) throws EOFException, InterruptedIOException {
        int i10 = ((ld0) nq0Var).read(this.f78419b.f78966a, 0, 16384);
        if (i10 == -1) {
            return -1;
        }
        this.f78419b.e(0);
        this.f78419b.d(i10);
        if (!this.f78420c) {
            this.f78418a.a(4, 0L);
            this.f78420c = true;
        }
        this.f78418a.a(this.f78419b);
        return 0;
    }

    public static /* synthetic */ mq0[] a() {
        return new mq0[]{new i0()};
    }

    @Override // yads.mq0
    public final boolean a(nq0 nq0Var) throws EOFException, InterruptedIOException {
        ld0 ld0Var;
        int i10;
        jb2 jb2Var = new jb2(10);
        int i11 = 0;
        while (true) {
            ld0Var = (ld0) nq0Var;
            ld0Var.b(jb2Var.f78966a, 0, 10, false);
            jb2Var.e(0);
            if (jb2Var.o() != 4801587) {
                break;
            }
            jb2Var.e(jb2Var.f78967b + 3);
            int iL = jb2Var.l();
            i11 += iL + 10;
            ld0Var.a(false, iL);
        }
        ld0Var.f79759f = 0;
        ld0Var.a(false, i11);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            ld0Var.b(jb2Var.f78966a, 0, 7, false);
            jb2Var.e(0);
            int iR = jb2Var.r();
            if (iR == 44096 || iR == 44097) {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = jb2Var.f78966a;
                if (bArr.length < 7) {
                    i10 = -1;
                } else {
                    int i15 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i15 == 65535) {
                        i15 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i14 = 4;
                    }
                    if (iR == 44097) {
                        i14 += 2;
                    }
                    i10 = i15 + i14;
                }
                if (i10 == -1) {
                    return false;
                }
                ld0Var.a(false, i10 - 7);
            } else {
                ld0Var.f79759f = 0;
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                ld0Var.a(false, i13);
                i12 = 0;
            }
        }
    }
}
