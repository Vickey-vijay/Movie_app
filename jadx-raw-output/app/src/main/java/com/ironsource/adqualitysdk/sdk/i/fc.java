package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class fc extends en {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2031 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2032 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2033 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2034 = 44270;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f2035;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2181(String str, char c10, String str2, int i10, String str3) {
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
                    cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f2035) ^ ((long) f2033)) ^ ((long) f2034));
                    j.f2675 = i15 + 1;
                } else {
                    str4 = new String(cArr6);
                }
            }
        }
        return str4;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2155() {
        int i10 = f2031 + 83;
        f2032 = i10 % 128;
        return ((i10 % 2 == 0 ? (char) 1 : '\r') != 1 ? m2181("ꐀ", (char) (40518 - TextUtils.indexOf("", "", 0)), "\u0000\u0000\u0000\u0000", TextUtils.lastIndexOf("", '0') - 1579825729, "븅헅䚡톞") : m2181("ꐀ", (char) (40518 - TextUtils.indexOf("", "", 0)), "\u0000\u0000\u0000\u0000", (-1579825729) - TextUtils.lastIndexOf("", 'J'), "븅헅䚡톞")).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.en
    /* JADX INFO: renamed from: ﾇ */
    public final Number mo2168(Number number, Number number2) {
        int i10 = f2032 + 107;
        int i11 = i10 % 128;
        f2031 = i11;
        int i12 = i10 % 2;
        if (!(number instanceof Double)) {
            int i13 = i11 + 21;
            f2032 = i13 % 128;
            int i14 = i13 % 2;
            if ((number2 instanceof Double ? 'K' : 'I') != 'K') {
                if (!(number instanceof Long)) {
                    if (!(number2 instanceof Long)) {
                        return Integer.valueOf(number.intValue() * number2.intValue());
                    }
                }
                return Long.valueOf(number.longValue() * number2.longValue());
            }
        }
        return Double.valueOf(number.doubleValue() * number2.doubleValue());
    }

    public fc(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }
}
