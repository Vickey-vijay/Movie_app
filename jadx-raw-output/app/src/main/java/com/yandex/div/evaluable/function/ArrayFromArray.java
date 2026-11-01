package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import java.util.List;
import mj.r;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class ArrayFromArray extends ArrayFunction {
    public ArrayFromArray() {
        super(EvaluableType.ARRAY);
    }

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) throws JSONException {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object objEvaluateArray = ArrayFunctionsKt.evaluateArray(getName(), list, isMethod());
        JSONArray jSONArray = objEvaluateArray instanceof JSONArray ? (JSONArray) objEvaluateArray : null;
        if (jSONArray != null) {
            return jSONArray;
        }
        ArrayFunctionsKt.throwArrayWrongTypeException(getName(), list, getResultType(), objEvaluateArray, isMethod());
        return r.f64562a;
    }
}
