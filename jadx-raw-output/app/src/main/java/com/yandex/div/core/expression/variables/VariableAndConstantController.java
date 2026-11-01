package com.yandex.div.core.expression.variables;

import bk.l;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.Variable;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import mj.r;

/* JADX INFO: compiled from: VariableAndConstantController.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class VariableAndConstantController implements VariableController {
    private final ConstantsProvider constants;
    private final VariableController delegate;

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void cleanupSubscriptions() {
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void restoreSubscriptions() {
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void declare(Variable variable) {
        this.delegate.declare(variable);
    }

    @Override // com.yandex.div.evaluable.VariableProvider
    public Object get(String str) {
        Object objWrapVariableValue = VariableControllerKt.wrapVariableValue(this.constants.get(str));
        return objWrapVariableValue == null ? this.delegate.get(str) : objWrapVariableValue;
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public Variable getMutableVariable(String str) {
        return this.delegate.getMutableVariable(str);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void setOnAnyVariableChangeCallback(ExpressionResolver expressionResolver, l<? super Variable, r> lVar) {
        this.delegate.setOnAnyVariableChangeCallback(expressionResolver, lVar);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public Disposable subscribeToVariableChange(String str, ErrorCollector errorCollector, boolean z10, l<? super Variable, r> lVar) {
        return this.delegate.subscribeToVariableChange(str, errorCollector, z10, lVar);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public Disposable subscribeToVariablesChange(List<String> list, boolean z10, l<? super Variable, r> lVar) {
        return this.delegate.subscribeToVariablesChange(list, z10, lVar);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public Disposable subscribeToVariablesUndeclared(List<String> list, l<? super Variable, r> lVar) {
        return Disposable.NULL;
    }

    public VariableAndConstantController(VariableController variableController, ConstantsProvider constantsProvider) {
        this.delegate = variableController;
        this.constants = constantsProvider;
    }
}
