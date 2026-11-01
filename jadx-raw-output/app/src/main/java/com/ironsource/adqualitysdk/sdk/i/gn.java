package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.my.target.common.MyTargetManager;

/* JADX INFO: loaded from: classes9.dex */
public final class gn extends gl {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2205 = {'c', 'o', 'm', '.', 'y', 't', 'a', 'r', 'g', 'e', 'n', 'M', 'T', 'd', 'f', 'h'};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2206 = 4;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2207 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2208;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo2199() {
        int edgeSlop;
        int i10;
        int i11 = f2207 + 53;
        f2208 = i11 % 128;
        if ((i11 % 2 != 0 ? '5' : (char) 30) != '5') {
            edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 36;
            i10 = 9 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
        } else {
            edgeSlop = 109 / (ViewConfiguration.getEdgeSlop() * 86);
            i10 = 90 / (SystemClock.uptimeMillis() > 1L ? 1 : (SystemClock.uptimeMillis() == 1L ? 0 : -1));
        }
        return m2224("\u0001\u0002\u0003\u0000\u0000\u0006\u0001\u0007\u0007\u0004\t\n\u0007\u0001\u0001\u0002uu\u0002\t\u0007\u000f\b\u0000\u0007\u0004\t\n\u0007\t\n\u000e\u0004\n\u000b\u0005", edgeSlop, (byte) i10).intern();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2224(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2129) {
            char[] cArr2 = f2205;
            char c10 = f2206;
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
        bz bzVar = new bz(mo2201());
        int i10 = f2207 + 125;
        f2208 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 22 : (char) 27) != 22) {
            return bzVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo2200() {
        Class<MyTargetManager> cls;
        int i10 = f2208 + 77;
        int i11 = i10 % 128;
        f2207 = i11;
        if (!(i10 % 2 == 0)) {
            cls = MyTargetManager.class;
        } else {
            cls = MyTargetManager.class;
            int i12 = 68 / 0;
        }
        int i13 = i11 + 1;
        f2208 = i13 % 128;
        if (i13 % 2 == 0) {
            return cls;
        }
        int i14 = 15 / 0;
        return cls;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo2201() {
        int iNormalizeMetaState;
        int iIndexOf;
        int i10 = f2208 + 17;
        f2207 = i10 % 128;
        if ((i10 % 2 == 0 ? '!' : '?') != '?') {
            iNormalizeMetaState = 69 << KeyEvent.normalizeMetaState(0);
            iIndexOf = 120 >> TextUtils.indexOf((CharSequence) "", 'C', 1, 0);
        } else {
            iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 8;
            iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 25;
        }
        String strIntern = m2224("\u0000\u0006\u0006\u0007\u0004\u000b\r\t", iNormalizeMetaState, (byte) iIndexOf).intern();
        int i11 = f2207 + 107;
        f2208 = i11 % 128;
        int i12 = i11 % 2;
        return strIntern;
    }
}
