package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.yandex.mobile.ads.common.MobileAds;

/* JADX INFO: loaded from: classes9.dex */
public final class gx extends gl {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2251 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2252 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2253 = -1466685836665518762L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo2201() {
        int i10 = f2252 + 91;
        f2251 = i10 % 128;
        return m2236("✷❎㉂띵ௌĎꭀ㬦㈊ⶣ", i10 % 2 == 0 ? 1 >> TextUtils.lastIndexOf("", 'y', 0, 0) : TextUtils.lastIndexOf("", '0', 0, 0) + 1).intern();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2236(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2284) {
            char[] cArrM2243 = h.m2243(f2253, cArr, i10);
            h.f2285 = 4;
            while (true) {
                int i11 = h.f2285;
                if (i11 < cArrM2243.length) {
                    h.f2283 = i11 - 4;
                    int i12 = h.f2285;
                    cArrM2243[i12] = (char) (((long) (cArrM2243[i12] ^ cArrM2243[i12 % 4])) ^ (((long) h.f2283) * f2253));
                    h.f2285++;
                } else {
                    str2 = new String(cArrM2243, 4, cArrM2243.length - 4);
                }
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo2198() {
        cj cjVar = new cj(mo2201());
        int i10 = f2252 + 19;
        f2251 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        return cjVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo2199() {
        int i10 = f2251 + 103;
        f2252 = i10 % 128;
        if ((i10 % 2 != 0 ? 'Q' : (char) 29) != 29) {
            m2236("녃넠\u0a46轿鑋麊둶\u245aꑢᖰ뻠腤鮖㼁꯸麅\uf124䩃푗\uf43c\ue446嗧ﻧ셜\udb88罟\ueb8d\ude8fㄾ詴ᑙ㐦␅閌㻱Œᯪ뼅⮃ộ焿쩢", TextUtils.getTrimmedLength("")).intern();
            throw null;
        }
        String strIntern = m2236("녃넠\u0a46轿鑋麊둶\u245aꑢᖰ뻠腤鮖㼁꯸麅\uf124䩃푗\uf43c\ue446嗧ﻧ셜\udb88罟\ueb8d\ude8fㄾ詴ᑙ㐦␅閌㻱Œᯪ뼅⮃ộ焿쩢", TextUtils.getTrimmedLength("")).intern();
        int i11 = f2251 + 47;
        f2252 = i11 % 128;
        int i12 = i11 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo2200() {
        int i10 = f2251;
        int i11 = i10 + 117;
        f2252 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 69;
        f2252 = i13 % 128;
        int i14 = i13 % 2;
        return MobileAds.class;
    }
}
