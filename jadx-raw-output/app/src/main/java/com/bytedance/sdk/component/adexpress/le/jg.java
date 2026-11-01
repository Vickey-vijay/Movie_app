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

/* JADX INFO: loaded from: classes6.dex */
public final class jg extends FrameLayout {
    private boolean fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private TextView f11503le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private Context f11504lh;
    public yu ouw;
    public AnimatorSet vt;
    private ImageView yu;

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
        this.f11503le.setText(str);
    }

    public final void setGuideTextColor(int i10) {
        this.f11503le.setTextColor(i10);
    }

    public jg(@NonNull Context context) {
        super(context);
        this.fkw = true;
        this.f11504lh = context;
        this.vt = new AnimatorSet();
        this.ouw = new yu(this.f11504lh);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f11504lh, 80.0f), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f11504lh, 80.0f));
        layoutParams.gravity = BadgeDrawable.TOP_START;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f11504lh, 20.0f);
        int iOuw = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f11504lh, 20.0f);
        layoutParams.leftMargin = iOuw;
        layoutParams.setMarginStart(iOuw);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.ouw, layoutParams);
        this.ouw.ouw();
        this.yu = new ImageView(this.f11504lh);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f11504lh, 80.0f), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f11504lh, 80.0f));
        this.yu.setImageResource(com.bytedance.sdk.component.utils.vpp.yu(this.f11504lh, "tt_splash_hand"));
        addView(this.yu, layoutParams2);
        TextView textView = new TextView(this.f11504lh);
        this.f11503le = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f11504lh, 10.0f);
        addView(this.f11503le, layoutParams3);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.yu, "scaleX", 1.0f, 0.8f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.le.jg.2
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
                if (jg.this.fkw) {
                    jg.this.ouw.ouw();
                    jg.this.ouw.setAlpha(1.0f);
                } else {
                    jg.this.ouw.vt();
                    jg.this.ouw.setAlpha(0.0f);
                }
                jg jgVar = jg.this;
                jgVar.fkw = !jgVar.fkw;
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(jg.this.yu, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.start();
                jg.this.yu.setVisibility(0);
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.yu, "scaleY", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.vt.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.le.jg.1
            @Override // java.lang.Runnable
            public final void run() {
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) jg.this.yu.getLayoutParams();
                layoutParams4.topMargin = ((int) ((jg.this.ouw.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.yu.ra.ouw(jg.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(jg.this.f11504lh, 20.0f));
                layoutParams4.leftMargin = ((int) ((jg.this.ouw.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.yu.ra.ouw(jg.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(jg.this.f11504lh, 20.0f));
                layoutParams4.bottomMargin = (int) (((-jg.this.ouw.getMeasuredHeight()) / 2.0f) + com.bytedance.sdk.component.adexpress.yu.ra.ouw(jg.this.getContext(), 5.0f));
                layoutParams4.rightMargin = (int) (((-jg.this.ouw.getMeasuredWidth()) / 2.0f) + com.bytedance.sdk.component.adexpress.yu.ra.ouw(jg.this.getContext(), 5.0f));
                layoutParams4.setMarginStart(layoutParams4.leftMargin);
                layoutParams4.setMarginEnd(layoutParams4.rightMargin);
                jg.this.yu.setLayoutParams(layoutParams4);
            }
        });
    }
}
