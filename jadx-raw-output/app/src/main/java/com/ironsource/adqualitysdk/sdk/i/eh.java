package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class eh extends ed {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1954 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1955 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f1956 = 34869;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1957 = 36419;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1958 = 13667;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f1959 = 55957;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ed f1960;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2158(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (n.f2992) {
            char[] cArr2 = new char[cArr.length];
            n.f2991 = 0;
            char[] cArr3 = new char[2];
            while (true) {
                int i11 = n.f2991;
                if (i11 < cArr.length) {
                    cArr3[0] = cArr[i11];
                    cArr3[1] = cArr[i11 + 1];
                    int i12 = 58224;
                    for (int i13 = 0; i13 < 16; i13++) {
                        char c10 = cArr3[1];
                        char c11 = cArr3[0];
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f1957)) ^ ((c11 >>> 5) + f1958)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f1956) ^ ((c12 + i12) ^ ((c12 << 4) + f1959))));
                        i12 -= 40503;
                    }
                    int i14 = n.f2991;
                    cArr2[i14] = cArr3[0];
                    cArr2[i14 + 1] = cArr3[1];
                    n.f2991 = i14 + 2;
                } else {
                    str2 = new String(cArr2, 0, i10);
                }
            }
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        if (r6 == r7) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
    
        r0 = r0 + 115;
        com.ironsource.adqualitysdk.sdk.i.eh.f1954 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
    
        if (r7 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        r1 = 'c';
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        r1 = '\t';
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r1 == '\t') goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        r2 = r2 + 97;
        com.ironsource.adqualitysdk.sdk.i.eh.f1955 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.eh.class == r7.getClass()) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        r7 = (com.ironsource.adqualitysdk.sdk.i.eh) r7;
        r0 = r6.f1960;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
    
        r2 = 'U';
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        r2 = '$';
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        if (r2 == 'U') goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0053, code lost:
    
        if (r7.f1960 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.eh.f1954 + 1;
        com.ironsource.adqualitysdk.sdk.i.eh.f1955 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
    
        if ((r1 % 2) == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0068, code lost:
    
        return r0.equals(r7.f1960);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0069, code lost:
    
        r0.equals(r7.f1960);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0072, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if ((r6 == r7 ? 'a' : 'R') != 'a') goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.eh.f1955
            int r1 = r0 + 89
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.eh.f1954 = r2
            int r1 = r1 % 2
            r3 = 97
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L1e
            r1 = 90
            int r1 = r1 / r5
            if (r6 != r7) goto L17
            r1 = r3
            goto L19
        L17:
            r1 = 82
        L19:
            if (r1 == r3) goto L20
            goto L29
        L1c:
            r7 = move-exception
            throw r7
        L1e:
            if (r6 != r7) goto L29
        L20:
            int r0 = r0 + 115
            int r7 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.eh.f1954 = r7
            int r0 = r0 % 2
            return r4
        L29:
            r0 = 9
            if (r7 == 0) goto L30
            r1 = 99
            goto L31
        L30:
            r1 = r0
        L31:
            if (r1 == r0) goto L72
            int r2 = r2 + r3
            int r0 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.eh.f1955 = r0
            int r2 = r2 % 2
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.eh> r0 = com.ironsource.adqualitysdk.sdk.i.eh.class
            java.lang.Class r1 = r7.getClass()
            if (r0 == r1) goto L43
            goto L72
        L43:
            com.ironsource.adqualitysdk.sdk.i.eh r7 = (com.ironsource.adqualitysdk.sdk.i.eh) r7
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r6.f1960
            r1 = 85
            if (r0 == 0) goto L4d
            r2 = r1
            goto L4f
        L4d:
            r2 = 36
        L4f:
            if (r2 == r1) goto L57
            com.ironsource.adqualitysdk.sdk.i.ed r7 = r7.f1960
            if (r7 != 0) goto L56
            return r4
        L56:
            return r5
        L57:
            int r1 = com.ironsource.adqualitysdk.sdk.i.eh.f1954
            int r1 = r1 + r4
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.eh.f1955 = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L69
            com.ironsource.adqualitysdk.sdk.i.ed r7 = r7.f1960
            boolean r7 = r0.equals(r7)
            return r7
        L69:
            com.ironsource.adqualitysdk.sdk.i.ed r7 = r7.f1960
            r0.equals(r7)
            r7 = 0
            throw r7     // Catch: java.lang.Throwable -> L70
        L70:
            r7 = move-exception
            throw r7
        L72:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.eh.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ed edVar = this.f1960;
        if ((edVar != null ? '2' : 'T') != '2') {
            int i10 = f1955 + 27;
            f1954 = i10 % 128;
            int i11 = i10 % 2;
            return 0;
        }
        int i12 = f1954 + 39;
        f1955 = i12 % 128;
        int i13 = i12 % 2;
        return edVar.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2158("骒戮", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1).intern());
        sb2.append(this.f1960);
        sb2.append(m2158("핮\ueab8", 1 - TextUtils.getOffsetBefore("", 0)).intern());
        String string = sb2.toString();
        int i10 = f1955 + 37;
        f1954 = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo2113(du duVar, cq cqVar) {
        int i10 = f1954 + 3;
        f1955 = i10 % 128;
        int i11 = i10 % 2;
        dr drVarM2146 = this.f1960.m2146(duVar, cqVar);
        int i12 = f1954 + 113;
        f1955 = i12 % 128;
        int i13 = i12 % 2;
        return drVarM2146;
    }

    public eh(ed edVar, dm dmVar) {
        super(dmVar);
        this.f1960 = edVar;
    }
}
