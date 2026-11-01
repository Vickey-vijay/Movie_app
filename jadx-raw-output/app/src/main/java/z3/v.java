package z3;

import g5.k0;
import java.io.IOException;

/* JADX INFO: compiled from: PsBinarySearchSeeker.java */
/* JADX INFO: loaded from: classes11.dex */
public final class v extends q3.a {

    /* JADX INFO: compiled from: PsBinarySearchSeeker.java */
    public static final class b implements q3.a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g5.g0 f86226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g5.t f86227b;

        public final q3.a.e b(g5.t tVar, long j10, long j11) {
            int iC = -1;
            int iC2 = -1;
            long j12 = -9223372036854775807L;
            while (tVar.a() >= 4) {
                if (v.k(tVar.f53154a, tVar.c()) != 442) {
                    tVar.M(1);
                } else {
                    tVar.M(4);
                    long jL = w.l(tVar);
                    if (jL != -9223372036854775807L) {
                        long jB = this.f86226a.b(jL);
                        if (jB > j10) {
                            return j12 == -9223372036854775807L ? q3.a.e.d(jB, j11) : q3.a.e.e(j11 + ((long) iC2));
                        }
                        if (100000 + jB > j10) {
                            return q3.a.e.e(j11 + ((long) tVar.c()));
                        }
                        iC2 = tVar.c();
                        j12 = jB;
                    }
                    c(tVar);
                    iC = tVar.c();
                }
            }
            return j12 != -9223372036854775807L ? q3.a.e.f(j12, j11 + ((long) iC)) : q3.a.e.f66422d;
        }

        public b(g5.g0 g0Var) {
            this.f86226a = g0Var;
            this.f86227b = new g5.t();
        }

        @Override // q3.a.f
        public void onSeekFinished() {
            this.f86227b.I(k0.f53113f);
        }

        public static void c(g5.t tVar) {
            int iK;
            int iD = tVar.d();
            if (tVar.a() < 10) {
                tVar.L(iD);
                return;
            }
            tVar.M(9);
            int iY = tVar.y() & 7;
            if (tVar.a() < iY) {
                tVar.L(iD);
                return;
            }
            tVar.M(iY);
            if (tVar.a() < 4) {
                tVar.L(iD);
                return;
            }
            if (v.k(tVar.f53154a, tVar.c()) == 443) {
                tVar.M(4);
                int iE = tVar.E();
                if (tVar.a() < iE) {
                    tVar.L(iD);
                    return;
                }
                tVar.M(iE);
            }
            while (tVar.a() >= 4 && (iK = v.k(tVar.f53154a, tVar.c())) != 442 && iK != 441 && (iK >>> 8) == 1) {
                tVar.M(4);
                if (tVar.a() < 2) {
                    tVar.L(iD);
                    return;
                }
                tVar.L(Math.min(tVar.d(), tVar.c() + tVar.E()));
            }
        }

        @Override // q3.a.f
        public q3.a.e a(q3.h hVar, long j10) throws InterruptedException, IOException {
            long position = hVar.getPosition();
            int iMin = (int) Math.min(20000L, hVar.getLength() - position);
            this.f86227b.H(iMin);
            hVar.peekFully(this.f86227b.f53154a, 0, iMin);
            return b(this.f86227b, j10, position);
        }
    }

    public v(g5.g0 g0Var, long j10, long j11) {
        super(new q3.a.b(), new b(g0Var), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    public static int k(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
