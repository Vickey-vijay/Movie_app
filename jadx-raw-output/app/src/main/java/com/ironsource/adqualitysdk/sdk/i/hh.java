package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes9.dex */
public final class hh extends hb<View.OnTouchListener> implements View.OnTouchListener {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2312 = 5;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2313 = {'O', 'n', 'T', 'o', 'u', 'c', 'h', 'L', 'i', 's', 't', 'e', 'r', 'D', 'a', 'E', ' ', 'm', 'b', 'P', 'Q', 'R', 'S', 'U', 'V'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2314 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2315 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private c f2316;

    public interface c {
        /* JADX INFO: renamed from: ｋ */
        boolean mo1833(hh hhVar, View view, MotionEvent motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        try {
            this.f2316.mo1833(this, view, motionEvent);
        } catch (Throwable th2) {
            kd.m2872(m2249("\u0001\u0002\u0003\u0004\u0000\t\u0007\b\t\u0005\u000b\f\u0006\u0010\r\u000e\n\u0006\u0002\r\n\u000b\u0002\r", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23, (byte) (Color.rgb(0, 0, 0) + 16777314)).intern(), m2249("\u0011\n\r\u0002\u000b\u0011\u0006\u0003\u0011\u0012\u0003\u0011\b\t\u0005\u000e\u0010\u0006\f\r\u0012\u0001\u0002\u0003\u0004\u0000\u0006\u0007", View.combineMeasuredStates(0, 0) + 28, (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 83)).intern(), th2, false);
        }
        if ((mo742() != null ? (char) 4 : (char) 11) != 4) {
            int i10 = f2315 + 35;
            f2314 = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        int i12 = f2315 + 103;
        f2314 = i12 % 128;
        int i13 = i12 % 2;
        return mo742().onTouch(view, motionEvent);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2249(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2129) {
            char[] cArr2 = f2313;
            char c10 = f2312;
            char[] cArr3 = new char[i10];
            if (i10 % 2 != 0) {
                i10--;
                cArr3[i10] = (char) (cArr[i10] - b10);
            }
            if (i10 > 1) {
                g.f2134 = 0;
                while (true) {
                    int i11 = g.f2134;
                    if (i11 >= i10) {
                        break;
                    }
                    g.f2133 = cArr[i11];
                    g.f2131 = cArr[g.f2134 + 1];
                    if (g.f2133 == g.f2131) {
                        cArr3[g.f2134] = (char) (g.f2133 - b10);
                        cArr3[g.f2134 + 1] = (char) (g.f2131 - b10);
                    } else {
                        g.f2132 = g.f2133 / c10;
                        g.f2130 = g.f2133 % c10;
                        g.f2135 = g.f2131 / c10;
                        g.f2128 = g.f2131 % c10;
                        if (g.f2130 == g.f2128) {
                            g.f2132 = ((g.f2132 + c10) - 1) % c10;
                            g.f2135 = ((g.f2135 + c10) - 1) % c10;
                            int i12 = (g.f2132 * c10) + g.f2130;
                            int i13 = (g.f2135 * c10) + g.f2128;
                            int i14 = g.f2134;
                            cArr3[i14] = cArr2[i12];
                            cArr3[i14 + 1] = cArr2[i13];
                        } else if (g.f2132 == g.f2135) {
                            g.f2130 = ((g.f2130 + c10) - 1) % c10;
                            g.f2128 = ((g.f2128 + c10) - 1) % c10;
                            int i15 = (g.f2132 * c10) + g.f2130;
                            int i16 = (g.f2135 * c10) + g.f2128;
                            int i17 = g.f2134;
                            cArr3[i17] = cArr2[i15];
                            cArr3[i17 + 1] = cArr2[i16];
                        } else {
                            int i18 = (g.f2132 * c10) + g.f2128;
                            int i19 = (g.f2135 * c10) + g.f2130;
                            int i20 = g.f2134;
                            cArr3[i20] = cArr2[i18];
                            cArr3[i20 + 1] = cArr2[i19];
                        }
                    }
                    g.f2134 += 2;
                }
            }
            str2 = new String(cArr3);
        }
        return str2;
    }

    public hh(View.OnTouchListener onTouchListener, c cVar) {
        super(onTouchListener);
        this.f2316 = cVar;
    }
}
