package com.yandex.div.core.view2.divs.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ck.i;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.yandex.div.R$style;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Releasable;
import com.yandex.div.core.view2.backbutton.BackHandlingRecyclerView;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.gallery.DivGridLayoutManager;
import com.yandex.div.core.view2.divs.gallery.PagerSnapStartHelper;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.internal.widget.OnInterceptTouchEventListener;
import com.yandex.div2.Div;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivGallery;
import java.util.List;

/* JADX INFO: compiled from: DivRecyclerView.kt */
/* JADX INFO: loaded from: classes4.dex */
public class DivRecyclerView extends BackHandlingRecyclerView implements DivHolderView<Div.d> {
    public static final Companion Companion = new Companion(null);
    private final /* synthetic */ DivHolderViewMixin<Div.d> $$delegate_0;
    private int beforeScrollFocusPosition;
    private boolean needFling;
    private OnInterceptTouchEventListener onInterceptTouchEventListener;
    private PagerSnapStartHelper pagerSnapStartHelper;
    private int pointTouchX;
    private int pointTouchY;
    private float scrollInterceptionAngle;
    private DivGallery.ScrollMode scrollMode;
    private int scrollPointerId;

    /* JADX INFO: compiled from: DivRecyclerView.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public DivRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DivRecyclerView(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private boolean canScroll() {
        return canScrollHorizontally(-1) || canScrollHorizontally(1) || canScrollVertically(-1) || canScrollVertically(1);
    }

    private int toTouchPoint(float f10) {
        return (int) Math.ceil(f10);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void addSubscription(Disposable disposable) {
        this.$$delegate_0.addSubscription(disposable);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void closeAllSubscription() {
        this.$$delegate_0.closeAllSubscription();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public BindingContext getBindingContext() {
        return this.$$delegate_0.getBindingContext();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public Div.d getDiv() {
        return (Div.d) this.$$delegate_0.getDiv();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public DivBorderDrawer getDivBorderDrawer() {
        return this.$$delegate_0.getDivBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        return this.$$delegate_0.getNeedClipping();
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public List<Disposable> getSubscriptions() {
        return this.$$delegate_0.getSubscriptions();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void invalidateBorder() {
        this.$$delegate_0.invalidateBorder();
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.$$delegate_0.isTransient();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void onBoundsChanged(int i10, int i11) {
        this.$$delegate_0.onBoundsChanged(i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i10) {
        if (i10 == 2) {
            View focusedChild = getFocusedChild();
            if (focusedChild == null) {
                this.beforeScrollFocusPosition = -1;
                return;
            }
            this.beforeScrollFocusPosition = getChildAdapterPosition(focusedChild);
        }
        super.onScrollStateChanged(i10);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setBindingContext(BindingContext bindingContext) {
        this.$$delegate_0.setBindingContext(bindingContext);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(BindingContext bindingContext, DivBorder divBorder, View view) {
        this.$$delegate_0.setBorder(bindingContext, divBorder, view);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setDiv(Div.d dVar) {
        this.$$delegate_0.setDiv(dVar);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z10) {
        this.$$delegate_0.setNeedClipping(z10);
    }

    public void setScrollInterceptionAngle(float f10) {
        this.scrollInterceptionAngle = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) == 0 ? 0.0f : Math.abs(f10) % 90;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(View view) {
        this.$$delegate_0.transitionStarted(view);
    }

    public DivRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(new ContextThemeWrapper(context, R$style.Div_Gallery), attributeSet, i10);
        this.$$delegate_0 = new DivHolderViewMixin<>();
        this.scrollPointerId = -1;
        this.scrollMode = DivGallery.ScrollMode.DEFAULT;
        this.beforeScrollFocusPosition = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != null && view.getVisibility() == 0) {
            BaseDivViewExtensionsKt.drawShadow(view, canvas);
        }
        return super.drawChild(canvas, view, j10);
    }

    public OnInterceptTouchEventListener getOnInterceptTouchEventListener() {
        return this.onInterceptTouchEventListener;
    }

    public PagerSnapStartHelper getPagerSnapStartHelper() {
        return this.pagerSnapStartHelper;
    }

    public float getScrollInterceptionAngle() {
        return this.scrollInterceptionAngle;
    }

    public DivGallery.ScrollMode getScrollMode() {
        return this.scrollMode;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0040  */
    /* JADX WARN: Code duplicated, block: B:27:0x0043  */
    /* JADX WARN: Code duplicated, block: B:30:0x0048  */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrolled(int i10, int i11) {
        int orientation;
        int i12;
        int i13;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        View view;
        DivViewWrapper divViewWrapper;
        View child;
        if (this.beforeScrollFocusPosition == -1) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            orientation = ((LinearLayoutManager) layoutManager).getOrientation();
        } else {
            orientation = layoutManager instanceof DivGridLayoutManager ? ((DivGridLayoutManager) layoutManager).getOrientation() : 0;
        }
        if (orientation == 1 && i11 > 0) {
            i12 = this.beforeScrollFocusPosition;
        } else {
            if ((orientation == 1 && i11 <= 0) || i10 <= 0) {
                int i14 = this.beforeScrollFocusPosition;
                i13 = i14 - 1;
                viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(i13);
                if (viewHolderFindViewHolderForAdapterPosition != null) {
                    view = viewHolderFindViewHolderForAdapterPosition.itemView;
                } else {
                    view = null;
                }
                divViewWrapper = view instanceof DivViewWrapper ? (DivViewWrapper) view : null;
                if (divViewWrapper != null && (child = divViewWrapper.getChild()) != null) {
                    child.requestFocus();
                }
                super.onScrolled(i10, i11);
            }
            i12 = this.beforeScrollFocusPosition;
        }
        i13 = i12 + 1;
        viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(i13);
        if (viewHolderFindViewHolderForAdapterPosition != null) {
            view = viewHolderFindViewHolderForAdapterPosition.itemView;
        } else {
            view = null;
        }
        if (view instanceof DivViewWrapper) {
        }
        if (divViewWrapper != null) {
            child.requestFocus();
        }
        super.onScrolled(i10, i11);
    }

    public void setOnInterceptTouchEventListener(OnInterceptTouchEventListener onInterceptTouchEventListener) {
        this.onInterceptTouchEventListener = onInterceptTouchEventListener;
    }

    public void setPagerSnapStartHelper(PagerSnapStartHelper pagerSnapStartHelper) {
        this.pagerSnapStartHelper = pagerSnapStartHelper;
    }

    public void setScrollMode(DivGallery.ScrollMode scrollMode) {
        this.scrollMode = scrollMode;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void draw(Canvas canvas) {
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        try {
            divBorderDrawer.clipCorners(canvas);
            super.draw(canvas);
            divBorderDrawer.drawBorder(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i10, int i11) {
        boolean zFling = super.fling(i10, i11);
        if (getScrollMode() == DivGallery.ScrollMode.PAGING) {
            this.needFling = !zFling;
        }
        return zFling;
    }

    public View getItemView(int i10) {
        ViewGroup viewGroup;
        View childAt = getChildAt(i10);
        if (childAt instanceof ViewGroup) {
            viewGroup = (ViewGroup) childAt;
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return null;
        }
        return viewGroup.getChildAt(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean zOnInterceptTouchEvent;
        boolean z10;
        int iFindPointerIndex;
        double dAtan;
        OnInterceptTouchEventListener onInterceptTouchEventListener = getOnInterceptTouchEventListener();
        if (onInterceptTouchEventListener != null) {
            zOnInterceptTouchEvent = onInterceptTouchEventListener.onInterceptTouchEvent(this, motionEvent);
        } else {
            zOnInterceptTouchEvent = false;
        }
        if (zOnInterceptTouchEvent) {
            return true;
        }
        if (getScrollInterceptionAngle() == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 2) {
                if (actionMasked != 5) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                this.scrollPointerId = motionEvent.getPointerId(actionIndex);
                this.pointTouchX = toTouchPoint(motionEvent.getX(actionIndex));
                this.pointTouchY = toTouchPoint(motionEvent.getY(actionIndex));
                return super.onInterceptTouchEvent(motionEvent);
            }
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            if (layoutManager == null || (iFindPointerIndex = motionEvent.findPointerIndex(this.scrollPointerId)) < 0) {
                return false;
            }
            int touchPoint = toTouchPoint(motionEvent.getX(iFindPointerIndex));
            int touchPoint2 = toTouchPoint(motionEvent.getY(iFindPointerIndex));
            if (getScrollState() == 1) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            int iAbs = Math.abs(touchPoint - this.pointTouchX);
            int iAbs2 = Math.abs(touchPoint2 - this.pointTouchY);
            if (iAbs == 0 && iAbs2 == 0) {
                return false;
            }
            if (iAbs != 0) {
                dAtan = (Math.atan(((double) iAbs2) / ((double) iAbs)) * ((double) BaseTransientBottomBar.ANIMATION_FADE_DURATION)) / 3.141592653589793d;
            } else {
                dAtan = 90.0d;
            }
            if ((!layoutManager.canScrollHorizontally() || dAtan > getScrollInterceptionAngle()) && (!layoutManager.canScrollVertically() || dAtan <= getScrollInterceptionAngle())) {
                return false;
            }
            return true;
        }
        this.scrollPointerId = motionEvent.getPointerId(0);
        this.pointTouchX = toTouchPoint(motionEvent.getX());
        this.pointTouchY = toTouchPoint(motionEvent.getY());
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        onBoundsChanged(i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        RecyclerView.LayoutManager layoutManager;
        PagerSnapStartHelper pagerSnapStartHelper;
        View viewFindSnapView;
        int i10;
        DivGallery.ScrollMode scrollMode = getScrollMode();
        DivGallery.ScrollMode scrollMode2 = DivGallery.ScrollMode.PAGING;
        if (scrollMode == scrollMode2) {
            this.needFling = true;
        }
        if (super.onTouchEvent(motionEvent) && canScroll()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (motionEvent == null || motionEvent.getActionMasked() != 1 || getScrollMode() != scrollMode2 || !this.needFling || (layoutManager = getLayoutManager()) == null || (pagerSnapStartHelper = getPagerSnapStartHelper()) == null || (viewFindSnapView = pagerSnapStartHelper.findSnapView(layoutManager)) == null) {
            return z10;
        }
        int[] iArrCalculateDistanceToFinalSnap = pagerSnapStartHelper.calculateDistanceToFinalSnap(layoutManager, viewFindSnapView);
        if (iArrCalculateDistanceToFinalSnap.length >= 2 && ((i10 = iArrCalculateDistanceToFinalSnap[0]) != 0 || iArrCalculateDistanceToFinalSnap[1] != 0)) {
            smoothScrollBy(i10, iArrCalculateDistanceToFinalSnap[1]);
        }
        return z10;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView, com.yandex.div.internal.core.ExpressionSubscriber, com.yandex.div.core.view2.Releasable
    public void release() {
        super.release();
        Object adapter = getAdapter();
        if (adapter instanceof Releasable) {
            ((Releasable) adapter).release();
        }
    }
}
