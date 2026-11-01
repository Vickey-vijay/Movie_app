package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Log;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f17837a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f17838b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f17839c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int[] f17840d = new int[10];

    public static int a(int i10, byte[] bArr) {
        int i11;
        synchronized (f17839c) {
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
                    int[] iArr = f17840d;
                    if (iArr.length <= i13) {
                        f17840d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f17840d[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f17840d[i16] - i15;
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

    /* JADX WARN: Code duplicated, block: B:91:0x016f  */
    public static k a(byte[] bArr, int i10, int i11) {
        int iD;
        boolean z10;
        int iD2;
        boolean z11;
        float f10;
        o oVar = new o(bArr, i10, i11);
        oVar.d(8);
        int iB = oVar.b(8);
        oVar.d(16);
        int iD3 = oVar.d();
        int i12 = 1;
        if (iB == 100 || iB == 110 || iB == 122 || iB == 244 || iB == 44 || iB == 83 || iB == 86 || iB == 118 || iB == 128 || iB == 138) {
            iD = oVar.d();
            boolean zC = iD == 3 ? oVar.c() : false;
            oVar.d();
            oVar.d();
            oVar.f();
            if (oVar.c()) {
                int i13 = iD != 3 ? 8 : 12;
                int i14 = 0;
                while (i14 < i13) {
                    if (oVar.c()) {
                        int i15 = i14 < 6 ? 16 : 64;
                        int iE = 8;
                        int i16 = 8;
                        for (int i17 = 0; i17 < i15; i17++) {
                            if (iE != 0) {
                                iE = ((oVar.e() + i16) + 256) % 256;
                            }
                            if (iE != 0) {
                                i16 = iE;
                            }
                        }
                    }
                    i14++;
                }
            }
            z10 = zC;
        } else {
            z10 = false;
            iD = 1;
        }
        int iD4 = oVar.d() + 4;
        int iD5 = oVar.d();
        if (iD5 == 0) {
            z11 = false;
            iD2 = oVar.d() + 4;
        } else if (iD5 == 1) {
            boolean zC2 = oVar.c();
            oVar.e();
            oVar.e();
            long jD = oVar.d();
            for (int i18 = 0; i18 < jD; i18++) {
                oVar.d();
            }
            iD2 = 0;
            z11 = zC2;
        } else {
            iD2 = 0;
            z11 = false;
        }
        oVar.d();
        oVar.f();
        int iD6 = oVar.d() + 1;
        int iD7 = oVar.d() + 1;
        boolean zC3 = oVar.c();
        int i19 = 2 - (zC3 ? 1 : 0);
        int i20 = iD7 * i19;
        if (!zC3) {
            oVar.f();
        }
        oVar.f();
        int i21 = iD6 * 16;
        int i22 = i20 * 16;
        if (oVar.c()) {
            int iD8 = oVar.d();
            int iD9 = oVar.d();
            int iD10 = oVar.d();
            int iD11 = oVar.d();
            if (iD != 0) {
                int i23 = iD == 3 ? 1 : 2;
                i19 *= iD == 1 ? 2 : 1;
                i12 = i23;
            }
            i21 -= (iD8 + iD9) * i12;
            i22 -= (iD10 + iD11) * i19;
        }
        int i24 = i21;
        int i25 = i22;
        if (oVar.c() && oVar.c()) {
            int iB2 = oVar.b(8);
            if (iB2 == 255) {
                int iB3 = oVar.b(16);
                int iB4 = oVar.b(16);
                if (iB3 == 0 || iB4 == 0) {
                    f10 = 1.0f;
                } else {
                    f10 = iB3 / iB4;
                }
            } else {
                float[] fArr = f17838b;
                if (iB2 < 17) {
                    f10 = fArr[iB2];
                } else {
                    Log.w("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iB2);
                    f10 = 1.0f;
                }
            }
        } else {
            f10 = 1.0f;
        }
        return new k(iD3, i24, i25, f10, z10, zC3, iD4, iD5, iD2, z11);
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

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
