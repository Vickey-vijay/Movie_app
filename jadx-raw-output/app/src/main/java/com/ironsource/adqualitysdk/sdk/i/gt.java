package com.ironsource.adqualitysdk.sdk.i;

import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import net.pubnative.lite.sdk.HyBid;

/* JADX INFO: loaded from: classes9.dex */
public final class gt extends gl {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2233 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2234 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2235 = {'n', 'e', 't', '.', 'p', 'u', 'b', 'a', 'i', 'v', 'l', 's', 'd', 'k', 'H', 'y', 'B', 'o', 'q', 'r', 'w', 'x', 'z', '{', '|'};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2236 = 5;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo2200() {
        int i10 = f2233 + 23;
        f2234 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return HyBid.class;
        }
        int i11 = 0 / 0;
        return HyBid.class;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2232(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2129) {
            char[] cArr2 = f2235;
            char c10 = f2236;
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

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo2198() {
        bx bxVar = new bx(mo2201());
        int i10 = f2233 + 15;
        f2234 = i10 % 128;
        int i11 = i10 % 2;
        return bxVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo2199() {
        int i10 = f2233 + 69;
        f2234 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m2232("\u0001\u0002\u0003\u0004\u0000\t\u0005\u0001\f\u0007\t\u0005\u0002\u0004\r\u0005\u0003\u0002\u0001\r\r\u000e\u0004\r\u0010\u0011\u0007\r", 27 - ((byte) KeyEvent.getModifierMetaStateMask()), (byte) (Gravity.getAbsoluteGravity(0, 0) + 50)).intern();
        int i12 = f2233 + 27;
        f2234 = i12 % 128;
        if ((i12 % 2 == 0 ? '-' : (char) 4) == 4) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo2201() {
        int defaultSize;
        int absoluteGravity;
        int i10 = f2233 + 99;
        f2234 = i10 % 128;
        if ((i10 % 2 == 0 ? '\t' : '7') != '\t') {
            defaultSize = View.getDefaultSize(0, 0) + 9;
            absoluteGravity = 64 - Gravity.getAbsoluteGravity(0, 0);
        } else {
            defaultSize = 15 - View.getDefaultSize(1, 1);
            absoluteGravity = Gravity.getAbsoluteGravity(0, 0) * 30;
        }
        return m2232("\u0000\t\u0005\u0001\f\u0007\t\u0005¥", defaultSize, (byte) absoluteGravity).intern();
    }
}
