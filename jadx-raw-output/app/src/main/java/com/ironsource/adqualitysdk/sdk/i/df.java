package com.ironsource.adqualitysdk.sdk.i;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class df extends cz {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f1679 = 54888;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f1680 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1681 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1682 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1683 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Object m1881(cq cqVar, List<Object> list, du duVar) {
        int i10 = f1683 + 123;
        f1681 = i10 % 128;
        int i11 = i10 % 2;
        t.m3000(m1884(cqVar, list, duVar));
        int i12 = f1681 + 41;
        f1683 = i12 % 128;
        if ((i12 % 2 == 0 ? 'M' : 'U') != 'M') {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if ((com.ironsource.adqualitysdk.sdk.i.cz.m1850(r8, 0, com.ironsource.adqualitysdk.sdk.i.ir.class)) != true) goto L18;
     */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ironsource.adqualitysdk.sdk.i.ir m1884(final com.ironsource.adqualitysdk.sdk.i.cq r7, java.util.List<java.lang.Object> r8, final com.ironsource.adqualitysdk.sdk.i.du r9) {
        /*
            r6 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.df.f1681
            int r0 = r0 + 43
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.df.f1683 = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 92
            if (r0 != 0) goto L10
            r0 = r2
            goto L12
        L10:
            r0 = 57
        L12:
            r3 = 1
            r4 = 0
            if (r0 == r2) goto L21
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.ir> r0 = com.ironsource.adqualitysdk.sdk.i.ir.class
            boolean r0 = com.ironsource.adqualitysdk.sdk.i.cz.m1850(r8, r4, r0)     // Catch: java.lang.Exception -> L1f
            if (r0 == 0) goto L2e
            goto L64
        L1f:
            r8 = move-exception
            goto L6d
        L21:
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.ir> r0 = com.ironsource.adqualitysdk.sdk.i.ir.class
            boolean r0 = com.ironsource.adqualitysdk.sdk.i.cz.m1850(r8, r4, r0)     // Catch: java.lang.Exception -> L1f
            if (r0 == 0) goto L2b
            r0 = r3
            goto L2c
        L2b:
            r0 = r4
        L2c:
            if (r0 == r3) goto L64
        L2e:
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.ds> r0 = com.ironsource.adqualitysdk.sdk.i.ds.class
            java.lang.Object r0 = com.ironsource.adqualitysdk.sdk.i.cz.m1851(r8, r4, r0)     // Catch: java.lang.Exception -> L1f
            com.ironsource.adqualitysdk.sdk.i.ds r0 = (com.ironsource.adqualitysdk.sdk.i.ds) r0     // Catch: java.lang.Exception -> L1f
            int r2 = r8.size()     // Catch: java.lang.Exception -> L1f
            if (r2 <= r1) goto L5a
            int r2 = com.ironsource.adqualitysdk.sdk.i.df.f1683
            int r2 = r2 + 39
            int r5 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.df.f1681 = r5
            int r2 = r2 % r1
            if (r2 == 0) goto L4d
            r2 = 5
            java.util.List r8 = com.ironsource.adqualitysdk.sdk.i.cz.m1853(r8, r2)     // Catch: java.lang.Exception -> L1f
            goto L51
        L4d:
            java.util.List r8 = com.ironsource.adqualitysdk.sdk.i.cz.m1853(r8, r1)     // Catch: java.lang.Exception -> L1f
        L51:
            int r2 = com.ironsource.adqualitysdk.sdk.i.df.f1683
            int r2 = r2 + r3
            int r3 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.df.f1681 = r3
            int r2 = r2 % r1
            goto L5e
        L5a:
            java.util.List r8 = com.ironsource.adqualitysdk.sdk.i.cz.m1853(r8, r3)     // Catch: java.lang.Exception -> L1f
        L5e:
            com.ironsource.adqualitysdk.sdk.i.df$3 r1 = new com.ironsource.adqualitysdk.sdk.i.df$3     // Catch: java.lang.Exception -> L1f
            r1.<init>()     // Catch: java.lang.Exception -> L1f
            return r1
        L64:
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.ir> r9 = com.ironsource.adqualitysdk.sdk.i.ir.class
            java.lang.Object r8 = com.ironsource.adqualitysdk.sdk.i.cz.m1851(r8, r4, r9)     // Catch: java.lang.Exception -> L1f
            com.ironsource.adqualitysdk.sdk.i.ir r8 = (com.ironsource.adqualitysdk.sdk.i.ir) r8     // Catch: java.lang.Exception -> L1f
            return r8
        L6d:
            java.lang.String r7 = r7.m1683()
            r9 = 54805(0xd615, float:7.6798E-41)
            r0 = 48
            java.lang.String r1 = ""
            int r0 = android.text.TextUtils.indexOf(r1, r0, r4)
            int r9 = r9 - r0
            char r9 = (char) r9
            int r0 = android.text.TextUtils.indexOf(r1, r1, r4)
            java.lang.String r1 = "蒶䘪䀶ᐏ�짖ᕁ曜闆蟿㝀Ꮀꤦ塭륃\u0dbcಮ郝鲥ꛆ\ue95f\ua879ϱ낶螾钅㋒䮢ä빊"
            java.lang.String r2 = "\u0000\u0000\u0000\u0000"
            java.lang.String r3 = "㨬癐\u169f\ue1d6"
            java.lang.String r9 = m1877(r1, r9, r2, r0, r3)
            java.lang.String r9 = r9.intern()
            com.ironsource.adqualitysdk.sdk.i.co.m1623(r7, r9, r8)
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.df.m1884(com.ironsource.adqualitysdk.sdk.i.cq, java.util.List, com.ironsource.adqualitysdk.sdk.i.du):com.ironsource.adqualitysdk.sdk.i.ir");
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final Object m1879(cq cqVar, List<Object> list, du duVar) {
        int i10 = f1683 + 109;
        f1681 = i10 % 128;
        int i11 = i10 % 2;
        t.m2996(m1884(cqVar, list, duVar), m1878(list));
        int i12 = f1683 + 63;
        f1681 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 31 : (char) 29) == 29) {
            return null;
        }
        int i13 = 70 / 0;
        return null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final Object m1880(cq cqVar, List<Object> list, du duVar) {
        int i10 = f1681 + 45;
        f1683 = i10 % 128;
        if ((i10 % 2 == 0 ? 'V' : '@') == '@') {
            t.m2995(m1884(cqVar, list, duVar));
            return null;
        }
        t.m2995(m1884(cqVar, list, duVar));
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Object m1882(cq cqVar, List<Object> list, du duVar) {
        int i10 = f1681 + 9;
        f1683 = i10 % 128;
        int i11 = i10 % 2;
        t.m2994(m1884(cqVar, list, duVar), m1878(list));
        int i12 = f1683 + 113;
        f1681 = i12 % 128;
        if (i12 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Object m1883(cq cqVar, List<Object> list, du duVar) {
        int i10 = f1681 + 63;
        f1683 = i10 % 128;
        int i11 = i10 % 2;
        t.m2993(m1884(cqVar, list, duVar));
        int i12 = f1681 + 89;
        f1683 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 27 : 'T') == 'T') {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Object m1885(cq cqVar, List<Object> list, du duVar) {
        int i10 = f1683 + 77;
        f1681 = i10 % 128;
        int i11 = i10 % 2;
        t.m2991(m1884(cqVar, list, duVar));
        int i12 = f1681 + 125;
        f1683 = i12 % 128;
        int i13 = i12 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1877(String str, char c10, String str2, int i10, String str3) {
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
                    cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f1680) ^ ((long) f1682)) ^ ((long) f1679));
                    j.f2675 = i15 + 1;
                } else {
                    str4 = new String(cArr6);
                }
            }
        }
        return str4;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f A[PHI: r6
  0x002f: PHI (r6v2 long) = (r6v0 long), (r6v3 long) binds: [B:15:0x002d, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long m1878(List<Object> list) {
        long j10;
        int iIntValue;
        int i10 = f1683 + 5;
        f1681 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 23 : (char) 2) != 23) {
            j10 = 0;
            if ((list.size() > 1 ? (char) 16 : '<') == 16) {
                if (cz.m1850(list, 1, Integer.class)) {
                    iIntValue = ((Integer) cz.m1851(list, 1, Integer.class)).intValue();
                }
            }
            return iIntValue;
        }
        j10 = 1;
        if (list.size() > 0) {
            if (cz.m1850(list, 1, Integer.class)) {
                iIntValue = ((Integer) cz.m1851(list, 1, Integer.class)).intValue();
            }
        }
        return iIntValue;
        if ((list.size() <= 2 ? (char) 21 : (char) 16) == 21) {
            return j10;
        }
        int i11 = f1683 + 21;
        f1681 = i11 % 128;
        int i12 = i11 % 2;
        iIntValue = ((Integer) cz.m1851(list, 2, Integer.class)).intValue();
        return iIntValue;
    }
}
