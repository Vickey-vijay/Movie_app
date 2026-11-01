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

/* JADX INFO: compiled from: NumberArithmeticFunctions.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DoubleMax extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final DoubleMax INSTANCE = new DoubleMax();
    private static final String name = "max";

    static {
        EvaluableType evaluableType = EvaluableType.NUMBER;
        declaredArgs = r.e(new FunctionArgument(evaluableType, true));
        resultType = evaluableType;
        isPure = true;
    }

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        if (list.isEmpty()) {
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), list, "Function requires non empty argument list.", null, 8, null);
            throw new KotlinNothingValueException();
        }
        Object objF0 = b0.f0(list);
        for (Object obj : list) {
            p.h(objF0, "null cannot be cast to non-null type kotlin.Double");
            double dDoubleValue = ((Double) objF0).doubleValue();
            p.h(obj, "null cannot be cast to non-null type kotlin.Double");
            objF0 = Double.valueOf(Math.max(dDoubleValue, ((Double) obj).doubleValue()));
        }
        return objF0;
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

    private DoubleMax() {
    }
}
