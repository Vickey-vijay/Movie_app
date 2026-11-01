package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public final class ew extends eo {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2005 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2006 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2007 = 8812308453087429859L;

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾇ */
    public final boolean mo2164(int i10) {
        int i11 = f2006;
        int i12 = i11 + 53;
        f2005 = i12 % 128;
        int i13 = i12 % 2;
        if (i10 > 0) {
            return false;
        }
        int i14 = i11 + 63;
        f2005 = i14 % 128;
        int i15 = i14 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2176(String str, int i10) {
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
                    cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2017 * i11))) ^ f2007);
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
        int i10 = f2006 + 79;
        f2005 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m2176("쓟⇡", View.MeasureSpec.makeMeasureSpec(0, 0) + 58687).intern();
        int i12 = f2006 + 27;
        f2005 = i12 % 128;
        if (i12 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    public ew(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }
}
