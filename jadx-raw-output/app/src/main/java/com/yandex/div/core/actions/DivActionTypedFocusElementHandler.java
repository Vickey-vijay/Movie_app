package com.yandex.div.core.actions;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionFocusElement;
import com.yandex.div2.DivActionTyped;

/* JADX INFO: compiled from: DivActionTypedFocusElementHandler.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivActionTypedFocusElementHandler implements DivActionTypedHandler {
    private final void handleRequestFocus(DivActionFocusElement divActionFocusElement, Div2View div2View, ExpressionResolver expressionResolver) {
        String strEvaluate = divActionFocusElement.f46161a.evaluate(expressionResolver);
        View viewFindViewWithTag = div2View.findViewWithTag(strEvaluate);
        if (viewFindViewWithTag == null && (viewFindViewWithTag = div2View.getViewComponent$div_release().getDivTooltipController().findViewWithTag(strEvaluate)) == null) {
            return;
        }
        viewFindViewWithTag.requestFocus();
        if (viewFindViewWithTag instanceof DivInputView) {
            DivActionTypedUtilsKt.openKeyboard((DivInputView) viewFindViewWithTag);
        }
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String str, DivActionTyped divActionTyped, Div2View div2View, ExpressionResolver expressionResolver) {
        if (!(divActionTyped instanceof DivActionTyped.k)) {
            return false;
        }
        handleRequestFocus(((DivActionTyped.k) divActionTyped).c(), div2View, expressionResolver);
        return true;
    }
}
