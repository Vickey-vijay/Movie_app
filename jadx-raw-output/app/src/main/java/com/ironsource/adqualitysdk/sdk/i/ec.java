package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes7.dex */
public final class ec extends ed {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1926 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f1927 = 7388121727780528165L;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1928 = {48760};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1929;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1930;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ed f1931;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2142(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            char[] cArr = new char[i11];
            d.f1652 = 0;
            while (true) {
                int i12 = d.f1652;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f1928[i10 + i12]) ^ (((long) i12) * f1927)) ^ ((long) c10));
                    d.f1652 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.ec.class != r6.getClass()) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.ec.class != r6.getClass()) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        r6 = (com.ironsource.adqualitysdk.sdk.i.ec) r6;
        r0 = r5.f1931;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        r4 = 'B';
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        if (r4 == 'B') goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r6.f1931 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
    
        if (r0.equals(r6.f1931) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004d, code lost:
    
        r0 = r5.f1930;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004f, code lost:
    
        if (r0 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0051, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0054, code lost:
    
        r6 = r6.f1930;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0056, code lost:
    
        if (r3 == true) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0058, code lost:
    
        if (r6 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0060, code lost:
    
        return r0.equals(r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.ec> r0 = com.ironsource.adqualitysdk.sdk.i.ec.class
            r1 = 1
            if (r5 != r6) goto L10
            int r6 = com.ironsource.adqualitysdk.sdk.i.ec.f1929
            int r6 = r6 + 109
            int r0 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.ec.f1926 = r0
            int r6 = r6 % 2
            return r1
        L10:
            r2 = 0
            if (r6 == 0) goto L61
            int r3 = com.ironsource.adqualitysdk.sdk.i.ec.f1926
            int r3 = r3 + 115
            int r4 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.ec.f1929 = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L2b
            java.lang.Class r3 = r6.getClass()
            r4 = 28
            int r4 = r4 / r2
            if (r0 == r3) goto L32
            goto L61
        L29:
            r6 = move-exception
            throw r6
        L2b:
            java.lang.Class r3 = r6.getClass()
            if (r0 == r3) goto L32
            goto L61
        L32:
            com.ironsource.adqualitysdk.sdk.i.ec r6 = (com.ironsource.adqualitysdk.sdk.i.ec) r6
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r5.f1931
            r3 = 66
            if (r0 == 0) goto L3c
            r4 = r3
            goto L3d
        L3c:
            r4 = r1
        L3d:
            if (r4 == r3) goto L44
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r6.f1931
            if (r0 == 0) goto L4d
            goto L4c
        L44:
            com.ironsource.adqualitysdk.sdk.i.ed r3 = r6.f1931
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L4d
        L4c:
            return r2
        L4d:
            java.lang.String r0 = r5.f1930
            if (r0 == 0) goto L53
            r3 = r1
            goto L54
        L53:
            r3 = r2
        L54:
            java.lang.String r6 = r6.f1930
            if (r3 == r1) goto L5c
            if (r6 != 0) goto L5b
            return r1
        L5b:
            return r2
        L5c:
            boolean r6 = r0.equals(r6)
            return r6
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ec.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        int i10;
        ed edVar = this.f1931;
        int iHashCode2 = 0;
        if ((edVar != null ? '.' : 'S') != '.') {
            int i11 = f1926 + 11;
            f1929 = i11 % 128;
            int i12 = i11 % 2;
            iHashCode = 0;
        } else {
            iHashCode = edVar.hashCode();
        }
        int i13 = iHashCode * 31;
        String str = this.f1930;
        if (!(str == null)) {
            iHashCode2 = str.hashCode();
            i10 = f1926 + 111;
            f1929 = i10 % 128;
        } else {
            i10 = f1929 + 43;
            f1926 = i10 % 128;
        }
        int i14 = i10 % 2;
        return i13 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1931.toString());
        sb2.append(m2142(ViewConfiguration.getPressedStateDuration() >> 16, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 48726), KeyEvent.keyCodeFromString("") + 1).intern());
        sb2.append(this.f1930);
        String string = sb2.toString();
        int i10 = f1929 + 117;
        f1926 = i10 % 128;
        if (i10 % 2 != 0) {
            return string;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if ((r3 instanceof com.ironsource.adqualitysdk.sdk.i.cq) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        r4 = new com.ironsource.adqualitysdk.sdk.i.dr(((com.ironsource.adqualitysdk.sdk.i.cq) r3).m1687(r2.f1930));
        r3 = com.ironsource.adqualitysdk.sdk.i.ec.f1929 + 77;
        com.ironsource.adqualitysdk.sdk.i.ec.f1926 = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        return new com.ironsource.adqualitysdk.sdk.i.dr(r3.getClass().getDeclaredField(r2.f1930).get(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        return new com.ironsource.adqualitysdk.sdk.i.dr(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if ((r3 instanceof com.ironsource.adqualitysdk.sdk.i.cq) != false) goto L13;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ironsource.adqualitysdk.sdk.i.dr mo2113(com.ironsource.adqualitysdk.sdk.i.du r3, com.ironsource.adqualitysdk.sdk.i.cq r4) {
        /*
            r2 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ec.f1929
            int r0 = r0 + 87
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ec.f1926 = r1
            int r0 = r0 % 2
            r1 = 47
            if (r0 != 0) goto L10
            r0 = r1
            goto L12
        L10:
            r0 = 59
        L12:
            if (r0 == r1) goto L23
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r2.f1931
            com.ironsource.adqualitysdk.sdk.i.dr r3 = r0.m2146(r3, r4)
            java.lang.Object r3 = r3.m2089()
            boolean r4 = r3 instanceof com.ironsource.adqualitysdk.sdk.i.cq
            if (r4 == 0) goto L4d
            goto L35
        L23:
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r2.f1931
            com.ironsource.adqualitysdk.sdk.i.dr r3 = r0.m2146(r3, r4)
            java.lang.Object r3 = r3.m2089()
            boolean r4 = r3 instanceof com.ironsource.adqualitysdk.sdk.i.cq
            r0 = 72
            int r0 = r0 / 0
            if (r4 == 0) goto L4d
        L35:
            com.ironsource.adqualitysdk.sdk.i.dr r4 = new com.ironsource.adqualitysdk.sdk.i.dr
            com.ironsource.adqualitysdk.sdk.i.cq r3 = (com.ironsource.adqualitysdk.sdk.i.cq) r3
            java.lang.String r0 = r2.f1930
            com.ironsource.adqualitysdk.sdk.i.ds r3 = r3.m1687(r0)
            r4.<init>(r3)
            int r3 = com.ironsource.adqualitysdk.sdk.i.ec.f1929
            int r3 = r3 + 77
            int r0 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.ec.f1926 = r0
            int r3 = r3 % 2
            return r4
        L4d:
            com.ironsource.adqualitysdk.sdk.i.dr r4 = new com.ironsource.adqualitysdk.sdk.i.dr     // Catch: java.lang.Exception -> L61
            java.lang.Class r0 = r3.getClass()     // Catch: java.lang.Exception -> L61
            java.lang.String r1 = r2.f1930     // Catch: java.lang.Exception -> L61
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> L61
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Exception -> L61
            r4.<init>(r3)     // Catch: java.lang.Exception -> L61
            return r4
        L61:
            com.ironsource.adqualitysdk.sdk.i.dr r3 = new com.ironsource.adqualitysdk.sdk.i.dr
            r4 = 0
            r3.<init>(r4)
            return r3
        L68:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ec.mo2113(com.ironsource.adqualitysdk.sdk.i.du, com.ironsource.adqualitysdk.sdk.i.cq):com.ironsource.adqualitysdk.sdk.i.dr");
    }

    public ec(ed edVar, String str, dm dmVar) {
        super(dmVar);
        this.f1931 = edVar;
        this.f1930 = str;
    }
}
