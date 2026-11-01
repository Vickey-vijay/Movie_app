package io.bidmachine.iab.vast.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.iab.utils.Assets;
import io.bidmachine.iab.utils.IabElement;
import io.bidmachine.iab.utils.IabElementStyle;

/* JADX INFO: loaded from: classes4.dex */
public class IabTextView extends TextView implements IabElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RectF f59719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GradientDrawable f59720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f59721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f59722d;

    public IabTextView(@NonNull Context context) {
        super(context);
        this.f59719a = new RectF();
        this.f59722d = false;
        a(context);
    }

    public void a(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f59720b = gradientDrawable;
        gradientDrawable.setColor(Assets.BACKGROUND_COLOR);
        this.f59720b.setShape(0);
        setBackgroundDrawable(this.f59720b);
        setGravity(17);
        setMaxLines(1);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f59722d || this.f59721c == null) {
            return;
        }
        float height = getHeight() / 2.0f;
        canvas.drawRoundRect(this.f59719a, height, height, this.f59721c);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        if (View.MeasureSpec.getMode(i11) == 1073741824) {
            float size = (View.MeasureSpec.getSize(i11) - getCompoundPaddingTop()) - getCompoundPaddingRight();
            if (getTextSize() != size) {
                setTextSize(0, size);
            }
        }
        if (mode == 1073741824 && getText() != null) {
            int size2 = (View.MeasureSpec.getSize(i10) - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            float fMeasureText = getPaint().measureText(getText(), 0, getText().length());
            float f10 = size2;
            if (f10 < fMeasureText) {
                float textSize = (int) (getTextSize() * (f10 / fMeasureText));
                if (getTextSize() != textSize) {
                    setTextSize(0, textSize);
                }
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        Paint paint;
        super.onSizeChanged(i10, i11, i12, i13);
        GradientDrawable gradientDrawable = this.f59720b;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(i11 / 2.0f);
        }
        if (!this.f59722d || (paint = this.f59721c) == null) {
            return;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        float f10 = 0.0f + strokeWidth;
        this.f59719a.set(f10, f10, i10 - strokeWidth, i11 - strokeWidth);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        GradientDrawable gradientDrawable = this.f59720b;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i10);
        }
    }

    @Override // io.bidmachine.iab.utils.IabElement
    public void setStyle(@NonNull IabElementStyle iabElementStyle) {
        boolean zBooleanValue = iabElementStyle.isOutlined().booleanValue();
        this.f59722d = zBooleanValue;
        if (zBooleanValue) {
            Paint paint = new Paint(1);
            this.f59721c = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f59721c.setColor(iabElementStyle.getStrokeColor().intValue());
            this.f59721c.setStrokeWidth(iabElementStyle.getStrokeWidth(getContext()).floatValue());
        }
        setTextColor(iabElementStyle.getStrokeColor().intValue());
        setBackgroundColor(iabElementStyle.getFillColor().intValue());
        setTextSize(0, iabElementStyle.getFontSize(getContext()).floatValue());
        setTypeface(Typeface.create(Typeface.DEFAULT, iabElementStyle.getFontStyle().intValue()));
        setAlpha(iabElementStyle.getOpacity().floatValue());
        setPadding(iabElementStyle.getPaddingLeft(getContext()).intValue(), iabElementStyle.getPaddingTop(getContext()).intValue(), iabElementStyle.getPaddingRight(getContext()).intValue(), iabElementStyle.getPaddingBottom(getContext()).intValue());
    }

    public IabTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f59719a = new RectF();
        this.f59722d = false;
        a(context);
    }
}
