package com.yandex.div.core.view2.divs;

import bk.l;
import com.yandex.div.core.expression.variables.TwoWayBooleanVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayVariableBinder;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivSwitchView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.Div;
import com.yandex.div2.DivSwitch;
import mj.r;

/* JADX INFO: compiled from: DivSwitchBinder.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivSwitchBinder extends DivViewBinder<Div.o, DivSwitch, DivSwitchView> {
    private final TwoWayBooleanVariableBinder variableBinder;

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyIsEnabled(DivSwitchView divSwitchView, DivSwitch divSwitch, ExpressionResolver expressionResolver) {
        divSwitchView.setEnabled(divSwitch.f49187o.evaluate(expressionResolver).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyOnColor(DivSwitchView divSwitchView, DivSwitch divSwitch, ExpressionResolver expressionResolver) {
        Expression<Integer> expression = divSwitch.f49191s;
        divSwitchView.setColorOn(expression != null ? expression.evaluate(expressionResolver) : null);
    }

    private final void bindIsEnabled(final DivSwitchView divSwitchView, final DivSwitch divSwitch, DivSwitch divSwitch2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divSwitch.f49187o, divSwitch2 != null ? divSwitch2.f49187o : null)) {
            return;
        }
        applyIsEnabled(divSwitchView, divSwitch, expressionResolver);
        if (ExpressionsKt.isConstant(divSwitch.f49187o)) {
            return;
        }
        divSwitchView.addSubscription(divSwitch.f49187o.observe(expressionResolver, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivSwitchBinder$bindIsEnabled$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                this.this$0.applyIsEnabled(divSwitchView, divSwitch, expressionResolver);
            }
        }));
    }

    private final void bindOnColor(final DivSwitchView divSwitchView, final DivSwitch divSwitch, DivSwitch divSwitch2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divSwitch.f49191s, divSwitch2 != null ? divSwitch2.f49191s : null)) {
            return;
        }
        applyOnColor(divSwitchView, divSwitch, expressionResolver);
        if (ExpressionsKt.isConstantOrNull(divSwitch.f49191s)) {
            return;
        }
        l<? super Integer, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivSwitchBinder$bindOnColor$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                this.this$0.applyOnColor(divSwitchView, divSwitch, expressionResolver);
            }
        };
        Expression<Integer> expression = divSwitch.f49191s;
        divSwitchView.addSubscription(expression != null ? expression.observe(expressionResolver, lVar) : null);
    }

    private final void observeVariable(final DivSwitchView divSwitchView, DivSwitch divSwitch, BindingContext bindingContext, DivStatePath divStatePath) {
        divSwitchView.addSubscription(this.variableBinder.bindVariable(bindingContext, divSwitch.f49188p, new TwoWayVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivSwitchBinder$observeVariable$callbacks$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(Boolean bool) {
                if (bool != null) {
                    divSwitchView.setChecked(bool.booleanValue());
                }
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(l<? super Boolean, r> lVar) {
                divSwitchView.setOnCheckedChangeListener(lVar);
            }
        }, divStatePath));
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(DivSwitchView divSwitchView, BindingContext bindingContext, DivSwitch divSwitch, DivSwitch divSwitch2, DivStatePath divStatePath) {
        bindIsEnabled(divSwitchView, divSwitch, divSwitch2, bindingContext.getExpressionResolver());
        bindOnColor(divSwitchView, divSwitch, divSwitch2, bindingContext.getExpressionResolver());
        observeVariable(divSwitchView, divSwitch, bindingContext, divStatePath);
    }

    public DivSwitchBinder(DivBaseBinder divBaseBinder, TwoWayBooleanVariableBinder twoWayBooleanVariableBinder) {
        super(divBaseBinder);
        this.variableBinder = twoWayBooleanVariableBinder;
    }
}
