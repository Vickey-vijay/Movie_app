package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public abstract class dy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f76843a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f76844b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f76845c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int[] f76846d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:66:0x0109  */
    /* JADX WARN: Code duplicated, block: B:69:0x011c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0121  */
    /* JADX WARN: Code duplicated, block: B:72:0x0123  */
    /* JADX WARN: Code duplicated, block: B:74:0x0127  */
    /* JADX WARN: Code duplicated, block: B:83:0x014d  */
    /* JADX WARN: Code duplicated, block: B:87:0x015f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0165  */
    /* JADX WARN: Code duplicated, block: B:90:0x0168  */
    public static cy1 b(byte[] bArr, int i10, int i11) {
        int iD;
        boolean zC;
        int iD2;
        boolean z10;
        boolean zC2;
        int i12;
        int i13;
        int i14;
        float f10;
        int iB;
        float[] fArr;
        int iB2;
        int iB3;
        int i15;
        int i16 = 1;
        kb2 kb2Var = new kb2(bArr, i10 + 1, i11);
        int iB4 = kb2Var.b(8);
        int iB5 = kb2Var.b(8);
        int iB6 = kb2Var.b(8);
        int iD3 = kb2Var.d();
        if (iB4 == 100 || iB4 == 110 || iB4 == 122 || iB4 == 244 || iB4 == 44 || iB4 == 83 || iB4 == 86 || iB4 == 118 || iB4 == 128 || iB4 == 138) {
            iD = kb2Var.d();
            zC = iD == 3 ? kb2Var.c() : false;
            kb2Var.d();
            kb2Var.d();
            kb2Var.f();
            if (kb2Var.c()) {
                int i17 = iD != 3 ? 8 : 12;
                int i18 = 0;
                while (i18 < i17) {
                    if (kb2Var.c()) {
                        int i19 = i18 < 6 ? 16 : 64;
                        int iE = 8;
                        int i20 = 8;
                        for (int i21 = 0; i21 < i19; i21++) {
                            if (iE != 0) {
                                iE = ((kb2Var.e() + i20) + 256) % 256;
                            }
                            if (iE != 0) {
                                i20 = iE;
                            }
                        }
                    }
                    i18++;
                }
            }
        } else {
            iD = 1;
            zC = false;
        }
        int iD4 = kb2Var.d() + 4;
        int iD5 = kb2Var.d();
        if (iD5 != 0) {
            if (iD5 == 1) {
                boolean zC3 = kb2Var.c();
                kb2Var.e();
                kb2Var.e();
                iB4 = iB4;
                long jD = kb2Var.d();
                for (int i22 = 0; i22 < jD; i22++) {
                    kb2Var.d();
                }
                z10 = zC3;
                iD2 = 0;
            } else {
                iD2 = 0;
            }
            kb2Var.d();
            kb2Var.f();
            int iD6 = kb2Var.d() + 1;
            int iD7 = kb2Var.d() + 1;
            zC2 = kb2Var.c();
            i12 = 2 - (zC2 ? 1 : 0);
            int i23 = iD7 * i12;
            if (!zC2) {
                kb2Var.f();
            }
            kb2Var.f();
            i13 = iD6 * 16;
            i14 = i23 * 16;
            if (kb2Var.c()) {
                int iD8 = kb2Var.d();
                int iD9 = kb2Var.d();
                int iD10 = kb2Var.d();
                int iD11 = kb2Var.d();
                if (iD != 0) {
                    if (iD == 3) {
                        i15 = 1;
                    } else {
                        i15 = 2;
                    }
                    i12 *= iD == 1 ? 2 : 1;
                    i16 = i15;
                }
                i13 -= (iD8 + iD9) * i16;
                i14 -= (iD10 + iD11) * i12;
            }
            int i24 = i13;
            int i25 = i14;
            f10 = 1.0f;
            if (kb2Var.c() && kb2Var.c()) {
                iB = kb2Var.b(8);
                if (iB == 255) {
                    iB2 = kb2Var.b(16);
                    iB3 = kb2Var.b(16);
                    if (iB2 != 0 && iB3 != 0) {
                        f10 = iB2 / iB3;
                    }
                } else {
                    fArr = f76844b;
                    if (iB < 17) {
                        f10 = fArr[iB];
                    } else {
                        kf1.a("Unexpected aspect_ratio_idc value: ", iB, "NalUnitUtil");
                    }
                }
            }
            return new cy1(iB4, iB5, iB6, iD3, i24, i25, f10, zC, zC2, iD4, iD5, iD2, z10);
        }
        iD2 = kb2Var.d() + 4;
        z10 = false;
        kb2Var.d();
        kb2Var.f();
        int iD12 = kb2Var.d() + 1;
        int iD13 = kb2Var.d() + 1;
        zC2 = kb2Var.c();
        i12 = 2 - (zC2 ? 1 : 0);
        int i26 = iD13 * i12;
        if (!zC2) {
            kb2Var.f();
        }
        kb2Var.f();
        i13 = iD12 * 16;
        i14 = i26 * 16;
        if (kb2Var.c()) {
            int iD14 = kb2Var.d();
            int iD15 = kb2Var.d();
            int iD16 = kb2Var.d();
            int iD17 = kb2Var.d();
            if (iD != 0) {
                if (iD == 3) {
                    i15 = 1;
                } else {
                    i15 = 2;
                }
                i12 *= iD == 1 ? 2 : 1;
                i16 = i15;
            }
            i13 -= (iD14 + iD15) * i16;
            i14 -= (iD16 + iD17) * i12;
        }
        int i27 = i13;
        int i28 = i14;
        f10 = 1.0f;
        if (kb2Var.c()) {
            iB = kb2Var.b(8);
            if (iB == 255) {
                iB2 = kb2Var.b(16);
                iB3 = kb2Var.b(16);
                if (iB2 != 0) {
                    f10 = iB2 / iB3;
                }
            } else {
                fArr = f76844b;
                if (iB < 17) {
                    f10 = fArr[iB];
                } else {
                    kf1.a("Unexpected aspect_ratio_idc value: ", iB, "NalUnitUtil");
                }
            }
        }
        return new cy1(iB4, iB5, iB6, iD3, i27, i28, f10, zC, zC2, iD4, iD5, iD2, z10);
    }

    public static int a(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        if (i12 < 0) {
            throw new IllegalStateException();
        }
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            a(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    a(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    public static ay1 a(byte[] bArr, int i10, int i11) {
        boolean z10;
        int[] iArrCopyOf;
        kb2 kb2Var = new kb2(bArr, i10 + 2, i11);
        int i12 = 4;
        kb2Var.d(4);
        int iB = kb2Var.b(3);
        kb2Var.f();
        int iB2 = kb2Var.b(2);
        boolean zC = kb2Var.c();
        int iB3 = kb2Var.b(5);
        int i13 = 0;
        for (int i14 = 0; i14 < 32; i14++) {
            if (kb2Var.c()) {
                i13 |= 1 << i14;
            }
        }
        int i15 = 6;
        int[] iArr = new int[6];
        for (int i16 = 0; i16 < 6; i16++) {
            iArr[i16] = kb2Var.b(8);
        }
        int iB4 = kb2Var.b(8);
        int i17 = 0;
        for (int i18 = 0; i18 < iB; i18++) {
            if (kb2Var.c()) {
                i17 += 89;
            }
            if (kb2Var.c()) {
                i17 += 8;
            }
        }
        kb2Var.d(i17);
        if (iB > 0) {
            kb2Var.d((8 - iB) * 2);
        }
        kb2Var.d();
        int iD = kb2Var.d();
        if (iD == 3) {
            kb2Var.f();
        }
        int iD2 = kb2Var.d();
        int iD3 = kb2Var.d();
        if (kb2Var.c()) {
            int iD4 = kb2Var.d();
            int iD5 = kb2Var.d();
            int iD6 = kb2Var.d();
            int iD7 = kb2Var.d();
            iD2 -= (iD4 + iD5) * ((iD == 1 || iD == 2) ? 2 : 1);
            iD3 -= (iD6 + iD7) * (iD == 1 ? 2 : 1);
        }
        int i19 = iD3;
        int i20 = iD2;
        kb2Var.d();
        kb2Var.d();
        int iD8 = kb2Var.d();
        for (int i21 = kb2Var.c() ? 0 : iB; i21 <= iB; i21++) {
            kb2Var.d();
            kb2Var.d();
            kb2Var.d();
        }
        kb2Var.d();
        kb2Var.d();
        kb2Var.d();
        kb2Var.d();
        kb2Var.d();
        kb2Var.d();
        if (kb2Var.c() && kb2Var.c()) {
            int i22 = 0;
            while (i22 < i12) {
                int i23 = 0;
                while (i23 < i15) {
                    if (!kb2Var.c()) {
                        kb2Var.d();
                    } else {
                        int iMin = Math.min(64, 1 << ((i22 << 1) + 4));
                        if (i22 > 1) {
                            kb2Var.e();
                        }
                        for (int i24 = 0; i24 < iMin; i24++) {
                            kb2Var.e();
                        }
                    }
                    i23 += i22 == 3 ? 3 : 1;
                    i15 = 6;
                }
                i22++;
                i12 = 4;
                i15 = 6;
            }
        }
        kb2Var.d(2);
        if (kb2Var.c()) {
            kb2Var.d(8);
            kb2Var.d();
            kb2Var.d();
            kb2Var.f();
        }
        int[] iArr2 = new int[0];
        int[] iArr3 = new int[0];
        int i25 = -1;
        int i26 = 0;
        int iD9 = -1;
        for (int iD10 = kb2Var.d(); i26 < iD10; iD10 = iD10) {
            if (i26 != 0 && kb2Var.c()) {
                int i27 = i25 + iD9;
                int iD11 = (1 - ((kb2Var.c() ? 1 : 0) * 2)) * (kb2Var.d() + 1);
                int i28 = i27 + 1;
                boolean[] zArr = new boolean[i28];
                for (int i29 = 0; i29 <= i27; i29++) {
                    if (!kb2Var.c()) {
                        zArr[i29] = kb2Var.c();
                    } else {
                        zArr[i29] = true;
                    }
                }
                int[] iArr4 = new int[i28];
                int[] iArr5 = new int[i28];
                int i30 = 0;
                for (int i31 = iD9 - 1; i31 >= 0; i31--) {
                    int i32 = iArr3[i31] + iD11;
                    if (i32 < 0 && zArr[i25 + i31]) {
                        iArr4[i30] = i32;
                        i30++;
                    }
                }
                if (iD11 < 0 && zArr[i27]) {
                    iArr4[i30] = iD11;
                    i30++;
                }
                int i33 = i30;
                for (int i34 = 0; i34 < i25; i34++) {
                    int i35 = iArr2[i34] + iD11;
                    if (i35 < 0 && zArr[i34]) {
                        iArr4[i33] = i35;
                        i33++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i33);
                int i36 = 0;
                for (int i37 = i25 - 1; i37 >= 0; i37--) {
                    int i38 = iArr2[i37] + iD11;
                    if (i38 > 0 && zArr[i37]) {
                        iArr5[i36] = i38;
                        i36++;
                    }
                }
                if (iD11 > 0 && zArr[i27]) {
                    iArr5[i36] = iD11;
                    i36++;
                }
                int i39 = i36;
                for (int i40 = 0; i40 < iD9; i40++) {
                    int i41 = iArr3[i40] + iD11;
                    if (i41 > 0 && zArr[i25 + i40]) {
                        iArr5[i39] = i41;
                        i39++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i39);
                iD9 = i39;
                iArr2 = iArrCopyOf2;
                i25 = i33;
                z10 = true;
            } else {
                int iD12 = kb2Var.d();
                iD9 = kb2Var.d();
                iArr2 = new int[iD12];
                for (int i42 = 0; i42 < iD12; i42++) {
                    iArr2[i42] = kb2Var.d() + 1;
                    kb2Var.f();
                }
                z10 = true;
                int[] iArr6 = new int[iD9];
                for (int i43 = 0; i43 < iD9; i43++) {
                    iArr6[i43] = kb2Var.d() + 1;
                    kb2Var.f();
                }
                i25 = iD12;
                iArrCopyOf = iArr6;
            }
            i26++;
            iB4 = iB4;
            iArr = iArr;
            i13 = i13;
            iB3 = iB3;
            iArr3 = iArrCopyOf;
        }
        int i44 = iB3;
        int i45 = i13;
        int[] iArr7 = iArr;
        int i46 = iB4;
        if (kb2Var.c()) {
            for (int i47 = 0; i47 < kb2Var.d(); i47++) {
                kb2Var.d(iD8 + 5);
            }
        }
        kb2Var.d(2);
        float f10 = 1.0f;
        if (kb2Var.c()) {
            if (kb2Var.c()) {
                int iB5 = kb2Var.b(8);
                if (iB5 == 255) {
                    int iB6 = kb2Var.b(16);
                    int iB7 = kb2Var.b(16);
                    if (iB6 != 0 && iB7 != 0) {
                        f10 = iB6 / iB7;
                    }
                } else {
                    float[] fArr = f76844b;
                    if (iB5 < 17) {
                        f10 = fArr[iB5];
                    } else {
                        kf1.a("Unexpected aspect_ratio_idc value: ", iB5, "NalUnitUtil");
                    }
                }
            }
            if (kb2Var.c()) {
                kb2Var.f();
            }
            if (kb2Var.c()) {
                kb2Var.d(4);
                if (kb2Var.c()) {
                    kb2Var.d(24);
                }
            }
            if (kb2Var.c()) {
                kb2Var.d();
                kb2Var.d();
            }
            kb2Var.f();
            if (kb2Var.c()) {
                i19 *= 2;
            }
        }
        return new ay1(iB2, zC, i44, i45, iArr7, i46, i20, i19, f10);
    }

    public static int a(int i10, byte[] bArr) {
        int i11;
        synchronized (f76845c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 >= i10 - 2) {
                        i12 = i10;
                        break;
                    }
                    try {
                        if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = f76846d;
                    if (iArr.length <= i13) {
                        f76846d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f76846d[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f76846d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i18 + 2;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
