package com.yandex.div.core.expression.variables;

import bk.l;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.VariableProvider;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import mj.r;
import nj.s;

/* JADX INFO: compiled from: VariableController.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface VariableController extends VariableProvider {
    void cleanupSubscriptions();

    void declare(Variable variable);

    Variable getMutableVariable(String str);

    void restoreSubscriptions();

    void setOnAnyVariableChangeCallback(ExpressionResolver expressionResolver, l<? super Variable, r> lVar);

    Disposable subscribeToVariableChange(String str, ErrorCollector errorCollector, boolean z10, l<? super Variable, r> lVar);

    Disposable subscribeToVariablesChange(List<String> list, boolean z10, l<? super Variable, r> lVar);

    Disposable subscribeToVariablesUndeclared(List<String> list, l<? super Variable, r> lVar);

    static /* synthetic */ Disposable subscribeToVariablesChange$default(VariableController variableController, List list, boolean z10, l lVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribeToVariablesChange");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return variableController.subscribeToVariablesChange(list, z10, lVar);
    }

    default List<Variable> captureAll() {
        return s.k();
    }
}
