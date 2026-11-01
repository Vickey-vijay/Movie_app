package com.yandex.div.internal.widget.tabs;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.yandex.div.internal.Assert;

/* JADX INFO: loaded from: classes9.dex */
@MainThread
public class MaxCardHeightCalculator extends BaseCardHeightCalculator {
    private boolean firstTabDiffers() {
        Assert.assertTrue(this.mTabsHeightCache.size() > 0);
        SparseArray<TabMeasurement> sparseArray = this.mTabsHeightCache;
        TabMeasurement tabMeasurementValueAt = sparseArray.valueAt(sparseArray.size() - 1);
        return tabMeasurementValueAt.getFirstTabHeight() != tabMeasurementValueAt.getMaxTabHeight();
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseCardHeightCalculator
    public int getOptimalHeight(@NonNull TabMeasurement tabMeasurement, int i10, float f10) {
        if (i10 > 0) {
            return tabMeasurement.getMaxTabHeight();
        }
        if (f10 < 0.01f) {
            return tabMeasurement.getFirstTabHeight();
        }
        int firstTabHeight = tabMeasurement.getFirstTabHeight();
        return Math.round(firstTabHeight + ((tabMeasurement.getMaxTabHeight() - firstTabHeight) * f10));
    }

    public MaxCardHeightCalculator(@NonNull ViewGroup viewGroup, @NonNull HeightCalculatorFactory.MeasureTabHeightFn measureTabHeightFn, @NonNull HeightCalculatorFactory.GetTabCountFn getTabCountFn) {
        super(viewGroup, measureTabHeightFn, getTabCountFn);
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public boolean shouldRequestLayoutOnScroll(int i10, float f10) {
        if (isTabsHeightsIsUnknown()) {
            return true;
        }
        if ((i10 == 0 || (i10 == 1 && f10 <= 0.0f)) && firstTabDiffers()) {
            return true;
        }
        return false;
    }
}
