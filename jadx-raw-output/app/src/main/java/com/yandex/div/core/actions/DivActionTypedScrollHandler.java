package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.items.DivViewWithItemsController;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionScrollBy;
import com.yandex.div2.DivActionScrollDestination;
import com.yandex.div2.DivActionScrollTo;
import com.yandex.div2.DivActionTyped;

/* JADX INFO: compiled from: DivActionTypedScrollHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivActionTypedScrollHandler implements DivActionTypedHandler {
    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String str, DivActionTyped divActionTyped, Div2View div2View, ExpressionResolver expressionResolver) {
        if (divActionTyped instanceof DivActionTyped.m) {
            handleAction(((DivActionTyped.m) divActionTyped).c(), div2View, expressionResolver);
            return true;
        }
        if (!(divActionTyped instanceof DivActionTyped.n)) {
            return false;
        }
        handleAction(((DivActionTyped.n) divActionTyped).c(), div2View, expressionResolver);
        return true;
    }

    private final void handleAction(DivActionScrollBy divActionScrollBy, Div2View div2View, ExpressionResolver expressionResolver) {
        String strEvaluate = divActionScrollBy.f46186b.evaluate(expressionResolver);
        int iLongValue = (int) divActionScrollBy.f46188d.evaluate(expressionResolver).longValue();
        int iLongValue2 = (int) divActionScrollBy.f46187c.evaluate(expressionResolver).longValue();
        String strB = DivActionScrollBy.Overflow.Converter.b(divActionScrollBy.f46189e.evaluate(expressionResolver));
        boolean zBooleanValue = divActionScrollBy.f46185a.evaluate(expressionResolver).booleanValue();
        DivViewWithItemsController divViewWithItemsControllerCreate$default = DivViewWithItemsController.Companion.create$default(DivViewWithItemsController.Companion, strEvaluate, div2View, expressionResolver, null, 8, null);
        if (divViewWithItemsControllerCreate$default == null) {
            return;
        }
        divViewWithItemsControllerCreate$default.changeCurrentItemByStep(strB, iLongValue2, zBooleanValue);
        divViewWithItemsControllerCreate$default.scrollByOffset(strB, iLongValue, zBooleanValue);
    }

    private final void handleAction(DivActionScrollTo divActionScrollTo, Div2View div2View, ExpressionResolver expressionResolver) {
        String strEvaluate = divActionScrollTo.f46230c.evaluate(expressionResolver);
        boolean zBooleanValue = divActionScrollTo.f46228a.evaluate(expressionResolver).booleanValue();
        DivViewWithItemsController divViewWithItemsControllerCreate$default = DivViewWithItemsController.Companion.create$default(DivViewWithItemsController.Companion, strEvaluate, div2View, expressionResolver, null, 8, null);
        if (divViewWithItemsControllerCreate$default == null) {
            return;
        }
        DivActionScrollDestination divActionScrollDestination = divActionScrollTo.f46229b;
        if (divActionScrollDestination instanceof DivActionScrollDestination.d) {
            divViewWithItemsControllerCreate$default.scrollTo((int) ((DivActionScrollDestination.d) divActionScrollDestination).c().f50485a.evaluate(expressionResolver).longValue(), zBooleanValue);
            return;
        }
        if (divActionScrollDestination instanceof DivActionScrollDestination.c) {
            divViewWithItemsControllerCreate$default.setCurrentItem((int) ((DivActionScrollDestination.c) divActionScrollDestination).c().f50141a.evaluate(expressionResolver).longValue(), zBooleanValue);
        } else if (divActionScrollDestination instanceof DivActionScrollDestination.b) {
            divViewWithItemsControllerCreate$default.scrollToEnd(zBooleanValue);
        } else if (divActionScrollDestination instanceof DivActionScrollDestination.e) {
            divViewWithItemsControllerCreate$default.scrollToStart(zBooleanValue);
        }
    }
}
