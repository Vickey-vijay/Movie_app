package com.yandex.div.core.util.text;

import android.util.DisplayMetrics;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivTextRangeBorder;

/* JADX INFO: compiled from: DivTextRangesBackgroundRenderer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivTextRangesBackgroundRendererKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float[] getCornerRadii(DivTextRangeBorder divTextRangeBorder, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        Expression<Long> expression = divTextRangeBorder.f49630a;
        float fDpToPx = BaseDivViewExtensionsKt.dpToPx(expression != null ? expression.evaluate(expressionResolver) : null, displayMetrics);
        return new float[]{fDpToPx, fDpToPx, fDpToPx, fDpToPx, fDpToPx, fDpToPx, fDpToPx, fDpToPx};
    }
}
