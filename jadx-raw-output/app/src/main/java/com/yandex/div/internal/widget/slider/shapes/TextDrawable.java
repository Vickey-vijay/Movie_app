package com.yandex.div.internal.widget.slider.shapes;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.yandex.div.internal.widget.slider.SliderTextStyle;

/* JADX INFO: compiled from: TextDrawable.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class TextDrawable extends Drawable {
    private final RectF rect = new RectF();
    private TextDrawDelegate textDrawDelegate;
    private final SliderTextStyle textStyle;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.rect.set(getBounds());
        this.textDrawDelegate.draw(canvas, this.rect.centerX(), this.rect.centerY());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) (this.textStyle.getFontSize() + Math.abs(this.textStyle.getOffsetY()));
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) (this.rect.width() + Math.abs(this.textStyle.getOffsetX()));
    }

    public final void setText(String str) {
        this.textDrawDelegate.setText(str);
        invalidateSelf();
    }

    public TextDrawable(SliderTextStyle sliderTextStyle) {
        this.textStyle = sliderTextStyle;
        this.textDrawDelegate = new TextDrawDelegate(sliderTextStyle);
    }
}
