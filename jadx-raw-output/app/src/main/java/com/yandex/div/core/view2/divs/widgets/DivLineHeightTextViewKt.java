package com.yandex.div.core.view2.divs.widgets;

import ck.p;
import com.yandex.div.core.util.text.DivBackgroundSpan;
import com.yandex.div.core.util.text.DivTextRangesBackgroundHelper;
import com.yandex.div.json.expressions.ExpressionResolver;

/* JADX INFO: compiled from: DivLineHeightTextView.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivLineHeightTextViewKt {
    public static final boolean hasBackgroundSpan(DivLineHeightTextView divLineHeightTextView, CharSequence charSequence, DivBackgroundSpan divBackgroundSpan, int i10, int i11, ExpressionResolver expressionResolver) {
        if (divLineHeightTextView.getTextRoundedBgHelper$div_release() == null) {
            divLineHeightTextView.setTextRoundedBgHelper$div_release(new DivTextRangesBackgroundHelper(divLineHeightTextView, expressionResolver));
            return false;
        }
        DivTextRangesBackgroundHelper textRoundedBgHelper$div_release = divLineHeightTextView.getTextRoundedBgHelper$div_release();
        p.g(textRoundedBgHelper$div_release);
        return textRoundedBgHelper$div_release.hasSameSpan$div_release(charSequence, divBackgroundSpan, i10, i11);
    }
}
