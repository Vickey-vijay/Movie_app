package com.yandex.div.core.actions;

import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.downloader.DivDownloadActionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivActionTyped;
import com.yandex.div2.DivDownloadCallbacks;
import oe.c9;

/* JADX INFO: compiled from: DivActionTypedHandlerProxy.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivActionTypedHandlerProxy {
    public static final DivActionTypedHandlerProxy INSTANCE = new DivActionTypedHandlerProxy();

    private DivActionTypedHandlerProxy() {
    }

    public static final boolean handleAction(DivAction divAction, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        return INSTANCE.handleAction(divAction.f46037h, divAction.f46039j, divViewFacade, expressionResolver, divAction.f46030a);
    }

    private final boolean handleAction(String str, DivActionTyped divActionTyped, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, DivDownloadCallbacks divDownloadCallbacks) {
        if (divActionTyped == null) {
            return false;
        }
        if (!(divViewFacade instanceof Div2View)) {
            Assert.fail("Div2View should be used!");
            return false;
        }
        if (divActionTyped instanceof DivActionTyped.j) {
            return DivDownloadActionHandler.INSTANCE.handleAction(((DivActionTyped.j) divActionTyped).c(), divDownloadCallbacks, (Div2View) divViewFacade, expressionResolver);
        }
        Div2View div2View = (Div2View) divViewFacade;
        return div2View.getDiv2Component$div_release().getActionTypedHandlerCombiner().handleAction(str, divActionTyped, div2View, expressionResolver);
    }

    public static final boolean handleVisibilityAction(c9 c9Var, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        return INSTANCE.handleAction(c9Var.e(), c9Var.d(), divViewFacade, expressionResolver, c9Var.a());
    }
}
