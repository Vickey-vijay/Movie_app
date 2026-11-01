package com.yandex.div.evaluable;

import ck.i;
import ck.p;

/* JADX INFO: compiled from: EvaluableException.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class MissingVariableException extends EvaluableException {
    private final String variableName;

    public /* synthetic */ MissingVariableException(String str, Exception exc, int i10, i iVar) {
        this(str, (i10 & 2) != 0 ? null : exc);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingVariableException(String str, Exception exc) {
        super("Variable '" + str + "' is missing.", exc);
        p.j(str, "variableName");
        this.variableName = str;
    }

    public final String getVariableName() {
        return this.variableName;
    }
}
