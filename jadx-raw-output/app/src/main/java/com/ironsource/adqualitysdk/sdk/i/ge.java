package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.chartboost.sdk.Chartboost;

/* JADX INFO: loaded from: classes7.dex */
public final class ge extends gl {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2154 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2155 = 55040;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2156 = 29878;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2157 = 41542;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2158 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2159 = 39924;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo2198() {
        bj bjVar = new bj(mo2201());
        int i10 = f2158 + 113;
        f2154 = i10 % 128;
        int i11 = i10 % 2;
        return bjVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2212(String str, int i10) {
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
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2155)) ^ ((c11 >>> 5) + f2157)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2156) ^ ((c12 + i12) ^ ((c12 << 4) + f2159))));
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
    /* JADX INFO: renamed from: ｋ */
    public final String mo2199() {
        int i10 = f2154 + 119;
        f2158 = i10 % 128;
        return m2212("మ팆突緙嵝륨৲\ue695굅\ue799߅뤮伉\ua87eꖭ떎븼媪\uaad8햰\uf1cb\ue045鲣杆ꕢ㧽\udd5f\uedd7뽥傣", i10 % 2 == 0 ? (ViewConfiguration.getJumpTapTimeout() >> 16) + 29 : 79 - (ViewConfiguration.getJumpTapTimeout() / 115)).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo2200() {
        int i10 = f2158 + 123;
        f2154 = i10 % 128;
        if ((i10 % 2 == 0 ? '8' : '7') == '7') {
            return Chartboost.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo2201() {
        int i10 = f2154 + 93;
        f2158 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m2212("嵝륨৲\ue695굅\ue799߅뤮伉\ua87e", TextUtils.getOffsetBefore("", 0) + 10).intern();
        int i12 = f2154 + 25;
        f2158 = i12 % 128;
        int i13 = i12 % 2;
        return strIntern;
    }
}
