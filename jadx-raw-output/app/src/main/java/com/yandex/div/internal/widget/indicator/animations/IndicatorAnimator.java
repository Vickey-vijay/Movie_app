package com.yandex.div.internal.widget.indicator.animations;

import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;

/* JADX INFO: compiled from: IndicatorAnimator.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface IndicatorAnimator {
    int getBorderColorAt(int i10);

    float getBorderWidthAt(int i10);

    int getColorAt(int i10);

    IndicatorParams$ItemSize getItemSizeAt(int i10);

    RectF getSelectedItemRect(float f10, float f11, float f12, boolean z10);

    void onPageScrolled(int i10, float f10);

    default void onPageSelected(int i10) {
    }

    default void overrideItemWidth(float f10) {
    }

    default void setItemsCount(int i10) {
    }

    default void updateSpaceBetweenCenters(float f10) {
    }
}
