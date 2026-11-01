package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import nj.s;

/* JADX INFO: compiled from: StoredValueFunctions.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class GetStoredNumberValue extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure = false;
    private static final EvaluableType resultType;
    public static final GetStoredNumberValue INSTANCE = new GetStoredNumberValue();
    private static final String name = "getStoredNumberValue";

    static {
        EvaluableType evaluableType = EvaluableType.NUMBER;
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
        String str = (String) obj;
        Object obj2 = list.get(1);
        p.h(obj2, "null cannot be cast to non-null type kotlin.Number");
        Number number = (Number) obj2;
        Number number2 = null;
        if (!(evaluationContext.getStoredValueProvider().get(str) instanceof Long)) {
            Object obj3 = evaluationContext.getStoredValueProvider().get(str);
            if (obj3 instanceof Number) {
                number2 = (Number) obj3;
            }
        }
        return number2 == null ? number : number2;
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

    private GetStoredNumberValue() {
    }
}
