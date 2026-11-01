package com.yandex.div.internal.spannable;

import android.graphics.Paint;
import android.os.Build;
import android.text.style.ReplacementSpan;

/* JADX INFO: compiled from: PositionAwareReplacementSpan.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class PositionAwareReplacementSpan extends ReplacementSpan {
    public abstract int adjustSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt);

    private final void updateFontMetrics(int i10, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt == null || i10 != 0 || Build.VERSION.SDK_INT >= 28) {
            return;
        }
        fontMetricsInt.top = 0;
        fontMetricsInt.ascent = 0;
        fontMetricsInt.bottom = 0;
        fontMetricsInt.descent = 0;
        fontMetricsInt.leading = 0;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        updateFontMetrics(i10, fontMetricsInt);
        return adjustSize(paint, charSequence, i10, i11, fontMetricsInt);
    }
}
