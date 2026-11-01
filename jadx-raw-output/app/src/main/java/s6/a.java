package s6;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import y5.j;

/* JADX INFO: compiled from: Detector.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f67033a = {0, 4, 1, 5};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f67034b = {6, 2, 7, 3};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f67035c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f67036d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    public static void a(j[] jVarArr, j[] jVarArr2, int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            jVarArr[iArr[i10]] = jVarArr2[i10];
        }
    }

    public static int[] d(c6.b bVar, int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i13 = 0;
        while (bVar.d(i10, i11) && i10 > 0) {
            int i14 = i13 + 1;
            if (i13 >= 3) {
                break;
            }
            i10--;
            i13 = i14;
        }
        int length = iArr.length;
        int i15 = i10;
        int i16 = 0;
        boolean z10 = false;
        while (i10 < i12) {
            if (bVar.d(i10, i11) != z10) {
                iArr2[i16] = iArr2[i16] + 1;
            } else {
                if (i16 != length - 1) {
                    i16++;
                } else {
                    if (g(iArr2, iArr) < 0.42f) {
                        return new int[]{i15, i10};
                    }
                    i15 += iArr2[0] + iArr2[1];
                    int i17 = i16 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i17);
                    iArr2[i17] = 0;
                    iArr2[i16] = 0;
                    i16--;
                }
                iArr2[i16] = 1;
                z10 = !z10;
            }
            i10++;
        }
        if (i16 != length - 1 || g(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i15, i10 - 1};
    }

    public static float g(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f10 = i10;
        float f11 = f10 / i11;
        float f12 = 0.8f * f11;
        float f13 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            float f14 = iArr2[i13] * f11;
            float f15 = i14;
            float f16 = f15 > f14 ? f15 - f14 : f14 - f15;
            if (f16 > f12) {
                return Float.POSITIVE_INFINITY;
            }
            f13 += f16;
        }
        return f13 / f10;
    }

    public static List<j[]> b(boolean z10, c6.b bVar) {
        int iC;
        float fD;
        ArrayList<j[]> arrayList = new ArrayList();
        int iMax = 0;
        int i10 = 0;
        loop0: while (true) {
            int i11 = i10;
            while (iMax < bVar.g()) {
                j[] jVarArrF = f(bVar, iMax, i10);
                if (jVarArrF[0] == null && jVarArrF[3] == null) {
                    if (i11 == 0) {
                        break;
                    }
                    for (j[] jVarArr : arrayList) {
                        j jVar = jVarArr[1];
                        if (jVar != null) {
                            iMax = (int) Math.max(iMax, jVar.d());
                        }
                        j jVar2 = jVarArr[3];
                        if (jVar2 != null) {
                            iMax = Math.max(iMax, (int) jVar2.d());
                        }
                    }
                    iMax += 5;
                    i10 = 0;
                } else {
                    arrayList.add(jVarArrF);
                    if (!z10) {
                        break loop0;
                    }
                    j jVar3 = jVarArrF[2];
                    if (jVar3 != null) {
                        iC = (int) jVar3.c();
                        fD = jVarArrF[2].d();
                    } else {
                        iC = (int) jVarArrF[4].c();
                        fD = jVarArrF[4].d();
                    }
                    iMax = (int) fD;
                    i10 = iC;
                    i11 = 1;
                }
            }
            break loop0;
        }
        return arrayList;
    }

    public static j[] e(c6.b bVar, int i10, int i11, int i12, int i13, int[] iArr) {
        boolean z10;
        int i14;
        int i15;
        j[] jVarArr = new j[4];
        int[] iArr2 = new int[iArr.length];
        int i16 = i12;
        while (true) {
            if (i16 >= i10) {
                z10 = false;
                break;
            }
            int[] iArrD = d(bVar, i13, i16, i11, iArr, iArr2);
            if (iArrD != null) {
                int i17 = i16;
                int[] iArr3 = iArrD;
                int i18 = i17;
                while (true) {
                    if (i18 <= 0) {
                        i15 = i18;
                        break;
                    }
                    int i19 = i18 - 1;
                    int[] iArrD2 = d(bVar, i13, i19, i11, iArr, iArr2);
                    if (iArrD2 == null) {
                        i15 = i19 + 1;
                        break;
                    }
                    iArr3 = iArrD2;
                    i18 = i19;
                }
                float f10 = i15;
                jVarArr[0] = new j(iArr3[0], f10);
                jVarArr[1] = new j(iArr3[1], f10);
                z10 = true;
                i16 = i15;
                break;
            }
            i16 += 5;
        }
        int i20 = i16 + 1;
        if (z10) {
            int[] iArr4 = {(int) jVarArr[0].c(), (int) jVarArr[1].c()};
            int i21 = i20;
            int i22 = 0;
            while (true) {
                if (i21 >= i10) {
                    i14 = i22;
                    break;
                }
                i14 = i22;
                int[] iArrD3 = d(bVar, iArr4[0], i21, i11, iArr, iArr2);
                if (iArrD3 != null && Math.abs(iArr4[0] - iArrD3[0]) < 5 && Math.abs(iArr4[1] - iArrD3[1]) < 5) {
                    iArr4 = iArrD3;
                    i22 = 0;
                } else {
                    if (i14 > 25) {
                        break;
                    }
                    i22 = i14 + 1;
                }
                i21++;
            }
            i20 = i21 - (i14 + 1);
            float f11 = i20;
            jVarArr[2] = new j(iArr4[0], f11);
            jVarArr[3] = new j(iArr4[1], f11);
        }
        if (i20 - i16 < 10) {
            Arrays.fill(jVarArr, (Object) null);
        }
        return jVarArr;
    }

    public static b c(y5.b bVar, Map<DecodeHintType, ?> map, boolean z10) throws NotFoundException {
        c6.b bVarA = bVar.a();
        List<j[]> listB = b(z10, bVarA);
        if (listB.isEmpty()) {
            bVarA = bVarA.clone();
            bVarA.k();
            listB = b(z10, bVarA);
        }
        return new b(bVarA, listB);
    }

    public static j[] f(c6.b bVar, int i10, int i11) {
        int iG = bVar.g();
        int iJ = bVar.j();
        j[] jVarArr = new j[8];
        a(jVarArr, e(bVar, iG, iJ, i10, i11, f67035c), f67033a);
        j jVar = jVarArr[4];
        if (jVar != null) {
            i11 = (int) jVar.c();
            i10 = (int) jVarArr[4].d();
        }
        a(jVarArr, e(bVar, iG, iJ, i10, i11, f67036d), f67034b);
        return jVarArr;
    }
}
