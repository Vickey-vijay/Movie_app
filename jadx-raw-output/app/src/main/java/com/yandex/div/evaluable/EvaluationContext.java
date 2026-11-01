package com.yandex.div.evaluable;

import ck.p;

/* JADX INFO: compiled from: EvaluationContext.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class EvaluationContext {
    private final FunctionProvider functionProvider;
    private final StoredValueProvider storedValueProvider;
    private final VariableProvider variableProvider;
    private final WarningSender warningSender;

    public EvaluationContext(VariableProvider variableProvider, StoredValueProvider storedValueProvider, FunctionProvider functionProvider, WarningSender warningSender) {
        p.j(variableProvider, "variableProvider");
        p.j(storedValueProvider, "storedValueProvider");
        p.j(functionProvider, "functionProvider");
        p.j(warningSender, "warningSender");
        this.variableProvider = variableProvider;
        this.storedValueProvider = storedValueProvider;
        this.functionProvider = functionProvider;
        this.warningSender = warningSender;
    }

    public final FunctionProvider getFunctionProvider() {
        return this.functionProvider;
    }

    public final StoredValueProvider getStoredValueProvider() {
        return this.storedValueProvider;
    }

    public final VariableProvider getVariableProvider() {
        return this.variableProvider;
    }

    public final WarningSender getWarningSender() {
        return this.warningSender;
    }
}
