package com.ironsource.adqualitysdk.sdk.i;

import android.text.AndroidCharacter;
import android.view.ViewConfiguration;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class gf extends gl {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2160 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2161 = {'1', 'm', 'v', 'l', 'd', 'b', 'g', 'h', 'd'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2162;

    public static class c extends gf {

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static long f2163 = 93071209712816154L;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2164 = 1;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2165;

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾇ */
        public final Class mo2200() {
            int i10 = f2165 + 81;
            int i11 = i10 % 128;
            f2164 = i11;
            int i12 = i10 % 2;
            int i13 = i11 + 23;
            f2165 = i13 % 128;
            int i14 = i13 % 2;
            return PAGSdk.class;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m2214(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (h.f2284) {
                char[] cArrM2243 = h.m2243(f2163, cArr, i10);
                h.f2285 = 4;
                while (true) {
                    int i11 = h.f2285;
                    if (i11 < cArrM2243.length) {
                        h.f2283 = i11 - 4;
                        int i12 = h.f2285;
                        cArrM2243[i12] = (char) (((long) (cArrM2243[i12] ^ cArrM2243[i12 % 4])) ^ (((long) h.f2283) * f2163));
                        h.f2285++;
                    } else {
                        str2 = new String(cArrM2243, 4, cArrM2243.length - 4);
                    }
                }
            }
            return str2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ｋ */
        public final String mo2199() {
            int i10 = f2165 + 87;
            f2164 = i10 % 128;
            int i11 = i10 % 2;
            String strIntern = m2214("딣땀\uf30b捾ㄫᅲ띻ܛ\uf529⏰熚䞨㖗\ue380뀘蘆瑾ꉷ\uf06d욙듨抟ドۥ\uf74eⅇ猯䕉㜠\ue1e5뎽藫瞚ꆉ\uf217쑳똊怿㉯ҁ\uf6a5ₙ狯䓊ㅠ\ue745땝", ViewConfiguration.getScrollDefaultDelay() >> 16).intern();
            int i12 = f2165 + 11;
            f2164 = i12 % 128;
            if ((i12 % 2 == 0 ? (char) 1 : 'I') != 1) {
                return strIntern;
            }
            throw null;
        }
    }

    public static class e extends gf {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2166 = 0;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static long f2167 = -2504831861112177843L;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2168 = 1;

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ｋ */
        public final String mo2199() {
            int i10 = f2168 + 75;
            f2166 = i10 % 128;
            String strIntern = ((i10 % 2 != 0 ? '%' : 'H') != 'H' ? m2215("\u0af6ક\uf8ce年Ϭཹ飙椐\ue7a0ံᨴ䞧탺ⴚ⣢哵촏㨉䟋ℾ빍䣽劋㸞ꢗ旱慱ୖ薽爯簷᧨盎輣諉\uf6ee挅鱇駟", AndroidCharacter.getMirror('1') * 'E') : m2215("\u0af6ક\uf8ce年Ϭཹ飙椐\ue7a0ံᨴ䞧탺ⴚ⣢哵촏㨉䟋ℾ빍䣽劋㸞ꢗ旱慱ୖ薽爯簷᧨盎輣諉\uf6ee挅鱇駟", '1' - AndroidCharacter.getMirror('0'))).intern();
            int i11 = f2168 + 113;
            f2166 = i11 % 128;
            if (!(i11 % 2 != 0)) {
                return strIntern;
            }
            int i12 = 63 / 0;
            return strIntern;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m2215(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (h.f2284) {
                char[] cArrM2243 = h.m2243(f2167, cArr, i10);
                h.f2285 = 4;
                while (true) {
                    int i11 = h.f2285;
                    if (i11 < cArrM2243.length) {
                        h.f2283 = i11 - 4;
                        int i12 = h.f2285;
                        cArrM2243[i12] = (char) (((long) (cArrM2243[i12] ^ cArrM2243[i12 % 4])) ^ (((long) h.f2283) * f2167));
                        h.f2285++;
                    } else {
                        str2 = new String(cArrM2243, 4, cArrM2243.length - 4);
                    }
                }
            }
            return str2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾇ */
        public final Class mo2200() {
            int i10 = f2166 + 73;
            f2168 = i10 % 128;
            if (!(i10 % 2 == 0)) {
                return TTAdSdk.class;
            }
            int i11 = 82 / 0;
            return TTAdSdk.class;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo2201() {
        int i10 = f2162 + 13;
        f2160 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m2213(new int[]{0, 9, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", false).intern();
        int i12 = f2162 + 53;
        f2160 = i12 % 128;
        int i13 = i12 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2213(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (i.f2448) {
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            int i13 = iArr[3];
            char[] cArr = new char[i11];
            System.arraycopy(f2161, i10, cArr, 0, i11);
            if (bArr != null) {
                char[] cArr2 = new char[i11];
                i.f2447 = 0;
                char c10 = 0;
                while (true) {
                    int i14 = i.f2447;
                    if (i14 >= i11) {
                        break;
                    }
                    if (bArr[i14] == 1) {
                        cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                    } else {
                        cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                    }
                    c10 = cArr2[i14];
                    i.f2447 = i14 + 1;
                }
                cArr = cArr2;
            }
            if (i13 > 0) {
                char[] cArr3 = new char[i11];
                System.arraycopy(cArr, 0, cArr3, 0, i11);
                int i15 = i11 - i13;
                System.arraycopy(cArr3, 0, cArr, i15, i13);
                System.arraycopy(cArr3, i13, cArr, 0, i15);
            }
            if (z10) {
                char[] cArr4 = new char[i11];
                i.f2447 = 0;
                while (true) {
                    int i16 = i.f2447;
                    if (i16 >= i11) {
                        break;
                    }
                    cArr4[i16] = cArr[(i11 - i16) - 1];
                    i.f2447 = i16 + 1;
                }
                cArr = cArr4;
            }
            if (i12 > 0) {
                i.f2447 = 0;
                while (true) {
                    int i17 = i.f2447;
                    if (i17 >= i11) {
                        break;
                    }
                    cArr[i17] = (char) (cArr[i17] - iArr[2]);
                    i.f2447 = i17 + 1;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo2198() {
        bk bkVar = new bk(mo2201());
        int i10 = f2160 + 49;
        f2162 = i10 % 128;
        int i11 = i10 % 2;
        return bkVar;
    }
}
