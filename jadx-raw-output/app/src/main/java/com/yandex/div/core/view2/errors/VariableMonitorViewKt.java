package com.yandex.div.core.view2.errors;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yandex.div.data.Variable;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: VariableMonitorView.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class VariableMonitorViewKt {
    private static final String getType(Variable variable) {
        if (variable instanceof Variable.ArrayVariable) {
            return "array";
        }
        if (variable instanceof Variable.BooleanVariable) {
            return TypedValues.Custom.S_BOOLEAN;
        }
        if (variable instanceof Variable.ColorVariable) {
            return "color";
        }
        if (variable instanceof Variable.DictVariable) {
            return "dict";
        }
        if (variable instanceof Variable.DoubleVariable) {
            return "number";
        }
        if (variable instanceof Variable.IntegerVariable) {
            return TypedValues.Custom.S_INT;
        }
        if (variable instanceof Variable.StringVariable) {
            return TypedValues.Custom.S_STRING;
        }
        if (variable instanceof Variable.UrlVariable) {
            return "url";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VariableModel toModel(Variable variable, String str) {
        return new VariableModel(variable.getName(), str, getType(variable), variable.getValue().toString());
    }
}
