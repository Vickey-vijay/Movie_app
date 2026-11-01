package l6;

import com.google.zxing.BarcodeFormat;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: compiled from: Code93Writer.java */
/* JADX INFO: loaded from: classes10.dex */
public class g extends r {
    public static int h(boolean[] zArr, int i10, int i11) {
        for (int i12 = 0; i12 < 9; i12++) {
            boolean z10 = true;
            int i13 = i10 + i12;
            if (((1 << (8 - i12)) & i11) == 0) {
                z10 = false;
            }
            zArr[i13] = z10;
        }
        return 9;
    }

    @Override // l6.r
    public Collection<BarcodeFormat> f() {
        return Collections.singleton(BarcodeFormat.CODE_93);
    }

    public static int i(String str, int i10) {
        int iIndexOf = 0;
        int i11 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i11;
            i11++;
            if (i11 > i10) {
                i11 = 1;
            }
        }
        return iIndexOf % 47;
    }

    public static String j(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length << 1);
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == 0) {
                sb2.append("bU");
            } else if (cCharAt <= 26) {
                sb2.append('a');
                sb2.append((char) ((cCharAt + 'A') - 1));
            } else if (cCharAt <= 31) {
                sb2.append('b');
                sb2.append((char) ((cCharAt + 'A') - 27));
            } else if (cCharAt != ' ' && cCharAt != '$' && cCharAt != '%' && cCharAt != '+') {
                if (cCharAt <= ',') {
                    sb2.append('c');
                    sb2.append((char) ((cCharAt + 'A') - 33));
                } else if (cCharAt <= '9') {
                    sb2.append(cCharAt);
                } else if (cCharAt == ':') {
                    sb2.append("cZ");
                } else if (cCharAt <= '?') {
                    sb2.append('b');
                    sb2.append((char) ((cCharAt + 'F') - 59));
                } else if (cCharAt == '@') {
                    sb2.append("bV");
                } else if (cCharAt <= 'Z') {
                    sb2.append(cCharAt);
                } else if (cCharAt <= '_') {
                    sb2.append('b');
                    sb2.append((char) ((cCharAt + 'K') - 91));
                } else if (cCharAt == '`') {
                    sb2.append("bW");
                } else if (cCharAt <= 'z') {
                    sb2.append('d');
                    sb2.append((char) ((cCharAt + 'A') - 97));
                } else if (cCharAt <= 127) {
                    sb2.append('b');
                    sb2.append((char) ((cCharAt + 'P') - 123));
                } else {
                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + cCharAt + "'");
                }
            } else {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    @Override // l6.r
    public boolean[] d(String str) {
        String strJ = j(str);
        int length = strJ.length();
        if (length <= 80) {
            boolean[] zArr = new boolean[((strJ.length() + 2 + 2) * 9) + 1];
            int iH = h(zArr, 0, f.f63445e);
            for (int i10 = 0; i10 < length; i10++) {
                iH += h(zArr, iH, f.f63444d["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(strJ.charAt(i10))]);
            }
            int i11 = i(strJ, 20);
            int[] iArr = f.f63444d;
            int iH2 = iH + h(zArr, iH, iArr[i11]);
            int iH3 = iH2 + h(zArr, iH2, iArr[i(strJ + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(i11), 15)]);
            zArr[iH3 + h(zArr, iH3, f.f63445e)] = true;
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long after converting to extended encoding, but got ".concat(String.valueOf(length)));
    }
}
