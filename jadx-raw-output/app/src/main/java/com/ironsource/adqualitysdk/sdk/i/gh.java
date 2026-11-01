package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import io.bidmachine.BidMachine;

/* JADX INFO: loaded from: classes9.dex */
public final class gh extends gl {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2173 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2174 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2175 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2176 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2177 = 25212;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo2200() {
        int i10 = f2173;
        int i11 = i10 + 57;
        f2176 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 23;
        f2176 = i13 % 128;
        if ((i13 % 2 == 0 ? 'K' : 'X') == 'X') {
            return BidMachine.class;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2217(String str, char c10, String str2, int i10, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (j.f2673) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c10 ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i10));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            j.f2675 = 0;
            while (true) {
                int i11 = j.f2675;
                if (i11 < length) {
                    int i12 = (i11 + 2) % 4;
                    int i13 = (i11 + 3) % 4;
                    int i14 = cArr4[i11 % 4] * 32718;
                    char c11 = cArr5[i12];
                    char c12 = (char) ((i14 + c11) % 65535);
                    j.f2674 = c12;
                    cArr5[i13] = (char) (((cArr4[i13] * 32718) + c11) / 65535);
                    cArr4[i13] = c12;
                    int i15 = j.f2675;
                    cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f2175) ^ ((long) f2174)) ^ ((long) f2177));
                    j.f2675 = i15 + 1;
                } else {
                    str4 = new String(cArr6);
                }
            }
        }
        return str4;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo2198() {
        bl blVar = new bl(mo2201());
        int i10 = f2173 + 111;
        f2176 = i10 % 128;
        int i11 = i10 % 2;
        return blVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo2199() {
        char offsetBefore;
        int capsMode;
        int i10 = f2176 + 75;
        f2173 = i10 % 128;
        if (i10 % 2 == 0) {
            offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
            capsMode = TextUtils.getCapsMode("", 0, 0);
        } else {
            offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
            capsMode = TextUtils.getCapsMode("", 0, 1);
        }
        String strIntern = m2217("\ud9bf줰\uf65b躄\u1af8忎\uf76aנ\ue32d뛭\ue14aⵎ\ue782㯚珄踖뗘ꫩ毭㌰﷼ᷙ厍筢", offsetBefore, "\u0000\u0000\u0000\u0000", capsMode, "충汧₳䉠").intern();
        int i11 = f2176 + 109;
        f2173 = i11 % 128;
        if ((i11 % 2 != 0 ? (char) 31 : (char) 23) != 31) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo2201() {
        char cRgb;
        int gidForName;
        int i10 = f2176 + 117;
        f2173 = i10 % 128;
        if ((i10 % 2 != 0 ? '7' : 'P') != 'P') {
            cRgb = (char) (ViewCompat.MEASURED_STATE_MASK >> Color.rgb(0, 1, 0));
            gidForName = 1 << Process.getGidForName("");
        } else {
            cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
            gidForName = Process.getGidForName("") + 1;
        }
        String strIntern = m2217("⇃㟴悹릁稃綠푉㕫\ua83a⫲", cRgb, "\u0000\u0000\u0000\u0000", gidForName, "ꯡ\uf611暇픇").intern();
        int i11 = f2173 + 83;
        f2176 = i11 % 128;
        int i12 = i11 % 2;
        return strIntern;
    }
}
