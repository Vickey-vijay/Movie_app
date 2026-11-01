package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import nj.b0;
import nj.s;

/* JADX INFO: compiled from: NumberArithmeticFunctions.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DoubleCopySign extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final DoubleCopySign INSTANCE = new DoubleCopySign();
    private static final String name = "copySign";

    static {
        EvaluableType evaluableType = EvaluableType.NUMBER;
        declaredArgs = s.n(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(evaluableType, false, 2, null));
        resultType = evaluableType;
        isPure = true;
    }

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object objF0 = b0.f0(list);
        p.h(objF0, "null cannot be cast to non-null type kotlin.Double");
        double dDoubleValue = ((Double) objF0).doubleValue();
        Object objR0 = b0.r0(list);
        p.h(objR0, "null cannot be cast to non-null type kotlin.Double");
        return Double.valueOf(Math.copySign(dDoubleValue, ((Double) objR0).doubleValue()));
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

    private DoubleCopySign() {
    }
}
