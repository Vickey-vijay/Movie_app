package com.yandex.div.core.util.text;

import android.text.TextPaint;
import android.text.style.UnderlineSpan;
import com.yandex.div2.DivTextRangeBackground;
import com.yandex.div2.DivTextRangeBorder;

/* JADX INFO: compiled from: DivBackgroundSpan.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivBackgroundSpan extends UnderlineSpan {
    private final DivTextRangeBackground background;
    private final DivTextRangeBorder border;

    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }

    public final DivTextRangeBackground getBackground() {
        return this.background;
    }

    public final DivTextRangeBorder getBorder() {
        return this.border;
    }

    public DivBackgroundSpan(DivTextRangeBorder divTextRangeBorder, DivTextRangeBackground divTextRangeBackground) {
        this.border = divTextRangeBorder;
        this.background = divTextRangeBackground;
    }
}
