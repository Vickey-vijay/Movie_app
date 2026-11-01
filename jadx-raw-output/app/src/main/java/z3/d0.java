package z3;

import g5.k0;
import java.io.IOException;

/* JADX INFO: compiled from: TsBinarySearchSeeker.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d0 extends q3.a {

    /* JADX INFO: compiled from: TsBinarySearchSeeker.java */
    public static final class a implements q3.a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g5.g0 f85951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g5.t f85952b = new g5.t();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f85953c;

        public final q3.a.e b(g5.t tVar, long j10, long j11) {
            int iA;
            int iA2;
            int iD = tVar.d();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (tVar.a() >= 188 && (iA2 = (iA = i0.a(tVar.f53154a, tVar.c(), iD)) + 188) <= iD) {
                long jB = i0.b(tVar, iA, this.f85953c);
                if (jB != -9223372036854775807L) {
                    long jB2 = this.f85951a.b(jB);
                    if (jB2 > j10) {
                        return j14 == -9223372036854775807L ? q3.a.e.d(jB2, j11) : q3.a.e.e(j11 + j13);
                    }
                    if (100000 + jB2 > j10) {
                        return q3.a.e.e(j11 + ((long) iA));
                    }
                    j13 = iA;
                    j14 = jB2;
                }
                tVar.L(iA2);
                j12 = iA2;
            }
            return j14 != -9223372036854775807L ? q3.a.e.f(j14, j11 + j12) : q3.a.e.f66422d;
        }

        @Override // q3.a.f
        public void onSeekFinished() {
            this.f85952b.I(k0.f53113f);
        }

        public a(int i10, g5.g0 g0Var) {
            this.f85953c = i10;
            this.f85951a = g0Var;
        }

        @Override // q3.a.f
        public q3.a.e a(q3.h hVar, long j10) throws InterruptedException, IOException {
            long position = hVar.getPosition();
            int iMin = (int) Math.min(112800L, hVar.getLength() - position);
            this.f85952b.H(iMin);
            hVar.peekFully(this.f85952b.f53154a, 0, iMin);
            return b(this.f85952b, j10, position);
        }
    }

    public d0(g5.g0 g0Var, long j10, long j11, int i10) {
        super(new q3.a.b(), new a(i10, g0Var), j10, 0L, j10 + 1, 0L, j11, 188L, 940);
    }
}
