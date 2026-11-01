package com.yandex.div.internal.widget.slider.shapes;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.yandex.div.core.view2.divs.TextViewExtensionsKt;
import com.yandex.div.internal.widget.slider.SliderTextStyle;

/* JADX INFO: compiled from: TextDrawDelegate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class TextDrawDelegate {
    private float halfTextHeight;
    private float halfTextWidth;
    private String text;
    private final Paint textPaint;
    private final Rect textRect = new Rect();
    private final SliderTextStyle textStyle;

    public final void draw(Canvas canvas, float f10, float f11) {
        String str = this.text;
        if (str != null) {
            canvas.drawText(str, (f10 - this.halfTextWidth) + this.textStyle.getOffsetX(), f11 + this.halfTextHeight + this.textStyle.getOffsetY(), this.textPaint);
        }
    }

    public final void setText(String str) {
        this.text = str;
        this.textPaint.getTextBounds(str, 0, str != null ? str.length() : 0, this.textRect);
        this.halfTextWidth = this.textPaint.measureText(this.text) / 2.0f;
        this.halfTextHeight = this.textRect.height() / 2.0f;
    }

    public TextDrawDelegate(SliderTextStyle sliderTextStyle) {
        this.textStyle = sliderTextStyle;
        Paint paint = new Paint(1);
        paint.setTextSize(sliderTextStyle.getFontSize());
        paint.setLetterSpacing(sliderTextStyle.getSpacing());
        paint.setColor(sliderTextStyle.getTextColor());
        paint.setTypeface(sliderTextStyle.getFontWeight());
        paint.setStyle(Paint.Style.FILL);
        if (TextViewExtensionsKt.getSupportFontVariations()) {
            paint.setFontVariationSettings(sliderTextStyle.getFontVariations());
        }
        this.textPaint = paint;
    }
}
