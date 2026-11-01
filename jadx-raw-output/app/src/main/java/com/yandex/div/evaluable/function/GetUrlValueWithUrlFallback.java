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

/* JADX INFO: compiled from: VariableFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GetUrlValueWithUrlFallback extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure = false;
    private static final EvaluableType resultType;
    public static final GetUrlValueWithUrlFallback INSTANCE = new GetUrlValueWithUrlFallback();
    private static final String name = "getUrlValue";

    static {
        EvaluableType evaluableType = EvaluableType.URL;
        declaredArgs = s.n(new FunctionArgument(EvaluableType.STRING, false, 2, null), new FunctionArgument(evaluableType, false, 2, null));
        resultType = evaluableType;
    }

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object obj = list.get(0);
        p.h(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = evaluationContext.getVariableProvider().get((String) obj);
        String strM3385unboximpl = obj2 instanceof Url ? ((Url) obj2).m3385unboximpl() : null;
        if (strM3385unboximpl != null) {
            return Url.m3379boximpl(strM3385unboximpl);
        }
        Object obj3 = list.get(1);
        p.h(obj3, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Url");
        return (Url) obj3;
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

    private GetUrlValueWithUrlFallback() {
    }
}
