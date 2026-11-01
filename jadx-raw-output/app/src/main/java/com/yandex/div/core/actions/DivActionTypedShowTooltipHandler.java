package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionShowTooltip;
import com.yandex.div2.DivActionTyped;

/* JADX INFO: compiled from: DivActionTypedShowTooltipHandler.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DivActionTypedShowTooltipHandler implements DivActionTypedHandler {
    private final void handleShowTooltip(DivActionShowTooltip divActionShowTooltip, Div2View div2View, ExpressionResolver expressionResolver) {
        String strEvaluate = divActionShowTooltip.f46271a.evaluate(expressionResolver);
        Expression<Boolean> expression = divActionShowTooltip.f46272b;
        Boolean boolEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        if (boolEvaluate != null) {
            div2View.showTooltip(strEvaluate, boolEvaluate.booleanValue());
        } else {
            div2View.showTooltip(strEvaluate);
        }
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String str, DivActionTyped divActionTyped, Div2View div2View, ExpressionResolver expressionResolver) {
        if (!(divActionTyped instanceof DivActionTyped.r)) {
            return false;
        }
        handleShowTooltip(((DivActionTyped.r) divActionTyped).c(), div2View, expressionResolver);
        return true;
    }
}
