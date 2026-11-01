package com.yandex.div.core.view2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.drawable.shapes.RoundRectShape;
import com.yandex.div.core.util.bitmap.BitmapEffectHelper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: ShadowCache.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ShadowCache {
    public static final ShadowCache INSTANCE = new ShadowCache();
    private static final Paint paint = new Paint();
    private static final Map<ShadowCacheKey, NinePatch> shadowMap = new LinkedHashMap();

    /* JADX INFO: compiled from: ShadowCache.kt */
    public static final class ShadowCacheKey {
        private final float blur;
        private final float[] radii;

        public boolean equals(Object obj) {
            if (obj instanceof ShadowCacheKey) {
                ShadowCacheKey shadowCacheKey = (ShadowCacheKey) obj;
                if ((this.blur == shadowCacheKey.blur) && Arrays.equals(this.radii, shadowCacheKey.radii)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.radii) * 31) + Float.hashCode(this.blur);
        }

        public ShadowCacheKey(float[] fArr, float f10) {
            this.radii = fArr;
            this.blur = f10;
        }
    }

    private ShadowCache() {
    }

    private final NinePatch createNewShadow(float[] fArr, float f10, BitmapEffectHelper bitmapEffectHelper) {
        float fMax = f10 + Math.max(fArr[1] + fArr[2], fArr[5] + fArr[6]);
        float fMax2 = f10 + Math.max(fArr[0] + fArr[7], fArr[3] + fArr[4]);
        if (fMax <= 0.0f || fMax2 <= 0.0f) {
            return null;
        }
        float coercedBlurRadius = bitmapEffectHelper.getCoercedBlurRadius(f10);
        float bitmapScale = bitmapEffectHelper.getBitmapScale(f10);
        float f11 = f10 * 2;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) ((fMax + f11) * bitmapScale), (int) ((f11 + fMax2) * bitmapScale), Bitmap.Config.ALPHA_8);
        drawNewShadow(bitmapCreateBitmap, fMax, fMax2, fArr, coercedBlurRadius, bitmapScale);
        Bitmap bitmapBlurShadow = bitmapEffectHelper.blurShadow(bitmapCreateBitmap, coercedBlurRadius);
        bitmapCreateBitmap.recycle();
        if (bitmapScale < 1.0f) {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapBlurShadow, (int) (bitmapBlurShadow.getWidth() / bitmapScale), (int) (bitmapBlurShadow.getHeight() / bitmapScale), true);
            bitmapBlurShadow.recycle();
            bitmapBlurShadow = bitmapCreateScaledBitmap;
        }
        return toNinePatch(bitmapBlurShadow);
    }

    private final byte[] createNinePatchChunk(int i10, int i11) {
        int i12 = i11 / 2;
        int i13 = i10 / 2;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
        byteBufferOrder.put((byte) 1);
        byteBufferOrder.put((byte) 2);
        byteBufferOrder.put((byte) 2);
        byteBufferOrder.put((byte) 9);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(i13 - 1);
        byteBufferOrder.putInt(i13 + 1);
        byteBufferOrder.putInt(i12 - 1);
        byteBufferOrder.putInt(i12 + 1);
        for (int i14 = 0; i14 < 9; i14++) {
            byteBufferOrder.putInt(1);
        }
        return byteBufferOrder.array();
    }

    private final void drawNewShadow(Bitmap bitmap, float f10, float f11, float[] fArr, float f12, float f13) {
        RoundRectShape roundRectShape = new RoundRectShape(fArr, null, null);
        roundRectShape.resize(f10, f11);
        Canvas canvas = new Canvas();
        canvas.setBitmap(bitmap);
        int iSave = canvas.save();
        canvas.translate(f12, f12);
        try {
            iSave = canvas.save();
            canvas.scale(f13, f13, 0.0f, 0.0f);
            try {
                roundRectShape.draw(canvas, paint);
                canvas.restoreToCount(iSave);
            } finally {
                canvas.restoreToCount(iSave);
            }
        } catch (Throwable th2) {
            canvas.restoreToCount(iSave);
            throw th2;
        }
    }

    private final NinePatch toNinePatch(Bitmap bitmap) {
        return new NinePatch(bitmap, createNinePatchChunk(bitmap.getWidth(), bitmap.getHeight()));
    }

    public final NinePatch getShadow(float[] fArr, float f10, BitmapEffectHelper bitmapEffectHelper) {
        ShadowCacheKey shadowCacheKey = new ShadowCacheKey(fArr, f10);
        Map<ShadowCacheKey, NinePatch> map = shadowMap;
        NinePatch ninePatch = map.get(shadowCacheKey);
        if (ninePatch != null) {
            return ninePatch;
        }
        NinePatch ninePatchCreateNewShadow = createNewShadow(fArr, f10, bitmapEffectHelper);
        if (ninePatchCreateNewShadow != null) {
            map.put(shadowCacheKey, ninePatchCreateNewShadow);
        } else {
            ninePatchCreateNewShadow = null;
        }
        return ninePatchCreateNewShadow;
    }
}
