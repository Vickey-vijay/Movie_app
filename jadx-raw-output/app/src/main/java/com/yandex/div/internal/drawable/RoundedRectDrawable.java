package com.yandex.div.internal.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.Px;
import ck.p;
import com.yandex.div.internal.Assert;

/* JADX INFO: compiled from: RoundedRectDrawable.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class RoundedRectDrawable extends Drawable {
    private final Paint mainPaint;
    private final float offset;
    private final Params params;
    private final float radiusX;
    private final float radiusY;
    private final RectF rect;
    private final float strokeOffset;
    private final Paint strokePaint;

    /* JADX INFO: compiled from: RoundedRectDrawable.kt */
    public static final class Params {
        private final int color;
        private final float height;
        private final float radius;
        private final Integer strokeColor;
        private final Float strokeWidth;
        private final float width;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return Float.compare(this.width, params.width) == 0 && Float.compare(this.height, params.height) == 0 && this.color == params.color && Float.compare(this.radius, params.radius) == 0 && p.e(this.strokeColor, params.strokeColor) && p.e(this.strokeWidth, params.strokeWidth);
        }

        public int hashCode() {
            int iHashCode = ((((((Float.hashCode(this.width) * 31) + Float.hashCode(this.height)) * 31) + Integer.hashCode(this.color)) * 31) + Float.hashCode(this.radius)) * 31;
            Integer num = this.strokeColor;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Float f10 = this.strokeWidth;
            return iHashCode2 + (f10 != null ? f10.hashCode() : 0);
        }

        public String toString() {
            return "Params(width=" + this.width + ", height=" + this.height + ", color=" + this.color + ", radius=" + this.radius + ", strokeColor=" + this.strokeColor + ", strokeWidth=" + this.strokeWidth + ')';
        }

        public final int getColor() {
            return this.color;
        }

        public final float getHeight() {
            return this.height;
        }

        public final float getRadius() {
            return this.radius;
        }

        public final Integer getStrokeColor() {
            return this.strokeColor;
        }

        public final Float getStrokeWidth() {
            return this.strokeWidth;
        }

        public final float getWidth() {
            return this.width;
        }

        public Params(@Px float f10, @Px float f11, int i10, @Px float f12, Integer num, @Px Float f13) {
            this.width = f10;
            this.height = f11;
            this.color = i10;
            this.radius = f12;
            this.strokeColor = num;
            this.strokeWidth = f13;
        }
    }

    private final float considerSize(float f10, float f11) {
        return f10 - (f10 >= f11 / ((float) 2) ? this.strokeOffset : 0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        setRectWithOffset(this.offset);
        canvas.drawRoundRect(this.rect, this.radiusX, this.radiusY, this.mainPaint);
        Paint paint = this.strokePaint;
        if (paint != null) {
            setRectWithOffset(this.strokeOffset);
            canvas.drawRoundRect(this.rect, this.params.getRadius(), this.params.getRadius(), paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.params.getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) this.params.getWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Assert.fail("Setting alpha is not implemented");
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Assert.fail("Setting color filter is not implemented");
    }

    public RoundedRectDrawable(Params params) {
        this.params = params;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(params.getColor());
        this.mainPaint = paint;
        this.radiusX = considerSize(params.getRadius(), params.getHeight());
        this.radiusY = considerSize(params.getRadius(), params.getWidth());
        RectF rectF = new RectF(0.0f, 0.0f, params.getWidth(), params.getHeight());
        this.rect = rectF;
        if (params.getStrokeColor() != null && params.getStrokeWidth() != null) {
            Paint paint2 = new Paint(1);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(params.getStrokeColor().intValue());
            paint2.setStrokeWidth(params.getStrokeWidth().floatValue());
            this.strokePaint = paint2;
            this.strokeOffset = params.getStrokeWidth().floatValue() / 2;
            this.offset = 1.0f;
        } else {
            this.strokePaint = null;
            this.strokeOffset = 0.0f;
            this.offset = 0.0f;
        }
        Rect rect = new Rect();
        rectF.roundOut(rect);
        setBounds(rect);
    }

    private final void setRectWithOffset(float f10) {
        Rect bounds = getBounds();
        this.rect.set(bounds.left + f10, bounds.top + f10, bounds.right - f10, bounds.bottom - f10);
    }
}
