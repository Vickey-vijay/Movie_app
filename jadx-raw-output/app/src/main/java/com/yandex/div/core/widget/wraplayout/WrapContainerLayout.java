package com.yandex.div.core.widget.wraplayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Px;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import ck.i;
import ck.p;
import ck.s;
import com.yandex.div.core.widget.AspectView;
import com.yandex.div.core.widget.ViewsKt;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.internal.widget.DivViewGroup;
import ek.b;
import fk.d;
import ik.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import jk.k;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref$IntRef;
import mj.r;
import nj.g0;

/* JADX INFO: compiled from: WrapContainerLayout.kt */
/* JADX INFO: loaded from: classes4.dex */
public class WrapContainerLayout extends DivViewGroup implements AspectView {
    public static final /* synthetic */ k<Object>[] $$delegatedProperties = {s.f(new MutablePropertyReference1Impl(WrapContainerLayout.class, "showSeparators", "getShowSeparators()I", 0)), s.f(new MutablePropertyReference1Impl(WrapContainerLayout.class, "showLineSeparators", "getShowLineSeparators()I", 0)), s.f(new MutablePropertyReference1Impl(WrapContainerLayout.class, "separatorDrawable", "getSeparatorDrawable()Landroid/graphics/drawable/Drawable;", 0)), s.f(new MutablePropertyReference1Impl(WrapContainerLayout.class, "lineSeparatorDrawable", "getLineSeparatorDrawable()Landroid/graphics/drawable/Drawable;", 0)), s.f(new MutablePropertyReference1Impl(WrapContainerLayout.class, "aspectRatio", "getAspectRatio()F", 0))};
    private final d aspectRatio$delegate;
    private int childState;
    private int edgeLineSeparatorOffset;
    private boolean isRowDirection;

    @Px
    private int itemSpacingPx;
    private final d lineSeparatorDrawable$delegate;

    @Px
    private int lineSeparatorMarginBottom;

    @Px
    private int lineSeparatorMarginLeft;

    @Px
    private int lineSeparatorMarginRight;

    @Px
    private int lineSeparatorMarginTop;

    @Px
    private int lineSpacingPx;
    private final List<WrapLine> lines;
    private int middleLineSeparatorOffset;
    private final DivViewGroup.OffsetsHolder offsetsHolder;
    private final d separatorDrawable$delegate;

    @Px
    private int separatorMarginBottom;

    @Px
    private int separatorMarginLeft;

    @Px
    private int separatorMarginRight;

    @Px
    private int separatorMarginTop;
    private final d showLineSeparators$delegate;
    private final d showSeparators$delegate;
    private int tempSumCrossSize;
    private int wrapDirection;

    /* JADX INFO: compiled from: WrapContainerLayout.kt */
    public static final class WrapLine {
        private int bottom;
        private int crossSize;
        private int edgeSeparatorOffset;
        private final int firstIndex;
        private int goneItemCount;
        private int itemCount;
        private int mainSize;
        private int maxBaseline;
        private int maxHeightUnderBaseline;
        private int right;
        private float spaceBetweenChildren;

        public WrapLine() {
            this(0, 0, 0, 7, null);
        }

