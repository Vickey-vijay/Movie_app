package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import ek.b;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import kotlin.KotlinNothingValueException;
import mj.r;
import org.json.JSONException;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class ArrayInteger extends ArrayFunction {
    public ArrayInteger() {
        super(EvaluableType.INTEGER);
    }

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) throws JSONException {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object objEvaluateArray = ArrayFunctionsKt.evaluateArray(getName(), list, isMethod());
        if (objEvaluateArray instanceof Integer) {
            return Long.valueOf(((Number) objEvaluateArray).intValue());
        }
        if (objEvaluateArray instanceof Long) {
            return objEvaluateArray;
        }
        if (objEvaluateArray instanceof BigInteger) {
            ArrayFunctionsKt.throwArrayException$default(getName(), list, "Integer overflow.", false, 8, null);
            throw new KotlinNothingValueException();
        }
        if (objEvaluateArray instanceof BigDecimal) {
            ArrayFunctionsKt.throwArrayException$default(getName(), list, "Cannot convert value to integer.", false, 8, null);
            throw new KotlinNothingValueException();
        }
        if (!(objEvaluateArray instanceof Double)) {
            ArrayFunctionsKt.throwArrayWrongTypeException(getName(), list, getResultType(), objEvaluateArray, isMethod());
            return r.f64562a;
        }
        Number number = (Number) objEvaluateArray;
        if (number.doubleValue() < -9.223372036854776E18d || number.doubleValue() > 9.223372036854776E18d) {
            ArrayFunctionsKt.throwArrayException$default(getName(), list, "Integer overflow.", false, 8, null);
            throw new KotlinNothingValueException();
        }
        long jD = b.d(number.doubleValue());
        if (number.doubleValue() - ((double) jD) == 0.0d) {
            return Long.valueOf(jD);
        }
        ArrayFunctionsKt.throwArrayException$default(getName(), list, "Cannot convert value to integer.", false, 8, null);
        throw new KotlinNothingValueException();
    }
}
