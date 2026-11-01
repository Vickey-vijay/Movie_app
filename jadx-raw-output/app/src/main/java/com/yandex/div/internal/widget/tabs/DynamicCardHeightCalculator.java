package com.yandex.div.internal.widget.tabs;

import android.view.ViewGroup;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
@MainThread
public class DynamicCardHeightCalculator extends BaseCardHeightCalculator {
    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public boolean shouldRequestLayoutOnScroll(int i10, float f10) {
        return true;
    }

    public DynamicCardHeightCalculator(@NonNull ViewGroup viewGroup, @NonNull HeightCalculatorFactory.MeasureTabHeightFn measureTabHeightFn, @NonNull HeightCalculatorFactory.GetTabCountFn getTabCountFn) {
        super(viewGroup, measureTabHeightFn, getTabCountFn);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseCardHeightCalculator
    public int getOptimalHeight(@NonNull TabMeasurement tabMeasurement, int i10, float f10) {
        if (f10 < 0.01f) {
            return tabMeasurement.getTabHeight(i10);
        }
        int tabHeight = tabMeasurement.getTabHeight(i10);
        return Math.round(tabHeight + ((tabMeasurement.getTabHeight(i10 + 1) - tabHeight) * f10));
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseCardHeightCalculator, com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public int measureHeight(int i10, int i11) {
        dropMeasureCache();
        return super.measureHeight(i10, i11);
    }
}
