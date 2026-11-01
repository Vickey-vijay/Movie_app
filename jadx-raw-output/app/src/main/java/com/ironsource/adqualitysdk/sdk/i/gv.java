package com.ironsource.adqualitysdk.sdk.i;

import android.view.MotionEvent;
import android.view.View;
import com.smaato.sdk.core.SmaatoSdk;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes9.dex */
public final class gv extends gl {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2242 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f2243 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2244 = {384, 396, 394, 331, 400, 382, 401, 385, 392, 399, 386, 368};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2245 = 285;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2246 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f2247 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2234(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f2244;
            int i11 = f2245;
            if (f2243) {
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
            if (f2247) {
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

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo2198() {
        cb cbVar = new cb(mo2201());
        int i10 = f2242 + 89;
        f2246 = i10 % 128;
        int i11 = i10 % 2;
        return cbVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo2199() {
        int i10 = f2242 + 1;
        f2246 = i10 % 128;
        return m2234(null, i10 % 2 == 0 ? 126 - MotionEvent.axisFromString("") : MotionEvent.axisFromString("") + 6, null, "\u0089\u0088\u008c\u0082\u0087\u0086\u0086\u0083\u008c\u0084\u008b\u008a\u0082\u0081\u0084\u0089\u0088\u0085\u0084\u0082\u0087\u0086\u0086\u0083\u0085\u0084\u0083\u0082\u0081").intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo2200() {
        int i10 = f2246 + 123;
        int i11 = i10 % 128;
        f2242 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 59;
        f2246 = i13 % 128;
        if (i13 % 2 == 0) {
            return SmaatoSdk.class;
        }
        int i14 = 97 / 0;
        return SmaatoSdk.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo2201() {
        int i10 = f2246 + 45;
        f2242 = i10 % 128;
        return m2234(null, (i10 % 2 == 0 ? '.' : (char) 28) != '.' ? 127 - View.resolveSize(0, 0) : 123 >> View.resolveSize(0, 0), null, "\u0082\u0087\u0086\u0086\u0083\u0085").intern();
    }
}
