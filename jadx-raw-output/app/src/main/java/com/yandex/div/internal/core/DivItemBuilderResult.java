package com.yandex.div.internal.core;

import ck.p;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;

/* JADX INFO: compiled from: DivItemBuilderResult.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivItemBuilderResult {
    private final Div div;
    private final ExpressionResolver expressionResolver;

    public final Div component1() {
        return this.div;
    }

    public final ExpressionResolver component2() {
        return this.expressionResolver;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivItemBuilderResult)) {
            return false;
        }
        DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
        return p.e(this.div, divItemBuilderResult.div) && p.e(this.expressionResolver, divItemBuilderResult.expressionResolver);
    }

    public int hashCode() {
        return (this.div.hashCode() * 31) + this.expressionResolver.hashCode();
    }

    public String toString() {
        return "DivItemBuilderResult(div=" + this.div + ", expressionResolver=" + this.expressionResolver + ')';
    }

    public final Div getDiv() {
        return this.div;
    }

    public final ExpressionResolver getExpressionResolver() {
        return this.expressionResolver;
    }

    public DivItemBuilderResult(Div div, ExpressionResolver expressionResolver) {
        this.div = div;
        this.expressionResolver = expressionResolver;
    }
}
