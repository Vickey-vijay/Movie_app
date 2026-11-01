package com.ironsource.adqualitysdk.sdk.i;

import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes7.dex */
public final class ez extends el {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2014 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2015 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2016 = 43;

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾒ */
    public final boolean mo2166(String str, String str2) {
        int i10 = f2014 + 71;
        f2015 = i10 % 128;
        if ((i10 % 2 == 0 ? 'L' : (char) 11) == 'L') {
            str.equals(str2);
            throw null;
        }
        if ((!str.equals(str2) ? 'U' : '.') != 'U') {
            return false;
        }
        int i11 = f2014 + 121;
        f2015 = i11 % 128;
        if (i11 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2178(String str, int i10, boolean z10, int i11, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f706) {
            char[] cArr2 = new char[i10];
            b.f704 = 0;
            while (true) {
                int i13 = b.f704;
                if (i13 >= i10) {
                    break;
                }
                b.f705 = cArr[i13];
                cArr2[b.f704] = (char) (b.f705 + i12);
                int i14 = b.f704;
                cArr2[i14] = (char) (cArr2[i14] - f2016);
                b.f704 = i14 + 1;
            }
            if (i11 > 0) {
                b.f707 = i11;
                char[] cArr3 = new char[i10];
                System.arraycopy(cArr2, 0, cArr3, 0, i10);
                int i15 = b.f707;
                System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                int i16 = b.f707;
                System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
            }
            if (z10) {
                char[] cArr4 = new char[i10];
                b.f704 = 0;
                while (true) {
                    int i17 = b.f704;
                    if (i17 >= i10) {
                        break;
                    }
                    cArr4[i17] = cArr2[(i10 - i17) - 1];
                    b.f704 = i17 + 1;
                }
                cArr2 = cArr4;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2155() {
        int i10 = f2014 + 37;
        f2015 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m2178("\ufff2\u000e", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2, true, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, MotionEvent.axisFromString("") + 91).intern();
        int i12 = f2014 + 77;
        f2015 = i12 % 128;
        if ((i12 % 2 == 0 ? 'S' : (char) 25) != 'S') {
            return strIntern;
        }
        int i13 = 74 / 0;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾇ */
    public final boolean mo2164(int i10) {
        int i11 = f2014;
        int i12 = i11 + 27;
        f2015 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        if (i10 == 0) {
            return false;
        }
        int i13 = i11 + 113;
        f2015 = i13 % 128;
        if (i13 % 2 != 0) {
            return true;
        }
        int i14 = 58 / 0;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾒ */
    public final boolean mo2165(Object obj, Object obj2) {
        if ((obj != obj2 ? '&' : (char) 15) != '&') {
            int i10 = f2015 + 81;
            f2014 = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        int i12 = f2015 + 29;
        f2014 = i12 % 128;
        int i13 = i12 % 2;
        return true;
    }

    public ez(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }
}
