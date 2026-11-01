package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Color;
import java.util.List;
import nj.s;

/* JADX INFO: compiled from: StoredValueFunctions.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class GetStoredColorValueString extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure = false;
    private static final EvaluableType resultType;
    public static final GetStoredColorValueString INSTANCE = new GetStoredColorValueString();
    private static final String name = "getStoredColorValue";

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        declaredArgs = s.n(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(evaluableType, false, 2, null));
        resultType = EvaluableType.COLOR;
    }

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object obj = list.get(0);
        p.h(obj, "null cannot be cast to non-null type kotlin.String");
        Color.Companion companion = Color.Companion;
        Object obj2 = list.get(1);
        p.h(obj2, "null cannot be cast to non-null type kotlin.String");
        int iM3378parseC4zCDoM = companion.m3378parseC4zCDoM((String) obj2);
        Object obj3 = evaluationContext.getStoredValueProvider().get((String) obj);
        Color color = obj3 instanceof Color ? (Color) obj3 : null;
        return color == null ? Color.m3368boximpl(iM3378parseC4zCDoM) : color;
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

    private GetStoredColorValueString() {
    }
}
