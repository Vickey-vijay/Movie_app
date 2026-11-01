package com.yandex.div.core.tooltip;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import ck.i;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.internal.Assert;

/* JADX INFO: compiled from: DivTooltipContainer.kt */
/* JADX INFO: loaded from: classes8.dex */
public class DivTooltipContainer extends DivViewWrapper {
    public DivTooltipContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DivTooltipContainer(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public DivTooltipContainer(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != null) {
            if (view.getVisibility() == 0) {
                BaseDivViewExtensionsKt.drawShadow(view, canvas);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // com.yandex.div.core.widget.DivViewWrapper, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            Assert.fail("Adding more than one child view to DivTooltipContainer is not allowed.");
        } else {
            super.addView(view, i10, layoutParams);
        }
    }

    public View getTooltipView() {
        if (getChildCount() == 0) {
            return null;
        }
        return getChildAt(0);
    }
}
