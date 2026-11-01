package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import androidx.viewpager2.widget.ViewPager2;
import bk.a;
import ck.i;
import ck.p;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.pager.PagerSelectedActionsDispatcher;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.core.widget.ViewPager2Wrapper;
import com.yandex.div.internal.widget.OnInterceptTouchEventListener;
import com.yandex.div2.Div;
import com.yandex.div2.DivBorder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.b;
import mj.g;

/* JADX INFO: compiled from: DivPagerView.kt */
/* JADX INFO: loaded from: classes4.dex */
public class DivPagerView extends ViewPager2Wrapper implements DivHolderView<Div.j> {
    private final /* synthetic */ DivHolderViewMixin<Div.j> $$delegate_0;
    private final g accessibilityDelegate$delegate;
    private ViewPager2.OnPageChangeCallback changePageCallbackForLogger;
    private OffScreenPagesUpdateCallback changePageCallbackForOffScreenPages;
    private ViewPager2.OnPageChangeCallback changePageCallbackForState;
    private final List<ViewPager2.OnPageChangeCallback> changePageCallbacksForIndicators;
    private OnInterceptTouchEventListener onInterceptTouchEventListener;
    private OnItemsUpdatedCallback pagerOnItemsCountChange;
    private PagerSelectedActionsDispatcher pagerSelectedActionsDispatcher;

