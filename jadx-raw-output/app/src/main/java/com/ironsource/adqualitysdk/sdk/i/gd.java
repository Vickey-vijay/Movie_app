package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ExpandableListView;
import com.facebook.ads.AdSettings;

/* JADX INFO: loaded from: classes7.dex */
public final class gd extends gl {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2152 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2153;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2151 = {10578, 12384, 6944, 25253, 19887, 22374, 48678, 39398, 57507, 51824, 54578, 15600, 2039, 24950, 18481, 21472, 47871, 33902, 61193, 63224, 53644, 15187, 529, 28106, 29839, 24152, 47374, 6733, 884, 10292, 20980, 32433, 25714, 36144, 43762};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f2150 = 2999190736284293438L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo2198() {
        bn bnVar = new bn(mo2201());
        int i10 = f2152 + 69;
        f2153 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        return bnVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2211(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            char[] cArr = new char[i11];
            d.f1652 = 0;
            while (true) {
                int i12 = d.f1652;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f2151[i10 + i12]) ^ (((long) i12) * f2150)) ^ ((long) c10));
                    d.f1652 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo2199() {
        int i10 = f2152 + 43;
        f2153 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m2211(Color.green(0), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 10545), View.MeasureSpec.makeMeasureSpec(0, 0) + 27).intern();
        int i12 = f2153 + 63;
        f2152 = i12 % 128;
        int i13 = i12 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo2200() {
        int i10 = f2152 + 13;
        int i11 = i10 % 128;
        f2153 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 51;
        f2152 = i13 % 128;
        if ((i13 % 2 == 0 ? 'H' : 'Q') == 'Q') {
            return AdSettings.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo2201() {
        int i10 = f2153 + 125;
        f2152 = i10 % 128;
        String strIntern = ((i10 % 2 == 0 ? 'C' : '[') != '[' ? m2211(51 << ExpandableListView.getPackedPositionChild(0L), (char) (KeyEvent.getDeadChar(0, 1) + 27692), 107 >>> TextUtils.indexOf((CharSequence) "", 'L', 1)) : m2211(ExpandableListView.getPackedPositionChild(0L) + 28, (char) (6699 - KeyEvent.getDeadChar(0, 0)), 7 - TextUtils.indexOf((CharSequence) "", '0', 0))).intern();
        int i11 = f2153 + 87;
        f2152 = i11 % 128;
        if ((i11 % 2 == 0 ? (char) 4 : '.') == '.') {
            return strIntern;
        }
        throw null;
    }
}
