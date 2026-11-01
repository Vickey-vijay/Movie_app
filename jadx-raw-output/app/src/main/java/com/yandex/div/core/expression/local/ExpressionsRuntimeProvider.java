package com.yandex.div.core.expression.local;

import ck.p;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.expression.FunctionProviderDecorator;
import com.yandex.div.core.expression.local.ExpressionsRuntimeProvider;
import com.yandex.div.core.expression.storedvalues.StoredValuesController;
import com.yandex.div.core.expression.triggers.TriggersController;
import com.yandex.div.core.expression.variables.DivVariableController;
import com.yandex.div.core.expression.variables.VariableControllerImpl;
import com.yandex.div.core.expression.variables.VariableControllerKt;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.FunctionMapperKt;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.StoredValue;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Evaluator;
import com.yandex.div.evaluable.FunctionProvider;
import com.yandex.div.evaluable.StoredValueProvider;
import com.yandex.div.evaluable.WarningSender;
import com.yandex.div.evaluable.function.GeneratedBuiltinFunctionProvider;
import com.yandex.div2.DivData;
import com.yandex.div2.DivFunction;
import com.yandex.div2.DivTrigger;
import com.yandex.div2.DivVariable;
import java.util.Iterator;
import java.util.List;
import oe.e2;

/* JADX INFO: compiled from: ExpressionsRuntimeProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
public class ExpressionsRuntimeProvider {
    private final DivActionBinder divActionBinder;
    private final DivVariableController divVariableController;
    private final Div2Logger logger;
    private final StoredValuesController storedValuesController;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object createRootRuntime$lambda$0(ExpressionsRuntimeProvider expressionsRuntimeProvider, ErrorCollector errorCollector, String str) {
        StoredValue storedValue = expressionsRuntimeProvider.storedValuesController.getStoredValue(str, errorCollector);
        if (storedValue != null) {
            return storedValue.getValue();
        }
        return null;
    }

    private TriggersController toTriggersController(List<DivTrigger> list, ExpressionResolverImpl expressionResolverImpl, ErrorCollector errorCollector) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        TriggersController triggersController = new TriggersController(expressionResolverImpl, errorCollector, this.logger, this.divActionBinder);
        triggersController.ensureTriggersSynced(list);
        return triggersController;
    }

    public ExpressionsRuntime createChildRuntime(DivStatePath divStatePath, e2 e2Var, ExpressionResolverImpl expressionResolverImpl, ErrorCollector errorCollector) {
        VariableControllerImpl variableControllerImpl = new VariableControllerImpl(expressionResolverImpl.getVariableController());
        List<DivFunction> listW = e2Var.w();
        FunctionProvider functionProvider = expressionResolverImpl.getEvaluator().getEvaluationContext().getFunctionProvider();
        p.h(functionProvider, "null cannot be cast to non-null type com.yandex.div.core.expression.FunctionProviderDecorator");
        FunctionProviderDecorator functionProviderDecoratorPlus = (FunctionProviderDecorator) functionProvider;
        if (!(listW == null || listW.isEmpty())) {
            functionProviderDecoratorPlus = functionProviderDecoratorPlus.plus(FunctionMapperKt.toLocalFunctions(listW));
        }
        ExpressionResolverImpl expressionResolverImpl2 = new ExpressionResolverImpl(expressionResolverImpl.getPath() + '/' + divStatePath.getLastDivId$div_release(), expressionResolverImpl.getRuntimeStore(), variableControllerImpl, new Evaluator(new EvaluationContext(variableControllerImpl, expressionResolverImpl.getEvaluator().getEvaluationContext().getStoredValueProvider(), functionProviderDecoratorPlus, expressionResolverImpl.getEvaluator().getEvaluationContext().getWarningSender())), errorCollector, null, 32, null);
        List<DivVariable> listC = e2Var.c();
        if (listC != null) {
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                VariableControllerKt.declare(variableControllerImpl, (DivVariable) it.next(), expressionResolverImpl2, errorCollector);
            }
        }
        return new ExpressionsRuntime(expressionResolverImpl2, toTriggersController(e2Var.u(), expressionResolverImpl2, errorCollector));
    }

    public ExpressionsRuntime createRootRuntime(DivData divData, final ErrorCollector errorCollector, RuntimeStore runtimeStore) {
        boolean z10 = true;
        VariableControllerImpl variableControllerImpl = new VariableControllerImpl(null, 1, null);
        variableControllerImpl.addSource(this.divVariableController.getVariableSource$div_release());
        StoredValueProvider storedValueProvider = new StoredValueProvider() { // from class: rd.a
            @Override // com.yandex.div.evaluable.StoredValueProvider
            public final Object get(String str) {
                return ExpressionsRuntimeProvider.createRootRuntime$lambda$0(this.f66753a, errorCollector, str);
            }
        };
        FunctionProviderDecorator functionProviderDecorator = new FunctionProviderDecorator(GeneratedBuiltinFunctionProvider.INSTANCE);
        List<DivFunction> list = divData.f46935a;
        if (list != null && !list.isEmpty()) {
            z10 = false;
        }
        if (!z10) {
            functionProviderDecorator = functionProviderDecorator.plus(FunctionMapperKt.toLocalFunctions(list));
        }
        ExpressionResolverImpl expressionResolverImpl = new ExpressionResolverImpl("", runtimeStore, variableControllerImpl, new Evaluator(new EvaluationContext(variableControllerImpl, storedValueProvider, functionProviderDecorator, new WarningSender() { // from class: com.yandex.div.core.expression.local.ExpressionsRuntimeProvider$createRootRuntime$warningSender$1
            @Override // com.yandex.div.evaluable.WarningSender
            /* JADX INFO: renamed from: send-BIH1yYw, reason: not valid java name */
            public final void mo3297sendBIH1yYw(Evaluable evaluable, String str) {
                errorCollector.logWarning(new Throwable("Warning occurred while evaluating '" + evaluable.getRawExpr() + "':", new Throwable(str)));
            }
        })), errorCollector, null, 32, null);
        List<DivVariable> list2 = divData.f46941g;
        if (list2 != null) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                VariableControllerKt.declare(variableControllerImpl, (DivVariable) it.next(), expressionResolverImpl, errorCollector);
            }
        }
        return new ExpressionsRuntime(expressionResolverImpl, toTriggersController(divData.f46940f, expressionResolverImpl, errorCollector));
    }

    public ExpressionsRuntimeProvider(DivVariableController divVariableController, DivActionBinder divActionBinder, Div2Logger div2Logger, StoredValuesController storedValuesController) {
        this.divVariableController = divVariableController;
        this.divActionBinder = divActionBinder;
        this.logger = div2Logger;
        this.storedValuesController = storedValuesController;
    }
}
