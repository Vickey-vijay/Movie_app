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
import nj.r;

/* JADX INFO: compiled from: StoredValueFunctions.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class GetStoredComplexValue<T> extends Function {
    private final List<FunctionArgument> declaredArgs = r.e(new FunctionArgument(EvaluableType.STRING, false, 2, null));
    private final boolean isPure;

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object obj = list.get(0);
        p.h(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = evaluationContext.getStoredValueProvider().get((String) obj);
        if (obj2 != null) {
            return obj2;
        }
        EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), list, "Missing value.", null, 8, null);
        throw new KotlinNothingValueException();
    }

    @Override // com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return this.isPure;
    }
}
