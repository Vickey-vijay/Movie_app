package com.bytedance.sdk.openadsdk.core.le;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes10.dex */
public final class le extends FrameLayout {
    private Drawable fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private boolean f12699le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private Drawable f12700lh;
    private int ouw;
    private boolean pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private ValueAnimator f12701ra;
    private int vt;
    private Drawable yu;

    public le(Context context) {
        super(context);
        this.ouw = 100;
    }

    private void ouw() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 10000);
        this.f12701ra = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(2000L);
        this.f12701ra.setRepeatCount(-1);
        this.f12701ra.setInterpolator(new LinearInterpolator());
        this.f12701ra.setRepeatMode(1);
        this.f12701ra.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.le.le.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                le.this.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.f12701ra.start();
        setMax(10000);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public final void setIndeterminateDrawable(Drawable drawable) {
        this.fkw = drawable;
        setProgressDrawable(drawable);
        if (this.f12699le && this.f12701ra == null) {
            ouw();
        }
    }

    public final void setMax(int i10) {
        this.ouw = i10;
    }

    public final void setProgress(int i10) {
        this.vt = i10;
        Drawable drawable = this.f12700lh;
        if (drawable != null) {
            drawable.setLevel((int) ((i10 * 10000.0f) / this.ouw));
        }
    }

    public final void setProgressDrawable(Drawable drawable) {
        this.yu = drawable;
        setBackground(drawable);
        Drawable drawable2 = this.yu;
        if (drawable2 instanceof LayerDrawable) {
            int numberOfLayers = ((LayerDrawable) drawable2).getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                Drawable drawable3 = ((LayerDrawable) this.yu).getDrawable(i10);
                if ((drawable3 instanceof ScaleDrawable) || (drawable3 instanceof ClipDrawable)) {
                    this.f12700lh = drawable3;
                }
            }
        }
        Drawable drawable4 = this.yu;
        if (drawable4 instanceof RotateDrawable) {
            this.f12700lh = drawable4;
        }
    }

    public le(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.style.Widget.ProgressBar.Horizontal);
        this.ouw = 100;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12699le = true;
        if (this.fkw != null) {
            ouw();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12699le = false;
        ValueAnimator valueAnimator = this.f12701ra;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f12701ra.removeAllUpdateListeners();
            this.f12701ra = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 == 0) {
            if (this.pno) {
                this.pno = false;
                ValueAnimator valueAnimator = this.f12701ra;
                if (valueAnimator != null) {
                    valueAnimator.resume();
                    return;
                } else {
                    ouw();
                    return;
                }
            }
            return;
        }
        ValueAnimator valueAnimator2 = this.f12701ra;
        if (valueAnimator2 != null && !this.pno) {
            this.pno = true;
            valueAnimator2.pause();
        }
    }

    @Override // android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(bly.ouw(this, layoutParams));
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
    }
}
