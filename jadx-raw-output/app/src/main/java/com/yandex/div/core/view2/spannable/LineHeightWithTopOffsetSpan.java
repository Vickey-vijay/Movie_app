package com.yandex.div.core.view2.spannable;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;
import androidx.annotation.Px;
import ik.k;
import lk.a0;

/* JADX INFO: compiled from: LineHeightWithTopOffsetSpan.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class LineHeightWithTopOffsetSpan implements LineHeightSpan {
    private boolean fontMetricsSaved;
    private final int lineHeight;
    private final int topOffset;
    private final int topOffsetEnd;
    private final int topOffsetStart;
    private int savedTop = Integer.MAX_VALUE;
    private int savedAscent = Integer.MAX_VALUE;
    private int savedDescent = Integer.MAX_VALUE;
    private int savedBottom = Integer.MAX_VALUE;

    private final void applyLineHeight(int i10, Paint.FontMetricsInt fontMetricsInt) {
        if (i10 <= 0) {
            return;
        }
        int i11 = fontMetricsInt.descent;
        int i12 = fontMetricsInt.ascent;
        int i13 = i11 - i12;
        int i14 = fontMetricsInt.top - i12;
        int i15 = fontMetricsInt.bottom - i11;
        if (i13 >= 0) {
            int i16 = i10 - i13;
            if (i16 < 0) {
                int iG = k.g(i12 - (i16 / 2), 0);
                fontMetricsInt.ascent = iG;
                fontMetricsInt.descent = k.d(iG + i10, 0);
            } else {
                int iD = k.d(i11 + (i16 / 2), 0);
                fontMetricsInt.descent = iD;
                fontMetricsInt.ascent = k.g(iD - i10, 0);
            }
            fontMetricsInt.top = fontMetricsInt.ascent + i14;
            fontMetricsInt.bottom = fontMetricsInt.descent + i15;
        }
    }

    private final void applyTopOffset(Paint.FontMetricsInt fontMetricsInt) {
        int i10 = this.topOffset;
        if (i10 <= 0) {
            return;
        }
        fontMetricsInt.top -= i10;
        fontMetricsInt.ascent -= i10;
    }

    private final void restoreFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        fontMetricsInt.top = this.savedTop;
        fontMetricsInt.ascent = this.savedAscent;
        fontMetricsInt.descent = this.savedDescent;
        fontMetricsInt.bottom = this.savedBottom;
    }

    private final void saveFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        this.savedTop = fontMetricsInt.top;
        this.savedAscent = fontMetricsInt.ascent;
        this.savedDescent = fontMetricsInt.descent;
        this.savedBottom = fontMetricsInt.bottom;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned == null) {
            return;
        }
        int spanStart = spanned.getSpanStart(this);
        if (i10 > spanned.getSpanEnd(this) || spanStart > i11) {
            return;
        }
        if (this.fontMetricsSaved) {
            restoreFontMetrics(fontMetricsInt);
        } else {
            this.fontMetricsSaved = true;
            saveFontMetrics(fontMetricsInt);
        }
        Object[] spans = spanned.getSpans(i10, i11, LineHeightWithTopOffsetSpan.class);
        int iMax = this.lineHeight;
        for (Object obj : spans) {
            iMax = Math.max(iMax, ((LineHeightWithTopOffsetSpan) obj).lineHeight);
        }
        applyLineHeight(iMax, fontMetricsInt);
        int i14 = this.topOffsetStart;
        if (i14 == spanStart) {
            if (i10 <= i14 && i14 <= i11) {
                applyTopOffset(fontMetricsInt);
            }
        }
        if (a0.X(charSequence.subSequence(i10, i11).toString(), "\n", false, 2, null)) {
            this.fontMetricsSaved = false;
        }
    }

    public LineHeightWithTopOffsetSpan(@Px int i10, @Px int i11, int i12, int i13) {
        this.topOffset = i10;
        this.lineHeight = i11;
        this.topOffsetStart = i12;
        this.topOffsetEnd = i13;
    }
}
