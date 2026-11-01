package l6;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: UPCEANReader.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class x extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f63476d = {1, 1, 1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f63477e = {1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f63478f = {1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[][] f63479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[][] f63480h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f63481a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f63482b = new w();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f63483c = new l();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f63479g = iArr;
        int[][] iArr2 = new int[20][];
        f63480h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i10 = 10; i10 < 20; i10++) {
            int[] iArr3 = f63479g[i10 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i11 = 0; i11 < iArr3.length; i11++) {
                iArr4[i11] = iArr3[(iArr3.length - i11) - 1];
            }
            f63480h[i10] = iArr4;
        }
    }

    public static int[] m(c6.a aVar, int i10, boolean z10, int[] iArr) throws NotFoundException {
        return n(aVar, i10, z10, iArr, new int[iArr.length]);
    }

    public abstract int k(c6.a aVar, int[] iArr, StringBuilder sb2) throws NotFoundException;

    public y5.i l(int i10, c6.a aVar, int[] iArr, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int length;
        String strC;
        y5.k kVar = map == null ? null : (y5.k) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        boolean z10 = true;
        if (kVar != null) {
            kVar.a(new y5.j((iArr[0] + iArr[1]) / 2.0f, i10));
        }
        StringBuilder sb2 = this.f63481a;
        sb2.setLength(0);
        int iK = k(aVar, iArr, sb2);
        if (kVar != null) {
            kVar.a(new y5.j(iK, i10));
        }
        int[] iArrJ = j(aVar, iK);
        if (kVar != null) {
            kVar.a(new y5.j((iArrJ[0] + iArrJ[1]) / 2.0f, i10));
        }
        int i11 = iArrJ[1];
        int i12 = (i11 - iArrJ[0]) + i11;
        if (i12 >= aVar.l() || !aVar.n(i11, i12, false)) {
            throw NotFoundException.getNotFoundInstance();
        }
        String string = sb2.toString();
        if (string.length() < 8) {
            throw FormatException.getFormatInstance();
        }
        if (!g(string)) {
            throw ChecksumException.getChecksumInstance();
        }
        float f10 = (iArr[1] + iArr[0]) / 2.0f;
        float f11 = (iArrJ[1] + iArrJ[0]) / 2.0f;
        BarcodeFormat barcodeFormatP = p();
        float f12 = i10;
        y5.i iVar = new y5.i(string, null, new y5.j[]{new y5.j(f10, f12), new y5.j(f11, f12)}, barcodeFormatP);
        try {
            y5.i iVarA = this.f63482b.a(i10, aVar, iArrJ[1]);
            iVar.h(ResultMetadataType.UPC_EAN_EXTENSION, iVarA.f());
            iVar.g(iVarA.d());
            iVar.a(iVarA.e());
            length = iVarA.f().length();
        } catch (ReaderException unused) {
            length = 0;
        }
        int[] iArr2 = map != null ? (int[]) map.get(DecodeHintType.ALLOWED_EAN_EXTENSIONS) : null;
        if (iArr2 != null) {
            int length2 = iArr2.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length2) {
                    z10 = false;
                    break;
                }
                if (length == iArr2[i13]) {
                    break;
                }
                i13++;
            }
            if (!z10) {
                throw NotFoundException.getNotFoundInstance();
            }
        }
        if ((barcodeFormatP == BarcodeFormat.EAN_13 || barcodeFormatP == BarcodeFormat.UPC_A) && (strC = this.f63483c.c(string)) != null) {
            iVar.h(ResultMetadataType.POSSIBLE_COUNTRY, strC);
        }
        return iVar;
    }

    public abstract BarcodeFormat p();

    public static int[] o(c6.a aVar) throws NotFoundException {
        int[] iArr = new int[f63476d.length];
        int[] iArrN = null;
        boolean zN = false;
        int i10 = 0;
        while (!zN) {
            int[] iArr2 = f63476d;
            Arrays.fill(iArr, 0, iArr2.length, 0);
            iArrN = n(aVar, i10, false, iArr2, iArr);
            int i11 = iArrN[0];
            int i12 = iArrN[1];
            int i13 = i11 - (i12 - i11);
            if (i13 >= 0) {
                zN = aVar.n(i13, i11, false);
            }
            i10 = i12;
        }
        return iArrN;
    }

    public int[] j(c6.a aVar, int i10) throws NotFoundException {
        return m(aVar, i10, false, f63476d);
    }

    public static boolean h(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i10 = length - 1;
        if (q(charSequence.subSequence(0, i10)) != Character.digit(charSequence.charAt(i10), 10)) {
            return false;
        }
        return true;
    }

    public static int i(c6.a aVar, int[] iArr, int i10, int[][] iArr2) throws NotFoundException {
        q.e(aVar, i10, iArr);
        int length = iArr2.length;
        float f10 = 0.48f;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            float fD = q.d(iArr, iArr2[i12], 0.7f);
            if (fD < f10) {
                i11 = i12;
                f10 = fD;
            }
        }
        if (i11 >= 0) {
            return i11;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int[] n(c6.a aVar, int i10, boolean z10, int[] iArr, int[] iArr2) throws NotFoundException {
        int iJ;
        int iL = aVar.l();
        if (z10) {
            iJ = aVar.k(i10);
        } else {
            iJ = aVar.j(i10);
        }
        int length = iArr.length;
        boolean z11 = z10;
        int i11 = 0;
        int i12 = iJ;
        while (iJ < iL) {
            if (aVar.g(iJ) != z11) {
                iArr2[i11] = iArr2[i11] + 1;
            } else {
                if (i11 == length - 1) {
                    if (q.d(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i12, iJ};
                    }
                    i12 += iArr2[0] + iArr2[1];
                    int i13 = i11 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i13);
                    iArr2[i13] = 0;
                    iArr2[i11] = 0;
                    i11--;
                } else {
                    i11++;
                }
                iArr2[i11] = 1;
                z11 = !z11;
            }
            iJ++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int q(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i10 = 0;
        for (int i11 = length - 1; i11 >= 0; i11 -= 2) {
            int iCharAt = charSequence.charAt(i11) - '0';
            if (iCharAt >= 0 && iCharAt <= 9) {
                i10 += iCharAt;
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        int i12 = i10 * 3;
        for (int i13 = length - 2; i13 >= 0; i13 -= 2) {
            int iCharAt2 = charSequence.charAt(i13) - '0';
            if (iCharAt2 >= 0 && iCharAt2 <= 9) {
                i12 += iCharAt2;
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        return (1000 - i12) % 10;
    }

    @Override // l6.q
    public y5.i b(int i10, c6.a aVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return l(i10, aVar, o(aVar), map);
    }

    public boolean g(String str) throws FormatException {
        return h(str);
    }
}
