package com.yandex.div.core.view2.spannable;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.text.style.ParagraphStyle;
import androidx.annotation.IntRange;
import androidx.annotation.Px;

/* JADX INFO: compiled from: FontSizeSpan.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class FontSizeSpan extends MetricAffectingSpan implements ParagraphStyle {
    private final int fontSize;
    private final int lineHeight;

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(this.fontSize);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        int i10 = this.lineHeight;
        if (i10 == 0) {
            textPaint.setTextSize(this.fontSize);
        } else if (i10 >= textPaint.getTextSize()) {
            textPaint.setTextScaleX(this.fontSize / textPaint.getTextSize());
        } else {
            textPaint.setTextScaleX(this.fontSize / this.lineHeight);
            textPaint.setTextSize(this.lineHeight);
        }
    }

    public FontSizeSpan(@Px int i10, @IntRange(from = 0) @Px int i11) {
        this.fontSize = i10;
        this.lineHeight = i11;
    }
}
