package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes7.dex */
public final class eq extends eo {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1988 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1989 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1987 = {'>', 29252};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f1986 = -7149399757008571783L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2171(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            char[] cArr = new char[i11];
            d.f1652 = 0;
            while (true) {
                int i12 = d.f1652;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f1987[i10 + i12]) ^ (((long) i12) * f1986)) ^ ((long) c10));
                    d.f1652 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2155() {
        int iResolveSize;
        char maxKeyCode;
        int i10;
        int i11 = f1988 + 17;
        f1989 = i11 % 128;
        if ((i11 % 2 == 0 ? (char) 5 : '1') != '1') {
            iResolveSize = View.resolveSize(0, 0);
            maxKeyCode = (char) (KeyEvent.getMaxKeyCode() << 53);
            i10 = 0 % (ViewConfiguration.getScrollFriction() > 2.0f ? 1 : (ViewConfiguration.getScrollFriction() == 2.0f ? 0 : -1));
        } else {
            iResolveSize = View.resolveSize(0, 0);
            maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
            i10 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1;
        }
        String strIntern = m2171(iResolveSize, maxKeyCode, i10).intern();
        int i12 = f1989 + 57;
        f1988 = i12 % 128;
        int i13 = i12 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾇ */
    public final boolean mo2164(int i10) {
        int i11 = f1989;
        int i12 = i11 + 77;
        f1988 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            throw null;
        }
        if ((i10 >= 0 ? '.' : (char) 6) != '.') {
            return false;
        }
        int i13 = i11 + 107;
        f1988 = i13 % 128;
        if (i13 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public eq(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }
}
