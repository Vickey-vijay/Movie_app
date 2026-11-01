package com.yandex.div.core.view2.divs.gallery;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import ck.p;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivSize;
import ik.k;
import java.util.HashSet;
import nj.b0;
import nj.n;
import oe.e2;

/* JADX INFO: compiled from: DivGridLayoutManager.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivGridLayoutManager extends StaggeredGridLayoutManager implements DivGalleryItemHelper {
    private final BindingContext bindingContext;
    private final HashSet<View> childrenToRelayout;
    private final DivGallery div;
    private final RecyclerView view;

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public void instantScrollToPosition(int i10, ScrollPosition scrollPosition) {
        DivGalleryItemHelper.instantScroll$default(this, i10, scrollPosition, 0, 4, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void layoutDecoratedWithMargins(View view, int i10, int i11, int i12, int i13) {
        DivGalleryItemHelper._layoutDecoratedWithMargins$default(this, view, i10, i11, i12, i13, false, 32, null);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public DivGridLayoutManager toLayoutManager() {
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivGridLayoutManager(BindingContext bindingContext, RecyclerView recyclerView, DivGallery divGallery, int i10) {
        int i11;
        Expression<Long> expression = divGallery.f47268h;
        if (expression != null) {
            long jLongValue = expression.evaluate(bindingContext.getExpressionResolver()).longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                i11 = (int) jLongValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue + "' to Int");
                }
                i11 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        } else {
            i11 = 1;
        }
        super(i11, i10);
        this.bindingContext = bindingContext;
        this.view = recyclerView;
        this.div = divGallery;
        this.childrenToRelayout = new HashSet<>();
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public BindingContext getBindingContext() {
        return this.bindingContext;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public HashSet<View> getChildrenToRelayout() {
        return this.childrenToRelayout;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public DivGallery getDiv() {
        return this.div;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public RecyclerView getView() {
        return this.view;
    }

    private final int getCrossSpacing() {
        Expression<Long> expression = getDiv().f47271k;
        if (expression != null) {
            return BaseDivViewExtensionsKt.dpToPx(Long.valueOf(expression.evaluate(getBindingContext().getExpressionResolver()).longValue()), getView().getResources().getDisplayMetrics());
        }
        return getItemSpacing();
    }

    private final int getItemSpacing() {
        return BaseDivViewExtensionsKt.dpToPx(getDiv().f47280t.evaluate(getBindingContext().getExpressionResolver()), getView().getResources().getDisplayMetrics());
    }

    private final int spacingByOrientation(int i10) {
        if (i10 == getOrientation()) {
            return getItemSpacing();
        }
        return getCrossSpacing();
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public View _getChildAt(int i10) {
        return getChildAt(i10);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int _getPosition(View view) {
        return getPosition(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void calculateItemDecorationsForChild(View view, Rect rect) {
        DivItemBuilderResult itemDiv;
        boolean z10;
        int iSpacingByOrientation;
        super.calculateItemDecorationsForChild(view, rect);
        int i_getPosition = _getPosition(view);
        if (i_getPosition == -1 || (itemDiv = getItemDiv(i_getPosition)) == null) {
            return;
        }
        e2 e2VarB = itemDiv.getDiv().b();
        boolean z11 = e2VarB.getHeight() instanceof DivSize.b;
        boolean z12 = e2VarB.getWidth() instanceof DivSize.b;
        int iSpacingByOrientation2 = 0;
        if (getSpanCount() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 && z10) {
            iSpacingByOrientation = spacingByOrientation(1) / 2;
        } else {
            iSpacingByOrientation = 0;
        }
        if (z12 && z10) {
            iSpacingByOrientation2 = spacingByOrientation(0) / 2;
        }
        rect.set(rect.left - iSpacingByOrientation2, rect.top - iSpacingByOrientation, rect.right - iSpacingByOrientation2, rect.bottom - iSpacingByOrientation);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void detachView(View view) {
        super.detachView(view);
        _detachView(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void detachViewAt(int i10) {
        super.detachViewAt(i10);
        _detachViewAt(i10);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int firstCompletelyVisibleItemPosition() {
        int[] iArr = new int[k.d(getItemCount(), getSpanCount())];
        findFirstCompletelyVisibleItemPositions(iArr);
        return n.J(iArr);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int firstVisibleItemPosition() {
        int[] iArr = new int[k.d(getItemCount(), getSpanCount())];
        findFirstVisibleItemPositions(iArr);
        return n.J(iArr);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public DivItemBuilderResult getItemDiv(int i10) {
        RecyclerView.Adapter adapter = getView().getAdapter();
        p.h(adapter, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.gallery.DivGalleryAdapter");
        return (DivItemBuilderResult) b0.i0(((DivGalleryAdapter) adapter).getVisibleItems(), i10);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int getLayoutManagerOrientation() {
        return getOrientation();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getPaddingBottom() {
        return super.getPaddingBottom() - (spacingByOrientation(1) / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getPaddingEnd() {
        return super.getPaddingEnd() - (getItemSpacing() / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getPaddingLeft() {
        return super.getPaddingLeft() - (spacingByOrientation(0) / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getPaddingRight() {
        return super.getPaddingRight() - (spacingByOrientation(0) / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getPaddingStart() {
        return super.getPaddingStart() - (getItemSpacing() / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getPaddingTop() {
        return super.getPaddingTop() - (spacingByOrientation(1) / 2);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public void instantScrollToPositionWithOffset(int i10, int i11, ScrollPosition scrollPosition) {
        instantScroll(i10, scrollPosition, i11);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int lastCompletelyVisibleItemPosition() {
        int[] iArr = new int[k.d(getItemCount(), getSpanCount())];
        findLastCompletelyVisibleItemPositions(iArr);
        return n.b0(iArr);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int lastVisibleItemPosition() {
        int[] iArr = new int[k.d(getItemCount(), getSpanCount())];
        findLastVisibleItemPositions(iArr);
        return n.b0(iArr);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void layoutDecorated(View view, int i10, int i11, int i12, int i13) {
        super.layoutDecorated(view, i10, i11, i12, i13);
        _layoutDecorated(view, i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        _onAttachedToWindow(recyclerView);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        _onDetachedFromWindow(recyclerView, recycler);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        _onLayoutCompleted(state);
        super.onLayoutCompleted(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void removeAndRecycleAllViews(RecyclerView.Recycler recycler) {
        _removeAndRecycleAllViews(recycler);
        super.removeAndRecycleAllViews(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void removeView(View view) {
        super.removeView(view);
        _removeView(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void removeViewAt(int i10) {
        super.removeViewAt(i10);
        _removeViewAt(i10);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public void superLayoutDecoratedWithMargins(View view, int i10, int i11, int i12, int i13) {
        super.layoutDecoratedWithMargins(view, i10, i11, i12, i13);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int width() {
        return getWidth();
    }
}
