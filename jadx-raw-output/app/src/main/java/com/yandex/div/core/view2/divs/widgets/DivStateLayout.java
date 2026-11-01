package com.yandex.div.core.view2.divs.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.math.MathUtils;
import androidx.core.view.GestureDetectorCompat;
import bk.a;
import bk.l;
import ck.i;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.widget.FrameContainerLayout;
import com.yandex.div2.Div;
import com.yandex.div2.DivBorder;
import java.util.List;
import mj.r;

/* JADX INFO: compiled from: DivStateLayout.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivStateLayout extends FrameContainerLayout implements DivHolderView<Div.n> {
    private final /* synthetic */ DivHolderViewMixin<Div.n> $$delegate_0;
    private Div activeStateDiv;
    private final GestureDetectorCompat gestureDetector;
    private DivStatePath path;
    private final SwipeListener swipeListener;
    private a<r> swipeOutCallback;
    private l<? super String, r> variableUpdater;

    /* JADX INFO: compiled from: DivStateLayout.kt */
    public final class SwipeListener extends GestureDetector.SimpleOnGestureListener {
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public SwipeListener() {
        }

        private final boolean canScroll(View view, float f10, float f11, int i10) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                    View childAt = viewGroup.getChildAt(childCount);
                    if (f10 >= childAt.getLeft() && f10 < childAt.getRight() && f11 >= childAt.getTop() && f11 < childAt.getBottom() && canScroll(childAt, f10 - childAt.getLeft(), f11 - childAt.getTop(), i10)) {
                        return true;
                    }
                }
            }
            return view.canScrollHorizontally(i10);
        }

        private final View getView() {
            if (DivStateLayout.this.getChildCount() > 0) {
                return DivStateLayout.this.getChildAt(0);
            }
            return null;
        }

        public final void finishSwipe() {
            float fAbs;
            AnimatorListenerAdapter animatorListenerAdapter;
            float fSignum;
            View view = getView();
            if (view == null) {
                return;
            }
            if (Math.abs(view.getTranslationX()) > view.getWidth() / 2) {
                fAbs = (Math.abs(view.getWidth() - view.getTranslationX()) * 300.0f) / view.getWidth();
                fSignum = Math.signum(view.getTranslationX()) * view.getWidth();
                final DivStateLayout divStateLayout = DivStateLayout.this;
                animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: com.yandex.div.core.view2.divs.widgets.DivStateLayout$SwipeListener$finishSwipe$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        a<r> swipeOutCallback = divStateLayout.getSwipeOutCallback();
                        if (swipeOutCallback != null) {
                            swipeOutCallback.invoke();
                        }
                    }
                };
            } else {
                fAbs = (Math.abs(view.getTranslationX()) * 300.0f) / view.getWidth();
                animatorListenerAdapter = null;
                fSignum = 0.0f;
            }
            view.animate().cancel();
            view.animate().setDuration((long) MathUtils.clamp(fAbs, 0.0f, 300.0f)).translationX(fSignum).setListener(animatorListenerAdapter).start();
        }

        public final boolean getInScroll() {
            float translationX;
            boolean z10;
            View view = getView();
            if (view != null) {
                translationX = view.getTranslationX();
            } else {
                translationX = 0.0f;
            }
            if (translationX == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            return !z10;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            boolean z10;
            View view = getView();
            boolean z11 = false;
            if (view == null || motionEvent == null) {
                return false;
            }
            int iSignum = (int) Math.signum(f10);
            if (view.getTranslationX() == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && Math.abs(f10) > 2 * Math.abs(f11) && canScroll(view, motionEvent.getX(), motionEvent.getY(), iSignum)) {
                return false;
            }
            view.setTranslationX(MathUtils.clamp(view.getTranslationX() - f10, -view.getWidth(), view.getWidth()));
            if (view.getTranslationX() == 0.0f) {
                z11 = true;
            }
            return !z11;
        }
    }

    public DivStateLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DivStateLayout(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
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
    public Div.n getDiv() {
        return (Div.n) this.$$delegate_0.getDiv();
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
    public void setDiv(Div.n nVar) {
        this.$$delegate_0.setDiv(nVar);
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

    public DivStateLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.$$delegate_0 = new DivHolderViewMixin<>();
        SwipeListener swipeListener = new SwipeListener();
        this.swipeListener = swipeListener;
        this.gestureDetector = new GestureDetectorCompat(context, swipeListener, new Handler(Looper.getMainLooper()));
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

    public final Div getActiveStateDiv$div_release() {
        return this.activeStateDiv;
    }

    public final DivStatePath getPath() {
        return this.path;
    }

    public final String getStateId() {
        DivStatePath divStatePath = this.path;
        if (divStatePath != null) {
            return divStatePath.getLastStateId();
        }
        return null;
    }

    public final a<r> getSwipeOutCallback() {
        return this.swipeOutCallback;
    }

    public final l<String, r> getVariableUpdater() {
        return this.variableUpdater;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.swipeOutCallback == null) {
            requestDisallowInterceptTouchEvent(false);
            return false;
        }
        this.gestureDetector.onTouchEvent(motionEvent);
        requestDisallowInterceptTouchEvent(this.swipeListener.getInScroll());
        if (this.swipeListener.getInScroll()) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.swipeOutCallback == null) {
            requestDisallowInterceptTouchEvent(false);
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.swipeListener.finishSwipe();
        }
        if (this.gestureDetector.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setActiveStateDiv$div_release(Div div) {
        this.activeStateDiv = div;
    }

    public final void setPath(DivStatePath divStatePath) {
        this.path = divStatePath;
    }

    public final void setSwipeOutCallback(a<r> aVar) {
        this.swipeOutCallback = aVar;
    }

    public final void setVariableUpdater(l<? super String, r> lVar) {
        this.variableUpdater = lVar;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        if (super.canScrollHorizontally(i10)) {
            return true;
        }
        if (getChildCount() >= 1 && this.swipeOutCallback != null) {
            View childAt = getChildAt(0);
            if (i10 < 0) {
                if (childAt.getTranslationX() <= childAt.getWidth()) {
                    return true;
                }
            } else if ((-childAt.getTranslationX()) <= childAt.getWidth()) {
                return true;
            }
            return false;
        }
        return super.canScrollHorizontally(i10);
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

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        onBoundsChanged(i10, i11);
    }
}
