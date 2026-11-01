package com.yandex.div.core.view2.spannable;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: FontVariationSpan.kt */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(26)
public final class FontVariationSpan extends MetricAffectingSpan {
    private final String settings;

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setFontVariationSettings(this.settings);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setFontVariationSettings(this.settings);
    }

    public FontVariationSpan(String str) {
        this.settings = str;
    }
}
