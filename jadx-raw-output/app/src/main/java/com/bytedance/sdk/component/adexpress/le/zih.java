package com.bytedance.sdk.component.adexpress.le;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes7.dex */
public final class zih extends View {
    private Paint fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private RectF f11556le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public boolean f11557lh;
    public ValueAnimator ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private float f11558ra;
    public int vt;
    private Context yu;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public final void setDuration(int i10) {
        this.vt = i10;
    }

    public zih(Context context) {
        super(context);
        this.vt = 1500;
        this.yu = context;
        Paint paint = new Paint();
        this.fkw = paint;
        paint.setAntiAlias(true);
        this.fkw.setStyle(Paint.Style.STROKE);
        this.fkw.setStrokeWidth(10.0f);
        this.fkw.setColor(Color.parseColor("#80FFFFFF"));
        this.f11556le = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f11557lh) {
            return;
        }
        canvas.drawArc(this.f11556le, 270.0f, this.f11558ra, false, this.fkw);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f11556le.set(5.0f, 5.0f, i10 - 5, i11 - 5);
    }
}
