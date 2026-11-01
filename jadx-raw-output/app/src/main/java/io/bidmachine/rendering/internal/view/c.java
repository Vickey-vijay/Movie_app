package io.bidmachine.rendering.internal.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import ck.p;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.internal.i;
import io.bidmachine.rendering.internal.s;
import io.bidmachine.rendering.model.AppearanceParams;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends View implements io.bidmachine.rendering.internal.e, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f60618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f60619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f60620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f60621d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        p.j(context, GAMConfig.KEY_CONTEXT);
        this.f60618a = new Paint(1);
        this.f60620c = i.f60428c;
    }

    @VisibleForTesting
    public static /* synthetic */ void getLineBackgroundColor$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLineColor$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLinePaint$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPercent$annotations() {
    }

    @Override // io.bidmachine.rendering.internal.e
    public void a(AppearanceParams appearanceParams) {
        p.j(appearanceParams, "appearanceParams");
        Integer fillColor = appearanceParams.getFillColor();
        if (fillColor != null) {
            this.f60621d = fillColor.intValue();
        }
        Integer strokeColor = appearanceParams.getStrokeColor();
        if (strokeColor != null) {
            this.f60620c = strokeColor.intValue();
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public final int getLineBackgroundColor() {
        return this.f60621d;
    }

    public final int getLineColor() {
        return this.f60620c;
    }

    public final Paint getLinePaint() {
        return this.f60618a;
    }

    public final float getPercent() {
        return this.f60619b;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        p.j(canvas, "canvas");
        super.onDraw(canvas);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float measuredHeight = (getMeasuredHeight() / 2.0f) + getPaddingTop();
        this.f60618a.setColor(this.f60621d);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + width, measuredHeight, this.f60618a);
        this.f60618a.setColor(this.f60620c);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + ((width * this.f60619b) / 100), measuredHeight, this.f60618a);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f60618a.setStrokeWidth(getMeasuredHeight());
    }

    public final void setLineBackgroundColor(int i10) {
        this.f60621d = i10;
    }

    public final void setLineColor(int i10) {
        this.f60620c = i10;
    }

    public final void setPercent(float f10) {
        this.f60619b = f10;
    }

    @Override // io.bidmachine.rendering.internal.s
    public void a(long j10, long j11, float f10) {
        this.f60619b = f10;
        postInvalidate();
    }
}
