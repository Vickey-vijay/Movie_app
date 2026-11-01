package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes8.dex */
public final class yu extends le {
    public ObjectAnimator ouw;
    private int qbp;
    public ObjectAnimator vt;
    private Runnable zin;

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

    public static /* synthetic */ void ouw(yu yuVar) {
        final View childAt = yuVar.getChildAt(yuVar.qbp);
        final View childAt2 = yuVar.getChildAt((yuVar.qbp + 1) % yuVar.getChildCount());
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt, "translationY", 0.0f, (-(yuVar.pno + yuVar.getChildAt(yuVar.qbp).getHeight())) / 2);
        yuVar.ouw = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        yuVar.ouw.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.yu.2
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
                childAt.setVisibility(8);
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(childAt2, "translationY", (yuVar.pno + childAt2.getHeight()) / 2, 0.0f);
        yuVar.vt = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        yuVar.vt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.yu.3
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
                childAt2.setVisibility(0);
            }
        });
        yuVar.ouw.setDuration(500L);
        yuVar.vt.setDuration(500L);
        yuVar.ouw.start();
        yuVar.vt.start();
        int i10 = yuVar.qbp + 1;
        yuVar.qbp = i10;
        yuVar.qbp = i10 % yuVar.getChildCount();
        yuVar.postDelayed(yuVar.zin, 2000L);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fak
    public final void a_() {
        removeCallbacks(this.zin);
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

    public yu(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        this.qbp = 0;
        this.zin = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.yu.1
            @Override // java.lang.Runnable
            public final void run() {
                yu.ouw(yu.this);
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
        postDelayed(this.zin, 2500L);
    }
}
