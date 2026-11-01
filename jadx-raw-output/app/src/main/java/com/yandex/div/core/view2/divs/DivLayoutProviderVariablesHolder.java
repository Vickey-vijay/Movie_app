package com.yandex.div.core.view2.divs;

import bk.l;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.internal.core.DivTreeVisitor;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivData;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivSize;
import java.util.ArrayList;
import java.util.List;
import mj.r;
import oe.e2;

/* JADX INFO: compiled from: DivLayoutProviderVariablesHolder.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivLayoutProviderVariablesHolder extends DivTreeVisitor<r> implements ExpressionSubscriber {
    private final List<String> changedVariables;
    private final List<Disposable> subscriptions;

    /* JADX WARN: Multi-variable type inference failed */
    public DivLayoutProviderVariablesHolder() {
        super(null, 1, 0 == true ? 1 : 0);
        this.changedVariables = new ArrayList();
        this.subscriptions = new ArrayList();
    }

    @Override // com.yandex.div.internal.core.DivTreeVisitor
    public /* bridge */ /* synthetic */ r defaultVisit(Div div, BindingContext bindingContext, DivStatePath divStatePath) {
        defaultVisit2(div, bindingContext, divStatePath);
        return r.f64562a;
    }

    public final void clear() {
        this.changedVariables.clear();
    }

    public final boolean contains(String str) {
        return this.changedVariables.contains(str);
    }

    /* JADX INFO: renamed from: defaultVisit, reason: avoid collision after fix types in other method */
    public void defaultVisit2(Div div, BindingContext bindingContext, DivStatePath divStatePath) {
        observeSize(div.b(), bindingContext.getExpressionResolver());
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public List<Disposable> getSubscriptions() {
        return this.subscriptions;
    }

    public final void observeDivData(DivData divData, BindingContext bindingContext) {
        for (DivData.State state : divData.f46937c) {
            visit(state.f46946a, bindingContext, DivStatePath.Companion.fromState$div_release(state));
        }
    }

    private final void observe(DivSize divSize, final ExpressionResolver expressionResolver) {
        DivFixedSize divFixedSize;
        Object objB = divSize.b();
        final Expression.MutableExpression mutableExpression = null;
        if (objB instanceof DivFixedSize) {
            divFixedSize = (DivFixedSize) objB;
        } else {
            divFixedSize = null;
        }
        if (divFixedSize == null) {
            return;
        }
        Expression<Long> expression = divFixedSize.f47188b;
        if (expression instanceof Expression.MutableExpression) {
            mutableExpression = (Expression.MutableExpression) expression;
        }
        if (mutableExpression == null) {
            return;
        }
        addSubscription(mutableExpression.observe(expressionResolver, new l<Long, r>() { // from class: com.yandex.div.core.view2.divs.DivLayoutProviderVariablesHolder.observe.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Long l10) {
                invoke(l10.longValue());
                return r.f64562a;
            }

            public final void invoke(long j10) {
                DivLayoutProviderVariablesHolder.this.changedVariables.addAll(mutableExpression.getVariablesName(expressionResolver));
            }
        }));
    }

    private final void observeSize(e2 e2Var, ExpressionResolver expressionResolver) {
        observe(e2Var.getWidth(), expressionResolver);
        observe(e2Var.getHeight(), expressionResolver);
    }
}
