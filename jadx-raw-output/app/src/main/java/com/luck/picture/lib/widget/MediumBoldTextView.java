package com.luck.picture.lib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.luck.picture.lib.R$styleable;

/* JADX INFO: loaded from: classes8.dex */
public class MediumBoldTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f32449b;

    public MediumBoldTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediumBoldTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f32449b = 0.6f;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.PictureMediumBoldTextView, i10, 0);
        this.f32449b = typedArrayObtainStyledAttributes.getFloat(R$styleable.PictureMediumBoldTextView_stroke_Width, this.f32449b);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setStrokeWidth(float f10) {
        this.f32449b = f10;
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        TextPaint paint = getPaint();
        float strokeWidth = paint.getStrokeWidth();
        float f10 = this.f32449b;
        if (strokeWidth != f10) {
            paint.setStrokeWidth(f10);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
        }
        super.onDraw(canvas);
    }
}
