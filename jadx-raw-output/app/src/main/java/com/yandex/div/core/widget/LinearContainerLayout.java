package com.yandex.div.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.GravityCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import ck.i;
import ck.p;
import ck.s;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.internal.widget.DivViewGroup;
import ek.b;
import fk.d;
import ik.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jk.k;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import mj.r;
import nj.w;

/* JADX INFO: compiled from: LinearContainerLayout.kt */
/* JADX INFO: loaded from: classes7.dex */
public class LinearContainerLayout extends DivViewGroup implements AspectView {
    public static final /* synthetic */ k<Object>[] $$delegatedProperties = {s.f(new MutablePropertyReference1Impl(LinearContainerLayout.class, "orientation", "getOrientation()I", 0)), s.f(new MutablePropertyReference1Impl(LinearContainerLayout.class, "aspectRatio", "getAspectRatio()F", 0)), s.f(new MutablePropertyReference1Impl(LinearContainerLayout.class, "showDividers", "getShowDividers()I", 0))};
    private final d aspectRatio$delegate;
    private int childMeasuredState;
    private final List<View> constrainedChildren;
    private final Set<View> crossMatchParentChildren;
    private Drawable dividerDrawable;
    private int dividerHeight;
    private int dividerMarginBottom;
    private int dividerMarginLeft;
    private int dividerMarginRight;
    private int dividerMarginTop;
    private int dividerWidth;
    private int firstVisibleChildIndex;
    private int itemSpacingPx;
    private int lastVisibleChildIndex;
    private int maxBaselineAscent;
    private int maxBaselineDescent;
    private int maxCrossSize;
    private final DivViewGroup.OffsetsHolder offsetsHolder;
    private final d orientation$delegate;
    private final d showDividers$delegate;
    private final Set<View> skippedMatchParentChildren;
    private int totalConstrainedLength;
    private int totalLength;
    private int totalMatchParentLength;
    private float totalWeight;

