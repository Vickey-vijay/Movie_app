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

/* JADX INFO: loaded from: classes11.dex */
public final class lh extends le {
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

    public static /* synthetic */ void ouw(lh lhVar) {
        final View childAt;
        final View childAt2 = lhVar.getChildAt(lhVar.qbp);
        if (childAt2 != null) {
            int i10 = lhVar.qbp;
            if (i10 == 0) {
                lhVar.zin = false;
            }
            if (i10 + 1 >= lhVar.getChildCount() || ((ViewGroup) lhVar.getChildAt(lhVar.qbp + 1)).getChildCount() <= 0) {
                lhVar.zin = true;
                childAt = lhVar.getChildAt(lhVar.qbp - 1);
                lhVar.ouw = ObjectAnimator.ofFloat(childAt2, "translationX", 0.0f, (lhVar.f11367ra + lhVar.getChildAt(lhVar.qbp).getWidth()) / 2);
            } else {
                childAt = lhVar.getChildAt(lhVar.qbp + 1);
                lhVar.ouw = ObjectAnimator.ofFloat(childAt2, "translationX", 0.0f, (-(lhVar.f11367ra + lhVar.getChildAt(lhVar.qbp).getWidth())) / 2);
            }
            if (childAt != null) {
                lhVar.ouw.setInterpolator(new LinearInterpolator());
                lhVar.ouw.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lh.2
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
                if (lhVar.zin) {
                    lhVar.vt = ObjectAnimator.ofFloat(childAt, "translationX", (-(lhVar.f11367ra + childAt.getWidth())) / 2, 0.0f);
                } else {
                    lhVar.vt = ObjectAnimator.ofFloat(childAt, "translationX", (lhVar.f11367ra + childAt.getWidth()) / 2, 0.0f);
                }
                lhVar.vt.setInterpolator(new LinearInterpolator());
                lhVar.vt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lh.3
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
                lhVar.ouw.setDuration(500L);
                lhVar.vt.setDuration(500L);
                lhVar.ouw.start();
                lhVar.vt.start();
                if (lhVar.zin) {
                    lhVar.qbp--;
                } else {
                    lhVar.qbp++;
                }
                lhVar.postDelayed(lhVar.vpp, 2000L);
            }
        }
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

    public lh(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        this.qbp = 0;
        this.zin = false;
        this.vpp = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lh.1
            @Override // java.lang.Runnable
            public final void run() {
                lh.ouw(lh.this);
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
