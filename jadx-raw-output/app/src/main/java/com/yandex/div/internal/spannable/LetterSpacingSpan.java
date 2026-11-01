package com.yandex.div.internal.spannable;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: LetterSpacingSpan.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class LetterSpacingSpan extends MetricAffectingSpan {
    private final float letterSpacing;

    private final void apply(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.letterSpacing);
    }

    public LetterSpacingSpan(float f10) {
        this.letterSpacing = f10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        apply(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        apply(textPaint);
    }
}
