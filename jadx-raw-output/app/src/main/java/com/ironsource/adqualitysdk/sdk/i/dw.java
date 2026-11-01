package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.util.TypedValue;
import com.ironsource.G5;

/* JADX INFO: loaded from: classes7.dex */
public final class dw extends ed {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1881 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1882 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1883 = 2;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1884 = {' ', G5.T, '!', '\"'};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ed f1885;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ek f1886;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (r2.equals(r6.f1886) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if ((r6.f1886 != null ? '2' : 'E') != '2') goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        r2 = r5.f1885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r2 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        r6 = r6.f1885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (r3 == true) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
    
        return r2.equals(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        if (r6 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0065, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0066, code lost:
    
        if (r6 == true) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0068, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0069, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006a, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto Le
            int r6 = com.ironsource.adqualitysdk.sdk.i.dw.f1882
            int r6 = r6 + 45
            int r1 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.dw.f1881 = r1
            int r6 = r6 % 2
            return r0
        Le:
            r1 = 0
            if (r6 == 0) goto L6b
            int r2 = com.ironsource.adqualitysdk.sdk.i.dw.f1882
            int r2 = r2 + 87
            int r3 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.dw.f1881 = r3
            int r2 = r2 % 2
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.dw> r2 = com.ironsource.adqualitysdk.sdk.i.dw.class
            java.lang.Class r3 = r6.getClass()
            r4 = 82
            if (r2 == r3) goto L28
            r2 = 80
            goto L29
        L28:
            r2 = r4
        L29:
            if (r2 == r4) goto L2c
            goto L6b
        L2c:
            com.ironsource.adqualitysdk.sdk.i.dw r6 = (com.ironsource.adqualitysdk.sdk.i.dw) r6
            com.ironsource.adqualitysdk.sdk.i.ek r2 = r5.f1886
            if (r2 == 0) goto L45
            int r3 = com.ironsource.adqualitysdk.sdk.i.dw.f1882
            int r3 = r3 + 115
            int r4 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.dw.f1881 = r4
            int r3 = r3 % 2
            com.ironsource.adqualitysdk.sdk.i.ek r3 = r6.f1886
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L51
            goto L6a
        L45:
            com.ironsource.adqualitysdk.sdk.i.ek r2 = r6.f1886
            r3 = 50
            if (r2 == 0) goto L4d
            r2 = r3
            goto L4f
        L4d:
            r2 = 69
        L4f:
            if (r2 == r3) goto L6a
        L51:
            com.ironsource.adqualitysdk.sdk.i.ed r2 = r5.f1885
            if (r2 == 0) goto L57
            r3 = r1
            goto L58
        L57:
            r3 = r0
        L58:
            com.ironsource.adqualitysdk.sdk.i.ed r6 = r6.f1885
            if (r3 == r0) goto L61
            boolean r6 = r2.equals(r6)
            return r6
        L61:
            if (r6 != 0) goto L65
            r6 = r0
            goto L66
        L65:
            r6 = r1
        L66:
            if (r6 == r0) goto L69
            return r1
        L69:
            return r0
        L6a:
            return r1
        L6b:
            int r6 = com.ironsource.adqualitysdk.sdk.i.dw.f1881
            int r6 = r6 + 113
            int r0 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.dw.f1882 = r0
            int r6 = r6 % 2
            if (r6 != 0) goto L78
            return r1
        L78:
            r6 = 0
            throw r6     // Catch: java.lang.Throwable -> L7a
        L7a:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dw.equals(java.lang.Object):boolean");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo2113(du duVar, cq cqVar) {
        int i10 = f1882 + 47;
        f1881 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            duVar.m2109(this.f1886.m2163(), this.f1885.m2146(duVar, cqVar).m2089());
            throw null;
        }
        dr drVarM2146 = this.f1885.m2146(duVar, cqVar);
        duVar.m2109(this.f1886.m2163(), drVarM2146.m2089());
        int i11 = f1882 + 7;
        f1881 = i11 % 128;
        int i12 = i11 % 2;
        return drVarM2146;
    }

    public final int hashCode() {
        int iHashCode;
        ek ekVar = this.f1886;
        if ((ekVar != null ? '7' : ' ') != ' ') {
            iHashCode = ekVar.hashCode();
        } else {
            int i10 = f1882 + 97;
            f1881 = i10 % 128;
            int i11 = i10 % 2;
            iHashCode = 0;
        }
        int i12 = iHashCode * 31;
        ed edVar = this.f1885;
        int iHashCode2 = i12 + ((edVar != null ? '.' : (char) 11) == '.' ? edVar.hashCode() : 0);
        int i13 = f1882 + 93;
        f1881 = i13 % 128;
        if (i13 % 2 != 0) {
            return iHashCode2;
        }
        throw null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1886);
        sb2.append(m2114("\u0001\u0000\u0084", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3, (byte) (101 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern());
        sb2.append(this.f1885);
        String string = sb2.toString();
        int i10 = f1882 + 21;
        f1881 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 5 : '\f') == '\f') {
            return string;
        }
        int i11 = 18 / 0;
        return string;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final ek m2115() {
        int i10 = f1882;
        int i11 = i10 + 47;
        f1881 = i11 % 128;
        int i12 = i11 % 2;
        ek ekVar = this.f1886;
        int i13 = i10 + 65;
        f1881 = i13 % 128;
        if ((i13 % 2 == 0 ? (char) 30 : '%') != 30) {
            return ekVar;
        }
        throw null;
    }

    public dw(ek ekVar, ed edVar, dm dmVar) {
        super(dmVar);
        this.f1886 = ekVar;
        this.f1885 = edVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2114(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2129) {
            char[] cArr2 = f1884;
            char c10 = f1883;
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
}
