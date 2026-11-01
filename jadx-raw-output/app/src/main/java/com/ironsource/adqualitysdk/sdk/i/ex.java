package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes7.dex */
public final class ex extends en {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2008 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2009 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2010 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2011 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f2012 = -8796329455380329577L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2177(String str, char c10, String str2, int i10, String str3) {
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
                    cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f2012) ^ ((long) f2008)) ^ ((long) f2011));
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
        char c10;
        int i10;
        int i11 = f2009 + 51;
        f2010 = i11 % 128;
        boolean z10 = i11 % 2 == 0;
        long globalActionKeyTimeout = ViewConfiguration.getGlobalActionKeyTimeout();
        if (z10) {
            c10 = (char) ((globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)) + 41827);
            i10 = 978632675 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
        } else {
            c10 = (char) (41827 >>> (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)));
            i10 = 978632675 >>> (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
        }
        return m2177("墶", c10, "\u0b97᳀⣷藭", i10, "\ue272咿携羣").intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.en
    /* JADX INFO: renamed from: ﾇ */
    public final Number mo2168(Number number, Number number2) {
        if ((!(number instanceof Double) ? ':' : (char) 20) != 20) {
            int i10 = f2009;
            int i11 = i10 + 71;
            f2010 = i11 % 128;
            if (i11 % 2 != 0) {
                boolean z10 = number2 instanceof Double;
                throw null;
            }
            if (!(number2 instanceof Double)) {
                if ((!(number instanceof Long) ? (char) 28 : (char) 23) == 28) {
                    int i12 = i10 + 89;
                    f2010 = i12 % 128;
                    int i13 = i12 % 2;
                    if (!(number2 instanceof Long)) {
                        Integer numValueOf = Integer.valueOf(number.intValue() - number2.intValue());
                        int i14 = f2010 + 65;
                        f2009 = i14 % 128;
                        if (i14 % 2 != 0) {
                            return numValueOf;
                        }
                        int i15 = 64 / 0;
                        return numValueOf;
                    }
                }
                Long lValueOf = Long.valueOf(number.longValue() - number2.longValue());
                int i16 = f2009 + 95;
                f2010 = i16 % 128;
                if (i16 % 2 == 0) {
                    return lValueOf;
                }
                throw null;
            }
        }
        return Double.valueOf(number.doubleValue() - number2.doubleValue());
    }

    public ex(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }
}
