package com.yandex.div.core.view2.divs.gallery;

import android.view.ViewGroup;
import ck.p;
import com.yandex.div.internal.widget.DivLayoutParams;

/* JADX INFO: compiled from: DivGalleryItemLayout.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivGalleryItemLayoutKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup.LayoutParams setBy(ViewGroup.LayoutParams layoutParams, ViewGroup.LayoutParams layoutParams2) {
        if (layoutParams2 != null && !p.e(layoutParams, layoutParams2)) {
            layoutParams.width = layoutParams2.width;
            layoutParams.height = layoutParams2.height;
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams.leftMargin = marginLayoutParams2.leftMargin;
                marginLayoutParams.topMargin = marginLayoutParams2.topMargin;
                marginLayoutParams.rightMargin = marginLayoutParams2.rightMargin;
                marginLayoutParams.bottomMargin = marginLayoutParams2.bottomMargin;
                if (marginLayoutParams2.isMarginRelative()) {
                    marginLayoutParams.setMarginStart(marginLayoutParams2.getMarginStart());
                    marginLayoutParams.setMarginEnd(marginLayoutParams2.getMarginEnd());
                }
            }
            if ((layoutParams instanceof DivLayoutParams) && (layoutParams2 instanceof DivLayoutParams)) {
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                DivLayoutParams divLayoutParams2 = (DivLayoutParams) layoutParams2;
                divLayoutParams.setMaxWidth(divLayoutParams2.getMaxWidth());
                divLayoutParams.setMaxHeight(divLayoutParams2.getMaxHeight());
            }
        }
        return layoutParams;
    }
}
