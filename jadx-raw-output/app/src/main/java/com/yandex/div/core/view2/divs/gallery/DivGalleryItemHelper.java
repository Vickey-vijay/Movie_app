package com.yandex.div.core.view2.divs.gallery;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.R$id;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.widget.ViewsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivGallery;
import ik.k;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.sequences.SequencesKt___SequencesKt;
import oe.e2;

/* JADX INFO: compiled from: DivGalleryItemHelper.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface DivGalleryItemHelper {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: DivGalleryItemHelper.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: compiled from: DivGalleryItemHelper.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;
            public static final /* synthetic */ int[] $EnumSwitchMapping$2;

            static {
                int[] iArr = new int[DivGallery.CrossContentAlignment.values().length];
                try {
                    iArr[DivGallery.CrossContentAlignment.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DivGallery.CrossContentAlignment.CENTER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DivGallery.CrossContentAlignment.END.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[DivAlignmentHorizontal.values().length];
                try {
                    iArr2[DivAlignmentHorizontal.LEFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[DivAlignmentHorizontal.CENTER.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[DivAlignmentHorizontal.RIGHT.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[DivAlignmentHorizontal.START.ordinal()] = 4;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[DivAlignmentHorizontal.END.ordinal()] = 5;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$1 = iArr2;
                int[] iArr3 = new int[DivAlignmentVertical.values().length];
                try {
                    iArr3[DivAlignmentVertical.TOP.ordinal()] = 1;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr3[DivAlignmentVertical.BASELINE.ordinal()] = 2;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr3[DivAlignmentVertical.CENTER.ordinal()] = 3;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr3[DivAlignmentVertical.BOTTOM.ordinal()] = 4;
                } catch (NoSuchFieldError unused12) {
                }
                $EnumSwitchMapping$2 = iArr3;
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DivGallery.CrossContentAlignment asCrossContentAlignment(DivAlignmentHorizontal divAlignmentHorizontal) {
            int i10 = WhenMappings.$EnumSwitchMapping$1[divAlignmentHorizontal.ordinal()];
            if (i10 == 1) {
                return DivGallery.CrossContentAlignment.START;
            }
            if (i10 == 2) {
                return DivGallery.CrossContentAlignment.CENTER;
            }
            if (i10 == 3) {
                return DivGallery.CrossContentAlignment.END;
            }
            if (i10 == 4) {
                return DivGallery.CrossContentAlignment.START;
            }
            if (i10 == 5) {
                return DivGallery.CrossContentAlignment.END;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int calculateOffset(int i10, int i11, DivGallery.CrossContentAlignment crossContentAlignment) {
            int i12 = i10 - i11;
            int i13 = WhenMappings.$EnumSwitchMapping$0[crossContentAlignment.ordinal()];
            if (i13 == 1) {
                return 0;
            }
            if (i13 == 2) {
                return i12 / 2;
            }
            if (i13 == 3) {
                return i12;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DivGallery.CrossContentAlignment asCrossContentAlignment(DivAlignmentVertical divAlignmentVertical) {
            int i10 = WhenMappings.$EnumSwitchMapping$2[divAlignmentVertical.ordinal()];
            if (i10 == 1 || i10 == 2) {
                return DivGallery.CrossContentAlignment.START;
            }
            if (i10 == 3) {
                return DivGallery.CrossContentAlignment.CENTER;
            }
            if (i10 == 4) {
                return DivGallery.CrossContentAlignment.END;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: compiled from: DivGalleryItemHelper.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScrollPosition.values().length];
            try {
                iArr[ScrollPosition.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScrollPosition.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    default void _detachView(View view) {
        trackVisibilityAction(view, true);
    }

    View _getChildAt(int i10);

    int _getPosition(View view);

    default void _layoutDecorated(View view, int i10, int i11, int i12, int i13) {
        trackVisibilityAction$default(this, view, false, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f8  */
    default void _layoutDecoratedWithMargins(View view, int i10, int i11, int i12, int i13, boolean z10) {
        ExpressionResolver expressionResolver;
        int iCalculateOffset;
        int iCalculateOffset2;
        DivGallery.CrossContentAlignment crossContentAlignmentEvaluate;
        DivAlignmentVertical divAlignmentVerticalEvaluate;
        DivGallery.CrossContentAlignment crossContentAlignmentEvaluate2;
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate;
        Div div;
        int layoutManagerOrientation = getLayoutManagerOrientation();
        int measuredWidth = (getView().getMeasuredWidth() - getView().getPaddingLeft()) - getView().getPaddingRight();
        int measuredHeight = (getView().getMeasuredHeight() - getView().getPaddingTop()) - getView().getPaddingBottom();
        if (layoutManagerOrientation == 0 ? getView().getMeasuredHeight() == 0 || measuredHeight == 0 || view.getMeasuredHeight() == 0 : layoutManagerOrientation == 1 && (getView().getMeasuredWidth() == 0 || measuredWidth == 0 || view.getMeasuredWidth() == 0)) {
            superLayoutDecoratedWithMargins(view, i10, i11, i12, i13);
            if (z10) {
                return;
            }
            getChildrenToRelayout().add(view);
            return;
        }
        Integer num = (Integer) view.getTag(R$id.div_gallery_item_index);
        DivItemBuilderResult itemDiv = num != null ? getItemDiv(num.intValue()) : null;
        e2 e2VarB = (itemDiv == null || (div = itemDiv.getDiv()) == null) ? null : div.b();
        if (itemDiv == null || (expressionResolver = itemDiv.getExpressionResolver()) == null) {
            expressionResolver = getBindingContext().getExpressionResolver();
        }
        Expression<DivGallery.CrossContentAlignment> expression = getDiv().f47270j;
        if (layoutManagerOrientation == 1) {
            Expression<DivAlignmentHorizontal> expressionG = e2VarB != null ? e2VarB.g() : null;
            if (expressionG == null || (divAlignmentHorizontalEvaluate = expressionG.evaluate(expressionResolver)) == null) {
                crossContentAlignmentEvaluate2 = expression.evaluate(expressionResolver);
            } else {
                crossContentAlignmentEvaluate2 = Companion.asCrossContentAlignment(divAlignmentHorizontalEvaluate);
                if (crossContentAlignmentEvaluate2 == null) {
                    crossContentAlignmentEvaluate2 = expression.evaluate(expressionResolver);
                }
            }
            iCalculateOffset = Companion.calculateOffset(measuredWidth, i12 - i10, crossContentAlignmentEvaluate2);
        } else {
            iCalculateOffset = 0;
        }
        if (layoutManagerOrientation == 0) {
            Expression<DivAlignmentVertical> expressionN = e2VarB != null ? e2VarB.n() : null;
            if (expressionN == null || (divAlignmentVerticalEvaluate = expressionN.evaluate(expressionResolver)) == null) {
                crossContentAlignmentEvaluate = expression.evaluate(expressionResolver);
            } else {
                crossContentAlignmentEvaluate = Companion.asCrossContentAlignment(divAlignmentVerticalEvaluate);
                if (crossContentAlignmentEvaluate == null) {
                    crossContentAlignmentEvaluate = expression.evaluate(expressionResolver);
                }
            }
            iCalculateOffset2 = Companion.calculateOffset(measuredHeight, i13 - i11, crossContentAlignmentEvaluate);
        } else {
            iCalculateOffset2 = 0;
        }
        superLayoutDecoratedWithMargins(view, i10 + iCalculateOffset, i11 + iCalculateOffset2, i12 + iCalculateOffset, i13 + iCalculateOffset2);
        trackVisibilityAction$default(this, view, false, 2, null);
        if (z10) {
            return;
        }
        getChildrenToRelayout().remove(view);
    }

    default void _removeView(View view) {
        trackVisibilityAction(view, true);
    }

    int firstCompletelyVisibleItemPosition();

    int firstVisibleItemPosition();

    BindingContext getBindingContext();

    default int getChildMeasureSpec(int i10, int i11, int i12, int i13, int i14, boolean z10) {
        int i15 = i10 - i12;
        boolean z11 = false;
        int iD = k.d(i15, 0);
        if (i13 >= 0 && i13 <= Integer.MAX_VALUE) {
            z11 = true;
        }
        if (z11) {
            return ViewsKt.makeExactSpec(i13);
        }
        if (i13 == -1) {
            return (z10 && i11 == 0) ? ViewsKt.makeUnspecifiedSpec() : View.MeasureSpec.makeMeasureSpec(iD, i11);
        }
        if (i13 == -2) {
            return i14 == Integer.MAX_VALUE ? ViewsKt.makeUnspecifiedSpec() : ViewsKt.makeAtMostSpec(i14);
        }
        if (i13 != -3) {
            return ViewsKt.makeUnspecifiedSpec();
        }
        if (i11 == Integer.MIN_VALUE || i11 == 1073741824) {
            return ViewsKt.makeAtMostSpec(Math.min(iD, i14));
        }
        return i14 == Integer.MAX_VALUE ? ViewsKt.makeUnspecifiedSpec() : ViewsKt.makeAtMostSpec(i14);
    }

    Set<View> getChildrenToRelayout();

    DivGallery getDiv();

    DivItemBuilderResult getItemDiv(int i10);

    int getLayoutManagerOrientation();

    RecyclerView getView();

    void instantScrollToPosition(int i10, ScrollPosition scrollPosition);

    void instantScrollToPositionWithOffset(int i10, int i11, ScrollPosition scrollPosition);

    int lastCompletelyVisibleItemPosition();

    int lastVisibleItemPosition();

    void superLayoutDecoratedWithMargins(View view, int i10, int i11, int i12, int i13);

    RecyclerView.LayoutManager toLayoutManager();

    int width();

    static /* synthetic */ void _layoutDecoratedWithMargins$default(DivGalleryItemHelper divGalleryItemHelper, View view, int i10, int i11, int i12, int i13, boolean z10, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: _layoutDecoratedWithMargins");
        }
        if ((i14 & 32) != 0) {
            z10 = false;
        }
        divGalleryItemHelper._layoutDecoratedWithMargins(view, i10, i11, i12, i13, z10);
    }

    static /* synthetic */ void instantScroll$default(DivGalleryItemHelper divGalleryItemHelper, int i10, ScrollPosition scrollPosition, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: instantScroll");
        }
        if ((i12 & 2) != 0) {
            scrollPosition = ScrollPosition.DEFAULT;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        divGalleryItemHelper.instantScroll(i10, scrollPosition, i11);
    }

    static /* synthetic */ void trackVisibilityAction$default(DivGalleryItemHelper divGalleryItemHelper, View view, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackVisibilityAction");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        divGalleryItemHelper.trackVisibilityAction(view, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    default int getScrollOffset(View view) {
        int left;
        int i10;
        int paddingStart;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int marginStart = 0;
        if (!isHorizontal()) {
            int top2 = view.getTop();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                marginStart = marginLayoutParams.topMargin;
            }
            i10 = top2 - marginStart;
            paddingStart = getView().getPaddingTop();
        } else {
            if (com.yandex.div.core.util.ViewsKt.isLayoutRtl(view)) {
                left = getView().getWidth() - view.getRight();
            } else {
                left = view.getLeft();
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginStart = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart();
            }
            i10 = left - marginStart;
            paddingStart = getView().getPaddingStart();
        }
        return i10 - paddingStart;
    }

    /* JADX INFO: Access modifiers changed from: private */
    default boolean isHorizontal() {
        if (getLayoutManagerOrientation() == 0) {
            return true;
        }
        return false;
    }

    default void _detachViewAt(int i10) {
        View view_getChildAt = _getChildAt(i10);
        if (view_getChildAt == null) {
            return;
        }
        trackVisibilityAction(view_getChildAt, true);
    }

    default void _onAttachedToWindow(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            trackVisibilityAction$default(this, recyclerView.getChildAt(i10), false, 2, null);
        }
    }

    default void _onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            trackVisibilityAction(recyclerView.getChildAt(i10), true);
        }
    }

    default void _onLayoutCompleted(RecyclerView.State state) {
        for (View view : getChildrenToRelayout()) {
            _layoutDecoratedWithMargins(view, view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), true);
        }
        getChildrenToRelayout().clear();
    }

    default void _removeAndRecycleAllViews(RecyclerView.Recycler recycler) {
        RecyclerView view = getView();
        int childCount = view.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            trackVisibilityAction(view.getChildAt(i10), true);
        }
    }

    default void _removeViewAt(int i10) {
        View view_getChildAt = _getChildAt(i10);
        if (view_getChildAt == null) {
            return;
        }
        trackVisibilityAction(view_getChildAt, true);
    }

    default int calcScrollOffset(View view) {
        return getScrollOffset(view);
    }

    default void instantScroll(final int i10, final ScrollPosition scrollPosition, final int i11) {
        View viewFindViewByPosition;
        RecyclerView view = getView();
        if (com.yandex.div.core.util.ViewsKt.isActuallyLaidOut(view) && !view.isLayoutRequested()) {
            if (i10 == 0) {
                if (!isHorizontal() || !com.yandex.div.core.util.ViewsKt.isLayoutRtl(getView())) {
                    i11 = -i11;
                }
                getView().scrollBy(i11, i11);
                return;
            }
            getView().scrollBy(-getView().getScrollX(), -getView().getScrollY());
            RecyclerView.LayoutManager layoutManager = getView().getLayoutManager();
            if (layoutManager != null) {
                viewFindViewByPosition = layoutManager.findViewByPosition(i10);
            } else {
                viewFindViewByPosition = null;
            }
            while (viewFindViewByPosition == null && (getView().canScrollVertically(1) || getView().canScrollHorizontally(1))) {
                RecyclerView.LayoutManager layoutManager2 = getView().getLayoutManager();
                if (layoutManager2 != null) {
                    layoutManager2.requestLayout();
                }
                RecyclerView.LayoutManager layoutManager3 = getView().getLayoutManager();
                if (layoutManager3 != null) {
                    viewFindViewByPosition = layoutManager3.findViewByPosition(i10);
                } else {
                    viewFindViewByPosition = null;
                }
                if (viewFindViewByPosition != null) {
                    break;
                } else {
                    getView().scrollBy(getView().getWidth(), getView().getHeight());
                }
            }
            if (viewFindViewByPosition != null) {
                int i12 = WhenMappings.$EnumSwitchMapping$0[scrollPosition.ordinal()];
                if (i12 != 1) {
                    if (i12 == 2) {
                        int scrollOffset = getScrollOffset(viewFindViewByPosition) - i11;
                        if (com.yandex.div.core.util.ViewsKt.isLayoutRtl(getView())) {
                            scrollOffset = -scrollOffset;
                        }
                        getView().scrollBy(scrollOffset, scrollOffset);
                        return;
                    }
                    return;
                }
                int[] iArr = {0, 0};
                int[] iArr2 = {0, 0};
                getView().getLocationOnScreen(iArr2);
                viewFindViewByPosition.getLocationOnScreen(iArr);
                getView().scrollBy(((viewFindViewByPosition.getWidth() - getView().getWidth()) / 2) + (iArr[0] - iArr2[0]), ((viewFindViewByPosition.getHeight() - getView().getHeight()) / 2) + (iArr[1] - iArr2[1]));
                return;
            }
            return;
        }
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper$instantScroll$$inlined$doOnActualLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view2, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
                View viewFindViewByPosition2;
                int i21;
                view2.removeOnLayoutChangeListener(this);
                if (i10 == 0) {
                    if (this.isHorizontal() && com.yandex.div.core.util.ViewsKt.isLayoutRtl(this.getView())) {
                        i21 = i11;
                    } else {
                        i21 = -i11;
                    }
                    this.getView().scrollBy(i21, i21);
                    return;
                }
                this.getView().scrollBy(-this.getView().getScrollX(), -this.getView().getScrollY());
                RecyclerView.LayoutManager layoutManager4 = this.getView().getLayoutManager();
                if (layoutManager4 != null) {
                    viewFindViewByPosition2 = layoutManager4.findViewByPosition(i10);
                } else {
                    viewFindViewByPosition2 = null;
                }
                while (viewFindViewByPosition2 == null && (this.getView().canScrollVertically(1) || this.getView().canScrollHorizontally(1))) {
                    RecyclerView.LayoutManager layoutManager5 = this.getView().getLayoutManager();
                    if (layoutManager5 != null) {
                        layoutManager5.requestLayout();
                    }
                    RecyclerView.LayoutManager layoutManager6 = this.getView().getLayoutManager();
                    if (layoutManager6 != null) {
                        viewFindViewByPosition2 = layoutManager6.findViewByPosition(i10);
                    } else {
                        viewFindViewByPosition2 = null;
                    }
                    if (viewFindViewByPosition2 != null) {
                        break;
                    } else {
                        this.getView().scrollBy(this.getView().getWidth(), this.getView().getHeight());
                    }
                }
                if (viewFindViewByPosition2 != null) {
                    int i22 = DivGalleryItemHelper.WhenMappings.$EnumSwitchMapping$0[scrollPosition.ordinal()];
                    if (i22 != 1) {
                        if (i22 == 2) {
                            int scrollOffset2 = this.getScrollOffset(viewFindViewByPosition2) - i11;
                            if (com.yandex.div.core.util.ViewsKt.isLayoutRtl(this.getView())) {
                                scrollOffset2 = -scrollOffset2;
                            }
                            this.getView().scrollBy(scrollOffset2, scrollOffset2);
                            return;
                        }
                        return;
                    }
                    int[] iArr3 = {0, 0};
                    int[] iArr4 = {0, 0};
                    this.getView().getLocationOnScreen(iArr4);
                    viewFindViewByPosition2.getLocationOnScreen(iArr3);
                    this.getView().scrollBy(((viewFindViewByPosition2.getWidth() - this.getView().getWidth()) / 2) + (iArr3[0] - iArr4[0]), ((viewFindViewByPosition2.getHeight() - this.getView().getHeight()) / 2) + (iArr3[1] - iArr4[1]));
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    default void trackVisibilityAction(View view, boolean z10) {
        ViewGroup viewGroup;
        View view2;
        BindingContext bindingContext;
        int i_getPosition = _getPosition(view);
        if (i_getPosition == -1) {
            return;
        }
        DivHolderView divHolderView = null;
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        if (viewGroup == null || (view2 = (View) SequencesKt___SequencesKt.D(ViewGroupKt.getChildren(viewGroup))) == 0) {
            return;
        }
        Div2View divView = getBindingContext().getDivView();
        if (z10) {
            Div divTakeBindingDiv$div_release = divView.takeBindingDiv$div_release(view2);
            if (divTakeBindingDiv$div_release == null) {
                return;
            }
            if (view2 instanceof DivHolderView) {
                divHolderView = (DivHolderView) view2;
            }
            if (divHolderView != null && (bindingContext = divHolderView.getBindingContext()) != null) {
                divView.getDiv2Component$div_release().getVisibilityActionTracker().cancelTrackingViewsHierarchy(bindingContext, view2, divTakeBindingDiv$div_release);
                divView.unbindViewFromDiv$div_release(view2);
                return;
            }
            return;
        }
        DivItemBuilderResult itemDiv = getItemDiv(i_getPosition);
        if (itemDiv == null) {
            return;
        }
        divView.getDiv2Component$div_release().getVisibilityActionTracker().startTrackingViewsHierarchy(getBindingContext().getFor(itemDiv.getExpressionResolver()), view2, itemDiv.getDiv());
        divView.bindViewToDiv$div_release(view2, itemDiv.getDiv());
    }
}
