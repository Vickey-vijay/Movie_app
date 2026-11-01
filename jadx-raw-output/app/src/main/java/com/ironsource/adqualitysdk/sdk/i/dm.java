package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes7.dex */
public final class dm {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1775 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f1776 = {2079880854, -917310781, -1740524842, -1533885123, -66225104, -1155740387, -1509317618, 489272800, -425835252, -547440015, 847524947, -191329785, -1539798976, -564369660, -2055889111, 1785479563, 198575438, -433954121};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1777;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1778;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private int f1779;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static dm m2010(String str, int i10) {
        int i11 = f1777 + 99;
        f1775 = i11 % 128;
        int i12 = i11 % 2;
        if (s.m2951().m2979()) {
            return new dm(str, i10);
        }
        int i13 = f1777 + 43;
        f1775 = i13 % 128;
        int i14 = i13 % 2;
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1778);
        sb2.append(m2011(new int[]{-555983378, 170641764}, -((byte) KeyEvent.getModifierMetaStateMask())).intern());
        sb2.append(this.f1779);
        String string = sb2.toString();
        int i10 = f1777 + 33;
        f1775 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 7 : ')') != 7) {
            return string;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final int m2012() {
        int i10 = f1777 + 113;
        f1775 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 17 : '?') != 17) {
            return this.f1779;
        }
        throw null;
    }

    private dm(String str, int i10) {
        this.f1778 = str;
        this.f1779 = i10;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2011(int[] iArr, int i10) {
        String str;
        synchronized (e.f1912) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f1776.clone();
            e.f1913 = 0;
            while (true) {
                int i11 = e.f1913;
                if (i11 < iArr.length) {
                    int i12 = iArr[i11];
                    char c10 = (char) (i12 >> 16);
                    cArr[0] = c10;
                    char c11 = (char) i12;
                    cArr[1] = c11;
                    char c12 = (char) (iArr[i11 + 1] >> 16);
                    cArr[2] = c12;
                    char c13 = (char) iArr[i11 + 1];
                    cArr[3] = c13;
                    e.f1915 = (c10 << 16) + c11;
                    e.f1914 = (c12 << 16) + c13;
                    e.m2135(iArr2);
                    for (int i13 = 0; i13 < 16; i13++) {
                        int i14 = e.f1915 ^ iArr2[i13];
                        e.f1915 = i14;
                        e.f1914 = e.m2134(i14) ^ e.f1914;
                        int i15 = e.f1915;
                        e.f1915 = e.f1914;
                        e.f1914 = i15;
                    }
                    int i16 = e.f1915;
                    e.f1915 = e.f1914;
                    e.f1914 = i16;
                    e.f1914 = i16 ^ iArr2[16];
                    e.f1915 ^= iArr2[17];
                    int i17 = e.f1913;
                    int i18 = e.f1915;
                    cArr[0] = (char) (i18 >>> 16);
                    cArr[1] = (char) i18;
                    int i19 = e.f1914;
                    cArr[2] = (char) (i19 >>> 16);
                    cArr[3] = (char) i19;
                    e.m2135(iArr2);
                    int i20 = e.f1913;
                    cArr2[i20 << 1] = cArr[0];
                    cArr2[(i20 << 1) + 1] = cArr[1];
                    cArr2[(i20 << 1) + 2] = cArr[2];
                    cArr2[(i20 << 1) + 3] = cArr[3];
                    e.f1913 = i20 + 2;
                } else {
                    str = new String(cArr2, 0, i10);
                }
            }
        }
        return str;
    }
}
