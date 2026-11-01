package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes4.dex */
public final class jp {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2857 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2858 = {'$', '^', '^', '`', 'n', 'g', '_', '\\', 'c', '^', 'd', 'p', 'q', 'k', 'd', 'g', 'l', 17, '/', 'Z', 'p', 'i', 'a', '^', 'e', 'p', 'M', 'I', 's', 'L', 'K', 'p', 'G', 'E', 'l', 'm', 'p', 'm', 'f', 'i', 'n', 'm', 'F', 'K', 'r', 'r', 't', ']', 'Y', 178, 166, 158, 156, 156, 171, 173, 158, 160, 175, 174, 160, 153, 156, 161, 160, 167, 176, 'S', 166, 154, 148, 153, 152, 153, 153, 161, 159, 153, 163, 168, ';', 'w', 'l', 'j', 'r', 'o', 'e', 'l', 'p', 'j', 't', 'y', 'w', 239, 227, 221, 226, 226, 221, 216, 223, 229, 228, 236, 232, 226, 236, 241, 'v', 259, 282, 280, 280, 241, 236, 275, 239, 235, 270, 276, 263, 262, 267, 265, 260, 259, 276, 271, 268, 275, 255, 213};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static dp f2859;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2860;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final String f2861;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final boolean f2862;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m2706(jp jpVar) {
        int i10 = f2860 + 45;
        f2857 = i10 % 128;
        int i11 = i10 % 2;
        String strM2705 = jpVar.m2705();
        int i12 = f2857 + 33;
        f2860 = i12 % 128;
        int i13 = i12 % 2;
        return strM2705;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2707(dp dpVar) {
        int i10 = f2857;
        int i11 = i10 + 11;
        f2860 = i11 % 128;
        int i12 = i11 % 2;
        f2859 = dpVar;
        int i13 = i10 + 77;
        f2860 = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2708(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (i.f2448) {
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            int i13 = iArr[3];
            char[] cArr = new char[i11];
            System.arraycopy(f2858, i10, cArr, 0, i11);
            if (bArr != null) {
                char[] cArr2 = new char[i11];
                i.f2447 = 0;
                char c10 = 0;
                while (true) {
                    int i14 = i.f2447;
                    if (i14 >= i11) {
                        break;
                    }
                    if (bArr[i14] == 1) {
                        cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                    } else {
                        cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                    }
                    c10 = cArr2[i14];
                    i.f2447 = i14 + 1;
                }
                cArr = cArr2;
            }
            if (i13 > 0) {
                char[] cArr3 = new char[i11];
                System.arraycopy(cArr, 0, cArr3, 0, i11);
                int i15 = i11 - i13;
                System.arraycopy(cArr3, 0, cArr, i15, i13);
                System.arraycopy(cArr3, i13, cArr, 0, i15);
            }
            if (z10) {
                char[] cArr4 = new char[i11];
                i.f2447 = 0;
                while (true) {
                    int i16 = i.f2447;
                    if (i16 >= i11) {
                        break;
                    }
                    cArr4[i16] = cArr[(i11 - i16) - 1];
                    i.f2447 = i16 + 1;
                }
                cArr = cArr4;
            }
            if (i12 > 0) {
                i.f2447 = 0;
                while (true) {
                    int i17 = i.f2447;
                    if (i17 >= i11) {
                        break;
                    }
                    cArr[i17] = (char) (cArr[i17] - iArr[2]);
                    i.f2447 = i17 + 1;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String m2709() {
        String strReplace;
        String strIntern;
        String strM2031;
        String strM2034 = f2859.m2034();
        try {
            String strReplace2 = strM2034.replace(m2708(new int[]{48, 19, 85, 0}, "\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000", true).intern(), m2710()).replace(m2708(new int[]{67, 13, 75, 0}, "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000", false).intern(), f2859.m2032());
            if (this.f2862) {
                int i10 = f2860 + 97;
                f2857 = i10 % 128;
                if ((i10 % 2 == 0 ? 'L' : '\\') != '\\') {
                    strIntern = m2708(new int[]{80, 12, 28, 0}, "\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000", true).intern();
                    strM2031 = f2859.m2031();
                } else {
                    strIntern = m2708(new int[]{80, 12, 28, 0}, "\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000", false).intern();
                    strM2031 = f2859.m2031();
                }
                strReplace = strReplace2.replace(strIntern, strM2031);
            } else {
                strReplace = strReplace2.replace(m2708(new int[]{80, 12, 28, 0}, "\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000", false).intern(), "");
            }
            strM2034 = strReplace.replace(m2708(new int[]{92, 16, 148, 0}, "\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000", false).intern(), this.f2861);
            int i11 = f2857 + 57;
            f2860 = i11 % 128;
            int i12 = i11 % 2;
        } catch (Throwable th2) {
            String strIntern2 = m2708(new int[]{0, 17, 0, 10}, "\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000", true).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2708(new int[]{108, 24, 168, 0}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000", false).intern());
            sb2.append(th2.getLocalizedMessage());
            k.m2810(strIntern2, sb2.toString());
        }
        int i13 = f2857 + 61;
        f2860 = i13 % 128;
        int i14 = i13 % 2;
        return strM2034;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2710() {
        int i10 = f2857 + 45;
        f2860 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 7 : 'G') != 7) {
            return ar.m483().mo497().m481();
        }
        int i11 = 59 / 0;
        return ar.m483().mo497().m481();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2711(final WebView webView) {
        try {
            t.m2991(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jp.5
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                    final String strM2706 = jp.m2706(jp.this);
                    t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jp.5.3
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            ki.m2902(webView, strM2706);
                        }
                    });
                }
            });
            int i10 = f2860 + 95;
            f2857 = i10 % 128;
            if ((i10 % 2 == 0 ? (char) 3 : (char) 4) != 3) {
            } else {
                throw null;
            }
        } catch (Exception e10) {
            String strIntern = m2708(new int[]{0, 17, 0, 10}, "\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000", true).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2708(new int[]{17, 31, 2, 0}, "\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001", true).intern());
            sb2.append(e10.getLocalizedMessage());
            k.m2810(strIntern, sb2.toString());
        }
    }

    public jp(String str, boolean z10) {
        this.f2861 = str;
        this.f2862 = z10;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String m2705() {
        String strM2468;
        int i10 = f2857 + 33;
        f2860 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            strM2468 = ie.m2468(m2709().getBytes());
            int i11 = 39 / 0;
        } else {
            strM2468 = ie.m2468(m2709().getBytes());
        }
        int i12 = f2860 + 49;
        f2857 = i12 % 128;
        if ((i12 % 2 == 0 ? '9' : '\n') == '\n') {
            return strM2468;
        }
        throw null;
    }
}
