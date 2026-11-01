package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes10.dex */
public final class pd extends le {
    public ObjectAnimator ouw;
    private int qbp;
    private Runnable vpp;
    public ObjectAnimator vt;
    private boolean zin;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public static /* synthetic */ void ouw(pd pdVar) {
        final View childAt;
        final View childAt2 = pdVar.getChildAt(pdVar.qbp);
        int i10 = pdVar.qbp;
        if (i10 == 0) {
            pdVar.zin = false;
        }
        boolean z10 = i10 + 1 >= pdVar.getChildCount() || ((ViewGroup) pdVar.getChildAt(pdVar.qbp + 1)).getChildCount() <= 0;
        if (pdVar.mwh.bly.f11431lh.coz || !z10) {
            View childAt3 = z10 ? pdVar.getChildAt((pdVar.qbp + 2) % pdVar.getChildCount()) : pdVar.getChildAt((pdVar.qbp + 1) % pdVar.getChildCount());
            pdVar.ouw = ObjectAnimator.ofFloat(childAt2, "translationY", 0.0f, (-(pdVar.pno + pdVar.getChildAt(pdVar.qbp).getHeight())) / 2);
            if (z10) {
                pdVar.qbp++;
            }
            childAt = childAt3;
        } else {
            pdVar.zin = true;
            childAt = pdVar.getChildAt(pdVar.qbp - 1);
            pdVar.ouw = ObjectAnimator.ofFloat(childAt2, "translationY", 0.0f, (pdVar.pno + pdVar.getChildAt(pdVar.qbp).getHeight()) / 2);
        }
        pdVar.ouw.setInterpolator(new LinearInterpolator());
        pdVar.ouw.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pd.2
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                childAt2.setVisibility(8);
            }
        });
        if (pdVar.zin) {
            pdVar.vt = ObjectAnimator.ofFloat(childAt, "translationY", (-(pdVar.pno + childAt.getHeight())) / 2, 0.0f);
        } else {
            pdVar.vt = ObjectAnimator.ofFloat(childAt, "translationY", (pdVar.pno + childAt.getHeight()) / 2, 0.0f);
        }
        pdVar.vt.setInterpolator(new LinearInterpolator());
        pdVar.vt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pd.3
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                childAt.setVisibility(0);
            }
        });
        pdVar.ouw.setDuration(500L);
        pdVar.vt.setDuration(500L);
        pdVar.ouw.start();
        pdVar.vt.start();
        if (pdVar.zin) {
            pdVar.qbp--;
        } else {
            int i11 = pdVar.qbp + 1;
            pdVar.qbp = i11;
            pdVar.qbp = i11 % pdVar.getChildCount();
        }
        pdVar.postDelayed(pdVar.vpp, 3000L);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fak
    public final void a_() {
        removeCallbacks(this.vpp);
        ObjectAnimator objectAnimator = this.ouw;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.ouw.cancel();
        }
        ObjectAnimator objectAnimator2 = this.vt;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.vt.cancel();
        }
        super.a_();
    }

    public pd(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        this.qbp = 0;
        this.zin = false;
        this.vpp = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pd.1
            @Override // java.lang.Runnable
            public final void run() {
                pd.ouw(pd.this);
            }
        };
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.topMargin = (this.pno - layoutParams.height) / 2;
            childAt.setLayoutParams(layoutParams);
            if (i10 != 0) {
                childAt.setVisibility(8);
            }
        }
        postDelayed(this.vpp, 2500L);
    }
}
