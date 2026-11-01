package c6;

import com.google.zxing.NotFoundException;
import java.lang.reflect.Array;

/* JADX INFO: compiled from: HybridBinarizer.java */
/* JADX INFO: loaded from: classes5.dex */
public final class i extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f5679e;

    public static int k(int i10, int i11) {
        if (i10 < 2) {
            return 2;
        }
        return Math.min(i10, i11);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009a A[PHI: r5
  0x009a: PHI (r5v4 int) = (r5v3 int), (r5v7 int), (r5v7 int) binds: [B:31:0x007a, B:33:0x007e, B:34:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    public static int[][] i(byte[] bArr, int i10, int i11, int i12, int i13) {
        char c10;
        int i14 = 8;
        int i15 = i13 - 8;
        int i16 = i12 - 8;
        char c11 = 2;
        boolean z10 = true;
        int i17 = 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i11, i10);
        int i18 = 0;
        while (i18 < i11) {
            int i19 = i18 << 3;
            if (i19 > i15) {
                i19 = i15;
            }
            int i20 = i17;
            while (i20 < i10) {
                int i21 = i20 << 3;
                if (i21 > i16) {
                    i21 = i16;
                }
                int i22 = (i19 * i12) + i21;
                int i23 = i17;
                int i24 = i23;
                int i25 = i24;
                int i26 = 255;
                while (i23 < i14) {
                    int i27 = i25;
                    int i28 = 0;
                    while (i28 < i14) {
                        int i29 = bArr[i22 + i28] & 255;
                        i24 += i29;
                        if (i29 < i26) {
                            i26 = i29;
                        }
                        if (i29 > i27) {
                            i27 = i29;
                        }
                        i28++;
                        i14 = 8;
                    }
                    if (i27 - i26 > 24) {
                        while (true) {
                            i23++;
                            i22 += i12;
                            if (i23 < 8) {
                                int i30 = 0;
                                for (int i31 = 8; i30 < i31; i31 = 8) {
                                    i24 += bArr[i22 + i30] & 255;
                                    i30++;
                                }
                            }
                        }
                    }
                    i23++;
                    i22 += i12;
                    i25 = i27;
                    z10 = true;
                    i14 = 8;
                }
                boolean z11 = z10;
                int i32 = i24 >> 6;
                if (i25 - i26 <= 24) {
                    i32 = i26 / 2;
                    if (i18 <= 0 || i20 <= 0) {
                        c10 = 2;
                    } else {
                        int[] iArr2 = iArr[i18 - 1];
                        int i33 = i20 - 1;
                        c10 = 2;
                        int i34 = ((iArr2[i20] + (iArr[i18][i33] * 2)) + iArr2[i33]) / 4;
                        if (i26 < i34) {
                            i32 = i34;
                        }
                    }
                } else {
                    c10 = 2;
                }
                iArr[i18][i20] = i32;
                i20++;
                z10 = z11;
                c11 = c10;
                i14 = 8;
                i17 = 0;
            }
            i18++;
            i14 = 8;
            i17 = 0;
        }
        return iArr;
    }

    public static void j(byte[] bArr, int i10, int i11, int i12, int i13, int[][] iArr, b bVar) {
        int i14 = i13 - 8;
        int i15 = i12 - 8;
        for (int i16 = 0; i16 < i11; i16++) {
            int i17 = i16 << 3;
            int i18 = i17 > i14 ? i14 : i17;
            int iK = k(i16, i11 - 3);
            for (int i19 = 0; i19 < i10; i19++) {
                int i20 = i19 << 3;
                int i21 = i20 > i15 ? i15 : i20;
                int iK2 = k(i19, i10 - 3);
                int i22 = 0;
                for (int i23 = -2; i23 <= 2; i23++) {
                    int[] iArr2 = iArr[iK + i23];
                    i22 += iArr2[iK2 - 2] + iArr2[iK2 - 1] + iArr2[iK2] + iArr2[iK2 + 1] + iArr2[2 + iK2];
                }
                l(bArr, i21, i18, i22 / 25, i12, bVar);
            }
        }
    }

    public static void l(byte[] bArr, int i10, int i11, int i12, int i13, b bVar) {
        int i14 = (i11 * i13) + i10;
        int i15 = 0;
        while (i15 < 8) {
            for (int i16 = 0; i16 < 8; i16++) {
                if ((bArr[i14 + i16] & 255) <= i12) {
                    bVar.l(i10 + i16, i11 + i15);
                }
            }
            i15++;
            i14 += i13;
        }
    }

    @Override // y5.a
    public y5.a a(y5.d dVar) {
        return new i(dVar);
    }

    @Override // c6.g, y5.a
    public b b() throws NotFoundException {
        b bVar = this.f5679e;
        if (bVar != null) {
            return bVar;
        }
        y5.d dVarE = e();
        int iD = dVarE.d();
        int iA = dVarE.a();
        if (iD < 40 || iA < 40) {
            this.f5679e = super.b();
        } else {
            byte[] bArrB = dVarE.b();
            int i10 = iD >> 3;
            if ((iD & 7) != 0) {
                i10++;
            }
            int i11 = i10;
            int i12 = iA >> 3;
            if ((iA & 7) != 0) {
                i12++;
            }
            int i13 = i12;
            int[][] iArrI = i(bArrB, i11, i13, iD, iA);
            b bVar2 = new b(iD, iA);
            j(bArrB, i11, i13, iD, iA, iArrI, bVar2);
            this.f5679e = bVar2;
        }
        return this.f5679e;
    }

    public i(y5.d dVar) {
        super(dVar);
    }
}
