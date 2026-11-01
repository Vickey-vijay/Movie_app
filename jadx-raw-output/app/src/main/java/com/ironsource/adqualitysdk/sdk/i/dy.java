package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes7.dex */
public final class dy {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1891 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1892 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f1893 = -4020653531021365266L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1894 = {':'};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1895;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private d f1896;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private int f1897;

    public enum d {
        f1908,
        f1910,
        f1906,
        f1909,
        f1907,
        f1905,
        f1902,
        f1904;


        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private static long f1898 = 0;

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private static int f1899 = 0;

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private static int f1900 = 1;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static char[] f1903;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public static void m2131() {
            f1903 = new char[]{'K', 27119, 54029, 15529, 42727, 4096, 31160, 'I', 27118, 54033, 15536, 42748, 4123, 31162, 58351, 19733, 46760, 'O', 27130, 54033, 15532, 42729, 4102, 31155, 58356, 35968, 58669, 24533, 45156, 10805, 40134, 'I', 27108, 54016, 15547, 42735, 4119, 31150, 'D', 27109, 54017, 15548, 42724, 4119, 10707, 16500, 64138, 5411, 36732, 14722, 20515, 12478, 22811, 58344, 3152, 38406};
            f1898 = 5818881436904352170L;
        }

        public static d valueOf(String str) {
            int i10 = f1900 + 63;
            f1899 = i10 % 128;
            if ((i10 % 2 != 0 ? (char) 20 : (char) 21) == 21) {
                return (d) Enum.valueOf(d.class, str);
            }
            Enum.valueOf(d.class, str);
            throw null;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            int i10 = f1900 + 3;
            f1899 = i10 % 128;
            int i11 = i10 % 2;
            d[] dVarArr = (d[]) values().clone();
            int i12 = f1900 + 29;
            f1899 = i12 % 128;
            int i13 = i12 % 2;
            return dVarArr;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m2132(int i10, char c10, int i11) {
            String str;
            synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1653) {
                char[] cArr = new char[i11];
                com.ironsource.adqualitysdk.sdk.i.d.f1652 = 0;
                while (true) {
                    int i12 = com.ironsource.adqualitysdk.sdk.i.d.f1652;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f1903[i10 + i12]) ^ (((long) i12) * f1898)) ^ ((long) c10));
                        com.ironsource.adqualitysdk.sdk.i.d.f1652 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            }
            return str;
        }

        static {
            m2131();
            int i10 = f1900 + 47;
            f1899 = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m2130(String str) {
        int i10 = f1892 + 13;
        f1891 = i10 % 128;
        int i11 = i10 % 2;
        boolean zEquals = this.f1895.equals(str);
        int i12 = f1891 + 95;
        f1892 = i12 % 128;
        if ((i12 % 2 != 0 ? 'O' : 'T') != 'O') {
            return zEquals;
        }
        throw null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1896);
        sb2.append(m2117(ViewConfiguration.getTapTimeout() >> 16, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1 - View.resolveSize(0, 0)).intern());
        sb2.append(this.f1895);
        String string = sb2.toString();
        int i10 = f1891 + 87;
        f1892 = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public final boolean m2118() {
        int i10 = f1891 + 69;
        f1892 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            m2126();
            d dVar = d.f1908;
            throw null;
        }
        if (m2126() == d.f1908) {
            return true;
        }
        int i11 = f1892 + 49;
        f1891 = i11 % 128;
        if (i11 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public final boolean m2119() {
        int i10 = f1892 + 79;
        f1891 = i10 % 128;
        if (i10 % 2 == 0) {
            m2126();
            d dVar = d.f1908;
            throw null;
        }
        if (!(m2126() == d.f1910)) {
            return false;
        }
        int i11 = f1891 + 7;
        f1892 = i11 % 128;
        int i12 = i11 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m2121() {
        int i10 = f1891 + 77;
        f1892 = i10 % 128;
        int i11 = i10 % 2;
        if ((m2126() == d.f1906 ? (char) 7 : '@') != '@') {
            int i12 = f1892 + 59;
            f1891 = i12 % 128;
            int i13 = i12 % 2;
            return true;
        }
        int i14 = f1892 + 33;
        f1891 = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if ((m2126() != com.ironsource.adqualitysdk.sdk.i.dy.d.f1905) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
    
        if (m2126() == com.ironsource.adqualitysdk.sdk.i.dy.d.f1905) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.dy.f1892 + 9;
        com.ironsource.adqualitysdk.sdk.i.dy.f1891 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2122() {
        /*
            r5 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.dy.f1892
            int r0 = r0 + 105
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dy.f1891 = r1
            int r0 = r0 % 2
            r1 = 79
            if (r0 != 0) goto L11
            r0 = 49
            goto L12
        L11:
            r0 = r1
        L12:
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L29
            com.ironsource.adqualitysdk.sdk.i.dy$d r0 = r5.m2126()
            com.ironsource.adqualitysdk.sdk.i.dy$d r1 = com.ironsource.adqualitysdk.sdk.i.dy.d.f1905
            r4 = 87
            int r4 = r4 / r3
            if (r0 != r1) goto L23
            r0 = r3
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 == 0) goto L31
            goto L3c
        L27:
            r0 = move-exception
            throw r0
        L29:
            com.ironsource.adqualitysdk.sdk.i.dy$d r0 = r5.m2126()
            com.ironsource.adqualitysdk.sdk.i.dy$d r1 = com.ironsource.adqualitysdk.sdk.i.dy.d.f1905
            if (r0 != r1) goto L3c
        L31:
            int r0 = com.ironsource.adqualitysdk.sdk.i.dy.f1892
            int r0 = r0 + 9
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dy.f1891 = r1
            int r0 = r0 % 2
            return r2
        L3c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dy.m2122():boolean");
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final boolean m2123() {
        int i10 = f1892 + 21;
        f1891 = i10 % 128;
        if (i10 % 2 != 0) {
            if ((m2126() == d.f1904 ? ']' : (char) 26) != ']') {
                return false;
            }
            int i11 = f1892 + 19;
            f1891 = i11 % 128;
            return i11 % 2 != 0;
        }
        m2126();
        d dVar = d.f1908;
        try {
            throw null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final boolean m2124() {
        int i10 = f1892 + 99;
        f1891 = i10 % 128;
        int i11 = i10 % 2;
        if (!(m2126() != d.f1907)) {
            return true;
        }
        int i12 = f1891 + 11;
        f1892 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 14 : '\r') != 14) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m2125() {
        int i10 = f1891 + 105;
        f1892 = i10 % 128;
        int i11 = i10 % 2;
        if (!m2129()) {
            int i12 = f1892 + 73;
            f1891 = i12 % 128;
            int i13 = i12 % 2;
            if (!(m2124())) {
                if ((!m2122() ? '\r' : (char) 27) == '\r') {
                    int i14 = f1891 + 19;
                    f1892 = i14 % 128;
                    if (i14 % 2 != 0) {
                        m2120();
                        throw null;
                    }
                    if ((m2120() ? (char) 25 : (char) 26) == 26) {
                        return false;
                    }
                }
            }
        }
        int i15 = f1892 + 19;
        f1891 = i15 % 128;
        int i16 = i15 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final d m2126() {
        int i10 = f1892;
        int i11 = i10 + 105;
        f1891 = i11 % 128;
        if (!(i11 % 2 != 0)) {
            throw null;
        }
        d dVar = this.f1896;
        int i12 = i10 + 81;
        f1891 = i12 % 128;
        if ((i12 % 2 == 0 ? '+' : '`') == '`') {
            return dVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m2127() {
        int i10 = f1892 + 69;
        int i11 = i10 % 128;
        f1891 = i11;
        int i12 = i10 % 2;
        String str = this.f1895;
        int i13 = i11 + 97;
        f1892 = i13 % 128;
        if ((i13 % 2 != 0 ? '@' : ' ') == ' ') {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final int m2128() {
        int i10 = f1892;
        int i11 = i10 + 13;
        f1891 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = this.f1897;
        int i14 = i10 + 107;
        f1891 = i14 % 128;
        if (i14 % 2 != 0) {
            return i13;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m2129() {
        int i10 = f1891 + 71;
        f1892 = i10 % 128;
        int i11 = i10 % 2;
        if ((m2126() == d.f1909 ? 'R' : 'L') == 'R') {
            int i12 = f1891 + 125;
            f1892 = i12 % 128;
            return i12 % 2 == 0;
        }
        int i13 = f1892 + 27;
        f1891 = i13 % 128;
        if (i13 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public dy(d dVar, String str, int i10) {
        this.f1896 = dVar;
        this.f1895 = str;
        this.f1897 = i10;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2117(int i10, char c10, int i11) {
        String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1653) {
            char[] cArr = new char[i11];
            com.ironsource.adqualitysdk.sdk.i.d.f1652 = 0;
            while (true) {
                int i12 = com.ironsource.adqualitysdk.sdk.i.d.f1652;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f1894[i10 + i12]) ^ (((long) i12) * f1893)) ^ ((long) c10));
                    com.ironsource.adqualitysdk.sdk.i.d.f1652 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final boolean m2120() {
        boolean z10;
        if (m2126() == d.f1902) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return false;
        }
        int i10 = f1892 + 7;
        int i11 = i10 % 128;
        f1891 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 29;
        f1892 = i13 % 128;
        int i14 = i13 % 2;
        return true;
    }
}
