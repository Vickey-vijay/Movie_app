package z3;

import g5.k0;
import java.io.IOException;

/* JADX INFO: compiled from: TsDurationReader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f85960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f85961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f85962e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g5.g0 f85958a = new g5.g0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f85963f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f85964g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f85965h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g5.t f85959b = new g5.t();

    public final int a(q3.h hVar) {
        this.f85959b.I(k0.f53113f);
        this.f85960c = true;
        hVar.resetPeekPosition();
        return 0;
    }

    public long b() {
        return this.f85965h;
    }

    public g5.g0 c() {
        return this.f85958a;
    }

    public boolean d() {
        return this.f85960c;
    }

    public int e(q3.h hVar, q3.r rVar, int i10) throws InterruptedException, IOException {
        if (i10 <= 0) {
            return a(hVar);
        }
        if (!this.f85962e) {
            return h(hVar, rVar, i10);
        }
        if (this.f85964g == -9223372036854775807L) {
            return a(hVar);
        }
        if (!this.f85961d) {
            return f(hVar, rVar, i10);
        }
        long j10 = this.f85963f;
        if (j10 == -9223372036854775807L) {
            return a(hVar);
        }
        this.f85965h = this.f85958a.b(this.f85964g) - this.f85958a.b(j10);
        return a(hVar);
    }

    public final int f(q3.h hVar, q3.r rVar, int i10) throws InterruptedException, IOException {
        int iMin = (int) Math.min(112800L, hVar.getLength());
        long j10 = 0;
        if (hVar.getPosition() != j10) {
            rVar.f66477a = j10;
            return 1;
        }
        this.f85959b.H(iMin);
        hVar.resetPeekPosition();
        hVar.peekFully(this.f85959b.f53154a, 0, iMin);
        this.f85963f = g(this.f85959b, i10);
        this.f85961d = true;
        return 0;
    }

    public final long g(g5.t tVar, int i10) {
        int iD = tVar.d();
        for (int iC = tVar.c(); iC < iD; iC++) {
            if (tVar.f53154a[iC] == 71) {
                long jB = i0.b(tVar, iC, i10);
                if (jB != -9223372036854775807L) {
                    return jB;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int h(q3.h hVar, q3.r rVar, int i10) throws InterruptedException, IOException {
        long length = hVar.getLength();
        int iMin = (int) Math.min(112800L, length);
        long j10 = length - ((long) iMin);
        if (hVar.getPosition() != j10) {
            rVar.f66477a = j10;
            return 1;
        }
        this.f85959b.H(iMin);
        hVar.resetPeekPosition();
        hVar.peekFully(this.f85959b.f53154a, 0, iMin);
        this.f85964g = i(this.f85959b, i10);
        this.f85962e = true;
        return 0;
    }

    public final long i(g5.t tVar, int i10) {
        int iC = tVar.c();
        int iD = tVar.d();
        while (true) {
            iD--;
            if (iD < iC) {
                return -9223372036854775807L;
            }
            if (tVar.f53154a[iD] == 71) {
                long jB = i0.b(tVar, iD, i10);
                if (jB != -9223372036854775807L) {
                    return jB;
                }
            }
        }
    }
}