        public WrapLine(int i10, int i11, int i12) {
            this.firstIndex = i10;
            this.mainSize = i11;
            this.itemCount = i12;
            this.maxBaseline = -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WrapLine)) {
                return false;
            }
            WrapLine wrapLine = (WrapLine) obj;
            return this.firstIndex == wrapLine.firstIndex && this.mainSize == wrapLine.mainSize && this.itemCount == wrapLine.itemCount;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.firstIndex) * 31) + Integer.hashCode(this.mainSize)) * 31) + Integer.hashCode(this.itemCount);
        }

        public String toString() {
            return "WrapLine(firstIndex=" + this.firstIndex + ", mainSize=" + this.mainSize + ", itemCount=" + this.itemCount + ')';
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getCrossSize() {
            return this.crossSize;
        }

        public final int getEdgeSeparatorOffset() {
            return this.edgeSeparatorOffset;
        }

        public final int getFirstIndex() {
            return this.firstIndex;
        }

        public final int getGoneItemCount() {
            return this.goneItemCount;
        }

        public final int getItemCount() {
            return this.itemCount;
        }

        public final int getItemCountNotGone() {
            return this.itemCount - this.goneItemCount;
        }

        public final int getMainSize() {
            return this.mainSize;
        }

        public final int getMaxBaseline() {
            return this.maxBaseline;
        }

        public final int getMaxHeightUnderBaseline() {
            return this.maxHeightUnderBaseline;
        }

        public final int getRight() {
            return this.right;
        }

        public final float getSpaceBetweenChildren() {
            return this.spaceBetweenChildren;
        }

        public final void setBottom(int i10) {
            this.bottom = i10;
        }

        public final void setCrossSize(int i10) {
            this.crossSize = i10;
        }

        public final void setEdgeSeparatorOffset(int i10) {
            this.edgeSeparatorOffset = i10;
        }

        public final void setGoneItemCount(int i10) {
            this.goneItemCount = i10;
        }

        public final void setItemCount(int i10) {
            this.itemCount = i10;
        }

        public final void setMainSize(int i10) {
            this.mainSize = i10;
        }

        public final void setMaxBaseline(int i10) {
            this.maxBaseline = i10;
        }

        public final void setMaxHeightUnderBaseline(int i10) {
            this.maxHeightUnderBaseline = i10;
        }

        public final void setRight(int i10) {
            this.right = i10;
        }

        public final void setSpaceBetweenChildren(float f10) {
            this.spaceBetweenChildren = f10;
        }

        public final boolean isVisible() {
            if (getItemCountNotGone() > 0) {
                return true;
            }
            return false;
        }

        public /* synthetic */ WrapLine(int i10, int i11, int i12, int i13, i iVar) {
            this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0 : i12);
        }
    }

    public WrapContainerLayout(Context context) {
        super(context, null, 0, 6, null);
        this.showSeparators$delegate = ViewsKt.dimensionAffecting$default(0, null, 2, null);
        this.showLineSeparators$delegate = ViewsKt.dimensionAffecting$default(0, null, 2, null);
        this.separatorDrawable$delegate = ViewsKt.dimensionAffecting$default(null, null, 2, null);
        this.lineSeparatorDrawable$delegate = ViewsKt.dimensionAffecting$default(null, null, 2, null);
        this.isRowDirection = true;
        this.lines = new ArrayList();
        this.offsetsHolder = new DivViewGroup.OffsetsHolder(this, 0.0f, 0.0f, 0, 7, null);
        this.aspectRatio$delegate = AspectView.Companion.aspectRatioProperty$div_release();
    }

    private final void addSpaceBetweenLines(WrapLine wrapLine) {
        for (int i10 = 1; i10 < this.lines.size(); i10 += 2) {
            this.lines.add(i10, wrapLine);
        }
    }

    private final void determineCrossSize(int i10, int i11, int i12) {
        this.middleLineSeparatorOffset = 0;
        this.edgeLineSeparatorOffset = 0;
        if (this.lines.size() != 0 && View.MeasureSpec.getMode(i10) == 1073741824) {
            int size = View.MeasureSpec.getSize(i10);
            if (this.lines.size() == 1) {
                this.lines.get(0).setCrossSize(size - i12);
                return;
            }
            int sumOfCrossSize = (size - getSumOfCrossSize()) + i12;
            if (i11 != 1) {
                if (i11 != 5) {
                    if (i11 != 16) {
                        if (i11 != 80) {
                            if (i11 != 16777216) {
                                if (i11 != 33554432) {
                                    if (i11 != 67108864) {
                                        if (i11 != 268435456) {
                                            if (i11 != 536870912) {
                                                if (i11 != 1073741824) {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                    WrapLine wrapLine = new WrapLine(0, 0, 0, 7, null);
                                    int iC = b.c(DivViewGroup.Companion.getSpaceEvenlyPart$div_release(sumOfCrossSize, this.lines.size()));
                                    wrapLine.setCrossSize(iC);
                                    int i13 = iC / 2;
                                    this.middleLineSeparatorOffset = i13;
                                    this.edgeLineSeparatorOffset = i13;
                                    addSpaceBetweenLines(wrapLine);
                                    addEdgeSpace(wrapLine);
                                    return;
                                }
                                WrapLine wrapLine2 = new WrapLine(0, 0, 0, 7, null);
                                int iC2 = b.c(DivViewGroup.Companion.getSpaceBetweenPart$div_release(sumOfCrossSize, this.lines.size()));
                                wrapLine2.setCrossSize(iC2);
                                this.middleLineSeparatorOffset = iC2 / 2;
                                addSpaceBetweenLines(wrapLine2);
                                return;
                            }
                            WrapLine wrapLine3 = new WrapLine(0, 0, 0, 7, null);
                            int iC3 = b.c(DivViewGroup.Companion.getSpaceAroundPart$div_release(sumOfCrossSize, this.lines.size()));
                            wrapLine3.setCrossSize(iC3);
                            this.middleLineSeparatorOffset = iC3;
                            this.edgeLineSeparatorOffset = iC3 / 2;
                            for (int i14 = 0; i14 < this.lines.size(); i14 += 3) {
                                this.lines.add(i14, wrapLine3);
                                this.lines.add(i14 + 2, wrapLine3);
                            }
                            return;
                        }
                    }
                }
                WrapLine wrapLine4 = new WrapLine(0, 0, 0, 7, null);
                wrapLine4.setCrossSize(sumOfCrossSize);
                this.lines.add(0, wrapLine4);
                return;
            }
            WrapLine wrapLine5 = new WrapLine(0, 0, 0, 7, null);
            wrapLine5.setCrossSize(sumOfCrossSize / 2);
            addEdgeSpace(wrapLine5);
        }
    }

    private final void drawSeparator(Canvas canvas, int i10, int i11, int i12, int i13) {
        drawSeparator(getSeparatorDrawable(), canvas, i10 + this.separatorMarginLeft, i11 - this.separatorMarginTop, i12 - this.separatorMarginRight, i13 + this.separatorMarginBottom);
    }

    public static /* synthetic */ void getShowLineSeparators$annotations() {
    }

    public static /* synthetic */ void getShowSeparators$annotations() {
    }

    public static /* synthetic */ void getWrapDirection$annotations() {
    }

    private final boolean isWrapRequired(int i10, int i11, int i12, int i13, int i14) {
        return i10 != 0 && i11 < (i12 + i13) + (i14 != 0 ? getBetweenItemsSpacing() : 0);
    }

    private final boolean showSeparatorAtEnd(int i10) {
        return (i10 & 4) != 0;
    }

    private final boolean showSeparatorAtStart(int i10) {
        return (i10 & 1) != 0;
    }

    private final boolean showSeparatorBetween(int i10) {
        return (i10 & 2) != 0;
    }

    private final void addEdgeSpace(WrapLine wrapLine) {
        this.lines.add(0, wrapLine);
        this.lines.add(wrapLine);
    }

    private final void addLine(WrapLine wrapLine) {
        this.lines.add(wrapLine);
        if (wrapLine.getMaxBaseline() > 0) {
            wrapLine.setCrossSize(Math.max(wrapLine.getCrossSize(), wrapLine.getMaxBaseline() + wrapLine.getMaxHeightUnderBaseline()));
        }
        this.tempSumCrossSize += wrapLine.getCrossSize();
    }

    private final void calculateLines(int i10, int i11) {
        int edgeSeparatorsLength;
        int edgeSeparatorsLength2;
        int i12;
        int i13;
        this.tempSumCrossSize = getEdgeLineSeparatorsLength();
        int i14 = this.isRowDirection ? i10 : i11;
        int mode = View.MeasureSpec.getMode(i14);
        int size = View.MeasureSpec.getSize(i14);
        int edgeSeparatorsLength3 = getEdgeSeparatorsLength() + (this.isRowDirection ? getHorizontalPaddings$div_release() : getVerticalPaddings$div_release());
        WrapLine wrapLine = new WrapLine(0, edgeSeparatorsLength3, 0, 5, null);
        WrapLine wrapLine2 = wrapLine;
        int i15 = 0;
        int iMax = Integer.MIN_VALUE;
        for (View view : ViewGroupKt.getChildren(this)) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                nj.s.u();
            }
            View view2 = view;
            if (isHidden(view2)) {
                wrapLine2.setGoneItemCount(wrapLine2.getGoneItemCount() + 1);
                wrapLine2.setItemCount(wrapLine2.getItemCount() + 1);
                addLineIfNeeded(i15, wrapLine2);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                int horizontalPaddings$div_release = getHorizontalPaddings$div_release() + divLayoutParams.getHorizontalMargins$div_release();
                int verticalPaddings$div_release = getVerticalPaddings$div_release() + divLayoutParams.getVerticalMargins$div_release();
                if (this.isRowDirection) {
                    edgeSeparatorsLength = horizontalPaddings$div_release + getEdgeSeparatorsLength();
                    edgeSeparatorsLength2 = this.tempSumCrossSize;
                } else {
                    edgeSeparatorsLength = horizontalPaddings$div_release + this.tempSumCrossSize;
                    edgeSeparatorsLength2 = getEdgeSeparatorsLength();
                }
                int i17 = edgeSeparatorsLength;
                DivViewGroup.Companion companion = DivViewGroup.Companion;
                view2.measure(companion.getChildMeasureSpec(i10, i17, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, view2.getMinimumWidth(), divLayoutParams.getMaxWidth()), companion.getChildMeasureSpec(i11, verticalPaddings$div_release + edgeSeparatorsLength2, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, view2.getMinimumHeight(), divLayoutParams.getMaxHeight()));
                this.childState = View.combineMeasuredStates(this.childState, view2.getMeasuredState());
                int measuredWidth = view2.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release();
                int measuredHeight = view2.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release();
                if (this.isRowDirection) {
                    i13 = measuredWidth;
                    i12 = measuredHeight;
                } else {
                    i12 = measuredWidth;
                    i13 = measuredHeight;
                }
                int i18 = i12;
                if (isWrapRequired(mode, size, wrapLine2.getMainSize(), i13, wrapLine2.getItemCount())) {
                    if (wrapLine2.getItemCountNotGone() > 0) {
                        addLine(wrapLine2);
                    }
                    wrapLine2 = new WrapLine(i15, edgeSeparatorsLength3, 1);
                    iMax = Integer.MIN_VALUE;
                } else {
                    if (wrapLine2.getItemCount() > 0) {
                        wrapLine2.setMainSize(wrapLine2.getMainSize() + getBetweenItemsSpacing());
                    }
                    wrapLine2.setItemCount(wrapLine2.getItemCount() + 1);
                }
                if (this.isRowDirection && divLayoutParams.isBaselineAligned()) {
                    wrapLine2.setMaxBaseline(Math.max(wrapLine2.getMaxBaseline(), view2.getBaseline() + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin));
                    wrapLine2.setMaxHeightUnderBaseline(Math.max(wrapLine2.getMaxHeightUnderBaseline(), (view2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin) - view2.getBaseline()));
                }
                wrapLine2.setMainSize(wrapLine2.getMainSize() + i13);
                iMax = Math.max(iMax, i18);
                wrapLine2.setCrossSize(Math.max(wrapLine2.getCrossSize(), iMax));
                addLineIfNeeded(i15, wrapLine2);
            }
            i15 = i16;
            mode = mode;
        }
    }

    private final void drawSeparatorsHorizontal(Canvas canvas) {
        int right;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        if (this.lines.size() > 0 && showSeparatorAtStart(getShowLineSeparators())) {
            WrapLine firstVisibleLine = getFirstVisibleLine();
            int bottom = firstVisibleLine != null ? firstVisibleLine.getBottom() - firstVisibleLine.getCrossSize() : 0;
            ref$IntRef.element = bottom;
            drawSeparatorsHorizontal$drawLineSeparator(this, canvas, bottom - this.edgeLineSeparatorOffset);
        }
        boolean z10 = false;
        for (WrapLine wrapLine : this.lines) {
            if (wrapLine.getItemCountNotGone() != 0) {
                int bottom2 = wrapLine.getBottom();
                ref$IntRef2.element = bottom2;
                ref$IntRef.element = bottom2 - wrapLine.getCrossSize();
                if (z10 && showSeparatorBetween(getShowLineSeparators())) {
                    drawSeparatorsHorizontal$drawLineSeparator(this, canvas, ref$IntRef.element - this.middleLineSeparatorOffset);
                }
                g indices = com.yandex.div.core.util.ViewsKt.getIndices(this, wrapLine.getFirstIndex(), wrapLine.getItemCount());
                int iE = indices.e();
                int iF = indices.f();
                int iG = indices.g();
                if ((iG > 0 && iE <= iF) || (iG < 0 && iF <= iE)) {
                    right = 0;
                    boolean z11 = true;
                    while (true) {
                        View childAt = getChildAt(iE);
                        if (childAt != null && !isHidden(childAt)) {
                            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                            p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                            int left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                            right = ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin + childAt.getRight();
                            if (z11) {
                                if (showLeftSeparator(getShowSeparators())) {
                                    drawSeparatorsHorizontal$lambda$12$drawSeparator(this, canvas, ref$IntRef, ref$IntRef2, left - wrapLine.getEdgeSeparatorOffset());
                                }
                                z11 = false;
                            } else if (showSeparatorBetween(getShowSeparators())) {
                                drawSeparatorsHorizontal$lambda$12$drawSeparator(this, canvas, ref$IntRef, ref$IntRef2, left - ((int) (wrapLine.getSpaceBetweenChildren() / 2)));
                            }
                        }
                        if (iE == iF) {
                            break;
                        } else {
                            iE += iG;
                        }
                    }
                } else {
                    right = 0;
                }
                if (right > 0 && showRightSeparator(getShowSeparators())) {
                    drawSeparatorsHorizontal$lambda$12$drawSeparator(this, canvas, ref$IntRef, ref$IntRef2, right + getSeparatorLength() + wrapLine.getEdgeSeparatorOffset());
                }
                z10 = true;
            }
        }
        if (ref$IntRef2.element <= 0 || !showSeparatorAtEnd(getShowLineSeparators())) {
            return;
        }
        drawSeparatorsHorizontal$drawLineSeparator(this, canvas, ref$IntRef2.element + getLineSeparatorLength() + this.edgeLineSeparatorOffset);
    }

    private final void drawSeparatorsVertical(Canvas canvas) {
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        if (this.lines.size() > 0 && showLeftSeparator(getShowLineSeparators())) {
            WrapLine firstVisibleLine = getFirstVisibleLine();
            int right = firstVisibleLine != null ? firstVisibleLine.getRight() - firstVisibleLine.getCrossSize() : 0;
            ref$IntRef.element = right;
            drawSeparatorsVertical$drawLineSeparator$13(this, canvas, right - this.edgeLineSeparatorOffset);
        }
        Iterator<Integer> it = com.yandex.div.core.util.ViewsKt.getIndices(this, 0, this.lines.size()).iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            WrapLine wrapLine = this.lines.get(((g0) it).nextInt());
            if (wrapLine.getItemCountNotGone() != 0) {
                int right2 = wrapLine.getRight();
                ref$IntRef2.element = right2;
                ref$IntRef.element = right2 - wrapLine.getCrossSize();
                if (z10 && showSeparatorBetween(getShowLineSeparators())) {
                    drawSeparatorsVertical$drawLineSeparator$13(this, canvas, ref$IntRef.element - this.middleLineSeparatorOffset);
                }
                boolean z11 = true;
                z10 = getLineSeparatorDrawable() != null;
                int itemCount = wrapLine.getItemCount();
                int bottom = 0;
                for (int i10 = 0; i10 < itemCount; i10++) {
                    View childAt = getChildAt(wrapLine.getFirstIndex() + i10);
                    if (childAt != null && !isHidden(childAt)) {
                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                        int top2 = childAt.getTop() - ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                        bottom = ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin + childAt.getBottom();
                        if (z11) {
                            if (showSeparatorAtStart(getShowSeparators())) {
                                drawSeparatorsVertical$lambda$16$drawSeparator$15(this, canvas, ref$IntRef, ref$IntRef2, top2 - wrapLine.getEdgeSeparatorOffset());
                            }
                            z11 = false;
                        } else if (showSeparatorBetween(getShowSeparators())) {
                            drawSeparatorsVertical$lambda$16$drawSeparator$15(this, canvas, ref$IntRef, ref$IntRef2, top2 - ((int) (wrapLine.getSpaceBetweenChildren() / 2)));
                        }
                    }
                }
                if (bottom > 0 && showSeparatorAtEnd(getShowSeparators())) {
                    drawSeparatorsVertical$lambda$16$drawSeparator$15(this, canvas, ref$IntRef, ref$IntRef2, bottom + getSeparatorLength() + wrapLine.getEdgeSeparatorOffset());
                }
            }
        }
        if (ref$IntRef2.element <= 0 || !showRightSeparator(getShowLineSeparators())) {
            return;
        }
        drawSeparatorsVertical$drawLineSeparator$13(this, canvas, ref$IntRef2.element + getLineSeparatorLength() + this.edgeLineSeparatorOffset);
    }

    private static final void drawSeparatorsVertical$lambda$16$drawSeparator$15(WrapContainerLayout wrapContainerLayout, Canvas canvas, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, int i10) {
        wrapContainerLayout.drawSeparator(canvas, ref$IntRef.element, i10 - wrapContainerLayout.getSeparatorLength(), ref$IntRef2.element, i10);
    }

    private final WrapLine getFirstVisibleLine() {
        Object obj = null;
        if (!this.isRowDirection && com.yandex.div.core.util.ViewsKt.isLayoutRtl(this)) {
            List<WrapLine> list = this.lines;
            ListIterator<WrapLine> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                objPrevious = listIterator.previous();
                if (((WrapLine) objPrevious).isVisible()) {
                    obj = objPrevious;
                    break;
                }
            }
        } else {
            for (Object objPrevious : this.lines) {
                if (((WrapLine) objPrevious).isVisible()) {
                    obj = objPrevious;
                    break;
                }
            }
        }
        return (WrapLine) obj;
    }

    private final boolean getHasIncorrectSize(View view) {
        if (this.isRowDirection) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            return isIncorrectForCrossAxis(layoutParams != null ? Integer.valueOf(layoutParams.height) : null);
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        return isIncorrectForCrossAxis(layoutParams2 != null ? Integer.valueOf(layoutParams2.width) : null);
    }

    private final int getLargestMainSize() {
        Integer num;
        Iterator<T> it = this.lines.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(((WrapLine) it.next()).getMainSize());
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((WrapLine) it.next()).getMainSize());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        Integer num2 = num;
        if (num2 != null) {
            return num2.intValue();
        }
        return 0;
    }

    private final int getLineSeparatorLength() {
        int intrinsicWidth;
        int i10;
        if (this.isRowDirection) {
            Drawable lineSeparatorDrawable = getLineSeparatorDrawable();
            intrinsicWidth = (lineSeparatorDrawable != null ? lineSeparatorDrawable.getIntrinsicHeight() : 0) + this.lineSeparatorMarginTop;
            i10 = this.lineSeparatorMarginBottom;
        } else {
            Drawable lineSeparatorDrawable2 = getLineSeparatorDrawable();
            intrinsicWidth = (lineSeparatorDrawable2 != null ? lineSeparatorDrawable2.getIntrinsicWidth() : 0) + this.lineSeparatorMarginLeft;
            i10 = this.lineSeparatorMarginRight;
        }
        return intrinsicWidth + i10;
    }

    private final int getSeparatorLength() {
        int intrinsicHeight;
        int i10;
        if (this.isRowDirection) {
            Drawable separatorDrawable = getSeparatorDrawable();
            intrinsicHeight = (separatorDrawable != null ? separatorDrawable.getIntrinsicWidth() : 0) + this.separatorMarginLeft;
            i10 = this.separatorMarginRight;
        } else {
            Drawable separatorDrawable2 = getSeparatorDrawable();
            intrinsicHeight = (separatorDrawable2 != null ? separatorDrawable2.getIntrinsicHeight() : 0) + this.separatorMarginTop;
            i10 = this.separatorMarginBottom;
        }
        return intrinsicHeight + i10;
    }

    private final int getSize(int i10, int i11, int i12, boolean z10) {
        if (i10 != Integer.MIN_VALUE) {
            if (i10 != 0) {
                if (i10 == 1073741824) {
                    return i11;
                }
                throw new IllegalStateException("Unknown size mode is set: " + i10);
            }
        } else {
            if (z10) {
                return Math.min(i11, i12);
            }
            if (i12 > i11 || getVisibleLinesCount() > 1) {
                return i11;
            }
        }
        return i12;
    }

    private final int getState(int i10, int i11, int i12, int i13, int i14) {
        return (i10 != 0 && i12 < i13) ? View.combineMeasuredStates(i11, i14) : i11;
    }

    private final int getSumOfCrossSize() {
        Iterator<T> it = this.lines.iterator();
        int crossSize = 0;
        while (it.hasNext()) {
            crossSize += ((WrapLine) it.next()).getCrossSize();
        }
        return crossSize + getEdgeLineSeparatorsLength() + (getBetweenLinesSpacing() * (getVisibleLinesCount() - 1));
    }

    private final int getVisibleLinesCount() {
        List<WrapLine> list = this.lines;
        if ((list instanceof Collection) && list.isEmpty()) {
            return 0;
        }
        Iterator<T> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if ((((WrapLine) it.next()).getItemCountNotGone() > 0) && (i10 = i10 + 1) < 0) {
                nj.s.t();
            }
        }
        return i10;
    }

    private final boolean isIncorrectForCrossAxis(Integer num) {
        return num != null && num.intValue() == -1;
    }

    private final void layoutHorizontal(int i10, int i11) {
        int paddingTop = getPaddingTop() + getStartLineSeparatorLength();
        int absoluteGravity = GravityCompat.getAbsoluteGravity(getHorizontalGravity$div_release(), ViewCompat.getLayoutDirection(this));
        boolean z10 = false;
        for (WrapLine wrapLine : this.lines) {
            float paddingLeft = getPaddingLeft() + (com.yandex.div.core.util.ViewsKt.isLayoutRtl(this) ? getEndSeparatorLength() : getStartSeparatorLength());
            float mainSize = (i11 - i10) - wrapLine.getMainSize();
            DivViewGroup.OffsetsHolder offsetsHolder = this.offsetsHolder;
            offsetsHolder.update(mainSize, absoluteGravity, wrapLine.getItemCountNotGone());
            float firstChildOffset = paddingLeft + offsetsHolder.getFirstChildOffset();
            wrapLine.setSpaceBetweenChildren(offsetsHolder.getSpaceBetweenChildren());
            wrapLine.setEdgeSeparatorOffset(offsetsHolder.getEdgeDividerOffset());
            if (wrapLine.getItemCountNotGone() > 0) {
                if (z10) {
                    paddingTop += getBetweenLinesSpacing();
                }
                z10 = true;
            }
            g indices = com.yandex.div.core.util.ViewsKt.getIndices(this, wrapLine.getFirstIndex(), wrapLine.getItemCount());
            int iE = indices.e();
            int iF = indices.f();
            int iG = indices.g();
            if ((iG > 0 && iE <= iF) || (iG < 0 && iF <= iE)) {
                boolean z11 = false;
                while (true) {
                    View childAt = getChildAt(iE);
                    if (childAt != null && !isHidden(childAt)) {
                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                        float betweenItemsSpacing = firstChildOffset + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                        if (z11) {
                            betweenItemsSpacing += getBetweenItemsSpacing();
                        }
                        int topOffsetForHorizontalLayout = getTopOffsetForHorizontalLayout(childAt, wrapLine) + paddingTop;
                        childAt.layout(b.c(betweenItemsSpacing), topOffsetForHorizontalLayout, b.c(betweenItemsSpacing) + childAt.getMeasuredWidth(), topOffsetForHorizontalLayout + childAt.getMeasuredHeight());
                        firstChildOffset = betweenItemsSpacing + childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin + wrapLine.getSpaceBetweenChildren();
                        z11 = true;
                    } else if (getHasIncorrectSize(childAt)) {
                        childAt.layout(0, 0, 0, 0);
                    }
                    if (iE != iF) {
                        iE += iG;
                    }
                }
            }
            paddingTop += wrapLine.getCrossSize();
            wrapLine.setRight(b.c(firstChildOffset));
            wrapLine.setBottom(paddingTop);
        }
    }

    private final void layoutVertical(int i10, int i11) {
        int paddingLeft = getPaddingLeft() + (com.yandex.div.core.util.ViewsKt.isLayoutRtl(this) ? getEndLineSeparatorLength() : getStartLineSeparatorLength());
        Iterator<Integer> it = com.yandex.div.core.util.ViewsKt.getIndices(this, 0, this.lines.size()).iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            WrapLine wrapLine = this.lines.get(((g0) it).nextInt());
            float mainSize = (i11 - i10) - wrapLine.getMainSize();
            float paddingTop = getPaddingTop() + getStartSeparatorLength();
            DivViewGroup.OffsetsHolder offsetsHolder = this.offsetsHolder;
            offsetsHolder.update(mainSize, getVerticalGravity$div_release(), wrapLine.getItemCountNotGone());
            float firstChildOffset = paddingTop + offsetsHolder.getFirstChildOffset();
            wrapLine.setSpaceBetweenChildren(offsetsHolder.getSpaceBetweenChildren());
            wrapLine.setEdgeSeparatorOffset(offsetsHolder.getEdgeDividerOffset());
            if (wrapLine.getItemCountNotGone() > 0) {
                if (z10) {
                    paddingLeft += getBetweenLinesSpacing();
                }
                z10 = true;
            }
            int itemCount = wrapLine.getItemCount();
            boolean z11 = false;
            for (int i12 = 0; i12 < itemCount; i12++) {
                View childAt = getChildAt(wrapLine.getFirstIndex() + i12);
                if (childAt != null && !isHidden(childAt)) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                    float betweenItemsSpacing = firstChildOffset + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                    if (z11) {
                        betweenItemsSpacing += getBetweenItemsSpacing();
                    }
                    int leftOffsetForVerticalLayout = getLeftOffsetForVerticalLayout(childAt, wrapLine.getCrossSize()) + paddingLeft;
                    childAt.layout(leftOffsetForVerticalLayout, b.c(betweenItemsSpacing), childAt.getMeasuredWidth() + leftOffsetForVerticalLayout, b.c(betweenItemsSpacing) + childAt.getMeasuredHeight());
                    firstChildOffset = betweenItemsSpacing + childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin + wrapLine.getSpaceBetweenChildren();
                    z11 = true;
                } else if (getHasIncorrectSize(childAt)) {
                    childAt.layout(0, 0, 0, 0);
                }
            }
            paddingLeft += wrapLine.getCrossSize();
            wrapLine.setRight(paddingLeft);
            wrapLine.setBottom(b.c(firstChildOffset));
        }
    }

    public float getAspectRatio() {
        return ((Number) this.aspectRatio$delegate.getValue(this, $$delegatedProperties[4])).floatValue();
    }

    public final Drawable getLineSeparatorDrawable() {
        return (Drawable) this.lineSeparatorDrawable$delegate.getValue(this, $$delegatedProperties[3]);
    }

    public final Drawable getSeparatorDrawable() {
        return (Drawable) this.separatorDrawable$delegate.getValue(this, $$delegatedProperties[2]);
    }

    public final int getShowLineSeparators() {
        return ((Number) this.showLineSeparators$delegate.getValue(this, $$delegatedProperties[1])).intValue();
    }

    public final int getShowSeparators() {
        return ((Number) this.showSeparators$delegate.getValue(this, $$delegatedProperties[0])).intValue();
    }

    public final int getWrapDirection() {
        return this.wrapDirection;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.isRowDirection) {
            layoutHorizontal(i10, i12);
        } else {
            layoutVertical(i11, i13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d3  */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec;
        int mode;
        int size;
        int i12;
        this.lines.clear();
        this.childState = 0;
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        int i13 = 1073741824;
        if ((getAspectRatio() == 0.0f) || mode2 != 1073741824) {
            iMakeMeasureSpec = i11;
            mode = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
        } else {
            int iC = b.c(size2 / getAspectRatio());
            size = iC;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iC, 1073741824);
            mode = 1073741824;
        }
        calculateLines(i10, iMakeMeasureSpec);
        if (this.isRowDirection) {
            determineCrossSize(iMakeMeasureSpec, getVerticalGravity$div_release(), getVerticalPaddings$div_release());
        } else {
            determineCrossSize(i10, getHorizontalGravity$div_release(), getHorizontalPaddings$div_release());
        }
        int largestMainSize = this.isRowDirection ? getLargestMainSize() : getSumOfCrossSize() + getHorizontalPaddings$div_release();
        int sumOfCrossSize = this.isRowDirection ? getSumOfCrossSize() + getVerticalPaddings$div_release() : getLargestMainSize();
        this.childState = getState(mode2, this.childState, size2, largestMainSize, 16777216);
        int iResolveSizeAndState = View.resolveSizeAndState(getSize(mode2, size2, largestMainSize, !this.isRowDirection), i10, this.childState);
        if (this.isRowDirection) {
            if ((getAspectRatio() == 0.0f) || mode2 == 1073741824) {
                i13 = mode;
                i12 = size;
            } else {
                int iC2 = b.c((16777215 & iResolveSizeAndState) / getAspectRatio());
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iC2, 1073741824);
                i12 = iC2;
            }
        } else {
            i13 = mode;
            i12 = size;
        }
        this.childState = getState(i13, this.childState, i12, sumOfCrossSize, 256);
        setMeasuredDimension(iResolveSizeAndState, View.resolveSizeAndState(getSize(i13, i12, sumOfCrossSize, this.isRowDirection), iMakeMeasureSpec, this.childState));
    }

    @Override // com.yandex.div.core.widget.AspectView
    public void setAspectRatio(float f10) {
        this.aspectRatio$delegate.setValue(this, $$delegatedProperties[4], Float.valueOf(f10));
    }

    public final void setItemSpacing(int i10) {
        if (this.itemSpacingPx != i10) {
            this.itemSpacingPx = i10;
            requestLayout();
        }
    }

    public final void setLineSeparatorDrawable(Drawable drawable) {
        this.lineSeparatorDrawable$delegate.setValue(this, $$delegatedProperties[3], drawable);
    }

    public final void setLineSeparatorMargins(int i10, int i11, int i12, int i13) {
        this.lineSeparatorMarginLeft = i10;
        this.lineSeparatorMarginRight = i12;
        this.lineSeparatorMarginTop = i11;
        this.lineSeparatorMarginBottom = i13;
        requestLayout();
    }

    public final void setLineSpacing(int i10) {
        if (this.lineSpacingPx != i10) {
            this.lineSpacingPx = i10;
            requestLayout();
        }
    }

    public final void setSeparatorDrawable(Drawable drawable) {
        this.separatorDrawable$delegate.setValue(this, $$delegatedProperties[2], drawable);
    }

    public final void setSeparatorMargins(int i10, int i11, int i12, int i13) {
        this.separatorMarginLeft = i10;
        this.separatorMarginRight = i12;
        this.separatorMarginTop = i11;
        this.separatorMarginBottom = i13;
        requestLayout();
    }

    public final void setShowLineSeparators(int i10) {
        this.showLineSeparators$delegate.setValue(this, $$delegatedProperties[1], Integer.valueOf(i10));
    }

    public final void setShowSeparators(int i10) {
        this.showSeparators$delegate.setValue(this, $$delegatedProperties[0], Integer.valueOf(i10));
    }

    public final void setWrapDirection(int i10) {
        if (this.wrapDirection != i10) {
            this.wrapDirection = i10;
            boolean z10 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("Invalid value for the wrap direction is set: " + this.wrapDirection);
                }
                z10 = false;
            }
            this.isRowDirection = z10;
            requestLayout();
        }
    }

    private final void addLineIfNeeded(int i10, WrapLine wrapLine) {
        boolean z10 = true;
        if (i10 != getChildCount() - 1 || wrapLine.getItemCountNotGone() == 0) {
            z10 = false;
        }
        if (z10) {
            addLine(wrapLine);
        }
    }

    private final void drawLineSeparator(Canvas canvas, int i10, int i11, int i12, int i13) {
        drawSeparator(getLineSeparatorDrawable(), canvas, i10 + this.lineSeparatorMarginLeft, i11 - this.lineSeparatorMarginTop, i12 - this.lineSeparatorMarginRight, i13 + this.lineSeparatorMarginBottom);
    }

    private static final void drawSeparatorsHorizontal$drawLineSeparator(WrapContainerLayout wrapContainerLayout, Canvas canvas, int i10) {
        wrapContainerLayout.drawLineSeparator(canvas, wrapContainerLayout.getPaddingLeft(), i10 - wrapContainerLayout.getLineSeparatorLength(), wrapContainerLayout.getWidth() - wrapContainerLayout.getPaddingRight(), i10);
    }

    private static final void drawSeparatorsHorizontal$lambda$12$drawSeparator(WrapContainerLayout wrapContainerLayout, Canvas canvas, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, int i10) {
        wrapContainerLayout.drawSeparator(canvas, i10 - wrapContainerLayout.getSeparatorLength(), ref$IntRef.element, i10, ref$IntRef2.element);
    }

    private static final void drawSeparatorsVertical$drawLineSeparator$13(WrapContainerLayout wrapContainerLayout, Canvas canvas, int i10) {
        wrapContainerLayout.drawLineSeparator(canvas, i10 - wrapContainerLayout.getLineSeparatorLength(), wrapContainerLayout.getPaddingTop(), i10, wrapContainerLayout.getHeight() - wrapContainerLayout.getPaddingBottom());
    }

    private final int getBetweenItemsSpacing() {
        if (showSeparatorBetween(getShowSeparators())) {
            return getSeparatorLength();
        }
        return this.itemSpacingPx;
    }

    private final int getBetweenLinesSpacing() {
        if (showSeparatorBetween(getShowLineSeparators())) {
            return getLineSeparatorLength();
        }
        return this.lineSpacingPx;
    }

    private final int getEdgeLineSeparatorsLength() {
        return getStartLineSeparatorLength() + getEndLineSeparatorLength();
    }

    private final int getEdgeSeparatorsLength() {
        return getStartSeparatorLength() + getEndSeparatorLength();
    }

    private final int getEndLineSeparatorLength() {
        if (showSeparatorAtEnd(getShowLineSeparators())) {
            return getLineSeparatorLength();
        }
        return 0;
    }

    private final int getEndSeparatorLength() {
        if (showSeparatorAtEnd(getShowSeparators())) {
            return getSeparatorLength();
        }
        return 0;
    }

    private final int getLeftOffsetForVerticalLayout(View view, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        int absoluteGravity = GravityCompat.getAbsoluteGravity(DivViewGroup.Companion.toHorizontalGravity(divLayoutParams.getGravity()), ViewCompat.getLayoutDirection(this));
        if (absoluteGravity != 1) {
            if (absoluteGravity != 5) {
                return ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
            }
            return (i10 - view.getMeasuredWidth()) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin;
        }
        return (((i10 - view.getMeasuredWidth()) + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin) / 2;
    }

    private final int getMiddleLineSeparatorLength() {
        if (showSeparatorBetween(getShowLineSeparators())) {
            return getLineSeparatorLength();
        }
        return 0;
    }

    private final int getMiddleSeparatorLength() {
        if (showSeparatorBetween(getShowSeparators())) {
            return getSeparatorLength();
        }
        return 0;
    }

    private final int getStartLineSeparatorLength() {
        if (showSeparatorAtStart(getShowLineSeparators())) {
            return getLineSeparatorLength();
        }
        return 0;
    }

    private final int getStartSeparatorLength() {
        if (showSeparatorAtStart(getShowSeparators())) {
            return getSeparatorLength();
        }
        return 0;
    }

    private final int getTopOffsetForHorizontalLayout(View view, WrapLine wrapLine) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        int verticalGravity = DivViewGroup.Companion.toVerticalGravity(divLayoutParams.getGravity());
        if (verticalGravity != 16) {
            if (verticalGravity != 80) {
                if (divLayoutParams.isBaselineAligned()) {
                    return Math.max(wrapLine.getMaxBaseline() - view.getBaseline(), ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin);
                }
                return ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
            }
            return (wrapLine.getCrossSize() - view.getMeasuredHeight()) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin;
        }
        return (((wrapLine.getCrossSize() - view.getMeasuredHeight()) + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin) / 2;
    }

    private final boolean isHidden(View view) {
        if (view.getVisibility() != 8 && !getHasIncorrectSize(view)) {
            return false;
        }
        return true;
    }

    private final boolean showLeftSeparator(int i10) {
        if (com.yandex.div.core.util.ViewsKt.isLayoutRtl(this)) {
            return showSeparatorAtEnd(i10);
        }
        return showSeparatorAtStart(i10);
    }

    private final boolean showRightSeparator(int i10) {
        if (com.yandex.div.core.util.ViewsKt.isLayoutRtl(this)) {
            return showSeparatorAtStart(i10);
        }
        return showSeparatorAtEnd(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getSeparatorDrawable() == null && getLineSeparatorDrawable() == null) {
            return;
        }
        if (getShowSeparators() == 0 && getShowLineSeparators() == 0) {
            return;
        }
        if (this.isRowDirection) {
            drawSeparatorsHorizontal(canvas);
        } else {
            drawSeparatorsVertical(canvas);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        WrapLine firstVisibleLine = getFirstVisibleLine();
        if (firstVisibleLine != null) {
            return firstVisibleLine.getMaxBaseline() + getPaddingTop();
        }
        return super.getBaseline();
    }

    private final r drawSeparator(Drawable drawable, Canvas canvas, int i10, int i11, int i12, int i13) {
        if (drawable == null) {
            return null;
        }
        float f10 = (i10 + i12) / 2.0f;
        float f11 = (i11 + i13) / 2.0f;
        float intrinsicWidth = drawable.getIntrinsicWidth() / 2.0f;
        float intrinsicHeight = drawable.getIntrinsicHeight() / 2.0f;
        drawable.setBounds((int) (f10 - intrinsicWidth), (int) (f11 - intrinsicHeight), (int) (f10 + intrinsicWidth), (int) (f11 + intrinsicHeight));
        drawable.draw(canvas);
        return r.f64562a;
    }
}
