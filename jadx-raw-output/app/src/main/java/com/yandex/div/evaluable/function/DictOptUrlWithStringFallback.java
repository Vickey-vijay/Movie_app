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
/* JADX INFO: loaded from: classes3.dex */
public abstract class DictOptUrlWithStringFallback extends Function {
    private final List<FunctionArgument> declaredArgs;
    private final boolean isPure;
    private final EvaluableType resultType;

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object obj = list.get(0);
        p.h(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object objEvaluateSafe$default = DictFunctionsKt.evaluateSafe$default(list, str, false, 4, null);
        String strSafeConvertToUrl = ArrayFunctionsKt.safeConvertToUrl(objEvaluateSafe$default instanceof String ? (String) objEvaluateSafe$default : null);
        if (strSafeConvertToUrl != null || (strSafeConvertToUrl = ArrayFunctionsKt.safeConvertToUrl(str)) != null) {
            return Url.m3379boximpl(strSafeConvertToUrl);
        }
        DictFunctionsKt.throwDictException(getName(), list, "Unable to convert value to Url.");
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

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return this.isPure;
    }

    public DictOptUrlWithStringFallback() {
        EvaluableType evaluableType = EvaluableType.STRING;
        this.declaredArgs = s.n(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(EvaluableType.DICT, false, 2, null), new FunctionArgument(evaluableType, true));
        this.resultType = EvaluableType.URL;
    }
}
