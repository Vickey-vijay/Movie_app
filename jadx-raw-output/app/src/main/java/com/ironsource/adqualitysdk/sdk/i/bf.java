package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class bf extends bd {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f784 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f786;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f785 = {'E', 33080, 685, 33824, 1428, 34571, 2176};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f783 = -4211819825991155338L;

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo737() {
        int i10 = f784 + 117;
        f786 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m821(ViewConfiguration.getDoubleTapTimeout() >> 16, (char) TextUtils.indexOf("", "", 0), (KeyEvent.getMaxKeyCode() >> 16) + 7).intern();
        int i12 = f786 + 61;
        f784 = i12 % 128;
        int i13 = i12 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m821(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            char[] cArr = new char[i11];
            d.f1652 = 0;
            while (true) {
                int i12 = d.f1652;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f785[i10 + i12]) ^ (((long) i12) * f783)) ^ ((long) c10));
                    d.f1652 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻏ */
    public final boolean mo811() {
        int i10 = f786 + 51;
        int i11 = i10 % 128;
        f784 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 71;
        f786 = i13 % 128;
        int i14 = i13 % 2;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo736() {
        HashMap map = new HashMap();
        int i10 = f784 + 9;
        f786 = i10 % 128;
        int i11 = i10 % 2;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo738(String str) {
        int i10 = f786 + 75;
        f784 = i10 % 128;
        if ((i10 % 2 == 0 ? 'c' : ':') != 'c') {
            return null;
        }
        throw null;
    }

    public bf(String str) {
        super(str);
    }
}
