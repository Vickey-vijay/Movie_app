package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes7.dex */
public final class dv extends ed {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1876 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1877 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1880;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1879 = {'.', 18393, 36632, 55119, 7835, 26321};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f1878 = 8917081582990215098L;

    public final boolean equals(Object obj) {
        if (!(this != obj)) {
            return true;
        }
        if (obj != null) {
            int i10 = f1876 + 13;
            f1877 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            if ((dv.class != obj.getClass() ? '2' : 'R') != '2') {
                dv dvVar = (dv) obj;
                String str = this.f1880;
                if (str == null) {
                    return dvVar.f1880 == null;
                }
                int i11 = f1877 + 53;
                f1876 = i11 % 128;
                int i12 = i11 % 2;
                boolean zEquals = str.equals(dvVar.f1880);
                if (i12 == 0) {
                    return zEquals;
                }
                int i13 = 33 / 0;
                return zEquals;
            }
        }
        int i14 = f1877 + 111;
        f1876 = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2112(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            char[] cArr = new char[i11];
            d.f1652 = 0;
            while (true) {
                int i12 = d.f1652;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f1879[i10 + i12]) ^ (((long) i12) * f1878)) ^ ((long) c10));
                    d.f1652 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    public final int hashCode() {
        String str = this.f1880;
        if ((str != null ? 'J' : 'V') != 'J') {
            return 0;
        }
        int i10 = f1876 + 101;
        f1877 = i10 % 128;
        int i11 = i10 % 2;
        int iHashCode = str.hashCode();
        int i12 = f1876 + 77;
        f1877 = i12 % 128;
        if ((i12 % 2 == 0 ? ':' : '\"') == '\"') {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i10 = f1876 + 95;
        f1877 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1880;
        }
        int i11 = 34 / 0;
        return this.f1880;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final dr mo2113(du duVar, cq cqVar) {
        dr drVar = new dr(cqVar.m1693().m814(kc.m2864(this.f1880, m2112((-1) - MotionEvent.axisFromString(""), (char) Color.blue(0), MotionEvent.axisFromString("") + 7).intern())));
        int i10 = f1877 + 17;
        f1876 = i10 % 128;
        int i11 = i10 % 2;
        return drVar;
    }

    public dv(String str, dm dmVar) {
        super(dmVar);
        this.f1880 = dz.m2133(str);
    }
}
