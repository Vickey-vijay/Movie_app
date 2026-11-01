package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.unity3d.services.UnityServices;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes8.dex */
public final class gz extends gl {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2270 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2271 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2272 = 1396974205;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static short[] f2273 = null;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2274 = 122;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2275 = -184600376;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f2276 = {-88, -22, -10, -34, -25, -12, -19, 6, -66, -11, -17, -33, 1, 19, -97, -22, -10, -34, -25, -12, -19, -26, 53, -82, 41, -98, -11, -17, -33, ExifInterface.MARKER_APP1, 51, -71, -38, -20, -114, -50, -46, -87, -44, -54, -102, -104};

    public static class d extends gl {

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f2277 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f2278 = 0;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2279 = 295;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static boolean f2280 = true;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static boolean f2281 = true;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static char[] f2282 = {394, 406, 404, 341, 412, 405, 400, 411, 416, 346, 395, 410, 396, 409, 413, 392, 360, 380};

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾒ */
        public final String mo2201() {
            int i10 = f2278 + 25;
            f2277 = i10 % 128;
            String strIntern = (i10 % 2 == 0 ? m2242(null, 24 / (ViewConfiguration.getMaximumDrawingCacheSize() >>> 77), null, "\u008c\u008b\u0090\u0089\u0088\u0087\u0086\u0085") : m2242(null, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, null, "\u008c\u008b\u0090\u0089\u0088\u0087\u0086\u0085")).intern();
            int i11 = f2278 + 21;
            f2277 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            return strIntern;
        }

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static boolean m2241() {
            boolean zM802 = bc.m802(new gz());
            int i10 = f2278 + 95;
            f2277 = i10 % 128;
            if ((i10 % 2 == 0 ? '\"' : '\f') != '\"') {
                return zM802;
            }
            int i11 = 26 / 0;
            return zM802;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m2242(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f2282;
                int i11 = f2279;
                if (f2280) {
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
                if (f2281) {
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
            ce.d dVar = new ce.d(mo2201());
            int i10 = f2278 + 95;
            f2277 = i10 % 128;
            if (!(i10 % 2 == 0)) {
                return dVar;
            }
            int i11 = 76 / 0;
            return dVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ｋ */
        public final String mo2199() {
            int i10 = f2278 + 83;
            f2277 = i10 % 128;
            if (!(i10 % 2 != 0)) {
                m2241();
                throw null;
            }
            if ((m2241() ? (char) 5 : '!') == '!') {
                return m2242(null, 127 - View.MeasureSpec.getMode(0), null, "\u0089\u0088\u0087\u008f\u0087\u0088\u0081\u0091\u0088\u0087\u0086\u0092\u008b\u0091\u0084\u0088\u0087\u0086\u0085\u008b\u0090\u0084\u008c\u008b\u0090\u0084\u008c\u008d\u0081\u0087\u008f\u008e\u008d\u008c\u0084\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            }
            int i11 = f2278 + 23;
            f2277 = i11 % 128;
            if ((i11 % 2 == 0 ? (char) 11 : '.') == 11) {
                int i12 = 91 / 0;
            }
            return null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾇ */
        public final Class mo2200() {
            int i10 = f2278 + 83;
            f2277 = i10 % 128;
            int i11 = i10 % 2;
            if (!m2241()) {
                return AdUnitActivity.class;
            }
            int i12 = f2277 + 77;
            f2278 = i12 % 128;
            if (i12 % 2 == 0) {
                return null;
            }
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo2198() {
        ce ceVar = new ce(mo2201());
        int i10 = f2270 + 55;
        f2271 = i10 % 128;
        if (i10 % 2 == 0) {
            return ceVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2240(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f2993) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f2274;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f2276;
                i14 = bArr != null ? (byte) (bArr[f2272 + i10] + i13) : (short) (f2273[f2272 + i10] + i13);
            }
            if (i14 > 0) {
                o.f2994 = ((i10 + i14) - 2) + f2272 + (z10 ? 1 : 0);
                o.f2995 = b10;
                char c10 = (char) (i11 + f2275);
                o.f2997 = c10;
                sb2.append(c10);
                o.f2996 = o.f2997;
                o.f2998 = 1;
                while (o.f2998 < i14) {
                    byte[] bArr2 = f2276;
                    if (bArr2 != null) {
                        int i15 = o.f2994;
                        o.f2994 = i15 - 1;
                        o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i15] + s10)) ^ o.f2995));
                    } else {
                        short[] sArr = f2273;
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
        int i10 = f2271 + 17;
        f2270 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m2240((-1396974204) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 105), (ViewConfiguration.getFadingEdgeLength() >> 16) + 184600475, (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 114), KeyEvent.getDeadChar(0, 0) - 123).intern();
        int i12 = f2270 + 5;
        f2271 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo2200() {
        int i10 = f2271;
        int i11 = i10 + 63;
        f2270 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 111;
        f2270 = i13 % 128;
        int i14 = i13 % 2;
        return UnityServices.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo2201() {
        int i10 = f2271 + 103;
        f2270 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m2240(TextUtils.getTrimmedLength("") - 1396974171, (short) ((Process.myTid() >> 22) - 56), 184600493 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) (TextUtils.lastIndexOf("", '0', 0) - 102), (ViewConfiguration.getEdgeSlop() >> 16) - 123).intern();
        int i12 = f2271 + 17;
        f2270 = i12 % 128;
        int i13 = i12 % 2;
        return strIntern;
    }
}
