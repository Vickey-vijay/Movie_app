package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import l6.c;
import l6.r;

/* JADX INFO: loaded from: classes11.dex */
public final class Code128Writer extends r {

    public enum CType {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    @Override // l6.r
    public Collection<BarcodeFormat> f() {
        return Collections.singleton(BarcodeFormat.CODE_128);
    }

    public static int h(CharSequence charSequence, int i10, int i11) {
        CType cTypeI;
        CType cTypeI2;
        char cCharAt;
        CType cTypeI3 = i(charSequence, i10);
        CType cType = CType.ONE_DIGIT;
        if (cTypeI3 == cType) {
            if (i11 == 101) {
                return 101;
            }
            return 100;
        }
        CType cType2 = CType.UNCODABLE;
        if (cTypeI3 == cType2) {
            if (i10 < charSequence.length() && ((cCharAt = charSequence.charAt(i10)) < ' ' || (i11 == 101 && (cCharAt < '`' || (cCharAt >= 241 && cCharAt <= 244))))) {
                return 101;
            }
            return 100;
        }
        if (i11 == 101 && cTypeI3 == CType.FNC_1) {
            return 101;
        }
        if (i11 == 99) {
            return 99;
        }
        if (i11 == 100) {
            CType cType3 = CType.FNC_1;
            if (cTypeI3 == cType3 || (cTypeI = i(charSequence, i10 + 2)) == cType2 || cTypeI == cType) {
                return 100;
            }
            if (cTypeI == cType3) {
                if (i(charSequence, i10 + 3) != CType.TWO_DIGITS) {
                    return 100;
                }
                return 99;
            }
            int i12 = i10 + 4;
            while (true) {
                cTypeI2 = i(charSequence, i12);
                if (cTypeI2 != CType.TWO_DIGITS) {
                    break;
                }
                i12 += 2;
            }
            if (cTypeI2 == CType.ONE_DIGIT) {
                return 100;
            }
            return 99;
        }
        if (cTypeI3 == CType.FNC_1) {
            cTypeI3 = i(charSequence, i10 + 1);
        }
        if (cTypeI3 != CType.TWO_DIGITS) {
            return 100;
        }
        return 99;
    }

    public static CType i(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        if (i10 >= length) {
            return CType.UNCODABLE;
        }
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt == 241) {
            return CType.FNC_1;
        }
        if (cCharAt >= '0' && cCharAt <= '9') {
            int i11 = i10 + 1;
            if (i11 >= length) {
                return CType.ONE_DIGIT;
            }
            char cCharAt2 = charSequence.charAt(i11);
            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                return CType.TWO_DIGITS;
            }
            return CType.ONE_DIGIT;
        }
        return CType.UNCODABLE;
    }

    @Override // l6.r
    public boolean[] d(String str) {
        int length = str.length();
        if (length > 0 && length <= 80) {
            int iB = 0;
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                switch (cCharAt) {
                    case 241:
                    case 242:
                    case 243:
                    case 244:
                        break;
                    default:
                        if (cCharAt > 127) {
                            throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(cCharAt)));
                        }
                        break;
                        break;
                }
            }
            ArrayList<int[]> arrayList = new ArrayList();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 1;
            while (true) {
                int i15 = 103;
                if (i11 < length) {
                    int iH = h(str, i11, i13);
                    int iCharAt = 100;
                    if (iH == i13) {
                        switch (str.charAt(i11)) {
                            case 241:
                                iCharAt = 102;
                                break;
                            case 242:
                                iCharAt = 97;
                                break;
                            case 243:
                                iCharAt = 96;
                                break;
                            case 244:
                                if (i13 == 101) {
                                    iCharAt = 101;
                                }
                                break;
                            default:
                                if (i13 != 100) {
                                    if (i13 != 101) {
                                        iCharAt = Integer.parseInt(str.substring(i11, i11 + 2));
                                        i11++;
                                    } else {
                                        iCharAt = str.charAt(i11) - ' ';
                                        if (iCharAt < 0) {
                                            iCharAt += 96;
                                        }
                                    }
                                } else {
                                    iCharAt = str.charAt(i11) - ' ';
                                }
                                break;
                        }
                        i11++;
                    } else {
                        if (i13 == 0) {
                            if (iH != 100) {
                                if (iH != 101) {
                                    i15 = 105;
                                }
                            } else {
                                i15 = 104;
                            }
                        } else {
                            i15 = iH;
                        }
                        iCharAt = i15;
                        i13 = iH;
                    }
                    arrayList.add(c.f63437a[iCharAt]);
                    i12 += iCharAt * i14;
                    if (i11 != 0) {
                        i14++;
                    }
                } else {
                    int[][] iArr = c.f63437a;
                    arrayList.add(iArr[i12 % 103]);
                    arrayList.add(iArr[106]);
                    int i16 = 0;
                    for (int[] iArr2 : arrayList) {
                        for (int i17 : iArr2) {
                            i16 += i17;
                        }
                    }
                    boolean[] zArr = new boolean[i16];
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        iB += r.b(zArr, iB, (int[]) it.next(), true);
                    }
                    return zArr;
                }
            }
        } else {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
    }
}
