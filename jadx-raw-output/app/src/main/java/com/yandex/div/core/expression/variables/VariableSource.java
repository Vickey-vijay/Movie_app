package com.yandex.div.core.expression.variables;

import bk.l;
import com.yandex.div.data.Variable;
import mj.r;

/* JADX INFO: compiled from: VariableSource.kt */
/* JADX INFO: loaded from: classes7.dex */
public interface VariableSource {
    Variable getMutableVariable(String str);

    void observeDeclaration(DeclarationObserver declarationObserver);

    void observeVariables(l<? super Variable, r> lVar);

    void receiveVariablesUpdates(l<? super Variable, r> lVar);

    void removeDeclarationObserver(DeclarationObserver declarationObserver);

    void removeVariablesObserver(l<? super Variable, r> lVar);
}
