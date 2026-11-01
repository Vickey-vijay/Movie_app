package com.yandex.div.core.view2;

import android.view.View;
import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;

/* JADX INFO: compiled from: Div2Builder.kt */
/* JADX INFO: loaded from: classes2.dex */
public class Div2Builder {
    private final DivRuntimeVisitor runtimeVisitor;
    private final DivBinder viewBinder;
    private final DivViewCreator viewCreator;

    public Div2Builder(DivViewCreator divViewCreator, DivBinder divBinder, DivRuntimeVisitor divRuntimeVisitor) {
        this.viewCreator = divViewCreator;
        this.viewBinder = divBinder;
        this.runtimeVisitor = divRuntimeVisitor;
    }

    public View buildView(Div div, BindingContext bindingContext, DivStatePath divStatePath) {
        View viewCreateView = createView(div, bindingContext, divStatePath);
        this.viewBinder.bind(bindingContext, viewCreateView, div, divStatePath);
        return viewCreateView;
    }

    public View createView(Div div, BindingContext bindingContext, DivStatePath divStatePath) {
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        this.runtimeVisitor.createAndAttachRuntimes(div, divStatePath, bindingContext.getDivView());
        View viewCreate = this.viewCreator.create(div, expressionResolver);
        viewCreate.setLayoutParams(new DivLayoutParams(-1, -2));
        return viewCreate;
    }
}
