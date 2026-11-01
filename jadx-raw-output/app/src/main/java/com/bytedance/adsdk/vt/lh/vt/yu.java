package com.bytedance.adsdk.vt.lh.vt;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class yu {
    public final float[] ouw;
    public final int[] vt;

    public final yu ouw(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            iArr[i10] = ouw(fArr[i10]);
        }
        return new yu(fArr, iArr);
    }

    public yu(float[] fArr, int[] iArr) {
        this.ouw = fArr;
        this.vt = iArr;
    }

    private int ouw(float f10) {
        int iBinarySearch = Arrays.binarySearch(this.ouw, f10);
        if (iBinarySearch >= 0) {
            return this.vt[iBinarySearch];
        }
        int i10 = -(iBinarySearch + 1);
        if (i10 == 0) {
            return this.vt[0];
        }
        int[] iArr = this.vt;
        if (i10 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.ouw;
        int i11 = i10 - 1;
        float f11 = fArr[i11];
        return com.bytedance.adsdk.vt.le.vt.ouw((f10 - f11) / (fArr[i10] - f11), iArr[i11], iArr[i10]);
    }
}
