package com.mgs.carparking.widgets.viewpager;

import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes9.dex */
public class MyGallyPageTransformer implements ViewPager.PageTransformer {
    @Override // androidx.viewpager.widget.ViewPager.PageTransformer
    public void transformPage(View view, float f10) {
        float fMax = Math.max(0.85f, 1.0f - Math.abs(f10));
        if (f10 < -1.0f) {
            view.setScaleX(fMax);
            view.setScaleY(fMax);
            return;
        }
        if (f10 < 0.0f) {
            view.setScaleX(fMax);
            view.setScaleY(fMax);
        } else if (f10 >= 0.0f && f10 < 1.0f) {
            view.setScaleX(fMax);
            view.setScaleY(fMax);
        } else if (f10 >= 1.0f) {
            view.setScaleX(fMax);
            view.setScaleY(fMax);
        }
    }
}
