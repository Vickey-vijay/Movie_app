package com.yandex.div.core.view2.divs.widgets;

import android.util.DisplayMetrics;
import androidx.annotation.Px;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivStroke;

/* JADX INFO: compiled from: DivBorderDrawer.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivBorderDrawerKt {

    /* JADX INFO: compiled from: DivBorderDrawer.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivSizeUnit.values().length];
            try {
                iArr[DivSizeUnit.DP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivSizeUnit.SP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivSizeUnit.PX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Px
    public static final float widthPx(DivStroke divStroke, ExpressionResolver expressionResolver, DisplayMetrics displayMetrics) {
        double dDoubleValue;
        Expression<Double> expression;
        Expression<DivSizeUnit> expression2;
        DivSizeUnit divSizeUnitEvaluate = (divStroke == null || (expression2 = divStroke.f49133c) == null) ? null : expression2.evaluate(expressionResolver);
        int i10 = divSizeUnitEvaluate == null ? -1 : WhenMappings.$EnumSwitchMapping$0[divSizeUnitEvaluate.ordinal()];
        if (i10 == 1) {
            return BaseDivViewExtensionsKt.dpToPxF(divStroke.f49134d.evaluate(expressionResolver), displayMetrics);
        }
        if (i10 == 2) {
            return BaseDivViewExtensionsKt.spToPxF(divStroke.f49134d.evaluate(expressionResolver), displayMetrics);
        }
        if (i10 == 3) {
            dDoubleValue = divStroke.f49134d.evaluate(expressionResolver).doubleValue();
        } else {
            if (divStroke == null || (expression = divStroke.f49134d) == null) {
                return 0.0f;
            }
            dDoubleValue = expression.evaluate(expressionResolver).doubleValue();
        }
        return (float) dDoubleValue;
    }
}
