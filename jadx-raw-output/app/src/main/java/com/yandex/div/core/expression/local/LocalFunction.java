package com.yandex.div.core.expression.local;

import ck.p;
import com.yandex.div.core.expression.variables.ConstantsProvider;
import com.yandex.div.core.expression.variables.VariableAndConstantController;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Evaluator;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.VariableProvider;
import java.util.LinkedHashMap;
import java.util.List;
import nj.s;

/* JADX INFO: compiled from: LocalFunction.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LocalFunction extends Function {
    private final List<String> argNames;
    private final List<FunctionArgument> declaredArgs;
    private final Evaluable evaluable;
    private final boolean isPure;
    private final String name;
    private final EvaluableType resultType;

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM, reason: not valid java name */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i10 = 0;
        for (Object obj : this.argNames) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                s.u();
            }
            linkedHashMap.put((String) obj, list.get(i10));
            i10 = i11;
        }
        VariableProvider variableProvider = evaluationContext.getVariableProvider();
        p.h(variableProvider, "null cannot be cast to non-null type com.yandex.div.core.expression.variables.VariableController");
        return new Evaluator(new EvaluationContext(new VariableAndConstantController((VariableController) variableProvider, new ConstantsProvider(linkedHashMap)), evaluationContext.getStoredValueProvider(), evaluationContext.getFunctionProvider(), evaluationContext.getWarningSender())).eval(this.evaluable);
    }

    @Override // com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return this.name;
    }

    @Override // com.yandex.div.evaluable.Function
    public EvaluableType getResultType() {
        return this.resultType;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return this.isPure;
    }

    public LocalFunction(String str, List<FunctionArgument> list, EvaluableType evaluableType, List<String> list2, String str2) {
        this.name = str;
        this.declaredArgs = list;
        this.resultType = evaluableType;
        this.argNames = list2;
        this.evaluable = Evaluable.Companion.lazy(str2);
    }
}
