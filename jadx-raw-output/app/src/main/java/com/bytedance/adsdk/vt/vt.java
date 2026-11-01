package com.bytedance.adsdk.vt;

/* JADX INFO: loaded from: classes5.dex */
final class vt {
    public static final int[] ouw = new int[0];
    public static final long[] vt = new long[0];

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static final Object[] f11348lh = new Object[0];

    public static int ouw(int[] iArr, int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else {
                if (i15 <= i11) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }
}
