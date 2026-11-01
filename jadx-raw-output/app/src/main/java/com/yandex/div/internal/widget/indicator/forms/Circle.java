package com.yandex.div.internal.widget.indicator.forms;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import ck.p;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Style;

/* JADX INFO: compiled from: Circle.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Circle implements SingleIndicatorDrawer {
    private final IndicatorParams$Style params;
    private final Paint paint = new Paint();
    private final RectF rect = new RectF();

    @Override // com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer
    public void draw(Canvas canvas, float f10, float f11, IndicatorParams$ItemSize indicatorParams$ItemSize, int i10, float f12, int i11) {
        p.h(indicatorParams$ItemSize, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.ItemSize.Circle");
        IndicatorParams$ItemSize.Circle circle = (IndicatorParams$ItemSize.Circle) indicatorParams$ItemSize;
        this.paint.setColor(i10);
        RectF rectF = this.rect;
        rectF.left = f10 - circle.getRadius();
        rectF.top = f11 - circle.getRadius();
        rectF.right = f10 + circle.getRadius();
        rectF.bottom = f11 + circle.getRadius();
        canvas.drawCircle(this.rect.centerX(), this.rect.centerY(), circle.getRadius(), this.paint);
    }

    @Override // com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer
    public void drawSelected(Canvas canvas, RectF rectF) {
        this.paint.setColor(this.params.getActiveShape().getColor());
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2, this.paint);
    }

    public Circle(IndicatorParams$Style indicatorParams$Style) {
        this.params = indicatorParams$Style;
    }
}
