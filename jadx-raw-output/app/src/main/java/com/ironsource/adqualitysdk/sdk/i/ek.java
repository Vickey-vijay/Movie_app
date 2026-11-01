package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;

/* JADX INFO: loaded from: classes7.dex */
public final class ek extends ed {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1972 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f1973 = -7844717107484358526L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1974 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1975;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2162(String str, int i10) {
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
                    cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2017 * i11))) ^ f1973);
                    f.f2018++;
                } else {
                    str2 = new String(cArr2);
                }
            }
        }
        return str2;
    }

    public final boolean equals(Object obj) {
        int i10 = f1972;
        int i11 = i10 + 103;
        f1974 = i11 % 128;
        int i12 = i11 % 2;
        if (this == obj) {
            return true;
        }
        if ((obj != null ? (char) 29 : 'R') == 29) {
            int i13 = i10 + 33;
            f1974 = i13 % 128;
            if (!(i13 % 2 != 0)) {
                obj.getClass();
                throw null;
            }
            if (ek.class == obj.getClass()) {
                return this.f1975.equals(((ek) obj).f1975);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if ((r5.f1975 != null ? '\b' : 'Y') != '\b') goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        r2 = r2 + 113;
        com.ironsource.adqualitysdk.sdk.i.ek.f1974 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
    
        if ((r2 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
    
        if (r0 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        r0 = r0 + 81;
        com.ironsource.adqualitysdk.sdk.i.ek.f1972 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004b, code lost:
    
        return r5.f1975.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if (r5.f1975 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r5 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ek.f1974
            int r1 = r0 + 59
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.ek.f1972 = r2
            int r1 = r1 % 2
            r3 = 88
            if (r1 == 0) goto L10
            r1 = r3
            goto L12
        L10:
            r1 = 92
        L12:
            r4 = 0
            if (r1 == r3) goto L1a
            java.lang.String r1 = r5.f1975
            if (r1 == 0) goto L29
            goto L3d
        L1a:
            java.lang.String r1 = r5.f1975
            r3 = 15
            int r3 = r3 / r4
            r3 = 8
            if (r1 == 0) goto L25
            r1 = r3
            goto L27
        L25:
            r1 = 89
        L27:
            if (r1 == r3) goto L3d
        L29:
            int r2 = r2 + 113
            int r0 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.ek.f1974 = r0
            int r2 = r2 % 2
            if (r2 != 0) goto L35
            r0 = r4
            goto L36
        L35:
            r0 = 1
        L36:
            if (r0 == 0) goto L39
            return r4
        L39:
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L3b
        L3b:
            r0 = move-exception
            throw r0
        L3d:
            int r0 = r0 + 81
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ek.f1972 = r1
            int r0 = r0 % 2
            java.lang.String r0 = r5.f1975
            int r0 = r0.hashCode()
            return r0
        L4c:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ek.hashCode():int");
    }

    public final String toString() {
        int i10 = f1972 + 33;
        f1974 = i10 % 128;
        int i11 = i10 % 2;
        String strM2163 = m2163();
        int i12 = f1972 + 119;
        f1974 = i12 % 128;
        int i13 = i12 % 2;
        return strM2163;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m2163() {
        int i10 = f1974 + 39;
        int i11 = i10 % 128;
        f1972 = i11;
        int i12 = i10 % 2;
        String str = this.f1975;
        int i13 = i11 + 125;
        f1974 = i13 % 128;
        if ((i13 % 2 == 0 ? '8' : 'L') == 'L') {
            return str;
        }
        int i14 = 49 / 0;
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo2113(du duVar, cq cqVar) {
        try {
            return new dr(duVar.m2111(m2163()));
        } catch (Exception e10) {
            ds dsVarM1687 = cqVar.m1687(m2163());
            if (dsVarM1687 != null) {
                dr drVar = new dr(dsVarM1687);
                int i10 = f1972 + 69;
                f1974 = i10 % 128;
                int i11 = i10 % 2;
                return drVar;
            }
            String strM1683 = cqVar.m1683();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2162("ࣇ왇閞擈㈬ı킭꿵絛䲁ᯑ\ue93e롢瞠䛮ᑜ\ue3d2닀耤彧⺼\ufde4쭋骀槃✲\uf67a엯", 52918 - ImageFormat.getBitsPerPixel(0)).intern());
            sb2.append(this);
            sb2.append(m2147());
            co.m1623(strM1683, sb2.toString(), e10);
            dr drVar2 = new dr(null);
            int i12 = f1974 + 77;
            f1972 = i12 % 128;
            int i13 = i12 % 2;
            return drVar2;
        }
    }

    public ek(String str, dm dmVar) {
        super(dmVar);
        this.f1975 = dz.m2133(str);
    }
}
