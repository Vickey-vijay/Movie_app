package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;

/* JADX INFO: loaded from: classes7.dex */
public final class ft extends gl {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2092 = {'c', 'o', 'm', '.', 'i', 'r', 'n', 's', 'u', 'e', 'a', 'd', 'q', 'l', 't', 'y', 'k', 'I', 'S', 'A', 'Q', 'h', 'v', 'f', 'g'};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2093 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2094 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2095 = 5;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Class mo2200() {
        int i10 = f2094 + 103;
        int i11 = i10 % 128;
        f2093 = i11;
        if ((i10 % 2 != 0 ? '2' : 'K') != 'K') {
            throw null;
        }
        int i12 = i11 + 113;
        f2094 = i12 % 128;
        int i13 = i12 % 2;
        return IronSourceAdQuality.class;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2197(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2129) {
            char[] cArr2 = f2092;
            char c10 = f2095;
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
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final bd mo2198() {
        bf bfVar = new bf(mo2201());
        int i10 = f2094 + 105;
        f2093 = i10 % 128;
        if ((i10 % 2 != 0 ? 'H' : '\'') != 'H') {
            return bfVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String mo2199() {
        int i10 = f2093 + 57;
        f2094 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m2197("\u0001\u0002\u0003\u0004\u0000\t\u0006\u000b\u0006\u0002\t\u0006\u0004\u0005\u0000\r\f\r\u0005\r\u000e\u0003\n\u0013\u0006\f\u0012\u0001\u0006\f\u0012\u0001\u000f\u0007\u0006\u000b\u0010\u0003\t\u0006\u0004\u0005\u0010\u000e\u0017\u0005\u000b\u000e\t\u0013Ë", Color.red(0) + 51, (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 82)).intern();
        int i12 = f2094 + 97;
        f2093 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 7 : '`') != 7) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String mo2201() {
        int mode;
        int maximumDrawingCacheSize;
        int i10 = f2094 + 79;
        f2093 = i10 % 128;
        if ((i10 % 2 != 0 ? '7' : 'H') != 'H') {
            mode = 32 >>> View.MeasureSpec.getMode(0);
            maximumDrawingCacheSize = 74 - (ViewConfiguration.getMaximumDrawingCacheSize() >>> 59);
        } else {
            mode = 15 - View.MeasureSpec.getMode(0);
            maximumDrawingCacheSize = 35 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
        }
        String strIntern = m2197("\u000b\f\u0011\f\u0014\u000b\u0006\u0005\f\u000b\f\u0015\u0004\n\u0099", mode, (byte) maximumDrawingCacheSize).intern();
        int i11 = f2093 + 89;
        f2094 = i11 % 128;
        if ((i11 % 2 == 0 ? (char) 25 : ',') != 25) {
            return strIntern;
        }
        throw null;
    }
}
