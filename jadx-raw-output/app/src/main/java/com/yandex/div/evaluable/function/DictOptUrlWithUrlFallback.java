package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Url;
import java.util.List;
import nj.s;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class DictOptUrlWithUrlFallback extends Function {
    private final List<FunctionArgument> declaredArgs;
    private final boolean isPure;
    private final EvaluableType resultType;

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        String strSafeConvertToUrl;
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object obj = list.get(0);
        p.h(obj, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Url");
        String strM3385unboximpl = ((Url) obj).m3385unboximpl();
        Object objEvaluateSafe$default = DictFunctionsKt.evaluateSafe$default(list, Url.m3379boximpl(strM3385unboximpl), false, 4, null);
        String str = objEvaluateSafe$default instanceof String ? (String) objEvaluateSafe$default : null;
        return (str == null || (strSafeConvertToUrl = ArrayFunctionsKt.safeConvertToUrl(str)) == null) ? Url.m3379boximpl(strM3385unboximpl) : Url.m3379boximpl(strSafeConvertToUrl);
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

    public DictOptUrlWithUrlFallback() {
        EvaluableType evaluableType = EvaluableType.URL;
        this.declaredArgs = s.n(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(EvaluableType.DICT, false, 2, null), new FunctionArgument(EvaluableType.STRING, true));
        this.resultType = evaluableType;
    }
}
