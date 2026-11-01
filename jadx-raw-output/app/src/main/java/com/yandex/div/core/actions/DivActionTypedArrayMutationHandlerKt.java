package com.yandex.div.core.actions;

import bk.l;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.internal.util.JsonUtilsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Collection;
import java.util.List;
import mj.r;
import nj.b0;
import org.json.JSONArray;

/* JADX INFO: compiled from: DivActionTypedArrayMutationHandler.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivActionTypedArrayMutationHandlerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateVariable(final Div2View div2View, String str, ExpressionResolver expressionResolver, final l<? super JSONArray, ? extends JSONArray> lVar) {
        VariableMutationHandler.Companion.setVariable(div2View, str, expressionResolver, new l<Variable, Variable>() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandlerKt.updateVariable.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // bk.l
            public final Variable invoke(Variable variable) {
                if (!(variable instanceof Variable.ArrayVariable)) {
                    DivActionTypedUtilsKt.logError(div2View.getView(), new IllegalArgumentException("Action requires array variable"));
                    return variable;
                }
                Object value = variable.getValue();
                JSONArray jSONArray = value instanceof JSONArray ? (JSONArray) value : null;
                if (jSONArray == null) {
                    DivActionTypedUtilsKt.logError(div2View.getView(), new IllegalArgumentException("Invalid variable value"));
                    return variable;
                }
                ((Variable.ArrayVariable) variable).set(lVar.invoke(jSONArray));
                return variable;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONArray mutate(JSONArray jSONArray, l<? super List<Object>, r> lVar) {
        List listR0 = b0.R0(JsonUtilsKt.asList(jSONArray));
        lVar.invoke(listR0);
        return new JSONArray((Collection) listR0);
    }
}
