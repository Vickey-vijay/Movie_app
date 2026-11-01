package com.yandex.div.core.view2;

import ck.p;
import com.yandex.div.json.expressions.ExpressionResolver;

/* JADX INFO: compiled from: BindingContext.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BindingContext {
    private final Div2View divView;
    private final ExpressionResolver expressionResolver;

    public final Div2View getDivView() {
        return this.divView;
    }

    public final ExpressionResolver getExpressionResolver() {
        return this.expressionResolver;
    }

    public final BindingContext getFor(ExpressionResolver expressionResolver) {
        return p.e(this.expressionResolver, expressionResolver) ? this : new BindingContext(this.divView, expressionResolver);
    }

    public BindingContext(Div2View div2View, ExpressionResolver expressionResolver) {
        this.divView = div2View;
        this.expressionResolver = expressionResolver;
    }
}