    public LinearContainerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ LinearContainerLayout(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final float getFixedWeight(float f10, int i10) {
        if (f10 > 0.0f) {
            return f10;
        }
        return i10 == -1 ? 1.0f : 0.0f;
    }

    private final int getMaxLength(int i10, int i11) {
        return Math.max(i10, i11 + i10);
    }

    public static /* synthetic */ void getOrientation$annotations() {
    }

    public static /* synthetic */ void getShowDividers$annotations() {
    }

    private final boolean hasSignificantDimension(int i10, int i11) {
        return (i10 == -1 && ViewsKt.isExact(i11)) ? false : true;
    }

    private final void layoutHorizontal(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int baseline;
        int verticalPaddings$div_release = (i13 - i11) - getVerticalPaddings$div_release();
        int layoutDirection = getLayoutDirection();
        float f10 = (i12 - i10) - this.totalLength;
        float paddingLeft = getPaddingLeft();
        this.offsetsHolder.update(f10, GravityCompat.getAbsoluteGravity(getHorizontalGravity$div_release(), layoutDirection), getVisibleChildCount());
        float firstChildOffset = paddingLeft + this.offsetsHolder.getFirstChildOffset();
        g indices = com.yandex.div.core.util.ViewsKt.getIndices(this, 0, getChildCount());
        int iE = indices.e();
        int iF = indices.f();
        int iG = indices.g();
        if ((iG <= 0 || iE > iF) && (iG >= 0 || iF > iE)) {
            return;
        }
        while (true) {
            View childAt = getChildAt(iE);
            if (childAt != null) {
                if (!(childAt.getVisibility() == 8)) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                    int verticalGravity = DivViewGroup.Companion.toVerticalGravity(divLayoutParams.getGravity());
                    if (verticalGravity < 0) {
                        verticalGravity = getVerticalGravity$div_release();
                    }
                    int paddingTop = getPaddingTop();
                    if (verticalGravity == 16) {
                        i14 = (((verticalPaddings$div_release - measuredHeight) + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin) / 2;
                    } else if (verticalGravity == 48) {
                        if ((!divLayoutParams.isBaselineAligned() || ((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1 || childAt.getBaseline() == -1) ? false : true) {
                            i15 = this.maxBaselineAscent;
                            baseline = childAt.getBaseline();
                            i14 = i15 - baseline;
                        } else {
                            i14 = ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                        }
                    } else if (verticalGravity != 80) {
                        i14 = 0;
                    } else {
                        i15 = verticalPaddings$div_release - measuredHeight;
                        baseline = ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin;
                        i14 = i15 - baseline;
                    }
                    int i16 = paddingTop + i14;
                    float fGapBeforeChild = firstChildOffset + gapBeforeChild(com.yandex.div.core.util.ViewsKt.isLayoutRtl(this) ? iE + 1 : iE) + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                    setChildFrame(childAt, b.c(fGapBeforeChild), i16, measuredWidth, measuredHeight);
                    firstChildOffset = fGapBeforeChild + measuredWidth + ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin + this.offsetsHolder.getSpaceBetweenChildren();
                }
            }
            if (iE == iF) {
                return;
            } else {
                iE += iG;
            }
        }
    }

    private final void layoutVertical(int i10, int i11, int i12, int i13) {
        int horizontalPaddings$div_release = (i12 - i10) - getHorizontalPaddings$div_release();
        float f10 = (i13 - i11) - this.totalLength;
        float paddingTop = getPaddingTop();
        this.offsetsHolder.update(f10, getVerticalGravity$div_release(), getVisibleChildCount());
        float firstChildOffset = paddingTop + this.offsetsHolder.getFirstChildOffset();
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                int horizontalGravity = DivViewGroup.Companion.toHorizontalGravity(divLayoutParams.getGravity());
                if (horizontalGravity < 0) {
                    horizontalGravity = getHorizontalGravity$div_release();
                }
                int layoutDirection = getLayoutDirection();
                int paddingLeft = getPaddingLeft();
                int absoluteGravity = GravityCompat.getAbsoluteGravity(horizontalGravity, layoutDirection);
                int i15 = absoluteGravity != 1 ? (absoluteGravity == 3 || absoluteGravity != 5) ? ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin : (horizontalPaddings$div_release - measuredWidth) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin : (((horizontalPaddings$div_release - measuredWidth) + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin) / 2;
                float fGapBeforeChild = firstChildOffset + gapBeforeChild(i14) + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                setChildFrame(childAt, paddingLeft + i15, b.c(fGapBeforeChild), measuredWidth, measuredHeight);
                firstChildOffset = fGapBeforeChild + measuredHeight + ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin + this.offsetsHolder.getSpaceBetweenChildren();
            }
        }
    }

    private final void setChildFrame(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        this.totalLength = 0;
        this.maxCrossSize = 0;
        this.totalConstrainedLength = 0;
        this.totalMatchParentLength = 0;
        this.totalWeight = 0.0f;
        this.childMeasuredState = 0;
        Iterator<View> it = ViewGroupKt.getChildren(this).iterator();
        int i13 = 0;
        while (true) {
            i12 = -1;
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            View next = it.next();
            if (i13 < 0) {
                nj.s.u();
            }
            if (!(next.getVisibility() == 8)) {
                break;
            } else {
                i13++;
            }
        }
        this.firstVisibleChildIndex = i13;
        int i14 = 0;
        for (View view : ViewGroupKt.getChildren(this)) {
            if (i14 < 0) {
                nj.s.u();
            }
            if (!(view.getVisibility() == 8)) {
                i12 = i14;
            }
            i14++;
        }
        this.lastVisibleChildIndex = i12;
        if (isVertical()) {
            measureVertical(i10, i11);
        } else {
            measureHorizontal(i10, i11);
        }
        this.constrainedChildren.clear();
        this.crossMatchParentChildren.clear();
        this.skippedMatchParentChildren.clear();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearContainerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.maxBaselineAscent = -1;
        this.maxBaselineDescent = -1;
        this.orientation$delegate = ViewsKt.dimensionAffecting$default(0, null, 2, null);
        this.aspectRatio$delegate = AspectView.Companion.aspectRatioProperty$div_release();
        this.offsetsHolder = new DivViewGroup.OffsetsHolder(this, 0.0f, 0.0f, 0, 7, null);
        this.firstVisibleChildIndex = -1;
        this.lastVisibleChildIndex = -1;
        this.showDividers$delegate = ViewsKt.dimensionAffecting$default(0, null, 2, null);
        this.constrainedChildren = new ArrayList();
        this.skippedMatchParentChildren = new LinkedHashSet();
        this.crossMatchParentChildren = new LinkedHashSet();
    }

    private final r drawDivider(Canvas canvas, int i10, int i11, int i12, int i13) {
        Drawable drawable = this.dividerDrawable;
        if (drawable == null) {
            return null;
        }
        float f10 = (i10 + i12) / 2.0f;
        float f11 = (i11 + i13) / 2.0f;
        float f12 = this.dividerWidth / 2.0f;
        float f13 = this.dividerHeight / 2.0f;
        drawable.setBounds(Math.max((int) (f10 - f12), i10), Math.max((int) (f11 - f13), i11), Math.min((int) (f10 + f12), i12), Math.min((int) (f11 + f13), i13));
        drawable.draw(canvas);
        return r.f64562a;
    }

    private final int getDividerHeightWithMargins() {
        return this.dividerHeight + this.dividerMarginTop + this.dividerMarginBottom;
    }

    private final int getDividerOffsetBeforeChildAt(int i10) {
        return i10 == this.firstVisibleChildIndex ? this.offsetsHolder.getEdgeDividerOffset() : (int) (this.offsetsHolder.getSpaceBetweenChildren() / 2);
    }

    private final int getDividerWidthWithMargins() {
        return this.dividerWidth + this.dividerMarginRight + this.dividerMarginLeft;
    }

    private final int getFreeSpace(int i10, int i11) {
        int i12;
        if (i10 >= 0 || (i12 = this.totalMatchParentLength) <= 0) {
            return (i10 < 0 || !ViewsKt.isExact(i11)) ? i10 : i10 + this.totalMatchParentLength;
        }
        return ik.k.d(i10 + i12, 0);
    }

    private final boolean hasDividerBeforeChildAt(int i10) {
        if (i10 != this.firstVisibleChildIndex) {
            if (i10 <= this.lastVisibleChildIndex) {
                if ((getShowDividers() & 2) == 0) {
                    return false;
                }
                for (int i11 = i10 - 1; -1 < i11; i11--) {
                    if (!(getChildAt(i10).getVisibility() == 8)) {
                        return true;
                    }
                }
                return false;
            }
            if ((getShowDividers() & 4) == 0) {
                return false;
            }
        } else if ((getShowDividers() & 1) == 0) {
            return false;
        }
        return true;
    }

    private final void measureHorizontal(int i10, int i11) {
        this.maxBaselineAscent = -1;
        this.maxBaselineDescent = -1;
        boolean zIsExact = ViewsKt.isExact(i10);
        int iMakeExactSpec = getAspectRatio() == 0.0f ? i11 : zIsExact ? ViewsKt.makeExactSpec(b.c(View.MeasureSpec.getSize(i10) / getAspectRatio())) : ViewsKt.makeExactSpec(0);
        int size = View.MeasureSpec.getSize(iMakeExactSpec);
        boolean zIsExact2 = ViewsKt.isExact(iMakeExactSpec);
        int iD = ik.k.d(zIsExact2 ? size : Math.max(getSuggestedMinimumHeight(), getVerticalPaddings$div_release()), 0);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                this.totalLength += gapBeforeChild(i12);
                float f10 = this.totalWeight;
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                this.totalWeight = f10 + getFixedHorizontalWeight((DivLayoutParams) layoutParams);
                measureChildWithSignificantSizeHorizontal(childAt, i10, iMakeExactSpec);
            }
        }
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8) {
                considerMatchParentChildMarginsInWidth(childAt2, i10);
            }
        }
        if (this.totalLength > 0 && hasDividerBeforeChildAt(getChildCount())) {
            this.totalLength += getDividerWidthWithMargins();
        }
        this.totalLength += getHorizontalPaddings$div_release();
        int widthSizeAndState = getWidthSizeAndState(i10) & ViewCompat.MEASURED_SIZE_MASK;
        if (!zIsExact) {
            if (!(getAspectRatio() == 0.0f)) {
                size = b.c(widthSizeAndState / getAspectRatio());
                iMakeExactSpec = ViewsKt.makeExactSpec(size);
            }
        }
        remeasureChildrenHorizontalIfNeeded(i10, widthSizeAndState, iMakeExactSpec);
        if (!zIsExact2) {
            if (getAspectRatio() == 0.0f) {
                int childCount3 = getChildCount();
                for (int i14 = 0; i14 < childCount3; i14++) {
                    View childAt3 = getChildAt(i14);
                    if (childAt3.getVisibility() != 8) {
                        considerMatchParentChildInMaxHeight(childAt3, iMakeExactSpec, this.maxCrossSize == 0);
                    }
                }
                this.maxCrossSize = Math.max(iD, this.maxCrossSize + getVerticalPaddings$div_release());
                int i15 = this.maxBaselineAscent;
                if (i15 != -1) {
                    updateMaxCrossSize(iMakeExactSpec, i15 + this.maxBaselineDescent);
                }
                size = View.resolveSize(this.maxCrossSize, iMakeExactSpec);
            }
        }
        int childCount4 = getChildCount();
        for (int i16 = 0; i16 < childCount4; i16++) {
            View childAt4 = getChildAt(i16);
            if (childAt4.getVisibility() != 8) {
                remeasureDynamicHeightChild(childAt4, ViewsKt.makeExactSpec(size));
            }
        }
        setMeasuredDimension(getWidthSizeAndState(i10), View.resolveSizeAndState(size, iMakeExactSpec, this.childMeasuredState << 16));
    }

    private final boolean needRemeasureChildren(int i10, int i11) {
        if (!this.skippedMatchParentChildren.isEmpty()) {
            return true;
        }
        if (!ViewsKt.isUnspecified(i11)) {
            if (i10 < 0) {
                if (this.totalConstrainedLength > 0 || this.totalWeight > 0.0f) {
                    return true;
                }
            } else if (ViewsKt.isExact(i11) && i10 > 0 && this.totalWeight > 0.0f) {
                return true;
            }
        }
        return false;
    }

    private final void remeasureChildrenHorizontalIfNeeded(int i10, int i11, int i12) {
        int i13 = i11 - this.totalLength;
        List<View> list = this.constrainedChildren;
        boolean z10 = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
            } while (!(getMaxWidth((View) it.next()) != Integer.MAX_VALUE));
        } else {
            z10 = false;
            break;
        }
        if (z10 || needRemeasureChildren(i13, i10)) {
            this.totalLength = 0;
            remeasureConstrainedWidthChildren(i10, i12, i13);
            remeasureMatchParentWidthChildren(i10, i12, i13);
            this.totalLength += getHorizontalPaddings$div_release();
        }
    }

    private final void remeasureChildrenVerticalIfNeeded(int i10, int i11, int i12, int i13) {
        int i14 = i11 - this.totalLength;
        List<View> list = this.constrainedChildren;
        boolean z10 = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
            } while (!(getMaxHeight((View) it.next()) != Integer.MAX_VALUE));
        } else {
            z10 = false;
            break;
        }
        if (z10 || needRemeasureChildren(i14, i12)) {
            this.totalLength = 0;
            remeasureConstrainedHeightChildren(i10, i12, i14);
            remeasureMatchParentHeightChildren(i10, i12, i13, i14);
            this.totalLength += getVerticalPaddings$div_release();
        }
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    public DivLayoutParams generateDefaultLayoutParams() {
        return isVertical() ? new DivLayoutParams(-1, -2) : new DivLayoutParams(-2, -2);
    }

    public float getAspectRatio() {
        return ((Number) this.aspectRatio$delegate.getValue(this, $$delegatedProperties[1])).floatValue();
    }

    public final Drawable getDividerDrawable() {
        return this.dividerDrawable;
    }

    public final int getOrientation() {
        return ((Number) this.orientation$delegate.getValue(this, $$delegatedProperties[0])).intValue();
    }

    public final int getShowDividers() {
        return ((Number) this.showDividers$delegate.getValue(this, $$delegatedProperties[2])).intValue();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.dividerDrawable == null) {
            return;
        }
        if (isVertical()) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    @Override // com.yandex.div.core.widget.AspectView
    public void setAspectRatio(float f10) {
        this.aspectRatio$delegate.setValue(this, $$delegatedProperties[1], Float.valueOf(f10));
    }

    public final void setDividerDrawable(Drawable drawable) {
        if (p.e(this.dividerDrawable, drawable)) {
            return;
        }
        this.dividerDrawable = drawable;
        this.dividerWidth = drawable != null ? drawable.getIntrinsicWidth() : 0;
        this.dividerHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public final void setDividerMargins(int i10, int i11, int i12, int i13) {
        this.dividerMarginLeft = i10;
        this.dividerMarginRight = i12;
        this.dividerMarginTop = i11;
        this.dividerMarginBottom = i13;
        requestLayout();
    }

    public final void setItemSpacing(int i10) {
        if (this.itemSpacingPx != i10) {
            this.itemSpacingPx = i10;
            requestLayout();
        }
    }

    public final void setOrientation(int i10) {
        this.orientation$delegate.setValue(this, $$delegatedProperties[0], Integer.valueOf(i10));
    }

    public final void setShowDividers(int i10) {
        this.showDividers$delegate.setValue(this, $$delegatedProperties[2], Integer.valueOf(i10));
    }

    private final void considerMatchParentChildInMaxHeight(View view, int i10, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        if (((ViewGroup.MarginLayoutParams) divLayoutParams).height != -1) {
            return;
        }
        if (z10) {
            this.maxCrossSize = Math.max(this.maxCrossSize, view.getMinimumHeight() + divLayoutParams.getVerticalMargins$div_release());
        } else {
            remeasureChildHorizontal(view, i10, view.getMeasuredWidth());
            updateMaxCrossSize(i10, view.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release());
        }
    }

    private final void considerMatchParentChildMarginsInWidth(View view, int i10) {
        if (hasSignificantWidth(view, i10)) {
            return;
        }
        int i11 = this.totalLength;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        this.totalLength = getMaxLength(i11, ((DivLayoutParams) layoutParams).getHorizontalMargins$div_release());
    }

    private final void considerMatchParentChildrenInMaxWidth(int i10, int i11) {
        if (ViewsKt.isExact(i10)) {
            return;
        }
        if (this.maxCrossSize != 0) {
            for (View view : this.crossMatchParentChildren) {
                int i12 = this.maxCrossSize;
                int minimumWidth = view.getMinimumWidth();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                this.maxCrossSize = Math.max(i12, minimumWidth + ((DivLayoutParams) layoutParams).getHorizontalMargins$div_release());
            }
            return;
        }
        for (View view2 : this.crossMatchParentChildren) {
            measureVerticalFirstTime(view2, i10, i11, true, false);
            this.skippedMatchParentChildren.remove(view2);
        }
    }

    private final void drawDividersHorizontal(Canvas canvas) {
        int paddingLeft;
        int edgeDividerOffset;
        int width;
        int edgeDividerOffset2;
        int i10;
        int i11;
        boolean zIsLayoutRtl = com.yandex.div.core.util.ViewsKt.isLayoutRtl(this);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && hasDividerBeforeChildAt(i12)) {
                int dividerOffsetBeforeChildAt = getDividerOffsetBeforeChildAt(i12);
                if (zIsLayoutRtl) {
                    int right = childAt.getRight();
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    i11 = right + ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams)).rightMargin + this.dividerMarginLeft + dividerOffsetBeforeChildAt;
                } else {
                    int left = childAt.getLeft();
                    ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                    p.h(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    i11 = (((left - ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams2)).leftMargin) - this.dividerWidth) - this.dividerMarginRight) - dividerOffsetBeforeChildAt;
                }
                drawVerticalDivider(canvas, i11);
            }
        }
        if (hasDividerBeforeChildAt(getChildCount())) {
            View childAt2 = getChildAt(getChildCount() - 1);
            if (childAt2 == null && zIsLayoutRtl) {
                paddingLeft = getPaddingLeft() + this.dividerMarginLeft;
                edgeDividerOffset = this.offsetsHolder.getEdgeDividerOffset();
            } else {
                if (childAt2 == null) {
                    width = ((getWidth() - getPaddingRight()) - this.dividerWidth) - this.dividerMarginRight;
                    edgeDividerOffset2 = this.offsetsHolder.getEdgeDividerOffset();
                } else if (zIsLayoutRtl) {
                    int left2 = childAt2.getLeft();
                    ViewGroup.LayoutParams layoutParams3 = childAt2.getLayoutParams();
                    p.h(layoutParams3, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    width = ((left2 - ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams3)).leftMargin) - this.dividerWidth) - this.dividerMarginRight;
                    edgeDividerOffset2 = this.offsetsHolder.getEdgeDividerOffset();
                } else {
                    int right2 = childAt2.getRight();
                    ViewGroup.LayoutParams layoutParams4 = childAt2.getLayoutParams();
                    p.h(layoutParams4, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    paddingLeft = right2 + ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams4)).rightMargin + this.dividerMarginLeft;
                    edgeDividerOffset = this.offsetsHolder.getEdgeDividerOffset();
                }
                i10 = width - edgeDividerOffset2;
                drawVerticalDivider(canvas, i10);
            }
            i10 = paddingLeft + edgeDividerOffset;
            drawVerticalDivider(canvas, i10);
        }
    }

    private final void drawDividersVertical(Canvas canvas) {
        int height;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8 && hasDividerBeforeChildAt(i10)) {
                int top2 = childAt.getTop();
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                drawHorizontalDivider(canvas, (((top2 - ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams)).topMargin) - this.dividerHeight) - this.dividerMarginBottom) - getDividerOffsetBeforeChildAt(i10));
            }
        }
        if (hasDividerBeforeChildAt(getChildCount())) {
            View childAt2 = getChildAt(getChildCount() - 1);
            if (childAt2 != null) {
                int bottom = childAt2.getBottom();
                ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                p.h(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                height = bottom + ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams2)).bottomMargin + this.dividerMarginTop + this.offsetsHolder.getEdgeDividerOffset();
            } else {
                height = (((getHeight() - getPaddingBottom()) - this.dividerHeight) - this.dividerMarginBottom) - this.offsetsHolder.getEdgeDividerOffset();
            }
            drawHorizontalDivider(canvas, height);
        }
    }

    private final void drawHorizontalDivider(Canvas canvas, int i10) {
        drawDivider(canvas, getPaddingLeft() + this.dividerMarginLeft, i10, (getWidth() - getPaddingRight()) - this.dividerMarginRight, i10 + this.dividerHeight);
    }

    private final r drawVerticalDivider(Canvas canvas, int i10) {
        return drawDivider(canvas, i10, getPaddingTop() + this.dividerMarginTop, i10 + this.dividerWidth, (getHeight() - getPaddingBottom()) - this.dividerMarginBottom);
    }

    private final int gapBeforeChild(int i10) {
        int dividerWidthWithMargins;
        if (isVertical()) {
            dividerWidthWithMargins = getDividerHeightWithMargins();
        } else {
            dividerWidthWithMargins = getDividerWidthWithMargins();
        }
        if (!hasDividerBeforeChildAt(i10)) {
            if (i10 == this.firstVisibleChildIndex) {
                return 0;
            }
            return this.itemSpacingPx;
        }
        return dividerWidthWithMargins;
    }

    private final float getFixedHorizontalWeight(DivLayoutParams divLayoutParams) {
        return getFixedWeight(divLayoutParams.getHorizontalWeight(), ((ViewGroup.MarginLayoutParams) divLayoutParams).width);
    }

    private final float getFixedVerticalWeight(DivLayoutParams divLayoutParams) {
        return getFixedWeight(divLayoutParams.getVerticalWeight(), ((ViewGroup.MarginLayoutParams) divLayoutParams).height);
    }

    private final int getMaxHeight(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        return ((DivLayoutParams) layoutParams).getMaxHeight();
    }

    private final int getMaxWidth(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        return ((DivLayoutParams) layoutParams).getMaxWidth();
    }

    private final int getVisibleChildCount() {
        boolean z10;
        Iterator<View> it = ViewGroupKt.getChildren(this).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().getVisibility() == 8) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((!z10) && (i10 = i10 + 1) < 0) {
                nj.s.t();
            }
        }
        return i10;
    }

    private final int getWidthSizeAndState(int i10) {
        return View.resolveSizeAndState(Math.max(getSuggestedMinimumWidth(), this.totalLength), i10, this.childMeasuredState);
    }

    private final boolean hasSignificantHeight(View view, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        return hasSignificantDimension(((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams)).height, i10);
    }

    private final boolean hasSignificantWidth(View view, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        return hasSignificantDimension(((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams)).width, i10);
    }

    private final boolean isVertical() {
        if (getOrientation() == 1) {
            return true;
        }
        return false;
    }

    private final void measureChildWithSignificantSizeHorizontal(View view, int i10, int i11) {
        if (!hasSignificantWidth(view, i10)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        int i12 = ((ViewGroup.MarginLayoutParams) divLayoutParams).width;
        if (i12 != -3) {
            if (i12 != -1) {
                measureChildWithMargins(view, i10, 0, i11, 0);
            } else {
                measureMatchParentWidthChildFirstTime(view, i10, i11);
            }
        } else {
            measureConstrainedWidthChildFirstTime(view, i10, i11);
        }
        this.childMeasuredState = View.combineMeasuredStates(this.childMeasuredState, view.getMeasuredState());
        updateMaxCrossSize(i11, view.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release());
        updateBaselineOffset(view);
        this.totalLength = getMaxLength(this.totalLength, view.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release());
    }

    private final void measureChildWithSignificantSizeVertical(View view, int i10, int i11) {
        boolean z10;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        boolean zIsExact = ViewsKt.isExact(i10);
        boolean zHasSignificantHeight = hasSignificantHeight(view, i11);
        if (zIsExact) {
            z10 = zHasSignificantHeight;
        } else if (((ViewGroup.MarginLayoutParams) divLayoutParams).width != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            measureVerticalFirstTime(view, i10, i11, true, true);
            return;
        }
        if (!zIsExact) {
            this.crossMatchParentChildren.add(view);
        }
        if (!zHasSignificantHeight) {
            this.skippedMatchParentChildren.add(view);
            int i12 = this.totalLength;
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            p.h(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            this.totalLength = getMaxLength(i12, ((DivLayoutParams) layoutParams2).getVerticalMargins$div_release());
        }
    }

    private final void measureConstrainedHeightChildFirstTime(View view, int i10, int i11, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        int maxHeight = divLayoutParams.getMaxHeight();
        ((ViewGroup.MarginLayoutParams) divLayoutParams).height = -2;
        divLayoutParams.setMaxHeight(Integer.MAX_VALUE);
        measureChildWithMargins(view, i10, 0, i11, 0);
        ((ViewGroup.MarginLayoutParams) divLayoutParams).height = -3;
        divLayoutParams.setMaxHeight(maxHeight);
        if (!z10) {
            return;
        }
        this.totalConstrainedLength = getMaxLength(this.totalConstrainedLength, view.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release());
        if (this.constrainedChildren.contains(view)) {
            return;
        }
        this.constrainedChildren.add(view);
    }

    private final void measureConstrainedWidthChildFirstTime(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        int maxWidth = divLayoutParams.getMaxWidth();
        ((ViewGroup.MarginLayoutParams) divLayoutParams).width = -2;
        divLayoutParams.setMaxWidth(Integer.MAX_VALUE);
        measureChildWithMargins(view, i10, 0, i11, 0);
        ((ViewGroup.MarginLayoutParams) divLayoutParams).width = -3;
        divLayoutParams.setMaxWidth(maxWidth);
        this.totalConstrainedLength = getMaxLength(this.totalConstrainedLength, view.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release());
        this.constrainedChildren.add(view);
    }

    private final void measureMatchParentHeightChildFirstTime(View view, int i10, int i11, boolean z10) {
        if (ViewsKt.isExact(i11)) {
            measureChildWithMargins(view, i10, 0, ViewsKt.makeExactSpec(0), 0);
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) divLayoutParams).height = -2;
        measureChildWithMargins(view, i10, 0, i11, 0);
        ((ViewGroup.MarginLayoutParams) divLayoutParams).height = -1;
        if (!z10) {
            return;
        }
        this.totalMatchParentLength = getMaxLength(this.totalMatchParentLength, view.getMeasuredHeight());
    }

    private final void measureMatchParentWidthChild(View view, int i10) {
        if (!hasSignificantHeight(view, i10)) {
            return;
        }
        measureVerticalFirstTime(view, ViewsKt.makeExactSpec(this.maxCrossSize + getHorizontalPaddings$div_release()), i10, false, true);
        this.skippedMatchParentChildren.remove(view);
    }

    private final void measureMatchParentWidthChildFirstTime(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) divLayoutParams).width = -2;
        measureChildWithMargins(view, i10, 0, i11, 0);
        ((ViewGroup.MarginLayoutParams) divLayoutParams).width = -1;
        this.totalMatchParentLength = getMaxLength(this.totalMatchParentLength, view.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release());
    }

    private final void measureVertical(int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        int size = View.MeasureSpec.getSize(i10);
        boolean z13 = true;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getAspectRatio() == 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            if (z10) {
                i11 = ViewsKt.makeExactSpec(b.c(size / getAspectRatio()));
            } else {
                i11 = ViewsKt.makeExactSpec(0);
            }
        }
        if (!z10) {
            size = Math.max(getSuggestedMinimumWidth(), getHorizontalPaddings$div_release());
        }
        int iD = ik.k.d(size, 0);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                this.totalLength += gapBeforeChild(i12);
                float f10 = this.totalWeight;
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                this.totalWeight = f10 + getFixedVerticalWeight((DivLayoutParams) layoutParams);
                measureChildWithSignificantSizeVertical(childAt, i10, i11);
            }
        }
        considerMatchParentChildrenInMaxWidth(i10, i11);
        Iterator<T> it = this.crossMatchParentChildren.iterator();
        while (it.hasNext()) {
            measureMatchParentWidthChild((View) it.next(), i11);
        }
        if (this.totalLength > 0 && hasDividerBeforeChildAt(getChildCount())) {
            this.totalLength += getDividerHeightWithMargins();
        }
        this.totalLength += getVerticalPaddings$div_release();
        this.maxCrossSize = Math.max(iD, this.maxCrossSize + getHorizontalPaddings$div_release());
        int size2 = View.MeasureSpec.getSize(i11);
        if (getAspectRatio() == 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12 && !z10) {
            size2 = b.c((View.resolveSizeAndState(this.maxCrossSize, i10, this.childMeasuredState) & ViewCompat.MEASURED_SIZE_MASK) / getAspectRatio());
            i11 = ViewsKt.makeExactSpec(size2);
            remeasureChildrenVerticalIfNeeded(i10, size2, i11, iD);
        } else {
            if (getAspectRatio() != 0.0f) {
                z13 = false;
            }
            if (z13 && !ViewsKt.isExact(i11)) {
                remeasureChildrenVerticalIfNeeded(i10, Math.max(this.totalLength, getSuggestedMinimumHeight()), i11, iD);
                size2 = Math.max(this.totalLength, getSuggestedMinimumHeight());
            } else {
                remeasureChildrenVerticalIfNeeded(i10, size2, i11, iD);
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(this.maxCrossSize, i10, this.childMeasuredState), View.resolveSizeAndState(size2, i11, this.childMeasuredState << 16));
    }

    private final void measureVerticalFirstTime(View view, int i10, int i11, boolean z10, boolean z11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        int i12 = ((ViewGroup.MarginLayoutParams) divLayoutParams).height;
        if (i12 != -3) {
            if (i12 != -1) {
                measureChildWithMargins(view, i10, 0, i11, 0);
            } else {
                measureMatchParentHeightChildFirstTime(view, i10, i11, z11);
            }
        } else {
            measureConstrainedHeightChildFirstTime(view, i10, i11, z11);
        }
        this.childMeasuredState = View.combineMeasuredStates(this.childMeasuredState, view.getMeasuredState());
        if (z10) {
            updateMaxCrossSize(i10, view.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release());
        }
        if (!z11) {
            return;
        }
        this.totalLength = getMaxLength(this.totalLength, view.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release());
    }

    private final int remeasureChildHorizontal(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        view.measure(ViewsKt.makeExactSpec(i11), DivViewGroup.Companion.getChildMeasureSpec(i10, divLayoutParams.getVerticalMargins$div_release() + getVerticalPaddings$div_release(), ((ViewGroup.MarginLayoutParams) divLayoutParams).height, view.getMinimumHeight(), divLayoutParams.getMaxHeight()));
        return View.combineMeasuredStates(this.childMeasuredState, view.getMeasuredState() & ViewCompat.MEASURED_STATE_MASK);
    }

    private final void remeasureChildVertical(View view, int i10, int i11, int i12) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        int i13 = ((ViewGroup.MarginLayoutParams) divLayoutParams).width;
        if (i13 == -1) {
            if (i11 == 0) {
                ((ViewGroup.MarginLayoutParams) divLayoutParams).width = -3;
            } else {
                i10 = ViewsKt.makeExactSpec(i11);
            }
        }
        int childMeasureSpec = DivViewGroup.Companion.getChildMeasureSpec(i10, getHorizontalPaddings$div_release() + divLayoutParams.getHorizontalMargins$div_release(), ((ViewGroup.MarginLayoutParams) divLayoutParams).width, view.getMinimumWidth(), divLayoutParams.getMaxWidth());
        ((ViewGroup.MarginLayoutParams) divLayoutParams).width = i13;
        view.measure(childMeasureSpec, ViewsKt.makeExactSpec(i12));
        this.childMeasuredState = View.combineMeasuredStates(this.childMeasuredState, view.getMeasuredState() & InputDeviceCompat.SOURCE_ANY);
    }

    private final void remeasureConstrainedHeightChildren(int i10, int i11, int i12) {
        int freeSpace = getFreeSpace(i12, i11);
        if (freeSpace >= 0) {
            for (View view : this.constrainedChildren) {
                if (getMaxHeight(view) != Integer.MAX_VALUE) {
                    remeasureChildVertical(view, i10, this.maxCrossSize, Math.min(view.getMeasuredHeight(), getMaxHeight(view)));
                }
            }
            return;
        }
        List<View> list = this.constrainedChildren;
        if (list.size() > 1) {
            w.B(list, new Comparator() { // from class: com.yandex.div.core.widget.LinearContainerLayout$remeasureConstrainedHeightChildren$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    View view2 = (View) t11;
                    View view3 = (View) t10;
                    return qj.b.d(Float.valueOf(view2.getMinimumHeight() / view2.getMeasuredHeight()), Float.valueOf(view3.getMinimumHeight() / view3.getMeasuredHeight()));
                }
            });
        }
        for (View view2 : this.constrainedChildren) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
            int measuredHeight = view2.getMeasuredHeight();
            int verticalMargins$div_release = divLayoutParams.getVerticalMargins$div_release() + measuredHeight;
            remeasureChildVertical(view2, i10, this.maxCrossSize, ik.k.g(ik.k.d(b.c((verticalMargins$div_release / this.totalConstrainedLength) * freeSpace) + measuredHeight, view2.getMinimumHeight()), divLayoutParams.getMaxHeight()));
            this.childMeasuredState = View.combineMeasuredStates(this.childMeasuredState, view2.getMeasuredState() & 16777216 & InputDeviceCompat.SOURCE_ANY);
            this.totalConstrainedLength -= verticalMargins$div_release;
            freeSpace -= view2.getMeasuredHeight() - measuredHeight;
        }
    }

    private final void remeasureConstrainedWidthChildren(int i10, int i11, int i12) {
        int freeSpace = getFreeSpace(i12, i10);
        if (freeSpace >= 0) {
            for (View view : this.constrainedChildren) {
                if (getMaxWidth(view) != Integer.MAX_VALUE) {
                    remeasureChildHorizontal(view, i11, Math.min(view.getMeasuredWidth(), getMaxWidth(view)));
                }
            }
            return;
        }
        List<View> list = this.constrainedChildren;
        if (list.size() > 1) {
            w.B(list, new Comparator() { // from class: com.yandex.div.core.widget.LinearContainerLayout$remeasureConstrainedWidthChildren$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    View view2 = (View) t11;
                    View view3 = (View) t10;
                    return qj.b.d(Float.valueOf(view2.getMinimumWidth() / view2.getMeasuredWidth()), Float.valueOf(view3.getMinimumWidth() / view3.getMeasuredWidth()));
                }
            });
        }
        for (View view2 : this.constrainedChildren) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
            int measuredWidth = view2.getMeasuredWidth();
            int horizontalMargins$div_release = divLayoutParams.getHorizontalMargins$div_release() + measuredWidth;
            remeasureChildHorizontal(view2, i11, ik.k.g(ik.k.d(b.c((horizontalMargins$div_release / this.totalConstrainedLength) * freeSpace) + measuredWidth, view2.getMinimumWidth()), divLayoutParams.getMaxWidth()));
            this.childMeasuredState = View.combineMeasuredStates(this.childMeasuredState, view2.getMeasuredState() & 16777216 & ViewCompat.MEASURED_STATE_MASK);
            this.totalConstrainedLength -= horizontalMargins$div_release;
            freeSpace -= view2.getMeasuredWidth() - measuredWidth;
        }
    }

    private final void remeasureDynamicHeightChild(View view, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        int i11 = ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams)).height;
        if (i11 != -1 && i11 != -3) {
            return;
        }
        remeasureChildHorizontal(view, i10, view.getMeasuredWidth());
    }

    private final void remeasureMatchParentHeightChildren(int i10, int i11, int i12, int i13) {
        int freeSpace = getFreeSpace(i13, i11);
        float fixedVerticalWeight = this.totalWeight;
        int i14 = this.maxCrossSize;
        this.maxCrossSize = 0;
        int childCount = getChildCount();
        int i15 = freeSpace;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                if (((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1) {
                    if (freeSpace > 0) {
                        int fixedVerticalWeight2 = (int) ((getFixedVerticalWeight(divLayoutParams) * i15) / fixedVerticalWeight);
                        fixedVerticalWeight -= getFixedVerticalWeight(divLayoutParams);
                        i15 -= fixedVerticalWeight2;
                        remeasureChildVertical(childAt, i10, i14, fixedVerticalWeight2);
                    } else if (this.skippedMatchParentChildren.contains(childAt)) {
                        remeasureChildVertical(childAt, i10, i14, Math.max(childAt.getMinimumHeight(), 0));
                    }
                }
                updateMaxCrossSize(i10, childAt.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release());
                this.totalLength = getMaxLength(this.totalLength, childAt.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release());
            }
        }
        this.maxCrossSize = Math.max(i12, this.maxCrossSize + getHorizontalPaddings$div_release());
        KAssert kAssert = KAssert.INSTANCE;
        Integer numValueOf = Integer.valueOf(i14);
        Integer numValueOf2 = Integer.valueOf(this.maxCrossSize);
        if (Assert.isEnabled()) {
            Assert.assertEquals("Width of vertical container changed after remeasuring", numValueOf, numValueOf2);
        }
    }

    private final void remeasureMatchParentWidthChildren(int i10, int i11, int i12) {
        int freeSpace = getFreeSpace(i12, i10);
        float fixedHorizontalWeight = this.totalWeight;
        this.maxCrossSize = 0;
        this.maxBaselineAscent = -1;
        this.maxBaselineDescent = -1;
        int childCount = getChildCount();
        int i13 = freeSpace;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                if (((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1) {
                    if (freeSpace > 0) {
                        int fixedHorizontalWeight2 = (int) ((getFixedHorizontalWeight(divLayoutParams) * i13) / fixedHorizontalWeight);
                        fixedHorizontalWeight -= getFixedHorizontalWeight(divLayoutParams);
                        i13 -= fixedHorizontalWeight2;
                        remeasureChildHorizontal(childAt, i11, fixedHorizontalWeight2);
                    } else {
                        remeasureChildHorizontal(childAt, i11, Math.max(childAt.getMinimumWidth(), 0));
                    }
                }
                updateMaxCrossSize(i11, childAt.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release());
                this.totalLength = getMaxLength(this.totalLength, childAt.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release());
                updateBaselineOffset(childAt);
            }
        }
    }

    private final void updateBaselineOffset(View view) {
        int baseline;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        if (!divLayoutParams.isBaselineAligned() || (baseline = view.getBaseline()) == -1) {
            return;
        }
        this.maxBaselineAscent = Math.max(this.maxBaselineAscent, ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin + baseline);
        this.maxBaselineDescent = Math.max(this.maxBaselineDescent, (view.getMeasuredHeight() - baseline) - ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin);
    }

    private final void updateMaxCrossSize(int i10, int i11) {
        if (!ViewsKt.isExact(i10)) {
            this.maxCrossSize = Math.max(this.maxCrossSize, i11);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        if (isVertical()) {
            View childAt = getChildAt(0);
            if (childAt == null) {
                return super.getBaseline();
            }
            int baseline = childAt.getBaseline();
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            return baseline + ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams)).topMargin + getPaddingTop();
        }
        int i10 = this.maxBaselineAscent;
        if (i10 != -1) {
            return i10 + getPaddingTop();
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (isVertical()) {
            layoutVertical(i10, i11, i12, i13);
        } else {
            layoutHorizontal(i10, i11, i12, i13);
        }
    }
}
