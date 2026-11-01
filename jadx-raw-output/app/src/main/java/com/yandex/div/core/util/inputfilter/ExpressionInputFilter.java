package com.yandex.div.core.util.inputfilter;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;

/* JADX INFO: compiled from: ExpressionInputFilter.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ExpressionInputFilter implements BaseInputFilter {
    private final Expression<Boolean> condition;
    private final ExpressionResolver resolver;

    @Override // com.yandex.div.core.util.inputfilter.BaseInputFilter
    public boolean checkValue(String str) {
        return this.condition.evaluate(this.resolver).booleanValue();
    }

    public ExpressionInputFilter(Expression<Boolean> expression, ExpressionResolver expressionResolver) {
        this.condition = expression;
        this.resolver = expressionResolver;
    }
}
