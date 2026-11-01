package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.View;
import android.view.ViewConfiguration;
import com.five_corp.ad.FiveAd;

/* JADX INFO: loaded from: classes9.dex */
public final class gj extends gl {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2184 = {4013, 24897, 53859, 17216, 46120, 9671, 38648, 1931, 30865, 59981, 23393, 52252, 15678, 44672, 8175, 28810, 57824, 21352, 50279, 13592, 42539, 6127, 35050, 'f', 28297, 56758, 19653, 48097, 10756};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2185 = -225550483470192928L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2186 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2187 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo2199() {
        int doubleTapTimeout;
        char mode;
        int size;
        int i10 = f2187 + 121;
        f2186 = i10 % 128;
        if ((i10 % 2 != 0 ? '\b' : '@') != '@') {
            doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() + 1;
            mode = (char) (4390 >> View.MeasureSpec.getMode(0));
            size = 112 - View.MeasureSpec.getSize(0);
        } else {
            doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() >> 16;
            mode = (char) (4046 - View.MeasureSpec.getMode(0));
            size = View.MeasureSpec.getSize(0) + 23;
        }
        return m2219(doubleTapTimeout, mode, size).intern();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2219(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            char[] cArr = new char[i11];
            d.f1652 = 0;
            while (true) {
                int i12 = d.f1652;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f2184[i10 + i12]) ^ (((long) i12) * f2185)) ^ ((long) c10));
                    d.f1652 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo2198() {
        bq bqVar = new bq(mo2201());
        int i10 = f2186 + 1;
        f2187 = i10 % 128;
        if ((i10 % 2 == 0 ? 'N' : '@') != 'N') {
            return bqVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo2200() {
        int i10 = f2186 + 109;
        int i11 = i10 % 128;
        f2187 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 45;
        f2186 = i13 % 128;
        int i14 = i13 % 2;
        return FiveAd.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo2201() {
        int i10 = f2186 + 43;
        f2187 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m2219(Color.red(0) + 23, (char) (ViewConfiguration.getScrollBarSize() >> 8), 6 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern();
        int i12 = f2187 + 73;
        f2186 = i12 % 128;
        int i13 = i12 % 2;
        return strIntern;
    }
}
