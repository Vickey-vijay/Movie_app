package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static int f2283;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static final Object f2284 = new Object();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static int f2285;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static char[] m2243(long j10, char[] cArr, int i10) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i11 = 4;
        int i12 = 0;
        for (int i13 = 0; i13 < cArr.length; i13++) {
            if ((((j10 >>> i13) & 1) != i10 || i12 >= 4) && i11 < length) {
                cArr2[i11] = cArr[i13];
                i11++;
            } else {
                cArr2[i12] = cArr[i13];
                i12++;
            }
        }
        return cArr2;
    }
}
