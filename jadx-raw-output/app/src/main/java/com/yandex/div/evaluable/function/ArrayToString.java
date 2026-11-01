package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import nj.b0;
import nj.r;
import org.json.JSONArray;

/* JADX INFO: compiled from: ToString.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ArrayToString extends Function {
    private static final boolean isPure = false;
    public static final ArrayToString INSTANCE = new ArrayToString();
    private static final String name = "toString";
    private static final List<FunctionArgument> declaredArgs = r.e(new FunctionArgument(EvaluableType.ARRAY, false, 2, null));
    private static final EvaluableType resultType = EvaluableType.STRING;

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object objF0 = b0.f0(list);
        p.h(objF0, "null cannot be cast to non-null type org.json.JSONArray");
        String string = ((JSONArray) objF0).toString();
        p.i(string, "args.first() as JSONArray).toString()");
        return string;
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

    private ArrayToString() {
    }
}
