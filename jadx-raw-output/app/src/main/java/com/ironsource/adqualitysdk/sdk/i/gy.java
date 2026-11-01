package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.network.VungleApiClient;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes9.dex */
public abstract class gy extends gl {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2254 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2255 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f2256 = {-8985427, -1559085221, -531917094, 1944577923, -1166147287, 1301719090, -637277444, -972790288, -832508165, 1998381331, 1982553413, 770973026, -639769929, 1215005747, 58563681, 805664756, -138552365, 1514827584};

    public static class a extends gy {

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f2257 = 0;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f2258 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static byte[] f2259 = {46, 59, 8, 7, 91, -22, 11, 85, -24, 11, 47, 11, 11, 37, 92, -15, 11, 49, 12, 49, 53, -3, 116, -14, 57, 1, 8, 55, 3, 46, 47, 73, -55, 53, 49, 65, -5, 11, 47, 11, 11, 5, 124, -13, 6, 56, 0};

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static short[] f2260 = null;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f2261 = 15;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2262 = 1852227107;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2263 = 241576904;

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﻐ */
        public final bd mo2198() {
            ck ckVar = new ck(mo2201());
            int i10 = f2257 + 57;
            f2258 = i10 % 128;
            int i11 = i10 % 2;
            return ckVar;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m2238(int i10, short s10, int i11, byte b10, int i12) {
            String string;
            synchronized (o.f2993) {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f2261;
                int i14 = i12 + i13;
                boolean z10 = i14 == -1;
                if (z10) {
                    byte[] bArr = f2259;
                    i14 = bArr != null ? (byte) (bArr[f2262 + i10] + i13) : (short) (f2260[f2262 + i10] + i13);
                }
                if (i14 > 0) {
                    o.f2994 = ((i10 + i14) - 2) + f2262 + (z10 ? 1 : 0);
                    o.f2995 = b10;
                    char c10 = (char) (i11 + f2263);
                    o.f2997 = c10;
                    sb2.append(c10);
                    o.f2996 = o.f2997;
                    o.f2998 = 1;
                    while (o.f2998 < i14) {
                        byte[] bArr2 = f2259;
                        if (bArr2 != null) {
                            int i15 = o.f2994;
                            o.f2994 = i15 - 1;
                            o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i15] + s10)) ^ o.f2995));
                        } else {
                            short[] sArr = f2260;
                            int i16 = o.f2994;
                            o.f2994 = i16 - 1;
                            o.f2997 = (char) (o.f2996 + (((short) (sArr[i16] + s10)) ^ o.f2995));
                        }
                        sb2.append(o.f2997);
                        o.f2996 = o.f2997;
                        o.f2998++;
                    }
                }
                string = sb2.toString();
            }
            return string;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ｋ */
        public final String mo2199() {
            int i10 = f2257 + 5;
            f2258 = i10 % 128;
            int i11 = i10 % 2;
            String strIntern = m2238((ViewConfiguration.getTapTimeout() >> 16) - 1852227107, (short) ((-29) - View.MeasureSpec.makeMeasureSpec(0, 0)), TextUtils.getOffsetAfter("", 0) - 241576805, (byte) (22 - ExpandableListView.getPackedPositionChild(0L)), 32 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern();
            int i12 = f2258 + 113;
            f2257 = i12 % 128;
            int i13 = i12 % 2;
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾇ */
        public final Class mo2200() {
            int i10 = f2258 + 67;
            int i11 = i10 % 128;
            f2257 = i11;
            if (i10 % 2 != 0) {
                throw null;
            }
            int i12 = i11 + 113;
            f2258 = i12 % 128;
            int i13 = i12 % 2;
            return VungleApiClient.class;
        }
    }

    public static class e extends gy {

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f2264 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static boolean f2265 = true;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static boolean f2266 = true;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static char[] f2267 = {360, 372, 370, 307, 379, 378, 371, 364, 369, 362, 380, 358, 375, 347, 326, 373, 366, 328, 377};

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2268 = 0;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2269 = 261;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m2239(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f2267;
                int i11 = f2269;
                if (f2265) {
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
                if (f2266) {
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
            cd cdVar = new cd(m2239(null, 127 - View.MeasureSpec.makeMeasureSpec(0, 0), null, "\u008a\u0089\u0088\u0087\u0086\u0085").intern());
            int i10 = f2264 + 75;
            f2268 = i10 % 128;
            if ((i10 % 2 != 0 ? '(' : (char) 3) == 3) {
                return cdVar;
            }
            int i11 = 84 / 0;
            return cdVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ｋ */
        public final String mo2199() {
            int i10 = f2268 + 55;
            f2264 = i10 % 128;
            return m2239(null, (i10 % 2 == 0 ? 'U' : (char) 1) != 'U' ? ExpandableListView.getPackedPositionChild(0L) + 128 : ExpandableListView.getPackedPositionChild(0L) * 2505, null, "\u0093\u0087\u008a\u0091\u0089\u0092\u0091\u0090\u008f\u008a\u0089\u0088\u0087\u0086\u008e\u0084\u0087\u008a\u008d\u008d\u008c\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾇ */
        public final Class mo2200() {
            int i10 = f2264 + 77;
            int i11 = i10 % 128;
            f2268 = i11;
            int i12 = i10 % 2;
            int i13 = i11 + 61;
            f2264 = i13 % 128;
            int i14 = i13 % 2;
            return com.vungle.warren.VungleApiClient.class;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2237(int[] iArr, int i10) {
        String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.e.f1912) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2256.clone();
            com.ironsource.adqualitysdk.sdk.i.e.f1913 = 0;
            while (true) {
                int i11 = com.ironsource.adqualitysdk.sdk.i.e.f1913;
                if (i11 < iArr.length) {
                    int i12 = iArr[i11];
                    char c10 = (char) (i12 >> 16);
                    cArr[0] = c10;
                    char c11 = (char) i12;
                    cArr[1] = c11;
                    char c12 = (char) (iArr[i11 + 1] >> 16);
                    cArr[2] = c12;
                    char c13 = (char) iArr[i11 + 1];
                    cArr[3] = c13;
                    com.ironsource.adqualitysdk.sdk.i.e.f1915 = (c10 << 16) + c11;
                    com.ironsource.adqualitysdk.sdk.i.e.f1914 = (c12 << 16) + c13;
                    com.ironsource.adqualitysdk.sdk.i.e.m2135(iArr2);
                    for (int i13 = 0; i13 < 16; i13++) {
                        int i14 = com.ironsource.adqualitysdk.sdk.i.e.f1915 ^ iArr2[i13];
                        com.ironsource.adqualitysdk.sdk.i.e.f1915 = i14;
                        com.ironsource.adqualitysdk.sdk.i.e.f1914 = com.ironsource.adqualitysdk.sdk.i.e.m2134(i14) ^ com.ironsource.adqualitysdk.sdk.i.e.f1914;
                        int i15 = com.ironsource.adqualitysdk.sdk.i.e.f1915;
                        com.ironsource.adqualitysdk.sdk.i.e.f1915 = com.ironsource.adqualitysdk.sdk.i.e.f1914;
                        com.ironsource.adqualitysdk.sdk.i.e.f1914 = i15;
                    }
                    int i16 = com.ironsource.adqualitysdk.sdk.i.e.f1915;
                    com.ironsource.adqualitysdk.sdk.i.e.f1915 = com.ironsource.adqualitysdk.sdk.i.e.f1914;
                    com.ironsource.adqualitysdk.sdk.i.e.f1914 = i16;
                    com.ironsource.adqualitysdk.sdk.i.e.f1914 = i16 ^ iArr2[16];
                    com.ironsource.adqualitysdk.sdk.i.e.f1915 ^= iArr2[17];
                    int i17 = com.ironsource.adqualitysdk.sdk.i.e.f1913;
                    int i18 = com.ironsource.adqualitysdk.sdk.i.e.f1915;
                    cArr[0] = (char) (i18 >>> 16);
                    cArr[1] = (char) i18;
                    int i19 = com.ironsource.adqualitysdk.sdk.i.e.f1914;
                    cArr[2] = (char) (i19 >>> 16);
                    cArr[3] = (char) i19;
                    com.ironsource.adqualitysdk.sdk.i.e.m2135(iArr2);
                    int i20 = com.ironsource.adqualitysdk.sdk.i.e.f1913;
                    cArr2[i20 << 1] = cArr[0];
                    cArr2[(i20 << 1) + 1] = cArr[1];
                    cArr2[(i20 << 1) + 2] = cArr[2];
                    cArr2[(i20 << 1) + 3] = cArr[3];
                    com.ironsource.adqualitysdk.sdk.i.e.f1913 = i20 + 2;
                } else {
                    str = new String(cArr2, 0, i10);
                }
            }
        }
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo2201() {
        int i10 = f2255 + 45;
        f2254 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m2237(new int[]{-1817536935, -1200560156, -399695104, -2038985592}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 5).intern();
        int i12 = f2254 + 123;
        f2255 = i12 % 128;
        if ((i12 % 2 == 0 ? '?' : 'D') == 'D') {
            return strIntern;
        }
        throw null;
    }
}
