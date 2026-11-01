package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.types.Url;
import java.util.List;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class ArrayOptUrlWithUrlFallback extends ArrayOptFunction {
    public ArrayOptUrlWithUrlFallback() {
        super(EvaluableType.URL);
    }

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object objEvaluateSafe = ArrayFunctionsKt.evaluateSafe(getName(), list);
        String strSafeConvertToUrl = ArrayFunctionsKt.safeConvertToUrl(objEvaluateSafe instanceof String ? (String) objEvaluateSafe : null);
        return strSafeConvertToUrl != null ? Url.m3379boximpl(strSafeConvertToUrl) : list.get(2);
    }
}
