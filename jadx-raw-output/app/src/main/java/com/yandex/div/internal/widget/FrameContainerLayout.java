package com.yandex.div.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import ck.i;
import ck.p;
import ck.s;
import com.yandex.div.core.widget.AspectView;
import com.yandex.div.core.widget.ViewsKt;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import jk.k;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import nj.x;

/* JADX INFO: compiled from: FrameContainerLayout.kt */
/* JADX INFO: loaded from: classes2.dex */
public class FrameContainerLayout extends DivViewGroup implements AspectView {
    public static final /* synthetic */ k<Object>[] $$delegatedProperties = {s.f(new MutablePropertyReference1Impl(FrameContainerLayout.class, "aspectRatio", "getAspectRatio()F", 0))};
    private final fk.d aspectRatio$delegate;
    private int childState;
    private final Rect foregroundPadding;
    private final Set<View> matchParentChildren;
    private int maxHeight;
    private int maxWidth;
    private final Set<View> measuredMatchParentChildren;
    private final Set<View> skippedMatchParentChildren;

    public FrameContainerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ FrameContainerLayout(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        this.maxWidth = 0;
        this.maxHeight = 0;
        this.childState = 0;
        boolean zIsExact = ViewsKt.isExact(i10);
        if (getUseAspect()) {
            i11 = !zIsExact ? View.MeasureSpec.makeMeasureSpec(0, 0) : ViewsKt.makeExactSpec(ek.b.c(View.MeasureSpec.getSize(i10) / getAspectRatio()));
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                measureChildWithDefinedSize(childAt, i10, i11);
            }
        }
        x.C(this.matchParentChildren, this.measuredMatchParentChildren);
        x.C(this.matchParentChildren, this.skippedMatchParentChildren);
        considerMatchParentChildrenInMaxSize(i10, i11);
        int iResolveSizeAndState = View.resolveSizeAndState(getDynamicWidth(i10), i10, this.childState);
        int dynamicHeight = getDynamicHeight(i10, i11, 16777215 & iResolveSizeAndState);
        if (ViewsKt.isUnspecified(i11)) {
            i11 = ViewsKt.makeExactSpec(dynamicHeight);
            remeasureWrapContentConstrainedChildren(i10, i11);
        }
        setMeasuredDimension(iResolveSizeAndState, View.resolveSizeAndState(dynamicHeight, i11, this.childState << 16));
        Iterator<T> it = this.matchParentChildren.iterator();
        while (it.hasNext()) {
            remeasureMatchParentChild((View) it.next(), i10, i11);
        }
        this.measuredMatchParentChildren.clear();
        this.skippedMatchParentChildren.clear();
        this.matchParentChildren.clear();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public FrameContainerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.foregroundPadding = new Rect();
        this.measuredMatchParentChildren = new LinkedHashSet();
        this.skippedMatchParentChildren = new LinkedHashSet();
        this.matchParentChildren = new LinkedHashSet();
        this.aspectRatio$delegate = AspectView.Companion.aspectRatioProperty$div_release();
    }

    private final void considerMatchParentChildrenInMaxSize(int i10, int i11) {
        if (this.matchParentChildren.isEmpty()) {
            return;
        }
        boolean zIsExact = ViewsKt.isExact(i10);
        boolean zIsExact2 = ViewsKt.isExact(i11);
        if (zIsExact && zIsExact2) {
            return;
        }
        boolean z10 = !zIsExact && this.maxWidth == 0;
        boolean z11 = (zIsExact2 || getUseAspect() || this.maxHeight != 0) ? false : true;
        if (!z10 && !z11) {
            Iterator<T> it = this.matchParentChildren.iterator();
            while (it.hasNext()) {
                considerMatchParentMargins((View) it.next(), zIsExact, zIsExact2);
            }
            return;
        }
        for (View view : this.matchParentChildren) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
            if (this.skippedMatchParentChildren.contains(view) && ((((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1 && z10) || (((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1 && z11))) {
                measureChildWithMargins(view, i10, 0, i11, 0);
                this.childState = View.combineMeasuredStates(this.childState, view.getMeasuredState());
                this.skippedMatchParentChildren.remove(view);
            }
            if (z10) {
                updateMaxWidth(view.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release());
            }
            if (z11) {
                updateMaxHeight(view.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release());
            }
        }
    }

    private final boolean matchDynamicHeight(DivLayoutParams divLayoutParams, boolean z10) {
        return !z10 && ((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1;
    }

    private final boolean matchDynamicWidth(DivLayoutParams divLayoutParams, boolean z10) {
        return !z10 && ((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1;
    }

    private final void updateMaxHeight(int i10) {
        this.maxHeight = Math.max(this.maxHeight, i10);
    }

    private final void updateMaxWidth(int i10) {
        this.maxWidth = Math.max(this.maxWidth, i10);
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new DivLayoutParams(-1, -1);
    }

    public float getAspectRatio() {
        return ((Number) this.aspectRatio$delegate.getValue(this, $$delegatedProperties[0])).floatValue();
    }

    @Override // com.yandex.div.core.widget.AspectView
    public void setAspectRatio(float f10) {
        this.aspectRatio$delegate.setValue(this, $$delegatedProperties[0], Float.valueOf(f10));
    }

    private final void considerMatchParentMargins(View view, boolean z10, boolean z11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        if (matchDynamicWidth(divLayoutParams, z10)) {
            updateMaxWidth(view.getMinimumWidth() + divLayoutParams.getHorizontalMargins$div_release());
        }
        if (matchDynamicHeight(divLayoutParams, z11)) {
            updateMaxHeight(view.getMinimumHeight() + divLayoutParams.getVerticalMargins$div_release());
        }
    }

    private final int getDynamicHeight(int i10, int i11, int i12) {
        if (ViewsKt.isExact(i11)) {
            return 0;
        }
        if (isDynamicAspect(i10)) {
            return ek.b.c(i12 / getAspectRatio());
        }
        int iD = ik.k.d(this.maxHeight + getVerticalPadding(), getSuggestedMinimumHeight());
        Drawable foreground = getForeground();
        if (foreground != null) {
            return ik.k.d(iD, foreground.getMinimumHeight());
        }
        return iD;
    }

    private final int getDynamicWidth(int i10) {
        if (ViewsKt.isExact(i10)) {
            return 0;
        }
        int iD = ik.k.d(this.maxWidth + getHorizontalPadding(), getSuggestedMinimumWidth());
        Drawable foreground = getForeground();
        if (foreground != null) {
            return ik.k.d(iD, foreground.getMinimumWidth());
        }
        return iD;
    }

    private final int getHorizontalPadding() {
        return getPaddingLeftWithForeground() + getPaddingRightWithForeground();
    }

    private final int getPaddingBottomWithForeground() {
        return Math.max(getPaddingBottom(), this.foregroundPadding.bottom);
    }

    private final int getPaddingLeftWithForeground() {
        return Math.max(getPaddingLeft(), this.foregroundPadding.left);
    }

    private final int getPaddingRightWithForeground() {
        return Math.max(getPaddingRight(), this.foregroundPadding.right);
    }

    private final int getPaddingTopWithForeground() {
        return Math.max(getPaddingTop(), this.foregroundPadding.top);
    }

    private final boolean getUseAspect() {
        boolean z10;
        if (getAspectRatio() == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }

    private final int getVerticalPadding() {
        return getPaddingTopWithForeground() + getPaddingBottomWithForeground();
    }

    private final boolean isDynamicAspect(int i10) {
        if (getUseAspect() && !ViewsKt.isExact(i10)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0071  */
    /* JADX WARN: Code duplicated, block: B:19:0x0075  */
    /* JADX WARN: Code duplicated, block: B:20:0x007c  */
    private final void layoutChildren(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int paddingLeftWithForeground = getPaddingLeftWithForeground();
        int paddingRightWithForeground = (i12 - i10) - getPaddingRightWithForeground();
        int paddingTopWithForeground = getPaddingTopWithForeground();
        int paddingBottomWithForeground = (i13 - i11) - getPaddingBottomWithForeground();
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int absoluteGravity = Gravity.getAbsoluteGravity(divLayoutParams.getGravity(), getLayoutDirection());
                int gravity = divLayoutParams.getGravity() & 112;
                int i18 = absoluteGravity & 7;
                if (i18 != 1) {
                    if (i18 != 5) {
                        i14 = ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                    } else {
                        i15 = (paddingRightWithForeground - measuredWidth) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin;
                    }
                    if (gravity != 16) {
                        if (gravity != 80) {
                            i16 = ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin + paddingTopWithForeground;
                        } else {
                            i16 = (paddingBottomWithForeground - measuredHeight) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin;
                        }
                    } else {
                        i16 = paddingTopWithForeground + (((((paddingBottomWithForeground - paddingTopWithForeground) - measuredHeight) + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin) / 2);
                    }
                    childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
                } else {
                    i14 = ((((paddingRightWithForeground - paddingLeftWithForeground) - measuredWidth) + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin) / 2;
                }
                i15 = i14 + paddingLeftWithForeground;
                if (gravity != 16) {
                    if (gravity != 80) {
                        i16 = ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin + paddingTopWithForeground;
                    } else {
                        i16 = (paddingBottomWithForeground - measuredHeight) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin;
                    }
                } else {
                    i16 = paddingTopWithForeground + (((((paddingBottomWithForeground - paddingTopWithForeground) - measuredHeight) + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin) / 2);
                }
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    private final boolean matchDynamicSize(DivLayoutParams divLayoutParams, boolean z10, boolean z11) {
        if (!matchDynamicWidth(divLayoutParams, z10) && !matchDynamicHeight(divLayoutParams, z11)) {
            return false;
        }
        return true;
    }

    private final void measureChildWithDefinedSize(View view, int i10, int i11) {
        boolean z10;
        boolean z11;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        boolean zIsExact = ViewsKt.isExact(i10);
        boolean zIsExact2 = ViewsKt.isExact(i11);
        boolean z12 = false;
        if (((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) divLayoutParams).height;
        if (i12 == -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((zIsExact && zIsExact2) || (!zIsExact2 ? !(!zIsExact ? z10 && i12 <= 0 : z11) : !z10)) {
            z12 = true;
        }
        if (!z12) {
            if (matchDynamicSize(divLayoutParams, zIsExact, zIsExact2)) {
                this.skippedMatchParentChildren.add(view);
                return;
            }
            return;
        }
        measureChildWithMargins(view, i10, 0, i11, 0);
        this.childState = View.combineMeasuredStates(this.childState, view.getMeasuredState());
        if (matchDynamicSize(divLayoutParams, zIsExact, zIsExact2)) {
            this.measuredMatchParentChildren.add(view);
        }
        if (!zIsExact && !z10) {
            updateMaxWidth(view.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release());
        }
        if (!zIsExact2 && !z11 && !getUseAspect()) {
            updateMaxHeight(view.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release());
        }
    }

    private final void remeasureMatchParentChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        int horizontalPadding = getHorizontalPadding() + divLayoutParams.getHorizontalMargins$div_release();
        int verticalPadding = getVerticalPadding() + divLayoutParams.getVerticalMargins$div_release();
        if (((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1) {
            i10 = ViewsKt.makeExactSpec(getMeasuredWidth());
        }
        int i12 = i10;
        DivViewGroup.Companion companion = DivViewGroup.Companion;
        int childMeasureSpec = companion.getChildMeasureSpec(i12, horizontalPadding, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, view.getMinimumWidth(), divLayoutParams.getMaxWidth());
        if (((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1) {
            i11 = ViewsKt.makeExactSpec(getMeasuredHeight());
        }
        view.measure(childMeasureSpec, companion.getChildMeasureSpec(i11, verticalPadding, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, view.getMinimumHeight(), divLayoutParams.getMaxHeight()));
        if (this.skippedMatchParentChildren.contains(view)) {
            this.childState = View.combineMeasuredStates(this.childState, view.getMeasuredState());
        }
    }

    private final void remeasureWrapContentConstrainedChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        if (((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams)).height == -3) {
            measureChildWithMargins(view, i10, 0, i11, 0);
            this.matchParentChildren.remove(view);
        }
    }

    private final void remeasureWrapContentConstrainedChildren(int i10, int i11) {
        if (!isDynamicAspect(i10)) {
            return;
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                remeasureWrapContentConstrainedChild(childAt, i10, i11);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        layoutChildren(getLeft(), getTop(), getRight(), getBottom());
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (getForegroundGravity() == i10) {
            return;
        }
        super.setForegroundGravity(i10);
        if (getForegroundGravity() == 119 && getForeground() != null) {
            getForeground().getPadding(this.foregroundPadding);
        } else {
            this.foregroundPadding.setEmpty();
        }
        requestLayout();
    }
}
