package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import nj.s;
import org.json.JSONObject;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class GetOptDictFromArray extends ArrayFunction {
    public static final GetOptDictFromArray INSTANCE = new GetOptDictFromArray();
    private static final String name = "getOptDictFromArray";
    private static final List<FunctionArgument> declaredArgs = s.n(new FunctionArgument(EvaluableType.ARRAY, false, 2, null), new FunctionArgument(EvaluableType.INTEGER, false, 2, null));

    private GetOptDictFromArray() {
        super(EvaluableType.DICT);
    }

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object objEvaluateArray$default = ArrayFunctionsKt.evaluateArray$default(getName(), list, false, 4, null);
        JSONObject jSONObject = objEvaluateArray$default instanceof JSONObject ? (JSONObject) objEvaluateArray$default : null;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.yandex.div.evaluable.function.ArrayFunction, com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
