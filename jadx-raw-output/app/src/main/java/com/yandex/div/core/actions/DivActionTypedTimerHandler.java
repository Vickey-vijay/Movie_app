package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionTimer;
import com.yandex.div2.DivActionTyped;

/* JADX INFO: compiled from: DivActionTypedTimerHandler.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivActionTypedTimerHandler implements DivActionTypedHandler {
    private final void handleTimerAction(DivActionTimer divActionTimer, Div2View div2View, ExpressionResolver expressionResolver) {
        div2View.applyTimerCommand(divActionTimer.f46342b.evaluate(expressionResolver), DivActionTimer.Action.Converter.b(divActionTimer.f46341a.evaluate(expressionResolver)));
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String str, DivActionTyped divActionTyped, Div2View div2View, ExpressionResolver expressionResolver) {
        if (!(divActionTyped instanceof DivActionTyped.t)) {
            return false;
        }
        handleTimerAction(((DivActionTyped.t) divActionTyped).c(), div2View, expressionResolver);
        return true;
    }
}
