package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.mbridge.msdk.MBridgeSDK;
import com.mintegral.msdk.MIntegralSDK;

/* JADX INFO: loaded from: classes9.dex */
public final class gq {

    public static class c extends gl {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2215 = 66;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2216 = 0;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2217 = 1;

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﻐ */
        public final bd mo2198() {
            bw.a aVar = new bw.a(mo2201());
            int i10 = f2216 + 101;
            f2217 = i10 % 128;
            if ((i10 % 2 == 0 ? (char) 28 : 'E') == 'E') {
                return aVar;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m2227(String str, int i10, boolean z10, int i11, int i12) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f2215);
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

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ｋ */
        public final String mo2199() {
            int i10 = f2216 + 113;
            f2217 = i10 % 128;
            int i11 = i10 % 2;
            String strIntern = m2227("\u000f\u0003￫￤\ufff3\f\u0001\u0012\u0007\u0005\u0014\u000e￩￭ￎ\u000b\u0004\u0013\rￎ\f\u0001\u0012\u0007\u0005\u0014\u000e\t\rￎ\r", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31, true, TextUtils.indexOf("", "") + 2, TextUtils.indexOf((CharSequence) "", '0', 0) + 163).intern();
            int i12 = f2217 + 75;
            f2216 = i12 % 128;
            if ((i12 % 2 != 0 ? (char) 27 : '%') != 27) {
                return strIntern;
            }
            int i13 = 28 / 0;
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾇ */
        public final Class mo2200() {
            int i10 = f2217 + 73;
            int i11 = i10 % 128;
            f2216 = i11;
            int i12 = i10 % 2;
            int i13 = i11 + 65;
            f2217 = i13 % 128;
            int i14 = i13 % 2;
            return MIntegralSDK.class;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾒ */
        public final String mo2201() {
            int i10 = f2216 + 105;
            f2217 = i10 % 128;
            String strIntern = (!(i10 % 2 == 0) ? m2227("￼\ufffa\t\u0003\ufffe\u0002\u0001\ufff6\u0007", TextUtils.getTrimmedLength("") + 9, true, TextUtils.getOffsetBefore("", 0) + 6, 173 - Color.blue(0)) : m2227("￼\ufffa\t\u0003\ufffe\u0002\u0001\ufff6\u0007", 12 >>> TextUtils.getTrimmedLength(""), false, 56 - TextUtils.getOffsetBefore("", 1), Color.blue(0) * 22603)).intern();
            int i11 = f2216 + 71;
            f2217 = i11 % 128;
            int i12 = i11 % 2;
            return strIntern;
        }
    }

    public static class d extends gl {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static long f2218 = 3189224698054276520L;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f2219 = 0;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2220 = 1;

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ｋ */
        public final String mo2199() {
            int i10 = f2220 + 89;
            f2219 = i10 % 128;
            return m2228("竎违\uea9b窭\udb43祥Ʀ뮕갃쏷⬙\uecb2ퟪ굒牮핕弄瘦藏㿰\u2060徸꼉恉䮇⥱\uf68c䤾絝\uf2f1ᧀ", !(i10 % 2 != 0) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(1, 0)).intern();
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m2228(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (h.f2284) {
                char[] cArrM2243 = h.m2243(f2218, cArr, i10);
                h.f2285 = 4;
                while (true) {
                    int i11 = h.f2285;
                    if (i11 < cArrM2243.length) {
                        h.f2283 = i11 - 4;
                        int i12 = h.f2285;
                        cArrM2243[i12] = (char) (((long) (cArrM2243[i12] ^ cArrM2243[i12 % 4])) ^ (((long) h.f2283) * f2218));
                        h.f2285++;
                    } else {
                        str2 = new String(cArrM2243, 4, cArrM2243.length - 4);
                    }
                }
            }
            return str2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﻐ */
        public final bd mo2198() {
            bw.b bVar = new bw.b(mo2201());
            int i10 = f2220 + 71;
            f2219 = i10 % 128;
            int i11 = i10 % 2;
            return bVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾇ */
        public final Class mo2200() {
            int i10 = f2220 + 11;
            f2219 = i10 % 128;
            if ((i10 % 2 != 0 ? 'W' : '%') != '%') {
                int i11 = 3 / 0;
            }
            return MBridgeSDK.class;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾒ */
        public final String mo2201() {
            int i10 = f2219 + 21;
            f2220 = i10 % 128;
            int i11 = (i10 % 2 == 0 ? 'Q' : 'B') != 'B' ? 1 : 0;
            return m2228("엯糮谔얂録य未\uf3beጪチ䶖\ua4cb棃", KeyEvent.getDeadChar(i11, i11)).intern();
        }
    }

    public gq() {
    }

    public gq(Context context) {
        context.getApplicationContext();
    }
}
