package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import nj.s;

/* JADX INFO: compiled from: VariableFunctions.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class GetIntegerValue extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure = false;
    private static final EvaluableType resultType;
    public static final GetIntegerValue INSTANCE = new GetIntegerValue();
    private static final String name = "getIntegerValue";

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        declaredArgs = s.n(new FunctionArgument(EvaluableType.STRING, false, 2, null), new FunctionArgument(evaluableType, false, 2, null));
        resultType = evaluableType;
    }

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object obj = list.get(0);
        p.h(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = list.get(1);
        p.h(obj2, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) obj2).longValue();
        Object obj3 = evaluationContext.getVariableProvider().get((String) obj);
        Long l10 = obj3 instanceof Long ? (Long) obj3 : null;
        return l10 == null ? Long.valueOf(jLongValue) : l10;
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

    private GetIntegerValue() {
    }
}
