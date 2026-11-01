package com.yandex.div.internal.spannable;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;

/* JADX INFO: compiled from: TextColorSpan.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class TextColorSpan extends ForegroundColorSpan {
    public TextColorSpan(int i10) {
        super(i10);
    }

    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setShader(null);
    }
}
