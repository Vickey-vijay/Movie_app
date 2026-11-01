package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import nj.s;

/* JADX INFO: compiled from: TrigonometricFunctions.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class Pi extends Function {
    public static final Pi INSTANCE = new Pi();
    private static final String name = "pi";
    private static final List<FunctionArgument> declaredArgs = s.k();
    private static final EvaluableType resultType = EvaluableType.NUMBER;
    private static final boolean isPure = true;

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public /* bridge */ /* synthetic */ Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List list) {
        return mo3298evaluateex6DHhM(evaluationContext, evaluable, (List<? extends Object>) list);
    }

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Double mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        return Double.valueOf(3.141592653589793d);
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

    private Pi() {
    }
}
