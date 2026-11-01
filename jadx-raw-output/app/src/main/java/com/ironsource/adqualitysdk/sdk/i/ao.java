package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ao {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f338 = 0;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static char f339 = 64155;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char f340 = 18699;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f341 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f342 = 45928;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char f343 = 14739;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private ISAdQualityDeviceIdType f346;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f348 = "";

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f347 = m457("\uea90\ufd49蓐⥨\uf44a驹뛺깯", 6 - ((byte) KeyEvent.getModifierMetaStateMask())).intern();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean f349 = true;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f350 = "";

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f351 = false;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private Map<String, String> f344 = new HashMap();

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private boolean f345 = false;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m462(String str) {
        int i10 = f341;
        int i11 = i10 + 101;
        f338 = i11 % 128;
        int i12 = i11 % 2;
        this.f347 = str;
        int i13 = i10 + 97;
        f338 = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m465(String str) {
        int i10 = f338 + 25;
        f341 = i10 % 128;
        char c10 = i10 % 2 == 0 ? (char) 21 : (char) 28;
        this.f348 = str;
        if (c10 != 21) {
            return;
        }
        int i11 = 87 / 0;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized String m467() {
        String str;
        int i10 = f341 + 101;
        int i11 = i10 % 128;
        f338 = i11;
        int i12 = i10 % 2;
        str = this.f347;
        int i13 = i11 + 23;
        f341 = i13 % 128;
        if ((i13 % 2 == 0 ? (char) 22 : (char) 2) != 2) {
            throw null;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m470() {
        int i10 = f341 + 59;
        int i11 = i10 % 128;
        f338 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        String str = this.f348;
        int i12 = i11 + 1;
        f341 = i12 % 128;
        int i13 = i12 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m472(boolean z10) {
        int i10 = f338 + 25;
        f341 = i10 % 128;
        char c10 = i10 % 2 == 0 ? 'K' : ' ';
        this.f349 = z10;
        if (c10 != ' ') {
            int i11 = 90 / 0;
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final void m458() {
        int i10 = f338 + 119;
        int i11 = i10 % 128;
        f341 = i11;
        int i12 = i10 % 2;
        this.f345 = true;
        int i13 = i11 + 99;
        f338 = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m459() {
        int i10 = f338 + 113;
        f341 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 23 : '`') == '`') {
            return this.f345;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final Map<String, String> m460() {
        Map<String, String> map;
        int i10 = f341;
        int i11 = i10 + 41;
        f338 = i11 % 128;
        if ((i11 % 2 != 0 ? (char) 6 : (char) 28) != 6) {
            map = this.f344;
        } else {
            map = this.f344;
            int i12 = 57 / 0;
        }
        int i13 = i10 + 117;
        f338 = i13 % 128;
        int i14 = i13 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final ISAdQualityDeviceIdType m461() {
        int i10 = f341 + 53;
        int i11 = i10 % 128;
        f338 = i11;
        if ((i10 % 2 != 0 ? 'b' : '_') != '_') {
            throw null;
        }
        ISAdQualityDeviceIdType iSAdQualityDeviceIdType = this.f346;
        int i12 = i11 + 101;
        f341 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return iSAdQualityDeviceIdType;
        }
        int i13 = 93 / 0;
        return iSAdQualityDeviceIdType;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m463() {
        int i10 = f338 + 87;
        f341 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 11 : '/') != 11) {
            return this.f349;
        }
        int i11 = 52 / 0;
        return this.f349;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m464() {
        int i10 = f341;
        int i11 = i10 + 45;
        f338 = i11 % 128;
        int i12 = i11 % 2;
        String str = this.f350;
        int i13 = i10 + 95;
        f338 = i13 % 128;
        int i14 = i13 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m468(ISAdQualityDeviceIdType iSAdQualityDeviceIdType) {
        int i10 = f338 + 95;
        f341 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        this.f346 = iSAdQualityDeviceIdType;
        if (z10) {
            return;
        }
        int i11 = 13 / 0;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m471(String str) {
        int i10 = f338 + 67;
        f341 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        this.f350 = str;
        if (z10) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m473() {
        boolean z10;
        int i10 = f338 + 85;
        int i11 = i10 % 128;
        f341 = i11;
        if (!(i10 % 2 != 0)) {
            z10 = this.f351;
            int i12 = 75 / 0;
        } else {
            z10 = this.f351;
        }
        int i13 = i11 + 61;
        f338 = i13 % 128;
        if ((i13 % 2 != 0 ? 'O' : 'E') != 'O') {
            return z10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m457(String str, int i10) {
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
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f340)) ^ ((c11 >>> 5) + f339)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f342) ^ ((c12 + i12) ^ ((c12 << 4) + f343))));
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m466(boolean z10) {
        int i10 = f341;
        int i11 = i10 + 33;
        f338 = i11 % 128;
        int i12 = i11 % 2;
        this.f351 = z10;
        int i13 = i10 + 55;
        f338 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m469(Map<String, String> map) {
        int i10 = f341 + 9;
        int i11 = i10 % 128;
        f338 = i11;
        int i12 = i10 % 2;
        this.f344 = map;
        int i13 = i11 + 109;
        f341 = i13 % 128;
        int i14 = i13 % 2;
    }
}
