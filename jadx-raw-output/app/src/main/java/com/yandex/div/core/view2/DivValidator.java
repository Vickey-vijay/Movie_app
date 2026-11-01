package com.yandex.div.core.view2;

import com.yandex.div.internal.core.DivVisitor;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;

/* JADX INFO: compiled from: DivValidator.kt */
/* JADX INFO: loaded from: classes10.dex */
public class DivValidator extends DivVisitor<Boolean> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.internal.core.DivVisitor
    public Boolean defaultVisit(Div div, ExpressionResolver expressionResolver) {
        return Boolean.TRUE;
    }

    public boolean validate(Div div, ExpressionResolver expressionResolver) {
        return visit(div, expressionResolver).booleanValue();
    }
}
