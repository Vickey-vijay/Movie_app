package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import androidx.core.view.ViewCompat;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Paint f6979c = new Paint(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Paint f6980d = new Paint(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Paint f6981e = new Paint(1);

    @Override // com.applovin.impl.adview.e, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44955a, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.applovin.impl.adview.e, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public float getCrossOffset() {
        return this.f6948a * 10.0f;
    }

    public float getInnerCircleOffset() {
        return this.f6948a * 2.0f;
    }

    public float getStrokeWidth() {
        return this.f6948a * 3.0f;
    }

    @Override // com.applovin.impl.adview.e
    public e.a getStyle() {
        return e.a.WHITE_ON_BLACK;
    }

    public n(Context context) {
        super(context);
        f6979c.setColor(-1);
        f6980d.setColor(ViewCompat.MEASURED_STATE_MASK);
        Paint paint = f6981e;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    public float getCenter() {
        return getSize() / 2.0f;
    }

    public float getInnerCircleRadius() {
        return getCenter() - getInnerCircleOffset();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f6979c);
        canvas.drawCircle(center, center, getInnerCircleRadius(), f6980d);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        Paint paint = f6981e;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, paint);
        canvas.drawLine(crossOffset, size, size, crossOffset, paint);
    }
}
