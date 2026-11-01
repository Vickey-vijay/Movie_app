package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import nj.r;
import org.json.JSONObject;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GetDictLength extends Function {
    private static final boolean isPure = false;
    public static final GetDictLength INSTANCE = new GetDictLength();
    private static final String name = "len";
    private static final List<FunctionArgument> declaredArgs = r.e(new FunctionArgument(EvaluableType.DICT, false, 2, null));
    private static final EvaluableType resultType = EvaluableType.INTEGER;

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object obj = list.get(0);
        p.h(obj, "null cannot be cast to non-null type org.json.JSONObject");
        return Long.valueOf(((JSONObject) obj).length());
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

    private GetDictLength() {
    }
}
