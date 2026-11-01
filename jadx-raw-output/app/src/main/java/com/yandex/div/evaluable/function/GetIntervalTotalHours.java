package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import nj.r;

/* JADX INFO: compiled from: IntervalFunctions.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class GetIntervalTotalHours extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final GetIntervalTotalHours INSTANCE = new GetIntervalTotalHours();
    private static final String name = "getIntervalTotalHours";

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        declaredArgs = r.e(new FunctionArgument(evaluableType, false, 2, null));
        resultType = evaluableType;
        isPure = true;
    }

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) throws EvaluableException {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object obj = list.get(0);
        p.h(obj, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) obj).longValue();
        if (jLongValue < 0) {
            throw new EvaluableException("Failed to evaluate [getIntervalTotalHours(-1)]. Expecting non-negative number of milliseconds.", null, 2, null);
        }
        long j10 = 60;
        return Long.valueOf(((jLongValue / ((long) 1000)) / j10) / j10);
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

    private GetIntervalTotalHours() {
    }
}
