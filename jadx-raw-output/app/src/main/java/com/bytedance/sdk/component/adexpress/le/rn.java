package com.bytedance.sdk.component.adexpress.le;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.badge.BadgeDrawable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes7.dex */
public final class rn extends FrameLayout {
    private boolean fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private TextView f11525le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public AnimatorSet f11526lh;
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

    public final void setGuideText(String str) {
        this.f11525le.setVisibility(0);
        this.f11525le.setText(str);
    }

    public final void setGuideTextColor(int i10) {
        this.f11525le.setTextColor(i10);
    }

    public rn(@NonNull Context context) {
        super(context);
        this.fkw = true;
        this.yu = context;
        this.f11526lh = new AnimatorSet();
        this.vt = new jqy(this.yu);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.yu, 50.0f), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.yu, 50.0f));
        layoutParams.gravity = BadgeDrawable.TOP_START;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.yu, 40.0f);
        int iOuw = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.yu, 20.0f);
        layoutParams.leftMargin = iOuw;
        layoutParams.setMarginStart(iOuw);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.vt, layoutParams);
        this.ouw = new ImageView(this.yu);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.yu, 78.0f), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.yu, 78.0f));
        this.ouw.setImageResource(com.bytedance.sdk.component.utils.vpp.yu(this.yu, "tt_splash_hand"));
        addView(this.ouw, layoutParams2);
        TextView textView = new TextView(this.yu);
        this.f11525le = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.yu, 10.0f);
        addView(this.f11525le, layoutParams3);
        this.f11525le.setVisibility(8);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.ouw, "scaleX", 1.0f, 1.0f, 1.0f, 0.9f);
        objectAnimatorOfFloat.setDuration(600L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.le.rn.2
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
                if (rn.this.fkw) {
                    rn.this.vt.ouw();
                }
                rn rnVar = rn.this;
                rnVar.fkw = !rnVar.fkw;
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(rn.this.ouw, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.start();
                rn.this.ouw.setVisibility(0);
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.ouw, "scaleY", 1.0f, 1.0f, 1.0f, 0.9f);
        objectAnimatorOfFloat2.setDuration(600L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.f11526lh.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.le.rn.1
            @Override // java.lang.Runnable
            public final void run() {
                int iOuw2 = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(rn.this.yu, 50.0f);
                int iOuw3 = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(rn.this.yu, 50.0f);
                if (rn.this.vt.getMeasuredHeight() > 0) {
                    iOuw2 = rn.this.vt.getMeasuredHeight();
                }
                if (rn.this.vt.getMeasuredWidth() > 0) {
                    iOuw3 = rn.this.vt.getMeasuredWidth();
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) rn.this.ouw.getLayoutParams();
                layoutParams4.topMargin = ((int) ((iOuw2 / 2.0f) - com.bytedance.sdk.component.adexpress.yu.ra.ouw(rn.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(rn.this.yu, 40.0f));
                layoutParams4.leftMargin = ((int) ((iOuw3 / 2.0f) - com.bytedance.sdk.component.adexpress.yu.ra.ouw(rn.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(rn.this.yu, 20.0f));
                layoutParams4.bottomMargin = (int) (((-iOuw2) / 2.0f) + com.bytedance.sdk.component.adexpress.yu.ra.ouw(rn.this.getContext(), 5.0f));
                layoutParams4.rightMargin = (int) (((-iOuw3) / 2.0f) + com.bytedance.sdk.component.adexpress.yu.ra.ouw(rn.this.getContext(), 5.0f));
                layoutParams4.setMarginStart(layoutParams4.leftMargin);
                layoutParams4.setMarginEnd(layoutParams4.rightMargin);
                rn.this.ouw.setLayoutParams(layoutParams4);
            }
        });
    }
}
