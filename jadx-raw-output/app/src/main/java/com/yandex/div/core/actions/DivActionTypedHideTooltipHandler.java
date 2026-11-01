package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionHideTooltip;
import com.yandex.div2.DivActionTyped;

/* JADX INFO: compiled from: DivActionTypedHideTooltipHandler.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivActionTypedHideTooltipHandler implements DivActionTypedHandler {
    private final void handleHideTooltip(DivActionHideTooltip divActionHideTooltip, Div2View div2View, ExpressionResolver expressionResolver) {
        div2View.hideTooltip(divActionHideTooltip.f46168a.evaluate(expressionResolver));
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String str, DivActionTyped divActionTyped, Div2View div2View, ExpressionResolver expressionResolver) {
        if (!(divActionTyped instanceof DivActionTyped.l)) {
            return false;
        }
        handleHideTooltip(((DivActionTyped.l) divActionTyped).c(), div2View, expressionResolver);
        return true;
    }
}
