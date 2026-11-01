package com.bytedance.sdk.openadsdk.core.cf.vt.lh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.ugeno.yu;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes.dex */
public class ouw extends View {
    private float bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private int f12654cf;
    private Paint fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private float f12655jg;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private RectF f12656le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public yu f12657lh;
    private int mwh;
    public float ouw;
    private int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private int f12658ra;
    private ValueAnimator ryl;
    private int tlj;
    public String vt;
    private Paint yu;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public int getMaxProgress() {
        return this.f12654cf;
    }

    public int getProgress() {
        return this.tlj;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        yu yuVar = this.f12657lh;
        if (yuVar != null) {
            int[] iArrOuw = yuVar.ouw(i10, i11);
            super.onMeasure(iArrOuw[0], iArrOuw[1]);
        } else {
            super.onMeasure(i10, i11);
        }
        if (TextUtils.equals(this.vt, "ring") || TextUtils.equals(this.vt, "ring_reverse")) {
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
            setMeasuredDimension(iMin, iMin);
        } else {
            setMeasuredDimension(getMeasuredWidth(), (int) this.bly);
        }
        yu yuVar2 = this.f12657lh;
        if (yuVar2 != null) {
            yuVar2.lh();
        }
    }

    public final ouw ouw(int i10) {
        this.fkw.setColor(i10);
        return this;
    }

    public void setAnimationDuration(int i10) {
        this.mwh = i10;
        this.ryl.setDuration(i10);
    }

    public void setMaxProgress(int i10) {
        this.f12654cf = i10;
        invalidate();
    }

    public void setProgress(int i10) {
        int iMin = Math.min(i10, this.f12654cf);
        this.tlj = iMin;
        if (iMin < 0) {
            this.tlj = 0;
        }
        ValueAnimator valueAnimator = this.ryl;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.ryl.setFloatValues(this.f12655jg, this.tlj);
            Log.d("UGenRender", "setProgress: animatedProgress=" + this.f12655jg + " progress=" + i10);
            this.ryl.start();
        }
    }

    public final ouw vt(int i10) {
        this.yu.setColor(i10);
        return this;
    }

    public ouw(Context context) {
        super(context);
        this.f12658ra = com.bytedance.adsdk.ugeno.ra.ouw.ouw("#FFD813");
        this.pno = com.bytedance.adsdk.ugeno.ra.ouw.ouw("rgba(0, 0, 0, 0.5)");
        this.bly = 3.0f;
        this.ouw = 0.0f;
        this.tlj = 0;
        this.f12654cf = 100;
        this.vt = "line";
        this.mwh = 1000;
        setBackgroundColor(0);
        Paint paint = new Paint(1);
        this.yu = paint;
        paint.setColor(this.pno);
        this.yu.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.fkw = paint2;
        paint2.setColor(this.f12658ra);
        this.fkw.setStyle(Paint.Style.FILL);
        this.f12656le = new RectF();
        this.f12655jg = this.tlj;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(new float[0]);
        this.ryl = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.mwh);
        this.ryl.setInterpolator(new LinearInterpolator());
        this.ryl.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.cf.vt.lh.ouw.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ouw.this.f12655jg = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ouw.this.invalidate();
            }
        });
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.ryl;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f10;
        int i10;
        super.onDraw(canvas);
        if (!TextUtils.equals(this.vt, "ring") && !TextUtils.equals(this.vt, "ring_reverse")) {
            this.yu.setStyle(Paint.Style.FILL);
            float width = getWidth();
            float f11 = this.bly;
            float f12 = this.ouw;
            canvas.drawRoundRect(0.0f, 0.0f, width, f11, f12, f12, this.yu);
            float width2 = (getWidth() * this.f12655jg) / this.f12654cf;
            this.fkw.setStyle(Paint.Style.FILL);
            if (TextUtils.equals(this.vt, "line_reverse")) {
                float width3 = getWidth() - width2;
                float width4 = getWidth();
                float f13 = this.bly;
                float f14 = this.ouw;
                canvas.drawRoundRect(width3, 0.0f, width4, f13, f14, f14, this.fkw);
                return;
            }
            float f15 = this.bly;
            float f16 = this.ouw;
            canvas.drawRoundRect(0.0f, 0.0f, width2, f15, f16, f16, this.fkw);
            return;
        }
        float f17 = this.bly / 2.0f;
        this.f12656le.set(f17, f17, getWidth() - f17, getHeight() - f17);
        this.yu.setStyle(Paint.Style.STROKE);
        this.yu.setStrokeWidth(this.bly);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - f17, this.yu);
        if (TextUtils.equals(this.vt, "ring_reverse")) {
            f10 = this.f12655jg * (-360.0f);
            i10 = this.f12654cf;
        } else {
            f10 = this.f12655jg * 360.0f;
            i10 = this.f12654cf;
        }
        float f18 = f10 / i10;
        this.fkw.setStyle(Paint.Style.STROKE);
        this.fkw.setStrokeWidth(this.bly);
        if (this.ouw <= 0.0f) {
            this.fkw.setStrokeCap(Paint.Cap.SQUARE);
        } else {
            this.fkw.setStrokeCap(Paint.Cap.ROUND);
        }
        canvas.drawArc(this.f12656le, -90.0f, f18, false, this.fkw);
    }

    public final ouw ouw(float f10) {
        this.bly = f10;
        invalidate();
        return this;
    }
}
