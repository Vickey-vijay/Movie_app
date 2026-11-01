package io.bidmachine.rendering.internal.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes8.dex */
public class a extends TextureView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f60596a;

    public a(Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f60596a <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        float f12 = this.f60596a;
        if ((f12 / (f10 / f11)) - 1.0f > 0.0f) {
            measuredHeight = (int) (f10 / f12);
        } else {
            measuredWidth = (int) (f11 * f12);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setVideoAspectRatio(float f10) {
        if (f10 == 0.0f || this.f60596a == f10) {
            return;
        }
        this.f60596a = f10;
        requestLayout();
    }
}
