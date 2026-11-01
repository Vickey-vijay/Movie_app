package jp.wasabeef.glide.transformations;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.TransformationUtils;
import java.security.MessageDigest;
import jp.wasabeef.glide.transformations.internal.Utils;

/* JADX INFO: loaded from: classes2.dex */
public class CropCircleWithBorderTransformation extends BitmapTransformation {
    private static final String ID = "jp.wasabeef.glide.transformations.CropCircleWithBorderTransformation.1";
    private static final int VERSION = 1;
    private final int borderColor;
    private final int borderSize;

    public CropCircleWithBorderTransformation() {
        this.borderSize = Utils.toDp(4);
        this.borderColor = ViewCompat.MEASURED_STATE_MASK;
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof CropCircleWithBorderTransformation) {
            CropCircleWithBorderTransformation cropCircleWithBorderTransformation = (CropCircleWithBorderTransformation) obj;
            if (cropCircleWithBorderTransformation.borderSize == this.borderSize && cropCircleWithBorderTransformation.borderColor == this.borderColor) {
                return true;
            }
        }
        return false;
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public int hashCode() {
        return 882652245 + (this.borderSize * 100) + this.borderColor + 10;
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update((ID + this.borderSize + this.borderColor).getBytes(Key.CHARSET));
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation
    public Bitmap transform(@NonNull Context context, @NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i10, int i11) {
        Bitmap bitmapCircleCrop = TransformationUtils.circleCrop(bitmapPool, bitmap, i10, i11);
        setCanvasBitmapDensity(bitmap, bitmapCircleCrop);
        Paint paint = new Paint();
        paint.setColor(this.borderColor);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.borderSize);
        paint.setAntiAlias(true);
        new Canvas(bitmapCircleCrop).drawCircle(i10 / 2.0f, i11 / 2.0f, (Math.max(i10, i11) / 2.0f) - (this.borderSize / 2.0f), paint);
        return bitmapCircleCrop;
    }

    public CropCircleWithBorderTransformation(int i10, @ColorInt int i11) {
        this.borderSize = i10;
        this.borderColor = i11;
    }
}
