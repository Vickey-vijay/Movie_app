package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import nj.s;

/* JADX INFO: compiled from: StringFunctions.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class PadEndInteger extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final PadEndInteger INSTANCE = new PadEndInteger();
    private static final String name = "padEnd";

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        EvaluableType evaluableType2 = EvaluableType.STRING;
        declaredArgs = s.n(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(evaluableType2, false, 2, null));
        resultType = evaluableType2;
        isPure = true;
    }

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object obj = list.get(0);
        p.h(obj, "null cannot be cast to non-null type kotlin.Long");
        String strValueOf = String.valueOf(((Long) obj).longValue());
        Object obj2 = list.get(1);
        p.h(obj2, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) obj2).longValue();
        Object obj3 = list.get(2);
        p.h(obj3, "null cannot be cast to non-null type kotlin.String");
        return strValueOf + StringFunctionsKt.m3338buildRepeatableStringzbMA7A(evaluationContext, evaluable, (int) (jLongValue - ((long) strValueOf.length())), (String) obj3);
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

    private PadEndInteger() {
    }
}
