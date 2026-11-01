package com.fyber.inneractive.sdk.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ProgressBar;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes10.dex */
public class IAsmoothProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AccelerateDecelerateInterpolator f18523c = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ValueAnimator f18524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ValueAnimator f18525b;

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44970p, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i10) {
        ValueAnimator valueAnimator = this.f18524a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f18524a;
        if (valueAnimator2 == null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getProgress(), i10);
            this.f18524a = valueAnimatorOfInt;
            valueAnimatorOfInt.setInterpolator(f18523c);
            this.f18524a.addUpdateListener(new h(this));
        } else {
            valueAnimator2.setIntValues(getProgress(), i10);
        }
        this.f18524a.start();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setSecondaryProgress(int i10) {
        ValueAnimator valueAnimator = this.f18525b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f18525b;
        if (valueAnimator2 == null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getProgress(), i10);
            this.f18525b = valueAnimatorOfInt;
            valueAnimatorOfInt.setInterpolator(f18523c);
            this.f18525b.addUpdateListener(new i(this));
        } else {
            valueAnimator2.setIntValues(getProgress(), i10);
        }
        this.f18525b.start();
    }

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f18524a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f18525b;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }
}
