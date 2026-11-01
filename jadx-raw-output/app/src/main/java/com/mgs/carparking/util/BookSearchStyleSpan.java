package com.mgs.carparking.util;

import android.text.TextPaint;
import android.text.style.StyleSpan;
import androidx.core.content.ContextCompat;
import com.fvvcl.flickverse.R;
import me.goldze.mvvmhabit.base.BaseApplication;

/* JADX INFO: loaded from: classes9.dex */
public class BookSearchStyleSpan extends StyleSpan {
    @Override // android.text.style.StyleSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setFakeBoldText(true);
        textPaint.setColor(ContextCompat.getColor(BaseApplication.getInstance(), R.color.color_commen));
        super.updateDrawState(textPaint);
    }

    @Override // android.text.style.StyleSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setFakeBoldText(true);
        super.updateMeasureState(textPaint);
    }

    public BookSearchStyleSpan(int i10) {
        super(i10);
    }
}
