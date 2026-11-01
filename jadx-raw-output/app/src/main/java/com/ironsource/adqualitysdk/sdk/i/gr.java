package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.view.ViewConfiguration;
import com.ironsource.mediationsdk.IronSource;

/* JADX INFO: loaded from: classes9.dex */
public final class gr extends gl {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2221 = 7563637630334370911L;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2222 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2223 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo2200() {
        int i10 = f2223 + 61;
        int i11 = i10 % 128;
        f2222 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 73;
        f2223 = i13 % 128;
        int i14 = i13 % 2;
        return IronSource.class;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2229(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2284) {
            char[] cArrM2243 = h.m2243(f2221, cArr, i10);
            h.f2285 = 4;
            while (true) {
                int i11 = h.f2285;
                if (i11 < cArrM2243.length) {
                    h.f2283 = i11 - 4;
                    int i12 = h.f2285;
                    cArrM2243[i12] = (char) (((long) (cArrM2243[i12] ^ cArrM2243[i12 % 4])) ^ (((long) h.f2283) * f2221));
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
        bt btVar = new bt(mo2201());
        int i10 = f2223 + 99;
        f2222 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 26 : ' ') != 26) {
            return btVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo2199() {
        int i10 = f2223 + 43;
        f2222 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m2229("ꢯ唒쀰쟺\ua8cc턢죣䫉릺삻\uda65复訤\uf22a\uebf3瞝鲸\ueda4ﴬ؆\ued3a鼹軷ᒖﾷ躰ꁵ⌝쀴렱뇽㇑튂ꮣ䍽쀕⌜䕂哛\udf75㖐瓌", 1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern();
        int i12 = f2222 + 75;
        f2223 = i12 % 128;
        if ((i12 % 2 == 0 ? 'I' : 'B') == 'B') {
            return strIntern;
        }
        int i13 = 47 / 0;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo2201() {
        int i10 = f2222 + 109;
        f2223 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            m2229("ꑫ絛멨ﮇꐂ纂늹直땤漛ꀧ敬蛰嶝", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern();
            throw null;
        }
        String strIntern = m2229("ꑫ絛멨ﮇꐂ纂늹直땤漛ꀧ敬蛰嶝", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern();
        int i11 = f2223 + 99;
        f2222 = i11 % 128;
        int i12 = i11 % 2;
        return strIntern;
    }
}
