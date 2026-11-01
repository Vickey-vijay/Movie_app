package com.ironsource.adqualitysdk.sdk.i;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.applovin.sdk.AppLovinSdk;

/* JADX INFO: loaded from: classes7.dex */
public final class gb extends gl {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2140 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2141 = -1193984871553583857L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2142 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo2198() {
        bi biVar = new bi(mo2201());
        int i10 = f2140 + 63;
        f2142 = i10 % 128;
        if ((i10 % 2 == 0 ? ')' : (char) 29) != ')') {
            return biVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2209(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2019) {
            f.f2017 = i10;
            char[] cArr2 = new char[cArr.length];
            f.f2018 = 0;
            while (true) {
                int i11 = f.f2018;
                if (i11 < cArr.length) {
                    cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2017 * i11))) ^ f2141);
                    f.f2018++;
                } else {
                    str2 = new String(cArr2);
                }
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo2199() {
        int i10 = f2140 + 33;
        f2142 = i10 % 128;
        return (i10 % 2 == 0 ? m2209("땬睁ㄠ\uf342뷪翚㦹ﮄꑨ晐\u202c\ue20a겭滑⢥\uea8b霱兿ጭ\udd0c鿗姕ᮯ양虹䁥ȱ찟", 49697 << (ViewConfiguration.getScrollBarFadeDuration() * 79)) : m2209("땬睁ㄠ\uf342뷪翚㦹ﮄꑨ晐\u202c\ue20a겭滑⢥\uea8b霱兿ጭ\udd0c鿗姕ᮯ양虹䁥ȱ찟", 49697 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo2200() {
        int i10 = f2142;
        int i11 = i10 + 45;
        f2140 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 33;
        f2140 = i13 % 128;
        if ((i13 % 2 != 0 ? '`' : ',') == ',') {
            return AppLovinSdk.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo2201() {
        int i10 = f2140 + 17;
        f2142 = i10 % 128;
        return m2209("땮ퟪ灕鋜㼴妐礼ݲ", (i10 % 2 == 0 ? '@' : '0') != '@' ? 25236 - MotionEvent.axisFromString("") : 3258 >>> MotionEvent.axisFromString("")).intern();
    }
}
