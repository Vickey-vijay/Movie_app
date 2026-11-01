package a6;

import c6.b;
import c6.h;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import e6.c;
import y5.j;

/* JADX INFO: compiled from: Detector.java */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f3490g = {3808, 476, 2107, 1799};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f3491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3496f;

    /* JADX INFO: renamed from: a6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Detector.java */
    public static final class C0001a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f3498b;

        public int a() {
            return this.f3497a;
        }

        public int b() {
            return this.f3498b;
        }

        public j c() {
            return new j(this.f3497a, this.f3498b);
        }

        public String toString() {
            return "<" + this.f3497a + ' ' + this.f3498b + '>';
        }

        public C0001a(int i10, int i11) {
            this.f3497a = i10;
            this.f3498b = i11;
        }
    }

    public static j[] d(j[] jVarArr, int i10, int i11) {
        float f10 = i11 / (i10 * 2.0f);
        float fC = jVarArr[0].c() - jVarArr[2].c();
        float fD = jVarArr[0].d() - jVarArr[2].d();
        float fC2 = (jVarArr[0].c() + jVarArr[2].c()) / 2.0f;
        float fD2 = (jVarArr[0].d() + jVarArr[2].d()) / 2.0f;
        float f11 = fC * f10;
        float f12 = fD * f10;
        j jVar = new j(fC2 + f11, fD2 + f12);
        j jVar2 = new j(fC2 - f11, fD2 - f12);
        float fC3 = jVarArr[1].c() - jVarArr[3].c();
        float fD3 = jVarArr[1].d() - jVarArr[3].d();
        float fC4 = (jVarArr[1].c() + jVarArr[3].c()) / 2.0f;
        float fD4 = (jVarArr[1].d() + jVarArr[3].d()) / 2.0f;
        float f13 = fC3 * f10;
        float f14 = f10 * fD3;
        return new j[]{jVar, new j(fC4 + f13, fD4 + f14), jVar2, new j(fC4 - f13, fD4 - f14)};
    }

    public static int h(long j10, boolean z10) throws NotFoundException {
        int i10;
        int i11;
        if (z10) {
            i10 = 7;
            i11 = 2;
        } else {
            i10 = 10;
            i11 = 4;
        }
        int i12 = i10 - i11;
        int[] iArr = new int[i10];
        for (int i13 = i10 - 1; i13 >= 0; i13--) {
            iArr[i13] = ((int) j10) & 15;
            j10 >>= 4;
        }
        try {
            new c(e6.a.f52436k).a(iArr, i12);
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 = (i14 << 4) + iArr[i15];
            }
            return i14;
        } catch (ReedSolomonException unused) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    public static int m(int[] iArr, int i10) throws NotFoundException {
        int i11 = 0;
        for (int i12 : iArr) {
            i11 = (i11 << 3) + ((i12 >> (i10 - 2)) << 1) + (i12 & 1);
        }
        int i13 = ((i11 & 1) << 11) + (i11 >> 1);
        for (int i14 = 0; i14 < 4; i14++) {
            if (Integer.bitCount(f3490g[i14] ^ i13) <= 2) {
                return i14;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final void e(j[] jVarArr) throws NotFoundException {
        long j10;
        long j11;
        if (!o(jVarArr[0]) || !o(jVarArr[1]) || !o(jVarArr[2]) || !o(jVarArr[3])) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i10 = this.f3495e * 2;
        int[] iArr = {r(jVarArr[0], jVarArr[1], i10), r(jVarArr[1], jVarArr[2], i10), r(jVarArr[2], jVarArr[3], i10), r(jVarArr[3], jVarArr[0], i10)};
        this.f3496f = m(iArr, i10);
        long j12 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = iArr[(this.f3496f + i11) % 4];
            if (this.f3492b) {
                j10 = j12 << 7;
                j11 = (i12 >> 1) & 127;
            } else {
                j10 = j12 << 10;
                j11 = ((i12 >> 2) & 992) + ((i12 >> 1) & 31);
            }
            j12 = j10 + j11;
        }
        int iH = h(j12, this.f3492b);
        if (this.f3492b) {
            this.f3493c = (iH >> 6) + 1;
            this.f3494d = (iH & 63) + 1;
        } else {
            this.f3493c = (iH >> 11) + 1;
            this.f3494d = (iH & 2047) + 1;
        }
    }

    public final j[] f(C0001a c0001a) throws NotFoundException {
        this.f3495e = 1;
        C0001a c0001a2 = c0001a;
        C0001a c0001a3 = c0001a2;
        C0001a c0001a4 = c0001a3;
        boolean z10 = true;
        while (this.f3495e < 9) {
            C0001a c0001aJ = j(c0001a, z10, 1, -1);
            C0001a c0001aJ2 = j(c0001a2, z10, 1, 1);
            C0001a c0001aJ3 = j(c0001a3, z10, -1, 1);
            C0001a c0001aJ4 = j(c0001a4, z10, -1, -1);
            if (this.f3495e > 2) {
                double dB = (b(c0001aJ4, c0001aJ) * this.f3495e) / (b(c0001a4, c0001a) * (this.f3495e + 2));
                if (dB < 0.75d || dB > 1.25d || !p(c0001aJ, c0001aJ2, c0001aJ3, c0001aJ4)) {
                    break;
                }
            }
            z10 = !z10;
            this.f3495e++;
            c0001a4 = c0001aJ4;
            c0001a = c0001aJ;
            c0001a2 = c0001aJ2;
            c0001a3 = c0001aJ3;
        }
        int i10 = this.f3495e;
        if (i10 != 5 && i10 != 7) {
            throw NotFoundException.getNotFoundInstance();
        }
        this.f3492b = i10 == 5;
        j[] jVarArr = {new j(c0001a.a() + 0.5f, c0001a.b() - 0.5f), new j(c0001a2.a() + 0.5f, c0001a2.b() + 0.5f), new j(c0001a3.a() - 0.5f, c0001a3.b() + 0.5f), new j(c0001a4.a() - 0.5f, c0001a4.b() - 0.5f)};
        int i11 = this.f3495e;
        return d(jVarArr, (i11 * 2) - 3, i11 * 2);
    }

    public final C0001a k() {
        j jVarC;
        j jVar;
        j jVar2;
        j jVar3;
        j jVarC2;
        j jVarC3;
        j jVarC4;
        j jVarC5;
        try {
            j[] jVarArrC = new d6.b(this.f3491a).c();
            jVar2 = jVarArrC[0];
            jVar3 = jVarArrC[1];
            jVar = jVarArrC[2];
            jVarC = jVarArrC[3];
        } catch (NotFoundException unused) {
            int iJ = this.f3491a.j() / 2;
            int iG = this.f3491a.g() / 2;
            int i10 = iJ + 7;
            int i11 = iG - 7;
            j jVarC6 = j(new C0001a(i10, i11), false, 1, -1).c();
            int i12 = iG + 7;
            j jVarC7 = j(new C0001a(i10, i12), false, 1, 1).c();
            int i13 = iJ - 7;
            j jVarC8 = j(new C0001a(i13, i12), false, -1, 1).c();
            jVarC = j(new C0001a(i13, i11), false, -1, -1).c();
            jVar = jVarC8;
            jVar2 = jVarC6;
            jVar3 = jVarC7;
        }
        int iC = d6.a.c((((jVar2.c() + jVarC.c()) + jVar3.c()) + jVar.c()) / 4.0f);
        int iC2 = d6.a.c((((jVar2.d() + jVarC.d()) + jVar3.d()) + jVar.d()) / 4.0f);
        try {
            j[] jVarArrC2 = new d6.b(this.f3491a, 15, iC, iC2).c();
            jVarC2 = jVarArrC2[0];
            jVarC3 = jVarArrC2[1];
            jVarC4 = jVarArrC2[2];
            jVarC5 = jVarArrC2[3];
        } catch (NotFoundException unused2) {
            int i14 = iC + 7;
            int i15 = iC2 - 7;
            jVarC2 = j(new C0001a(i14, i15), false, 1, -1).c();
            int i16 = iC2 + 7;
            jVarC3 = j(new C0001a(i14, i16), false, 1, 1).c();
            int i17 = iC - 7;
            jVarC4 = j(new C0001a(i17, i16), false, -1, 1).c();
            jVarC5 = j(new C0001a(i17, i15), false, -1, -1).c();
        }
        return new C0001a(d6.a.c((((jVarC2.c() + jVarC5.c()) + jVarC3.c()) + jVarC4.c()) / 4.0f), d6.a.c((((jVarC2.d() + jVarC5.d()) + jVarC3.d()) + jVarC4.d()) / 4.0f));
    }

    public final int i() {
        if (this.f3492b) {
            return (this.f3493c * 4) + 11;
        }
        int i10 = this.f3493c;
        return i10 <= 4 ? (i10 * 4) + 15 : (i10 * 4) + ((((i10 - 4) / 8) + 1) * 2) + 15;
    }

    public final j[] l(j[] jVarArr) {
        return d(jVarArr, this.f3495e * 2, i());
    }

    public final boolean n(int i10, int i11) {
        return i10 >= 0 && i10 < this.f3491a.j() && i11 > 0 && i11 < this.f3491a.g();
    }

    public final boolean p(C0001a c0001a, C0001a c0001a2, C0001a c0001a3, C0001a c0001a4) {
        C0001a c0001a5 = new C0001a(c0001a.a() - 3, c0001a.b() + 3);
        C0001a c0001a6 = new C0001a(c0001a2.a() - 3, c0001a2.b() - 3);
        C0001a c0001a7 = new C0001a(c0001a3.a() + 3, c0001a3.b() - 3);
        C0001a c0001a8 = new C0001a(c0001a4.a() + 3, c0001a4.b() + 3);
        int iG = g(c0001a8, c0001a5);
        return iG != 0 && g(c0001a5, c0001a6) == iG && g(c0001a6, c0001a7) == iG && g(c0001a7, c0001a8) == iG;
    }

    public final b q(b bVar, j jVar, j jVar2, j jVar3, j jVar4) throws NotFoundException {
        h hVarB = h.b();
        int i10 = i();
        float f10 = i10 / 2.0f;
        int i11 = this.f3495e;
        float f11 = f10 - i11;
        float f12 = f10 + i11;
        return hVarB.c(bVar, i10, i10, f11, f11, f12, f11, f12, f12, f11, f12, jVar.c(), jVar.d(), jVar2.c(), jVar2.d(), jVar3.c(), jVar3.d(), jVar4.c(), jVar4.d());
    }

    public a(b bVar) {
        this.f3491a = bVar;
    }

    public static float b(C0001a c0001a, C0001a c0001a2) {
        return d6.a.b(c0001a.a(), c0001a.b(), c0001a2.a(), c0001a2.b());
    }

    public static float c(j jVar, j jVar2) {
        return d6.a.a(jVar.c(), jVar.d(), jVar2.c(), jVar2.d());
    }

    public z5.a a(boolean z10) throws NotFoundException {
        j[] jVarArrF = f(k());
        if (z10) {
            j jVar = jVarArrF[0];
            jVarArrF[0] = jVarArrF[2];
            jVarArrF[2] = jVar;
        }
        e(jVarArrF);
        b bVar = this.f3491a;
        int i10 = this.f3496f;
        return new z5.a(q(bVar, jVarArrF[i10 % 4], jVarArrF[(i10 + 1) % 4], jVarArrF[(i10 + 2) % 4], jVarArrF[(i10 + 3) % 4]), l(jVarArrF), this.f3492b, this.f3494d, this.f3493c);
    }

    public final int g(C0001a c0001a, C0001a c0001a2) {
        float fB = b(c0001a, c0001a2);
        float fA = (c0001a2.a() - c0001a.a()) / fB;
        float fB2 = (c0001a2.b() - c0001a.b()) / fB;
        float fA2 = c0001a.a();
        float fB3 = c0001a.b();
        boolean zD = this.f3491a.d(c0001a.a(), c0001a.b());
        int iCeil = (int) Math.ceil(fB);
        boolean z10 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < iCeil; i11++) {
            fA2 += fA;
            fB3 += fB2;
            if (this.f3491a.d(d6.a.c(fA2), d6.a.c(fB3)) != zD) {
                i10++;
            }
        }
        float f10 = i10 / fB;
        if (f10 > 0.1f && f10 < 0.9f) {
            return 0;
        }
        if (f10 <= 0.1f) {
            z10 = true;
        }
        if (z10 == zD) {
            return 1;
        }
        return -1;
    }

    public final C0001a j(C0001a c0001a, boolean z10, int i10, int i11) {
        int iA = c0001a.a() + i10;
        int iB = c0001a.b();
        while (true) {
            iB += i11;
            if (!n(iA, iB) || this.f3491a.d(iA, iB) != z10) {
                break;
            }
            iA += i10;
        }
        int i12 = iA - i10;
        int i13 = iB - i11;
        while (n(i12, i13) && this.f3491a.d(i12, i13) == z10) {
            i12 += i10;
        }
        int i14 = i12 - i10;
        while (n(i14, i13) && this.f3491a.d(i14, i13) == z10) {
            i13 += i11;
        }
        return new C0001a(i14, i13 - i11);
    }

    public final boolean o(j jVar) {
        return n(d6.a.c(jVar.c()), d6.a.c(jVar.d()));
    }

    public final int r(j jVar, j jVar2, int i10) {
        float fC = c(jVar, jVar2);
        float f10 = fC / i10;
        float fC2 = jVar.c();
        float fD = jVar.d();
        float fC3 = ((jVar2.c() - jVar.c()) * f10) / fC;
        float fD2 = (f10 * (jVar2.d() - jVar.d())) / fC;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            float f11 = i12;
            if (this.f3491a.d(d6.a.c((f11 * fC3) + fC2), d6.a.c((f11 * fD2) + fD))) {
                i11 |= 1 << ((i10 - i12) - 1);
            }
        }
        return i11;
    }
}
