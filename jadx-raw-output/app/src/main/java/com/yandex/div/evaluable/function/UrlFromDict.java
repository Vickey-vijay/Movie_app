package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Url;
import java.util.List;
import kotlin.KotlinNothingValueException;
import nj.s;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class UrlFromDict extends Function {
    private final boolean isMethod;
    private final boolean isPure;
    private final List<FunctionArgument> declaredArgs = s.n(new FunctionArgument(EvaluableType.DICT, false, 2, null), new FunctionArgument(EvaluableType.STRING, true));
    private final EvaluableType resultType = EvaluableType.URL;

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        String strSafeConvertToUrl;
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object objEvaluate = DictFunctionsKt.evaluate(getName(), list, isMethod());
        String str = objEvaluate instanceof String ? (String) objEvaluate : null;
        if (str != null && (strSafeConvertToUrl = ArrayFunctionsKt.safeConvertToUrl(str)) != null) {
            return Url.m3379boximpl(strSafeConvertToUrl);
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
}
