package com.yandex.div.core.expression;

import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.expression.triggers.TriggersController;

/* JADX INFO: compiled from: ExpressionsRuntime.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ExpressionsRuntime {
    private final ExpressionResolverImpl expressionResolver;
    private final TriggersController triggersController;
    private boolean unsubscribed = true;

    public final void cleanup$div_release(DivViewFacade divViewFacade) {
        if (this.unsubscribed) {
            return;
        }
        this.unsubscribed = true;
        TriggersController triggersController = this.triggersController;
        if (triggersController != null) {
            triggersController.clearBinding(divViewFacade);
        }
        this.expressionResolver.getVariableController().cleanupSubscriptions();
    }

    public final void clearBinding(DivViewFacade divViewFacade) {
        TriggersController triggersController = this.triggersController;
        if (triggersController != null) {
            triggersController.clearBinding(divViewFacade);
        }
    }

    public final ExpressionResolverImpl getExpressionResolver() {
        return this.expressionResolver;
    }

    public final TriggersController getTriggersController() {
        return this.triggersController;
    }

    public final void onAttachedToWindow(DivViewFacade divViewFacade) {
        TriggersController triggersController = this.triggersController;
        if (triggersController != null) {
            triggersController.onAttachedToWindow(divViewFacade);
        }
    }

    public final void onDetachedFromWindow(DivViewFacade divViewFacade) {
        TriggersController triggersController = this.triggersController;
        if (triggersController != null) {
            triggersController.onDetachedFromWindow(divViewFacade);
        }
    }

    public final void updateSubscriptions() {
        if (this.unsubscribed) {
            this.unsubscribed = false;
            this.expressionResolver.subscribeOnVariables$div_release();
        }
    }

    public ExpressionsRuntime(ExpressionResolverImpl expressionResolverImpl, TriggersController triggersController) {
        this.expressionResolver = expressionResolverImpl;
        this.triggersController = triggersController;
    }
}
