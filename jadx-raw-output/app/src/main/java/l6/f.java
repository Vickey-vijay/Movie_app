package l6;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: Code93Reader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class f extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f63443c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f63444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f63445e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f63446a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f63447b = new int[6];

    public static char k(int i10) throws NotFoundException {
        int i11 = 0;
        while (true) {
            int[] iArr = f63444d;
            if (i11 >= iArr.length) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (iArr[i11] == i10) {
                return f63443c[i11];
            }
            i11++;
        }
    }

    public static int l(int[] iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int iRound = Math.round((iArr[i13] * 9.0f) / i10);
            if (iRound <= 0 || iRound > 4) {
                return -1;
            }
            if ((i13 & 1) == 0) {
                for (int i14 = 0; i14 < iRound; i14++) {
                    i12 = (i12 << 1) | 1;
                }
            } else {
                i12 <<= iRound;
            }
        }
        return i12;
    }

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, TypedValues.CycleType.TYPE_WAVE_OFFSET, TypedValues.CycleType.TYPE_EASING, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, com.safedk.android.internal.d.f44769a, 278, 436, 434, 428, TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f63444d = iArr;
        f63445e = iArr[47];
    }

    public static void h(CharSequence charSequence, int i10, int i11) throws ChecksumException {
        int iIndexOf = 0;
        int i12 = 1;
        for (int i13 = i10 - 1; i13 >= 0; i13--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i13)) * i12;
            i12++;
            if (i12 > i11) {
                i12 = 1;
            }
        }
        if (charSequence.charAt(i10) != f63443c[iIndexOf % 47]) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    public static void g(CharSequence charSequence) throws ChecksumException {
        int length = charSequence.length();
        h(charSequence, length - 2, 20);
        h(charSequence, length - 1, 15);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    public static String i(CharSequence charSequence) throws FormatException {
        int i10;
        char c10;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i11 = 0;
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt >= 'a' && cCharAt <= 'd') {
                if (i11 < length - 1) {
                    i11++;
                    char cCharAt2 = charSequence.charAt(i11);
                    switch (cCharAt) {
                        case 'a':
                            if (cCharAt2 >= 'A' && cCharAt2 <= 'Z') {
                                i10 = cCharAt2 - '@';
                                c10 = (char) i10;
                                sb2.append(c10);
                            } else {
                                throw FormatException.getFormatInstance();
                            }
                            break;
                        case 'b':
                            if (cCharAt2 >= 'A' && cCharAt2 <= 'E') {
                                i10 = cCharAt2 - '&';
                            } else if (cCharAt2 >= 'F' && cCharAt2 <= 'J') {
                                i10 = cCharAt2 - 11;
                            } else if (cCharAt2 >= 'K' && cCharAt2 <= 'O') {
                                i10 = cCharAt2 + 16;
                            } else {
                                if (cCharAt2 >= 'P' && cCharAt2 <= 'T') {
                                    i10 = cCharAt2 + '+';
                                } else if (cCharAt2 == 'U') {
                                    c10 = 0;
                                } else if (cCharAt2 == 'V') {
                                    c10 = '@';
                                } else if (cCharAt2 == 'W') {
                                    c10 = '`';
                                } else if (cCharAt2 >= 'X' && cCharAt2 <= 'Z') {
                                    c10 = 127;
                                } else {
                                    throw FormatException.getFormatInstance();
                                }
                                sb2.append(c10);
                            }
                            c10 = (char) i10;
                            sb2.append(c10);
                            break;
                        case 'c':
                            if (cCharAt2 >= 'A' && cCharAt2 <= 'O') {
                                i10 = cCharAt2 - ' ';
                                c10 = (char) i10;
                            } else if (cCharAt2 == 'Z') {
                                c10 = ':';
                            } else {
                                throw FormatException.getFormatInstance();
                            }
                            sb2.append(c10);
                            break;
                        case 'd':
                            if (cCharAt2 >= 'A' && cCharAt2 <= 'Z') {
                                i10 = cCharAt2 + ' ';
                                c10 = (char) i10;
                                sb2.append(c10);
                            } else {
                                throw FormatException.getFormatInstance();
                            }
                            break;
                        default:
                            c10 = 0;
                            sb2.append(c10);
                            break;
                    }
                } else {
                    throw FormatException.getFormatInstance();
                }
            } else {
                sb2.append(cCharAt);
            }
            i11++;
        }
        return sb2.toString();
    }

    @Override // l6.q
    public y5.i b(int i10, c6.a aVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int[] iArrJ = j(aVar);
        int iJ = aVar.j(iArrJ[1]);
        int iL = aVar.l();
        int[] iArr = this.f63447b;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f63446a;
        sb2.setLength(0);
        while (true) {
            q.e(aVar, iJ, iArr);
            int iL2 = l(iArr);
            if (iL2 >= 0) {
                char cK = k(iL2);
                sb2.append(cK);
                int i11 = iJ;
                for (int i12 : iArr) {
                    i11 += i12;
                }
                int iJ2 = aVar.j(i11);
                if (cK == '*') {
                    sb2.deleteCharAt(sb2.length() - 1);
                    int i13 = 0;
                    for (int i14 : iArr) {
                        i13 += i14;
                    }
                    if (iJ2 != iL && aVar.g(iJ2)) {
                        if (sb2.length() >= 2) {
                            g(sb2);
                            sb2.setLength(sb2.length() - 2);
                            float f10 = i10;
                            return new y5.i(i(sb2), null, new y5.j[]{new y5.j((iArrJ[1] + iArrJ[0]) / 2.0f, f10), new y5.j(iJ + (i13 / 2.0f), f10)}, BarcodeFormat.CODE_93);
                        }
                        throw NotFoundException.getNotFoundInstance();
                    }
                    throw NotFoundException.getNotFoundInstance();
                }
                iJ = iJ2;
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }

    public final int[] j(c6.a aVar) throws NotFoundException {
        int iL = aVar.l();
        int iJ = aVar.j(0);
        Arrays.fill(this.f63447b, 0);
        int[] iArr = this.f63447b;
        int length = iArr.length;
        boolean z10 = false;
        int i10 = 0;
        int i11 = iJ;
        while (iJ < iL) {
            if (aVar.g(iJ) != z10) {
                iArr[i10] = iArr[i10] + 1;
            } else {
                if (i10 == length - 1) {
                    if (l(iArr) == f63445e) {
                        return new int[]{i11, iJ};
                    }
                    i11 += iArr[0] + iArr[1];
                    int i12 = i10 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i12);
                    iArr[i12] = 0;
                    iArr[i10] = 0;
                    i10--;
                } else {
                    i10++;
                }
                iArr[i10] = 1;
                z10 = !z10;
            }
            iJ++;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
