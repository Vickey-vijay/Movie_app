package io.bidmachine.iab.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.core.internal.view.SupportMenu;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes9.dex */
public final class CircularProgressBar extends ProgressBar implements IabElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CircularProgressDrawable f59324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f59325b;

    public CircularProgressBar(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f59325b = paint;
        paint.setColor(0);
        a(context);
    }

    public void a(Context context) {
        float f10 = getResources().getDisplayMetrics().density;
        int iDpToPx = Utils.dpToPx(context, 8.0f);
        setPadding(iDpToPx, iDpToPx, iDpToPx, iDpToPx);
        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(context);
        this.f59324a = circularProgressDrawable;
        circularProgressDrawable.setStrokeWidth(f10 * 4.0f);
        this.f59324a.setColorSchemeColors(SupportMenu.CATEGORY_MASK);
        this.f59324a.setStrokeCap(Paint.Cap.ROUND);
        setIndeterminateDrawable(this.f59324a);
        setIndeterminate(true);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, this.f59325b);
        super.onDraw(canvas);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f59324a.setCenterRadius((Math.min((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - this.f59324a.getStrokeWidth());
    }

    public void setColorSchemeColors(int... iArr) {
        this.f59324a.setColorSchemeColors(iArr);
    }

    public void setProgressBackgroundColor(int i10) {
        this.f59325b.setColor(i10);
    }

    @Override // io.bidmachine.iab.utils.IabElement
    public void setStyle(@NonNull IabElementStyle iabElementStyle) {
        this.f59324a.setStrokeWidth(iabElementStyle.getStrokeWidth(getContext()).floatValue());
        this.f59324a.setColorSchemeColors(iabElementStyle.getStrokeColor().intValue());
        this.f59325b.setColor(iabElementStyle.getFillColor().intValue());
        postInvalidate();
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f59325b = paint;
        paint.setColor(0);
        a(context);
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Paint paint = new Paint(1);
        this.f59325b = paint;
        paint.setColor(0);
        a(context);
    }
}
