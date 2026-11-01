package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Evaluator;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.internal.Token;
import java.util.List;
import nj.r;
import nj.s;

/* JADX INFO: compiled from: NumberArithmeticFunctions.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DoubleMul extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final DoubleMul INSTANCE = new DoubleMul();
    private static final String name = "mul";

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
        Double dValueOf = Double.valueOf(0.0d);
        int i10 = 0;
        for (Object objEvalFactor$div_evaluable : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                s.u();
            }
            double dDoubleValue = dValueOf.doubleValue();
            if (i10 != 0) {
                objEvalFactor$div_evaluable = Evaluator.Companion.evalFactor$div_evaluable(Token.Operator.Binary.Factor.Multiplication.INSTANCE, Double.valueOf(dDoubleValue), objEvalFactor$div_evaluable);
            }
            p.h(objEvalFactor$div_evaluable, "null cannot be cast to non-null type kotlin.Double");
            dValueOf = Double.valueOf(((Double) objEvalFactor$div_evaluable).doubleValue());
            i10 = i11;
        }
        return dValueOf;
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

    private DoubleMul() {
    }
}
