package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import kotlin.KotlinNothingValueException;
import nj.s;
import org.json.JSONObject;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class DictFromDict extends Function {
    private final List<FunctionArgument> declaredArgs;
    private final boolean isMethod;
    private final boolean isPure;
    private final EvaluableType resultType;

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object objEvaluate = DictFunctionsKt.evaluate(getName(), list, isMethod());
        JSONObject jSONObject = objEvaluate instanceof JSONObject ? (JSONObject) objEvaluate : null;
        if (jSONObject != null) {
            return jSONObject;
        }
        DictFunctionsKt.throwWrongTypeException(getName(), list, getResultType(), objEvaluate, isMethod());
        throw new KotlinNothingValueException();
    }

    @Override // com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    public EvaluableType getResultType() {
        return this.resultType;
    }

    public boolean isMethod() {
        return this.isMethod;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return this.isPure;
    }

    public DictFromDict() {
        EvaluableType evaluableType = EvaluableType.DICT;
        this.declaredArgs = s.n(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(EvaluableType.STRING, true));
        this.resultType = evaluableType;
    }
}
