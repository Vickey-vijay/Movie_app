package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.types.Url;
import java.util.List;
import mj.r;
import org.json.JSONException;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class ArrayUrl extends ArrayFunction {
    public ArrayUrl() {
        super(EvaluableType.URL);
    }

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) throws JSONException {
        String strSafeConvertToUrl;
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object objEvaluateArray = ArrayFunctionsKt.evaluateArray(getName(), list, isMethod());
        String str = objEvaluateArray instanceof String ? (String) objEvaluateArray : null;
        if (str != null && (strSafeConvertToUrl = ArrayFunctionsKt.safeConvertToUrl(str)) != null) {
            return Url.m3379boximpl(strSafeConvertToUrl);
        }
        ArrayFunctionsKt.throwArrayWrongTypeException(getName(), list, getResultType(), objEvaluateArray, isMethod());
        return r.f64562a;
    }
}
