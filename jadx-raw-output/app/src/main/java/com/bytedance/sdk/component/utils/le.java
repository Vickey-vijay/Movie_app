package com.bytedance.sdk.component.utils;

import android.graphics.BitmapFactory;

/* JADX INFO: loaded from: classes11.dex */
public final class le {
    public static boolean ouw(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        return options.outWidth > 0;
    }

    public static boolean vt(byte[] bArr) {
        return bArr != null && bArr.length >= 3 && bArr[0] == 71 && bArr[1] == 73 && bArr[2] == 70;
    }
}
