package i6;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.util.Arrays;

/* JADX INFO: compiled from: HighLevelEncoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class j {
    public static String b(String str, SymbolShapeHint symbolShapeHint, y5.c cVar, y5.c cVar2) {
        int iE = 0;
        g[] gVarArr = {new a(), new c(), new l(), new m(), new f(), new b()};
        h hVar = new h(str);
        hVar.n(symbolShapeHint);
        hVar.l(cVar, cVar2);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            hVar.r((char) 236);
            hVar.m(2);
            hVar.f54073f += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            hVar.r((char) 237);
            hVar.m(2);
            hVar.f54073f += 7;
        }
        while (hVar.i()) {
            gVarArr[iE].a(hVar);
            if (hVar.e() >= 0) {
                iE = hVar.e();
                hVar.j();
            }
        }
        int iA = hVar.a();
        hVar.p();
        int iA2 = hVar.g().a();
        if (iA < iA2 && iE != 0 && iE != 5 && iE != 4) {
            hVar.r((char) 254);
        }
        StringBuilder sbB = hVar.b();
        if (sbB.length() < iA2) {
            sbB.append((char) 129);
        }
        while (sbB.length() < iA2) {
            sbB.append(o(sbB.length() + 1));
        }
        return hVar.b().toString();
    }

    public static int c(float[] fArr, int[] iArr, int i10, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i11 = 0; i11 < 6; i11++) {
            int iCeil = (int) Math.ceil(fArr[i11]);
            iArr[i11] = iCeil;
            if (i10 > iCeil) {
                Arrays.fill(bArr, (byte) 0);
                i10 = iCeil;
            }
            if (i10 == iCeil) {
                bArr[i11] = (byte) (bArr[i11] + 1);
            }
        }
        return i10;
    }

    public static int d(byte[] bArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            i10 += bArr[i11];
        }
        return i10;
    }

    public static boolean f(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    public static boolean g(char c10) {
        return c10 >= 128 && c10 <= 255;
    }

    public static boolean h(char c10) {
        if (c10 == ' ') {
            return true;
        }
        if (c10 < '0' || c10 > '9') {
            return c10 >= 'A' && c10 <= 'Z';
        }
        return true;
    }

    public static boolean i(char c10) {
        return c10 >= ' ' && c10 <= '^';
    }

    public static boolean j(char c10) {
        if (c10 == ' ') {
            return true;
        }
        if (c10 < '0' || c10 > '9') {
            return c10 >= 'a' && c10 <= 'z';
        }
        return true;
    }

    public static boolean l(char c10) {
        return false;
    }

    public static boolean m(char c10) {
        return c10 == '\r' || c10 == '*' || c10 == '>';
    }

    public static int n(CharSequence charSequence, int i10, int i11) {
        float[] fArr;
        char c10;
        if (i10 >= charSequence.length()) {
            return i11;
        }
        int i12 = 6;
        if (i11 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i11] = 0.0f;
        }
        int i13 = 0;
        while (true) {
            int i14 = i10 + i13;
            if (i14 == charSequence.length()) {
                byte[] bArr = new byte[i12];
                int[] iArr = new int[i12];
                int iC = c(fArr, iArr, Integer.MAX_VALUE, bArr);
                int iD = d(bArr);
                if (iArr[0] == iC) {
                    return 0;
                }
                if (iD == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (iD == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (iD != 1 || bArr[2] <= 0) {
                    return (iD != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char cCharAt = charSequence.charAt(i14);
            i13++;
            if (f(cCharAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (g(cCharAt)) {
                float fCeil = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil;
                fArr[0] = fCeil + 2.0f;
            } else {
                float fCeil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil2;
                fArr[0] = fCeil2 + 1.0f;
            }
            if (h(cCharAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (g(cCharAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (j(cCharAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (g(cCharAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (k(cCharAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (g(cCharAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (i(cCharAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (g(cCharAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (l(cCharAt)) {
                c10 = 5;
                fArr[5] = fArr[5] + 4.0f;
            } else {
                c10 = 5;
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i13 >= 4) {
                int[] iArr2 = new int[i12];
                byte[] bArr2 = new byte[i12];
                c(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int iD2 = d(bArr2);
                int i15 = iArr2[0];
                int i16 = iArr2[c10];
                if (i15 < i16 && i15 < iArr2[1] && i15 < iArr2[2] && i15 < iArr2[3] && i15 < iArr2[4]) {
                    return 0;
                }
                if (i16 < i15) {
                    return 5;
                }
                byte b10 = bArr2[1];
                byte b11 = bArr2[2];
                byte b12 = bArr2[3];
                byte b13 = bArr2[4];
                if (b10 + b11 + b12 + b13 == 0) {
                    return 5;
                }
                if (iD2 == 1 && b13 > 0) {
                    return 4;
                }
                if (iD2 == 1 && b11 > 0) {
                    return 2;
                }
                if (iD2 == 1 && b12 > 0) {
                    return 3;
                }
                int i17 = iArr2[1];
                if (i17 + 1 < i15 && i17 + 1 < i16 && i17 + 1 < iArr2[4] && i17 + 1 < iArr2[2]) {
                    int i18 = iArr2[3];
                    if (i17 < i18) {
                        return 1;
                    }
                    if (i17 == i18) {
                        for (int i19 = i10 + i13 + 1; i19 < charSequence.length(); i19++) {
                            char cCharAt2 = charSequence.charAt(i19);
                            if (m(cCharAt2)) {
                                return 3;
                            }
                            if (!k(cCharAt2)) {
                                break;
                            }
                        }
                        return 1;
                    }
                }
            }
            i12 = 6;
        }
    }

    public static char o(int i10) {
        int i11 = ((i10 * 149) % 253) + 1 + 129;
        if (i11 > 254) {
            i11 -= 254;
        }
        return (char) i11;
    }

    public static int a(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        if (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            while (f(cCharAt) && i10 < length) {
                i11++;
                i10++;
                if (i10 < length) {
                    cCharAt = charSequence.charAt(i10);
                }
            }
        }
        return i11;
    }

    public static void e(char c10) {
        String hexString = Integer.toHexString(c10);
        throw new IllegalArgumentException("Illegal character: " + c10 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    public static boolean k(char c10) {
        if (!m(c10) && c10 != ' ') {
            if (c10 < '0' || c10 > '9') {
                if (c10 < 'A' || c10 > 'Z') {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }
}
