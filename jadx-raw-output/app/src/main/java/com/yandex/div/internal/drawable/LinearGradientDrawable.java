package com.yandex.div.internal.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import ck.i;
import com.yandex.div.internal.graphics.Colormap;

/* JADX INFO: compiled from: LinearGradientDrawable.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class LinearGradientDrawable extends Drawable {
    public static final Companion Companion = new Companion(null);
    private final float angle;
    private final Colormap colormap;
    private final Paint paint = new Paint();
    private RectF rect = new RectF();

    /* JADX INFO: compiled from: LinearGradientDrawable.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        private final float toRadian(float f10) {
            return (float) ((((double) f10) * 3.141592653589793d) / ((double) 180.0f));
        }

        public final LinearGradient createLinearGradient(float f10, int[] iArr, float[] fArr, int i10, int i11) {
            float f11 = i10;
            float f12 = f11 / 2.0f;
            float f13 = i11;
            float f14 = f13 / 2.0f;
            double radian = toRadian(f10);
            float fAbs = Math.abs(f11 * ((float) Math.cos(radian))) + Math.abs(f13 * ((float) Math.sin(radian)));
            float fSnap$default = LinearGradientDrawableKt.snap$default((((float) Math.cos(radian)) * fAbs) / 2.0f, 0.0f, 0.0f, 2, null);
            float fSnap$default2 = LinearGradientDrawableKt.snap$default((((float) Math.sin(radian)) * fAbs) / 2.0f, 0.0f, 0.0f, 2, null);
            return new LinearGradient(f12 - fSnap$default, f14 + fSnap$default2, f12 + fSnap$default, f14 - fSnap$default2, iArr, fArr, Shader.TileMode.CLAMP);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.drawRect(this.rect, this.paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.paint.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.paint.setAlpha(i10);
        invalidateSelf();
    }

    public LinearGradientDrawable(float f10, Colormap colormap) {
        this.angle = f10;
        this.colormap = colormap;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.paint.setShader(Companion.createLinearGradient(this.angle, this.colormap.getColors(), this.colormap.getPositions(), rect.width(), rect.height()));
        this.rect.set(rect);
    }
}
