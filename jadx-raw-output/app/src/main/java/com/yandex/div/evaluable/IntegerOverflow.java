package com.yandex.div.evaluable;

import ck.i;
import ck.p;

/* JADX INFO: compiled from: EvaluableException.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class IntegerOverflow extends EvaluableException {
    private final String expression;

    public /* synthetic */ IntegerOverflow(String str, Exception exc, int i10, i iVar) {
        this(str, (i10 & 2) != 0 ? null : exc);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntegerOverflow(String str, Exception exc) {
        super("Failed to evaluate [" + str + "]. Integer overflow.", exc);
        p.j(str, "expression");
        this.expression = str;
    }

    public final String getExpression() {
        return this.expression;
    }
}
