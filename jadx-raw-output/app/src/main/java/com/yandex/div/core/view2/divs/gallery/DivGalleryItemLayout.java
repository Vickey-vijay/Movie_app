package com.yandex.div.core.view2.divs.gallery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ck.p;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.internal.widget.DivLayoutParams;

/* JADX INFO: compiled from: DivGalleryItemLayout.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DivGalleryItemLayout extends DivViewWrapper {
    public DivGalleryItemLayout(Context context) {
        super(context, null, 0, 6, null);
    }

    @Override // com.yandex.div.core.widget.DivViewWrapper, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, 0, layoutParams);
        if (getLayoutParams() == null) {
            if ((view != null ? view.getLayoutParams() : null) != null) {
                setLayoutParams(view.getLayoutParams());
            }
        }
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams == null || !p.e(layoutParams, getLayoutParams());
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof DivLayoutParams)) {
            if (layoutParams == null) {
                return new DivLayoutParams(-2, -2);
            }
            return super.generateLayoutParams(layoutParams);
        }
        return layoutParams;
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return DivGalleryItemLayoutKt.setBy(generateDefaultLayoutParams(), layoutParams);
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View child = getChild();
        if (child != null) {
            child.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        View child = getChild();
        if (child == null) {
            setMeasuredDimension(View.resolveSizeAndState(getPaddingLeft() + getSuggestedMinimumWidth() + getPaddingRight(), i10, 0), View.resolveSizeAndState(getPaddingTop() + getSuggestedMinimumHeight() + getPaddingBottom(), i11, 0));
        } else {
            child.measure(i10, i11);
            setMeasuredDimension(child.getMeasuredWidthAndState(), child.getMeasuredHeightAndState());
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        View child = getChild();
        if (child == null) {
            super.setLayoutParams(layoutParams);
            return;
        }
        if (layoutParams != null) {
            DivGalleryItemLayoutKt.setBy(layoutParams, child.getLayoutParams());
        }
        super.setLayoutParams(layoutParams);
        child.setLayoutParams(layoutParams);
    }
}
