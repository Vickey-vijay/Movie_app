package com.yandex.div.internal.widget.tabs;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.internal.Log;

/* JADX INFO: loaded from: classes2.dex */
@MainThread
public abstract class BaseCardHeightCalculator implements ViewPagerFixedSizeLayout.HeightCalculator {

    @NonNull
    private final ViewGroup mChannelGroup;

    @NonNull
    private final HeightCalculatorFactory.GetTabCountFn mGetTabCountFn;

    @NonNull
    private final HeightCalculatorFactory.MeasureTabHeightFn mMeasureTabHeightFn;

    @Nullable
    private Bundle mPendingState;

    @NonNull
    public final SparseArray<TabMeasurement> mTabsHeightCache = new SparseArray<>();
    private int mPosition = 0;
    private float mPositionOffset = 0.0f;

    public abstract int getOptimalHeight(@NonNull TabMeasurement tabMeasurement, int i10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int lambda$measureHeight$0(int i10, int i11, int i12) {
        return this.mMeasureTabHeightFn.apply(this.mChannelGroup, i10, i11, i12);
    }

    private static int logAndReturnHeight(int i10, int i11, float f10) {
        Log.d("[Y:BaseCardHeightCalculator]", "New optimal height for tab " + i11 + " with position offset " + f10 + " is " + i10);
        return i10;
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public void dropMeasureCache() {
        Log.d("[Y:BaseCardHeightCalculator]", "reseting layout...");
        this.mPendingState = null;
        this.mTabsHeightCache.clear();
    }

    public boolean isTabsHeightsIsUnknown() {
        return this.mTabsHeightCache.size() == 0;
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public int measureHeight(int i10, final int i11) {
        TabMeasurement tabMeasurement = this.mTabsHeightCache.get(i10);
        if (tabMeasurement == null) {
            int iApply = this.mGetTabCountFn.apply();
            if (iApply == 0) {
                return 0;
            }
            final int size = View.MeasureSpec.getSize(i10);
            TabMeasurement tabMeasurement2 = new TabMeasurement(iApply, new TabMeasurement.TabMeasurementFunction() { // from class: com.yandex.div.internal.widget.tabs.a
                @Override // com.yandex.div.internal.widget.tabs.TabMeasurement.TabMeasurementFunction
                public final int getTabHeight(int i12) {
                    return this.f45850a.lambda$measureHeight$0(size, i11, i12);
                }
            });
            Bundle bundle = this.mPendingState;
            if (bundle != null) {
                tabMeasurement2.restoreState(bundle, i10);
                tabMeasurement2.removeState(this.mPendingState, i10);
                if (this.mPendingState.isEmpty()) {
                    this.mPendingState = null;
                }
            }
            this.mTabsHeightCache.put(i10, tabMeasurement2);
            tabMeasurement = tabMeasurement2;
        }
        return logAndReturnHeight(getOptimalHeight(tabMeasurement, this.mPosition, this.mPositionOffset), this.mPosition, this.mPositionOffset);
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public void setPositionAndOffsetForMeasure(int i10, float f10) {
        Log.d("[Y:BaseCardHeightCalculator]", "request layout for tab " + i10 + " with position offset " + f10);
        this.mPosition = i10;
        this.mPositionOffset = f10;
    }

    public BaseCardHeightCalculator(@NonNull ViewGroup viewGroup, @NonNull HeightCalculatorFactory.MeasureTabHeightFn measureTabHeightFn, @NonNull HeightCalculatorFactory.GetTabCountFn getTabCountFn) {
        this.mChannelGroup = viewGroup;
        this.mMeasureTabHeightFn = measureTabHeightFn;
        this.mGetTabCountFn = getTabCountFn;
    }
}
