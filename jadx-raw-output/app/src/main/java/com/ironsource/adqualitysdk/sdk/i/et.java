package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* JADX INFO: loaded from: classes7.dex */
public final class et extends eo {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f1994 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f1995 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1996 = -1105404561;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1997 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1998;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2173(String str, char c10, String str2, int i10, String str3) {
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
                    cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f1995) ^ ((long) f1996)) ^ ((long) f1994));
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
        int maximumFlingVelocity;
        int i10 = f1998 + 7;
        f1997 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            c10 = (char) (35947 << (ExpandableListView.getPackedPositionForGroup(0) > 1L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 1L ? 0 : -1)));
            maximumFlingVelocity = 1685221337 / (ViewConfiguration.getMaximumFlingVelocity() * 118);
        } else {
            c10 = (char) (35947 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
            maximumFlingVelocity = 1685221337 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
        }
        return m2173("㎰", c10, "\u0000\u0000\u0000\u0000", maximumFlingVelocity, "\ud931牯此颌").intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾇ */
    public final boolean mo2164(int i10) {
        if ((i10 > 0 ? (char) 19 : 'T') != 19) {
            return false;
        }
        int i11 = f1998 + 23;
        int i12 = i11 % 128;
        f1997 = i12;
        int i13 = i11 % 2;
        int i14 = i12 + 115;
        f1998 = i14 % 128;
        if ((i14 % 2 != 0 ? '2' : (char) 27) == 27) {
            return true;
        }
        throw null;
    }

    public et(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }
}
