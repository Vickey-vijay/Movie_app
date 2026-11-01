package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import android.view.ViewConfiguration;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes7.dex */
public final class co {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1376 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1377 = {351, 350, 344, 300, 315};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f1378 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1379 = 268;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f1380 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1381;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m1626(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m1625(null, 127 - View.combineMeasuredStates(0, 0), null, "\u0084\u0083\u0082\u0081").intern());
        sb2.append(str);
        k.m2829(sb2.toString(), str2);
        int i10 = f1381 + 19;
        f1376 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m1623(String str, String str2, Throwable th2) {
        int i10 = f1376 + 73;
        f1381 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        m1624(str, str2, th2);
        if (z10) {
            return;
        }
        int i11 = 65 / 0;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m1624(String str, String str2, Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m1625(null, 128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), null, "\u0085\u0083\u0082\u0081").intern());
        sb2.append(str);
        kd.m2875(sb2.toString(), str2, Integer.toHexString(str2.hashCode()), th2, null, false);
        int i10 = f1376 + 79;
        f1381 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 11 : 'L') != 'L') {
            int i11 = 68 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1625(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f2988) {
            char[] cArr2 = f1377;
            int i11 = f1379;
            if (f1380) {
                int length = bArr.length;
                m.f2990 = length;
                char[] cArr3 = new char[length];
                m.f2989 = 0;
                while (m.f2989 < m.f2990) {
                    int i12 = m.f2989;
                    int i13 = m.f2990 - 1;
                    int i14 = m.f2989;
                    cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                    m.f2989 = i14 + 1;
                }
                return new String(cArr3);
            }
            if (f1378) {
                int length2 = cArr.length;
                m.f2990 = length2;
                char[] cArr4 = new char[length2];
                m.f2989 = 0;
                while (m.f2989 < m.f2990) {
                    int i15 = m.f2989;
                    int i16 = m.f2990 - 1;
                    int i17 = m.f2989;
                    cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                    m.f2989 = i17 + 1;
                }
                return new String(cArr4);
            }
            int length3 = iArr.length;
            m.f2990 = length3;
            char[] cArr5 = new char[length3];
            m.f2989 = 0;
            while (m.f2989 < m.f2990) {
                int i18 = m.f2989;
                int i19 = m.f2990 - 1;
                int i20 = m.f2989;
                cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                m.f2989 = i20 + 1;
            }
            return new String(cArr5);
        }
    }
}
