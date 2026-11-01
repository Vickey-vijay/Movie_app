package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import nj.s;
import org.json.JSONArray;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class GetOptArrayFromArray extends ArrayOptFunction {
    public static final GetOptArrayFromArray INSTANCE = new GetOptArrayFromArray();
    private static final String name = "getOptArrayFromArray";
    private static final List<FunctionArgument> declaredArgs = s.n(new FunctionArgument(EvaluableType.ARRAY, false, 2, null), new FunctionArgument(EvaluableType.INTEGER, false, 2, null));

    private GetOptArrayFromArray() {
        super(EvaluableType.ARRAY);
    }

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object objEvaluateSafe = ArrayFunctionsKt.evaluateSafe(getName(), list);
        JSONArray jSONArray = objEvaluateSafe instanceof JSONArray ? (JSONArray) objEvaluateSafe : null;
        return jSONArray == null ? new JSONArray() : jSONArray;
    }

    @Override // com.yandex.div.evaluable.function.ArrayOptFunction, com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
