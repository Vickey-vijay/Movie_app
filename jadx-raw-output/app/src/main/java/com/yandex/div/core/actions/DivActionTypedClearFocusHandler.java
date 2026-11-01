package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionTyped;

/* JADX INFO: compiled from: DivActionTypedClearFocusHandler.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivActionTypedClearFocusHandler implements DivActionTypedHandler {
    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String str, DivActionTyped divActionTyped, Div2View div2View, ExpressionResolver expressionResolver) {
        if (!(divActionTyped instanceof DivActionTyped.f)) {
            return false;
        }
        div2View.clearFocus();
        DivActionTypedUtilsKt.closeKeyboard(div2View);
        return true;
    }
}
