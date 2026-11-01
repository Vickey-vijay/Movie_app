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
/* JADX INFO: loaded from: classes7.dex */
public final class GetStringValue extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure = false;
    private static final EvaluableType resultType;
    public static final GetStringValue INSTANCE = new GetStringValue();
    private static final String name = "getStringValue";

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        declaredArgs = s.n(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(evaluableType, false, 2, null));
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
        p.h(obj2, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj2;
        Object obj3 = evaluationContext.getVariableProvider().get((String) obj);
        String str2 = obj3 instanceof String ? (String) obj3 : null;
        return str2 == null ? str : str2;
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

    private GetStringValue() {
    }
}
