package com.yandex.div.core.view2.spannable;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: FontFeatureSpan.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class FontFeatureSpan extends MetricAffectingSpan {
    private final String settings;

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.settings);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.settings);
    }

    public FontFeatureSpan(String str) {
        this.settings = str;
    }
}
