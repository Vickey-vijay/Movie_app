package com.yandex.div.internal.widget.indicator.animations;

import android.animation.ArgbEvaluator;
import android.graphics.RectF;
import android.util.SparseArray;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import ck.p;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Shape;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Style;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: ScaleIndicatorAnimator.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ScaleIndicatorAnimator implements IndicatorAnimator {
    private int itemsCount;
    private final IndicatorParams$Style styleParams;
    private final ArgbEvaluator colorEvaluator = new ArgbEvaluator();
    private final SparseArray<Float> itemsScale = new SparseArray<>();

    private final float interpolate(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    private final void scaleIndicatorByOffset(int i10, float f10) {
        if (f10 == 0.0f) {
            this.itemsScale.remove(i10);
        } else {
            this.itemsScale.put(i10, Float.valueOf(Math.abs(f10)));
        }
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public RectF getSelectedItemRect(float f10, float f11, float f12, boolean z10) {
        return null;
    }

    @ColorInt
    private final int calculateColor(@FloatRange(from = 0.0d, to = 1.0d) float f10, int i10, int i11) {
        Object objEvaluate = this.colorEvaluator.evaluate(f10, Integer.valueOf(i10), Integer.valueOf(i11));
        p.h(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objEvaluate).intValue();
    }

    private final float getScaleAt(int i10) {
        return this.itemsScale.get(i10, Float.valueOf(0.0f)).floatValue();
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public int getBorderColorAt(int i10) {
        IndicatorParams$Shape activeShape = this.styleParams.getActiveShape();
        if (!(activeShape instanceof IndicatorParams$Shape.RoundedRect)) {
            return 0;
        }
        IndicatorParams$Shape inactiveShape = this.styleParams.getInactiveShape();
        p.h(inactiveShape, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.Shape.RoundedRect");
        return calculateColor(getScaleAt(i10), ((IndicatorParams$Shape.RoundedRect) inactiveShape).getStrokeColor(), ((IndicatorParams$Shape.RoundedRect) activeShape).getStrokeColor());
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public float getBorderWidthAt(int i10) {
        IndicatorParams$Shape activeShape = this.styleParams.getActiveShape();
        if (!(activeShape instanceof IndicatorParams$Shape.RoundedRect)) {
            return 0.0f;
        }
        IndicatorParams$Shape inactiveShape = this.styleParams.getInactiveShape();
        p.h(inactiveShape, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.Shape.RoundedRect");
        IndicatorParams$Shape.RoundedRect roundedRect = (IndicatorParams$Shape.RoundedRect) inactiveShape;
        return roundedRect.getStrokeWidth() + ((((IndicatorParams$Shape.RoundedRect) activeShape).getStrokeWidth() - roundedRect.getStrokeWidth()) * getScaleAt(i10));
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public IndicatorParams$ItemSize getItemSizeAt(int i10) {
        IndicatorParams$Shape activeShape = this.styleParams.getActiveShape();
        if (activeShape instanceof IndicatorParams$Shape.Circle) {
            IndicatorParams$Shape inactiveShape = this.styleParams.getInactiveShape();
            p.h(inactiveShape, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.Shape.Circle");
            return new IndicatorParams$ItemSize.Circle(interpolate(((IndicatorParams$Shape.Circle) inactiveShape).getItemSize().getRadius(), ((IndicatorParams$Shape.Circle) activeShape).getItemSize().getRadius(), getScaleAt(i10)));
        }
        if (!(activeShape instanceof IndicatorParams$Shape.RoundedRect)) {
            throw new NoWhenBranchMatchedException();
        }
        IndicatorParams$Shape inactiveShape2 = this.styleParams.getInactiveShape();
        p.h(inactiveShape2, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.Shape.RoundedRect");
        IndicatorParams$Shape.RoundedRect roundedRect = (IndicatorParams$Shape.RoundedRect) inactiveShape2;
        IndicatorParams$Shape.RoundedRect roundedRect2 = (IndicatorParams$Shape.RoundedRect) activeShape;
        return new IndicatorParams$ItemSize.RoundedRect(interpolate(roundedRect.getItemSize().getItemWidth() + roundedRect.getStrokeWidth(), roundedRect2.getItemSize().getItemWidth() + roundedRect2.getStrokeWidth(), getScaleAt(i10)), interpolate(roundedRect.getItemSize().getItemHeight() + roundedRect.getStrokeWidth(), roundedRect2.getItemSize().getItemHeight() + roundedRect2.getStrokeWidth(), getScaleAt(i10)), interpolate(roundedRect.getItemSize().getCornerRadius(), roundedRect2.getItemSize().getCornerRadius(), getScaleAt(i10)));
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public void onPageScrolled(int i10, float f10) {
        scaleIndicatorByOffset(i10, 1.0f - f10);
        int i11 = this.itemsCount;
        if (i10 < i11 - 1) {
            scaleIndicatorByOffset(i10 + 1, f10);
        } else if (i11 > 1) {
            scaleIndicatorByOffset(0, f10);
        }
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public void onPageSelected(int i10) {
        this.itemsScale.clear();
        this.itemsScale.put(i10, Float.valueOf(1.0f));
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public void setItemsCount(int i10) {
        this.itemsCount = i10;
    }

    public ScaleIndicatorAnimator(IndicatorParams$Style indicatorParams$Style) {
        this.styleParams = indicatorParams$Style;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public int getColorAt(int i10) {
        return calculateColor(getScaleAt(i10), this.styleParams.getInactiveShape().getColor(), this.styleParams.getActiveShape().getColor());
    }
}
