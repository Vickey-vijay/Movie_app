package com.yandex.div.core.expression.variables;

import bk.l;
import com.yandex.div.data.Variable;
import mj.r;

/* JADX INFO: compiled from: MultiVariableSource.kt */
/* JADX INFO: loaded from: classes11.dex */
public class MultiVariableSource implements VariableSource {
    private final DivVariableController variableController;
    private final l<String, r> variableRequestObserver;

    @Override // com.yandex.div.core.expression.variables.VariableSource
    public Variable getMutableVariable(String str) {
        this.variableRequestObserver.invoke(str);
        return this.variableController.get(str);
    }

    @Override // com.yandex.div.core.expression.variables.VariableSource
    public void observeDeclaration(DeclarationObserver declarationObserver) {
        this.variableController.addDeclarationObserver$div_release(declarationObserver);
    }

    @Override // com.yandex.div.core.expression.variables.VariableSource
    public void observeVariables(l<? super Variable, r> lVar) {
        this.variableController.addVariableObserver$div_release(lVar);
    }

    @Override // com.yandex.div.core.expression.variables.VariableSource
    public void receiveVariablesUpdates(l<? super Variable, r> lVar) {
        this.variableController.receiveVariablesUpdates$div_release(lVar);
    }

    @Override // com.yandex.div.core.expression.variables.VariableSource
    public void removeDeclarationObserver(DeclarationObserver declarationObserver) {
        this.variableController.removeDeclarationObserver$div_release(declarationObserver);
    }

    @Override // com.yandex.div.core.expression.variables.VariableSource
    public void removeVariablesObserver(l<? super Variable, r> lVar) {
        this.variableController.removeVariablesObserver$div_release(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MultiVariableSource(DivVariableController divVariableController, l<? super String, r> lVar) {
        this.variableController = divVariableController;
        this.variableRequestObserver = lVar;
    }
}
