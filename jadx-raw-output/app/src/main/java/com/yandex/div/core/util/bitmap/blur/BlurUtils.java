package com.yandex.div.core.util.bitmap.blur;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: BlurUtils.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class BlurUtils {
    public static final BlurUtils INSTANCE = new BlurUtils();

    private BlurUtils() {
    }

    public final boolean isBlurParamsValid(Bitmap bitmap, float f10) {
        if (!bitmap.isRecycled() && bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && f10 > 0.0f) {
            return true;
        }
        return false;
    }
}
