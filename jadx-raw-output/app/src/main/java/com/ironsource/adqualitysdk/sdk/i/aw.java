package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class aw {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f565 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static boolean f566 = true;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f568 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static boolean f569 = true;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f571 = 196;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private List<String> f572;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private d f573;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f574;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f570 = {312, 317, 308, 297, 306, 313, 304, 265, 310, 307, 228, 301, 311, 300, 296, 264, 293, 294};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int[] f567 = {-249871222, 1447174715, 197520244, 1648896034, 317761997, -1233006717, -2034892610, -1853135002, -27184752, 502131792, -1648048931, -708895012, 815181033, 991412463, -1453478111, 1046018402, 55339931, -1757561124};

    public enum d {
        f584,
        f583,
        f586,
        f587;


        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private static int f576 = 0;

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private static int f577 = 1;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f578;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static byte[] f579;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f580;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static short[] f581;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f582;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public static void m660() {
            f580 = -1552642572;
            f578 = 107;
            f582 = 736639886;
            f579 = new byte[]{-104, 0, 11, -102, -17, 7, 13, 1, -102, 8, 3, 7, 3, -102, 17, 2, -23, 19};
        }

        public static d valueOf(String str) {
            int i10 = f576 + 77;
            f577 = i10 % 128;
            int i11 = i10 % 2;
            d dVar = (d) Enum.valueOf(d.class, str);
            int i12 = f577 + 105;
            f576 = i12 % 128;
            if ((i12 % 2 != 0 ? ']' : '-') == '-') {
                return dVar;
            }
            throw null;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            int i10 = f577 + 97;
            f576 = i10 % 128;
            int i11 = i10 % 2;
            d[] dVarArr = (d[]) values().clone();
            int i12 = f576 + 117;
            f577 = i12 % 128;
            if ((i12 % 2 == 0 ? '^' : 'G') != '^') {
                return dVarArr;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m659(int i10, short s10, int i11, byte b10, int i12) {
            String string;
            synchronized (o.f2993) {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f578;
                int i14 = i12 + i13;
                boolean z10 = i14 == -1;
                if (z10) {
                    byte[] bArr = f579;
                    i14 = bArr != null ? (byte) (bArr[f580 + i10] + i13) : (short) (f581[f580 + i10] + i13);
                }
                if (i14 > 0) {
                    o.f2994 = ((i10 + i14) - 2) + f580 + (z10 ? 1 : 0);
                    o.f2995 = b10;
                    char c10 = (char) (i11 + f582);
                    o.f2997 = c10;
                    sb2.append(c10);
                    o.f2996 = o.f2997;
                    o.f2998 = 1;
                    while (o.f2998 < i14) {
                        byte[] bArr2 = f579;
                        if (bArr2 != null) {
                            int i15 = o.f2994;
                            o.f2994 = i15 - 1;
                            o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i15] + s10)) ^ o.f2995));
                        } else {
                            short[] sArr = f581;
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

        static {
            m660();
            int i10 = f576 + 63;
            f577 = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static d m653(String str) {
        byte b10 = -1;
        int iHashCode = str.hashCode();
        if (iHashCode == 92611485) {
            if ((str.equals(m656(new int[]{193453761, -1454093780, -47264438, -1708937903}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5).intern()) ? 'N' : '1') == 'N') {
                int i10 = f568 + 7;
                int i11 = i10 % 128;
                f565 = i11;
                int i12 = i10 % 2;
                int i13 = i11 + 109;
                f568 = i13 % 128;
                int i14 = i13 % 2;
            }
        } else if (iHashCode == 93621297) {
            if (!(str.equals(m656(new int[]{-1552137562, -558820683, -1114080678, 905784149}, 5 - View.getDefaultSize(0, 0)).intern()) ? false : true)) {
                int i15 = f568 + 81;
                f565 = i15 % 128;
                int i16 = i15 % 2;
                b10 = 2;
            }
        } else if (iHashCode == 96946943 && str.equals(m656(new int[]{250876728, 1791501912, -1821617039, -934304173}, 5 - (Process.myTid() >> 22)).intern())) {
            int i17 = f568 + 27;
            f565 = i17 % 128;
            b10 = i17 % 2 == 0 ? (byte) 1 : (byte) 0;
        }
        if (b10 == 0) {
            d dVar = d.f587;
            int i18 = f568 + 59;
            f565 = i18 % 128;
            if ((i18 % 2 == 0 ? 'T' : 'V') == 'V') {
                return dVar;
            }
            throw null;
        }
        if (b10 != 1) {
            return b10 != 2 ? d.f584 : d.f586;
        }
        d dVar2 = d.f583;
        int i19 = f565 + 9;
        f568 = i19 % 128;
        int i20 = i19 % 2;
        return dVar2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static List<String> m655(String str) {
        ArrayList arrayList = new ArrayList();
        if ((!TextUtils.isEmpty(str) ? (char) 26 : '\r') != 26) {
            return arrayList;
        }
        int i10 = f568 + 73;
        f565 = i10 % 128;
        List<String> listAsList = i10 % 2 == 0 ? Arrays.asList(str.split(m656(new int[]{-231744396, -1523333307}, 1 >>> TextUtils.getOffsetBefore("", 1)).intern())) : Arrays.asList(str.split(m656(new int[]{-231744396, -1523333307}, TextUtils.getOffsetBefore("", 0) + 1).intern()));
        int i11 = f568 + 69;
        f565 = i11 % 128;
        int i12 = i11 % 2;
        return listAsList;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m658(String str) {
        try {
            int i10 = AnonymousClass4.f575[this.f573.ordinal()];
            if (i10 == 1) {
                return true;
            }
            if (i10 == 2) {
                boolean zContains = this.f572.contains(str);
                int i11 = f565 + 79;
                f568 = i11 % 128;
                if (!(i11 % 2 != 0)) {
                    return zContains;
                }
                throw null;
            }
            if (i10 != 3) {
                if (i10 != 4) {
                }
                return false;
            }
            if (this.f572.size() > 0) {
                if ((kc.m2859(str, this.f572.get(0)) < 0 ? '.' : (char) 22) == '.') {
                    return true;
                }
                int i12 = f568 + 63;
                f565 = i12 % 128;
                int i13 = i12 % 2;
                return false;
            }
            if (this.f572.size() > 0) {
                int i14 = f565 + 63;
                f568 = i14 % 128;
                int i15 = i14 % 2;
                if (kc.m2859(str, this.f572.get(0)) < 0) {
                    return false;
                }
                int i16 = f565 + 73;
                f568 = i16 % 128;
                return i16 % 2 == 0;
            }
            return false;
        } catch (Exception e10) {
            kd.m2872(m656(new int[]{-1666146046, 95630002, -1547939219, 180157551, -583088506, -2015564159, -58690802, -1335806337, 455296167, 1181227952, -1041048927, -1438469512}, AndroidCharacter.getMirror('0') - 26).intern(), m654(null, KeyEvent.keyCodeFromString("") + 127, null, "\u0084\u0087\u0092\u0091\u008d\u008c\u0090\u008f\u0087\u0086\u008a\u008e\u008d\u008b\u0085\u008c\u008b\u0089\u008a\u0089\u0089\u0088").intern(), e10, false);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.aw$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public static final /* synthetic */ int[] f575;

        static {
            int[] iArr = new int[d.valuesCustom().length];
            f575 = iArr;
            try {
                iArr[d.f584.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f575[d.f587.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f575[d.f586.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f575[d.f583.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public aw(JSONObject jSONObject) {
        this.f573 = m653(jSONObject.optString(m654(null, 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), null, "\u0084\u0083\u0082\u0081").intern()));
        this.f572 = m655(jSONObject.optString(m656(new int[]{1677581700, 1568689871}, 2 - Color.green(0)).intern()));
        this.f574 = m652(jSONObject.optString(m656(new int[]{-1679930329, 672363503, 1731016771, -1658967260}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 6).intern()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r5.equals(m654(null, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 127, null, "\u0087\u0087\u0086\u0085").intern()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r1 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        return r5;
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String m652(java.lang.String r5) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            r3 = 0
            if (r0 == r1) goto L58
            int r0 = com.ironsource.adqualitysdk.sdk.i.aw.f568
            int r0 = r0 + 31
            int r4 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.aw.f565 = r4
            int r0 = r0 % 2
            if (r0 != 0) goto L1c
            r0 = r2
            goto L1d
        L1c:
            r0 = r1
        L1d:
            java.lang.String r4 = "\u0087\u0087\u0086\u0085"
            if (r0 == 0) goto L3a
            int r0 = android.os.Process.getThreadPriority(r2)
            int r0 = r0 + 20
            int r0 = r0 >> 6
            int r0 = r0 + 127
            java.lang.String r0 = m654(r3, r0, r3, r4)
            java.lang.String r0 = r0.intern()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L57
            goto L58
        L3a:
            int r0 = android.os.Process.getThreadPriority(r2)
            int r0 = r0 + 88
            int r0 = r0 + (-56)
            int r0 = 85 - r0
            java.lang.String r0 = m654(r3, r0, r3, r4)
            java.lang.String r0 = r0.intern()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L53
            goto L54
        L53:
            r1 = r2
        L54:
            if (r1 == 0) goto L57
            goto L58
        L57:
            return r5
        L58:
            int r5 = com.ironsource.adqualitysdk.sdk.i.aw.f565
            int r5 = r5 + 83
            int r0 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.aw.f568 = r0
            int r5 = r5 % 2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.aw.m652(java.lang.String):java.lang.String");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m657() {
        int i10 = f565;
        int i11 = i10 + 1;
        f568 = i11 % 128;
        int i12 = i11 % 2;
        String str = this.f574;
        int i13 = i10 + 17;
        f568 = i13 % 128;
        int i14 = i13 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m654(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f570;
            int i11 = f571;
            if (f566) {
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
            if (f569) {
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m656(int[] iArr, int i10) {
        String str;
        synchronized (e.f1912) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f567.clone();
            e.f1913 = 0;
            while (true) {
                int i11 = e.f1913;
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
                    e.f1915 = (c10 << 16) + c11;
                    e.f1914 = (c12 << 16) + c13;
                    e.m2135(iArr2);
                    for (int i13 = 0; i13 < 16; i13++) {
                        int i14 = e.f1915 ^ iArr2[i13];
                        e.f1915 = i14;
                        e.f1914 = e.m2134(i14) ^ e.f1914;
                        int i15 = e.f1915;
                        e.f1915 = e.f1914;
                        e.f1914 = i15;
                    }
                    int i16 = e.f1915;
                    e.f1915 = e.f1914;
                    e.f1914 = i16;
                    e.f1914 = i16 ^ iArr2[16];
                    e.f1915 ^= iArr2[17];
                    int i17 = e.f1913;
                    int i18 = e.f1915;
                    cArr[0] = (char) (i18 >>> 16);
                    cArr[1] = (char) i18;
                    int i19 = e.f1914;
                    cArr[2] = (char) (i19 >>> 16);
                    cArr[3] = (char) i19;
                    e.m2135(iArr2);
                    int i20 = e.f1913;
                    cArr2[i20 << 1] = cArr[0];
                    cArr2[(i20 << 1) + 1] = cArr[1];
                    cArr2[(i20 << 1) + 2] = cArr[2];
                    cArr2[(i20 << 1) + 3] = cArr[3];
                    e.f1913 = i20 + 2;
                } else {
                    str = new String(cArr2, 0, i10);
                }
            }
        }
        return str;
    }
}
