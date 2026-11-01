package com.yandex.div.core.util;

import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import androidx.core.graphics.drawable.DrawableKt;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.div.core.images.CachedBitmap;

/* JADX INFO: compiled from: ImageUtils.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class ImageUtilsKt {
    public static final CachedBitmap toCachedBitmap(PictureDrawable pictureDrawable, Uri uri, byte[] bArr) {
        return new CachedBitmap(DrawableKt.toBitmap$default(pictureDrawable, 0, 0, null, 7, null), bArr, uri, BitmapSource.MEMORY);
    }

    public static /* synthetic */ CachedBitmap toCachedBitmap$default(PictureDrawable pictureDrawable, Uri uri, byte[] bArr, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bArr = null;
        }
        return toCachedBitmap(pictureDrawable, uri, bArr);
    }
}
