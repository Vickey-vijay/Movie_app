package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import tv.superawesome.sdk.publisher.AwesomeAds;

/* JADX INFO: loaded from: classes9.dex */
public final class gu extends gl {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2237 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2238 = 23970;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2239 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2240 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f2241;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo2201() {
        char packedPositionChild;
        int maximumDrawingCacheSize;
        int i10 = f2240 + 49;
        f2239 = i10 % 128;
        if ((i10 % 2 != 0 ? '!' : '\b') != '\b') {
            packedPositionChild = (char) (0 >> ExpandableListView.getPackedPositionChild(1L));
            maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() - 67;
        } else {
            packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
            maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
        }
        return m2233("瑯\uefdc褗ὒ滀ⵕꓓ흐Ƕ꽩똨睰", packedPositionChild, "\u0000\u0000\u0000\u0000", maximumDrawingCacheSize, "됪꧷䃀Ừ").intern();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2233(String str, char c10, String str2, int i10, String str3) {
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
                    cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f2241) ^ ((long) f2237)) ^ ((long) f2238));
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
        cc ccVar = new cc(mo2201());
        int i10 = f2239 + 49;
        f2240 = i10 % 128;
        int i11 = i10 % 2;
        return ccVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo2199() {
        int i10 = f2239 + 21;
        f2240 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m2233("语럅齃穟❺䷄錙䜯ꪹ惼ታ탑\ue7cd俿蜪洪鿉\uda18ﴸ렎輐鿺뻅퉣㭰幄䔨䧝䮻㸝䍜止ᒫ쓭䂅脧⟟⛖좿⼳", (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 60025), "\u0000\u0000\u0000\u0000", View.combineMeasuredStates(0, 0), "䇸⡏穸櫪").intern();
        int i12 = f2239 + 13;
        f2240 = i12 % 128;
        if ((i12 % 2 == 0 ? 'A' : '\'') == '\'') {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo2200() {
        int i10 = f2240 + 91;
        int i11 = i10 % 128;
        f2239 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 95;
        f2240 = i13 % 128;
        if (!(i13 % 2 == 0)) {
            return AwesomeAds.class;
        }
        int i14 = 12 / 0;
        return AwesomeAds.class;
    }
}
