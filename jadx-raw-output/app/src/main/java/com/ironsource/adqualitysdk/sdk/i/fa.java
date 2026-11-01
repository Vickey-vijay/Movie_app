package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes7.dex */
public final class fa extends eg {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2020 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2021 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2022 = 16633;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2023 = 28030;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2024 = 16548;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2025 = 36552;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2179(String str, int i10) {
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
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2025)) ^ ((c11 >>> 5) + f2024)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2023) ^ ((c12 + i12) ^ ((c12 << 4) + f2022))));
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
        int i10 = f2021 + 33;
        f2020 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m2179("\ufae6㊧", (ViewConfiguration.getPressedStateDuration() >> 16) + 2).intern();
        int i12 = f2020 + 55;
        f2021 = i12 % 128;
        int i13 = i12 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo2113(du duVar, cq cqVar) {
        int i10 = f2020 + 93;
        f2021 = i10 % 128;
        int i11 = i10 % 2;
        dr drVarM2146 = m2156().m2146(duVar, cqVar);
        if ((drVarM2146.m2091() ? ',' : (char) 24) != ',') {
            return m2157().m2146(duVar, cqVar);
        }
        int i12 = f2021 + 73;
        f2020 = i12 % 128;
        int i13 = i12 % 2;
        return drVarM2146;
    }

    public fa(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }
}
