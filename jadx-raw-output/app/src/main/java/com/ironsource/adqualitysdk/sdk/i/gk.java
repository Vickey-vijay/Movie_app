package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.widget.ExpandableListView;
import com.hyprmx.android.sdk.placement.PlacementType;

/* JADX INFO: loaded from: classes9.dex */
public final class gk extends gl {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2188 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2189 = 1400;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2190 = 22706;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2191 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2192 = 30494;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2193 = 16338;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo2200() {
        int i10 = f2188;
        int i11 = i10 + 61;
        f2191 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 25;
        f2191 = i13 % 128;
        if (i13 % 2 == 0) {
            return PlacementType.class;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2220(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (n.f2992) {
            char[] cArr2 = new char[cArr.length];
            n.f2991 = 0;
            char[] cArr3 = new char[2];
            while (true) {
                int i11 = n.f2991;
                if (i11 < cArr.length) {
                    cArr3[0] = cArr[i11];
                    cArr3[1] = cArr[i11 + 1];
                    int i12 = 58224;
                    for (int i13 = 0; i13 < 16; i13++) {
                        char c10 = cArr3[1];
                        char c11 = cArr3[0];
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2189)) ^ ((c11 >>> 5) + f2192)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2193) ^ ((c12 + i12) ^ ((c12 << 4) + f2190))));
                        i12 -= 40503;
                    }
                    int i14 = n.f2991;
                    cArr2[i14] = cArr3[0];
                    cArr2[i14 + 1] = cArr3[1];
                    n.f2991 = i14 + 2;
                } else {
                    str2 = new String(cArr2, 0, i10);
                }
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo2198() {
        bp bpVar = new bp(mo2201());
        int i10 = f2191 + 119;
        f2188 = i10 % 128;
        int i11 = i10 % 2;
        return bpVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo2199() {
        int i10 = f2188 + 107;
        f2191 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m2220("똹인藪⿴ꝃ鴬琊ሑ▼臶ꮌ뫦⋓ᢣ䣆鑚䥃一ഩ飠ㄧ寉繄\ue24d䬛\ue94dา\uee19燮\uf0db젓ឯⲸ泇䬛\ue94dา\uee19燮\uf0db젓ឯ矸\ud8f1孂瓠", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 47).intern();
        int i12 = f2188 + 49;
        f2191 = i12 % 128;
        if ((i12 % 2 != 0 ? '8' : '\t') == '\t') {
            return strIntern;
        }
        int i13 = 40 / 0;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo2201() {
        int i10 = f2191 + 125;
        f2188 = i10 % 128;
        String strIntern = m2220("ꝃ鴬琊ሑ▼臶", (i10 % 2 == 0 ? 'A' : 'K') != 'A' ? (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 5 : 4 >> (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern();
        int i11 = f2188 + 119;
        f2191 = i11 % 128;
        if (i11 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }
}
