package com.yandex.div.core.expression.variables;

import android.net.Uri;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.VariableDeclarationException;
import com.yandex.div.evaluable.types.Url;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivVariable;

/* JADX INFO: compiled from: VariableController.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class VariableControllerKt {
    public static final Object wrapVariableValue(Object obj) {
        return obj instanceof Uri ? Url.m3379boximpl(Url.m3380constructorimpl(obj.toString())) : obj;
    }

    public static final void declare(VariableController variableController, DivVariable divVariable, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        try {
            variableController.declare(DivVariablesParserKt.toVariable(divVariable, expressionResolver));
        } catch (VariableDeclarationException e10) {
            errorCollector.logError(e10);
        }
    }
}
