package io.bidmachine.iab.vast.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.iab.utils.Assets;
import io.bidmachine.iab.utils.IabElement;
import io.bidmachine.iab.utils.IabElementStyle;
import io.bidmachine.iab.utils.Utils;

/* JADX INFO: loaded from: classes11.dex */
public class LinearCountdownView extends View implements IabElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f59725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f59726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f59727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f59728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f59729e;

    public LinearCountdownView(@NonNull Context context) {
        super(context);
        this.f59725a = new Paint(1);
        this.f59726b = 0.0f;
        this.f59727c = 15.0f;
        this.f59728d = Assets.MAIN_ASSETS_COLOR;
        this.f59729e = 0;
        a();
    }

    private void a() {
        this.f59727c = Utils.dpToPx(getContext(), 4.0f);
    }

    public void changePercentage(float f10) {
        this.f59726b = f10;
        postInvalidate();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public int getLineColor() {
        return this.f59728d;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float measuredHeight = (getMeasuredHeight() / 2.0f) + getPaddingTop();
        this.f59725a.setStrokeWidth(this.f59727c);
        this.f59725a.setColor(this.f59729e);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + width, measuredHeight, this.f59725a);
        this.f59725a.setColor(this.f59728d);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + ((width * this.f59726b) / 100.0f), measuredHeight, this.f59725a);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // io.bidmachine.iab.utils.IabElement
    public void setStyle(@NonNull IabElementStyle iabElementStyle) {
        this.f59728d = iabElementStyle.getStrokeColor().intValue();
        this.f59729e = iabElementStyle.getFillColor().intValue();
        this.f59727c = iabElementStyle.getStrokeWidth(getContext()).floatValue();
        setAlpha(iabElementStyle.getOpacity().floatValue());
        postInvalidate();
    }

    public LinearCountdownView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f59725a = new Paint(1);
        this.f59726b = 0.0f;
        this.f59727c = 15.0f;
        this.f59728d = Assets.MAIN_ASSETS_COLOR;
        this.f59729e = 0;
        a();
    }
}
