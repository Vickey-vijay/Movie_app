package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import ck.p;

/* JADX INFO: compiled from: ViewPagerFixedSizeLayout.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ViewPagerFixedSizeLayout extends FrameLayout {
    private int _collapsiblePaddingBottom;
    private boolean animateOnScroll;
    private HeightCalculator heightCalculator;
    private Integer lastHeightMeasureSpec;
    private Rect visibleRect;

    /* JADX INFO: compiled from: ViewPagerFixedSizeLayout.kt */
    public interface HeightCalculator {
        void dropMeasureCache();

        int measureHeight(int i10, int i11);

        void setPositionAndOffsetForMeasure(int i10, float f10);

        boolean shouldRequestLayoutOnScroll(int i10, float f10);
    }

    public ViewPagerFixedSizeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ViewPagerFixedSizeLayout(Context context, AttributeSet attributeSet, int i10, int i11, ck.i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public ViewPagerFixedSizeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.animateOnScroll = true;
    }

    public final boolean getAnimateOnScroll() {
        return this.animateOnScroll;
    }

    public final int getCollapsiblePaddingBottom() {
        return this._collapsiblePaddingBottom;
    }

    public final void setAnimateOnScroll(boolean z10) {
        this.animateOnScroll = z10;
    }

    public final void setCollapsiblePaddingBottom(int i10) {
        if (this._collapsiblePaddingBottom != i10) {
            this._collapsiblePaddingBottom = i10;
        }
    }

    public final void setHeightCalculator(HeightCalculator heightCalculator) {
        this.heightCalculator = heightCalculator;
    }

    public final boolean shouldRequestLayoutOnScroll(int i10, float f10) {
        HeightCalculator heightCalculator;
        if (!this.animateOnScroll || (heightCalculator = this.heightCalculator) == null || !heightCalculator.shouldRequestLayoutOnScroll(i10, f10)) {
            return false;
        }
        Rect rect = this.visibleRect;
        if (rect == null) {
            rect = new Rect();
            this.visibleRect = rect;
        }
        getLocalVisibleRect(rect);
        if (rect.height() == getHeight()) {
            return true;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824);
        Integer num = this.lastHeightMeasureSpec;
        int iMeasureHeight = heightCalculator.measureHeight(iMakeMeasureSpec, num != null ? num.intValue() : View.MeasureSpec.makeMeasureSpec(0, 0));
        if (iMeasureHeight != getHeight()) {
            return iMeasureHeight <= rect.bottom && rect.top <= iMeasureHeight;
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        this.lastHeightMeasureSpec = Integer.valueOf(i11);
        HeightCalculator heightCalculator = this.heightCalculator;
        if (heightCalculator != null) {
            p.g(heightCalculator);
            i11 = View.MeasureSpec.makeMeasureSpec(heightCalculator.measureHeight(i10, i11), 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
