package l6;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: Code39Reader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d extends q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f63438e = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 388, 196, 168, 162, 138, 42};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f63439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StringBuilder f63441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f63442d;

    public d() {
        this(false);
    }

    public static char i(int i10) throws NotFoundException {
        int i11 = 0;
        while (true) {
            int[] iArr = f63438e;
            if (i11 >= iArr.length) {
                if (i10 == 148) {
                    return '*';
                }
                throw NotFoundException.getNotFoundInstance();
            }
            if (iArr[i11] == i10) {
                return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i11);
            }
            i11++;
        }
    }

    public static int j(int[] iArr) {
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            int i11 = Integer.MAX_VALUE;
            for (int i12 : iArr) {
                if (i12 < i11 && i12 > i10) {
                    i11 = i12;
                }
            }
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < length; i16++) {
                int i17 = iArr[i16];
                if (i17 > i11) {
                    i14 |= 1 << ((length - 1) - i16);
                    i13++;
                    i15 += i17;
                }
            }
            if (i13 == 3) {
                for (int i18 = 0; i18 < length && i13 > 0; i18++) {
                    int i19 = iArr[i18];
                    if (i19 > i11) {
                        i13--;
                        if ((i19 << 1) >= i15) {
                            return -1;
                        }
                    }
                }
                return i14;
            }
            if (i13 <= 3) {
                return -1;
            }
            i10 = i11;
        }
    }

    public d(boolean z10) {
        this(z10, false);
    }

    @Override // l6.q
    public y5.i b(int i10, c6.a aVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int[] iArr = this.f63442d;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f63441c;
        sb2.setLength(0);
        int[] iArrH = h(aVar, iArr);
        int iJ = aVar.j(iArrH[1]);
        int iL = aVar.l();
        while (true) {
            q.e(aVar, iJ, iArr);
            int iJ2 = j(iArr);
            if (iJ2 < 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            char cI = i(iJ2);
            sb2.append(cI);
            int i11 = iJ;
            for (int i12 : iArr) {
                i11 += i12;
            }
            int iJ3 = aVar.j(i11);
            if (cI == '*') {
                sb2.setLength(sb2.length() - 1);
                int i13 = 0;
                for (int i14 : iArr) {
                    i13 += i14;
                }
                int i15 = (iJ3 - iJ) - i13;
                if (iJ3 != iL && (i15 << 1) < i13) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (this.f63439a) {
                    int length = sb2.length() - 1;
                    int iIndexOf = 0;
                    for (int i16 = 0; i16 < length; i16++) {
                        iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f63441c.charAt(i16));
                    }
                    if (sb2.charAt(length) != "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(iIndexOf % 43)) {
                        throw ChecksumException.getChecksumInstance();
                    }
                    sb2.setLength(length);
                }
                if (sb2.length() == 0) {
                    throw NotFoundException.getNotFoundInstance();
                }
                float f10 = i10;
                return new y5.i(this.f63440b ? g(sb2) : sb2.toString(), null, new y5.j[]{new y5.j((iArrH[1] + iArrH[0]) / 2.0f, f10), new y5.j(iJ + (i13 / 2.0f), f10)}, BarcodeFormat.CODE_39);
            }
            iJ = iJ3;
        }
    }

    public d(boolean z10, boolean z11) {
        this.f63439a = z10;
        this.f63440b = z11;
        this.f63441c = new StringBuilder(20);
        this.f63442d = new int[9];
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    public static String g(CharSequence charSequence) throws FormatException {
        int i10;
        char c10;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i11 = 0;
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt != '+' && cCharAt != '$' && cCharAt != '%' && cCharAt != '/') {
                sb2.append(cCharAt);
            } else {
                i11++;
                char cCharAt2 = charSequence.charAt(i11);
                if (cCharAt != '$') {
                    if (cCharAt != '%') {
                        if (cCharAt != '+') {
                            if (cCharAt != '/') {
                                c10 = 0;
                            } else if (cCharAt2 >= 'A' && cCharAt2 <= 'O') {
                                i10 = cCharAt2 - ' ';
                            } else if (cCharAt2 == 'Z') {
                                c10 = ':';
                            } else {
                                throw FormatException.getFormatInstance();
                            }
                        } else if (cCharAt2 >= 'A' && cCharAt2 <= 'Z') {
                            i10 = cCharAt2 + ' ';
                        } else {
                            throw FormatException.getFormatInstance();
                        }
                    } else if (cCharAt2 >= 'A' && cCharAt2 <= 'E') {
                        i10 = cCharAt2 - '&';
                    } else if (cCharAt2 >= 'F' && cCharAt2 <= 'J') {
                        i10 = cCharAt2 - 11;
                    } else if (cCharAt2 >= 'K' && cCharAt2 <= 'O') {
                        i10 = cCharAt2 + 16;
                    } else if (cCharAt2 >= 'P' && cCharAt2 <= 'T') {
                        i10 = cCharAt2 + '+';
                    } else if (cCharAt2 == 'U') {
                        c10 = 0;
                    } else if (cCharAt2 == 'V') {
                        c10 = '@';
                    } else if (cCharAt2 == 'W') {
                        c10 = '`';
                    } else {
                        if (cCharAt2 != 'X' && cCharAt2 != 'Y' && cCharAt2 != 'Z') {
                            throw FormatException.getFormatInstance();
                        }
                        c10 = 127;
                    }
                    sb2.append(c10);
                } else if (cCharAt2 >= 'A' && cCharAt2 <= 'Z') {
                    i10 = cCharAt2 - '@';
                } else {
                    throw FormatException.getFormatInstance();
                }
                c10 = (char) i10;
                sb2.append(c10);
            }
            i11++;
        }
        return sb2.toString();
    }

    public static int[] h(c6.a aVar, int[] iArr) throws NotFoundException {
        int iL = aVar.l();
        int iJ = aVar.j(0);
        int length = iArr.length;
        boolean z10 = false;
        int i10 = 0;
        int i11 = iJ;
        while (iJ < iL) {
            if (aVar.g(iJ) != z10) {
                iArr[i10] = iArr[i10] + 1;
            } else {
                if (i10 == length - 1) {
                    if (j(iArr) == 148 && aVar.n(Math.max(0, i11 - ((iJ - i11) / 2)), i11, false)) {
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
