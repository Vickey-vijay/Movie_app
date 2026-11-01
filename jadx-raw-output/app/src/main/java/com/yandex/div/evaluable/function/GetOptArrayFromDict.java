package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import nj.s;
import org.json.JSONArray;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class GetOptArrayFromDict extends Function {
    private static final boolean isPure = false;
    public static final GetOptArrayFromDict INSTANCE = new GetOptArrayFromDict();
    private static final String name = "getOptArrayFromDict";
    private static final List<FunctionArgument> declaredArgs = s.n(new FunctionArgument(EvaluableType.DICT, false, 2, null), new FunctionArgument(EvaluableType.STRING, true));
    private static final EvaluableType resultType = EvaluableType.ARRAY;

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        JSONArray jSONArray = new JSONArray();
        Object objEvaluateSafe = DictFunctionsKt.evaluateSafe(list, jSONArray, true);
        JSONArray jSONArray2 = objEvaluateSafe instanceof JSONArray ? (JSONArray) objEvaluateSafe : null;
        return jSONArray2 == null ? jSONArray : jSONArray2;
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

    private GetOptArrayFromDict() {
    }
}
