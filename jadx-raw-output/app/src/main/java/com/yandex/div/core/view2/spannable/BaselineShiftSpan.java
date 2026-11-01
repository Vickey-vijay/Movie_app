package com.yandex.div.core.view2.spannable;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.text.style.ParagraphStyle;
import androidx.annotation.IntRange;
import androidx.annotation.Px;

/* JADX INFO: compiled from: BaselineShiftSpan.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BaselineShiftSpan extends MetricAffectingSpan implements ParagraphStyle {
    private final int baselineShift;
    private final int lineHeight;

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.baselineShift -= this.baselineShift;
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        if (this.lineHeight == 0) {
            textPaint.baselineShift -= this.baselineShift;
        }
    }

    public BaselineShiftSpan(@Px int i10, @IntRange(from = 0) @Px int i11) {
        this.baselineShift = i10;
        this.lineHeight = i11;
    }
}
