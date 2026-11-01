package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import java.util.Locale;
import nj.r;

/* JADX INFO: compiled from: StringFunctions.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ToUpperCase extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final ToUpperCase INSTANCE = new ToUpperCase();
    private static final String name = "toUpperCase";

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        declaredArgs = r.e(new FunctionArgument(evaluableType, false, 2, null));
        resultType = evaluableType;
        isPure = true;
    }

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object obj = list.get(0);
        p.h(obj, "null cannot be cast to non-null type kotlin.String");
        String upperCase = ((String) obj).toUpperCase(Locale.ROOT);
        p.i(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
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

    private ToUpperCase() {
    }
}
