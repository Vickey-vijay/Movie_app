package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import java.util.List;
import mj.r;
import org.json.JSONException;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class ArrayNumber extends ArrayFunction {
    public ArrayNumber() {
        super(EvaluableType.NUMBER);
    }

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) throws JSONException {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object objEvaluateArray = ArrayFunctionsKt.evaluateArray(getName(), list, isMethod());
        Number number = objEvaluateArray instanceof Number ? (Number) objEvaluateArray : null;
        if (number != null) {
            return Double.valueOf(number.doubleValue());
        }
        ArrayFunctionsKt.throwArrayWrongTypeException(getName(), list, getResultType(), objEvaluateArray, isMethod());
        return r.f64562a;
    }
}
