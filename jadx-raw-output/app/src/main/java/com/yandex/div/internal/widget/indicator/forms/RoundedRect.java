package com.yandex.div.internal.widget.indicator.forms;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import ck.p;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Shape;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Style;

/* JADX INFO: compiled from: RoundedRect.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RoundedRect implements SingleIndicatorDrawer {
    private final Paint paint = new Paint(1);
    private final IndicatorParams$Style params;
    private final RectF rect;
    private final Paint strokePaint;

    @Override // com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer
    public void draw(Canvas canvas, float f10, float f11, IndicatorParams$ItemSize indicatorParams$ItemSize, int i10, float f12, int i11) {
        p.h(indicatorParams$ItemSize, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.ItemSize.RoundedRect");
        IndicatorParams$ItemSize.RoundedRect roundedRect = (IndicatorParams$ItemSize.RoundedRect) indicatorParams$ItemSize;
        this.paint.setColor(i10);
        RectF rectF = this.rect;
        rectF.left = f10 - (roundedRect.getItemWidth() / 2.0f);
        rectF.top = f11 - (roundedRect.getItemHeight() / 2.0f);
        rectF.right = f10 + (roundedRect.getItemWidth() / 2.0f);
        float itemHeight = f11 + (roundedRect.getItemHeight() / 2.0f);
        rectF.bottom = itemHeight;
        if (f12 > 0.0f) {
            float f13 = f12 / 2.0f;
            rectF.left += f13;
            rectF.top += f13;
            rectF.right -= f13;
            rectF.bottom = itemHeight - f13;
        }
        canvas.drawRoundRect(this.rect, roundedRect.getCornerRadius(), roundedRect.getCornerRadius(), this.paint);
        if (i11 != 0) {
            if (f12 == 0.0f) {
                return;
            }
            Paint paint = this.strokePaint;
            paint.setColor(i11);
            paint.setStrokeWidth(f12);
            canvas.drawRoundRect(this.rect, roundedRect.getCornerRadius(), roundedRect.getCornerRadius(), this.strokePaint);
        }
    }

    @Override // com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer
    public void drawSelected(Canvas canvas, RectF rectF) {
        IndicatorParams$Shape activeShape = this.params.getActiveShape();
        p.h(activeShape, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.Shape.RoundedRect");
        IndicatorParams$Shape.RoundedRect roundedRect = (IndicatorParams$Shape.RoundedRect) activeShape;
        IndicatorParams$ItemSize.RoundedRect itemSize = roundedRect.getItemSize();
        this.paint.setColor(this.params.getActiveShape().getColor());
        canvas.drawRoundRect(rectF, itemSize.getCornerRadius(), itemSize.getCornerRadius(), this.paint);
        if (roundedRect.getStrokeColor() != 0) {
            if (roundedRect.getStrokeWidth() == 0.0f) {
                return;
            }
            Paint paint = this.strokePaint;
            paint.setColor(roundedRect.getStrokeColor());
            paint.setStrokeWidth(roundedRect.getStrokeWidth());
            canvas.drawRoundRect(rectF, itemSize.getCornerRadius(), itemSize.getCornerRadius(), this.strokePaint);
        }
    }

    public RoundedRect(IndicatorParams$Style indicatorParams$Style) {
        this.params = indicatorParams$Style;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        this.strokePaint = paint;
        this.rect = new RectF();
    }
}
