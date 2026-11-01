package com.yandex.div.core.util.bitmap.blur;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: BlurHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
public interface BlurHelper {
    Bitmap blurBitmap(Bitmap bitmap, float f10);

    Bitmap blurShadow(Bitmap bitmap, float f10);

    float getBitmapScale(float f10);

    float getCoercedBlurRadius(float f10);

    void release();
}
