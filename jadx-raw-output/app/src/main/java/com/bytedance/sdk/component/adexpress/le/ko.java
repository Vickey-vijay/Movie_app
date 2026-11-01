package com.bytedance.sdk.component.adexpress.le;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes6.dex */
public final class ko extends FrameLayout {
    private boolean fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public AnimatorSet f11506lh;
    public ImageView ouw;
    public jqy vt;
    private Context yu;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public ko(@NonNull Context context) {
        super(context);
        this.fkw = true;
        this.yu = context;
        this.f11506lh = new AnimatorSet();
        this.vt = new jqy(this.yu);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.yu, 40.0f), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.yu, 40.0f));
        layoutParams.gravity = 8388627;
        addView(this.vt, layoutParams);
        this.ouw = new ImageView(this.yu);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.yu, 62.0f), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.yu, 62.0f));
        layoutParams2.gravity = 16;
        this.ouw.setImageResource(com.bytedance.sdk.component.utils.vpp.yu(this.yu, "tt_splash_hand"));
        addView(this.ouw, layoutParams2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.ouw, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.le.ko.2
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
                if (ko.this.fkw) {
                    ko.this.vt.ouw();
                }
                ko koVar = ko.this;
                koVar.fkw = !koVar.fkw;
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(ko.this.ouw, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimatorOfFloat2.start();
                ko.this.ouw.setVisibility(0);
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.ouw, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setDuration(800L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f11506lh.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.le.ko.1
            @Override // java.lang.Runnable
            public final void run() {
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ko.this.ouw.getLayoutParams();
                layoutParams3.topMargin = (int) ((ko.this.vt.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.yu.ra.ouw(ko.this.getContext(), 5.0f));
                layoutParams3.leftMargin = (int) ((ko.this.vt.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.yu.ra.ouw(ko.this.getContext(), 5.0f));
                layoutParams3.bottomMargin = (int) (((-ko.this.vt.getMeasuredHeight()) / 2.0f) + com.bytedance.sdk.component.adexpress.yu.ra.ouw(ko.this.getContext(), 5.0f));
                layoutParams3.rightMargin = (int) (((-ko.this.vt.getMeasuredWidth()) / 2.0f) + com.bytedance.sdk.component.adexpress.yu.ra.ouw(ko.this.getContext(), 5.0f));
                layoutParams3.setMarginStart(layoutParams3.leftMargin);
                layoutParams3.setMarginEnd(layoutParams3.rightMargin);
                ko.this.ouw.setLayoutParams(layoutParams3);
            }
        });
    }
}
