package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class dl {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1769 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1770 = 96;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1771;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1772;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean f1773;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f1774;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m2007() {
        int i10 = f1771 + 41;
        int i11 = i10 % 128;
        f1769 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        boolean z10 = this.f1773;
        int i12 = i11 + 77;
        f1771 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return z10;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2006(String str, int i10, boolean z10, int i11, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f706) {
            char[] cArr2 = new char[i10];
            b.f704 = 0;
            while (true) {
                int i13 = b.f704;
                if (i13 >= i10) {
                    break;
                }
                b.f705 = cArr[i13];
                cArr2[b.f704] = (char) (b.f705 + i12);
                int i14 = b.f704;
                cArr2[i14] = (char) (cArr2[i14] - f1770);
                b.f704 = i14 + 1;
            }
            if (i11 > 0) {
                b.f707 = i11;
                char[] cArr3 = new char[i10];
                System.arraycopy(cArr2, 0, cArr3, 0, i10);
                int i15 = b.f707;
                System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                int i16 = b.f707;
                System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
            }
            if (z10) {
                char[] cArr4 = new char[i10];
                b.f704 = 0;
                while (true) {
                    int i17 = b.f704;
                    if (i17 >= i10) {
                        break;
                    }
                    cArr4[i17] = cArr2[(i10 - i17) - 1];
                    b.f704 = i17 + 1;
                }
                cArr2 = cArr4;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m2008() {
        int i10 = f1771 + 93;
        f1769 = i10 % 128;
        if ((i10 % 2 == 0 ? '.' : 'X') != '.') {
            return this.f1774;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m2009() {
        int i10 = f1769 + 87;
        f1771 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 18 : 'W') == 18) {
            return this.f1772;
        }
        throw null;
    }

    public dl(JSONObject jSONObject) {
        this.f1773 = jSONObject.optBoolean(m2006("\u0002\f\uffff\ufffb\ufffe\u0007\ufffb\u0003\b￮", (ViewConfiguration.getWindowTouchSlop() >> 8) + 10, false, ImageFormat.getBitsPerPixel(0) + 6, 199 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
        this.f1774 = jSONObject.optBoolean(m2006("\uffe7\ufffb\u0003\b\ufffb\u0000\u000e\uffff\f", 9 - Color.alpha(0), false, 4 - (ViewConfiguration.getTapTimeout() >> 16), 197 - TextUtils.lastIndexOf("", '0')).intern());
        this.f1772 = dz.m2133(jSONObject.optString(m2006("\u0003\ufffa\u0005\ufffe\n\ufffb", 7 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), true, 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.red(0) + 202).intern()));
    }
}
