package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes2.dex */
public final class ko extends com.bytedance.sdk.openadsdk.core.le.pno {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f13104lh;
    private Paint ouw;
    private RectF vt;

    public ko(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.pno, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    private ko(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.vt;
        float f10 = rectF.bottom;
        canvas.drawRoundRect(rectF, f10 / 2.0f, f10 / 2.0f, this.ouw);
        canvas.translate((this.vt.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), 0.0f);
        super.onDraw(canvas);
    }

    private ko(Context context, @Nullable AttributeSet attributeSet, byte b10) {
        super(context, attributeSet);
        this.f13104lh = 0;
        setTextColor(-1);
        Paint paint = new Paint();
        this.ouw = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.ouw.setColor(Color.parseColor("#99333333"));
        this.ouw.setAntiAlias(true);
        this.ouw.setStrokeWidth(0.0f);
        this.vt = new RectF();
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.pno, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0) {
            int iMeasureText = (int) getPaint().measureText("00");
            this.f13104lh = iMeasureText;
            if (measuredWidth < iMeasureText) {
                measuredWidth = iMeasureText;
            }
            int i12 = measuredWidth + ((measuredHeight / 2) * 2);
            setMeasuredDimension(i12, measuredHeight);
            this.vt.set(0.0f, 0.0f, i12, measuredHeight);
            return;
        }
        this.vt.set(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
