package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fyber.FairBid;

/* JADX INFO: loaded from: classes7.dex */
public final class gg extends gl {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2170 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2172 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2171 = {5998, 25266, 64704, 30291, 49195, 23140, 54671, 12248, 47615, 13171, 36203, 6300, 37540, 60655, 26159, 61524, 19049, 'f', 30129, 60361, 24834, 55074, 19833, 49796};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2169 = 4798225458005177808L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo2201() {
        int i10 = f2172 + 59;
        f2170 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m2216(MotionEvent.axisFromString("") + 18, (char) TextUtils.getCapsMode("", 0, 0), TextUtils.getTrimmedLength("") + 7).intern();
        int i12 = f2170 + 19;
        f2172 = i12 % 128;
        int i13 = i12 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2216(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            char[] cArr = new char[i11];
            d.f1652 = 0;
            while (true) {
                int i12 = d.f1652;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f2171[i10 + i12]) ^ (((long) i12) * f2169)) ^ ((long) c10));
                    d.f1652 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo2198() {
        br brVar = new br(mo2201());
        int i10 = f2172 + 7;
        f2170 = i10 % 128;
        int i11 = i10 % 2;
        return brVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo2199() {
        int i10 = f2170 + 1;
        f2172 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m2216(ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) (5901 - TextUtils.indexOf("", "")), 17 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern();
        int i12 = f2170 + 93;
        f2172 = i12 % 128;
        int i13 = i12 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo2200() {
        int i10 = f2172 + 51;
        int i11 = i10 % 128;
        f2170 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 97;
        f2172 = i13 % 128;
        int i14 = i13 % 2;
        return FairBid.class;
    }
}
