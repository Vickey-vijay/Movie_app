package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public final class fj extends ed {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2043 = null;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2044 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2045 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2046;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static fj f2047;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2183() {
        f2044 = (char) 2;
        f2043 = new char[]{'n', 'u', 'l', 'o'};
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static synchronized fj m2184() {
        fj fjVar;
        int i10 = f2046 + 81;
        int i11 = i10 % 128;
        f2045 = i11;
        int i12 = i10 % 2;
        fjVar = f2047;
        int i13 = i11 + 99;
        f2046 = i13 % 128;
        if ((i13 % 2 != 0 ? (char) 0 : '%') == 0) {
            throw null;
        }
        return fjVar;
    }

    public fj() {
        super(dm.m2010("", -1));
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2185(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2129) {
            char[] cArr2 = f2043;
            char c10 = f2044;
            char[] cArr3 = new char[i10];
            if (i10 % 2 != 0) {
                i10--;
                cArr3[i10] = (char) (cArr[i10] - b10);
            }
            if (i10 > 1) {
                g.f2134 = 0;
                while (true) {
                    int i11 = g.f2134;
                    if (i11 >= i10) {
                        break;
                    }
                    g.f2133 = cArr[i11];
                    g.f2131 = cArr[g.f2134 + 1];
                    if (g.f2133 == g.f2131) {
                        cArr3[g.f2134] = (char) (g.f2133 - b10);
                        cArr3[g.f2134 + 1] = (char) (g.f2131 - b10);
                    } else {
                        g.f2132 = g.f2133 / c10;
                        g.f2130 = g.f2133 % c10;
                        g.f2135 = g.f2131 / c10;
                        g.f2128 = g.f2131 % c10;
                        if (g.f2130 == g.f2128) {
                            g.f2132 = ((g.f2132 + c10) - 1) % c10;
                            g.f2135 = ((g.f2135 + c10) - 1) % c10;
                            int i12 = (g.f2132 * c10) + g.f2130;
                            int i13 = (g.f2135 * c10) + g.f2128;
                            int i14 = g.f2134;
                            cArr3[i14] = cArr2[i12];
                            cArr3[i14 + 1] = cArr2[i13];
                        } else if (g.f2132 == g.f2135) {
                            g.f2130 = ((g.f2130 + c10) - 1) % c10;
                            g.f2128 = ((g.f2128 + c10) - 1) % c10;
                            int i15 = (g.f2132 * c10) + g.f2130;
                            int i16 = (g.f2135 * c10) + g.f2128;
                            int i17 = g.f2134;
                            cArr3[i17] = cArr2[i15];
                            cArr3[i17 + 1] = cArr2[i16];
                        } else {
                            int i18 = (g.f2132 * c10) + g.f2128;
                            int i19 = (g.f2135 * c10) + g.f2130;
                            int i20 = g.f2134;
                            cArr3[i20] = cArr2[i18];
                            cArr3[i20 + 1] = cArr2[i19];
                        }
                    }
                    g.f2134 += 2;
                }
            }
            str2 = new String(cArr3);
        }
        return str2;
    }

    public final String toString() {
        int mode;
        int iMyPid;
        int i10 = f2045 + 103;
        f2046 = i10 % 128;
        if ((i10 % 2 != 0 ? '=' : 'b') != '=') {
            mode = View.MeasureSpec.getMode(0) + 4;
            iMyPid = 91 - (Process.myPid() >> 22);
        } else {
            mode = 2 >>> View.MeasureSpec.getMode(0);
            iMyPid = 53 / (Process.myPid() * 121);
        }
        String strIntern = m2185("\u0001\u0000ÇÇ", mode, (byte) iMyPid).intern();
        int i11 = f2045 + 13;
        f2046 = i11 % 128;
        int i12 = i11 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo2113(du duVar, cq cqVar) {
        dr drVar = new dr(null);
        int i10 = f2046 + 71;
        f2045 = i10 % 128;
        if (i10 % 2 != 0) {
            return drVar;
        }
        throw null;
    }

    static {
        char c10;
        m2183();
        f2047 = new fj();
        int i10 = f2046 + 111;
        f2045 = i10 % 128;
        if (i10 % 2 == 0) {
            c10 = 22;
        } else {
            c10 = '\\';
        }
        if (c10 == '\\') {
        } else {
            throw null;
        }
    }
}
