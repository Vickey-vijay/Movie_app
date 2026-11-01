package z3;

import g5.k0;
import java.io.IOException;

/* JADX INFO: compiled from: PsDurationReader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f86230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f86231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f86232e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g5.g0 f86228a = new g5.g0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f86233f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f86234g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f86235h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g5.t f86229b = new g5.t();

    public static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    public static long m(byte[] bArr) {
        byte b10 = bArr[0];
        long j10 = (((((long) b10) & 56) >> 3) << 30) | ((((long) b10) & 3) << 28) | ((((long) bArr[1]) & 255) << 20);
        byte b11 = bArr[2];
        return j10 | (((((long) b11) & 248) >> 3) << 15) | ((((long) b11) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public final int b(q3.h hVar) {
        this.f86229b.I(k0.f53113f);
        this.f86230c = true;
        hVar.resetPeekPosition();
        return 0;
    }

    public long c() {
        return this.f86235h;
    }

    public g5.g0 d() {
        return this.f86228a;
    }

    public boolean e() {
        return this.f86230c;
    }

    public final int f(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public int g(q3.h hVar, q3.r rVar) throws InterruptedException, IOException {
        if (!this.f86232e) {
            return j(hVar, rVar);
        }
        if (this.f86234g == -9223372036854775807L) {
            return b(hVar);
        }
        if (!this.f86231d) {
            return h(hVar, rVar);
        }
        long j10 = this.f86233f;
        if (j10 == -9223372036854775807L) {
            return b(hVar);
        }
        this.f86235h = this.f86228a.b(this.f86234g) - this.f86228a.b(j10);
        return b(hVar);
    }

    public static long l(g5.t tVar) {
        int iC = tVar.c();
        if (tVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        tVar.h(bArr, 0, 9);
        tVar.L(iC);
        if (!a(bArr)) {
            return -9223372036854775807L;
        }
        return m(bArr);
    }

    public final int h(q3.h hVar, q3.r rVar) throws InterruptedException, IOException {
        int iMin = (int) Math.min(20000L, hVar.getLength());
        long j10 = 0;
        if (hVar.getPosition() != j10) {
            rVar.f66477a = j10;
            return 1;
        }
        this.f86229b.H(iMin);
        hVar.resetPeekPosition();
        hVar.peekFully(this.f86229b.f53154a, 0, iMin);
        this.f86233f = i(this.f86229b);
        this.f86231d = true;
        return 0;
    }

    public final long i(g5.t tVar) {
        int iD = tVar.d();
        for (int iC = tVar.c(); iC < iD - 3; iC++) {
            if (f(tVar.f53154a, iC) == 442) {
                tVar.L(iC + 4);
                long jL = l(tVar);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int j(q3.h hVar, q3.r rVar) throws InterruptedException, IOException {
        long length = hVar.getLength();
        int iMin = (int) Math.min(20000L, length);
        long j10 = length - ((long) iMin);
        if (hVar.getPosition() != j10) {
            rVar.f66477a = j10;
            return 1;
        }
        this.f86229b.H(iMin);
        hVar.resetPeekPosition();
        hVar.peekFully(this.f86229b.f53154a, 0, iMin);
        this.f86234g = k(this.f86229b);
        this.f86232e = true;
        return 0;
    }

    public final long k(g5.t tVar) {
        int iC = tVar.c();
        for (int iD = tVar.d() - 4; iD >= iC; iD--) {
            if (f(tVar.f53154a, iD) == 442) {
                tVar.L(iD + 4);
                long jL = l(tVar);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }
}