    /* JADX INFO: compiled from: DivPagerView.kt */
    public static abstract class OffScreenPagesUpdateCallback extends ViewPager2.OnPageChangeCallback implements View.OnLayoutChangeListener {
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        }
    }

    /* JADX INFO: compiled from: DivPagerView.kt */
    public interface OnItemsUpdatedCallback {
        void onItemsUpdated();
    }

    public DivPagerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DivPagerView(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
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
    public Div.j getDiv() {
        return (Div.j) this.$$delegate_0.getDiv();
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

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView, com.yandex.div.internal.core.ExpressionSubscriber, com.yandex.div.core.view2.Releasable
    public void release() {
        this.$$delegate_0.release();
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
    public void setDiv(Div.j jVar) {
        this.$$delegate_0.setDiv(jVar);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z10) {
        this.$$delegate_0.setNeedClipping(z10);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(View view) {
        this.$$delegate_0.transitionStarted(view);
    }

    public DivPagerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.$$delegate_0 = new DivHolderViewMixin<>();
        this.changePageCallbacksForIndicators = new ArrayList();
        this.accessibilityDelegate$delegate = b.b(LazyThreadSafetyMode.NONE, new a<DivPagerView$accessibilityDelegate$2.AnonymousClass1>() { // from class: com.yandex.div.core.view2.divs.widgets.DivPagerView$accessibilityDelegate$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r1v0, types: [com.yandex.div.core.view2.divs.widgets.DivPagerView$accessibilityDelegate$2$1] */
            @Override // bk.a
            public final AnonymousClass1 invoke() {
                RecyclerView recyclerView = this.this$0.getRecyclerView();
                if (recyclerView == null) {
                    return null;
                }
                return new RecyclerViewAccessibilityDelegate(this.this$0) { // from class: com.yandex.div.core.view2.divs.widgets.DivPagerView$accessibilityDelegate$2.1
                    public final /* synthetic */ DivPagerView this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(this.$recycler);
                        this.this$0 = divPagerView;
                    }

                    private final void performActionIfNeeded(View view, AccessibilityEvent accessibilityEvent) {
                        View wrapperFor;
                        int childAdapterPosition;
                        int i11;
                        if (accessibilityEvent.getEventType() == 32768 && (wrapperFor = this.this$0.getWrapperFor(view)) != null && this.this$0.getCurrentItem$div_release() != (childAdapterPosition = this.$recycler.getChildAdapterPosition(wrapperFor)) && childAdapterPosition != -1) {
                            if (childAdapterPosition > this.this$0.getCurrentItem$div_release()) {
                                i11 = 4096;
                            } else {
                                i11 = 8192;
                            }
                            this.$recycler.performAccessibilityAction(i11, null);
                        }
                    }

                    @Override // androidx.core.view.AccessibilityDelegateCompat
                    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                        performActionIfNeeded(view, accessibilityEvent);
                        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
                    }
                };
            }
        });
    }

    private DivPagerView$accessibilityDelegate$2.AnonymousClass1 getAccessibilityDelegate() {
        return (DivPagerView$accessibilityDelegate$2.AnonymousClass1) this.accessibilityDelegate$delegate.getValue();
    }

    public void addChangePageCallbackForIndicators(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.changePageCallbacksForIndicators.add(onPageChangeCallback);
        getViewPager().registerOnPageChangeCallback(onPageChangeCallback);
    }

    public void clearChangePageCallbackForIndicators() {
        Iterator<T> it = this.changePageCallbacksForIndicators.iterator();
        while (it.hasNext()) {
            getViewPager().unregisterOnPageChangeCallback((ViewPager2.OnPageChangeCallback) it.next());
        }
        this.changePageCallbacksForIndicators.clear();
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

    public ViewPager2.OnPageChangeCallback getChangePageCallbackForLogger$div_release() {
        return this.changePageCallbackForLogger;
    }

    public OffScreenPagesUpdateCallback getChangePageCallbackForOffScreenPages$div_release() {
        return this.changePageCallbackForOffScreenPages;
    }

    public ViewPager2.OnPageChangeCallback getChangePageCallbackForState$div_release() {
        return this.changePageCallbackForState;
    }

    public OnInterceptTouchEventListener getOnInterceptTouchEventListener() {
        return this.onInterceptTouchEventListener;
    }

    public OnItemsUpdatedCallback getPagerOnItemsCountChange$div_release() {
        return this.pagerOnItemsCountChange;
    }

    public PagerSelectedActionsDispatcher getPagerSelectedActionsDispatcher$div_release() {
        return this.pagerSelectedActionsDispatcher;
    }

    public void removeChangePageCallbackForIndicators(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.changePageCallbacksForIndicators.remove(onPageChangeCallback);
        getViewPager().unregisterOnPageChangeCallback(onPageChangeCallback);
    }

    public void setChangePageCallbackForLogger$div_release(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback2 = this.changePageCallbackForLogger;
        if (onPageChangeCallback2 != null) {
            getViewPager().unregisterOnPageChangeCallback(onPageChangeCallback2);
        }
        if (onPageChangeCallback != null) {
            getViewPager().registerOnPageChangeCallback(onPageChangeCallback);
        }
        this.changePageCallbackForLogger = onPageChangeCallback;
    }

    public void setChangePageCallbackForOffScreenPages$div_release(OffScreenPagesUpdateCallback offScreenPagesUpdateCallback) {
        OffScreenPagesUpdateCallback offScreenPagesUpdateCallback2 = this.changePageCallbackForOffScreenPages;
        if (offScreenPagesUpdateCallback2 != null) {
            getViewPager().unregisterOnPageChangeCallback(offScreenPagesUpdateCallback2);
            RecyclerView recyclerView = getRecyclerView();
            if (recyclerView != null) {
                recyclerView.removeOnLayoutChangeListener(offScreenPagesUpdateCallback2);
            }
        }
        if (offScreenPagesUpdateCallback != null) {
            getViewPager().registerOnPageChangeCallback(offScreenPagesUpdateCallback);
            RecyclerView recyclerView2 = getRecyclerView();
            if (recyclerView2 != null) {
                recyclerView2.addOnLayoutChangeListener(offScreenPagesUpdateCallback);
            }
        }
        this.changePageCallbackForOffScreenPages = offScreenPagesUpdateCallback;
    }

    public void setChangePageCallbackForState$div_release(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback2 = this.changePageCallbackForState;
        if (onPageChangeCallback2 != null) {
            getViewPager().unregisterOnPageChangeCallback(onPageChangeCallback2);
        }
        if (onPageChangeCallback != null) {
            getViewPager().registerOnPageChangeCallback(onPageChangeCallback);
        }
        this.changePageCallbackForState = onPageChangeCallback;
    }

    public void setOnInterceptTouchEventListener(OnInterceptTouchEventListener onInterceptTouchEventListener) {
        this.onInterceptTouchEventListener = onInterceptTouchEventListener;
    }

    public void setPagerOnItemsCountChange$div_release(OnItemsUpdatedCallback onItemsUpdatedCallback) {
        this.pagerOnItemsCountChange = onItemsUpdatedCallback;
    }

    public void setPagerSelectedActionsDispatcher$div_release(PagerSelectedActionsDispatcher pagerSelectedActionsDispatcher) {
        PagerSelectedActionsDispatcher pagerSelectedActionsDispatcher2 = this.pagerSelectedActionsDispatcher;
        if (pagerSelectedActionsDispatcher2 != null) {
            pagerSelectedActionsDispatcher2.detach(getViewPager());
        }
        if (pagerSelectedActionsDispatcher != null) {
            pagerSelectedActionsDispatcher.attach(getViewPager());
        }
        this.pagerSelectedActionsDispatcher = pagerSelectedActionsDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getWrapperFor(View view) {
        while (!p.e(view, getRecyclerView())) {
            if (view instanceof DivViewWrapper) {
                return view;
            }
            Object parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
            if (view == null) {
                break;
            }
        }
        return null;
    }

    @Override // android.view.View
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

    public void enableAccessibility() {
        RecyclerView recyclerView;
        DivPagerView$accessibilityDelegate$2.AnonymousClass1 accessibilityDelegate = getAccessibilityDelegate();
        if (accessibilityDelegate != null && (recyclerView = getRecyclerView()) != null) {
            recyclerView.setAccessibilityDelegateCompat(accessibilityDelegate);
        }
    }

    public boolean getClipToPage$div_release() {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView != null) {
            return recyclerView.getClipChildren();
        }
        return false;
    }

    public int getCurrentItem$div_release() {
        return getViewPager().getCurrentItem();
    }

    public View getPageView(int i10) {
        ViewGroup viewGroup;
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null) {
            return null;
        }
        View childAt = recyclerView.getChildAt(i10);
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

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean zOnInterceptTouchEvent;
        OnInterceptTouchEventListener onInterceptTouchEventListener = getOnInterceptTouchEventListener();
        if (onInterceptTouchEventListener != null) {
            zOnInterceptTouchEvent = onInterceptTouchEventListener.onInterceptTouchEvent(this, motionEvent);
        } else {
            zOnInterceptTouchEvent = false;
        }
        if (!zOnInterceptTouchEvent && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        onBoundsChanged(i10, i11);
    }

    public void setClipToPage$div_release(boolean z10) {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView != null) {
            recyclerView.setClipChildren(z10);
        }
    }

    public void setCurrentItem$div_release(int i10) {
        getViewPager().setCurrentItem(i10, false);
    }
}
