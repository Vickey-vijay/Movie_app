package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;

/* JADX INFO: loaded from: classes7.dex */
public final class ga extends gl {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2136 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2137 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2138 = {'c', 'o', 'm', '.', 'i', 'r', 'n', 's', 'u', 'e', 'a', 'd', 'q', 'l', 't', 'y', 'k', 'I', 'S', 'A', 'Q', 'h', 'f', 'g', 'j'};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2139 = 5;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2208(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2129) {
            char[] cArr2 = f2138;
            char c10 = f2139;
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
        be beVar = new be(mo2201());
        int i10 = f2137 + 87;
        f2136 = i10 % 128;
        if ((i10 % 2 != 0 ? 'J' : '[') == '[') {
            return beVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo2199() {
        int iLastIndexOf;
        int offsetAfter;
        int i10 = f2136 + 71;
        f2137 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            iLastIndexOf = 26 % TextUtils.lastIndexOf("", 'N', 1);
            offsetAfter = 21 << TextUtils.getOffsetAfter("", 0);
        } else {
            iLastIndexOf = 50 - TextUtils.lastIndexOf("", '0', 0);
            offsetAfter = TextUtils.getOffsetAfter("", 0) + 114;
        }
        String strIntern = m2208("\u0001\u0002\u0003\u0004\u0000\t\u0006\u000b\u0006\u0002\t\u0006\u0004\u0005\u0000\r\f\r\u0005\r\u000e\u0003\n\u0013\u0006\f\u0012\u0001\u0006\f\u0012\u0001\u000f\u0007\u0006\u000b\u0010\u0003\t\u0006\u0004\u0005\u0010\u000e\u0017\u0005\u000b\u000e\t\u0013ë", iLastIndexOf, (byte) offsetAfter).intern();
        int i11 = f2136 + 87;
        f2137 = i11 % 128;
        if (!(i11 % 2 == 0)) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo2200() {
        int i10 = f2137 + 9;
        f2136 = i10 % 128;
        if ((i10 % 2 != 0 ? '\r' : '_') == '_') {
            return IronSourceAdQuality.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo2201() {
        int i10;
        int iIndexOf;
        int i11 = f2137 + 25;
        f2136 = i11 % 128;
        if (i11 % 2 == 0) {
            i10 = 16 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
            iIndexOf = 121 - TextUtils.indexOf((CharSequence) "", '0', 0);
        } else {
            i10 = (ViewConfiguration.getScrollFriction() > 2.0f ? 1 : (ViewConfiguration.getScrollFriction() == 2.0f ? 0 : -1)) * 88;
            iIndexOf = TextUtils.indexOf((CharSequence) "", '5', 1) * 64;
        }
        String strIntern = m2208("\u000b\f\r\u0007\u000b\u000e\t\u0013\u0011\u0005\u0014\u000b\u0006\u0005Þ", i10, (byte) iIndexOf).intern();
        int i12 = f2136 + 51;
        f2137 = i12 % 128;
        int i13 = i12 % 2;
        return strIntern;
    }
}
