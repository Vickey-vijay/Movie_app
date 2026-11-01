package com.yandex.div.internal.spannable;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: TypefaceSpan.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class TypefaceSpan extends MetricAffectingSpan {
    private final Typeface typeface;

    private final void apply(TextPaint textPaint) {
        textPaint.setTypeface(this.typeface);
    }

    public TypefaceSpan(Typeface typeface) {
        this.typeface = typeface;
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
