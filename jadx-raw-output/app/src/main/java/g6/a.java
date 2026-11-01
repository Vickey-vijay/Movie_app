package g6;

import com.google.zxing.FormatException;

/* JADX INFO: compiled from: BitMatrixParser.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c6.b f53165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c6.b f53166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f53167c;

    public final c6.b a(c6.b bVar) {
        int iF = this.f53167c.f();
        int iE = this.f53167c.e();
        if (bVar.g() != iF) {
            throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
        }
        int iC = this.f53167c.c();
        int iB = this.f53167c.b();
        int i10 = iF / iC;
        int i11 = iE / iB;
        c6.b bVar2 = new c6.b(i11 * iB, i10 * iC);
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = i12 * iC;
            for (int i14 = 0; i14 < i11; i14++) {
                int i15 = i14 * iB;
                for (int i16 = 0; i16 < iC; i16++) {
                    int i17 = ((iC + 2) * i12) + 1 + i16;
                    int i18 = i13 + i16;
                    for (int i19 = 0; i19 < iB; i19++) {
                        if (bVar.d(((iB + 2) * i14) + 1 + i19, i17)) {
                            bVar2.l(i15 + i19, i18);
                        }
                    }
                }
            }
        }
        return bVar2;
    }

    public d b() {
        return this.f53167c;
    }

    public byte[] c() throws FormatException {
        byte[] bArr = new byte[this.f53167c.g()];
        int iG = this.f53165a.g();
        int iJ = this.f53165a.j();
        int i10 = 0;
        int i11 = 4;
        boolean z10 = false;
        int i12 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (true) {
            if (i11 == iG && i10 == 0 && !z10) {
                bArr[i12] = (byte) d(iG, iJ);
                i11 -= 2;
                i10 += 2;
                i12++;
                z10 = true;
            } else {
                int i13 = iG - 2;
                if (i11 == i13 && i10 == 0 && (iJ & 3) != 0 && !z11) {
                    bArr[i12] = (byte) e(iG, iJ);
                    i11 -= 2;
                    i10 += 2;
                    i12++;
                    z11 = true;
                } else if (i11 == iG + 4 && i10 == 2 && (iJ & 7) == 0 && !z12) {
                    bArr[i12] = (byte) f(iG, iJ);
                    i11 -= 2;
                    i10 += 2;
                    i12++;
                    z12 = true;
                } else if (i11 == i13 && i10 == 0 && (iJ & 7) == 4 && !z13) {
                    bArr[i12] = (byte) g(iG, iJ);
                    i11 -= 2;
                    i10 += 2;
                    i12++;
                    z13 = true;
                } else {
                    do {
                        if (i11 < iG && i10 >= 0 && !this.f53166b.d(i10, i11)) {
                            bArr[i12] = (byte) i(i11, i10, iG, iJ);
                            i12++;
                        }
                        i11 -= 2;
                        i10 += 2;
                        if (i11 < 0) {
                            break;
                        }
                    } while (i10 < iJ);
                    int i14 = i11 + 1;
                    int i15 = i10 + 3;
                    do {
                        if (i14 >= 0 && i15 < iJ && !this.f53166b.d(i15, i14)) {
                            bArr[i12] = (byte) i(i14, i15, iG, iJ);
                            i12++;
                        }
                        i14 += 2;
                        i15 -= 2;
                        if (i14 >= iG) {
                            break;
                        }
                    } while (i15 >= 0);
                    i11 = i14 + 3;
                    i10 = i15 + 1;
                }
            }
            if (i11 >= iG && i10 >= iJ) {
                break;
            }
        }
        if (i12 == this.f53167c.g()) {
            return bArr;
        }
        throw FormatException.getFormatInstance();
    }

    public final int d(int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = (h(i12, 0, i10, i11) ? 1 : 0) << 1;
        if (h(i12, 1, i10, i11)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (h(i12, 2, i10, i11)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (h(0, i11 - 2, i10, i11)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        int i17 = i11 - 1;
        if (h(0, i17, i10, i11)) {
            i16 |= 1;
        }
        int i18 = i16 << 1;
        if (h(1, i17, i10, i11)) {
            i18 |= 1;
        }
        int i19 = i18 << 1;
        if (h(2, i17, i10, i11)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        return h(3, i17, i10, i11) ? i20 | 1 : i20;
    }

    public final int e(int i10, int i11) {
        int i12 = (h(i10 + (-3), 0, i10, i11) ? 1 : 0) << 1;
        if (h(i10 - 2, 0, i10, i11)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (h(i10 - 1, 0, i10, i11)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (h(0, i11 - 4, i10, i11)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (h(0, i11 - 3, i10, i11)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        if (h(0, i11 - 2, i10, i11)) {
            i16 |= 1;
        }
        int i17 = i16 << 1;
        int i18 = i11 - 1;
        if (h(0, i18, i10, i11)) {
            i17 |= 1;
        }
        int i19 = i17 << 1;
        return h(1, i18, i10, i11) ? i19 | 1 : i19;
    }

    public final int f(int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = (h(i12, 0, i10, i11) ? 1 : 0) << 1;
        int i14 = i11 - 1;
        if (h(i12, i14, i10, i11)) {
            i13 |= 1;
        }
        int i15 = i13 << 1;
        int i16 = i11 - 3;
        if (h(0, i16, i10, i11)) {
            i15 |= 1;
        }
        int i17 = i15 << 1;
        int i18 = i11 - 2;
        if (h(0, i18, i10, i11)) {
            i17 |= 1;
        }
        int i19 = i17 << 1;
        if (h(0, i14, i10, i11)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        if (h(1, i16, i10, i11)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        if (h(1, i18, i10, i11)) {
            i21 |= 1;
        }
        int i22 = i21 << 1;
        return h(1, i14, i10, i11) ? i22 | 1 : i22;
    }

    public final int g(int i10, int i11) {
        int i12 = (h(i10 + (-3), 0, i10, i11) ? 1 : 0) << 1;
        if (h(i10 - 2, 0, i10, i11)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (h(i10 - 1, 0, i10, i11)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (h(0, i11 - 2, i10, i11)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        int i16 = i11 - 1;
        if (h(0, i16, i10, i11)) {
            i15 |= 1;
        }
        int i17 = i15 << 1;
        if (h(1, i16, i10, i11)) {
            i17 |= 1;
        }
        int i18 = i17 << 1;
        if (h(2, i16, i10, i11)) {
            i18 |= 1;
        }
        int i19 = i18 << 1;
        return h(3, i16, i10, i11) ? i19 | 1 : i19;
    }

    public final boolean h(int i10, int i11, int i12, int i13) {
        if (i10 < 0) {
            i10 += i12;
            i11 += 4 - ((i12 + 4) & 7);
        }
        if (i11 < 0) {
            i11 += i13;
            i10 += 4 - ((i13 + 4) & 7);
        }
        this.f53166b.l(i11, i10);
        return this.f53165a.d(i11, i10);
    }

    public final int i(int i10, int i11, int i12, int i13) {
        int i14 = i10 - 2;
        int i15 = i11 - 2;
        int i16 = (h(i14, i15, i12, i13) ? 1 : 0) << 1;
        int i17 = i11 - 1;
        if (h(i14, i17, i12, i13)) {
            i16 |= 1;
        }
        int i18 = i16 << 1;
        int i19 = i10 - 1;
        if (h(i19, i15, i12, i13)) {
            i18 |= 1;
        }
        int i20 = i18 << 1;
        if (h(i19, i17, i12, i13)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        if (h(i19, i11, i12, i13)) {
            i21 |= 1;
        }
        int i22 = i21 << 1;
        if (h(i10, i15, i12, i13)) {
            i22 |= 1;
        }
        int i23 = i22 << 1;
        if (h(i10, i17, i12, i13)) {
            i23 |= 1;
        }
        int i24 = i23 << 1;
        return h(i10, i11, i12, i13) ? i24 | 1 : i24;
    }

    public a(c6.b bVar) throws FormatException {
        int iG = bVar.g();
        if (iG >= 8 && iG <= 144 && (iG & 1) == 0) {
            this.f53167c = j(bVar);
            c6.b bVarA = a(bVar);
            this.f53165a = bVarA;
            this.f53166b = new c6.b(bVarA.j(), bVarA.g());
            return;
        }
        throw FormatException.getFormatInstance();
    }

    public static d j(c6.b bVar) throws FormatException {
        return d.h(bVar.g(), bVar.j());
    }
}
