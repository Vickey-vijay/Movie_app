package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Evaluator;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.internal.Token;
import java.util.Iterator;
import java.util.List;
import nj.r;

/* JADX INFO: compiled from: IntegerArithmeticFunctions.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class IntegerSum extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final IntegerSum INSTANCE = new IntegerSum();
    private static final String name = "sum";

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
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Object objEvalSum$div_evaluable = Evaluator.Companion.evalSum$div_evaluable(Token.Operator.Binary.Sum.Plus.INSTANCE, Long.valueOf(lValueOf.longValue()), it.next());
            p.h(objEvalSum$div_evaluable, "null cannot be cast to non-null type kotlin.Long");
            lValueOf = Long.valueOf(((Long) objEvalSum$div_evaluable).longValue());
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

    private IntegerSum() {
    }
}
