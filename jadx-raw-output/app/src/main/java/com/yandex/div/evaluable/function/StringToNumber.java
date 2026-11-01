package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import kotlin.KotlinNothingValueException;
import nj.b0;
import nj.r;

/* JADX INFO: compiled from: ToNumber.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class StringToNumber extends Function {
    public static final StringToNumber INSTANCE = new StringToNumber();
    private static final String name = "toNumber";
    private static final List<FunctionArgument> declaredArgs = r.e(new FunctionArgument(EvaluableType.STRING, false, 2, null));
    private static final EvaluableType resultType = EvaluableType.NUMBER;
    private static final boolean isPure = true;

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object objF0 = b0.f0(list);
        p.h(objF0, "null cannot be cast to non-null type kotlin.String");
        try {
            double d10 = Double.parseDouble((String) objF0);
            boolean z10 = true;
            if (!(d10 == Double.POSITIVE_INFINITY)) {
                if (d10 != Double.NEGATIVE_INFINITY) {
                    z10 = false;
                }
                if (!z10) {
                    return Double.valueOf(d10);
                }
            }
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), list, "Unable to convert value to Number.", null, 8, null);
            throw new KotlinNothingValueException();
        } catch (NumberFormatException e10) {
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed(getName(), list, "Unable to convert value to Number.", e10);
            throw new KotlinNothingValueException();
        }
    }

    @Override // com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.Function
    public EvaluableType getResultType() {
        return resultType;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return isPure;
    }

    private StringToNumber() {
    }
}
