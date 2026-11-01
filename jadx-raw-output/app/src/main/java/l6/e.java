package l6;

import com.google.zxing.BarcodeFormat;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: compiled from: Code39Writer.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e extends r {
    public static void h(int i10, int[] iArr) {
        for (int i11 = 0; i11 < 9; i11++) {
            int i12 = 1;
            if (((1 << (8 - i11)) & i10) != 0) {
                i12 = 2;
            }
            iArr[i11] = i12;
        }
    }

    @Override // l6.r
    public Collection<BarcodeFormat> f() {
        return Collections.singleton(BarcodeFormat.CODE_39);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ec  */
    public static String i(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != 0) {
                if (cCharAt != ' ') {
                    if (cCharAt != '@') {
                        if (cCharAt != '`') {
                            if (cCharAt != '-' && cCharAt != '.') {
                                if (cCharAt <= 26) {
                                    sb2.append('$');
                                    sb2.append((char) ((cCharAt - 1) + 65));
                                } else if (cCharAt < ' ') {
                                    sb2.append('%');
                                    sb2.append((char) ((cCharAt - 27) + 65));
                                } else if (cCharAt > ',' && cCharAt != '/' && cCharAt != ':') {
                                    if (cCharAt <= '9') {
                                        sb2.append((char) ((cCharAt - '0') + 48));
                                    } else if (cCharAt <= '?') {
                                        sb2.append('%');
                                        sb2.append((char) ((cCharAt - ';') + 70));
                                    } else if (cCharAt <= 'Z') {
                                        sb2.append((char) ((cCharAt - 'A') + 65));
                                    } else if (cCharAt <= '_') {
                                        sb2.append('%');
                                        sb2.append((char) ((cCharAt - '[') + 75));
                                    } else if (cCharAt <= 'z') {
                                        sb2.append('+');
                                        sb2.append((char) ((cCharAt - 'a') + 65));
                                    } else if (cCharAt <= 127) {
                                        sb2.append('%');
                                        sb2.append((char) ((cCharAt - '{') + 80));
                                    } else {
                                        throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i10) + "'");
                                    }
                                } else {
                                    sb2.append('/');
                                    sb2.append((char) ((cCharAt - '!') + 65));
                                }
                            } else {
                                sb2.append(cCharAt);
                            }
                        } else {
                            sb2.append("%W");
                        }
                    } else {
                        sb2.append("%V");
                    }
                } else {
                    sb2.append(cCharAt);
                }
            } else {
                sb2.append("%U");
            }
        }
        return sb2.toString();
    }

    @Override // l6.r
    public boolean[] d(String str) {
        int length = str.length();
        if (length <= 80) {
            for (int i10 = 0; i10 < length; i10++) {
                if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i10)) < 0) {
                    str = i(str);
                    length = str.length();
                    if (length <= 80) {
                        break;
                    }
                    throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
                }
            }
            int[] iArr = new int[9];
            boolean[] zArr = new boolean[(length * 13) + 25];
            h(148, iArr);
            int iB = r.b(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int iB2 = iB + r.b(zArr, iB, iArr2, false);
            for (int i11 = 0; i11 < length; i11++) {
                h(d.f63438e["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i11))], iArr);
                int iB3 = iB2 + r.b(zArr, iB2, iArr, true);
                iB2 = iB3 + r.b(zArr, iB3, iArr2, false);
            }
            h(148, iArr);
            r.b(zArr, iB2, iArr, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }
}
