package com.yandex.div.internal.widget.tabs;

import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public interface HeightCalculatorFactory {

    public interface GetTabCountFn {
        int apply();
    }

    public interface MeasureTabHeightFn {
        int apply(@NonNull ViewGroup viewGroup, int i10, int i11, int i12);
    }

    ViewPagerFixedSizeLayout.HeightCalculator getCardHeightCalculator(@NonNull ViewGroup viewGroup, @NonNull MeasureTabHeightFn measureTabHeightFn, @NonNull GetTabCountFn getTabCountFn);
}
