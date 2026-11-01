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

/* JADX INFO: compiled from: CircleDrawable.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class CircleDrawable extends Drawable {
    private final Paint mainPaint;
    private final Params params;
    private final RectF rect;
    private final Paint strokePaint;

    /* JADX INFO: compiled from: CircleDrawable.kt */
    public static final class Params {
        private final int color;
        private final float radius;
        private final Integer strokeColor;
        private final Float strokeWidth;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return Float.compare(this.radius, params.radius) == 0 && this.color == params.color && p.e(this.strokeColor, params.strokeColor) && p.e(this.strokeWidth, params.strokeWidth);
        }

        public int hashCode() {
            int iHashCode = ((Float.hashCode(this.radius) * 31) + Integer.hashCode(this.color)) * 31;
            Integer num = this.strokeColor;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Float f10 = this.strokeWidth;
            return iHashCode2 + (f10 != null ? f10.hashCode() : 0);
        }

        public String toString() {
            return "Params(radius=" + this.radius + ", color=" + this.color + ", strokeColor=" + this.strokeColor + ", strokeWidth=" + this.strokeWidth + ')';
        }

        public final int getColor() {
            return this.color;
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

        public Params(@Px float f10, int i10, Integer num, Float f11) {
            this.radius = f10;
            this.color = i10;
            this.strokeColor = num;
            this.strokeWidth = f11;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.mainPaint.setColor(this.params.getColor());
        this.rect.set(getBounds());
        canvas.drawCircle(this.rect.centerX(), this.rect.centerY(), this.params.getRadius(), this.mainPaint);
        if (this.strokePaint != null) {
            canvas.drawCircle(this.rect.centerX(), this.rect.centerY(), this.params.getRadius(), this.strokePaint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return ((int) this.params.getRadius()) * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return ((int) this.params.getRadius()) * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Assert.fail("Setting alpha is not implemented");
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Assert.fail("Setting color filter is not implemented");
    }

    public CircleDrawable(Params params) {
        Paint paint;
        this.params = params;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(params.getColor());
        this.mainPaint = paint2;
        if (params.getStrokeColor() != null && params.getStrokeWidth() != null) {
            paint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(params.getStrokeColor().intValue());
            paint.setStrokeWidth(params.getStrokeWidth().floatValue());
        } else {
            paint = null;
        }
        this.strokePaint = paint;
        float f10 = 2;
        RectF rectF = new RectF(0.0f, 0.0f, params.getRadius() * f10, params.getRadius() * f10);
        this.rect = rectF;
        Rect rect = new Rect();
        rectF.roundOut(rect);
        setBounds(rect);
    }
}
