package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;

/* JADX INFO: loaded from: classes7.dex */
public final class ev extends en {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2002 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2003 = -1006282281212763005L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2004;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2175(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2019) {
            f.f2017 = i10;
            char[] cArr2 = new char[cArr.length];
            f.f2018 = 0;
            while (true) {
                int i11 = f.f2018;
                if (i11 < cArr.length) {
                    cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2017 * i11))) ^ f2003);
                    f.f2018++;
                } else {
                    str2 = new String(cArr2);
                }
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2155() {
        int i10 = f2004 + 75;
        f2002 = i10 % 128;
        String strIntern = m2175("⒦", (i10 % 2 == 0 ? 'X' : ':') != ':' ? 51674 / (Process.getElapsedCpuTime() > 1L ? 1 : (Process.getElapsedCpuTime() == 1L ? 0 : -1)) : 51674 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern();
        int i11 = f2004 + 27;
        f2002 = i11 % 128;
        int i12 = i11 % 2;
        return strIntern;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if ((r5 instanceof java.lang.Double ? '@' : 5) != '@') goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003b, code lost:
    
        if ((r5 instanceof java.lang.Double ? 1 : '[') != '[') goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if ((r4 instanceof java.lang.Long) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        if ((r5 instanceof java.lang.Long) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006b, code lost:
    
        return java.lang.Integer.valueOf(r4.intValue() % r5.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        return java.lang.Long.valueOf(r4.longValue() % r5.longValue());
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.en
    /* JADX INFO: renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Number mo2168(java.lang.Number r4, java.lang.Number r5) {
        /*
            r3 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ev.f2002
            int r1 = r0 + 63
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.ev.f2004 = r2
            int r1 = r1 % 2
            boolean r1 = r4 instanceof java.lang.Double
            r2 = 93
            if (r1 != 0) goto L12
            r1 = r2
            goto L14
        L12:
            r1 = 69
        L14:
            if (r1 == r2) goto L17
            goto L3d
        L17:
            int r0 = r0 + 45
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ev.f2004 = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L32
            boolean r0 = r5 instanceof java.lang.Double
            r1 = 7
            int r1 = r1 / 0
            r1 = 64
            if (r0 == 0) goto L2c
            r0 = r1
            goto L2d
        L2c:
            r0 = 5
        L2d:
            if (r0 == r1) goto L3d
            goto L55
        L30:
            r4 = move-exception
            throw r4
        L32:
            boolean r0 = r5 instanceof java.lang.Double
            r1 = 91
            if (r0 == 0) goto L3a
            r0 = 1
            goto L3b
        L3a:
            r0 = r1
        L3b:
            if (r0 == r1) goto L55
        L3d:
            double r0 = r4.doubleValue()
            double r4 = r5.doubleValue()
            double r0 = r0 % r4
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
            int r5 = com.ironsource.adqualitysdk.sdk.i.ev.f2002
            int r5 = r5 + 79
            int r0 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.ev.f2004 = r0
            int r5 = r5 % 2
            return r4
        L55:
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 != 0) goto L6c
            boolean r0 = r5 instanceof java.lang.Long
            if (r0 == 0) goto L5e
            goto L6c
        L5e:
            int r4 = r4.intValue()
            int r5 = r5.intValue()
            int r4 = r4 % r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            return r4
        L6c:
            long r0 = r4.longValue()
            long r4 = r5.longValue()
            long r0 = r0 % r4
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ev.mo2168(java.lang.Number, java.lang.Number):java.lang.Number");
    }

    public ev(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }
}
