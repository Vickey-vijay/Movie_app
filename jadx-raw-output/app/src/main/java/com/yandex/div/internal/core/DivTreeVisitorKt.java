package com.yandex.div.internal.core;

import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div2.Div;

/* JADX INFO: compiled from: DivTreeVisitor.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivTreeVisitorKt {
    public static final BindingContext getChildContext(BindingContext bindingContext, Div div, DivStatePath divStatePath) {
        return bindingContext.getFor(bindingContext.getDivView().getRuntimeStore$div_release().getOrCreateRuntime(divStatePath, div, bindingContext.getExpressionResolver()).getExpressionResolver());
    }
}
