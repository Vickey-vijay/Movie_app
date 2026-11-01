package com.yandex.div.core.extension;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import oe.e2;

/* JADX INFO: compiled from: DivExtensionHandler.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface DivExtensionHandler {
    default void beforeBindView(Div2View div2View, ExpressionResolver expressionResolver, View view, e2 e2Var) {
    }

    void bindView(Div2View div2View, ExpressionResolver expressionResolver, View view, e2 e2Var);

    boolean matches(e2 e2Var);

    default void preprocess(e2 e2Var, ExpressionResolver expressionResolver) {
    }

    void unbindView(Div2View div2View, ExpressionResolver expressionResolver, View view, e2 e2Var);
}
