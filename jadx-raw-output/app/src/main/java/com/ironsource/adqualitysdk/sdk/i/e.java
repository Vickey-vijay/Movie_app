package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static final Object f1912 = new Object();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static int f1913;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static int f1914;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static int f1915;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2135(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length / 2; i10++) {
            int i11 = iArr[i10];
            iArr[i10] = iArr[(iArr.length - i10) - 1];
            iArr[(iArr.length - i10) - 1] = i11;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static int m2134(int i10) {
        int[][] iArr = c.f1190.f1193;
        return ((iArr[0][i10 >>> 24] + iArr[1][(i10 >>> 16) & 255]) ^ iArr[2][(i10 >>> 8) & 255]) + iArr[3][i10 & 255];
    }
}
