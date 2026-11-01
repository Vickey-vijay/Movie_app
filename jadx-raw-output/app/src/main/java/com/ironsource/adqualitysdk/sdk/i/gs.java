package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.ogury.ad.OguryReward;
import io.presage.Presage;

/* JADX INFO: loaded from: classes9.dex */
public final class gs extends gl {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2224 = {'i', 'o', '.', 'p', 'r', 'e', 's', 'a', 'g', 'P', 'u', 'y', 'j', 'k', 'l', 'm'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2225 = 4;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2226 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2227;

    public static class a extends gl {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static long f2228 = 0;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2229 = 0;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f2230 = 0;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char f2231 = 2485;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2232 = 1;

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾇ */
        public final Class mo2200() {
            int i10 = f2230 + 57;
            int i11 = i10 % 128;
            f2232 = i11;
            if (i10 % 2 == 0) {
                throw null;
            }
            int i12 = i11 + 79;
            f2230 = i12 % 128;
            if (!(i12 % 2 != 0)) {
                return OguryReward.class;
            }
            int i13 = 25 / 0;
            return OguryReward.class;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m2231(String str, char c10, String str2, int i10, String str3) {
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
                        cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f2228) ^ ((long) f2229)) ^ ((long) f2231));
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
            by byVar = new by(mo2201());
            int i10 = f2232 + 17;
            f2230 = i10 % 128;
            if (i10 % 2 == 0) {
                return byVar;
            }
            int i11 = 99 / 0;
            return byVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ｋ */
        public final String mo2199() {
            char scrollBarSize;
            int iAxisFromString;
            int i10 = f2232 + 117;
            f2230 = i10 % 128;
            if ((i10 % 2 != 0 ? 'Y' : (char) 6) != 6) {
                scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() % 49);
                iAxisFromString = MotionEvent.axisFromString("") - 1;
            } else {
                scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                iAxisFromString = (-1) - MotionEvent.axisFromString("");
            }
            String strIntern = m2231("Ї⳱励䃵壪폗홺猍畊\uec7eꝥ剠䃂Ｕ㸩ꆳﵗ\ud846愽\ud83b옃㨊塄膎", scrollBarSize, "\u0000\u0000\u0000\u0000", iAxisFromString, "莙\ueb0fȑ㆓").intern();
            int i11 = f2232 + 49;
            f2230 = i11 % 128;
            if ((i11 % 2 != 0 ? 'C' : '>') == '>') {
                return strIntern;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾒ */
        public final String mo2201() {
            int i10 = f2232 + 87;
            f2230 = i10 % 128;
            int i11 = i10 % 2;
            String strIntern = m2231("뚛漐馳\ua62d␗", (char) (26391 - TextUtils.lastIndexOf("", '0')), "\u0000\u0000\u0000\u0000", TextUtils.lastIndexOf("", '0', 0, 0) - 296328029, "ꉟ噤ᣮ㙧").intern();
            int i12 = f2232 + 53;
            f2230 = i12 % 128;
            if ((i12 % 2 != 0 ? '&' : '\n') != '&') {
                return strIntern;
            }
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo2198() {
        ca caVar = new ca(mo2201());
        int i10 = f2226 + 109;
        f2227 = i10 % 128;
        if (i10 % 2 == 0) {
            return caVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2230(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2129) {
            char[] cArr2 = f2224;
            char c10 = f2225;
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

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo2199() {
        int iIndexOf;
        int scrollBarSize;
        int i10 = f2226 + 29;
        f2227 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 28 : (char) 26) != 28) {
            iIndexOf = 18 - TextUtils.indexOf("", "", 0, 0);
            scrollBarSize = 69 - (ViewConfiguration.getScrollBarSize() >> 8);
        } else {
            iIndexOf = 99 % TextUtils.indexOf("", "", 0, 0);
            scrollBarSize = 57 - (ViewConfiguration.getScrollBarSize() % 36);
        }
        String strIntern = m2230("\u0001\u0002\u0003\u0000\u0005\u0006\u0007\u0004\t\u0004\u0001\n\u0005\u0006\u0007\u0004\t\u0004", iIndexOf, (byte) scrollBarSize).intern();
        int i11 = f2227 + 21;
        f2226 = i11 % 128;
        int i12 = i11 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo2200() {
        int i10 = f2226;
        int i11 = i10 + 123;
        f2227 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        int i12 = i10 + 41;
        f2227 = i12 % 128;
        int i13 = i12 % 2;
        return Presage.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo2201() {
        int i10 = f2227 + 37;
        f2226 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m2230("\u0000\t\b\u0006\u0095", 5 - TextUtils.indexOf("", ""), (byte) (28 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).intern();
        int i12 = f2227 + 83;
        f2226 = i12 % 128;
        int i13 = i12 % 2;
        return strIntern;
    }
}
