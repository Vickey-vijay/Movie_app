package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;

/* JADX INFO: loaded from: classes7.dex */
public final class fd extends eg {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2036 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2037 = 63693;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2038 = 41695;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2039 = 10911;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2040 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2041 = 62374;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2182(String str, int i10) {
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
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2038)) ^ ((c11 >>> 5) + f2037)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2041) ^ ((c12 + i12) ^ ((c12 << 4) + f2039))));
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

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2155() {
        int i10 = f2040 + 5;
        f2036 = i10 % 128;
        String strIntern = ((i10 % 2 == 0 ? '#' : (char) 0) != '#' ? m2182("䅘颖", 1 - Color.blue(0)) : m2182("䅘颖", Color.blue(1) + 1)).intern();
        int i11 = f2040 + 41;
        f2036 = i11 % 128;
        int i12 = i11 % 2;
        return strIntern;
    }

    public fd(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo2113(du duVar, cq cqVar) {
        char c10;
        boolean z10;
        dr drVarM2146 = m2156().m2146(duVar, cqVar);
        dr drVarM2147 = m2157().m2146(duVar, cqVar);
        if (!(drVarM2146.m2089() instanceof String)) {
            c10 = '=';
        } else {
            c10 = '0';
        }
        if (c10 != '=' || (drVarM2147.m2089() instanceof String)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(drVarM2146.m2089());
            sb2.append(drVarM2147.m2089());
            return new dr(sb2.toString());
        }
        Number numberM2090 = drVarM2146.m2090();
        Number numberM2091 = drVarM2147.m2090();
        if (!(numberM2090 instanceof Double)) {
            char c11 = '3';
            int i10 = f2040 + 51;
            f2036 = i10 % 128;
            if (i10 % 2 == 0) {
                c11 = '+';
            }
            if (c11 != '+') {
                if (!(numberM2091 instanceof Double)) {
                    if (!(numberM2090 instanceof Long)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && !(numberM2091 instanceof Long)) {
                        return new dr(Integer.valueOf(numberM2090.intValue() + numberM2091.intValue()));
                    }
                    return new dr(Long.valueOf(numberM2090.longValue() + numberM2091.longValue()));
                }
            } else {
                boolean z11 = numberM2091 instanceof Double;
                throw null;
            }
        }
        dr drVar = new dr(Double.valueOf(numberM2090.doubleValue() + numberM2091.doubleValue()));
        int i11 = f2036 + 45;
        f2040 = i11 % 128;
        int i12 = i11 % 2;
        return drVar;
    }
}
