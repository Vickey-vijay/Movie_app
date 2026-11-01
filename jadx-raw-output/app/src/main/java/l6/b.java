package l6;

import com.google.zxing.BarcodeFormat;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: compiled from: CodaBarWriter.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f63433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f63434c = {'T', 'N', '*', 'E'};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f63435d = {'/', ':', '+', '.'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char f63436e;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f63433b = cArr;
        f63436e = cArr[0];
    }

    @Override // l6.r
    public Collection<BarcodeFormat> f() {
        return Collections.singleton(BarcodeFormat.CODABAR);
    }

    @Override // l6.r
    public boolean[] d(String str) {
        int i10;
        if (str.length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            char c10 = f63436e;
            sb2.append(c10);
            sb2.append(str);
            sb2.append(c10);
            str = sb2.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f63433b;
            boolean zG = a.g(cArr, upperCase);
            boolean zG2 = a.g(cArr, upperCase2);
            char[] cArr2 = f63434c;
            boolean zG3 = a.g(cArr2, upperCase);
            boolean zG4 = a.g(cArr2, upperCase2);
            if (zG) {
                if (!zG2) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (zG3) {
                if (!zG4) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!zG2 && !zG4) {
                StringBuilder sb3 = new StringBuilder();
                char c11 = f63436e;
                sb3.append(c11);
                sb3.append(str);
                sb3.append(c11);
                str = sb3.toString();
            } else {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
        }
        int i11 = 20;
        for (int i12 = 1; i12 < str.length() - 1; i12++) {
            if (!Character.isDigit(str.charAt(i12)) && str.charAt(i12) != '-' && str.charAt(i12) != '$') {
                if (a.g(f63435d, str.charAt(i12))) {
                    i11 += 10;
                } else {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i12) + '\'');
                }
            } else {
                i11 += 9;
            }
        }
        boolean[] zArr = new boolean[i11 + (str.length() - 1)];
        int i13 = 0;
        for (int i14 = 0; i14 < str.length(); i14++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i14));
            if (i14 == 0 || i14 == str.length() - 1) {
                if (upperCase3 != '*') {
                    if (upperCase3 != 'E') {
                        if (upperCase3 != 'N') {
                            if (upperCase3 == 'T') {
                                upperCase3 = 'A';
                            }
                        } else {
                            upperCase3 = 'B';
                        }
                    } else {
                        upperCase3 = 'D';
                    }
                } else {
                    upperCase3 = 'C';
                }
            }
            int i15 = 0;
            while (true) {
                char[] cArr3 = a.f63427d;
                if (i15 < cArr3.length) {
                    if (upperCase3 == cArr3[i15]) {
                        i10 = a.f63428e[i15];
                        break;
                    }
                    i15++;
                } else {
                    i10 = 0;
                    break;
                }
            }
            int i16 = 0;
            int i17 = 0;
            boolean z10 = true;
            while (i16 < 7) {
                zArr[i13] = z10;
                i13++;
                if (((i10 >> (6 - i16)) & 1) != 0 && i17 != 1) {
                    i17++;
                } else {
                    z10 = !z10;
                    i16++;
                    i17 = 0;
                }
            }
            if (i14 < str.length() - 1) {
                zArr[i13] = false;
                i13++;
            }
        }
        return zArr;
    }
}
