package l6;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

/* JADX INFO: compiled from: ITFReader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class m extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f63453b = {6, 8, 10, 12, 14};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f63454c = {1, 1, 1, 1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[][] f63455d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[][] f63456e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f63457a = -1;

    public static int[] k(c6.a aVar, int i10, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int iL = aVar.l();
        int i11 = i10;
        boolean z10 = false;
        int i12 = 0;
        while (i10 < iL) {
            if (aVar.g(i10) != z10) {
                iArr2[i12] = iArr2[i12] + 1;
            } else {
                if (i12 != length - 1) {
                    i12++;
                } else {
                    if (q.d(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i11, i10};
                    }
                    i11 += iArr2[0] + iArr2[1];
                    int i13 = i12 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i13);
                    iArr2[i13] = 0;
                    iArr2[i12] = 0;
                    i12--;
                }
                iArr2[i12] = 1;
                z10 = !z10;
            }
            i10++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int g(int[] iArr) throws NotFoundException {
        int length = f63456e.length;
        float f10 = 0.38f;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            float fD = q.d(iArr, f63456e[i11], 0.5f);
            if (fD < f10) {
                i10 = i11;
                f10 = fD;
            } else if (fD == f10) {
                i10 = -1;
            }
        }
        if (i10 >= 0) {
            return i10 % 10;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static void i(c6.a aVar, int i10, int i11, StringBuilder sb2) throws NotFoundException {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i10 < i11) {
            q.e(aVar, i10, iArr);
            for (int i12 = 0; i12 < 5; i12++) {
                int i13 = i12 * 2;
                iArr2[i12] = iArr[i13];
                iArr3[i12] = iArr[i13 + 1];
            }
            sb2.append((char) (g(iArr2) + 48));
            sb2.append((char) (g(iArr3) + 48));
            for (int i14 = 0; i14 < 10; i14++) {
                i10 += iArr[i14];
            }
        }
    }

    public final void m(c6.a aVar, int i10) throws NotFoundException {
        int iMin = Math.min(this.f63457a * 10, i10);
        for (int i11 = i10 - 1; iMin > 0 && i11 >= 0 && !aVar.g(i11); i11--) {
            iMin--;
        }
        if (iMin != 0) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    public static int l(c6.a aVar) throws NotFoundException {
        int iL = aVar.l();
        int iJ = aVar.j(0);
        if (iJ != iL) {
            return iJ;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // l6.q
    public y5.i b(int i10, c6.a aVar, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        int[] iArr;
        boolean z10;
        int[] iArrJ = j(aVar);
        int[] iArrH = h(aVar);
        StringBuilder sb2 = new StringBuilder(20);
        i(aVar, iArrJ[1], iArrH[0], sb2);
        String string = sb2.toString();
        if (map != null) {
            iArr = (int[]) map.get(DecodeHintType.ALLOWED_LENGTHS);
        } else {
            iArr = null;
        }
        if (iArr == null) {
            iArr = f63453b;
        }
        int length = string.length();
        int length2 = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 < length2) {
                int i13 = iArr[i11];
                if (length == i13) {
                    z10 = true;
                    break;
                }
                if (i13 > i12) {
                    i12 = i13;
                }
                i11++;
            } else {
                z10 = false;
                break;
            }
        }
        if (!z10 && length > i12) {
            z10 = true;
        }
        if (z10) {
            float f10 = i10;
            return new y5.i(string, null, new y5.j[]{new y5.j(iArrJ[1], f10), new y5.j(iArrH[0], f10)}, BarcodeFormat.ITF);
        }
        throw FormatException.getFormatInstance();
    }

    public final int[] h(c6.a aVar) throws NotFoundException {
        int[] iArrK;
        aVar.p();
        try {
            int iL = l(aVar);
            try {
                iArrK = k(aVar, iL, f63455d[0]);
            } catch (NotFoundException unused) {
                iArrK = k(aVar, iL, f63455d[1]);
            }
            m(aVar, iArrK[0]);
            int i10 = iArrK[0];
            iArrK[0] = aVar.l() - iArrK[1];
            iArrK[1] = aVar.l() - i10;
            aVar.p();
            return iArrK;
        } catch (Throwable th2) {
            aVar.p();
            throw th2;
        }
    }

    public final int[] j(c6.a aVar) throws NotFoundException {
        int[] iArrK = k(aVar, l(aVar), f63454c);
        int i10 = iArrK[1];
        int i11 = iArrK[0];
        this.f63457a = (i10 - i11) / 4;
        m(aVar, i11);
        return iArrK;
    }
}
