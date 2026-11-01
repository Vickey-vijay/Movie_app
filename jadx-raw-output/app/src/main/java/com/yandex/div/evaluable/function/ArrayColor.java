package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.types.Color;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.c;
import mj.r;
import org.json.JSONException;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class ArrayColor extends ArrayFunction {
    public ArrayColor() {
        super(EvaluableType.COLOR);
    }

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) throws JSONException {
        Object objM3458constructorimpl;
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object objEvaluateArray = ArrayFunctionsKt.evaluateArray(getName(), list, isMethod());
        if (objEvaluateArray instanceof Color) {
            return objEvaluateArray;
        }
        if (!(objEvaluateArray instanceof String)) {
            ArrayFunctionsKt.throwArrayWrongTypeException(getName(), list, getResultType(), objEvaluateArray, isMethod());
            return r.f64562a;
        }
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(Color.m3368boximpl(Color.Companion.m3378parseC4zCDoM((String) objEvaluateArray)));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
        }
        if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) == null) {
            return objM3458constructorimpl;
        }
        ArrayFunctionsKt.throwArrayException$default(getName(), list, "Unable to convert value to Color, expected format #AARRGGBB.", false, 8, null);
        throw new KotlinNothingValueException();
    }
}
