package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Url;
import java.util.List;
import nj.b0;
import nj.r;

/* JADX INFO: compiled from: ToString.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class UrlToString extends Function {
    public static final UrlToString INSTANCE = new UrlToString();
    private static final String name = "toString";
    private static final List<FunctionArgument> declaredArgs = r.e(new FunctionArgument(EvaluableType.URL, false, 2, null));
    private static final EvaluableType resultType = EvaluableType.STRING;
    private static final boolean isPure = true;

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object objF0 = b0.f0(list);
        p.h(objF0, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Url");
        return Url.m3384toStringimpl(((Url) objF0).m3385unboximpl());
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

    private UrlToString() {
    }
}
