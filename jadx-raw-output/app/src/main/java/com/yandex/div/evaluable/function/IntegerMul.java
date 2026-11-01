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

/* JADX INFO: compiled from: IntegerArithmeticFunctions.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class IntegerMul extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final IntegerMul INSTANCE = new IntegerMul();
    private static final String name = "mul";

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
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
        Long lValueOf = 0L;
        int i10 = 0;
        for (Object objEvalFactor$div_evaluable : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                s.u();
            }
            long jLongValue = lValueOf.longValue();
            if (i10 != 0) {
                objEvalFactor$div_evaluable = Evaluator.Companion.evalFactor$div_evaluable(Token.Operator.Binary.Factor.Multiplication.INSTANCE, Long.valueOf(jLongValue), objEvalFactor$div_evaluable);
            }
            p.h(objEvalFactor$div_evaluable, "null cannot be cast to non-null type kotlin.Long");
            lValueOf = Long.valueOf(((Long) objEvalFactor$div_evaluable).longValue());
            i10 = i11;
        }
        return lValueOf;
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

    private IntegerMul() {
    }
}
