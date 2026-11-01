package com.yandex.div.internal.widget.indicator.animations;

import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Shape;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Style;
import ik.k;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: SliderIndicatorAnimator.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class SliderIndicatorAnimator implements IndicatorAnimator {
    private final IndicatorParams$ItemSize inactiveItemSizeWithBorders;
    private final RectF itemRect = new RectF();
    private float itemWidthOverride;
    private float selectedPositionOffset;
    private float spaceBetweenCenters;
    private final IndicatorParams$Style styleParams;

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public int getBorderColorAt(int i10) {
        return this.styleParams.getInactiveShape().getBorderColor();
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public float getBorderWidthAt(int i10) {
        return this.styleParams.getInactiveShape().getBorderWidth();
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public int getColorAt(int i10) {
        return this.styleParams.getInactiveShape().getColor();
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public IndicatorParams$ItemSize getItemSizeAt(int i10) {
        return this.inactiveItemSizeWithBorders;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public RectF getSelectedItemRect(float f10, float f11, float f12, boolean z10) {
        float width = this.itemWidthOverride;
        if (width == 0.0f) {
            width = this.styleParams.getActiveShape().getItemSize().getWidth();
        }
        if (z10) {
            RectF rectF = this.itemRect;
            float f13 = this.spaceBetweenCenters;
            float f14 = width / 2.0f;
            rectF.left = (f10 - k.f(this.selectedPositionOffset * f13, f13)) - f14;
            this.itemRect.right = (f10 - k.c(this.spaceBetweenCenters * this.selectedPositionOffset, 0.0f)) + f14;
        } else {
            float f15 = width / 2.0f;
            this.itemRect.left = (k.c(this.spaceBetweenCenters * this.selectedPositionOffset, 0.0f) + f10) - f15;
            RectF rectF2 = this.itemRect;
            float f16 = this.spaceBetweenCenters;
            rectF2.right = f10 + k.f(this.selectedPositionOffset * f16, f16) + f15;
        }
        this.itemRect.top = f11 - (this.styleParams.getActiveShape().getItemSize().getHeight() / 2.0f);
        this.itemRect.bottom = f11 + (this.styleParams.getActiveShape().getItemSize().getHeight() / 2.0f);
        RectF rectF3 = this.itemRect;
        float f17 = rectF3.left;
        if (f17 < 0.0f) {
            rectF3.offset(-f17, 0.0f);
        }
        RectF rectF4 = this.itemRect;
        float f18 = rectF4.right;
        if (f18 > f12) {
            rectF4.offset(-(f18 - f12), 0.0f);
        }
        return this.itemRect;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public void onPageScrolled(int i10, float f10) {
        this.selectedPositionOffset = f10;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public void overrideItemWidth(float f10) {
        this.itemWidthOverride = f10;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public void updateSpaceBetweenCenters(float f10) {
        this.spaceBetweenCenters = f10;
    }

    public SliderIndicatorAnimator(IndicatorParams$Style indicatorParams$Style) {
        IndicatorParams$ItemSize indicatorParams$ItemSizeCopy$default;
        this.styleParams = indicatorParams$Style;
        IndicatorParams$Shape inactiveShape = indicatorParams$Style.getInactiveShape();
        if (inactiveShape instanceof IndicatorParams$Shape.Circle) {
            indicatorParams$ItemSizeCopy$default = ((IndicatorParams$Shape.Circle) inactiveShape).getItemSize();
        } else if (inactiveShape instanceof IndicatorParams$Shape.RoundedRect) {
            IndicatorParams$Shape.RoundedRect roundedRect = (IndicatorParams$Shape.RoundedRect) inactiveShape;
            indicatorParams$ItemSizeCopy$default = IndicatorParams$ItemSize.RoundedRect.copy$default(roundedRect.getItemSize(), roundedRect.getItemSize().getItemWidth() + roundedRect.getStrokeWidth(), roundedRect.getItemSize().getItemHeight() + roundedRect.getStrokeWidth(), 0.0f, 4, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.inactiveItemSizeWithBorders = indicatorParams$ItemSizeCopy$default;
    }
}
