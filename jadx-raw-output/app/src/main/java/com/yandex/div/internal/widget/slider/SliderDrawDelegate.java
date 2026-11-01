package com.yandex.div.internal.widget.slider;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.annotation.Px;
import com.yandex.div.internal.widget.slider.shapes.TextDrawable;

/* JADX INFO: compiled from: SliderDrawDelegate.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class SliderDrawDelegate {
    private int viewportHeight;
    private int viewportWidth;

    private final int getCenterY() {
        return this.viewportHeight / 2;
    }

    public final void drawInactiveTrack(Canvas canvas, Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setBounds(0, calculateTop(drawable), this.viewportWidth, calculateBottom(drawable));
        drawable.draw(canvas);
    }

    public final void drawOnPosition(Canvas canvas, Drawable drawable, int i10) {
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i10 - intrinsicWidth, calculateTop(drawable), i10 + intrinsicWidth, calculateBottom(drawable));
        drawable.draw(canvas);
    }

    public final void drawTrackPart(Canvas canvas, Drawable drawable, @Px int i10, @Px int i11) {
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, calculateTop(drawable), i11, calculateBottom(drawable));
        drawable.draw(canvas);
    }

    public final void onMeasure(int i10, int i11) {
        this.viewportWidth = i10;
        this.viewportHeight = i11;
    }

    private final int calculateBottom(Drawable drawable) {
        return getCenterY() + (drawable.getIntrinsicHeight() / 2);
    }

    private final int calculateTop(Drawable drawable) {
        return getCenterY() - (drawable.getIntrinsicHeight() / 2);
    }

    public final void drawThumb(Canvas canvas, int i10, Drawable drawable, int i11, TextDrawable textDrawable) {
        drawOnPosition(canvas, drawable, i10);
        if (textDrawable != null) {
            textDrawable.setText(String.valueOf(i11));
            drawOnPosition(canvas, textDrawable, i10);
        }
    }
}
