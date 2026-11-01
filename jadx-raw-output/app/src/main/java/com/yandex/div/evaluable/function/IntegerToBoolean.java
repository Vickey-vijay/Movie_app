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

/* JADX INFO: compiled from: ToBoolean.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class IntegerToBoolean extends Function {
    public static final IntegerToBoolean INSTANCE = new IntegerToBoolean();
    private static final String name = "toBoolean";
    private static final List<FunctionArgument> declaredArgs = r.e(new FunctionArgument(EvaluableType.INTEGER, false, 2, null));
    private static final EvaluableType resultType = EvaluableType.BOOLEAN;
    private static final boolean isPure = true;

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        boolean z10;
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object objF0 = b0.f0(list);
        p.h(objF0, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) objF0).longValue();
        if (jLongValue == 0) {
            z10 = false;
        } else {
            if (jLongValue != 1) {
                EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), list, "Unable to convert value to Boolean.", null, 8, null);
                throw new KotlinNothingValueException();
            }
            z10 = true;
        }
        return Boolean.valueOf(z10);
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

    private IntegerToBoolean() {
    }
}
