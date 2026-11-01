package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.types.Color;
import java.util.List;
import kotlin.Result;
import kotlin.c;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class ArrayOptColorWithColorFallback extends ArrayOptFunction {
    public ArrayOptColorWithColorFallback() {
        super(EvaluableType.COLOR);
    }

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        Object objM3458constructorimpl;
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object objEvaluateSafe = ArrayFunctionsKt.evaluateSafe(getName(), list);
        Object obj = null;
        Color color = objEvaluateSafe instanceof Color ? (Color) objEvaluateSafe : null;
        if (color != null) {
            return color;
        }
        String str = objEvaluateSafe instanceof String ? (String) objEvaluateSafe : null;
        if (str != null) {
            try {
                Result.a aVar = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(Color.m3368boximpl(Color.Companion.m3378parseC4zCDoM(str)));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
            }
            obj = (Color) (Result.m3463isFailureimpl(objM3458constructorimpl) ? null : objM3458constructorimpl);
        }
        return obj == null ? list.get(2) : obj;
    }
}
