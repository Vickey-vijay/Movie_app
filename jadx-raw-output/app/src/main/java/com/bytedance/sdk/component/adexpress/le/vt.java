package com.bytedance.sdk.component.adexpress.le;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.motion.widget.Key;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes7.dex */
public final class vt extends FrameLayout {
    private int bly;
    private View fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private View f11548le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public boolean f11549lh;
    public AnimatorSet ouw;
    private int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private ImageView f11550ra;
    private Context tlj;
    public ObjectAnimator vt;
    private View yu;

    public static /* synthetic */ boolean yu(vt vtVar) {
        vtVar.f11549lh = true;
        return true;
    }

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

    private static GradientDrawable ouw(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setStroke(1, Color.parseColor(str2));
        return gradientDrawable;
    }

    public vt(Context context, int i10, int i11) {
        super(context);
        this.f11549lh = false;
        this.ouw = new AnimatorSet();
        this.pno = i10;
        this.bly = i11;
        this.tlj = context;
        View view = new View(context);
        this.yu = view;
        view.setBackground(ouw("#1A7BBEFF", "#337BBEFF"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (((double) this.pno) * 0.45d), (int) (((double) this.bly) * 0.45d));
        layoutParams.gravity = 17;
        this.yu.setLayoutParams(layoutParams);
        addView(this.yu);
        View view2 = new View(this.tlj);
        this.fkw = view2;
        view2.setBackground(ouw("#337BBEFF", "#807BBEFF"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (((double) this.pno) * 0.25d), (int) (((double) this.bly) * 0.25d));
        layoutParams2.gravity = 17;
        this.fkw.setLayoutParams(layoutParams2);
        addView(this.fkw);
        View view3 = new View(this.tlj);
        this.f11548le = view3;
        view3.setBackground(ouw("#807BBEFF", "#FF7BBEFF"));
        int i12 = this.pno;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (((double) i12) * 0.25d), (int) (((double) i12) * 0.25d));
        layoutParams3.gravity = 17;
        this.f11548le.setLayoutParams(layoutParams3);
        addView(this.f11548le);
        ImageView imageView = new ImageView(this.tlj);
        this.f11550ra = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.vpp.yu(getContext(), "tt_blue_hand"));
        this.f11550ra.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) (((double) this.pno) * 0.62d), (int) (((double) this.bly) * 0.53d));
        layoutParams4.gravity = 17;
        layoutParams4.topMargin = (layoutParams4.width / 2) - 5;
        layoutParams4.leftMargin = (layoutParams4.height / 2) - 5;
        this.f11550ra.setLayoutParams(layoutParams4);
        addView(this.f11550ra);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.yu, "scaleX", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.yu, "scaleY", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.fkw, "scaleX", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.fkw, "scaleY", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f11548le, "scaleX", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f11548le, "scaleY", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.f11550ra, Key.ROTATION, 0.0f, -20.0f, 0.0f);
        this.vt = objectAnimatorOfFloat7;
        objectAnimatorOfFloat7.setDuration(1000L);
        this.ouw.setDuration(1500L);
        this.ouw.setInterpolator(new AccelerateDecelerateInterpolator());
        this.ouw.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6);
        this.ouw.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.le.vt.1
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                vt.yu(vt.this);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (vt.this.f11549lh) {
                    return;
                }
                vt.this.vt.start();
                vt.this.ouw.start();
            }
        });
    }
}
