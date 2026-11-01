package com.yandex.div.core.util.validator;

import bk.a;

/* JADX INFO: compiled from: ExpressionValidator.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ExpressionValidator extends BaseValidator {
    private final a<Boolean> calculateExpression;

    public ExpressionValidator(boolean z10, a<Boolean> aVar) {
        super(z10);
        this.calculateExpression = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    @Override // com.yandex.div.core.util.validator.BaseValidator
    public boolean validate(String str) {
        boolean z10;
        if (getAllowEmpty()) {
            if (str.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (!this.calculateExpression.invoke().booleanValue()) {
                    return false;
                }
            }
        } else if (!this.calculateExpression.invoke().booleanValue()) {
            return false;
        }
        return true;
    }
}
