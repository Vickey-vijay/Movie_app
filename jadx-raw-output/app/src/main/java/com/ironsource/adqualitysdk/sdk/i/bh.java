package com.ironsource.adqualitysdk.sdk.i;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class bh extends bd {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f794 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f795 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f796 = {'E', 'N', 'A', 'B', 'L', 'D', 'F', 'G', 'H'};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f797 = 3;

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo738(String str) {
        int i10 = f794;
        int i11 = i10 + 1;
        f795 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 65;
        f795 = i13 % 128;
        if ((i13 % 2 == 0 ? (char) 22 : (char) 2) == 2) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m823(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2129) {
            char[] cArr2 = f796;
            char c10 = f797;
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

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻏ */
    public final boolean mo811() {
        int i10 = f794;
        int i11 = i10 + 7;
        f795 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 61;
        f795 = i13 % 128;
        if ((i13 % 2 == 0 ? '\'' : 'L') == 'L') {
            return true;
        }
        int i14 = 98 / 0;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo736() {
        HashMap map = new HashMap();
        int i10 = f794 + 11;
        f795 = i10 % 128;
        int i11 = i10 % 2;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo737() {
        int i10 = f794 + 105;
        f795 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m823("\u0001\u0002\u0000\u0005\u0003\u0001À", 7 - TextUtils.indexOf("", "", 0), (byte) (172 - AndroidCharacter.getMirror('0'))).intern();
        int i12 = f794 + 83;
        f795 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 11 : 'K') != 11) {
            return strIntern;
        }
        int i13 = 56 / 0;
        return strIntern;
    }

    public bh(String str) {
        super(str);
    }
}
